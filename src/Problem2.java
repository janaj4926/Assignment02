/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author janaj4926
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Type in the number of levels in the triangle");
        int levels = in.nextInt();
        int numOfBalls = triangle(levels);
        System.out.println("There will be " + numOfBalls);
    }
    static int triangle(int n){
        //if 0 = 0, the answer is 0
        if (n == 0){
            return 0;
        }
        //if 1=1, the answer is 1
        if (n == 1){
            return 1;
        }else{
            //finding the amount in the level before
            return triangle(n-1) + n;
        }
    }
}
