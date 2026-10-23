//void main() {
//
//    Scanner scanner = new Scanner(System.in);
//
//    int menu = 0;
//    int total = 0;
//    int items = 0;
//
//    while (menu != 5 ) {
//        System.out.println();
//        System.out.println("===== Магазин элитных товаров ===== ");
//        System.out.println();
//        System.out.println("1. NVIDIA Blackwell B200          - 41759$");
//        System.out.println("2. Ryzen Threadripper PRO 9995WX  - 13275$");
//        System.out.println("3. 256 ГБ DDR5 ECC RDIMM          - 10946$");
//        System.out.println("4. Nimbus Data ExaDrive           - 46837$");
//        System.out.println("5. К оформлению заказа");
//        System.out.println();
//        System.out.println("Выберите товар: ");
//
//        menu = scanner.nextInt();
//        int a = 0;
//
//        if (menu == 1) {
//            System.out.println("Вы выбрали: NVIDIA Blackwell B200");
//            a += 41759;
//        }
//        else if (menu == 2) {
//            System.out.println("Вы выбрали: Ryzen Threadripper PRO 9995WX");
//            a += 13275;
//        }
//        else if (menu == 3) {
//            System.out.println("Вы выбрали: 256 ГБ DDR5 ECC RDIMM");
//            a += 10946;
//        }
//        else if (menu == 4) {
//            System.out.println("Вы выбрали: Nimbus Data ExaDrive");
//            a += 46837;
//        }
//        else if (menu == 5)
//            System.out.println();
//        else {
//            System.out.println("Ошибка 984: Похоже вы выбрали не существующий вариант");
//            System.out.println("Пожалуйста, выберите вариант от 1 до 5");
//        }
//
//        if (menu >= 1 && menu <= 4) {
//            System.out.println("Цена: " + a + "$");
//            System.out.println("Сколько хотите таких? ");
//            int quantity = scanner.nextInt();
//            total += (a * quantity);
//            items += quantity;
//            System.out.println();
//            System.out.println("Добавлено в корзину");
//            System.out.println("Сейчас вы потратите " + total + "$");
//        }
//
//
//    }
//
//    int discount = 0;
//    if (total >= 200000) {
//        discount = total / 10;
//    }
//
//    int superTotal = total - discount;
//
//    System.out.println("===== Оформление заказа =====");
//    System.out.println();
//    System.out.println("Всего товаров: " + items);
//    System.out.println("Вам придётся отдать мне " + total);
//    System.out.println();
//
//    if (discount > 0) {
//        System.out.println("Вы купили слишком много. Поэтому вам скидка 10%!");
//        System.out.println("Скидка " + discount + "$");
//    }
//
//    System.out.println("Итого " + superTotal + "$");
//
//    int payment = 0;
//
//    while (payment < superTotal) {
//        System.out.println("Введите сумму платежа: ");
//        int b = scanner.nextInt();
//        payment += b;
//
//        if (payment < superTotal) {
//            int c = superTotal - payment;
//            System.out.println("Мало!");
//            System.out.println("Мне нужно ещё " + c + "$");
//        }
//    }
//
//    System.out.println("Успешно оплачено!");
//
//    int change = payment - superTotal;
//
//    System.out.println("=========================");
//    System.out.println(" Магазин элитных товаров ");
//    System.out.println("=========================");
//    System.out.println();
//    System.out.println("Товаров:          " + items);
//    System.out.println("Начальная цена:   " + total + "$");
//    System.out.println("Скидка:           " + discount + "$");
//    System.out.println("Итоговая цена:    " + superTotal + "$");
//    System.out.println("Оплата:           " + payment + "$");
//    System.out.println("Изменилось:       " + change + "$");
//    System.out.println();
//    System.out.println("========================");
//    System.out.println(" Thank you for shopping! ");
//    System.out.println("========================");
//}


//StudyTracker


