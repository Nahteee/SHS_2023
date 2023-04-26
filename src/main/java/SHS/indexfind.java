/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHS;

/**
 *
 * @author User
 */
public class indexfind {
    public static int findIndex(String arr[], String t)
    {
  
        // if array is Null
        if (arr == null) {
            return -1;
        }
  
        // find length of array
        int len = arr.length;
        int i = 0;
  
        // traverse in the array
        while (i < len) {
  
            // if the i-th element is t
            // then return the index
            if (arr[i] == null ? t == null : arr[i].equals(t)) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
