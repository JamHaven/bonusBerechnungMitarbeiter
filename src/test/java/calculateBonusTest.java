import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculateBonusTest {


    private Mitarbeiter mitarbeiter;
    private Integer yearsInCompany;
    private String mitarbeiterAbteilung;

    public calculateBonusTest() throws Exception {
        mitarbeiter = new Mitarbeiter();
    }

    @BeforeEach
    void reset(){
        yearsInCompany = null;
        mitarbeiterAbteilung = null;
    }


    @Test
    void testCalculateBonus_noBonus_0Poststelle() throws Exception {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_0Sekretariat() throws Exception {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_0IT() throws Exception {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "IT";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_1Sekretariat() throws Exception {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));

    }

    @Test
    void testCalculateBonus_noBonus_1Poststelle() throws Exception {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));

    }

    @Test
    void testCalculateBonus_noBonus_1IT() throws Exception {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "IT";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }


    @Test
    void testCalculateBonus_firstBonusLevel_2Poststelle() throws Exception {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_2Sekretariat() throws Exception {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_2IT() throws Exception {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "IT";
        assertEquals(50,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3IT() throws Exception {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "IT";
        assertEquals(50,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3Sekretariat() throws Exception {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3Poststelle() throws Exception {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4Sekretariat() throws Exception {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4Poststelle() throws Exception {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4IT() throws Exception {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "IT";
        assertEquals(80,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9Poststelle() throws Exception {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9Sekretariat() throws Exception {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9IT() throws Exception {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "IT";
        assertEquals(80,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10IT() throws Exception {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "IT";
        assertEquals(120,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10Sekretariat() throws Exception {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10Poststelle() throws Exception {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75IT() throws Exception {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "IT";
        assertEquals(120,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75Sekretariat() throws Exception {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75Poststelle() throws Exception {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_76XYZ() throws Exception {
        yearsInCompany = 76;
        mitarbeiterAbteilung = "XYZ";
        assertEquals(120,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }


    @Test
    void testCalculateBonus_secondBonusLevel_76Poststelle() {
        yearsInCompany = 76;
        mitarbeiterAbteilung = "Poststelle";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_76Sekretariat() {
        yearsInCompany = 76;
        mitarbeiterAbteilung = "Sekretariat";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_76IT() {
        yearsInCompany = 76;
        mitarbeiterAbteilung = "IT";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_negativePoststelle() {
        yearsInCompany = -1;
        mitarbeiterAbteilung = "Poststelle";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_negativeSekretariat() {
        yearsInCompany = -1;
        mitarbeiterAbteilung = "Sekretariat";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_negativeIT() {
        yearsInCompany = -1;
        mitarbeiterAbteilung = "IT";

        Exception exception = assertThrows(Exception.class, () -> {
            mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung);
        });

        String expectedMessage = "Plausabilitätsprüfung nicht bestanden! Firmenzugehörigkeit muss zwischen 0 und 75 liegen!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
