package com.example.root.bus2;

import android.util.Log;

import java.util.ArrayList;


public class DataArrays {


    private static final String TAG = "myLogs";






    String[][] getTimetableList(int id, int time) {
        StopData stopdata=new StopData();
        Stop startstop;
        startstop=stopdata.getStopById(id);
        int stopPosition=stopdata.getPosById(id);

        int[] routeListAtStart = startstop.routeHere;


        String[][] timeTableList = new String[routeListAtStart.length][];
        TimeData timedata = new TimeData();
        int timeNow= 0;
        if (time==2400) {
            timeNow = timedata.getTimeNow();
        }else{timeNow=time;}

        int timeshift = timedata.getTimeshift();
        int k=0;
        for (int i = 0; i < routeListAtStart.length; i++) {   // проходим по массиву маршрутов
            int routeNumber = routeListAtStart[i];

            int stopPosition2 = getStopPosition(routeNumber, id);
            String[]tempResult;
            timeTableList[k] = new String[3];


            tempResult = getNearestTime(stopPosition2, timeNow, timeshift, routeNumber);

            if(tempResult[0]!=null){
                timeTableList[k]=tempResult;

                k++;

            }


        }
        return timeTableList;
    }


    public String[] getNearestTime(int stopPosition, int timeNow, int timeshift, int route) {
        Route routeNow;
        int indexObj=getIndexObj(route);
        routeNow = routeArr[indexObj]; /// получаем объект каждого маршрута
        int[][] stopsTimetable = routeNow.getStopTimeTable();


        int timePlus = 0;
        int realPos = (stopPosition * 3) + timeshift;
        String[] nearestTime = new String[3];



        if (stopsTimetable[realPos][0] != 0) {

            timePlus = stopsTimetable[realPos][0];

            for (int k = realPos; k > 0; k -= 3) {
                if (stopsTimetable[k][0] == 0) {
                    realPos = k;

                    break;
                }
            }
        }


        for (int i = 1; i < stopsTimetable[realPos].length; i++) {
            int gotTime = stopsTimetable[realPos][i];
            if (timePlus != 0) {
                gotTime = check60(gotTime, timePlus);
            }

            if (timeNow < gotTime) {


                nearestTime[0] = Integer.toString(route)+":  ";
                nearestTime[1] = timeTostring(gotTime);

                if (i < stopsTimetable[realPos].length - 1) {
                    gotTime = stopsTimetable[realPos][i + 1];
                    if (timePlus != 0) {
                        gotTime = check60(gotTime, timePlus);
                    }
                    nearestTime[2] = ", "+timeTostring(gotTime);
                }
                break;
            }
        }


        return nearestTime;
    }



    public String[][] getTransitWay(Stop stopStart, Stop stopFinal) {
        StopData stopdata = new StopData();

        int stopPosition=stopdata.getPosById (stopStart.id);
        int finaldestPosition=stopdata.getPosById(stopFinal.id);


        String straightRouteList="";
        String [][] transitResult=new String[3][];
        transitResult[0]=new String[1];
        int [] routeListStartPoint=stopStart.routeHere;// список маршрутов начальной остановки

int counter=0;
        for (int i:routeListStartPoint){

            for (int k=1; k<routePath[i].length; k++){// проходим по траектории маршрута
                if(routePath[i][k]==stopFinal.id){
                    if (counter>0){
                        straightRouteList+=", ";
                    }
                    straightRouteList+=Integer.toString(i);

                    counter++;

                }
            }
        }
//        Log.d(TAG, "прямые маршуты  : " + straightRouteList);
        String straightRes="";
        if(straightRouteList.length()>0){

            straightRes=straightRouteList;
        }else{straightRes="не найдено.";}
        transitResult[0][0]="Прямые маршруты: "+straightRes;


        ArrayList<String > transitionWay=checktransitionPath(stopStart,stopFinal);

        if(transitionWay.size()!=0){
            int size=transitionWay.size()/5;

            transitResult[1]=new String[size+1];
            transitResult[2]=new String[size];
            int k=1;
            transitResult[1][0]="Варианты пересадок: \n";
            for(int j=0;j<transitionWay.size();j+=5){




                transitResult[1][k]=" ";
                transitResult[2][k-1]=transitionWay.get(j+4);


                transitResult[1][k] += transitionWay.get(j)+transitionWay.get(j+1)+
                        transitionWay.get(j+2)+transitionWay.get(j+3);

// Log.d(TAG, "++++transitResult[1][k] : "+transitResult[1][k]);

                k++;
            }
        }



        return transitResult;
    }

