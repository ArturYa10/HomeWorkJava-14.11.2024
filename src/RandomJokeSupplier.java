import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomJokeSupplier {
    public static void main(String[] args) {
        List<String> jokes = List.of(
                "Анекдот 1: Встречаются два программиста...",
                "Анекдот 2: Что сказал один бит другому?",
                "Анекдот 3: Почему программисты не любят природу? Потому что в ней слишком много багов.",
                "Анекдот 4: Зачем программист пошел на рынок? За фруКТОм!",
                "Анекдот 5: Программисты тоже плачут, когда забывают сохранить код."
        );

        Supplier<String> randomJoke = () -> jokes.get(new Random().nextInt(jokes.size()));

        // Пример использования
        System.out.println("Случайный анекдот: " + randomJoke.get());
    }
}