

public class conversion{
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum +(lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;

        }

System.out.println("decimal of " + myNum + "=" + decNum);
    }

    public static void decToBin(int decNum){
        int myNum = decNum;
       int  pow = 0;
       int bin  = 0;
       while(decNum>0){
        int rem = decNum%2;
        bin = bin + rem * (int)Math.pow(10, pow);
        pow++;
        decNum = decNum/2;
       }
       System.out.println("Binary Number of " +myNum+ "="+bin);
    }
    public static void main (String[] args){
        binToDec(101);
        decToBin(5);
    }
}