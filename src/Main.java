import java.util.ArrayList;
import java.util.List;

public class Main {
    
    // Метод для нахождения максимума в списке
    public static Integer findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // Тестируем метод
        List<Integer> numbers = List.of(1, 5, 3, 9, 2);
        Integer max = findMax(numbers);
        System.out.println("Максимальное значение: " + max);
    }
}