    private ArrayList<String> checktransitionPath(Stop stopStart, Stop stopFinal) {


        int [] routeListStartPoint=stopStart.routeHere;//Список маршрутов начальной остановки
        int [] routeListFinalPoint=stopFinal.routeHere;// Маршруты конечной остановки

        ArrayList<String> transitResultList = new ArrayList<String>();
        StopData stopdata=new StopData();

        int stopId=stopStart.id;
        int stopFinalId=stopFinal.id;


        for (int routehere:routeListStartPoint){

            boolean begin=false;
             for(int stop:routePath[routehere]){
                if (stop==stopId){
                    begin=true;
                    continue;
                }
                 if(stop==stopFinalId){
                     break;
                 }
                if (begin&&stop>10000){

                    int hub=stop/10000;
                     for (int finalroute:routeListFinalPoint) {
                        boolean begin1=false;
                         for (int i = routePath[finalroute].length-1; i >=0 ; i--) {
                            int stopInFinalRoute=routePath[finalroute][i];//Здесь плолучаем id

                            if(stopInFinalRoute==stopFinalId){begin1=true;}


                            if (stopInFinalRoute>10000 && stopInFinalRoute/10000==hub & begin1) {
                                transitResultList.add(Integer.toString(routehere)) ;

                                String namefirst=stopdata.getStopNameById(stop);

                                transitResultList.add(" > "+namefirst);

                                if (stop!=stopInFinalRoute) {
                                    String nameSecond=stopdata.getStopNameById(stopInFinalRoute);
                                    transitResultList.add(" > "+nameSecond+" > ");
                                }else { transitResultList.add(" >");}

                                transitResultList.add(Integer.toString(finalroute));
                                transitResultList.add(Integer.toString(stop)) ;

                                break;

                            }
                        }

                    }

                }

            }
        }
        int k=0;
        int size=transitResultList.size();



        for(int i=5; i<size;i+=5){


            if(transitResultList.get(k).equals(transitResultList.get(i))&&
                    transitResultList.get(k+1).equals(transitResultList.get(i+1))&
                            transitResultList.get(k+2).equals(transitResultList.get(i+2))
                    ){
                String temp=transitResultList.get(k+3)+", "+transitResultList.get(i+3);

                transitResultList.set(k+3,temp);

                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                i-=5;
                size-=5;
            }else if(transitResultList.get(i).equals(transitResultList.get(i+3))){

                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                i-=5;
                size-=5;
            }else if(transitResultList.get(k).equals(transitResultList.get(i))&&
                    transitResultList.get(k+3).equals(transitResultList.get(i+3))){

                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                transitResultList.remove(i);
                i-=5;
                size-=5;



            }else{k+=5;}

        }



        return transitResultList;
    }


    private int getIndexObj(int route) {
        int index=0;
        for (int i=0;i<routeNumbers.length;i++){
            if (routeNumbers[i]==route){
                index=i;
                break;
            }
        }
        return index;
    }


    int getStopPosition(int route, int stopId){ // ищем порядковую позицию остановке в объекте Route
        for (int i=0; i<routePath[route].length;i++){
            if (stopId==routePath[route][i]){
                return i;
            }
        }
        return 0;
    }

