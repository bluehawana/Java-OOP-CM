package org.example;

import java.util.Scanner;

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
        DeadPool3();
        DeadPool4();
        CampCrystalLake();
        föremål();
        MörkaNätter();
        FörseglaDörren();
        AlanGrant();
        JurassicPark();
        strömmen();
        Areana();
        NumberJudgement();
        AskName(args);
        CallNames();
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

    public static void DeadPool() {
        for (int t = 0; t < 10; t++) {
            System.out.println(4);
        }
    }

    public static void DeadPool2() {
        String favoritvapon[] = {"Katanas", "Pistoler", "Knivar", "Granater"};
        for (String favoritvapen : favoritvapon) {
            System.out.println(favoritvapen);
        }
    }

    public static void DeadPool3() {
        int lösenord = 1;
        while (lösenord != 57) {
            System.out.println("Gissar: " + lösenord);
            lösenord++;
        }
        System.out.println("Gissar: " + lösenord);
        System.out.println("Åh ja! Jag hittade det! Lösenordet är 57");
    }


    public static void DeadPool4() {
        int avsnitt = 1;
        do {
            System.out.println(("Titta på avsnitt " + avsnitt));
            avsnitt++;
        } while (avsnitt < 6);
        System.out.println("Okej,okej,jag stänger av nu...");
    }


    public static void CampCrystalLake() {
        for (int stuga = 1; stuga < 14; stuga++) {
            System.out.println("Besöker Stuga " + stuga);
        }
    }


    public static void föremål() {
        String[] föremål = {"Machete", "Hockeymask", "Yxa", "Rope"};
        for (String item : föremål) {
            System.out.println(item);
        }
    }

    public static void MörkaNätter() {
        int batteri = 5;
        while (batteri != 0) {
            System.out.println("Lyktans batteri: " + batteri + " timmar kvar");
            batteri--;
        }
        System.out.println("Lyktans batteri är död!");
    }

    public static void FörseglaDörren() {
        int dörr = 1;
        do {
            System.out.println("Försöker försegla dörren...");
            dörr++;
        } while (dörr < 3);
        System.out.println("Dörren är förseglad!");
    }

    public static void AlanGrant() {
        for (int gräv = 1; gräv < 9; gräv++) {
            System.out.println("Gräver " + gräv);
        }

    }

    public static void JurassicPark() {
        String[]
                dinosauriearter = {"Tyrannosaurus Rex", "Velociraptor", "Triceratops", "Brachiosaurus"};
        for (String dinosaurieart : dinosauriearter) {
            System.out.println(dinosaurieart);
        }


    }

    public static void strömmen() {
        int ström = 0;
        do {
            System.out.println("Försöker återställa strömmen...");
            ström++;
        } while (ström < 2);
        System.out.println("Strömmen återställd!");
    }

    ;

    /*public static viod NumberJudge() {

        boolen isOdd;
        boolen isEven;
        Boolen isPrime;
        System.out.println("Please enter your number for the judgement!");
        Scanner input=new Scanner(System.in);
        int InputNum=input.nextln;
        if (InputNum<2){
            System.out.println("The number is not a prime number!");
        }
        else if(Math.sqrt(InputNum)==0{
            System.out.println("The number is not a prime number!");
        }
        else{
            for(int i=2;i<=Math.sqrt(InputNum);i++){
                if(InputNum%i==0){
                    System.out.println("The number is not a prime number!");
                    return;
                }
            }
            System.out.println("The number is a prime number!");
    }

*/
    public static void Areana() {
        System.out.println("Welcome to the Areana!");
        int[] siffror = new int[5];
        siffror[0] = 10;
        siffror[1] = 20;
        siffror[2] = 30;
        siffror[3] = 40;
        siffror[4] = 50;

        for (int i = 0; i < siffror.length; i++) {
            System.out.println(siffror[i]);
        }

    }


    public static void NumberJudgement() {
        System.out.println("Please enter your number for the judgement!");
        int InputNum = new Scanner(System.in).nextInt();
        if (InputNum < 2) {
            System.out.println("The number is not a prime number!");
        } else if (Math.sqrt(InputNum) == 0) {
            System.out.println("The number is not a prime number!");
        } else {
            System.out.println("The number is a prime number!");

        }
        return;
    }

    public static void AskName(String[] args) {
        String[] names = new String[5];
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input == null || input == "" || input.length() == 1) {
            System.out.println("Please enter a name!");
            return;
        }
        String name = new Scanner(System.in).nextLine();
        for (int i = 0; i < names.length; i++) {
            names[i] = name;
        }
        ;
        System.out.println("Hello " + name);
    }

    public static void CallNames() {
        String[] names = {"Pelle", "Kalle", "Nisse", "Lisa", "Anna"};
        for (String name : names) {
            if (name.contains("s") || name.contains("S")) {
                System.out.println(name);

            }
        }
    }
}
