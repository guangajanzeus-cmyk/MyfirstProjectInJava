import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        String[] questions = {"What does BPO stand for? ",
                "Which of the following is the most important skill for a call center agent?",
                "What should you do first when answering a customer's call?",
                "What does \"Technical Support\" mainly do?",
                "Which attitude is best when talking to customers?",};

        String[][] options = {{"1. Business Processing Unit", "2. Business Process Outsourcing", "3. Basic Process Operation", "4. Business Product Outsourcing"},
                {"1. Fast Typing", "2. Communication", "3. Drawing", "4. Cooking"},
                {"1. Hang up", "2. Introduce Yourself politely", "3. Ask for money", "4. Ignore the Customer"},
                {"1. Cook Food", "2. Repair Customer technical issues", "3. Drive a truck", "4. Sell Clothes"},
                {"1. Angry", "2. Patient", "3. Lazy", "4. Rude"}};

        int[] answer = {2, 2, 2, 2, 2};
        int score = 0;
        int guess = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("QUALFON CONTACT CENTER QUIZ");
        System.out.println("==========================");


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();


            if (guess == answer[i]) {
                System.out.println("========");
                System.out.println("CORRECT!!!");
                System.out.println("========");
                score++;
            }
            else {
                System.out.println("========");
                System.out.println("WRONG!");
                System.out.println("========");
            }
        }

        System.out.println("Your Score is: " + score + "/" + questions.length);

        scanner.close();

    }
}
