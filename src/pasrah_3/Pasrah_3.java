/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasrah_3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pasrah_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = 0;
    
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        for(int r =1; r <= angka; r++){
            jumlah += r;
            System.out.println("Jumlah = "+jumlah);
        }
                
    }
    
}
