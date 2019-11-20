/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_4;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Taboa {
    private int numero;
    Scanner sc=new Scanner(System.in);
    
    public Taboa(){
    }
    public Taboa(int nume){
    numero=nume;
    }
    public void setNumero(int nume){
      numero=nume;
        
        
    }
    public int getNumero(){
        return numero;
    }
    public int pedirNumero(){
        System.out.println("escribe un numero");
        return sc.nextInt();
    }
    public void Multiplicacion(){
        int nume;
        nume=pedirNumero();
        while(nume!=0){
            for(int i=1;i!=11;i++){
                System.out.println(nume+" * "+i+" = "+(nume*i));
                
            }
            nume=pedirNumero();
        }
            System.out.println("un 0 numero incorrecto se destruirá el programa");
        }
    }

