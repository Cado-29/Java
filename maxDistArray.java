public class maxDistArray {
    public static void main(String[] args) {
        int[] foodStalls = {7,1,4,3};
        sortStalls(foodStalls);
        System.out.println(foodStalls[1]);
        print(foodStalls);
    }

    public static int[] sortStalls(int[] foodStalls) {
        int temp;
        for (int i=0; i<foodStalls.length - 1; i++) {
            boolean swapped = false;
            for (int j=0; j<foodStalls.length -1 -i; j++) {
                
                if(foodStalls[j] > foodStalls[j+1]) {
                    temp = foodStalls[j];
                    foodStalls[j] = foodStalls[j+1];
                    foodStalls[j+1] = temp;
                    swapped = true;
                }
                
            }
            if (swapped == false) {
                break;
            }
        }
        return foodStalls;
    }

    public static void print(int[] foodStalls) {
        System.out.print('[');
        for (int i=0; i<foodStalls.length; i++) {
            System.out.print(foodStalls[i]);
            if(i < foodStalls.length-1) {
                System.out.print(',');
            }
        }
        System.out.println(']');
    }
}