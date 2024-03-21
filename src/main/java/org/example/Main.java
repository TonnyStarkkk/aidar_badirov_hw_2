import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();
            String result = permission(age, temperature);
            System.out.println("Возраст: " + age + " лет, Температура: " + temperature + " градусов -> " + result);
        }
    }

    public static String permission(int age, int temperature) {
        if ((age > 20 && age < 45 && temperature > -20 && temperature < 30) ||
                (age < 20 && temperature > 0 && temperature < 28) ||
                (age > 45 && temperature > -10 && temperature < 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(101); // генерация случайного числа от 0 до 100
    }

    public static int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(51) - 30; // генерация случайного числа от -30 до 20
    }
}


