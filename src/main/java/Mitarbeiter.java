package java;

public class Mitarbeiter {
    public int Firmenzugehoerigkeit;
    public Enum Abteilung;

    public Mitarbeiter(int Firmenzugehoerigkeit, Abteilung sekretariat) {



    }

    public int getFirmenzugehoerigkeit() {
        return Firmenzugehoerigkeit;
    }

    public void setFirmenzugehoerigkeit(int firmenzugehoerigkeit) {
        Firmenzugehoerigkeit = firmenzugehoerigkeit;
    }

    public Enum getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(Enum abteilung) {
        Abteilung = abteilung;
    }
}
