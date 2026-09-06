/**
 * Diamond
 */
public class Diamond {

    public static void print_pattern(int n){
        //outer loop-1st half
        for(int i=1; i<=n; i++){
            //inner loop-spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop-2nd half
        for(int i=n; i>=1; i--){
            //inner loop-spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(4);
    }
}