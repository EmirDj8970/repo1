void main() {
    Scanner scanner = new Scanner(System.in);

// 1.

//    int a = 0000;
//    int b = 3;
//    boolean c = false;
//
//    while (b > 0 && !c) {
//        System.out.print("Enter PIN: ");
//        int enteredPin = scanner.nextInt();
//
//        if (enteredPin == a) {
//            System.out.println("Access granted!");
//            c = true;}
//        else {
//            b = b - 1;
//            System.out.println("Incorrect PIN.");
//            System.out.println("Attempts left: " + b);
//            System.out.println();} }
//
//    if (!c) {
//        System.out.println("Card blocked.");}

// 2.

//    int number = 4;
//    int attempts = 5;
//    boolean victory = false;
//
//    while (attempts > 0 && !victory) {
//        System.out.println("Введите число: ");
//        int playersNumber = scanner.nextInt();
//
//        if (playersNumber == number) {
//            System.out.println("Ты выйграл!");
//            victory = true;
//        }
//        else if (playersNumber < number) {
//            attempts = attempts - 1;
//            System.out.println("Слишком мало");
//            System.out.println("Осталось попыток: " + attempts);
//        }
//        else if (playersNumber > number) {
//            attempts = attempts - 1;
//            System.out.println("Слишком много");
//            System.out.println("Осталось попыток: " + attempts);
//        }
//    }
//
//    if (!victory) {
//        System.out.println("Вы проиграли :(");
//        System.out.println("Правильный ответ: " + number);
//    }

// 3.

//    int posn = 0;
//    int negan = 0;
//    int zeros = 0;
//    int evenn = 0;
//    int oddn = 0;
//
//    for (int i = 1; i <= 10; i++) {
//        System.out.println("Вветите число" + i + ": ");//;)
//        int n = scanner.nextInt();
//
//        if (n > 0) {
//            posn = posn + 1;
//        }
//        else if (n < 0) {
//            negan = negan + 1;
//        }
//        else if (n == 0) {
//            zeros = zeros + 1;
//        }
//
//        if (n % 2 == 0) {
//            evenn = evenn + 1;
//        }
//        else if (n % 2 > 0) {
//            oddn = oddn + 1;
//        }
//    }
//
//    System.out.println("===== STATISTICS =====");
//    System.out.println("Positive numbers: " + posn);
//    System.out.println("Negative numbers: " + negan);
//    System.out.println("Zeros: " + zeros);
//    System.out.println("Even numbers: " + evenn);
//    System.out.println("Odd numbers: " + oddn);

// 4.

//    System.out.println("==Simple ATM==");
//    int a = 0000;
//    int b = 3;
//    boolean c = false;
//
//    while (b > 0 && !c) {
//        System.out.print("Enter PIN: ");
//        int enteredPin = scanner.nextInt();
//
//        if (enteredPin == a) {
//            System.out.println("Access granted!");
//            c = true;}
//        else {
//            b = b - 1;
//            System.out.println("Incorrect PIN.");
//            System.out.println("Attempts left: " + b);
//            System.out.println();} }
//
//    if (!c) {
//        System.out.println("Card blocked.");}
//
//    int menu = 0;
//    int balance = 1000;
//
//    while (menu != 4) {
//        System.out.println("===== ATM MENU =====");
//        System.out.println("1. Check balance");
//        System.out.println("2. Deposit money");
//        System.out.println("3. Withdraw money");
//        System.out.println("4. Exit");
//        System.out.print("Choose an option: ");
//        menu = scanner.nextInt();
//
//        if (menu == 1) {
//            System.out.println("Current balance: $" + balance);
//        }
//        else if (menu == 2) {
//            System.out.print("Enter deposit amount: ");
//            int deposit = scanner.nextInt();
//
//            if (deposit > 0) {
//                balance = balance + deposit;
//                System.out.println("Successfully deposited!");
//                System.out.println("Updated balance: $" + balance);
//            }
//            else {
//                System.out.println("Invalid amount");
//            }
//        }
//        else if (menu == 3) {
//            System.out.print("Enter withdrawal amount: ");
//            int withdraw = scanner.nextInt();
//
//            if (withdraw <= 0) {
//                System.out.println("Invalid amount");
//            } else if (withdraw > balance) {
//                System.out.println("Cannot withdraw more than current balance.");
//            } else { //;)
//                balance = balance - withdraw;
//                System.out.println("Successfully withdrawn!");
//                System.out.println("Updated balance: $" + balance);
//            }
//        }
//        else {
//                System.out.println("Thank you for using Simple ATM!");
//        }
//    }

}