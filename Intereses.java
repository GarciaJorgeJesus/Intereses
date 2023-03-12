/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intereses;

/**
 *
 * @author tracher
 */
import java.util.Scanner;

public class Intereses {

    public static void main(String[] args) {

        double capital, tasa, intereses, capitalTotal;
        int dias;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce el capital: ");
        capital = scanner.nextDouble();

        System.out.print("Introduce la tasa de interés: ");
        tasa = scanner.nextDouble();

        System.out.print("Introduce el número de días: ");
        dias = scanner.nextInt();

        
        intereses = (capital * tasa * dias) / (36000);
        capitalTotal = capital + intereses;

        
        System.out.println("Intereses producidos: " + intereses);
        System.out.println("Capital total acumulado: " + capitalTotal);

        scanner.close();
    }
}

