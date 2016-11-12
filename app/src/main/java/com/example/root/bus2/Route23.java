package com.example.root.bus2;

/**
 * Created by root on 19.10.16.
 */

public class Route23  extends Route {
    int[][] stopsTimetable={
            //6
            {0,657,805,849,933,1112,1156,1240,1324,1408,1521,1602,1654,1738,1822},
            {0},
            {0},
            // 2,
            {0,614,719,822,906,950,1129,1213,1257,1341,1425,1538,1619,1711,1839},
            {0},
            {0},


    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
