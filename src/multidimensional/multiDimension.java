/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multidimensional;

/**
 *
 * @author User
 */
public class multiDimension {
    public static void main(String[] args){
        
       int values [][] = {
           {10, 20, 30},
           {70, 90, 11},
           {30, 67, 69}};
       
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
