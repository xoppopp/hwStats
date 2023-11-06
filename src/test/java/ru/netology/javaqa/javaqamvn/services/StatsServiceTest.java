package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCountSumOfSales() {                               //1:Сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        long actualSum = service.getSumOfSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCountAverageMonthlySales() {                      //2:Средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 15;
        long actualAvg = service.getAverageMonthlySales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindMaxSalesMonth() {                                //3:Месяц с максимумом продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {                              //4:Месяц с минимумом продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCountMonthsUnderAvg() {                            //5:Количество месяцев ниже avg
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUnderAmount = 5;
        int actualUnderAmount = service.getAmountOfMonthsUnderAvg(sales);

        Assertions.assertEquals(expectedUnderAmount, actualUnderAmount);


    }

    @Test
    public void shouldCountMonthsOverAvg() {                               //6:Количество месяцев выше avg
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedOverAmount = 5;
        int actualOverAmount = service.getAmountOfMonthsOverAvg(sales);

        Assertions.assertEquals(expectedOverAmount, actualOverAmount);
    }
}
