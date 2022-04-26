package com.ibm.academia.appruleta;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ruleta implements Serializable
{
     private Integer id;
     private String color;
     private Integer numero;
     private boolean ruletaAbierta;
     private double valorApertura;
     private int opcion;
     List<String> colores=Arrays.asList("negro", "rojo");
     List <Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36);

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
                         System.out.println("Elegiste la opcion 1: En  esta opcion deberas ingresar un color solo hay 2 opciones, negro y rojo\n");
                         Scanner eleccionColor = new Scanner(System.in);
                         color =eleccionColor.nextLine();
                         if (colores.contains(color)){
                              System.out.println("El color que ingresaste es: "+color);
                         }else{
                              System.out.println("El color ingresado no es valido, intentalo de nuevo");
                         }
                         break;
                    case 2:
                         System.out.println("Elegiste la opcion 2: En esta opcion puedes apostar por un numero que esté entre el 1 y el 36 ");
                         Scanner entradaNumero = new Scanner(System.in);
                         numero=entradaNumero.nextInt();
                         if (numeros.contains(numero)){
                              System.out.println("El numero que elegiste es el : "+numero);
                         }else{
                              System.out.println("El numero ingresado no es valido intentalo de nuevo");
                         }
                         break;

                    case 3:
                         System.out.println("Elegiste la opcion 3: En esta opcion puedes apostar por un color y un numero. Ingresa el color que debera ser negro o rojo y un numero que este entre el 1 y el 36\n");
                         Scanner eleccionColor2 = new Scanner(System.in);
                         color =eleccionColor2.nextLine();
                         if (colores.contains(color)){
                              System.out.println("El color que ingresaste es: "+color);
                         }else{
                              System.out.println("El color ingresado no es valido, intentalo de nuevo");
                         }

                         System.out.println("Ahora tienes que elegir un numero que se encuentre entre el 1 y el 36 ");
                         Scanner entradaNumero2 = new Scanner(System.in);
                         numero=entradaNumero2.nextInt();
                         if (numeros.contains(numero)){
                              System.out.println("El numero que elegiste es el : "+numero);
                         }else{
                              System.out.println("El numero ingresado no es valido intentalo de nuevo");
                         }
                         break;

                    default:
                         System.out.println("Ninguna de las opciones de juego es valida, intentalo mas tarde");

               }

          }else{
               System.out.println("Inicia el juego de nuevo para poder obtener una ruleta abierta y poder ingresar la apuesta");
          }

     }



}
