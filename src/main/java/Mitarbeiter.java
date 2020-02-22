public class Mitarbeiter {
    public int Firmenzugehoerigkeit;
    public String Abteilung;
    public int bonus;

    public int calculateBonus( int Firmenzugehoerigkeit, String abteilung) throws Exception {
        bonus = 0;
        abteilung = abteilung.toLowerCase();
        plausabilitaetspruefung(Firmenzugehoerigkeit);

        if (Firmenzugehoerigkeit >= 2 && Firmenzugehoerigkeit <4) {
            //50%
            bonus = 50;
        } else if (Firmenzugehoerigkeit >= 4 && Firmenzugehoerigkeit <10) {
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
                    bonus = bonus* 2;
                    break;

                case "poststelle":
                    bonus =bonus* 2;
                    break;

                default:
                    break;
            }
        }
        return bonus;
    }

    void plausabilitaetspruefung(int firmenzugehoerigkeit) throws Exception {

        if (firmenzugehoerigkeit>75 || firmenzugehoerigkeit <0 )
        {
            throw new Exception("Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!");
        }
    }
}
