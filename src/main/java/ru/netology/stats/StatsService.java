package ru.netology.stats;

public class StatsService {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж: " + service.summarySales(sales));
        System.out.println("Средняя сумма всех продаж в месяц: " + service.averageSales(sales));
        System.out.println("Пик продаж: " + service.maxSales(sales));
        System.out.println("Минимум продаж: " + service.minSales(sales));
        System.out.println("Количество месяцев с продажами ниже среднего: " + service.lowerThanAverageSales(sales));
        System.out.println("Количество месяцев с продажами выше среднего: " + service.greaterThanAverageSales(sales));

    }

    public long summarySales(long[] sales) {
        long sum = 0;
        for (long sell : sales) {
            sum += sell;
        }
        return sum;

    }

    public long averageSales(long[] sales) {
        return summarySales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowerThanAverageSales(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int greaterThanAverageSales(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }


}