package gr.aueb.cf.ch1;

import java.util.Scanner;


public class EuroUsdConverter {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        int inputEuros;
        final int PARITY = 104;
        int totalUsaCents, usaCents, usaDollars;

        System.out.println("Please insert an amount to euro");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System .out.printf("%d Euros = %d usa cents = %d usa dollars & %d usa cents",
                inputEuros, totalUsaCents, usaDollars, usaCents);





    }

}
