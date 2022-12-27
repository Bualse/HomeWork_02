public class HHWW {
    public static void main(String[] args) {
        var bananas = 5;
        var weightOneBanan = 80; // gramms
        var totalWeigtsBananas = bananas * weightOneBanan;
        System.out.println("totalWeigtsBananas = " + totalWeigtsBananas + " gramms.");

        var milk = 200; // ml, 100 ml = 105 grams
        var totalWeigtMilk = milk * 105;
        System.out.println("totalWeigtMilk = " + totalWeigtMilk + " grams.");

        var icecreamPlombir = 2; // each bricet = 100 grams
        var totalWeightIcecreamPlombir = icecreamPlombir * 100;
        System.out.println("totalWeightIcecreamPlombir = " + totalWeightIcecreamPlombir + " gramms.");

        var eggs = 4; // 1 egg = 70 gramms
        var totalWeightEggs = eggs * 70;
        System.out.println("totalWeightEggs = " + totalWeightEggs + " grams.");

        var totalProductWeights = totalWeigtsBananas + totalWeigtMilk + totalWeightIcecreamPlombir + totalWeightEggs;
        System.out.println("totalProductWeights = " + totalProductWeights + " gramms.");
        // перевести граммы в кг, в 1 кг = 1000 грамм
        int grPerKg = 1000;
        float totalProductWeightsKg = totalProductWeights / (float)grPerKg;

        System.out.println("totalProductWeightsKg = " + totalProductWeightsKg + " kg.");
        { // Задача 4.
            var weightKg = 7; // нужно сбросить 7 кг
            var weightGr = weightKg * 1000;
            var days = weightGr / 250; //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе 250 грамм в день. 
            System.out.println("Потребуется = " + days + " дней, чтоб похудеть на 7 кг.");

            var days2 = weightGr/500; //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе 500 грамм в день.
            System.out.println("Потребуется = " + days2 + " дней, чтоб похудеть на 7 кг.");

            var day3 = (days+days2) / 2;
            System.out.println("Потребуется = " + day3 + " дней в среднем, чтобы добиться результата похудения");
            //может потребоваться дней в среднем, чтобы добиться результата похудения
        }
             { //Задача 5.
                 var masha = 67_760; // рублей в месяц
                 var denis = 83_690; //рублей в месяц
                 var cristy = 76_230;// рублей в месяц

                 // Каждому нужно увеличить зарплату на 10% от текущей месячной
                 var procent = 10;
                 var salaryIncrease = masha / procent;
                 var mashaSalary = masha + salaryIncrease;
                 System.out.println("Зарплата Маши после повышения = " + mashaSalary + " рублей");

                 var salaryIncrease1 = denis / procent;
                 var denisSalary = denis + salaryIncrease1;
                 System.out.println("Зарплата Дениса после повышения = " + denisSalary + " рублей");

                 var salaryIncrease2 = cristy / procent;
                 var cristySalary = cristy + salaryIncrease2;
                 System.out.println("Зарплата Кристины после повышения = " + cristySalary + " рублей");

                 //   Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения
                 var annualProfit = masha*12; // годовой доход до повышения
                 var annualProfitNew = mashaSalary*12; // годовой доход после повышения
                 var difannualProfit = annualProfitNew - annualProfit;
                 System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + difannualProfit + " рублей.");

                 var annualProfitDenis = denis*12; // годовой доход до повышения
                 var annualProfitNewDenis = denisSalary*12; // годовой доход после повышения
                 var difannualProfitDenis = annualProfitNewDenis - annualProfitDenis;
                 System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + difannualProfitDenis + " рублей.");

                 var annualProfitCristy = cristy*12; // годовой доход до повышения
                 var annualProfitNewCristy = cristySalary*12; // годовой доход после повышения
                 var difannualProfitCristy = annualProfitNewCristy - annualProfitCristy;
                 System.out.println("Кристина теперь получает " + cristySalary + " рублей. Годовой доход вырос на " + difannualProfitCristy + " рублей.");

             }

    }
}
