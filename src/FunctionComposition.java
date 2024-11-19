import java.util.function.Function;

public class FunctionComposition{

    public static void main(String[] args) {
        // Определяем три функции
        Function<Integer, Integer> f1 = x -> x * 10;                // Умножает на 10
        Function<Integer, String> f2 = x -> "<<" + x + ">>";        // Преобразует в формат "<<123>>"
        Function<String, Integer> f3 = String::length;              // Считает количество символов в строке

        // 3.a) Композиция функций f1 -> f2 -> f3
        Function<Integer, Integer> composite1 = f1.andThen(f2).andThen(f3);
        System.out.println("Result f1 -> f2 -> f3: " + composite1.apply(777)); // Output: 8

        // 3.б) Композиция функций f3 -> f1 -> f2
        Function<String, String> composite2 = f3.andThen(f1).andThen(f2);
        System.out.println("Result f3 -> f1 -> f2: " + composite2.apply("Hello!")); // Output: "<<60>>"
    }
}
