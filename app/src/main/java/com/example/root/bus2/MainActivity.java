package com.example.root.bus2;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startDestination;
    Button finalDestination;
    Button changeTime;
    Button openMap;
    TextView timeTable;
    TextView transitResult;
    TextView finalStopName;
    TextView startDestinationLabel;
    String stopName;

    int stopId;
    String finalDestName;
    int finaldestId;
    String[][] timetableList;
    String route;
    int DIALOG_TIME = 1;
    int myHour = 12;
    int myMinute = 00;
    int anotherTime=2400;
    ArrayList<String> geopoints = new ArrayList<String>();

    private static final String TAG="myLogs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startDestinationLabel=(TextView)findViewById(R.id.startDestinationLabel);
        timeTable=(TextView)findViewById(R.id.timeTable);
        transitResult=(TextView)findViewById(R.id.transitResult);
        finalStopName=(TextView)findViewById(R.id.finalStopName);

        startDestination=(Button)findViewById(R.id.startDestination);
        startDestination.setOnClickListener(this);
        finalDestination=(Button)findViewById(R.id.finalDestination);
        finalDestination.setOnClickListener(this);
        changeTime=(Button)findViewById(R.id.changeTime);
        changeTime.setOnClickListener(this);
        openMap=(Button)findViewById(R.id.openMap);
        openMap.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startDestination:
                Intent intent1=new Intent(this, ListStopActivity.class);
                startActivityForResult (intent1,1);
                break;
            case R.id.finalDestination:
                Intent intent2=new Intent(this, ListStopActivity.class);
                startActivityForResult (intent2,2);
                break;
            case R.id.changeTime:
                showDialog(DIALOG_TIME);
                setResult(stopId, anotherTime);
                break;
            case R.id.openMap:
                Intent intent3=new Intent(this, MapsActivity.class);
                intent3.putExtra("geopoints", geopoints);
                startActivity(intent3);
                break;



            default:
                break;
        }
    }



    private void addGeoPoint(int id){

        StopData stopdata=new StopData();
        String label=stopdata.getStopNameById(id);
        double []coords=stopdata.getGeoCoord(id);
        String pointX= Double.toString(coords[0]);
        String pointY= Double.toString(coords[1]);
        geopoints.add(label);
        geopoints.add(pointX);
        geopoints.add(pointY);



    }

    protected  void setResult(int stopId, int anotherTime){
        DataArrays dataarrays=new DataArrays();
 if(geopoints.size()>0){ geopoints.clear();}
        addGeoPoint(stopId);

        timetableList=dataarrays.getTimetableList(stopId, anotherTime);



        String resultToText="";
        timeTable.setText(resultToText);

        for (String []k:timetableList) {
            if (k!=null) {
                for(String l:k) {

                    if (l != null) {
                        resultToText+=l;
                    }
                }
            }
            resultToText+="\n";
        }

        timeTable.append(resultToText);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data==null){
            return;
        }



        if (requestCode==1) {

            stopName=data.getStringExtra("stopName");
            stopId=data.getIntExtra("stopId",0);
            startDestinationLabel.setText(stopName);
            setResult(stopId,anotherTime);
        }

        if(requestCode==2){
            DataArrays dataarrays=new DataArrays();
            StopData stopdata=new StopData();

            finalDestName=data.getStringExtra("stopName");
            finaldestId=data.getIntExtra("stopId",0);

            addGeoPoint(finaldestId);


            String [][] transitWay;
            Stop startPoint=stopdata.getStopById(stopId);
            Stop finalPoint=stopdata.getStopById(finaldestId);

            finalStopName.setText(finalDestName);
            if(stopId!=0&finaldestId!=0){
                transitWay=dataarrays.getTransitWay(startPoint,finalPoint);
                String resultTransitText="";

                if (transitWay!=null) {
                    resultTransitText=transitWay[0][0]+"\n";

                    if (transitWay[1]!=null) {

                        for(int l=0; l<transitWay[1].length; l++) {

                            for (String id: transitWay[2]){
                                addGeoPoint(Integer.parseInt(id));
                            }


                            if (transitWay[1][l]!=null) {
                                resultTransitText += transitWay[1][l] + "\n";

                                Log.d(TAG, "transitWay[1][l]:" + transitWay[1][l]);
                            }
                        }
                    }
                }


                transitResult.setText(resultTransitText);
            }
        }


    }
    String transitToString(int a) {
        String str = Integer.toString(a);
        String str2 = "";
        if(str.length() == 4) {
            str2 = str.substring(0, 2) + ":" + str.substring(2, 4);
        }

        if(str.length() == 3) {
            str2 = str.substring(0, 1) + ":" + str.substring(1, 3);
        }

        if(str.length() == 2) {
            str2 = "00:" + str.substring(0, 2);
        }

        if(str.length() == 1) {
            str2 = "00:0" + str;
        }

        return str2;
    }
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_TIME) {
            TimePickerDialog tpd = new TimePickerDialog(this, myCallBack, myHour, myMinute, true);
            return tpd;


        }


        return super.onCreateDialog(id);
    }
    TimePickerDialog.OnTimeSetListener myCallBack = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myHour = hourOfDay;
            myMinute = minute;
            anotherTime=myHour*100+myMinute;
            String timeinStr=transitToString(anotherTime);

            Toast toast=Toast.makeText(MainActivity.this, "Выбранное время: "+timeinStr, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM,0,250);
            toast.show();

        }
    };
}
