public class patterns {
    
    public static void main(String args[]){
        // inverted half pyramid with numbers
        int n = 5;
        int number = 1;
        //outer loop for rows
        for(int i = n; i >= 1; i--){
            //inner loop for columns
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // // hollow rectangle pattern
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     //inner loop for columns
        //     for(int j= 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop for stars
        //     for(int j = 1; j<=n; j++){
        //         if(j == 1 || j == n || i == 1 || i == n){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    //     // hollow butterfly patternint
    //     int n=5;
    //     //upper half of the butterfly
    //     for(int i=1;i<=n;i++){
    //         //left stars
    //         for(int j =1;j<=i;j++){
    //             if(j==1 || j==i){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         for(int k=1;k<=2*(n-i);k++){
    //             System.out.print(" ");

    //         }
    //         for(int l =1;l<=n;l++){
    //             if(l==1 || l==i){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
            
        
    //     System.out.println();
    // }
    // //lower half of the butterfly
    // for(int i=n;i>=1;i--){
    //         //left stars
    //         for(int j =1;j<=i;j++){
    //             if(j==1 || j==i){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         for(int k=1;k<=2*(n-i);k++){
    //             System.out.print(" ");

    //         }
    //         for(int l =1;l<=n;l++){
    //             if(l==1 || l==i){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
            
        
    //     System.out.println();
    // }


        // // diamond pattern
        // int n = 4;
        // //upper half of the diamond
        // for(int i=1; i<=n;i++){
        //     for(int j= 1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower half of the diamond
        // for(int i=n; i>=1;i--){
        //     for(int j= 1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // diamond pattern
        // int n = 8;
        // //upper half of the diamond
        // for(int i = 1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //lower half of the diamond
        // for(int i=n;i>=1;i--){
        //     //spaces
        //     for(int j= n-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    
        //butterfly pattern
        // int n = 5;

        // //upper half of the butterfly
        // for(int i = 1; i<=n; i++){
        //     //left stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     int spaces = 2 * (n - i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part of the butterfly
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower half of the butterfly
        // for(int i = n; i>=1; i--){
        //     //left stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     int spaces = 2 * (n - i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part of the butterfly
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
            
        // // // solid rhombus
        // int n = 5;
        // // //outer loop for rows
        // for(int i = 1; i<=n; i++){
        //     //inner loop for spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop for stars
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // 0-1 triangle
        // int n = 5;
        // int number = 1;

        // //outer loop for rows
        // for(int i=1; i<=n; i++){
        //     //inner loop for columns
        //     for (int j=1; j<=i; j++){
        //         int sum = i + j;
        //         // check if sum is even or odd
        //         if(sum % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        // floyds triangle
        // int n = 5;
        // int number = 1;
        
        // //outer loop for rows
        // for(int i=1; i<=n; i++){
        //     //inner loop for columns
        //     for (int j=1; j<=i; j++){
        //         System.out.print( number+" ");  
        //         number++;  
        //     }
        //     System.out.println();
        // }
        // // half pyramid with numbers
        // int n = 5;
        // //outer loop for rows
        // for(int i = 1; i<=n; i++){
        //     //inner loop for columns
        //     for(int j= 1; j<=n-i+1; j++){
        //         System.out.print(j + " ");
        //     }             
        //    System.out.println();
        // }
        // // inverted half pyramid
        // int n = 4;
        // //outer loop for rows
        // for(int row = 1; row<=n; row++){
        //     //inner loop for columns
        //     for(int column=1; column<=n-1; column++){
        //         System.out.print(" ");
        //     }
        //     //inner loop for stars
        // for(int column = 1; column<=row;column++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        
        // }
        // half pyramid

        // int n = 10;
        // //outer loop for rows
        // for(int i = 1; i<=n; i++){
        //     //inner loop for columns
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println( );
        // }
        
        //hollow rectangle
        // int n = 4;
        // int m = 5;

        // //outer loops for rows
        // for(int i = 1; i<=n; i++){
        //     //inner loop for columns
        //     for(int j= 1; j<=m; j++){
        //         if(i == 1 || i == n || j == 1 || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //solid rectangle
        // int n = 4;
        // int m = 5;

        // //outer loop for rows
        // for(int i = 1;i<=n; i++){
        //     //inner loop for columns
        //     for(int j=1;j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
           

    }
}
