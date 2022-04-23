package com.ibm.academia.appruleta;

import java.io.Serializable;
import java.util.Scanner;

public class Ruleta implements Serializable
{
     private Integer id;
     private String color;
     Colores col;
     private Integer numero;
     private boolean ruletaAbierta;
     private double valorApertura;
     private int opcion;

     public Ruleta() {
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public Integer getNumero() {
          return numero;
     }

     public void setNumero(Integer numero) {
          this.numero = numero;
     }

     public boolean isRuletaAbierta() {
          return ruletaAbierta;
     }

     public void setRuletaAbierta(boolean ruletaAbierta) {
          this.ruletaAbierta = ruletaAbierta;
     }

     public double getValorApertura() {
          return valorApertura;
     }

     public void setValorApertura(double valorApertura) {
          this.valorApertura = valorApertura;
     }

     public int getOpcion() {
          return opcion;
     }

     public void setOpcion(int opcion) {
          this.opcion = opcion;
     }

     public Colores getCol() {
          return col;
     }

     public void setCol(Colores col) {
          this.col = col;
     }

     public Integer crearRuleta(){

          id= (int) (Math.random()*100+1);
          return id;
     }

     public boolean aperturaRuleta(Integer numeroAletorio){
          if (id >=1 && id>=18){
               System.out.println("Ruleta abierta");
               return true;
          }else{
               System.out.println("Ruleta cerrada");
               return false;
          }
     }

     public void apostarRuleta(){

          if (aperturaRuleta(getId())== true){

               System.out.println("Para iniciar el juego selecciona alguna de las opciones:\n" +
                       "1.-Si deseas apostar por un color (debera ser negro o rojo)\n" +
                       "2.-Si deseas apostar por un número(Solo puedes seleccionar un numero del 0 al 36)\n" +
                       "3.-Si deseas apostar por un color y un numero (El color puede ser rojo o negro y el numero del 0 al 36)");

               Scanner seleccionOpcion= new Scanner(System.in);
               opcion= seleccionOpcion.nextInt();


               switch (opcion){

                    case 1:
                         System.out.println("En esta opcion deberas elegir un color el cual unicamente podra ser negro o rojo:\n");
                         Scanner eleccionColor = new Scanner(System.in);
                         this.color =eleccionColor.nextLine();
                         if (col.compareTo(Colores.ROJO)<0 && col.compareTo(Colores.NEGRO)<1){

                              System.out.println("Elegiste el color: "+col);

                         }
                         System.out.println("Ahora coloca la cantidad que deseas apostar la cual debera ser maximo de 10,000 dolares: ");


                         break;

               }

          }else{
               System.out.println("Inicia el juego de nuevo para poder obtener una ruleta abierta y poder ingresar la apuesta");
          }

     }



}
