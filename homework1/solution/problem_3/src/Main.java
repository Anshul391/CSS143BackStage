/*
CSS143B homework 1, problem 3
by [your name]
 */


class Answer {
    private int val;
    private boolean isValid;

    public Answer(int maxNumber, boolean foundAnswer) {
        this.val = maxNumber;
        this.isValid = foundAnswer;
    }

    public boolean equals(Answer anotherAnswer) {
        return val == anotherAnswer.val &&
                isValid == anotherAnswer.isValid;
    }

    @Override
    public String toString() {
        return "MaxNumberAnswer{" +
                "maxNumber=" + val +
                ", foundAnswer=" + isValid +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("testFindHighestFrequencyNumber " + (testFindHighestFrequencyNumber() ? "PASSED" : "FAILED"));
    }

    public static Answer findHighestFrequencyNumber(int[] data) {
        if (data.length==0) {
            return new Answer(-1, false);
        }

        // sort the array
        bubbleSort(data);

        // for the max freq number
        int curr = data[0];
        int freq = 1;
        int maxfreq = 1;
        int answer = curr;

        for (int i=1; i<data.length; i++) {
            if (curr==data[i]) {
                freq++;

                // reset the max if a new winner is found
                if (freq > maxfreq) {
                    maxfreq = freq;
                    answer = curr;
                }
                continue;
            }

            // reset the counting
            curr = data[i];
            freq = 1;
        }

        return new Answer(answer, true); // place holder
    }

    public static void bubbleSort(int[] data) {
        for (int i=0; i<data.length-1; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static boolean testFindHighestFrequencyNumber() {
        // prepare the answers
        int inputs[][] = {
                {},
                {7},
                {-1},
                {2, 2},
                {4, 4, 3},
                {6, 5, -1, 6},
                {7, 8, 9, 8, 8},
                {5, 5, 5, 6, 6},
                {5, 5, 6, 6, 6},
                {4, 4, 5, 5, 5, 6, 6, 6},
                {2, 2, 1, 1, 2}};
        int values[] = {-1, 7, -1, 2, 4, 6, 8, 5, 6, 5, 2};
        Answer[] answers = new Answer[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            answers[i] = new Answer(values[i], (i == 0 ? false : true));
        }

        // compare answer. return false if any case fails. true otherwise
        for (int i = 0; i < inputs.length; i++) {

            Answer actual = findHighestFrequencyNumber(inputs[i]);
            Answer expected = answers[i];

            if (!expected.equals(actual)) {
                System.out.printf("Case %d: Expected %s, actual %s\n", i, expected, actual);
                return false;
            }
        }
        return true;
    }
}
