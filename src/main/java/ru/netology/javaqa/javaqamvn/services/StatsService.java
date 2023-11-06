package ru.netology.javaqa.javaqamvn.services;

public class StatsService {

    public long getSumOfSales(long[] sales) {                        //1:Сумма всех продаж
        long sum = 0;
        for (long t : sales) {
            sum = sum + t;
        }

        return sum;
    }

    public long getAverageMonthlySales(long[] sales) {                //2:Средняя сумма продаж в месяц
        long averageMonthlySales = getSumOfSales(sales);
        return averageMonthlySales / 12;
    }

    public int getMaxMonth(long[] sales) {                            //3:Месяц с максимумом продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {                                 //4:Месяц с минимумом продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getAmountOfMonthsUnderAvg(long[] sales) {                //5:Количество месяцев ниже avg
        int amountOfMonthsUnderAvg = 0;
        long avg = getAverageMonthlySales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                amountOfMonthsUnderAvg++;
            }
        }
        return amountOfMonthsUnderAvg;
    }

    public int getAmountOfMonthsOverAvg(long[] sales) {                   //6:Количество месяцев выше avg
        int amountOfMonthsOverAvg = 0;
        long avg = getAverageMonthlySales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                amountOfMonthsOverAvg++;
            }
        }
        return amountOfMonthsOverAvg;
    }
}
