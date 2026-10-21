/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

/**
 *
 * @author User
 */
public class linearSearch {
    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        
        int arr[] = {33,67,45,1,99};
        int result = search(arr,1);
        
        if (result >= 0){
            System.out.println("Fount at index" + result + " = " + arr[result]);
        }else{
            System.out.println("Element not found");
        }
       
    }
}
