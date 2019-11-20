/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Operandos {
    private int numero;
Scanner sc=new Scanner(System.in);
public Operandos(){
}
public  Operandos(int num){
    numero=num;
    
}
public void setNumeros(Scanner sc){
    System.out.println("escribe un numero");
    numero=sc.nextInt();
}
public int getNumero(){
    return numero;
}

public String Operacion(){
    int i=10, contSuma=10, contProducto=10;
    contSuma=contSuma+i;
    contProducto=contProducto*i;
    System.out.println(contSuma);
    System.out.println(contProducto);
    while(i!=90){
        i++;
        contSuma=contSuma+i;
    contProducto=contProducto*i;
    }

return ("la suma es"+contSuma+"la multiplicacion es "+contProducto);
}
}