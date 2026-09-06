
public class Hollow_Rectangle {
    
    public static void printing_patten(int totalrow, int totalcol){

        //outerloop
        for(int i = 1; i<=totalrow ; i++){
            //innerloop
            for(int j=1; j<=totalcol ; j++){

                //condition
                if(i==1 || i==totalrow || j==1 || j==totalcol){
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
        
        printing_patten(4,5);

    }
    
}
