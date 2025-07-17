import java.util.Scanner;

public class bits {
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter a number: ");
    //     int num = sc.nextInt();

    //     if (num <= 0) {
    //         System.out.println("It is not a power of two");
    //     } else {
    //         // (num & (num-1)) == 0 checks if num is a power of two
    //         if ((num & (num - 1)) == 0) {
    //             System.out.println("It is a power of two");
    //         } else {
    //             System.out.println("It is not a power of two");
    //         }
    //     }
    //     sc.close();
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter a number: ");

    //     int num = sc.nextInt();

    //     int tot = Integer.bitCount(num);

    //     System.out.println("total count of set bits = " + tot);

    // }
   
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter 1 to convert binary to decimal, 2 to convert decimal to binary:");
    //     int choice = sc.nextInt();
    //     sc.nextLine(); // consume newline

    //     if (choice == 1) {
    //         System.out.print("Enter a binary number: ");
    //         String binaryStr = sc.nextLine();
    //         int decimal = Integer.parseInt(binaryStr, 2);
    //         System.out.println("Decimal number is = " + decimal);
    //     } else if (choice == 2) {
    //         System.out.print("Enter a decimal number: ");
    //         int num = sc.nextInt();
    //         String binary = Integer.toBinaryString(num);
    //         System.out.println("Binary number is = " + binary);
    //     } else {
    //         System.out.println("Invalid choice.");
    //     }

    //     sc.close();
    // }
    public static void main(String args[]){
    int a = 10;
    int b = 20;

    int temp = a;
    a = b ;
    b = temp;
    System.out.println(a);
    System.out.println(b);
}
}
