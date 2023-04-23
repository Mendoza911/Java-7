package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class StatsServiceTest {

    @Test
    void shouldCalculateSummarySales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 180;
        long actualMonth = service.summarySales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 15;
        long actualMonth = service.averageSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateLowerThanAverageSales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 5;
        long actualMonth = service.lowerThanAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    void shouldCalculateGreaterThanAverageSales() {
        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 5;
        long actualMonth = service.greaterThanAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


}
