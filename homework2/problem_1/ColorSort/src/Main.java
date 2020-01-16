/*
CSS143B homework 2, problem 1
by [your name]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("testColorSort " + (testColorSort() ? "PASSED" : "FAILED"));
    }

    public static void colorSort(int[] nums) {
        // homework
        return; // place holder
    }

    public static boolean testColorSort() {
        int inputs[][] = {
                {1,2,0},
                {2,1,2,0},
        };
        int expects[][] = new int[inputs.length][];
        getCorrectAnswers(inputs, expects);


        boolean anyFailed = false;

        for (int i=0; i<inputs.length; i++) {
            colorSort(inputs[i]);

            for (int j=0; j<inputs[i].length; j++) {
                if (inputs[i][j]!=expects[i][j]) {
                    System.out.printf("testColorSort: case %d failed, expected: %s, actual %s\n",
                            i, Arrays.toString(expects[i]), Arrays.toString(inputs[i]));
                    anyFailed = true;
                    break;
                }
            }
        }
        return !anyFailed;
    }

    private static void getCorrectAnswers(int[][] inputs, int[][]expects) {
        for (int i=0; i<inputs.length; i++) {
            expects[i] = inputs[i].clone();
            Arrays.sort(expects[i]);
        }
    }
}
