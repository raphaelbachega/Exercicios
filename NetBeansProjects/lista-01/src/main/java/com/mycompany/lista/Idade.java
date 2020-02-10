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
public class Idade {
    public static void main(String[] args) {
        String nome;
        Integer num,ano;
        
        
        System.out.println("Digite seu nome:");
        Scanner leitor = new Scanner(System.in);
        nome = leitor.nextLine();
        System.out.println("Olá "+ nome +"! Qual o ano que voce nasceu?");
        Scanner leitor1 = new Scanner(System.in);
        num = leitor1.nextInt();
        ano = (2030 - num);
        System.out.println("Em 2030 você tera "+ ano + " anos!");
        
        
        
        
    }
}
