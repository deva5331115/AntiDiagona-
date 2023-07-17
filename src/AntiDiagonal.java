import java.util.Scanner;

public class AntiDiagonal {
   static void antidignal(int[][] mat,int rowsize,int colsize){
       for(int x=0;x<rowsize;x++){
           int i=0,j=x;
           while (i<colsize ){
               if (  j>=0) {
                   System.out.print(mat[i][j] + " ");
               }else {
                   System.out.print("0"+" ");
               }
               i++;
               j--;
           }
           System.out.println();
       }
       for(int x=1;x<rowsize;x++){
           int i=x,j=rowsize-1;
           while (j>=0 ){
               if ( i<colsize ) {
                   System.out.print(mat[i][j] + " ");
               }else {
                   System.out.print("0"+" ");
               }
               i++;
               j--;
           }
           System.out.println();
       }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];


        for(int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                mat[i][j]=scan.nextInt();

            }
        }
        antidignal(mat,rowsize,colsize);



    }

}
