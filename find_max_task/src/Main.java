import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
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
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество элементов в массиве: ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Количество элементов должно быть положительным!");
            return;
        }
        
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Введите " + count + " элементов:");
        for (int i = 0; i < count; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        
        Integer max = findMax(numbers);
        
        if (max != null) {
            System.out.println("Максимальное значение в массиве: " + max);
        } else {
            System.out.println("Не удалось найти максимальное значение");
        }
        
        scanner.close();
    }
}
