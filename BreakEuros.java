package gr.aueb.cf.ch1;

import java.util.Scanner;

public class BreakEuros {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        int inputEuros;
        int pentakosia, diakosia, ekato, peninta, eikosi, deka, pente;
        int metavalomenos;

        System.out.println("Please insert an amount to euro");
        inputEuros = in.nextInt();

        pentakosia = inputEuros / 500;
        inputEuros %= pentakosia;

        diakosia = inputEuros / 200;
        inputEuros %= diakosia;

        ekato = inputEuros / 100;
        inputEuros %= ekato;

        peninta = inputEuros / 50;
        inputEuros %= peninta;

        eikosi = inputEuros / 20;
        inputEuros %= eikosi;

        deka = inputEuros / 10;
        inputEuros %= deka;

        pente = inputEuros / 5;
        inputEuros %= pente;


        System .out.printf("%d Euros = %d των 500, %d των 200, %d των 100, %d των 50, %d των 20, %d των 10 και %d των 5 ",
                inputEuros, pentakosia, diakosia, ekato, peninta, eikosi, deka, pente);



    }


}
