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

}

