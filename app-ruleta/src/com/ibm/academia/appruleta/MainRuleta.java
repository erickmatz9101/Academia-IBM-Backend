package com.ibm.academia.appruleta;

public class MainRuleta {
    public static void main(String[] args) {

        Ruleta ruleta = new Ruleta();

        ruleta.crearRuleta();
        System.out.println("El id de la ruleta es: "+ruleta.getId());
        ruleta.aperturaRuleta(ruleta.getId());
        ruleta.apostarRuleta();


    }
}
