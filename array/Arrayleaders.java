package array;

import java.util.ArrayList;

public class Arrayleaders {
        // Function to find the leaders in the array
        public static ArrayList<Integer> findLeaders(int[] arr) {
            ArrayList<Integer> leaders = new ArrayList<>();
            // Traverse the array from right to left
            for (int i = 1; i<arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    leaders.add(arr[i-1]);
                }
            }
            
            return leaders;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 4, 6, 8, 5, 9, 4};
            ArrayList<Integer> leaders = findLeaders(arr);
            System.out.println(leaders);
        }
    }
    
