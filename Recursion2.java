// --------------------------------
// // here we have print the 5-1
// public class Recursion2{

//     public static void printNumbers(int n) {
//         if(n == 0) {
//             return;
//         }   
    
//         System.out.println(n);
//         printNumbers(n-1);
//     }

//     public static void main(String args[]){
//         int n = 5;
//         printNumbers(n);
//     }

// }
// // output
// // 5
// // 4
// // 3
// // 2
// // 1



// --------------------------------------

// //here we will print the 1-5 by using recursion
// public class Recursion2{

//     public static void printNumbers(int n) {
//         if(n == 6) {
//             return;
//         }   
    
//         System.out.println(n);
//         printNumbers(n+1);
//     }
//     public static void main(String args[]){
//         int n = 1;
//         printNumbers(n);
//     }
// }

//-------------------------------------------------

//to sum of n natural numbers
// public class Recursion2{

//     public static void printsum(int i, int n, int sum) {
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printsum(i+1, n, sum);
//     }
//     public static void main(String args[]){
//         printsum(1, 5, 0);
//     }
// }


// //-------------------------------------------------
// // print factorial of a number n
// public class Recursion2{

//     public static int calfactorial(int n) {
//         if(n == 1 || n == 0){
//             return 1;
//         }

//         int fact_nm1 = calfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;

//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = calfactorial(n);
//         System.out.println(ans);
//     }
// }


// // -------------------------------------------------
// // print the febnaci sequence till nth term
// public class Recursion2{
//     public static void printFib(int a, int b, int n) {
//         if(n == 0){
//             return;
//         }
//         int c = a + b;
//         System.out.print(c+",");
//         printFib(b, c, n-1);
//     }
//     public static void main(String args[]){
//         int a = 0, b = 1;
//         System.out.print(a+","+b+",");
//         // System.out.println(b);
//         int n = 7;  //this is how many terms you want to print
//         printFib(a,b,n-2);  //here we put the n-2 because we have already used the 2 terms    
//     }
// }


// -------------------------------------------------
// print x^n (stack height = n)
public class Recursion2{
    public static void printFib(int a, int b, int n) {

    }
    public static void main(String args[]){

    }
}
