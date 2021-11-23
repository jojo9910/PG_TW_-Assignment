package com.exceptionhandling;
import java.util.Scanner;
import java.lang.Exception;

public class HandlingDifferentExceptions {
    static void solve(int [] arr) throws Exception
    {
        int ans=0;
        for(int i=0;i<10;i++)
            for(int j=i+1;j<10;j++)
                ans+=arr[i]/arr[j];

        throw new MyException(ans);
    }

    public static void main(String[] args) {
        try
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int []arr= new int[n];
            in.nextLine();

            for(int i=0;i<10;i++)
                arr[i]=Integer.parseInt(in.nextLine());

            String s=in.nextLine();
            System.out.println(s.charAt(10));
            solve(arr);
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("Exception Handling Completed");
        }

    }

}

