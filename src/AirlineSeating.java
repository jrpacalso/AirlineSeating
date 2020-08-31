import java.util.Arrays;

public class AirlineSeating {

    public static void main(String[] args) {

        final int seats = 40;

        String[] pax = new String[seats];

        int row, column;
        for (int i = 0; i < seats; i++) {
            row = (i / 4) + 1;
            column = (i % 4) + 65;
            char newcolumn = (char) column;
            if (i < 40) {
                System.out.print(" ".repeat(7) + row + newcolumn + " ".repeat(7));
            }
            if ((i + 1) % 4 == 2) {
                System.out.print(" ".repeat(10));
            }
            if ((i + 1) % 4 == 0) {
                System.out.println();

                RealisticNameGenerator realNames = new RealisticNameGenerator();
                String[] realName = new String[2];
                for (int j = 0; j < 4; j++) {
                    realName = realNames.realisticName();
                    System.out.print(realName[0] + " ".repeat(20));
                }
                System.out.println("");
                for (int y = 0; y < 4; y++) {
                    realName = realNames.realisticName();
                    System.out.print(realName[1] + " ".repeat(20));
                }
                System.out.println("");
            }
        }
    }
}