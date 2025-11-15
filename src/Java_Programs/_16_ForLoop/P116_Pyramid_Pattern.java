package Java_Programs._16_ForLoop;

import java.util.Scanner;

public class P116_Pyramid_Pattern {
    
//          *                     // 9 spaces, 1 star
//         * *                    // 8 spaces, 2 stars
//        * * *                   // 7 spaces, 3 stars
//       * * * *                  // 6 spaces, 4 stars
//      * * * * *                 // 5 spaces, 5 stars
//     * * * * * *                // 4 spaces, 6 stars
//    * * * * * * *               // 3 spaces, 7 stars
//   * * * * * * * *              // 2 spaces, 8 stars
//  * * * * * * * * *             // 1 spaces, 9 stars
// * * * * * * * * * *            // 0 spaces, 10 stars
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){ //first loop
            for(int j=1;j<=n-i;j++){ //loop for spaces
                //print space till n-i positions, including for a row
                System.out.print(" ");
            }
            //it's inside the first loop
            int c=1; //c will be initialised to 1 only all the time
            for(int k=1;k<2*n&&c<=i;k++){ //loop for * //i=2,k=1,k<20,c<=2
                //k will be less than 2*n not 2*i, and c will be less than or equal to the ith row 
                if(k%2!=0){ //this is to increase the c value for odd values of k 
                    System.out.print("*"); //for odd values we will print * like 1
                    c++;
                }else{
                    System.out.print(" "); //to give space in between
                }
            }
            System.out.println();
        }
    }
}
