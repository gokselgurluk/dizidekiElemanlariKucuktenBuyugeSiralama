import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin boyutu n: ");
        int diziBoyutu = input.nextInt();
        int[] array = new int[diziBoyutu];
        int startIndex =0;
        for(int i=1 ; i<=diziBoyutu;i++){
        System.out.println(" Dizinin "+i+". Elemanı: ");
        int diziEleman= input.nextInt();
           array[startIndex++] = diziEleman;

        }

          Arrays.sort(array);
            System.out.print(" "+Arrays.toString(array));


    }
}
