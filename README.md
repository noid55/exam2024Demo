
## Eksamen 2024


### På selve eksamen:

Husk at eksamen foregår på windows maskiner, med windows tastatur. Hvis dere ikke er kjent med windows tastatur burde dere sette av tid til å dra innom skolen og bruke noen av pcene her for å bli kjent med de.

Dette var det flere som slet med på forrige eksamen: Insert knappen på tastaturet. Den forandrer skrivemåten. Hvis pekeren blir "fet" og du overskriver teksten midt i setningen din, er dette pga insert.  

Prioritering av tid er viktig, multiple choice er 10% av poengene men det er potensielt noe man klarer å gå kjappere gjennom enn mer komplekse programmeringsoppgaver. Hvis du sitter fast på en oppgave kan det være lurt å hoppe videre til neste og se om du får til den istede. Ikke bli demotivert hvis begge oppgavene virker vanskelige eller du sliter med å forstå de. Du har fortsatt en del tid på eksamen til å tolke og prøve deg frem.

Husk å lese oppgavetekster nøye, misforståelser eller feil implementasjon kan koste deg poeng.

Jeg leste selv oppgavetekster feil når jeg skrev denne demoen, og oppdaget det bare når jeg leste sensurveiledningen senere 😅

Prøv å lage en plan for fremgangsmåte før du begynner å kode, tenk på hvordan oppgaven skal løses.

Hvis du ikke får til helt riktig syntax på koden er ikke dette det største problemet, du kan få utttelling hvis du viser at du forstår logikken rundt hvordan oppgaven skal løses. Hvis du har dårlig tid prøv å få skrevet ned strukturen og ikke overfokuser på at ting skal være skrevet riktig.
Hvis du sliter med å tolke oppgaveteksten kan du skrive antagelser som du har gjort, eller hvordan du har tolket oppgaven. Dette kan gi sensor innsikt i hvorfor og hvordan du har gjort som du har gjort.

Bruk av kommentarer kan være nyttig, det kan gi sensor innsikt i hva du har tenkt

Generate funksjonen i IntelliJ er tilgjenlig. Her kan du spare en del tid hvis oppgaven bare vil at du skal skrive helt enkle konstruktører, get/set metoder eller toString. 
Merk at på noen oppgaver så kan det være behov for å modifisere disse. F.eks validering av inputs i konstruktør eller settere. Eller modifisering av hva som blir skrevet ut og hvordan i toString (se oppgave 4 deloppgave 3)


### Min kode som jeg selv har skrevet i anledning demo:

Merk at jeg gjennom koden skriver på norsk, dette er fordi jeg holder demo og snakker på norsk samtidig som jeg koder, derfor surrer jeg litt og dette blir enklere for meg. Dere burde absolutt skrive på engelsk og bli vant til dette. Tekstfelt sånn som Strings kan fint være på norsk men det er kanskje enklest å legge seg vanen og skrive på engelsk også. I verste fall, alltid unngå norske bokstaver i klasser, metoder og variabelnavn.


### Oppgave 1 -

Her kan dere enten lage en egen klasse kalt f.eks Oppgave 1, eller så kan dere gjøre den i Main klassen, men husk at metoden må være utenfor public static void main(String[] args) { } kodeblokka.

Det er kanskje lettest å gjøre dette i main, da kan dere lage et eget Array i main og teste mens dere skriver kode.

Merk 2 ting:

1. Vi skal undersøke hele arrayet for hver deloppgave. Dette indikerer behov for for loops. Hvis ikke må vi manuelt gå gjennom hver eneste indeks i arrayet og sjekke verdiene basert på oppgave parameterene.
2. De ønsker at vi skal “undersøke” arrayet, det vil si at vi må teste etter om verdiene i arrayet har visse tilstander. Dette indikerer behov for if statements.

Når vi kombinerer disse to kravene, skjønner vi at det trengs en for løkke med if statements inne i seg.


### Oppgave 2 -

