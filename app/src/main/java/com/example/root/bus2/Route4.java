package com.example.root.bus2;



/**
 * Created by root on 08.10.16.
 */
public class Route4 extends Route {
    int[][] stopsTimetable={
            //13 //КРЕСТЫ В ЦЕНТР
            {0,557,636,654,712,722,734,744,754,804,814,825,833,843,853,904,915,926,937,949,1003,1017,1031,1044,1056,1107,1119,1134,1149,1204,1219,1234,1249,1304,1319,1332,1343,1353,1406,1420,1434,1448,1502,1513,1525,1538,1551,1605,1618,1631,1643,1655,1708,1721,1733,1743,1753,1803,1815,1828,1842,1856,1910,1923,1935,1947,2004,2032,2101,2130,2158,2226,2256,2334},
            {0,559,627,656,724,752,825,841,859,919,937,955,1013,1031,1049,1107,1125,1143,1201,1217,1230,1244,1258,1314,1331,1347,1401,1415,1430,1445,1500,1515,1531,1545,1600,1615,1630,1645,1701,1715,1730,1745,1800,1815,1830,1845,1900,1915,1930,1945,1957,2019,2044,2112,2141,2209,2237,2306,2334},
            {0,559,627,656,724,752,825,841,859,919,938,957,1016,1035,1054,1113,1132,1152,1208,1224,1243,1302,1320,1338,1354,1413,1432,1450,1508,1526,1544,1602,1620,1638,1656,1714,1732,1748,1800,1813,1831,1849,1908,1927,1943,2004,2031,2100,2128,2156,2225,2253,2321},

            // 18 //ЛЕТНИЙ САД ОТ ВОКЗАЛА
            {15},
            {15},
            {15},
            // 8 //ДЕТСКИЙ ПАРК К ЛЕНИНУ
            {17},
            {17},
            {17},
            // 15 //ЛЕНИНА ОКТЯБРЬ
            {19},
            {19},
            {19},
            // 20
            {24},
            {24},
            {24},
            // 31
            {0,511,550,608,626,636,645,655,705,715,725,733,744,754,804,815,826,837,848,900,914,928,942,955,1007,1018,1030,1045,1100,1115,1130,1145,1200,1215,1230,1243,1254,1304,1317,1331,1345,1359,1413,1424,1436,1449,1502,1516,1529,1542,1554,1606,1619,1632,1644,1654,1704,1714,1726,1739,1753,1807,1821,1834,1846,1858,1918,1946,2015,2044,2112,2140,2210,2241},
            {0,610,638,706,733,752,810,830,848,906,924,942,1000,1018,1036,1054,1112,1128,1141,1155,1209,1225,1242,1258,1312,1326,1341,1356,1411,1426,1442,1456,1511,1526,1541,1556,1612,1626,1641,1656,1711,1726,1741,1756,1811,1826,1841,1856,1911,1933,1958,2026,2055,2123,2151,2220,2248},
            {0,610,638,706,733,752,810,830,849,908,927,946,1005,1024,1043,1103,1119,1135,1154,1213,1231,1249,1305,1324,1343,1401,1419,1437,1455,1513,1531,1549,1607,1625,1643,1659,1711,1724,1742,1800,1819,1838,1854,1918,1945,2014,2042,2110,2139,2207,2235},

            // 44
            {1},
            {1},
            {1},
            // 11
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
            // 9
            {0,529,610,628,646,656,707,717,727,737,747,755,806,816,826,837,848,859,910,922,936,950,1004,1017,1029,1040,1052,1107,1122,1137,1152,1207,1222,1237,1252,1305,1316,1326,1339,1353,1407,1421,1435,1446,1458,1511,1524,1538,1551,1604,1616,1628,1641,1654,1706,1716,1726,1736,1748,1801,1815,1829,1843,1856,1908,1920,1938,2006,2035,2104,2132,2200,2230,2301},
            {0,533,601,630,658,726,755,814,832,852,910,928,946,1004,1022,1040,1058,1116,1134,1150,1203,1217,1231,1247,1304,1320,1334,1348,1403,1418,1433,1448,1504,1518,1533,1548,1603,1618,1634,1648,1703,1718,1733,1748,1803,1818,1833,1848,1903,1918,1931,1953,2018,2046,2115,2143,2211,2240,2308},
            {0,533,601,630,658,726,755,814,832,852,911,930,949,1008,1027,1046,1105,1125,1141,1157,1216,1235,1253,1311,1327,1346,1405,1423,1441,1459,1517,1535,1553,1611,1629,1647,1705,1721,1733,1746,1804,1822,1841,1900,1916,1938,2005,2034,2102,2130,2159,2227,2255},

            // 19 /ЛЕТНИЙ САД К ВОКЗАЛУ
            {2},
            {2},
            {2},
            // 48 Кресты из центра
            {17},
            {17},
            {17},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