    private int check60(int gotTime, int timePlus) {
        int timehere = gotTime + timePlus;
        int min = timehere - (timehere / 100) * 100;
        if (min > 59) {
            timehere += 40;
        }
        return timehere;
    }

    private String timeTostring(int time) {
        if(time>2359){
            time-=2400;
        }
        String str = Integer.toString(time);
        String str2 = "";
        if (str.length() == 4) {
            str2 = str.substring(0, 2) + ":" + str.substring(2, 4);
        }

        if (str.length() == 3) {
            str2 = str.substring(0, 1) + ":" + str.substring(1, 3);
        }

        if (str.length() == 2) {
            str2 = "00:" + str.substring(0, 2);
        }

        if (str.length() == 1) {
            str2 = "00:0" + str;
        }

        return str2;

    }





    int routePath[][] = {
            {}, // 0
            {10006, 140018, 20008, 30014, 130049, 42, 32, 41, 50001, 120039, 130040, 60022, 30016, 20009, 140019, 10006},    // 1 route
            {10006, 110027, 23, 70020, 33, 3, 80031, 44,90011, 100035, 70021, 25, 24, 110028, 10006},           //2
            {36, 140018, 20008, 30015, 70020, 80031, 44, 90011, 100035, 70021, 25, 30017, 20009,36},                  //3
            {990013, 140018, 20008, 30015, 70020, 80031, 44, 90011, 100035, 70021, 25, 30017,20009, 140019, 990048},      //4
            {10006, 110027, 23, 30017, 20009, 40002, 30015, 24, 110028, 10006},                                        //5
            {34,10006, 110027, 80031, 44,90011, 110028, 10007,34},                                              //6
            {100035, 70021, 25, 30014, 5,60022, 30015, 70020, 33,100035},                                           //7
            {30015, 24, 12, 110028, 140018, 20008, 30015},                                                              //8
            {10006, 990048, 4, 990013, 10006},                                                                       //9
            {},
            {10006, 140018, 20008, 30014, 40002, 10, 30016, 20009, 140019,10006},                     //11
            {10006, 990048, 29, 990013,10006},                                                               //12
            {},
            {37, 10006, 140018, 20008, 30015, 80031, 44, 47, 30017, 20009, 140019, 37},                 //14
            {10006, 140018, 20008, 30015, 70020, 33, 100035, 70021, 25, 30017, 20009, 140019, 10006},     //15
            {10006, 110027, 90045, 42, 32, 41, 50001, 90011, 110028, 10006},               //16
            {10006, 140018, 20008, 30015, 70020, 33, 3, 80031, 44, 90011, 100035, 70021, 25, 30017,20009, 140019, 10006},   //17
            {26, 50001, 120039, 130040, 60022, 30015, 70020, 30, 80031, 44, 90011, 100035, 70021, 25, 30014, 130049, 26},    //18
            {30015, 24, 38, 110028, 140018, 20008, 30015},     //19
            {},
            {},
            {40002, 10, 30015, 70020, 33, 80031, 44, 90045, 130040, 43, 130049, 90011, 100035, 70021, 25, 30014, 40002},   //22
            {10006, 40002, 10006},        //23
            {},
            {40002, 10, 60022, 30015, 70020, 46, 80031, 44,90011, 100035, 70021, 25, 30014,40002},  //25
            {},
            {},
            {},
            {},
            {40002, 10, 30015, 70020, 33, 80031, 44, 90011, 100035, 70021, 25, 30014, 40002}  //30
    };



    Route[] routeArr = {
            new Route1(), new Route2(), new Route3(), new Route4(), new Route5(),
            new Route6(), new Route7(), new Route8(), new Route9(), new Route11(),
            new Route12(), new Route14(), new Route15(), new Route16(), new Route17(),
            new Route18(), new Route19(), new Route22(), new Route23(), new Route25(),
            new Route30()
    };

    int [] routeNumbers={1,2,3,4,5,6,7,8,9,11,12,14,15,16,17,18,19,22,23,25,30
    };







}

