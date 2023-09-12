public class forLoop {
    public static void main(String[] args) {
        
/* 
        for (int i=0; i<5 ; i++){

            System.out.println(i);
        }
//nested loop

        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer: " + i); 
            
            // Inner loop
            for (int j = 1; j <= 5; j++) {
              System.out.println(" Inner: " + j); 
            }
        }

        //for each solo para arrays
        String [] pais = {"Argentina" , "Venezuela" , "Uruguay"} ;
        
        for (String i : pais){
            System.out.println(i);
        }
*/
        // break en un loop / continue

        for (int i = 0 ; i<10 ; i ++ ){
            if(i == 4){

                continue;
            }
        System.out.println(i);
        }
 }

}
