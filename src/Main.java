public class Main {

    public void investigateIntArray(int[] ints, int number){
        int mindreEnnNull = 0;
        int sum = 0;
        //Vi setter maks verdien til å være første tallet i arrayet, slik får vi også riktig resultat om det bare er negative tall
        //Sensurveiledning bruker Integer.MIN_VALUE;
        //Eventuelt kunne det også blitt brukt et veldig lavt tall, ala -99999999
        //Her tenker jeg at dere sikkert ikke hadde fått veldig mye trekk om dere hadde satt maks = 0;
        int maks = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] < 0){
                mindreEnnNull++;
            }
            sum += ints[i];
            if(ints[i] > maks){
                maks = ints[i];
            }
            if (ints[i] % number == 0){
                System.out.println(ints[i]);
            }

        }
        System.out.println("Antall verdier som er mindre enn null i arrayet: " + mindreEnnNull);
        System.out.println("Summen av tallene i arrayet er " + sum);
        System.out.println("Det største tallet i arrayet er " + maks);
    }

    public static void main(String[] args) {
        //Merk at ingen av koden som er i main kreves for å løse oppgaven.
        //Her har jeg bare gjort dette i main for å vise logikken bak hva vi gjør i selve metoden over.
        //Når dere eventuelt ville levert denne oppgaven så hadde dere gjort det med å bare kopiere koden ovenifra, og ikke noe fra main

        //Lager et array, her viser jeg hvordan du kan sjekke verdiene manuelt, men dette er ikke veldig praktisk.
        //I teorien kan du gjøre dette, men det er ikke dynamisk og vil bare sjekke ditt lokale Array.
        //Du kunne kanskje fått litt uttelling på oppgaven fordi du fortsatt viser at du skjønner litt kontrollstruktur (if setninger)
        //Merk at oppgaven spør om antall verdier, ikke at du skal printe ut verdiene som er mindre enn 0
        int[] intArray = {-1, -2, -43, 5, 5, -2, 4, 6, 45};
        System.out.println(intArray[0]<0);

        if(intArray[0]<0){
            System.out.println(intArray[0]);
        }
        if(intArray[1]<0){
            System.out.println(intArray[1]);
        }
        if(intArray[2]<0){
            System.out.println(intArray[2]);
        }
        //Istede så oppretter vi et objekt av klassen main, så vi kan benytte oss av metoden "investigateIntArray()",
        //Merk at oppgaven spør ikke om dette. Så hvis du er sikker på koden din er det ikke behov for å gjøre noe i main i det hele tatt.
        //Men det er kanskje kjekt å teste at koden funker uansett :)
        Main testMain = new Main();
        testMain.investigateIntArray(intArray, 5);

        //Viser bare at å lage et objekt av main, er tilsvarende som om at vi lager et objekt av "Oppgave1" klassen.
        //Du kunne også laget en egen public static void main (String[] args){ } metode i Oppgave1,
        //Da ville funksjonelt sett Oppgave1 klassen være helt lik som denne vi har her i Main klassen (navnet på klassen er annerledes)
        EksempelKlasse testOppgave1 = new EksempelKlasse();
        testOppgave1.investigateIntArray(intArray, 3);

        //deloppgave 2
        //Her trenger vi en hjelpevariabel for å huske hva summen av arrayet er.
        //Vi kaller denne for sum og plusser inn alle tallene i arrayet i denne variabelen.
        System.out.println("Deloppgave 2");
        int[] intArray2 = {-2, 2, 2};

        //Dette er logikken som trengs for å løse deloppgave 2, nå trenger vi bare å implementere denne logikken i metoden investigateIntArray
        int sum = 0;
        for (int i = 0; i < intArray2.length; i++) {
            sum += intArray2[i];
        }
        System.out.println(sum);
        testMain.investigateIntArray(intArray2, 5);

        //Deloppgave 3
        //Her trenger vi en hjelpevariabel som kan huske hva den største verdien vi er funnet så langt er
        System.out.println("Deloppgave 3: ");
        int maks = 0;
        for (int i = 0; i < intArray2.length; i++) {
            if(intArray2[i]>maks){
                maks = intArray2[i];
            }
        }
        System.out.println(maks);
        testMain.investigateIntArray(intArray2, 5);

        //Deloppgave 4
        //Modulus(%) kan være vanskelig, men den har utrolig mange og nyttige applikasjoner
        //Når vi ønsker å oppdage et spesielt mønster i tall, er modulus veldig gunstig.
        //Modulus ser hva man får i restverdi, etter en deleoperasjon
        System.out.println("Deloppgave 4: ");
        System.out.println(2%2); //2%2 gir 0, 3%2 gir 1, 4&2 gir 0, 5%2 gir 1 osv.

        //Modulus som en sammenligning vil returnere true eller false. Altså 2%2 == 0 er enten true eller false
        //Vi sier jo egentlig, er tallet før == det samme som tallet etter erlik
        System.out.println(3%2==0);
        testMain.investigateIntArray(intArray2, 6);

    }
}
