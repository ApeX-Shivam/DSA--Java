/**
 * Solid_Rhombus
 */
public class Solid_Rhombus {
    public static void print_patten(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        print_patten(4);
        
    }
}