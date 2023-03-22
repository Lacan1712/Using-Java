/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.bubblesort;
import java.math.*;
/**
 *
 * @author lacan
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for(int i = 0; i<v.length;i++){
            v[i] = (int) (Math.random() * v.length);
            System.out.println(v[i]);
        }
        //Bubble Sort método de ordenação
        System.out.println("--------------------------------");
        
        for(int i = 0; i<v.length;i++){
            for(int j = i+1; j<v.length;j++){
                if(v[i]>v[j]){
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
            System.out.println(v[i]);
        }
    }
}
