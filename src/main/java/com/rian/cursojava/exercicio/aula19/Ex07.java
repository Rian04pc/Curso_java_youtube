/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex07 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] B = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        int[] C = new int[10];

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println("Posição " + i + "° : " + C[i]);
        }

    }

}