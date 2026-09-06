/**
 * FLOYDS_Triangle
 */
public class FLOYDS_Triangle {

    public static void print_pattern(int n){

        int num =1;
        //outer loop
        for(int i=1; i<=n; i++){

            //inner loop
            for(int j=1; j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(5);
    }
}