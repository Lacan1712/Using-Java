/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.insertionsort;
import java.math.*;
/**
 *
 * @author lacan
 */
public class InsertionSort {
    public static void main(String[] args) {
        int aux,j;
        int[] v = new int[10];
        for(int i = 0;i<v.length;i++){
            v[i] = (int) (Math.random() * 100);
            System.out.println(v[i]); 
        }
        
        System.out.println("--------------------------");
        
        for(int i = 1;i<v.length;i++){
            aux = v[i];
            j = i-1;
            while(j >= 0 && v[j]>aux){
                v[j+1] = v[j];
                j--;
            }
            v[j+1]=aux;
        }   
        for(int i = 1;i<v.length;i++){
            System.out.println(v[i]);
        }
    }
}
