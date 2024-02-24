import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        int[] array1=new int[] {1,2,3};
        double[] array2=new double[] {1.57, 7.654, 9.986};
        int[] array3=new int[33];
        System.out.println("Task02");
        for (int index=0; index<array1.length; index++) {
            System.out.print(array1[index]);
            if (index < array1.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("");
        for (int index=0; index<array2.length; index++) {
            System.out.print(array2[index]);
            if (index < array2.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("");
        for (int index=0; index<array3.length; index++) {
            System.out.print(array3[index]);
            if (index < array3.length-1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Task03");
        for (int index= array1.length; index > 0; index--) {
            System.out.print(array1[index-1]);
            if (index > 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int index= array2.length; index > 0; index--) {
            System.out.print(array2[index-1]);
            if (index > 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int index= array3.length; index > 0; index--) {
            System.out.print(array3[index-1]);
            if (index > 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Task04");
        for (int index=0; index<array1.length; index++) {
            if (array1[index] % 2 != 0) {
                array1[index] = array1[index] + 1;
            }
        }
        System.out.println(Arrays.toString(array1));
        }
    }
