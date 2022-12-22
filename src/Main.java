public class Main {
    public static void main(String[] args) {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
// Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
// Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
// Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

// Задание 6
        var oneFightWeiht = 78.2;
        var twoFightWeiht = 82.7;
        var totalWeight = oneFightWeiht + twoFightWeiht;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");
        var differenceWeight = twoFightWeiht - oneFightWeiht; // первый способ по Заданию 7 такой же как и этот
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");

// Задание 7
        var differenceWeight1 = twoFightWeiht - oneFightWeiht;
        System.out.println("Разница между весами бойцов " + differenceWeight1 + " кг.");
        var differenceWeight2 = twoFightWeiht % oneFightWeiht;
        System.out.println("Разница между весами бойцов " + differenceWeight2 + " кг.");

// Задание 8
        var totalWorkTime = 640;
        var workEachStaffer = 8;
        var totalStaffersInCompany = totalWorkTime / workEachStaffer;
        System.out.println("Всего работников в компании - "  + totalStaffersInCompany + " человек.");
        var totalStaffersInCompany2 = totalStaffersInCompany + 94;
        var totalWorkTime2 = totalStaffersInCompany2 * 8;
        System.out.println("Если в компании работает " + totalStaffersInCompany2 + " человек, то всего " + totalWorkTime2 + " часов работы может быть поделено между сотрудниками");





    }
}