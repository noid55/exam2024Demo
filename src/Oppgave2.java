public class Oppgave2 {
    //Jeg oppretter denne attributten bare for å vise hvordan static fungerer. Den tilhører ikke oppgaveløsningen
    //Når vi oppretter et objekt av denne klassen, så vil verdien som ligger i lastResult tilhøre objektet, ikke klassen
    //Derfor vil ikke en static metode kunne hente ut verdier fra denne. Dette fordi static metoder tilhører klassen, ikke objektet.

    private double lastResult;

    public static double dividedBy(String teller, String nevner){
        //Her kan dere enten begynne med å lage selve dele operasjonen først, altså bare gjøre teller / nevner også returnere denne verdien
        //Eller så kan dere begynne å teste for edge cases som 3 / -1, eller 3 / tre osv.
        double resultat;
        try {
            int tellerTall = Integer.parseInt(teller);
            int nevnerTall = Integer.parseInt(nevner);

            if(tellerTall < 0 || nevnerTall <= 0){
                return -1;
            }
            resultat = (double) tellerTall / nevnerTall;
            //Hvis vi prøver å legge inn resultatet fra en static metode inn i en variabel som tilhører et instans av klassen (et objekt) kræsjer programmet
            //lastResult = resultat;
            return resultat;
        }
        //Catch biten håndterer flere av feilmeldingine/feilinputsa, hvis vi skriver inn "tre" som et tall kræsjer programmet
        //Hvis vi skriver in 2.5 som et tall, vil Integer.parseInt("2.5") kræsje.
        //Alle disse blir plukket opp her, da gjennstår bare å sjekke etter positive tall
        catch (Exception e){
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(Oppgave2.dividedBy("3", "0"));

    }
}
