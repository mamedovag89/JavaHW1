/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */

 /**
  * task1
  */



import java.util.Scanner;



 public class task1 {
 
    public static void main(String[] args) {
       
        Scanner num = new Scanner(System.in);
        int n;
        System.out.printf("Enter number:");
        n = num.nextInt();
        System.out.println("Number"  + factorial(n));

    }
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i<=n; i++){
            result = result* i;

        }
        return result;
    }
 }