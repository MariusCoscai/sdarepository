import java.util.Arrays;

public class Main_practice_at_home {
    public static void main(String[] args) {

        int[] array_num = {23, 45, 12, 639, 1, 900, 34, 3, 55, 79, 84, 62, 2, 0, 21};
        System.out.println("Index is " + array_num[0]);
        System.out.println("Last element is " + array_num[array_num.length-1]);
        System.out.println("The index of 639 is " + findIndex(array_num,639));
        System.out.println("The index of 62 is " + findIndex(array_num,62));
        String[] array_str = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        System.out.println("Original array_num :" + Arrays.toString(array_num));
        Arrays.sort(array_num);
        System.out.println("Sort array_num : " + Arrays.toString(array_num));
        System.out.println("Original array_str : " + Arrays.toString(array_str));
        Arrays.sort(array_str);
        System.out.println("Sort array_str : " + Arrays.toString(array_str));
        int sum = 0;
        for (int i : array_num) {
            sum += i;
        }
        System.out.println("The sum of numbers in array is : " + sum);
        double average = 0;
        for (int i : array_num) {
            average = sum / array_num.length;
        }
        System.out.println(average);

        System.out.println(contains(array_num,23));
        System.out.println(contains(array_num,46));

    }

    private static int findIndex(int[] array_num, int index) {
        if (array_num==null) return -1;
        int i = 0;
        while ( i < array_num.length){
            if (array_num[i] == index) return i;
            else i=i+1;
        }
        return -1;
    }


    private static boolean contains(int[] array_num, int item) {
        for (int n : array_num) {
            if (item == n){
                return true;
            }
        }
        return false;
    }


}


