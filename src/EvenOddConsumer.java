import java.util.function.Consumer;

public class EvenOddConsumer {
    public static void main(String[] args) {
        Consumer<Integer> numberConsumer = num -> {
            if (num % 2 == 0) {
                System.out.println("Четное число: " + num);
            } else {
                System.err.println("Нечетное число: " + num);
            }
        };

        // Пример использования
        numberConsumer.accept(10); // Четное число
        numberConsumer.accept(7);  // Нечетное число
    }
}