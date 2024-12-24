import java.util.Scanner;



class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

class Candidate {
    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String candidateName = scanner.nextLine();
        Candidate candidate = new Candidate(candidateName);
        Question[] questions = {
                new Question("1 byte equals to?", "8 bits"),
                new Question("What is OOP?", "Object-Oriented Programming"),
                new Question("Capital of France?", "Paris"),
                new Question("2 + 2 equals to?", "4")
        };

        int score = 0;

        System.out.println("\nWelcome, " + candidate.getName() + "! Let's start the quiz.");


        for (Question question : questions) {
            System.out.println(question.getText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + question.getAnswer());
            }
        }


        System.out.println("\nQuiz finished! You scored " + score + " out of " + questions.length);
    }
}




