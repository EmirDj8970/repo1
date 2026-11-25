//1.

//void main() {
//    int[][] a = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    for(int i = 0; i < a.length; i++) {
//        for(int j = 0; j < a[i].length; j++){
//            System.out.print(a[i][j] + " ");
//        }
//        System.out.println();
//    }
//}

//-----------------------------------------------------------------------------------

//2.

//void main(){
//    int[][] a = {
//            {5,10,15},
//            {20,25,30}
//    };
//    System.out.println(a[1][2]);
//    System.out.println();
//
//    a[0][1] = 99;
//
//    for(int i = 0; i < a.length; i++) {
//        for(int j = 0; j < a[i].length; j++){
//            System.out.print(a[i][j] + " ");
//        }
//        System.out.println();
//    }
//}

//-----------------------------------------------------------------------------------

//3.

//void main(){
//    int[][] a={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    int sum=0;
//    for(int i=0;i<a.length;i++) {
//        for(int j=0;j<a[i].length;j++){
//            sum=sum+a[i][j];
//        }
//    }
//    System.out.println(sum);
//}

//----------------------------------------------------------------------------------

//4.

//void main(){
//    int[][] a={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    int odd=0;
//    int even=0;
//    for(int i=0;i<a.length;i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            if (a[i][j] % 2 == 0) {
//                even = even + 1;
//            } else if (a[i][j] % 2 != 0) {
//                odd = odd + 1;
//            }
//        }
//    }
//    System.out.println("Even numbers: " + even);
//    System.out.println("Odd numbers: " + odd);
//}

//----------------------------------------------------------------------------------

//5.

//void main(){
//    int[][] a = {
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12}
//    };
//    int smV=a[0][0];
//    int laV=a[0][0];
//    for(int i=0;i<a.length;i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            if (a[i][j]>laV){
//                laV = a[i][j];
//            }
//            else if (a[i][j]<smV){
//                smV=a[i][j];
//            }
//        }
//    }
//    System.out.println("Largest: " + laV);
//    System.out.println("Smallest: " + smV);
//}

//------------------------------------------------------------------------------

//6.

//void main(){
//    Scanner scanner = new Scanner(System.in);
//    int[][] a = new int[2][3];
//
//    System.out.println("Enter 6 integers for a 2x3 matrix:");
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            a[i][j] = scanner.nextInt();
//        }
//    }
//
//    System.out.println("Matrix:");
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            System.out.print(a[i][j] + " ");
//        }
//        System.out.println();
//    }
//}

//------------------------------------------------------------------------------

//7.

//void main(){
//    int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };
//
//    for (int col = 0; col < matrix[0].length; col++) {
//        int colSum = 0;
//        for (int row = 0; row < matrix.length; row++) {
//            colSum += matrix[row][col];
//        }
//        System.out.println("Column " + col + " sum: " + colSum);
//    }
//}

//------------------------------------------------------------------------------

//8.

//void main(){
//    int[][] a = {
//            {10, 25, 8},
//            {30, 15, 42},
//            {5, 19, 27}
//    };
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter threshold: ");
//    int threshold = scanner.nextInt();
//
//    int count = 0;
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            if (a[i][j] > threshold) {
//                count++;
//            }
//        }
//    }
//
//    System.out.println("Values above " + threshold + ": " + count);
//}

//------------------------------------------------------------------------------

//9.

//void main(){
//    int[][] a = {
//            {4, 9, 2},
//            {7, 9, 6},
//            {1, 8, 3}
//    };
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter value to search: ");
//    int target = scanner.nextInt();
//
//    boolean found = false;
//    for (int row = 0; row < a.length && !found; row++) {
//        for (int col = 0; col < a[row].length; col++) {
//            if (a[row][col] == target) {
//                System.out.println("Found at row " + row + ", column " + col);
//                found = true;
//                break;
//            }
//        }
//    }
//
//    if (!found) {
//        System.out.println("Not found");
//    }
//}

//------------------------------------------------------------------------------

//10.

//void main(){
//    int[][] a = {
//            {4, 7, 2},
//            {9, 5, 1},
//            {3, 8, 6}
//    };
//
//    int sum = 0;
//    System.out.print("Main diagonal:");
//    for (int i = 0; i < a.length; i++) {
//        System.out.print(" " + a[i][i]);
//        sum += a[i][i];
//    }
//    System.out.println();
//    System.out.println("Sum: " + sum);
//}

//------------------------------------------------------------------------------

//11.

//void main(){
//    int[][] a = {
//            {5, -3, 8},
//            {-1, 0, -7},
//            {4, -2, 9}
//    };
//
//    System.out.println("Before:");
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            System.out.print(a[i][j] + " ");
//        }
//        System.out.println();
//    }
//
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            if (a[i][j] < 0) {
//                a[i][j] = 0;
//            }
//        }
//    }
//
//    System.out.println("After:");
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            System.out.print(a[i][j] + " ");
//        }
//        System.out.println();
//    }
//}

//------------------------------------------------------------------------------

//12.

//void main(){
//    int[][] grades = {
//            {80, 90, 75, 85},
//            {60, 70, 65, 75},
//            {95, 88, 92, 85}
//    };
//
//    int maxScore = grades[0][0];
//    int totalSum = 0;
//    int totalCount = 0;
//
//    for (int i = 0; i < grades.length; i++) {
//        int studentSum = 0;
//        for (int j = 0; j < grades[i].length; j++) {
//            int score = grades[i][j];
//            studentSum += score;
//            totalSum += score;
//            totalCount++;
//
//            if (score > maxScore) {
//                maxScore = score;
//            }
//        }
//        double studentAvg = (double) studentSum / grades[i].length;
//        System.out.println("Student " + (i + 1) + " average: " + studentAvg);
//    }
//
//    double overallAvg = (double) totalSum / totalCount;
//    System.out.println("Class maximum: " + maxScore);
//    System.out.println("Overall average: " + overallAvg);
//}