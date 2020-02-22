import javafx.stage.Stage;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculateBonusTest {

    private Mitarbeiter mitarbeiter;
    private Integer yearsInCompany;
    private String mitarbeiterAbteilung;

    @BeforeEach
    void reset(){
        yearsInCompany = null;
        mitarbeiterAbteilung = null;
    }


    @Test
    void testCalculateBonus_noBonus_0Poststelle() {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_0Sekretariat() {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_0IT() {
        yearsInCompany = 0;
        mitarbeiterAbteilung = "IT";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_noBonus_1Sekretariat() {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));

    }

    @Test
    void testCalculateBonus_noBonus_1Poststelle() {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));

    }

    @Test
    void testCalculateBonus_noBonus_1IT() {
        yearsInCompany = 1;
        mitarbeiterAbteilung = "IT";
        assertEquals(0,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }


    @Test
    void testCalculateBonus_firstBonusLevel_2Poststelle() {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_2Sekretariat() {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_2IT() {
        yearsInCompany = 2;
        mitarbeiterAbteilung = "IT";
        assertEquals(50,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3IT() {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "IT";
        assertEquals(50,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3Sekretariat() {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_firstBonusLevel_3Poststelle() {
        yearsInCompany = 3;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(100,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4Sekretariat() {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4Poststelle() {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_4IT() {
        yearsInCompany = 4;
        mitarbeiterAbteilung = "IT";
        assertEquals(80,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9Poststelle() {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9Sekretariat() {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(160,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_9IT() {
        yearsInCompany = 9;
        mitarbeiterAbteilung = "IT";
        assertEquals(80,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10IT() {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "IT";
        assertEquals(120,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10Sekretariat() {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_10Poststelle() {
        yearsInCompany = 10;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75IT() {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "IT";
        assertEquals(120,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75Sekretariat() {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "Sekretariat";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_75Poststelle() {
        yearsInCompany = 75;
        mitarbeiterAbteilung = "Poststelle";
        assertEquals(240,mitarbeiter.calculateBonus(yearsInCompany, mitarbeiterAbteilung));
    }

    @Test
    void testCalculateBonus_secondBonusLevel_76XYZ() {
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