Her skal vi lage en metode, og metoden skal **returnere** en verdi. Dette betyr at metoden kan ikke være void. Metoden skal ta inn 2 parametre, dette er tilsvarende som forrige metode som også tok inn 2 parametre. Men her er type verdier den tar inn annerledes. Vi skal ta en 2 **String** verdier, i kontrast med Oppgave 1 hvor vi tok inn et int Array og en int verdi.
Metoden skal også returnere en verdi av type double. Merk at dette betyr at metoden må være av type double.
Dvs metoden må se noe slikt ut: public **double** divdedBy(String teller, String nevner){ }

Selv om vi tar inn Strings, betyr ikke dette at metoden må være av type String. Her handler hva slaks datatype vi gir metoden egentlig om hva slaks verdi metoden skal **returnere,** ikke hva slaks verdier den tar inn.

Stringene som vi tar inn skal være “tekstlige representasjoner av heltall som er større eller lik 0”.

Dvs at vi tar egentlig inn tall, men kanskje de for eksempel kommer fra en text field på en nettside som ikke har konvertert disse til tall enda?

Derfor må vi konvertere disse om til tall før vi kan gjøre regneoperasjoner.

Videre har oppgaven flere forskjellige måter den skal reagere på, hvis noen har skrevet “feil” verdier For eksmepel “tre” istedenfor “3”, da vil metoden returnere -1. Tenk på dette nesten som en slags feilmelding.

Metoden skal også returnere -1 hvis vi sender inn et brøktall, metoden skal bare ta for seg heltall.

Tilsvarende for -1, det er bare lov å sende inn positive tall.

Det nevnes også at å dele på 0 er problematisk.

Alle disse eksemplene er hint til hvordan metoden skal fungere, og at vi må gjøre visse sjekker underveis for å forsikre riktig oppførsel.
Dvs vi vil trenge flere if statments for å sjekke at metoden oppfører seg riktig.
Har kan man igjen tenke seg opp mot at dette er noe tilsvarende validering av input tekst felt på en nettside.

### b) **Fra sensurveiledning:**

“Et godt svar her vil inkludere forst ̊aelse for at metoden kun er avhengig av verdiene som

blir tilsendt metoden. Den er ikke avhengig av et objekts tilstand (attributter) og kan derfor fint

være static. Men studenten kan fint velge å la metoden ikke være static allikevel.”

Min tolkning:

Når man oppretter et objekt av en klasse, så får dette objektet attributtene til klassen, og vi kan gi de verdier.
F.eks Et objekt av klassen Person, som da kanskje har en navn attributt i seg som `String name;`. Hvis vi oppretter et person objekt, og gir dette objektet navnet “Nils” så tilhørere dette navnet altså ikke klassen, men heller objektet.

Dvs at attributtene i klassen tilhørere egentlig objektet, ikke klassen. Vi *kan* sette attributtene til static, og da vil de tilhøre klassen ved `static String name`. I dette tilfellet vil vi da bare kunne ha et navn på Person klassen, og hvis vi prøver å opprette et nytt objekt senere og vi vil kalle denne personen for “Ida” så vil begge objektene nå hete “Ida”. Dette fordi static attributten tilhørerer klassen, og ikke objektene.

I oppgave 2 er det ingen attributter i klassen, derfor fungerer det helt fint å ha den som static, og det er enklere siden vi ikke trenger å opprette et objekt for å kalle på metoden.

### c) **Fra sensurveiledning:**

Et godt svar her vil forklare forskjellen p ̊a private og public. Det er ikke noen fasit p ̊a hva

som er riktig og galt her. Det kan være hensiktsmessig  ̊a tillate kall p ̊a metoden utenfra klassen. Og

det kan være hensiktsmessig  ̊a la det være en privat hjelpemetode i klassen. Hvis man argumenterer

for (ser for seg) at metoden kun vil være aktuell innad i en klasse, s ̊a kan den være private. Hvis

man argumenterer for at dette kan være en metode som bør kunne tilbys ut av klassen, s ̊a kan den

være public. Ettersom den ikke manipulerer noen tilstand, s ̊a er det valgt  ̊a la den være public i

