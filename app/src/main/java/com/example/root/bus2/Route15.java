package com.example.root.bus2;

public class Route15  extends Route {
    int[][] stopsTimetable={
            //6
            {0,1540,1635,1720,1820,2020},
            {0,1300,1440,1635,1820},
            {0,1300,1440,1635,1820},
            // 18
            {8},
            {8},
            {8},
            // 8
            {10},
            {10},
            {10},
            // 15
            {0,535,615,640,720,800,838,915,1025,1210,1400,1510,1552,1615,1647,1732,1750,1832,1922,2032},
            {0,535,640,800,915,1025,1210,1312,1400,1452,1510,1615,1647,1750,1832},
            {0,535,640,800,915,1025,1210,1312,1400,1452,1510,1615,1647,1750,1832},
            // 20
            {5},
            {5},
            {5},
            // 33
            {11},
            {11},
            {11},
            // 35
            {0,630,710,746,826,906,946,1012,1122,1312,1457,1607,1656,1712,1751,1836,1852,1936,2026,2134},
            {0,630,746,926,1012,1122,1312,1416,1457,1556,1607,1712,1751,1852,1936},
            {0,630,746,926,1012,1122,1312,1416,1457,1556,1607,1712,1751,1852,1936},
            // 21
            {4},
            {4},
            {4},
            // 25
            {6},
            {6},
            {6},
            // 17
            {10},
            {10},
            {10},
            // 9
            {12},
            {12},
            {12},
            // 19
            {14},
            {14},
            {14},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}