package com.example.root.bus2;

public class Route8  extends Route {
    int[][] stopsTimetable={
            //15  //ЛЕНИНА ОКТЯБРЬ
            {0,546,611,638,650,727,756,828,857,929,949,1011,1042,1112,1142,1213,1243,1255,1310,1344,1402,1426,1457,1527,1538,1557,1628,1640,1720,1741,1805,1823,1844,1908,1933,1955,2056,2152},
            {0,618,641,655,727,742,756,806,830,902,915,941,955,1014,1042,1113,1138,1155,1225,1257,1335,1355,1435,1457,1515,1549,1600,1625,1640,1653,1720,1730,1807,1836,1929,2008,2125,2204},
            {0,618,641,655,727,742,756,806,830,902,915,941,955,1014,1042,1113,1138,1155,1225,1257,1335,1355,1435,1457,1515,1549,1600,1625,1640,1653,1720,1730,1807,1836,1929,2008,2125,2204},

            // 24 ОБЛ БОЛЬНИЦА К ДАМБЕ
            {5},
            {5},
            {5},

            // 12 //КОРЫТОВО В ЦЕНТР
            {0,618,630,707,736,808,837,909,955,1052,1153,1223,1235,1312,1324,1425,1507,1518,1555,1608,1620,1700,1721,1801,1803,1824,1902,1913,1935,2004,2036,2132,2227},
            {0,635,707,736,746,810,823,837,855,921,935,1012,1053,1135,1205,1236,1255,1415,1458,1519,1540,1620,1633,1700,1710,1734,1747,1757,1830,1909,1948,2041,2144,2225},
            {0,635,707,736,746,810,823,837,855,921,935,1012,1053,1135,1205,1236,1255,1415,1458,1519,1540,1620,1633,1700,1710,1734,1747,1757,1830,1909,1948,2041,2144,2225},

            // 28 //ПЛОЩАДЬ ПОБЕДЫ ПТУ1
            {0,627,639,716,745,817,846,918,938,1004,1031,1101,1126,1202,1232,1244,1321,1333,1351,1434,1446,1516,1527,1604,1617,1629,1709,1730,1810,1812,1833,1911,1922,1944,2013,2045,2141,2236},
            {0,644,716,745,755,819,832,846,904,930,944,1021,1031,1102,1123,1144,1214,1245,1304,1344,1424,1446,1507,1528,1549,1629,1642,1709,1719,1743,1756,1806,1839,1918,1957,2050,2153,2234},
            {0,644,716,745,755,819,832,846,904,930,944,1021,1031,1102,1123,1144,1214,1245,1304,1344,1424,1446,1507,1528,1549,1629,1642,1709,1719,1743,1756,1806,1839,1918,1957,2050,2153,2234},

            // 18
            {0,1003,1134,1302,1418,1549,1757,1906},
            {0,855,1007,1133,1250,1329,1510,1542,1619,1830,2119},
            {0,855,1007,1133,1250,1329,1510,1542,1619,1830,2119},
            // 8//
            {2},
            {2},
            {2},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}