import java.util.*;

public class CRUDCollection {

    public static void main(String[] args) {

        // ================= ARRAYLIST =================
        // Used to store student names
        ArrayList<String> students = new ArrayList<>();

        // CREATE
        students.add("Aniket");
        students.add("Pratham");
        students.add("Vansh");

        System.out.println("ArrayList (Student Names): " + students);

        // ================= HASHMAP =================
        // Used to store student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // CREATE
        studentMap.put(101, "Aniket");
        studentMap.put(102, "Pratham");
        studentMap.put(103, "Vansh");

        System.out.println("\nHashMap (Student Records): " + studentMap);

        // READ
        System.out.println("Read (ID 102): " + studentMap.get(102));

        // UPDATE
        studentMap.put(102, "Aman Patel");
        System.out.println("After Update: " + studentMap);

        // DELETE
        studentMap.remove(101);
        System.out.println("After Delete: " + studentMap);

        // ================= TREEMAP =================
        // Automatically sorts by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(studentMap);

        System.out.println("\nTreeMap (Sorted Records): " + sortedMap);
    }
}