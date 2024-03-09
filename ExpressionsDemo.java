package gr.aueb.cf.ch1;

public class ExpressionsDemo {

    public static void main(String[] args) {

        /*
        * +, -, *, /, %, ++, --
        */

        int sum = 5 + 4;
        int a = 4;
        int result = 0;
        int i = 153;
        long sumLong = 0;


        sum = (5 + 4) * 12;
        sum =  (((5 + 4) * 10) - ((2 + 8) % 3));
        sum = 4 / 3;
        sum = 4 / 0; // απαγορεύεται η διαίρεση με το 0 στους ακεραίους

        result = a++; // το result γίνεται 4 και το α 5
        result = ++a; // το result γίνεται 6 και το 6

        //τελεστές σύντμισης
        result = result + 5;
        result += 5;
        result /= 5;

        i = i / 10; // i- > 153 / 10 = 15;
        i = i % 10; // i -> πόσο είναι το υπόλοιπο από την διαίρεση του 153/ 10 = 3΄

        sumLong = sum; // αυτόματα η java κάνει typecast -> μετατρέπει τους μικρότερους τύπους σε μεγαλύτερους
        sum = (int) sumLong; //επειδή πάμε να εκχωρήσουμε στο int μεγαλύτερο τύπο, πρέπει να το κάνουμε typecast πρώτα

    }

}
