package variables2;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    /*
    Lag et program som leser inn tre desimaltall.
    Programmet skal så summere disse tallene og vise summen i System.out.
    */
    public static void main(String[] args) {
        String innTall1 = showInputDialog("Skriv inn et desimaltall : ");
        String innTall2 = showInputDialog("Skriv inn et desimaltall til : ");
        String innTall3 = showInputDialog("Skriv inn enda et desimaltall til : ");
        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);
        double sum = tall1 + tall2 + tall3;
        System.out.print("Summen av tallene blir"+tall1+" , "+tall2+" , "+tall3);
        System.out.print(" er "+sum);
    }
}