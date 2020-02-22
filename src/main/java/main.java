import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter();
        int firmenzugehoerigkeit;
        String position;
        //System.out.println(mitarbeiter1.calculateBonus(120,"sekretARIat"));


        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Geben Sie Ihre Firmenzugehörigkeit an (0-75): ");

        // get their input as a String
        firmenzugehoerigkeit = scanner.nextInt();

        // prompt for their age
        System.out.print("Geben Sie Ihre Position an: ");

        // get the age as an int
        position = scanner.next();

        System.out.println(mitarbeiter1.calculateBonus(firmenzugehoerigkeit, position.toLowerCase()));
        System.out.println(String.format("Ihre Firmenzugehoerigkeit: %d, in der Position %s", firmenzugehoerigkeit, position.toLowerCase()));
    }
}
