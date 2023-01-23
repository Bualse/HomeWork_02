public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача № 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача № 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача № 3");
        double dog = 8;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача № 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача № 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача № 6");
        var oneFightWeiht = 78.2;
        var twoFightWeiht = 82.7;
        var totalWeight = oneFightWeiht + twoFightWeiht;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");
        var differenceWeight = twoFightWeiht - oneFightWeiht;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");
    }

    public static void task7() {
        System.out.println("Задача № 7");
        var oneFightWeiht = 78.2;
        var twoFightWeiht = 82.7;
        var differenceWeight1 = twoFightWeiht - oneFightWeiht; // способ вычитания
        System.out.println("Разница между весами бойцов " + differenceWeight1 + " кг.");
        var differenceWeight2 = twoFightWeiht % oneFightWeiht; // способ остаток деления
        System.out.println("Разница между весами бойцов " + differenceWeight2 + " кг.");
    }

    public static void task8() {
        System.out.println("Задача № 8");
        var totalWorkTime = 640;
        var workEachStaffer = 8;
        var totalStaffersInCompany = totalWorkTime / workEachStaffer;
        System.out.println("Всего работников в компании - " + totalStaffersInCompany + " человек.");

        var totalStaffersInCompany2 = totalStaffersInCompany + 94; // если а компании работает на 94 чел больше
        var totalWorkTime2 = totalStaffersInCompany2 * 8;
        System.out.println("Если в компании работает " + totalStaffersInCompany2 + " человека, то всего " + totalWorkTime2 + " часа работы может быть поделено между сотрудниками");


    }
}