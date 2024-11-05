public class MemoryDemo11 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        runtime.gc();  // Trigger garbage collection

        System.out.println("Free Memory after garbage collection: " + runtime.freeMemory());
    }
}
