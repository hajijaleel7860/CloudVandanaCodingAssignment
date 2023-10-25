import java.util.*;
    
	class Test121
	{
		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5, 6, 7};
		        shuffleArray(arr);

		        // Print the shuffled array
		        for (int element : arr) {
		            System.out.print(element + " ");
		        }
		    }

		    public static void shuffleArray(int[] array) {
		        int n = array.length;
		        Random random = new Random();

		        for (int i = n - 1; i > 0; i--) {
		            int j = random.nextInt(i + 1);
		            // Swap elements at i and j
		            int temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		        }
		    }
		}