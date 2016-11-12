package com.example.root.bus2;

/**
 * Created by root on 31.10.16.
 */
//import android.util.Log;

public class StopData {



    public  Stop getStopById(int stopId){
        Stop stophere=null;
        for (int i=0; i<stopDataArray.length; i++) {
            if (stopDataArray[i].id==stopId){
                stophere=stopDataArray[i];
                break;

            }

        }
        return stophere;
    }
    public Stop getStopByIndex(int index){
        return stopDataArray[index];
    }

public  String[] getStopNameArray(){
    int l=stopDataArray.length;
      String []stopNameArray=new String[l];
            for (int i=0; i<l; i++) {
             stopNameArray[i]=stopDataArray[i].name;
                    }
            return stopNameArray;
            }

    public double []  getGeoCoord(int stopId){
        int pos=getPosById(stopId);

                return stopDataArray[pos].geo;
            }


    public String getStopNameById(int id){
        int pos=getPosById(id);
        return stopDataArray[pos].name;
    }


    public int getId(int pos){
        return stopDataArray[pos].id;
    }

   public int getPosById(int id){
        int result=0;
        for (int i=0; i<stopDataArray.length; i++) {
            if (stopDataArray[i].id==id){
                result=i;
                break;
            }
        }
        return result;
    }

    Stop stop1=new Stop("Алехина ул. в центр", 50001, new double[]{57.835927, 28.286727}, new int[]{1, 16, 18});
    Stop stop2=new Stop( "Архив"                         ,40002 , new double[]{57.832734, 28.353279}, new int[]{5, 11, 22, 23, 25, 30});
    Stop stop3=new Stop( "Балтийская"                     ,3 , new double[]{57.810565, 28.264685}, new int[]{2, 17});
    Stop stop4=new Stop( "Белый мох в город"              ,4, new double[]{57.827936, 28.446735}, new int[]{9});
    Stop stop5=new Stop( "Ваулино в город"                ,5 , new double[]{57.873175, 28.318782}, new int[]{7});
    Stop stop6=new Stop( "Вокзал"                        ,10006 , new double[]{57.805280, 28.361365}, new int[]{1, 2, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 23});
    Stop stop7=new Stop( "Вокзал в Череху"               ,10007 , new double[]{57.804043, 28.359638}, new int[]{6});
    Stop stop8=new Stop( "Детская обл. больница к центру",47 , new double[]{57.819682, 28.297273}, new int[]{14});
    Stop stop9=new Stop( "Детский парк к пл.Ленина",20008 , new double[]{57.815305, 28.33928}, new int[]{1, 3, 4, 8, 11, 14, 15, 17});
    Stop stop10=new Stop( "Детский парк к вокзалу", 20009, new double[]{57.815660, 28.337269 }, new int[]{1, 3, 4, 5, 8, 11, 14, 15, 17});
    Stop stop11=new Stop( "Звездная" ,10 , new double[]{57.836884, 28.347902}, new int[]{5, 11, 22, 23, 25, 30});
    Stop stop12=new Stop( "Инжинерная"        , 36, new double[]{57.82383, 28.362041}, new int[]{3});
    Stop stop13=new Stop( "Колокольная в центр",41 , new double[]{57.836805, 28.271887 }, new int[]{1, 16});
    Stop stop14=new Stop( "Колокольная из центра", 42, new double[]{57.836805, 28.271887}, new int[]{1, 16});
    Stop stop15=new Stop( "Коммунальная в центр", 90011, new double[]{57.818869, 28.292523}, new int[]{2, 3, 4, 6, 16, 17, 22, 25, 30});
    Stop stop16=new Stop( "Коммунальная к Чудской", 90045 , new double[]{57.820269, 28.293090}, new int[]{16, 22});
    Stop stop17=new Stop( "Корытово в центр",  12, new double[]{57.784224, 28.342333}, new int[]{8});
    Stop stop18=new Stop( "Кресты в центр",  990013 , new double[]{57.795124, 28.415793}, new int[]{4, 9, 12});
    Stop stop19=new Stop( "Кресты из центра",990048 , new double[]{57.795124, 28.415793}, new int[]{4, 9, 12});
    Stop stop20=new Stop( "Ленина пл. ДКП",  30014,  new double[]{57.820033, 28.331829}, new int[]{1, 7, 11, 18, 22, 25, 30});
    Stop stop21=new Stop( "Ленина пл. кт.Октябрь",   30015 , new double[]{57.819239, 28.331239}, new int[]{3, 4, 5, 7, 8, 14, 15, 17, 18, 19, 22, 25, 30});
    Stop stop22=new Stop( "Ленина пл. Кремль",  30016 , new double[]{557.820517, 28.331293}, new int[]{1, 11});
    Stop stop23=new Stop( "Ленина пл. Сбербанк",30017 , new double[]{57.818599, 28.332312}, new int[]{3, 4, 5, 14, 15, 17});
    Stop stop24=new Stop( "Лента",   46 , new double[]{57.805684, 28.269138}, new int[]{25});
    Stop stop25=new Stop( "Летний Сад от вокзала", 140018 , new double[]{57.813817, 28.345617}, new int[]{1, 3, 4, 8, 11, 14, 15, 17});
    Stop stop26=new Stop( "Летний Сад к вокзалу", 140019 , new double[]{57.813717, 28.345392}, new int[]{1, 4, 11, 14, 15, 17});
    Stop stop27=new Stop( "Маяк от центра", 70020 , new double[]{57.816853, 28.304212}, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
    Stop stop28=new Stop( "Маяк в центр",70021 , new double[]{57.817214, 28.307420}, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
    Stop stop29=new Stop( "Невского в центр",60022 , new double[]{57.828292, 28.322583}, new int[]{1, 7, 18, 25});
    Stop stop30=new Stop( "Обл.Больница от Дамбы", 23 , new double[]{57.813201, 28.322610}, new int[]{2, 5});
    Stop stop31=new Stop( "Обл.Больница к Дамбе", 24 , new double[]{57.812846, 28.322331}, new int[]{2, 5, 8, 19});
    Stop stop32=new Stop( "Овсище в центр",120039 , new double[]{57.835254, 28.2919 }, new int[]{1, 18});
    Stop stop33=new Stop( "Петровская в центр",25 , new double[]{57.817870, 28.315703}, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
    Stop stop34=new Stop( "Печорская", 44 , new double[]{57.815932, 28.280924}, new int[]{2, 3, 4, 6, 14, 17, 18, 22, 25, 30});
    Stop stop35=new Stop( "Писковичи в город",26 , new double[]{57.862994, 28.209880}, new int[]{18});
    Stop stop36=new Stop( "Пл.Победы вечный огонь", 110027 , new double[]{57.807767, 28.339227}, new int[]{2, 6, 16});
    Stop stop37=new Stop( "Пл.Победы ГПТУ1", 110028 , new double[]{57.806753, 28.338562}, new int[]{2, 6, 8, 16, 19});
    Stop stop38=new Stop( "Политехнический колледж", 43 , new double[]{57.841663, 28.30196}, new int[]{22});
    Stop stop39=new Stop( "Псковкирпич", 29 , new double[]{57.756918, 28.411393}, new int[]{12});
    Stop stop40=new Stop( "Пчеловод", 37 , new double[]{57.827654, 28.406357}, new int[]{14});
    Stop stop41=new Stop( "Родина", 30 , new double[]{57.831747, 28.255382}, new int[]{18});
    Stop stop42=new Stop( "Рокоссовского", 80031 , new double[]{57.814091, 28.274265}, new int[]{2, 3, 4, 6, 14, 17, 18, 22, 25, 30});
    Stop stop43=new Stop( "Снятная Гора", 32 , new double[]{57.836713, 28.271679}, new int[]{1, 16});
    Stop stop44=new Stop( "Телецентр", 33 , new double[]{57.810524, 28.279955}, new int[]{2, 7, 15, 17, 22, 30});
    Stop stop45=new Stop( "Цементный склад", 38 , new double[]{57.79003, 28.286598}, new int[]{19});
    Stop stop46=new Stop( "Череха в центр", 34 , new double[]{57.745008, 28.370854 }, new int[]{6});
    Stop stop47=new Stop( "Чудская в центр", 130040 , new double[]{57.837909, 28.304449}, new int[]{1, 18, 22});
    Stop stop48=new Stop( "Чудская из центра",130049 , new double[]{57.838381,28.304666}, new int[]{1, 18, 22});
    Stop stop49=new Stop( "Юбилейная в центр", 100035 , new double[]{57.814272, 28.295574 }, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
//            Stop stop=new Stop(, , "geo:", new int[]{});






    private Stop [] stopDataArray= {
            stop1,stop2,stop3,stop4,stop5,stop6,stop7,stop8,stop9,stop10,stop11,stop12,stop13,
            stop14,stop15,stop16,stop17,stop18,stop19,stop20,stop21,stop22,stop23,stop24,stop25,stop26,stop27,stop28,
            stop29,stop30,stop31,stop32,stop33,stop34,stop35,stop36,stop37,stop38,stop39,stop40,stop41,
            stop42,stop43,stop44,stop45,stop46,stop47,stop48,stop49
    };
}
