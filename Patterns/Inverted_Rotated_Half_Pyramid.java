/**
 * Inverted_Rotated_Half_Pyramid
 */
public class Inverted_Rotated_Half_Pyramid {

    public static void print_pattern(int n){
        //outerloop
        for(int i=1; i<=n; i++){
            //inner loop for spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        print_pattern(4);
    }

}