package com.example.root.bus2;



/**
 * Created by root on 08.10.16.
 */
public class Route3 extends Route {
    int[][] stopsTimetable={
            //36 ИНЖИНЕРНАЯ
            {0,604,618,635,645,655,709,717,725,733,746,758,804,812,819,829,839,849,857,902,907,915,924,933,942,951,959,1007,1015,1024,1037,1051,1106,1118,1129,1141,1153,1206,1217,1229,1242,1255,1307,1320,1332,1344,1356,1409,1422,1435,1447,1459,1511,1522,1534,1546,1552,1557,1604,1614,1624,1638,1648,1658,1704,1710,1715,1721,1728,1743,1759,1805,1817,1822,1827,1832,1839,1850,1901,1914,1926,1942,2003,2028,2100,2128,2158,2228,2258,2328},
            {0,619,639,659,719,739,759,819,839,859,919,939,949,959,1009,1029,1049,1109,1119,1129,1139,1149,1159,1209,1219,1229,1239,1249,1259,1309,1319,1339,1359,1419,1434,1444,1454,1504,1514,1524,1534,1544,1554,1604,1615,1626,1638,1650,1702,1714,1729,1744,1801,1821,1842,1902,1922,1942,2002,2022,2042,2102,2122,2142,2202,2222,2237},
            {0,624,644,704,724,744,804,824,844,904,924,944,1004,1024,1044,1104,1124,1134,1145,1156,1207,1222,1233,1244,1256,1309,1322,1334,1346,1400,1415,1435,1458,1518,1538,1558,1608,1618,1628,1641,1656,1708,1718,1728,1741,1756,1808,1818,1828,1848,1908,1928,1948,2008,2028,2048,2108,2128,2148,2208,2228,2248},

            // 18 ЛЕТНИЙ САД ОТ ВОКЗАЛА
            {6},
            {6},
            {6},
            // 8 //ДЕТСКИЙ ПАРК К ЛЕНИНУ
            {8},
            {8},
            {8},
            // 15 //ЛЕНИНА ОКТЯБРЬ
            {10},
            {10},
            {10},
            // 20 МАЯК ОТ ЦЕНТРА
            {15},
            {15},
            {15},
            // 31 РОКОССОВСКОГО
            {0,616,626,634,644,652,702,712,722,731,740,749,758,807,817,827,836,844,853,902,911,920,928,936,944,953,1006,1020,1035,1047,1058,1110,1122,1135,1146,1158,1211,1224,1236,1249,1301,1313,1325,1338,1351,1404,1416,1428,1439,1451,1459,1507,1515,1523,1532,1541,1550,1558,1607,1616,1623,1630,1637,1646,1657,1708,1719,1729,1737,1745,1752,1758,1807,1817,1830,1843,1857,1913,1934,1959,2031,2059,2129,2159,2229,2259},
            {0,610,630,650,710,730,750,810,830,850,910,920,930,940,1000,1020,1040,1050,1100,1110,1120,1130,1140,1150,1200,1210,1220,1230,1240,1250,1310,1330,1350,1405,1415,1425,1435,1445,1455,1505,1515,1525,1535,1546,1557,1609,1621,1633,1645,1700,1715,1732,1752,1813,1833,1853,1913,1933,1953,2013,2033,2053,2113,2133,2153,2208},
            {0,615,635,655,715,735,755,815,835,855,915,935,955,1015,1035,1055,1105,1116,1127,1138,1153,1204,1215,1227,1240,1253,1305,1317,1331,1346,1406,1429,1449,1509,1529,1539,1549,1559,1612,1627,1639,1649,1659,1712,1727,1739,1749,1759,1819,1839,1859,1919,1939,1959,2019,2039,2059,2119,2139,2159,2219},

            // 44 //ПЕЧОРСКАЯ
            {1},
            {1},
            {1},
            // 11 //КОММУНАЛЬНАЯ
            {7},
            {7},
            {7},
            // 35 ЮБИЛЕЙНАЯ В ЦЕНТР
            {10},
            {10},
            {10},
            // 21 МАЯК В ЦЕНТР
            {14},
            {14},
            {14},
            // 25 ПЕТРОВСКАЯ В ЦЕНТР
            {16},
            {16},
            {16},
            // 17 /ЛЕНИНА ДЕТМИР
            {20},
            {20},
            {20},
            // 9// ДЕТСКИЙ ПАРК К ВОКЗАЛУ
            {22},
            {22},
            {22},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}

