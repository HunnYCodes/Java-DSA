import java.util.Scanner;
public class solution {
    public static void  main(String args[]){
        
        System.out.println("plz Enter number:");
        Scanner sc= new Scanner(System.in);
        int palindrome = sc.nextInt();

         if(isPalindrome(palindrome)){
            System.out.println("Number:"+palindrome+"is palindrome");
           }else{
            System.out.println("Number:"+palindrome+"is not palindrome");
           }
                    
    }

        public static boolean isPalindrome(int number){
            int palindrome = number;
            int rev = 0;
           while(palindrome !=0){
            int rem = palindrome%10;
            rev = rev*10 + rem;
            palindrome = palindrome/10;
           }

            if (number ==rev){
            return true;
            }
            return false;
            
        } 

    }

