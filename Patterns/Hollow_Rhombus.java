/**
 * Hollow_Rhombus
 */
public class Hollow_Rhombus {

    public static void print_pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow-rectangle logic
            
            for(int j=1; j<=n ; j++){

                //condition
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        
        }
    }
    public static void main(String[] args) {
        print_pattern(5);
    }
}