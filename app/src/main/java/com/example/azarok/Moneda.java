package com.example.azarok;

import java.util.*;

public class Moneda {


    public static int lanzar() {
        int num;
        Random numAleatorio = new Random();
// Genera un boolean de forma aleatoria
        boolean mon = numAleatorio.nextBoolean();
// Si es verdadero cara y sino cruz
        if (mon) {
            num = 1;
        } else {
            num = 0;
        }
        return num;
    }

}

