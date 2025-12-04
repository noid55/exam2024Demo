import java.util.ArrayList;

public class GreenhouseGas {
    private String gasName;
    private double globalWarmingPotential;
    private double emissionInKiloTonne;

    public GreenhouseGas(String gasName, double globalWarmingPotential, double emissionInKiloTonne) {
        this.gasName = gasName;
        this.globalWarmingPotential = globalWarmingPotential;
        this.emissionInKiloTonne = emissionInKiloTonne;
    }

    //Her kunne man også sendt inn parametere manuelt for gassen når man kaller på metoden, istedenfor å legge inn attributtene til objektet
    //Dette ville kanskje vært enklere å skjønne, men gir mindre uttelling. Koden blir mer uoversiktlig, og viser mindre innsikt i hvordan systemet fungerer.
    //Dette er fordi du senere kommer til å opprette objekter av denne klassen som representerer de individuelle gassene(CO2, Metan osv)
    //Da vil hvert individuelle objekt ha sine egne attributter som blir fylt inn her, og vil da bruke sine egne attributter for denne beregningen
    public double calculateEquivalent (){
        double totalCO2;
        totalCO2 = globalWarmingPotential * emissionInKiloTonne;

        return totalCO2;
    }
    //Merk at når man autogenererer koden så brukes @Override, dette får man uttelling på.
    //Merk også at Stringen som blir returnert har vi skrevet manuelt, i det formatet oppgaven ber om.
    //Vi bruker metoden vi har laget tidligere for å oppfylle strukturen som oppgaven ber om, slik at strengen blir dynamisk basert på hvilken gass det er snakk om.
    @Override
    public String toString() {
        return emissionInKiloTonne + " kilotonn " + gasName + " tilsvarer " +
                calculateEquivalent() + " kilotonn CO2e";
    }

    public static void main(String[] args) {
        //Velg selv om du vil bruke Arrays eller ArrayList, her bruker jeg ArrayList.
        //For denne oppgaven har det ikke noen særlig innvirkning på hvilken du velger, så bare velg basert på preferanse.
        //Jeg løste den med ArrayList her, også viser jeg hvordan dere kunne løst med Array under.

        //Viser opprettelse av både gasArray og ArrayList, så det er tydligere hva forskjellen på hvordan man oppretter de to er.
        GreenhouseGas[] gasArrayEksempel = new GreenhouseGas[3];
        ArrayList<GreenhouseGas> gasList = new ArrayList<>();

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("sdf");
        System.out.println(stringList.size());
        //Her fyller vi inn objektene sine verdier basert på informasjonen som gis i oppgaveteksten.
        //Måleenheten som er basis for målingene er i dette tilfellet CO2, derfor har CO2 en 1 ratio.
        //De andre gassene måler sin innvirkning på utslippsgrad opp mot CO2, derfor ser vi på hvilken ratio de har i forhold til CO2.
        //Deretter fyller vi inn antall kilotonn som vi har av utslipp.
        GreenhouseGas co2 = new GreenhouseGas("CO2", 1, 38869.00);
        GreenhouseGas metan = new GreenhouseGas("Metan", 25, 171.27);
        GreenhouseGas n2O = new GreenhouseGas("Dinitrogenoksid", 298, 8.44);

        int intTall = 2;
        gasList.add(co2);
        gasList.add(metan);
        gasList.add(n2O);

        //Viser her hvordan du kan hente ut metodene til gassene, selv om de ligger i ArrayListen.
        //Dette kan du bruke til å printe ut i for løkka, og også legge inn summen ved å kalle på calculateEquivalent metoden og plusse inn i sum verdien.
        System.out.println(gasList.get(0));

        double totalCO2 = 0;
        for (int i = 0; i < gasList.size(); i++) {
            //Når man putter et objekt i en System.out.println så vil Java automatisk bruke toString metoden for dette objektet
            //Vanligvis vil det gi en rar referanse til minnelagringen til objektet, men siden vi har skrevet våres egen toString vil den bruke denne.
            System.out.println(gasList.get(i));
            totalCO2+= gasList.get(i).calculateEquivalent();
        }
        System.out.println("Totalt blir dette " + totalCO2 + " kilotonn CO2e");

        //Oppgaven ovenfor er løsningen med ArrayList, under løser jeg oppgaven igjen bare med Array istede.
        GreenhouseGas[] gasArray = new GreenhouseGas[3];

        //Oppretter objekter av klassen, kaller de noe annet enn de tidligere opprettede verdien bare for å vise.
        //Her kunne dere også lagt inn gass objektene som vi puttet inn i ArrayListen tidligere også.
        GreenhouseGas co2Array = new GreenhouseGas("CO2", 1, 38869.00);
        GreenhouseGas metanArray = new GreenhouseGas("Metan", 25, 171.27);
        GreenhouseGas n2OArray = new GreenhouseGas("Dinitrogenoksid", 298, 8.44);

        gasArray[0] = co2Array;
        gasArray[1] = metanArray;
        gasArray[2] = n2OArray;

        double sumCo2 = 0;
        for (int i = 0; i < gasArray.length; i++) {
            System.out.println(gasArray[i]);
            sumCo2 += gasArray[i].calculateEquivalent();
        }
        System.out.println("Totalt blir dette " + sumCo2 + " kilotonn CO2e");
    }
}
