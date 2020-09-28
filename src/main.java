import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn = "Sara";
        st1.alder = 27;
        st1.by = "Næstved";

        Studerende st2 = new Studerende("Malte", 28, "Nykøbing Falster");


        Studerende st3 = new Studerende("Laila",49);
        st3.navn = "Laila";
        st3.alder = 49;
        st3.by = "Næstved";

        Studerende st4 = new Studerende();
        st4.navn = "Louise";
        st4.alder = 41;
        st4.by = "Glumsø";

        Studerende st5 = new Studerende();
        st5.navn = "Jenna";
        st5.alder = 36;
        st5.by = "Nørre Alslev";

        System.out.println("Alle studerende oprettet");


            Scanner input = new Scanner(System.in);
            System.out.print("Hvem vil du slå op i databasen? ");
            String nameToFind = input.next();

            switch (nameToFind) {
                case "Sara":
                    System.out.println(st1.alder + " " + st1.by);
                    break;
                case "Malte":
                    System.out.println(st2.alder + " " + st2.by);
                    break;
                case "Laila":
                    System.out.println(st3.alder + " " + st3.by);
                case "Loise":
                    System.out.println(st4.alder + " " + st4.by);
                    break;
                case "Jenna":
                    System.out.println(st5.alder + " " + st5.by);
                    break;
                default:
                    System.out.println(nameToFind + " er ikke med i min studiegruppe.");


        }
    }
}