løsningsforslaget. Det vil jo uansett ikke skade.

## Oppgave 3

Her skal vi lage en metode som tar inn en ArrayList. ArrayList er en litt mer avansert form for et Array. Men i utføring av denne oppgaven er de veldig like, og ArrayList har en del ekstra funksjoner, en av disse gjør oppgaven mye enklere, da spesifikt contains() kallet (Returnerer true eller false basert  på om verdien finnes i lista eller ei).

De vil altså at vi skal lese inn input, og at brukeren skal få lov til å gjette så mange ganger de bare ønsker. Til slutt vil de at vi skal gi brukeren en mulighet for å gå ut av programmet.
Siden de ikke spesifiserer et gitt menge med gjettninger, så kan vi altså tenke oss at denne prosessen bare skal kjøre helt frem til brukeren avslutter selv.
Derfor er det gunstig å bruke en while løkke, siden vi ikke vet hvor mange ganger brukeren ønsker å gjette. While løkka kjører i det uendelige, frem til en gitt condition intreffer. Altså: `while(true){ }` vil kjøre for alltid. `while(false) { }`vil aldri kjøre. Siden brukeren skal kunne avslutte den selv, burde vi altså ikke gjøre som disse eksemplene, men heller bruke en variabel som vi kan skifte om basert på hva brukeren skriver inn. Derfor burde vi lage en boolsk variabel da disse bare kan være true eller false. Vi oppretter den til å være true til å begynne med, også sjekker vi input fra brukeren og hvis de skriver inn x så setter vi verdien til false.

Deretter kan vi putte våres valgte form for å ta brukerinput inne i denne løkka (enten JOptionPane eller scanner), dermed vil programmet kjøre igjen og igjen, og brukeren vil kunne gjette så mange ganger de bare ønsker. Når det skrives inn x så avslutter vi.

Tenk også på at brukeren kan skrive inn “Katt” eller “katt” når de gjetter. Eller hvis de er veldig rare “kAtT”. Derfor er det gunstig å “normalisere” inputs på en eller annen måte.
En enkel løsning ville kanskje bare opplyst brukeren av de må bruke små/store bokstaver, men her får du neppe mye uttelling for en slik løsning. Det skal sies at det sentrale i oppgaven er ikke å validere input på denne måten, hvis du får til en while løkke og programmet sjekker om inputet faktisk eksisterer i lista på riktig måte så får du antagligvis en del poeng for dette.

### Oppgave 4 -

En ganske kompleks oppgave. Her kan det være gunstig å bryte ned hva som blir spurt om skritt for skritt også takle en ting av gangen. Når du har gjort en av deloppgavene eller fått litt bedre oversikt gir kanskje resten mer mening.

### Deloppgave 1

Her spør de om å opprette en klasse, kalt GreenhouseGas. De lister opp attributter og sier at du skal ha en konstruktør som håndterer disse attributtene. Husk at her kan du bruke “Generate” funksjonen til IntelliJ når du har skrevet ned attributtene så vil den lage en konstruktør for deg. Merk at noen oppgaver spør kanskje om å modifisere disse automatiske genererte kodesnuttene utenom hva IntelliJ vil lage for deg (for eksempel deloppgave 3). For å generere kode som dette høyreklikk i intellij, eller trykk på snarveien alt+insert.

### Deloppgave 2

Her spørres det etter en metode “calculateEquivilent” som skal beregne CO2 basert på verdiene til attributtene dens. Her oppgis en formel for hvordan du kan regne ut dette.

Her er tanken at du kan vise at du skjønner hvordan metoden fungerer når du oppretter et objekt av denne klassen. Når du lager et objekt, vil de ha sine individuelle verdier og du kan referere til disse inne i metoden. Da vil den regne ut hvor mye CO2 gassen tilsvarer basert på sine egene attributter.

Denne skal så returneres. Dette kan man enten gjøre direkte via `return globalWarmingPotential * emissionInKiloTonne;`
Eller lage en attributt som lagrer dette også returne denne.

### Deloppgave 3

