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

    public class Calculadora {
    public static void main(String[] args) {
        Double num,num1,soma,subtracao,multiplicacao,divisao;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor:");
        num = leitor.nextDouble();
        System.out.println("Digite outro valor:");
        num1 = leitor.nextDouble();
        
        soma = (num+num1);
        subtracao = (num-num1);
        multiplicacao = (num*num1);
        divisao = (num/num1);
        
        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + subtracao);
        System.out.println("A multiplicação é " + multiplicacao);
        System.out.println("A divisão é " + divisao);
              
       
        
    }
}


