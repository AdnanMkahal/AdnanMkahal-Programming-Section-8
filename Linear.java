package LinearSearchAlgorithm;

public class Linear {
    
    public static int LinearSearch(int key, int[] item) {
        for (int i = 0; i < item.length; i++) {
            if (key == item[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void LinearSearch2(int k, int[] item) {
        for (int i = 0; i < item.length; i++) {
            if (k == item[i]) {
                System.out.println(k + " is found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;
        
        int x = LinearSearch(key, array);
        
        if (x == -1) {
            System.out.println(key + " is not found.");
        } else {
            System.out.println(key + " is found at index " + x);
        }
    }
}