//void main() {
//
//    Scanner scanner = new Scanner(System.in);
//
//    int studyTime = 0;
//    int sessions = 0;
//
//    int prog = 0;
//    int math = 0;
//    int eng = 0;
//    int other = 0;
//
//    int menu = 0;
//
//    while (menu != 4) {
//        System.out.println("===== STUDY TRACKER =====");
//        System.out.println("1. Add study session");
//        System.out.println("2. View statistics");
//        System.out.println("3. Check weekly goal");
//        System.out.println("4. Exit");
//        System.out.print("Choose an option: ");
//
//        menu = scanner.nextInt();
//
//        if (menu == 1) {
//            System.out.println("Choose subject:");
//            System.out.println("1. Programming");
//            System.out.println("2. Mathematics");
//            System.out.println("3. English");
//            System.out.println("4. Other");
//            System.out.print("Choose an option: ");
//
//            int subject = scanner.nextInt();
//
//            if (subject >= 1 && subject <= 4) {
//                System.out.print("Study time in minutes: ");
//                int minutes = scanner.nextInt();
//
//                if (minutes > 0) {
//                    if (subject == 1) {
//                        prog = prog + minutes;
//                    }
//                    else if (subject == 2) {
//                        math = math + minutes;
//                    }
//                    else if (subject == 3) {
//                        eng = eng + minutes;
//                    }
//                    else if (subject == 4) {
//                        other = other + minutes;
//                    }
//
//                    studyTime = studyTime + minutes;
//                    sessions = sessions + 1;
//
//                    System.out.println("Study session added!");
//                    System.out.println("Current total study time: " + studyTime + " minutes");
//                }
//                else {
//                    System.out.println("Invalid study time. Time must be greater than 0.");
//                }
//            }
//            else {
//                System.out.println("Invalid subject choice.");
//            }
//        }
//        else if (menu == 2) {
//            System.out.println("===== WEEKLY STATISTICS =====");
//            System.out.println("Study sessions: " + sessions);
//            System.out.println("Total study time: " + studyTime + " minutes");
//            System.out.println("Programming: " + prog + " minutes");
//            System.out.println("Mathematics: " + math + " minutes");
//            System.out.println("English: " + eng + " minutes");
//            System.out.println("Other: " + other + " minutes");
//        }
//        else if (menu == 3) {
//            System.out.println("Weekly goal: 600 minutes");
//            System.out.println("You studied: " + studyTime + " minutes");
//
//            if (studyTime >= 600) {
//                System.out.println("Weekly goal achieved!");
//            }
//            else {
//                int remaining = 600 - studyTime;
//                System.out.println("Remaining: " + remaining + " minutes");
//            }
//        }
//        else if (menu != 4) {
//            System.out.println("Invalid option. Choose between 1 and 4.");
//        }
//    }
//
//    System.out.println("Study tracker closed. Keep up the good work!");
//}


//GradeTracker


//void main () {
//    Scanner scanner = new Scanner(System.in);
//
//    double assignmentPoints = 0;
//    int assignmentCount = 0;
//
//    double examPoints = 0;
//    int examCount = 0;
//
//    int option = 0;
//
//    while (option != 4) {
//        System.out.println("===== SEMESTER GRADE TRACKER =====");
//        System.out.println("1. Add assignment result");
//        System.out.println("2. Add exam result");
//        System.out.println("3. View current grade");
//        System.out.println("4. Exit");
//        System.out.print("Choose an option: ");
//
//        option = scanner.nextInt();
//
//        if (option == 1) {
//            System.out.print("Enter assignment score: ");
//            double score = scanner.nextDouble();
//
//            if (score >= 0 && score <= 100) {
//                assignmentPoints = assignmentPoints + score;
//                assignmentCount = assignmentCount + 1;
//                System.out.println("Assignment score added.");
//                System.out.println();
//            } else {
//                System.out.println("Invalid score. Enter a value from 0 to 100.");
//                System.out.println();
//            }
//
//        } else if (option == 2) {
//            System.out.print("Enter exam score: ");
//            double score = scanner.nextDouble();
//
//            if (score >= 0 && score <= 100) {
//                examPoints = examPoints + score;
//                examCount = examCount + 1;
//                System.out.println("Exam score added.");
//                System.out.println();
//            } else {
//                System.out.println("Invalid score. Enter a value from 0 to 100.");
//                System.out.println();
//            }
//
//        } else if (option == 3) {
//            if (assignmentCount == 0 && examCount == 0) {
//                System.out.println("No results available yet.");
//                System.out.println();
//            } else {
//                System.out.println("===== CURRENT RESULTS =====");
//                System.out.println("Assignments completed: " + assignmentCount);
//
//                double assignmentAverage = 0;
//                if (assignmentCount > 0) {
//                    assignmentAverage = assignmentPoints / assignmentCount;
//                    System.out.println("Assignment average: " + assignmentAverage);
//                } else {
//                    System.out.println("Assignment average: N/A");
//                }
//
//                System.out.println("Exams completed: " + examCount);
//
//                double examAverage = 0;
//                if (examCount > 0) {
//                    examAverage = examPoints / examCount;
//                    System.out.println("Exam average: " + examAverage);
//                } else {
//                    System.out.println("Exam average: N/A");
//                }
//
//                double overallAverage = 0;
//                if (assignmentCount > 0 && examCount > 0) {
//                    overallAverage = assignmentAverage * 0.50 + examAverage * 0.50;
//                } else if (assignmentCount > 0) {
//                    overallAverage = assignmentAverage;
//                    System.out.println("(Only assignment scores available; overall average matches assignment average)");
//                } else {
//                    overallAverage = examAverage;
//                    System.out.println("(Only exam scores available; overall average matches exam average)");
//                }
//
//                System.out.println("Overall average: " + overallAverage);
//
//                if (overallAverage >= 90) {
//                    System.out.println("Grade: A");
//                } else if (overallAverage >= 80) {
//                    System.out.println("Grade: B");
//                } else if (overallAverage >= 70) {
//                    System.out.println("Grade: C");
//                } else if (overallAverage >= 60) {
//                    System.out.println("Grade: D");
//                } else {
//                    System.out.println("Grade: F");
//                }
//
//                if (overallAverage >= 60) {
//                    System.out.println("Status: Passing");
//                    System.out.println();
//                } else {
//                    System.out.println("Status: Failing");
//                    System.out.println();
//                }
//            }
//
//        } else if (option != 4) {
//            System.out.println("Invalid option. Choose between 1 and 4.");
//            System.out.println();
//        }
//    }
//}


