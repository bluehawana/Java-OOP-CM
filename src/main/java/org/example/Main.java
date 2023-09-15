package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Iron Man (Tony Stark) vill testa sina strålar.For loop");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < 8; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("Avfyrar stråle " + i);

        }

        Thor();
        Hawkeye();
        CaptainAmerica();
        DeadPool();
        DeadPool2();
        Deadpool3();
    }

    public static void Thor() {
        String[] favoritrealmer = {"Midgård", "Asgård", "Vanheim", "Svartalfheim"};
        for (String favoritrealm : favoritrealmer) {
            System.out.println(favoritrealm);
        }
    }

    public static void Hawkeye() {
        System.out.println("Hawkeye tränar sin precision genom att skjuta pilar tills han träffar mitten av måltavlan. Han börjar missa, men fortsätter försöka. Använd en while loop för att simulera hans försök tills han träffar rätt (låt oss säga att han lyckas på försök 6).!");
        int i = 1;
        while (i != 6) {
            System.out.println("Hawkeye försöker träffa mitten av måltavlan");
            i++;
        }
        System.out.println("Hawkeye träffade mitten av måltavlan på försök 6");
        return;
    }

    public static void CaptainAmerica() {
        int j = 1;
        do {
            System.out.println("Kastar skölden " + j + "gånger");
            j++;
        }
        while (j != 5);
        {
            System.out.println("Dags för en paus!");

        }
    }

    public static void DeadPool(){
        for(int t = 0; t < 10; t++)
        {
            System.out.println(4);
        }
    }

    public static void DeadPool2(){
        String favoritvapon []={"Katanas","Pistoler", "Knivar","Granater"};
        for (String favoritvapen : favoritvapon) {
            System.out.println(favoritvapen);
        }
    }

    public static void Deadpool3(){
int lösenord = 1;
while (lösenord != 57){
    System.out.println("Gissar: " + lösenord);
    lösenord++;
}
System.out.println("Gissar: " + lösenord);
System.out.println("Åh ja! Jag hittade det! Lösenordet är 57");
    }
}

