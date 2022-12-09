import java.util.*;

public class arrays{
    public static void main(String[] args){
        int marks[] = new int[100];
        System.out.println(marks.length);
        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextByte();
        marks[1] = sc.nextByte();
        marks[2] = sc.nextByte();

        
        System.out.println("phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);
        
    }
}