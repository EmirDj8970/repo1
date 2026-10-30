//void calculateGrade(int score) {
//    if (score < 0 || score > 100) {
//        System.out.println("Invalid score");
//    } else if (score >= 90) {
//        System.out.println("A");
//    } else if (score >= 80) {
//        System.out.println("B");
//    } else if (score >= 70) {
//        System.out.println("C");
//    } else if (score >= 60) {
//        System.out.println("D");
//    } else {
//        System.out.println("F");
//    }
//}
//
//void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter your score (0-100): ");
//    int yrscore = scanner.nextInt();
//
//    calculateGrade(yrscore);
//}



void rightT(int rows) {
        System.out.println("Size: " + rows + " Pattern: Right Triangle");
        int a = 1;
        while (a <= rows) {
            int b = 1;
            while (b <= a) {
                System.out.print("*");
                b = b + 1;
            }
            System.out.println();
            a = a + 1;
        }
    }

void invertedRightT(int rows) {
        System.out.println("Size: " + rows + " Pattern: Inverted Right Triangle");
        int a = rows;
        while (a >= 1) {
            int b = 1;
            while (b <= a) {
                System.out.print("*");
                b = b + 1;
            }
            System.out.println();
            a = a - 1;
        }
    }

void pyramid(int rows) {
        System.out.println("Size: " + rows + " Pattern: Pyramid");
        int a = 1;
        while (a <= rows) {
            int spaces = rows - a;
            int s = 1;
            while (s <= spaces) {
                System.out.print(" ");
                s = s + 1;
            }
            int stars = 2 * a - 1;
            int st = 1;
            while (st <= stars) {
                System.out.print("*");
                st = st + 1;
            }
            System.out.println();
            a = a + 1;
        }
    }

void invertedPyramid(int rows) {
        System.out.println("Size: " + rows + " Pattern: Inverted Pyramid");
        int a = rows;
        while (a >= 1) {
            int spaces = rows - a;
            int s = 1;
            while (s <= spaces) {
                System.out.print(" ");
                s = s + 1;
            }
            int stars = 2 * a - 1;
            int st = 1;
            while (st <= stars) {
                System.out.print("*");
                st = st + 1;
            }
            System.out.println();
            a = a - 1;
        }
    }

void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1)
            rightT(rows);
        else if (choice == 2)
            invertedRightT(rows);
        else if (choice == 3)
            pyramid(rows);
        else if (choice == 4)
            invertedPyramid(rows);
        else
            System.out.println("Invalid choice!");


        scanner.close();
}
