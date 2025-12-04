import javax.swing.*;
import java.util.ArrayList;

public class Oppgave3 {
    public void guessTheAnimal(ArrayList<String> animals) {
        //Vi oppretter en variabel som kontrollerer om løkka skal fortsette å kjøre.
        // Når brukeren skriver inn x så avslutter vi ved å sette verdien til false
        //Dette programmet vil kjøre helt til brukeren skriver inn x eller trykker på cancel knapp.
        boolean gjettVidere = true;
        while (gjettVidere) {
            String gjettDyret = JOptionPane.showInputDialog(null,
                    "Vil du gjette på et dyr, eller gi opp (tast x)? " +
                            "Hvis du vil gjette, skriv inn dyret (små bokstaver).");
            //Vi tar høyde for at brukeren kan skrive inn x med stor eller liten bokstav.
            //Alternativt her kunne du også gjort if(gjettDyret.equals("x") || gjettDyret.equals("X");
            //Men det er bedre å bruke equalsIgnoreCase
            if(gjettDyret.equalsIgnoreCase("x")){
                JOptionPane.showMessageDialog(null, "Ok, sjalabais!");
                gjettVidere = false;
            }
            //Her passer vi på at selv om brukeren skriver inn med capslock eller store bokstaver, blir alt input gjort om til små bokstaver
            //Hvis dyret finnes i lista, vil animals.contains(gjettDyret) returnere true, hvis ikke false.
            if(animals.contains(gjettDyret.toLowerCase())){
                JOptionPane.showMessageDialog(null, "Gratulerer, du gjettet riktig, " + gjettDyret +
                        " var ett av dyrene.");
            } //Hvis brukeren verken avslutter eller gjetter riktig, er det eneste andre alternativet at de ikke gjetta riktig, så dette er siste stykke av løsningen.
            else{
                JOptionPane.showMessageDialog(null, "Hm, " + gjettDyret + " var ikke riktig...");
            }

        }
    }


    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("katt");
        animalList.add("hund");

        Oppgave3 testOppgave3 = new Oppgave3();
        testOppgave3.guessTheAnimal(animalList);

    }

}
