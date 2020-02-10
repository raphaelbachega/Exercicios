/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author Raphael Bachega
 */
public class Elevador {
    public static void main(String[] args) {
        Double peso, pessoa1,pessoa2,pessoa3,pessoas;
        Integer num;
        
        System.out.println("Digite o limite de peso do elevador:");
        Scanner leitor = new Scanner(System.in);
        peso = leitor.nextDouble();
        System.out.println("Digite o Limite de pessoas no elevador:");
        Scanner leitor1 = new Scanner(System.in);
        num = leitor1.nextInt();
        
        System.out.println("Qual o peso da primeira pessoa no elevador?");
        pessoa1 = leitor.nextDouble();
        
        System.out.println("Qual o peso da segunda pessoa no elevador?");
        pessoa2 = leitor.nextDouble();
        
        System.out.println("Qual o peso da terceira pessoa no elevador?");
        pessoa3 = leitor.nextDouble();
        pessoas = (pessoa1+pessoa2+pessoa3);
        
        
        System.out.println("Entraram 3 pessoas no elevador no qual cabem"+ num +"pessoas. O peso total no elevador é de "+ peso +".Sendo que ele suporta "+ pessoas +".");
        
    }
}
