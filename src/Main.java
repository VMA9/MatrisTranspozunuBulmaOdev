import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matrix boyutlarını giriniz : ");
        int k = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[k][n];
        int[][] transpoze = new int[n][k];

        System.out.println(matrix.length + " satır ve " + matrix[0].length + " kolon giriniz : ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + 1) + ". satır " + (j + 1) + ". sütun : ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matris : ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoz : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                transpoze[i][j] = matrix[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}