
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        
        int[] dizi = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + ". Elamani : ");
            dizi[i] = scanner.nextInt();
        }
        
        Arrays.sort(dizi);
        
        System.out.print("Siralama : ");
        
        for(int i : dizi){
            System.out.print(i + " ");
        }
    }
}
