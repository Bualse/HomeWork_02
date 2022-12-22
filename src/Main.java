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
        var differenceWeight = twoFightWeiht - oneFightWeiht;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");


    }
}