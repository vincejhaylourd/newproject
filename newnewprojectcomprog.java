import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class PeriodicTableQuiz {
    public static final Map<String, String> ELEMENTS = new HashMap<>();

    static {
        ELEMENTS.put("Hydrogen", "H");
        ELEMENTS.put("Helium", "He" );
        ELEMENTS.put("Lithium", "Li");
        ELEMENTS.put("Beryllium", "Be");
        ELEMENTS.put("Boron", "B");
        ELEMENTS.put("Carbon", "C");
        ELEMENTS.put ("Nitrogen", "N");
        ELEMENTS.put("Oxygen", "O");
        ELEMENTS.put("Fluorine", "F");
        ELEMENTS.put("Neon", "Ne");
        ELEMENTS.put("Sodium", "Na");
        ELEMENTS.put("Magnesium", "Mg");
        ELEMENTS.put("Aluminum", "Al");
        ELEMENTS.put("Silicon", "Si");
        ELEMENTS.put("Phosphorus", "P");
        ELEMENTS.put("Sulfur", "S");
        ELEMENTS.put("Chlorine", "Cl");
        ELEMENTS.put("Argon", "Ar");
        ELEMENTS.put("Potassium","K");
        ELEMENTS.put("Calcium", "Ca");
        ELEMENTS.put("Scandium", "Sc");
        ELEMENTS.put("Titanium", "Ti");
        ELEMENTS.put("Vanadium", "V");
        ELEMENTS.put("Chromium", "Cr");
        ELEMENTS.put("Manganese", "Mn");
        ELEMENTS.put("Iron", "Fe");
        ELEMENTS.put("Cobalt", "Co");
        ELEMENTS.put("Nickle", "Ne");
        ELEMENTS.put("Copper", "Cu");
        ELEMENTS.put("Zinc", "Zn");
        ELEMENTS.put("Gallium", "Ga");
        ELEMENTS.put("Gemanium", "Ge");
        ELEMENTS.put("Arsenic", "As");
        ELEMENTS.put("Selenium", "Se");
        ELEMENTS.put("Bromine", "Br");
        ELEMENTS.put("Krypton", "Kr");
        ELEMENTS.put("Rubidium", "Rb");
        ELEMENTS.put("Strontium", "Sr");
        ELEMENTS.put("Yttrium", "Y");
        ELEMENTS.put("Zirconium", "Zr");
        ELEMENTS.put("Niobium", "Nb");
        ELEMENTS.put("Molybdenum", "Mo");
        ELEMENTS.put("Technetium", "Tc");
        ELEMENTS.put("Ruthenium", "Ru");
        ELEMENTS.put("Rhodium", "Rh");
        ELEMENTS.put("Palladium", "Pd");
        ELEMENTS.put("Silver", "Ag");
        ELEMENTS.put("Cadmium", "Cd");
        ELEMENTS.put("Indium", "In");
        ELEMENTS.put("Tin", "Sn");
        ELEMENTS.put("Antinomy","Sb");
        ELEMENTS.put("Tellurium","Te");
        ELEMENTS.put("Iodine","I");
        ELEMENTS.put("Xenon","Xe");
        ELEMENTS.put("Cesium","Cs");
        ELEMENTS.put("Barium", "Ba");
        ELEMENTS.put("Lanthanum","La");
        ELEMENTS.put("Cerium","Ce");
        ELEMENTS.put("Praseodymium","Pr");
        ELEMENTS.put("Neodymium","Nd");
        ELEMENTS.put("Promenthium","Pm");
        ELEMENTS.put("Samarium","Sm");
        ELEMENTS.put("Europium","Eu");
        ELEMENTS.put("Gadolinuim","Gd");
        ELEMENTS.put("Terbium","Tb");
        ELEMENTS.put("Dysprosium","Dy");
        ELEMENTS.put("Holmium","Ho");
        ELEMENTS.put("Erbium","Er");
        ELEMENTS.put("Thulium","Tm");
        ELEMENTS.put("Ytterbium","Yb");
        ELEMENTS.put("Lutetium","Lu");
        ELEMENTS.put("Hafnium","Hf");
        ELEMENTS.put("Tantalum","Ta");
        ELEMENTS.put("Tungsten","W");
        ELEMENTS.put("Rhenium","Re");
        ELEMENTS.put("Osmium","Os");
        ELEMENTS.put("Iridium","Ir");
        ELEMENTS.put("Platinum","Pt");
        ELEMENTS.put("Gold","Au");
        ELEMENTS.put("Mercury","Hg");
        ELEMENTS.put("Thallinum","TI");
        ELEMENTS.put("Lead","Pb");
        ELEMENTS.put("Bismuth","Bi");
        ELEMENTS.put("Polonium","Po");
        ELEMENTS.put("Astatine","At");
        ELEMENTS.put("Radon","Rn");
        ELEMENTS.put("Francium","Fr");
        ELEMENTS.put("Radium","Ra");
        ELEMENTS.put("Actinium","Ac");
        ELEMENTS.put("Thorium","Th");
        ELEMENTS.put("Protactinium","Pa");
        ELEMENTS.put("Uranium","U");
        ELEMENTS.put("Neptunium","Np");
        ELEMENTS.put("Plutonium","Pu");
        ELEMENTS.put("Americium","Am");
        ELEMENTS.put("Curium","Cm");
        ELEMENTS.put("Berkelium","Bk");
        ELEMENTS.put("Calfornium","Cf");
        ELEMENTS.put("Einteinium","Es");
        ELEMENTS.put("Fernium","Fm");
        ELEMENTS.put("Mendelevium","Md");
        ELEMENTS.put("Nobelium","No");
        ELEMENTS.put("Lawrencium","Lr");
        ELEMENTS.put("Rutherfordium","Rf");
        ELEMENTS.put("Dubnium","Db");
        ELEMENTS.put("Seaborgium","Sg");
        ELEMENTS.put("Bohrium","Bh");
        ELEMENTS.put("Hassium","Hs");
        ELEMENTS.put("Meitnerium","Mt");
        ELEMENTS.put("Darmstadtium","Ds");
        ELEMENTS.put("Roentgenium","Rg");
        ELEMENTS.put("Conpernicium","Cn");
        ELEMENTS.put("Nhonium","Nh");
        ELEMENTS.put("Flervium","Fl");
        ELEMENTS.put("Moscovium","Mc");
        ELEMENTS.put("Livermorium","Lv");
        ELEMENTS.put  ("Tennessine","Ts");
        ELEMENTS.put ("Oganesson","Og");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, We are team Control Z and Welcome to our Periodic Table Quiz");
        System.out.println("Before you start, " + "there are 2 option that you want to quiz, so GOODLUCKKK!. " + "And now, may i have the pleasure of knowing you?\nPlease enter your Name : ");
        String Name = scanner.nextLine();
        System.out.println("\nGoodluck "+Name+"!");
        
        


        while (true) {
            System.out.println("Periodic Table Quiz");
            System.out.println("Select your option:");
            System.out.println("1. Quiz Answering Symbol");
            System.out.println("2. Quiz Answering Element");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    quizWithElements(scanner);
                    break;
                case 2:
                    quizWithSymbols(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void quizWithElements(Scanner scanner) {
        List<String> elements = new ArrayList<>(ELEMENTS.keySet());

        int score = 0;
        int totalQuestions = 10; // Number of questions
        for (int i = 0; i < totalQuestions; i++) {
            String element = elements.get(i);
            String symbol = ELEMENTS.get(element);

            System.out.println("Question " + (i + 1) + ": What is the symbol for '" + element + "'?");
            String userAnswer = scanner.next().trim();

            if (userAnswer.equalsIgnoreCase(symbol)) {
                System.out.println("Correct!");
                score++;
            } 

            else {
                System.out.println("Incorrect! The correct answer is: " + symbol);
            }
        }

        System.out.println("Quiz ended! Your score is: " + score + " out of " + totalQuestions);
    }
        System.out.println("Thankyou for answering our quiz");

    private static void quizWithSymbols(Scanner scanner) {
        List<String> elements = new ArrayList<>(ELEMENTS.keySet());

        int score = 0;
        int totalQuestions = 10; // Number of questions
        for (int i = 0; i < totalQuestions; i++) {
            String element = elements.get(i);
            String symbol = ELEMENTS.get(element);

            System.out.println("Question " + (i + 1) + ": What is the element for " + symbol + "'?");
            String userAnswer = scanner.next().trim();

            if (userAnswer.equalsIgnoreCase(element)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + element);
            }
        }

        System.out.println("Quiz ended! Your score is: " + score + " out of " + totalQuestions);
        System.out.println("Thankyou for Answering");
    }
}
