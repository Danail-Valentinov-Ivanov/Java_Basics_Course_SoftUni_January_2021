package lab6_Nested_Loops;

public class task2_Multiplication_Table {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%d * %d = %d\n", i, j, result);
            }
        }
    }
}
