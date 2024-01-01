public class RuntimeMeasurement {
    public static void main(String[] args) {
        int n = 10000; // Input size, change as needed

        long startTime = System.nanoTime();

        // Code to measure (e.g., O(n) algorithm)
        for (int i = 0; i < n; i++) {
            // Your code here
        }

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time (in nanoseconds): " + elapsedTime);
    }
}
