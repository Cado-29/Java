package foodStalls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class maxDistance {
    public static void main(String args[]) {
        ArrayList<Integer> foodStalls = new ArrayList<>();
        foodStalls.add(7);
        foodStalls.add(3);
        foodStalls.add(4);
        foodStalls.add(1);
        sortStalls(foodStalls);
        // Collections.sort(foodStalls);
        System.out.println(foodStalls);
        int maxDistance = maxDis(foodStalls);
        System.out.println(maxDistance);
    }

    public static int maxDis(ArrayList<Integer> foodStalls) {
        int maxDistance = 0;
        for (int i=0; i<foodStalls.size()-1; i++) {
            if (foodStalls.get(i+1) - foodStalls.get(i) > maxDistance) {
                maxDistance = foodStalls.get(i+1) - foodStalls.get(i);
            }
        }
        return maxDistance;
    }


    public static ArrayList<Integer> sortStalls(ArrayList<Integer> foodStalls) {
        int temp;
        for (int i=0; i<foodStalls.size() - 1; i++) {
            int count = 0;
            boolean swapped = false;
            for (int j=0; j<foodStalls.size()-1-i; j++) {
                System.out.println(++count);
                if (foodStalls.get(j) > foodStalls.get(j+1)) {
                    temp = foodStalls.get(j);
                    foodStalls.set(j, foodStalls.get(j+1));
                    foodStalls.set(j+1, temp);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return foodStalls;
    }
}