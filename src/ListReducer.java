import java.util.List;
import java.util.function.BinaryOperator;


public class ListReducer {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Сумма чисел
        int sum = reduce(numbers, Integer::sum, 0);
        System.out.println("Sum: " + sum); // Output: 15

        // Произведение чисел
        int product = reduce(numbers, (i, j) -> i * j, 1);
        System.out.println("Product: " + product); // Output: 120
    }

    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }
}