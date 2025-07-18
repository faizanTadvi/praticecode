public class recursion1{
    public static void printnumber(int n){
        if(n == 0){              //BASE
            return;
        }
        System.out.println(n); //Print number 5
        printnumber (n-1);    // Recursion
    }
    public static void main(String args[]){
        int n = 5;
        printnumber(n);
    }

}