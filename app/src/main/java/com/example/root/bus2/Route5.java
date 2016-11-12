package com.example.root.bus2;



/**
 * Created by root on 08.10.16.
 */
public class Route5  extends Route {


    int[][] stopsTimetable={
            // 6 //ВОКЗАЛ
            {0,1726,1815},
            {0},
            {0},
            // 27 ПЛОЩАДЬ ПОБЕДЫ ВЕЧНЫЙ ОГОНЬ
            {724,1732,1821},
            {0},
            {0},
            // 23
            {7},
            {7},
            {7},
            // 17
            {12},
            {12},
            {12},
            // 9
            {13},
            {13},
            {13},

            // 2
            {0,728,752},
            {0},
            {0},
            // 15
            {12},
            {12},
            {12},
            // 24
            {17},
            {17},
            {17},
            // 28
            {24},
            {24},
            {24},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
