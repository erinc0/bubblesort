import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         int[]array = createRandomArray(0);  
         writeArrayToFile(array, "unsorted.txt");
         System.out.println(Arrays.toString(array));
         bubbleSort(array);
         writeArrayToFile(array, "sorted.txt");
         System.out.println(Arrays.toString(array));
    }

    public static int[] readArrayFromFile(String filename) throws FileNotFoundException {
        Scanner yellow = new Scanner(new File (filename));
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (yellow.hasNextLine()){
        arrayList.add(Integer.parseInt(yellow.nextLine()));
    }
        yellow.close();
        int[] array=new int[arrayList.size()];
        for(int i = 0; i<arrayList.size(); i++){
    }
        return array;
}
    public static void writeArrayToFile(int[] array, String filename) throws IOException {
         try (FileWriter fileWriter = new FileWriter(filename)) {
         for (int i = 0; i< array.length; i ++){
            fileWriter.write(array[i] + "\n");
            
        }
      } 
    }

    public static int[] createRandomArray(int length){
        System.out.println("Please enter how many elements you would like in the array!");
        Scanner louis= new Scanner(System.in); 
        int q;
        q =louis.nextInt();
        int [] array = new int[q];
        louis.close();

        int miau;
        Random random = new Random(0);  
         for(miau = 0; miau< array.length; miau++){
          array[miau] = random.nextInt(0, 100);
    }
         return array;
}

    public static void bubbleSort(int[] array){
        bubbleSort(array, 0, array.length);
}

    public static void woof(int[] array, int i, int k){
        int meow= array[i];
        array[i]= array[k];
        array[k] = meow;
}

    public static void bubbleSort(int[] array, int start, int end){
        if (end - start <= 1)
        return;
        for (int i = start; i < end -1; i++){
        if (array[i]> array[i+1]){
        woof(array, i, i+1);

    }
  }
        bubbleSort(array, start, end -1);
 }

}




