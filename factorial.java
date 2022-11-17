public class factorial {
    public static int fectorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){ 
          f *= i;
           
        }
        return f ;
    }
    public static void main(String[] args){
        System.out.println(fectorial(4));
    }
}
