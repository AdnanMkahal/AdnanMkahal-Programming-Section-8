package BinarySearchAlgorithm;

public class Binary {
    
    public static int binarySearch(int key, int[] item) {
        int left = 0;
        int right = item.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (item[mid] == key) {
                return mid;
            } else if (item[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;
        
        int x = binarySearch(key, array);
        
        if (x == -1) {
            System.out.println(key + " is not found.");
        } else {
            System.out.println(key + " is found at index " + x);
        }
    }
}

