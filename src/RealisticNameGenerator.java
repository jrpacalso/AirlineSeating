import java.util.Random;

public class RealisticNameGenerator {

    private static final String[] lastNames = {
            "Johnson",
            "Williams",
            "Brown",
            "Jones",
            "Garcia",
            "Miller",
            "Davis",
            "Rodriguez",
            "Martinez",
            "Hernandez",
            "Lopez",
            "Gonzalez",
            "Wilson",
            "Anderson",
            "Thomas",
            "Taylor",
            "Moore",
            "Jackson",
            "Martin",
            "Lee",
            "Irakliotis"};

    private static final String[] firstNamesMale = {
            "James",
            "John",
            "Robert",
            "Michael",
            "William",
            "David",
            "Richard",
            "Charles",
            "Joseph",
            "Thomas",
            "Christopher",
            "Daniel",
            "Paul",
            "Mark",
            "Donald",
            "George",
            "Kenneth",
            "Steven",
            "Edward",
            "Brian",
            "Leo"};

    private static final String[] firstNameFemale = {
            "Mary",
            "Patricia",
            "Linda",
            "Barbara",
            "Elizabeth",
            "Jennifer",
            "Maria",
            "Susan",
            "Margaret",
            "Dorothy",
            "Lisa",
            "Nancy",
            "Karen",
            "Betty",
            "Helen",
            "Sandra",
            "Donna",
            "Carol",
            "Ruth",
            "Sharon",
            "Michelle"};

    public String[] realisticName () {

        int lastNamesCount = lastNames.length;
        int maleFirstNamesCount = firstNamesMale.length;
        int femaleFirstNamesCount = firstNameFemale.length;

        int gender;

        String[] name = new String[2];

        Random rand = new Random();

        gender = rand.nextInt(2);

        name[1] = lastNames[rand.nextInt(lastNamesCount)];

        if (gender == 0) {                     // female first name
            name[0] = firstNameFemale[rand.nextInt(femaleFirstNamesCount)];
        } else {                               // male first name
            name[0] = firstNamesMale[rand.nextInt(maleFirstNamesCount)];
        }

        return name;
    }

    public static void main(String[] args) {
        final int N = 20;
        RealisticNameGenerator realNames = new RealisticNameGenerator();
        String[] realName = new String[2];
        for (int i = 0;  i<N; i++) {
            realName = realNames.realisticName();
            System.out.println(realName[0] + " " + realName[1]);
        }
    }
}
