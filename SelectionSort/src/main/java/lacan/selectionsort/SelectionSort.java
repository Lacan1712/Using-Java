/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.selectionsort;
import java.math.*;
/**
 *
 * @author lacan
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for(int i = 0;i<v.length;i++){
            v[i] = (int) (Math.random()*100);
            System.out.println(v[i]);
        }
        System.out.println("-----------------------------");
        int menor,aux; 
        for (int i = 0; i < v.length; i++) {
            menor = i;
            for (int j = i+1; j < v.length; j++) {
                if(v[j]<v[menor]){
                    menor = j;
                }
            }
            aux = v[menor];
            v[menor] = v[i];
            v[i] = aux;
            System.out.println(v[i]);
        }
    }
    
}
