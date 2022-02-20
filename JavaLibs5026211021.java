import javax.swing.JOptionPane;

public class JavaLibs5026211021 {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
                "Hello everyone! Welcome to"
                        + "\nJavaLibs5026211021 Game! ",
                "JavaLibs5026211021 Game",
                1);

        JOptionPane.showMessageDialog(null,
                "We will give you 17 questions and we will create a story based on your answers",
                "JavaLibs5026211021 Game",
                1);

        JOptionPane.showMessageDialog(null,
                "Let's just start the game!",
                "JavaLibs5026211021 Game",
                1);

        String fullName = (String) JOptionPane.showInputDialog(null,
                "What's your name?",
                "Question 1",
                3,
                null,
                null,
                "fullname");

        String nickName = (String) JOptionPane.showInputDialog(null,
                "What's your nickname?",
                "Question 2",
                3,
                null,
                null,
                "nickname");

        String pronouns;
        String[] genderArray = {"Male", "Female"};
        String gender = (String) JOptionPane.showInputDialog(null,
                "What is your gender?",
                "Question 3",
                3,
                null,
                genderArray,
                genderArray[0]);
        if (gender == "Male") {
            pronouns = "His";
        } else {
            pronouns = "Her";
        }

        String food = (String) JOptionPane.showInputDialog(null,
                "What did you eat this morning?",
                "Question 4",
                3,
                null,
                null,
                "chicken nugget");

        String[] foodSourceArray = {"made by self", "made by mom", "Gofood"};
        String foodSource = (String) JOptionPane.showInputDialog(null,
                "Where do you get the " + food + " from?",
                "Question 5",
                3,
                null,
                foodSourceArray,
                foodSourceArray[0]);
        if (foodSource == foodSourceArray[0]) {
            if (gender == "Male") {
                foodSource = "made by himself";
            } else foodSource = "made by herself";
        } else if (foodSource == foodSourceArray[1]) {
            foodSource = "made by " + pronouns + " mom";
        } else {
            foodSource = "from Gofood";
        }

        String stringPrice;
        if(foodSource == "Gofood") {
            stringPrice = (String) JOptionPane.showInputDialog(null,
                    "How much does the Gofood cost? (Rupiah)",
                    "Question 6",
                    3,
                    null,
                    null,
                    10000);
        } else {
            stringPrice = (String) JOptionPane.showInputDialog(null,
                    "How much does the ingredient cost? (Rupiah)",
                    "Question 7",
                    3,
                    null,
                    null,
                    10000);
        }
        int intPrice = Integer.parseInt(stringPrice);

        String kindOfAnimal = (String) JOptionPane.showInputDialog(null,
                "What animal do you like?",
                "Question 8",
                3,
                null,
                null,
                "cat");

        String animalCharacter = (String) JOptionPane.showInputDialog(null,
                "What is the character of the " + kindOfAnimal + " that you like?",
                "Question 9",
                3,
                null,
                null,
                "cute");

        String fishCharacter = (String) JOptionPane.showInputDialog(null,
                " What do you like about fish?",
                "Question 10",
                3,
                null,
                null,
                "fishy");

        String laterActivities = (String) JOptionPane.showInputDialog(null,
                "What activities will you do after this?",
                "Question 11",
                3,
                null,
                null,
                "jogging around the city");

        JOptionPane.showMessageDialog(null,
                "Don't worry, there are only 6 questions left, cheer up!",
                "Short Info",
                1);

        String stringDecimalNumber = (String) JOptionPane.showInputDialog(null,
                "from 0 to 1, which number do you prefer?",
                "Question 12",
                3,
                null,
                null,
                0.753);
        double doubleDecimalNumber = Double.parseDouble(stringDecimalNumber);

        String vehicle = (String) JOptionPane.showInputDialog(null,
                "What's your favorite vehicle?",
                "Question 13",
                3,
                null,
                null,
                "bike");

        String areaOfResidence = (String) JOptionPane.showInputDialog(null,
                "Where do you live?",
                "Question 14",
                3,
                null,
                null,
                "Surabaya");

        String dreamPlace = (String) JOptionPane.showInputDialog(null,
                "Where is the place you really want to visit?",
                "Question 15",
                3,
                null,
                null,
                "Tokyo");

        String crushName = (String) JOptionPane.showInputDialog(null,
                "Who is your crush?",
                "Question 16",
                3,
                null,
                null,
                "nickname");

        String futureDream = (String) JOptionPane.showInputDialog(null,
                "What are your goals in life?"
                + "\nMy dream is to become ...",
                "Question 17",
                3,
                null,
                null,
                "programmer");

        JOptionPane.showMessageDialog(null,
                "All questions have been answered well.",
                "GOOD JOB",
                1);

        JOptionPane.showMessageDialog(null,
                "And next is the result of the story based on the answers you entered",
                "Result",
                1);

        JOptionPane.showMessageDialog(null,
                "RESULT : "
                        + "\n" + pronouns + " name is " + fullName + ", usually called " + nickName + ". " + pronouns + " hobby is eating " + food + " " + foodSource + "."
                        + "\nThe " + food + " is very " + animalCharacter + " and " + fishCharacter + ". Because of the food, the money in " + pronouns + " wallet was only Rp" + intPrice + "."
                        + "\nHe spends " + doubleDecimalNumber + " (" + 100*doubleDecimalNumber + "%)" + " of his time for " + laterActivities + ". In addition, he collects a lot of " + vehicle
                        + "\nand enjoys using it to travel back and forth from " + areaOfResidence + " to " + dreamPlace + " with " + crushName + " while bringing " + pronouns + " " + kindOfAnimal + "."
                        + "\nLastly, " + pronouns + " goal is to become a " + futureDream + ".",
                "Final Result",
                1);
    }
}