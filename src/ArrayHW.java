//void main(){
//
//    int[] numbers = {33, -24, -98, 17, -75, 2, 46, 8, -61, -50};
//
//    System.out.print("Original:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    int replacements = 0;
//
//    for(int i = 0; i < numbers.length; i++){
//        if (numbers[i] < 0) {
//            numbers[i] = 0;
//            replacements++;
//        }
//    }
//
//    System.out.print("Modified:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    System.out.println("Replacements: " + replacements);
//
//}

//void main(){
//
//    int[] numbers = {10, 25, 8, 30, 15, 30};
//
//    System.out.print("Array:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    int largest = numbers[0];
//    for (int i = 1; i < numbers.length; i++) {
//        if (numbers[i] > largest) {
//            largest = numbers[i];
//        }
//    }
//
//    boolean hasSecond = false;
//    int secondLargest = 0;
//
//    for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] < largest) {
//            if (!hasSecond || numbers[i] > secondLargest) {
//                secondLargest = numbers[i];
//                hasSecond = true;
//            }
//        }
//    }
//
//    System.out.println("Largest: " + largest);
//    if (hasSecond) {
//        System.out.println("Second largest: " + secondLargest);
//    } else {
//        System.out.println("No second largest distinct number.");
//    }
//
//}

//void main() {
//
//    int[] numbers = {10, 20, 30, 40, 50};
//    int count = numbers.length;
//
//    System.out.print("Original:");
//    for (int i = 0; i < count; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    Scanner scanner = new Scanner(System.in);
//    int index;
//
//    while (true) {
//        System.out.print("Enter index to remove: ");
//        if (scanner.hasNextInt()) {
//            index = scanner.nextInt();
//            if (index >= 0 && index < count) {
//                break;
//            }
//        } else {
//            scanner.next();
//        }
//        System.out.println("Invalid index. Enter a number from 0 to " + (count - 1) + ".");
//    }
//
//    for (int i = index; i < count - 1; i++) {
//        numbers[i] = numbers[i + 1];
//    }
//    count--;
//
//    System.out.print("Updated:");
//    for (int i = 0; i < count; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//}

//void main() {
//
//    int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
//
//    System.out.print("Array:");
//    for (int i = 0; i < numbers.length; i++) {
//        System.out.print(" " + numbers[i]);
//    }
//    System.out.println();
//
//    boolean foundDuplicate = false;
//    StringBuilder duplicatesOutput = new StringBuilder();
//
//    for (int i = 0; i < numbers.length; i++) {
//        int current = numbers[i];
//
//        // Проверяем, не встречалось ли это число раньше (чтобы не дублировать вывод)
//        boolean alreadyChecked = false;
//        for (int k = 0; k < i; k++) {
//            if (numbers[k] == current) {
//                alreadyChecked = true;
//                break;
//            }
//        }
//        if (alreadyChecked) {
//            continue;
//        }
//
//        // Считаем, сколько раз current появляется дальше в массиве
//        int count = 0;
//        for (int j = i + 1; j < numbers.length; j++) {
//            if (numbers[j] == current) {
//                count++;
//            }
//        }
//
//        if (count > 0) {
//            foundDuplicate = true;
//            duplicatesOutput.append(" ").append(current);
//        }
//    }
//
//    if (foundDuplicate) {
//        System.out.println("Duplicate numbers:" + duplicatesOutput);
//    } else {
//        System.out.println("No duplicate numbers found.");
//    }
//
//}