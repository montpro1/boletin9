/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Clasificacion {
    private int numero;
Scanner sc=new Scanner(System.in);
public Clasificacion(){
}
public Clasificacion(int numero){
    this.numero=numero;
    
}
public void setNumero(Scanner sc){
    System.out.println("Escribe un numero");
    numero=sc.nextInt();
}
public int getNumero(){
    return numero;
}
public int darNumero(){
    System.out.println("Escribe un numero positivo, negativo ou cero");
    return sc.nextInt();
}
public String Operaciones(){
    int i=0, carroPos=0,carroNeg=0,carroCero=0;
    int numero=darNumero();
    while(i!=10){
        if(i==0){
            carroCero++;
            i++;
            numero=darNumero();
        }
        
        
            
        
        else if(i<0){
            carroNeg++;
            i++;
            numero=darNumero();
        }
        else{
            carroPos++;
            i++;
            numero=darNumero();
    }
    }
        return ("despues de 10 numeros tenemos "+carroPos+" numeros positivos ,"+carroNeg+" numeros negativos "+carroCero+" ceros");
    
}
}
    


