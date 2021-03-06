package com.example.root.bus2;

/**
 * Created by root on 19.10.16.
 */

public class Route22  extends Route {
    int[][] stopsTimetable={
            //2
            {0,646,704,730,803,832,850,921,937,955,1017,1051,1111,1150,1215,1246,1312,1327,1348,1413,1433,1445,1513,1554,1625,1645,1724,1744,1807,1846,1909,2111},
            {0,649,727,805,843,921,959,1037,1209,1321,1346,1443,1500,1618,1649,1806,2121},
            {0,649,727,805,843,921,959,1037,1209,1321,1346,1443,1500,1618,1649,1806,2121},
            // 10
            {3},
            {3},
            {3},
            // 15
            {0,659,717,743,816,845,903,934,950,1008,1030,1104,1124,1203,1228,1259,1325,1340,1401,1426,1446,1458,1526,1607,1638,1658,1737,1757,1820,1859,1922,1953,2124},
            {0,701,739,817,855,933,1011,1049,1221,1333,1358,1455,1512,1630,1701,1818,1943,2133},
            {0,701,739,817,855,933,1011,1049,1221,1333,1358,1455,1512,1630,1701,1818,1943,2133},
            // 20
            {5},
            {5},
            {5},
            // 33
            {11},
            {11},
            {11},
            // 31
            {0,714,732,738,758,824,834,903,921,952,1005,1023,1045,1119,1139,1218,1243,1314,1340,1355,1416,1441,1501,1513,1541,1622,1653,1713,1755,1815,1838,1917,1940,2011,2139},
            {0,715,753,831,909,947,1025,1103,1235,1347,1412,1509,1526,1644,1715,1832,1957,2147},
            {0,715,753,831,909,947,1025,1103,1235,1347,1412,1509,1526,1644,1715,1832,1957,2147},
            // 44
            {1},
            {1},
            {1},
            // 45
            {6},
            {6},
            {6},

            //40
            {11},
            {11},
            {11},
            // 43
            {0,615,633,659,719,732,758,805,816,847,903,921,946,1020,1040,1119,1144,1215,1241,1256,1317,1342,1402,1414,1442,1523,1554,1614,1650,1710,1733,1812,1835,1906,2040},
            {0,618,656,734,812,850,928,1006,1138,1250,1315,1412,1429,1547,1618,1735,1900,2050},
            {0,618,656,734,812,850,928,1006,1138,1250,1315,1412,1429,1547,1618,1735,1900,2050},
            // 49
            {2},
            {2},
            {2},

            //11
            {9},
            {9},
            {9},
            // 35
            {11},
            {11},
            {11},
            // 21
            {15},
            {15},
            {15},
            // 25
            {17},
            {17},
            {17},
            // 14
            {22},
            {22},
            {22},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
