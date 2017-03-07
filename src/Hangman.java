
public class Hangman {

//what methods an i carve out of Main? -- load file/load array, get user input, evaluate, print



    void Hangman(){}

    private static void printMan(Integer i) {
        switch(i) {
            case 1:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            case 2:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "  |       |\n" +
                        "  |       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            case 3:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "  |--     |\n" +
                        "  |       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            case 4:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "--|--     |\n" +
                        "  |       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            case 5:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "--|--     |\n" +
                        "  |_      |\n" +
                        "    |     |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            case 6:
                System.out.printf("-----------\n" +
                        "  |       |\n" +
                        " ( )      |\n" +
                        "--|--     |\n" +
                        " _|_      |\n" +
                        "|   |     |\n" +
                        "          |\n" +
                        "------------------------\n");
                break;
            default:
                System.out.println("default");
        }
    }
}
