import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Magic Matrix ");
        System.out.print("Masukkan ukuran matrix : ");
        int n = input.nextInt();
        double magicsum = n*(Math.pow(n,2)+1)/2;
        int[][] matrix = new int[n][n];
        System.out.println("Masukkan nilai dari matrix [0,1,2,3,....n^2]");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        int totalrow=0;
        int totalcol=0;
        int totaldiag=0;
        int cek=matrix.length-1;
        //add value for totalrow,totalcol, and totaldiagonal
        for (int i=0;i<matrix.length;i++){
            totaldiag += matrix[i][i];
            for (int j=0;j<matrix.length;j++){
                totalrow += matrix[i][j];
                totalcol += matrix[j][i];
                if(j==cek){
                    totaldiag += matrix[i][j];
                }
            }
            cek--;
        }
        if (totalrow/n == magicsum && totalcol/n == magicsum && totaldiag == magicsum*2) {
            System.out.println("Matrix Square Valid");
        }
        else {
            System.out.println("Matrix Square Tidak Valid");
        }
    }
}
