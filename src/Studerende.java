public class Studerende {


    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;


    Studerende() {
        studieretning = "Datamatiker";
        campus = "Næstved";
    }
    Studerende(String x, int y, String z){
        this.navn = x;
        this.alder = y;
        this.by = z;
    }

    public Studerende(String navn) {
        this.navn = navn;
    }

    public Studerende(String navn, int alder){
        this.navn = navn;
        this.alder = alder;

    }
}
