package gr.aueb.cf.ch1;


public class TypecastApp {

    public static void main(String[] args){

        int num1= 10;
        long num2 = 999L;
        int i = (int) (5L / 9);
        byte b = 12;
        /* metatrepei to num2 se int kai ekxwrei thn timi tou sto num1 */
        byte c = 127;
        num1 = (int) num2;
//        System.out.printf("ο αριθμός %,09d", num1);
//        System.out.printf("Το απόλυτο του -5 είναι:" + Math.abs(-5));

        int numnum = 10;

        System.out.printf("%d%n",numnum);
        int nm= 10;
        System.out.printf("%3d", nm);


//      int math1 = (int) (Math.random() * 10);
//        System.out.print (math1);




    }

}
