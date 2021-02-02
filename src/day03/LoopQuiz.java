package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCorrect = 0,
            countIncorrect = 0;

        while(true) {

            int firstNumber = (int)(Math.random() * 100) + 1;
            int secondNumber = (int)(Math.random() * 100) + 1;

            // 기호를 결정할 랜덤 정수
            int markNum = (int) (Math.random() * 3);
            String mark = "+";
            switch (markNum) {
                case 0:
                    mark = "+";
                    break;
                case 1:
                    mark = "-";
                    break;
                case 2:
                    mark = "×";
                    break;
            }

            System.out.println("---------------");
            System.out.printf("%d %s %d = ?\n", firstNumber, mark ,secondNumber);
            System.out.println("> ");
            int userAnswer = scanner.nextInt();
            int correctAnswer;
            switch (mark) {
                case "+":
                    correctAnswer = firstNumber + secondNumber;
                    break;
                case "-":
                    correctAnswer = firstNumber - secondNumber;
                    break;
                case "×":
                    correctAnswer = firstNumber * secondNumber;
                    break;
                default:
                    correctAnswer = 0;
            }

            if(userAnswer == 0) {
                System.out.println("입력 종료!");
                break;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다!");
                countCorrect++;
            } else {
                System.out.println("틀렸습니다!");
                countIncorrect++;
            }
        }

        System.out.println("========================");
        System.out.println("정답 횟수: " + countCorrect);
        System.out.println("오답 횟수: " + countIncorrect);

        scanner.close();

    }

}
