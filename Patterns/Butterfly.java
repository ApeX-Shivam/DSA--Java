/**
 * Butterfly
 */
public class Butterfly{

    public static void print_pattern(int n){

        //outer loop-1st half
        for(int i=1;i<=n; i++){

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop-2nd half
        for(int i=n;i>=1;i--){
             //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(5);
    }
}