//ScreenTimeTracker


void main() {
    Scanner scanner = new Scanner(System.in);

    int socialMediaTime = 0;
    int gamingTime = 0;
    int studyingTime = 0;
    int streamingTime = 0;

    int totalScreenTime = 0;
    int totalSessions = 0;

    int option = 0;

    while (option != 6) {
        System.out.println("===== SCREEN-TIME TRACKER =====");
        System.out.println("1. Add social media time");
        System.out.println("2. Add gaming time");
        System.out.println("3. Add studying time");
        System.out.println("4. Add video or streaming time");
        System.out.println("5. View statistics");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");

        option = scanner.nextInt();

        if (option >= 1 && option <= 4) {
            if (option == 1) {
                System.out.print("Enter social media minutes: ");
            } else if (option == 2) {
                System.out.print("Enter gaming minutes: ");
            } else if (option == 3) {
                System.out.print("Enter studying minutes: ");
            } else if (option == 4) {
                System.out.print("Enter streaming minutes: ");
            }

            int minutes = scanner.nextInt();

            if (minutes > 0) {
                if (option == 1) {
                    socialMediaTime = socialMediaTime + minutes;
                } else if (option == 2) {
                    gamingTime = gamingTime + minutes;
                } else if (option == 3) {
                    studyingTime = studyingTime + minutes;
                } else if (option == 4) {
                    streamingTime = streamingTime + minutes;
                }

                totalScreenTime = totalScreenTime + minutes;
                totalSessions = totalSessions + 1;

                System.out.println("Time added successfully!");
                System.out.println();
            } else {
                System.out.println("Invalid time. Minutes must be greater than 0.");
                System.out.println();
            }

        } else if (option == 5) {
            System.out.println("===== TODAY'S SCREEN TIME =====");
            System.out.println("Social media: " + socialMediaTime + " minutes");
            System.out.println("Gaming: " + gamingTime + " minutes");
            System.out.println("Studying: " + studyingTime + " minutes");
            System.out.println("Streaming: " + streamingTime + " minutes");
            System.out.println("Total screen time: " + totalScreenTime + " minutes");
            System.out.println("Recorded sessions: " + totalSessions);

            int entertainmentTime = socialMediaTime + gamingTime + streamingTime;

            if (studyingTime > entertainmentTime) {
                System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
            } else if (entertainmentTime > studyingTime) {
                System.out.println("Entertainment screen time is greater than study time.");
            } else {
                System.out.println("Study and entertainment screen time are equal.");
            }

            if (totalScreenTime < 120) {
                System.out.println("Category: Low screen time");
                System.out.println();
            } else if (totalScreenTime <= 240) {
                System.out.println("Category: Moderate screen time");
                System.out.println();
            } else {
                System.out.println("Category: High screen time");
                System.out.println();
            }

        } else if (option != 6) {
            System.out.println("Invalid option. Choose between 1 and 6.");
            System.out.println();
        }
    }

    System.out.println("Screen-time tracker closed.");
}