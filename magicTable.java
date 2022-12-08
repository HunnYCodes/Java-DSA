import java.rmi.server.SocketSecurityException;

import javax.swing.SpringLayout;

public class magicTable {
    public static void hollow_Rectangle(int totRows, int totCols){
        for (int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1||j==1||i==totRows||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void inverted_Rotated_Half_Pyramind (int n){
       
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                
                    System.out.print(" ");
                }
                for(int j=1 ; j<=i; j++){
                    System.out.print("*");
                }
            
            System.out.println(" ");
        }
    }

    public static void floyd_Tri(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println(" ");
        }
    }

    public static void zeroOne_tri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }

    }

    public static void butterFly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void solid_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void hollow_Rhombus(int totRows, int totCols){
        for (int i=1; i<=totRows; i++){
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=totCols; j++){
                if(i==1||j==1||i==totRows||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        // inverted_Rotated_Half_Pyramind(4);
        // hollow_Rectangle(4,5);
        // floyd_Tri(5);
        // zeroOne_tri(5);
        // butterFly(4);
        solid_Rhombus(5);
        hollow_Rhombus(5,6);
    }

   

    
}
