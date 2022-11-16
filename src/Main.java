public class Main {
    public static void main(String[] args) {
        System.out.println(walk(23, 15));
        System.out.println(walk(15, 27));
        System.out.println(walk(60, 3));
        System.out.println(walk(13, 33));
        System.out.println(walk(25, 22));
    }
    public static String walk(int age, int temp) {
        if (age >= 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp >= 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp<25) {
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }

    }
}
