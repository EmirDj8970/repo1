//void main(){
//
//    int[] numbers = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
//
//    int positive = 0;
//    int negative = 0;
//    int zero = 0;
//
//    for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] > 0) {
//            positive++;
//        } else if (numbers[i] < 0) {
//            negative++;
//        } else {
//            zero++;
//        }
//    }
//
//    System.out.print("Array:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    System.out.println("Positive: " + positive);
//    System.out.println("Negative: " + negative);
//    System.out.println("Zero: " + zero);
//
//}

//void main(){
//
//    int[] numbers = {12, 5, 28, 3, 19, 7, 15, 9};
//
//    int maxVal = numbers[0];
//    int maxIndex = 0;
//
//    int minVal = numbers[0];
//    int minIndex = 0;
//
//    for (int i = 1; i < numbers.length; i++) {
//        if (numbers[i] > maxVal) {
//            maxVal = numbers[i];
//            maxIndex = i;
//        }
//        if (numbers[i] < minVal) {
//            minVal = numbers[i];
//            minIndex = i;
//        }
//    }
//
//    System.out.print("Array:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    System.out.println("Largest: " + maxVal + " at index " + maxIndex);
//    System.out.println("Smallest: " + minVal + " at index " + minIndex);
//
//}

//void main(){
//
//    int[] numbers = {10, 20, 30, 40, 50, 60};
//
//    int sum = 0;
//    for (int i = 0; i < numbers.length; i++) {
//        sum += numbers[i];
//    }
//
//    // Делим на double (или приводим sum к double), чтобы среднее было дробным, как в примере (35.0)
//    double average = (double) sum / numbers.length;
//
//    int aboveAverage = 0;
//    for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] > average) {
//            aboveAverage++;
//        }
//    }
//
//    System.out.print("Array:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    System.out.println("Average: " + average);
//    System.out.println("Numbers above average: " + aboveAverage);
//
//}

//void main(){
//
//    int[] numbers = {3, 8, 12, 5, 9, 2, 7};
//
//    System.out.print("Original:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    System.out.print("Reversed:");
//    for (int i = numbers.length - 1; i >= 0; i--) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//}

//void main(){
//
//    Scanner scanner = new Scanner(System.in);
//    int[] scores = new int[5];
//
//    for (int i = 0; i < scores.length; i++) {
//        int input;
//        while (true) {
//            System.out.print("Enter score " + (i + 1) + " (0-100): ");
//            if (scanner.hasNextInt()) {
//                input = scanner.nextInt();
//                if (input >= 0 && input <= 100) {
//                    break;
//                }
//            } else {
//                scanner.next(); // очищаем некорректный ввод, если ввели не число
//            }
//            System.out.println("Invalid score. Please enter a number between 0 and 100.");
//        }
//        scores[i] = input;
//    }
//
//    int passed = 0;
//    int failed = 0;
//    int sum = 0;
//
//    for (int i = 0; i < scores.length; i++) {
//        sum += scores[i];
//        if (scores[i] >= 60) {
//            passed++;
//        } else {
//            failed++;
//        }
//    }
//
//    double average = (double) sum / scores.length;
//
//    System.out.print("Scores:");
//    for (int i = 0; i < scores.length; i++) {
//        System.out.print(" " + scores[i]);
//    }
//    System.out.println();
//
//    System.out.println("Passed: " + passed);
//    System.out.println("Failed: " + failed);
//    System.out.println("Average: " + average);
//
//}