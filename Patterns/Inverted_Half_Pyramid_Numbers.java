/**
 * Inverted_Half_Pyramid_Numbers
 */
public class Inverted_Half_Pyramid_Numbers {

    public static void print_pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(4);
    }
}