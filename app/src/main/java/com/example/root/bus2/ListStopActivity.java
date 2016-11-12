package com.example.root.bus2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListStopActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener,View.OnClickListener {

    String[] stopnames;
    ListView stoplistView;
    int stopId;

    private static final String TAG="myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stop);


        stopnames=getStopNameArr();

        ListView stoplistView = (ListView) findViewById(R.id.stoplistView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stopnames);
        stoplistView.setAdapter(adapter);



        stoplistView.setOnItemClickListener(this);
        stoplistView.setOnItemLongClickListener(this);

    }


    String[] getStopNameArr(){
        StopData stopdata=new StopData();
        String[] result=stopdata.getStopNameArray();
        return result;
    }

    int getStopId(int position){
        StopData stopdata=new StopData();
        return stopdata.getId(position);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent();
        stopnames=getStopNameArr();
        String  stopName=stopnames[position];
        intent.putExtra("stopName", stopName);
        stopId=getStopId(position);
        intent.putExtra("stopId",stopId);

        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {



        return false;
    }
}

