

import java.util.*;

public class functions {
    // public static void printmyname(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
        
    //     printmyname(name);//call kiya functio kko
    // }
//     public static int addition(int a, int b){
//         int sum = a + b;
//         System.out.println("addition is: " + sum);
//         return sum; ;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         addition(a,b); // function call kiya hai
//     }
// }
// multiplication function
    //   public static int multiplication(int a, int b){
    //     int sum = a * b;
    //     System.out.println("multiplication is: " + sum);
    //     return sum; 
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int b = sc.nextInt();
    //     multiplication(a,b); // function call kiya hai
    //     sc.close();
    // }
    // public static int factorial(int n){
    //     if(n == 0 || n == 1 || n < 0){
    //         return 1;
    //     }
    //     return n * factorial(n - 1);
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number to find its factorial: ");
    //     int n = sc.nextInt();
    //     int result = factorial(n);
    //     System.out.println("Factorial of " + n + " is: " + result);
    //     sc.close();
    // }
    // Function to calculate the average of three numbers
    // public static int average(int a,int b, int c){
    //     int sum = (a + b + c) / 3;
    //     return sum;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int a= sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int b = sc.nextInt();
    //     System.out.println("Enter third number: ");
    //     int c = sc.nextInt();   
    //     System.out.println("Average of " + a + ", " + b + ", and " + c + " is: " + average(a, b, c));
    //     sc.close();
    // }
    //sum of all odd numbers 1 till n
    // public static int sum (int n){
    //     int sum = 0;
    //     for(int i =1;i<=n;i++){
    //         if(i % 2 != 0){
    //             sum = sum + i;
    //         }
    //     }
    //     return sum;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int n=sc.nextInt();
    //     System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum(n));
    // }
    // greater of two numbers
    // public static int greater(int a, int b){
    //     if(a > b){
    //         return a;
    //     } else {
    //         return b;
    //     }
    // }
    // public static void main(String args[]){
    //     Scanner sc =new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int a=sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int b=sc.nextInt();
    //     System.out.println("Greater number is: " + greater(a, b));
    // }
    //Circumference of a circle
    // public static double circumference(double radius){
    //     return 2 * Math.PI * radius;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the radius of the circle: ");
    //     double radius = sc.nextDouble();
    //     System.out.println("Circumference of the circle is: " + circumference(radius));
    //     System.out.println("pi is: " + Math.PI);
    //     sc.close();
    // }
    //eligible to vote or not
    // public static boolean vote(int age){
    //     if (age >= 18){
    //         return true; // eligible to vote
    //     } else {
    //         return false; // not eligible to vote
    //     }
    //     }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter your age: ");
    //         int age = sc.nextInt();
    //         if(vote(age)){
    //             System.out.println("You are eligible to vote.");
    //         } else {
    //             System.out.println("You are not eligible to vote.");
    //         }
    //     }
    // infinity loop using do while loop
    // public static void loop(){
    //     int i = 1;
    //     do {
    //         System.out.println("This is an infinite loop. i = " + i);
    //         i++;
    //     } while (true); // This will create an infinite loop
    // }
    // public static void main(String args[]){
    //     System.out.println("Starting infinite loop...");
    //     loop(); // Call the infinite loop function
    // }


// Count positive, negative, and zero numbers

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;

//         char choice;
//         do {
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();

//             if (n > 0) {
//                 positiveCount++;
//             } else if (n < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }

//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = sc.next().charAt(0);
//         } while (choice == 'y' || choice == 'Y');

//         System.out.println("Count of positive numbers: " + positiveCount);
//         System.out.println("Count of negative numbers: " + negativeCount);
//         System.out.println("Count of zeros: " + zeroCount);

//         sc.close();
//     }
// }
// x raised to n
// public static int power(int x, int n){
//     int sum = 1;
//     for(int i = 1; i <= n; i++){
//         sum = sum * x;
//     }
//     return sum;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the value of x = ");
//     int x=sc.nextInt();
//     System.out.println("enter the value of n = ");  
//     int n=sc.nextInt();
//     System.out.println("x raised to n is: " + power(x, n));
// }
// gcd of two numbers
// public static int gcd(int n1, int n2){
//     int gcd=1;
//     for (int i =1;i<= Math.min(n1, n2);i++)
//     if (n1 % i == 0 && n2 % i == 0){
//         gcd = i;
//     }
//     return gcd;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the value of n1 = ");
//     int n1=sc.nextInt();
//     System.out.println("enter the value of n2 = ");  
//     int n2=sc.nextInt();
//     System.out.println("GCD of " + n1 + " and " + n2 + " is:"  + gcd(n1, n2));
// }
//fibonacci series
public static int fibonacci(int n) {
    int sum=0;
    
    for(int i = 0 ; i<=n;i++){    
        sum = (i-1) + (i - 2);
        sum++;
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms in the Fibonacci series: ");
    int n = sc.nextInt();
    System.out.println("Fibonacci series: " + fibonacci(n));
    
}
}

