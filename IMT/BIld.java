package IMT;


import java.util.UUID;

public class BIld<bild> {
    public static void main(String[] args) {
        int arraySize = 5;

        // Create an array of UUIDs
        UUID[] uuidArray = new UUID[arraySize];

        // Fill the array with random UUIDs
        for (int i = 0; i < arraySize; i++) {
            uuidArray[i] = UUID.randomUUID();
        }

        // Print the UUIDs in the array
        for (int i = 0; i < arraySize; i++) {
            System.out.println("UUID " + (i + 1) + ": " + uuidArray[i]);
        }
    }
}








        //String[][] bild = new String[graphische.getI()][graphische.getJ()];
        // UUID uuid  = UUID.randomUUID();
        //  System.out.println("UUID = " + uuid.toString());


        //bild[0][1] = graphische.getUuid();


