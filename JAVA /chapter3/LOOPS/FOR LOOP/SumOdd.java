public class SumOdd {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 15; i += 2) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

    }
}