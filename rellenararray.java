/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;

/**
 *
 * @author Ana
 */
import java.util.Random;
public class rellenararray {

    int[] array = new int[10];

    public void rellenararray() {
        Random entrada = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt(20) + 1; 
        }
    }
    
    	public void sumararray() {
    	int suma = 0;
    	for (int i = 0; i < array.length; i++) {
        	suma += array[i];
    	}
    	System.out.println("Suma total: " + suma);
	}
	
	public void nuevometodo2() {
    System.out.println("Metodo 2");
	}

}

