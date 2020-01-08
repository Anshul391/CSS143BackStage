
class IntWrap {
    int val;

    public IntWrap(int val) {
        this.val = val;
    }
}

public class BubbleSortMain {

    public static void main(String[] args) {
        System.out.println("testSwap " + (testSwap() ? "PASSED" : "FAILED"));
        System.out.println("testBubbleSort " + (testBubbleSort() ? "PASSED" : "FAILED"));
    }

    public static void bubbleSort(int []data) {
        for (int i=0; i<data.length-1; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j]<data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static boolean testBubbleSort() {
        int testSize = 10;
        int []data = new int[testSize];
        for (int i=0; i<testSize; i++) {
            data[i] = i;
        }

        bubbleSort(data);

        for (int i=0; i<testSize; i++) {
            if (data[i]!=testSize-1-i) {
                return false;
            }
        }
        return true;
    }

    public static void swap(IntWrap x, IntWrap y) {
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }

    public static boolean testSwap() {
        int a = 1, b = 2;
        IntWrap aWrap = new IntWrap(a);
        IntWrap bWrap = new IntWrap(b);

        swap(aWrap, bWrap);
        a = aWrap.val;
        b = bWrap.val;

        if (a==2 && b==1) {
            return true;
        }
        return false;
    }


}
