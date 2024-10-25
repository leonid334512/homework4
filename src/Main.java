//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1

        int age = 14;
        if (age <= 18) {
            System.out.println("Ты несовершеннолетний");
        } else {
            System.out.println("Ты совершеннолетний");
        }

        // Задача 2

        int temperature = 14;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3

        int speed = 61;
        if ( speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        // Задача 4

        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >=7 && age <=17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }

        // Задача 5

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " он может кататься в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " он может кататься без сопровождения");

        }

        // Задача 6

        int mest = 102;
        int sedentary = 60;
        int standing = mest - sedentary;
        if (sedentary < 60 && standing > 42) {
            System.out.println("В вагоне есть и стоячие и сидячие места");
        } else if (sedentary > 60 && standing < 42) {
            System.out.println("В вогоне есть только стоячие места");
        } else if (sedentary >= 60 && standing >= 42) {
            System.out.println("В вогонет нет свободных мест");
        }

        // Задача 7

        int one = 90;
        int two = 100;
        int three = 70;
        if (one > two && one > three) {
            System.out.println("Первое число больше второго и третьего");
        } else if (two > one && two > three) {
            System.out.println("Второе число больше первого и третьего");
        } else if (three > one && three > two) {
            System.out.println("Третье число больше первого и второго");
        } else if (one == two && two == three){
            System.out.println("Все числа равны");
        }
    }
}