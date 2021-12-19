package stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void calcSum() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void findAvg() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void findMinSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void findBellowAvg() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findBellowAvg(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void findAboveAvg() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findAboveAvg(allSales);

        assertEquals(expected, actual);
    }
}