import java.util.Scanner;

public class BillWithGST {

    static void calculateBill(double billAmount, double gstPercentage) {
        double gst = (billAmount * gstPercentage) / 100;
        double totalAmount = billAmount + gst;

        System.out.println("GST = " + gst);
        System.out.println("Total Amount = " + totalAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double billAmount = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double gstPercentage = sc.nextDouble();

        calculateBill(billAmount, gstPercentage);
    }
}