/**
 * Zero_One_Triangle
 */
public class Zero_One_Triangle {


    public static void print_pattern(int n){

        //outer loop
        for(int i=1; i<=n; i++){

            //inner loop
            for(int j=1; j<=i;j++){
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(5);
    }
}
