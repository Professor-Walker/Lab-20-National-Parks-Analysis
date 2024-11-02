public class Main
{
    public static void main(String[] args)
    {
        Park ca[] = new Park[4];
        Park other[] = new Park[6];

        ca[0] = new Park("Sequoia", "California", 404062.63, 1153198,"Known for the giant sequoia trees, including General Sherman, the largest tree on earth.");
        ca[1] = new Park("Joshua Tree", "California", 795155.85, 3058294,"Famous for its unique Joshua Trees, desert landscapes, and rock formations.");
        ca[2] = new Park("Yosemite", "California", 761747.5, 3667550, "Famous for its stunning granite cliffs, waterfalls, giant sequoias, and diverse ecosystems.");
        ca[3] = new Park("Death Valley", "California", 3408395.63, 1128862, "Known for extreme heat and the lowest point in North America, Badwater Basin.");

        other[0] = new Park("Grand Canyon", "Arizona", 1201647.03, 4732101, "Known for it's massive three-tiered canyon of multi-colored layers carved out by the Colorado River.");
        other[1] = new Park("Bryce Canyon", "Utah", 35835.08, 2354660, "A geological amphitheater on southern Utah's Paunsaugunt Plateau with hundreds of tall, multicolored sandstone hoodoos formed by erosion.");
        other[2] = new Park("Carlsbad Caverns", "New Mexico", 46766.45, 390932, "Famous for it's caves, including The Big Room which is nearly 4000 feet long.");
        other[3] = new Park("Haleakalā", "Hawaii", 33488.98, 1086616, "Known as a volcano on Maui this park protects the greatest number of endagered species within a U.S. national park.");
        other[4] = new Park("Hawai`i Volcanoes", "Hawaii", 344812.18, 1580961,"This park on the Big Island protects the Kīlauea and Mauna Loa volcanoes, two of the world's most active geological features.");
        other[5] = new Park("New River Gorge", "West Virginia", 7021, 1593523, "Known for some of the country's best white water rafting.");

        welcome();
        String selection1;
        int selection2;
        do
        {
            System.out.println("Would you like to see the National Parks I visited in California, or in other states?");
            selection1 = UtilityBelt.readString("Please enter CA, other, or exit.", 1,10);

            if(selection1.equalsIgnoreCase("CA"))
            {
                for(int i = 0; i < ca.length; i++)
                {
                    System.out.println(i + ": " + ca[i].getName());
                }
                System.out.println("Would you like more information about one of these parks?");
                selection2 = UtilityBelt.readInt("Enter the number for the park or 99 to return to the main menu.",0,99);
                if(selection2<ca.length)
                {
                    System.out.println(ca[selection2]);
                }
                System.out.println();
            }
            if(selection1.equalsIgnoreCase("other"))
            {
                for(int i = 0; i < other.length; i++)
                {
                    System.out.println(i + ": " + other[i].getName());
                }
                System.out.println("Would you like more information about one of these parks?");
                selection2 = UtilityBelt.readInt("Enter the number for the park or 99 to return to the main menu.",0,99);
                if(selection2<other.length)
                {
                    System.out.println(other[selection2]);
                }
                System.out.println();
            }

        }while(!selection1.equalsIgnoreCase("exit"));

        goodbye();
    }

    public static void welcome()
    {
        System.out.println("Welcome to my program! Let's learn about National Parks.");
        System.out.println("\nThe United States has 63 national parks, which are congressionally designated protected areas operated by the National Park Service, an agency of the Department of the Interior. National parks are designated for their natural beauty, unique geological features, diverse ecosystems, and recreational opportunities, typically \"because of some outstanding scenic feature or natural phenomena. While legislatively all units of the National Park System are considered equal with the same mission, national parks are generally larger and more of a destination, and hunting and extractive activities are prohibited.\n");
    }

    public static void goodbye()
    {
        System.out.println("Thank you for using my program. Good bye!");
    }
}
