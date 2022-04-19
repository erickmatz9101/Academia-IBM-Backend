package com.ibm.academia.appruleta;

import java.io.Serializable;

public class Ruleta implements Serializable
{
     private Integer id;
     private String color;
     private Integer numero;
     private boolean ruletaAbierta;
     private double valorApertura;

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

     public Integer crearRuleta(){

          id= (int) (Math.random()*100+1);
          return id;
     }


}
