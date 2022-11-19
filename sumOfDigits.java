import java.util.*;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plase Enter a Number:");
        int Digit = sc.nextInt();
        System.out.println("the Sum of Digits :"+sumDigit(Digit));
    }
   
    public static int sumDigit(int Digit){
        int  sumOfDigit = 0;
        while (Digit > 0){
            int lastDigit = Digit%10;
            sumOfDigit = sumOfDigit + lastDigit;
            Digit = Digit/10;
        }
        return sumOfDigit;

    }
}
