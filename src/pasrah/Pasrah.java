/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasrah;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pasrah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bilangan_1;
        int bilangan_2;

        System.out.print("Bilangan 1 = ");
        bilangan_1 = input.nextInt();

        System.out.print("Bilangan 2 = ");
        bilangan_2 = input.nextInt();

        if (bilangan_1 < bilangan_2) {
            System.out.println("Bilangan yang lebih besar = " + bilangan_2);
        } else {
            System.out.println("Bilangan yang lebih besar = " + bilangan_1);
        }
    }

}
