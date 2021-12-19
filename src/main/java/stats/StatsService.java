package stats;

public class StatsService {

    // сумма всех продаж:

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц:

    public int findAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж:

    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // номер месяца, в котором был  минимум продаж:

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего:

    public int findBellowAvg(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    // Кол-во месяцев, в которых продажи были выше среднего:

    public int findAboveAvg(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale > findAvg(sales)) {
                amount = amount + 1;
            }
        }
        return amount;
    }

}