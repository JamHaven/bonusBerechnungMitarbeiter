public class Mitarbeiter {
    public int Firmenzugehoerigkeit;
    public String Abteilung;
    public int bonus;

    public Mitarbeiter(int Firmenzugehoerigkeit, String Abteilung) throws Exception {
        Plausabilitaetspruefung(Firmenzugehoerigkeit);

        this.setAbteilung(Abteilung.toLowerCase());
        this.setFirmenzugehoerigkeit(Firmenzugehoerigkeit);
    }

    public int getFirmenzugehoerigkeit() {
        return Firmenzugehoerigkeit;
    }

    public void setFirmenzugehoerigkeit(int firmenzugehoerigkeit) {
        Firmenzugehoerigkeit = firmenzugehoerigkeit;
    }

    public String getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(String abteilung) {
        Abteilung = abteilung;
    }

    public int calculateBonus( int Firmenzugehoerigkeit, String abteilung) throws Exception {
        bonus = 0;

        Plausabilitaetspruefung(Firmenzugehoerigkeit);

        if (Firmenzugehoerigkeit >= 2) {
            //50%
            bonus = 50;
        } else if (Firmenzugehoerigkeit >= 4) {
            //80%
            bonus = 80;
        } else if (Firmenzugehoerigkeit >= 10) {
            //120%
            bonus = 120;
        } else if (Firmenzugehoerigkeit >= 0 && Firmenzugehoerigkeit < 2) {
            //kein Bonus
            bonus = 0;
        }

        if (bonus != 0) {
            switch (abteilung) {
                case "sekretariat":
                    bonus *= 2;
                    break;

                case "poststelle":
                    bonus *= 2;
                    break;

                default:
                    break;
            }
        }
        return bonus;
    }

    private void Plausabilitaetspruefung(int firmenzugehoerigkeit) throws Exception {

        if (firmenzugehoerigkeit>75 && firmenzugehoerigkeit <0 )
        {
            throw new Exception("Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!");
        }
    }
}