Her vil man at du skal lage en toString metode, denne kan autogenereres også, men her må du passe på at du faktisk oppfyller formkravene som blir spurt etter i oppgaven. Oppgaveteksten spør spesifikt etter gjenbruk av metoden vi laget i Deloppgave2, så hvis du bare autogenererer vil du ikke få full pott.

### Deloppgave 4

Her ønskes det at vi skal lage et array, som inneholder de forskjellige gassene i seg. Nå har vi allerede laget en Klasse for disse gassene, og det vi trenger å gjøre er altså da og lage objekter basert på denne klassen, putte inn verdiene også legge disse objektene inn i et Array eller en ArrayList.
Merk at her må du opprette Arrayet slik at det tar imot objekter, ikke primitive datatyper.
Den type Array som dere kanskje er mest kjent med tilsvarer noe sånt som `int[] intArray = new int[3]`

Her sier du altså først at du ønsker å lage en variabel av typen int Array (`int[]`), også gir du det et variabelnavn (`intArray`), deretter oppretter du det faktiske arrayet, med 3 plasser til å lagre ting i, og tilegner det til variabelen via erlikehetstegnet(`= new int[3]`)

Men du kan også lage Arrays og ArrayList som lagrere objekter istede for primitive datatyper.
Syntaksen er tilsvarende, men du putter inn Klassetypen du ønsker å lagre istede for int.

Det vil da se noe slikt ut `GreenhouseGas[] gasArray = new GreenhouseGas[3];`

Dette er da altså tilsvarende int Arrayet over. Først etablerer du variabelen, og hva slaks type variabel det skal være, også oppretter du selve Arrayet og hvor mange plasser det har.

Tilsvarende kode for ArrayList:

`ArrayList<GreenhouseGas> gasList = new ArrayList<>();`

Når du lager arrayet har du også muligheten til å bare legge inn gass objektene direkte, da må du først lage disse også legge de inn via variabelnavnene du har opprettet slik:
`GreenhouseGas[] gasArray = {co2, metan, dinitrogenoksid}`

Her kan objektene godt hete noe annet, det velger du selv når du oppretter disse.

Når du har opprettet Array eller ArrayList som kan ta imot riktig datatype (objekter), så kan du legge disse inn som vanlig etter at du oppretter gassobjekter basert på klassen.

### Deloppgave 5

Her vil oppgaven at vi skal bruke en for løkke og printe ut objektene som vi har lagt til i Arrayet eller ArrayListen våres via toString metoden. Vi skal også legge sammen deres tilhørende verdier.

For å skjønne hvordan man skal gjøre dette inne i en for loop, og hvordan man skal legge samme verdiene deres kan det være gunstig å prøve først med en og en gass og studere mønsteret på printouten uten selve for løkka.

Siden vi skal legge sammen verdiene, trenger vi da en hjelpevariabel som kan huske totalsummen. Dette blir tilsvarende som vi gjorde når vi legger sammen verdiene i Arrayet i Oppgave 1.

Deretter trenger vi å lage selve for løkken, iterere gjennom Arrayet og samtidig legge til verdiene some blir printet ut inn i totalsummon som vi printer ut til slutt utenfor løkka ( vi kan se at vi må gjøre dette utenfor basert på eksempel printout de gir oss i oppgaveteksten. Hvis den hadde vært inne i løkka ville den printet ut totalen for hver iterasjon av for løkka).

For å lage strengene dynamisk, henter vi ut informasjonen om objektene sine attributter inne i løkka. Dette kan du først prøve ut utenfor løkka også, eksempelvis hente ut navn blir da `System.out.println(co2.gasname)`

Dette kan vi også gjøre ved å referere til objektene som er lagret inne i arrayet.

`System.out.println(gasArray[0].gasname)`

Eller for ArrayList

`System.out.println(gasList.get(0).gasname);`
Tenk deg nå tilsvarende prosess, bare for de andre attributtene som du konkatinerer i en streng, og at istedenfor 0 så lar du telleren(altså i) i for løkka hente ut verdiene.

