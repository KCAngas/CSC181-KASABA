class ObjectCounter {
    // Static variable to keep track of the count
    private static int count = 0;

    // Constructor increments the count when an object is created
    public ObjectCounter() {
        count++;
    }

    // Static method to get the count of instantiated objects
    public static int getCount() {
        return count;
    }
}

public class CountObject {
    public static void main(String[] args) {
        // Create multiple instances of ObjectCounter
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Get the count of instantiated objects
        int objectCount = ObjectCounter.getCount();

        // Print the count
        System.out.println("Number of instantiated objects: " + objectCount);
    }
}
