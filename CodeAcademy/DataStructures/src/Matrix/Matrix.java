package Matrix;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // Using the provided 2D array
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        // Replace the number 4 in the 2D array with the number 0
        intMatrix[1][1] = 0;

        // Declare and initialize a new empty 2x2 integer 2D array called subMatrix
        int[][] subMatrix = new int[2][2];


        // Using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created. Afterwards, uncomment the provided print statement below.
        subMatrix[0][0] = intMatrix[0][0] * 5;
        subMatrix[0][1] = intMatrix[0][1] * 5;
        subMatrix[1][0] = intMatrix[1][0] * 5;
        subMatrix[1][1] = intMatrix[1][1] * 5;


        System.out.println(Arrays.deepToString(subMatrix));

        int[] seatsDayOne = {850007, 841141, 150017, 622393, 178505, 952093, 492450, 790218, 515994, 926666, 476090, 709827, 908660, 718422, 641067, 624652, 429205, 394328, 802772, 468793, 901979, 504963, 733939, 706557, 724430, 663772, 577480, 886333, 323197, 283056, 378922, 628641, 494605, 606387, 179993, 755472, 253608, 975198, 328457, 885712, 411958, 418586, 254970, 299345, 632115, 915208, 661570, 328375, 538422, 321303};

        int[] seatsDayTwo = {740912, 209431, 310346, 316462, 915797, 850440, 803140, 459194, 293277, 302424, 790507, 711980, 639916, 707446, 940339, 613076, 524157, 189604, 595934, 509691, 234133, 787575, 674602, 944308, 710345, 889699, 622393, 151931, 964325, 944568, 357684, 933857, 541190, 935076, 468848, 449446, 278951, 885503, 539124, 278723, 998622, 846182, 394328, 914002, 803795, 851135, 828760, 504936, 504322, 648644};

        int matchCounter = 0;
        // Fix the outer loop header to iterate through the first array of seats
        for (int i = 0; i < seatsDayOne.length; i++) {

            // Fix the inner loop header to iterate through the second array of seats
            for (int j = 0; j < seatsDayTwo.length; j++) {

                // Replace 1==2 with conditional logic to check if an element in the first array matches an element in the second array
                if (seatsDayOne[i] == seatsDayTwo[j]) {
                    matchCounter++;
                    System.out.println("Contestant: " + seatsDayOne[i] + ", Seat Day One: " + i + ", Seat Day Two: " + j);
                    break;
                }
            }
        }
        System.out.println("The total number of contestants reserving seats on both days was: " + matchCounter);

        int[][] intMatrixx = {
                {4, 6, 8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };
        // Store the number of subarrays of intMatrix into a variable called 'numSubArrays'

        int numSubArrays = intMatrix.length;
        System.out.println(numSubArrays);
        // Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength.
        int subArrayLength = intMatrix[0].length;
        System.out.println(subArrayLength);
        // Store the number of columns in intMatrix into a variable called 'columns'
        int columns = intMatrix[0].length;
        int rows = intMatrix.length;
        System.out.println(columns);
        System.out.println(rows);
        // Store the number of rows in intMatrix into a variable called 'rows'

        // Replace the outer and inner for loop headers to iterate through the entire 2D array. Use the iterators `i` for the outer loop and `j` for the inner loop.
        int sum = 0;
        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[0].length; j++) {
                // Insert a line of code to increase the variable `sum` by each accessed element
                sum += intMatrix[i][j];
            }
        }
        System.out.println(sum);


        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        //Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
        int characterCount = 0;

        for (String[] wordDatum : wordData) {
            for (String s : wordDatum) {
                characterCount += s.length();
            }

        }
        System.out.println(characterCount);

        //Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [i][j]. The formatted print statement has been provided.
        int i = 0;
        int j = 0;
        while (i < wordData.length) {
            j = 0;
            while (j < wordData[0].length) {

                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
        }


        double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};

        // Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
        double runnerTime = 0.0;
        for (int outer = 0; outer < times.length; outer++) {
            runnerTime = 0.0;
            for (int inner = 0; inner < times[0].length; inner++) {
                System.out.println("Runner index: " + outer + ", Time index: " + inner);
                // Enter the missing line of code to sum up the values in each row. Use the variable runnerTime
                runnerTime += times[outer][inner];

            }
            // Enter the missing line of code to find the average time of each runner. Use the variable averageVal
            double averageVal = 0;
            averageVal = runnerTime / times[0].length;


            System.out.println("Sum of runner " + outer + " times: " + runnerTime);
            System.out.println("Average of runner " + outer + ": " + averageVal);
        }


        // Given runner lap data
        double[][] times1 = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};

        // Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
        double lapTime = 0.0;
        for (int outer = 0; outer < times1[0].length; outer++) {
            lapTime = 0.0;
            for (int inner = 0; inner < times1.length; inner++) {
                System.out.println("Lap index: " + outer + ", Time index: " + inner);
                // Enter the missing line of code to sum up the values in each column. Use the variable lapTime
                lapTime += times1[inner][outer];

            }
            // Enter the missing line of code to find the average time of each lap. Use the variable averageVal
            double averageVal = 0;

            System.out.println("Sum of lap " + outer + " times: " + lapTime);
            System.out.println("Average time for lap " + outer + ": " + averageVal);
        }


        int[][] imageData = {{100, 90, 255, 80, 70, 255, 60, 50},
                {255, 10, 5, 255, 10, 5, 255, 255},
                {255, 255, 255, 0, 255, 255, 255, 75},
                {255, 60, 30, 0, 30, 60, 255, 255}};

        //First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
        int[][] newImage = new int[4][6];


        //Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.

        for (int k = 0; k < newImage.length; k++) {
            for (int l = 0; l < newImage[0].length; l++) {
                newImage[k][l] = imageData[k][l];

            }
        }
        System.out.println(Arrays.deepToString(newImage));

        //You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.

        for (int k = 0; k < newImage.length; k++) {
            for (int l = 0; l < newImage[0].length; l++) {
                if (newImage[k][l] - 50 < 0) {
                    newImage[k][l] = 0;
                } else {
                    newImage[k][l] -= 50;
                }
            }
        }
        System.out.println(Arrays.deepToString(newImage));


        //First, declare and initialize a 4x3 2D array of doubles called `scores` which will contain the exam data for four students. The rows will represent the student and the columns will represent the exam number. You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print the result in the console.

        double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}};


        System.out.println(Arrays.deepToString(scores));

        //The next set of exams have occurred. Using 4 lines of code, manually enter the scores (89.7, 90.5, 93.6, 88.1) for the second exam (column 1). Use the provided print statement to print the updated 2D array as well.
        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;

        System.out.println(Arrays.deepToString(scores));

        //You have realized that you will only be keeping track of 2 exam grades instead of 3. Declare and initialize an empty 4x2 2D array of double values  called newScores
        double[][] newScores = new double[4][2];

        for (int k = 0; k < newScores.length; k++) {
            for (int l = 0; l < newScores[0].length; l++) {
                newScores[k][l] = scores[k][l];

            }
        }
        //Using loops, copy all of the scores for exam 1 and 2 into the new 2D array. (do not include the -1 values)


        System.out.println(Arrays.deepToString(newScores));

        //You have allowed the students to complete an extra credit activity to contribute towards their scores. For all exam grades less than 90, add 2 additional points to the grade in `newScores`
        for (int k = 0; k < newScores.length; k++) {
            for (int l = 0; l < newScores[0].length; l++) {
                if (newScores[k][l] < 90) {
                    newScores[k][l] += 2;
                }
            }

        }
        System.out.println(Arrays.deepToString(newScores));
    }


    }


