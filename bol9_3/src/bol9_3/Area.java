/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_3;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Area {
    private double base, altura;
    Scanner sc=new Scanner(System.in);
    
    
    public Area(){
        
    }
    public  Area(double bas,double alt){
        base=bas;
        altura=alt;
        
      
    }
    public void setBase(Scanner sc){
        base=sc.nextDouble();
        
    }
    public void setAltura(Scanner sc){
        altura=sc.nextFloat();
       }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double pedirBase(){
        System.out.println("Escribe la base de un triangulo");
        return sc.nextFloat();
    }
    public double pedirAltura(){
        System.out.println("Escribe la altura del triangulo");
        return sc.nextFloat();
    }
    public String Areas(){
        double bas, alt;
        bas=pedirBase();
        while(bas<=0){
            System.out.println("Vuelva a introducir un numero mayor que 0");
            bas=pedirBase();
            
        }
        alt=pedirAltura();
        while(alt<=0){
            System.out.println("Vuelva a introducir un numero mayor que 0");
            alt=pedirAltura();
        }
        return ("el area del triangilo es"+bas*alt);
    }
    
    
}
