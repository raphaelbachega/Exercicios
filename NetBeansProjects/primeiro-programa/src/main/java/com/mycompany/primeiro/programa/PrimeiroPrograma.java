/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeiro.programa;

import java.util.Scanner;

/**
 *
 * @author Raphael Bachega
 */
public class PrimeiroPrograma {
    
    public static void main(String[] args){
        String nome, turma;
        Integer num1, num2, soma;
        Double nota, notaContinuada = 7.5;
        
        
        System.out.print("Boa noite!\t\t");
        System.out.println("Tudo bem?");
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = leitor.nextLine();
        System.out.println("Como vai, " + nome +"?");
        
        System.out.println("Digite um número");
        num1 = leitor.nextInt();
        System.out.println("Digite outro número");
        num2 = leitor.nextInt();
        soma = num1 + num2;
        System.out.println("A soma é " + soma);
        System.out.println("A multiplicação é " + (num1*num2));
        
        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble();
        System.out.println("Sua nota é " + (nota+notaContinuada)/2);
        Scanner leitorS = new Scanner(System.in);
        System.out.println("Digite a sua turma");
        turma = leitorS.nextLine();
    }
    
}
