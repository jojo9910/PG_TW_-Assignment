package com.company;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int row=sc.nextInt();
        int [][] matrix=new int[row][row];
       for(int i=0;i<row;i++){
           for(int j=0;j<row;j++){
               int currNumber=sc.nextInt();
               matrix[i][j]=currNumber;
           }
       }

        int range= (int) (2*1e6);
        int rowSum,colSum,forwardDiagonalSum=0,backwardDiagonalSum=0;
        int okay=0;
        int [] freArray=new int[range];
        int [] rowArray=new int[row];
        int [] colArray=new int[row];

        for(int i=0;i<row;i++){
            rowSum=0;
            colSum=0;
            for(int j=0;j<row;j++){
           freArray[matrix[i][j]]++;
           if(freArray[matrix[i][j]]>1){
               okay=1;
               break;
           }
           rowSum+=matrix[i][j];
          colSum+=matrix[j][i];
          if(i==j) forwardDiagonalSum+=matrix[i][j];
           if(i+j==row-1) backwardDiagonalSum+=matrix[i][j];
            }
            rowArray[i]=rowSum;
            colArray[i]=colSum;
            if(okay==1) break;
        }

        if(okay==1){
            System.out.println("Not a magic square!");
        }else{
            for(int i=0;i<row;i++){
                if(rowArray[i]!=colArray[i]){
                    okay=1;
                    break;
                }
            }
//            System.out.println(rowSum+" "+ colSum+" "+ forwardDiagonalSum+" "+backwardDiagonalSum);

            if(okay==0 && rowArray[0]==forwardDiagonalSum && rowArray[0]==backwardDiagonalSum){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}