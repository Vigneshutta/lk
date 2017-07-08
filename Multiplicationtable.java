import java.util.*;
import java.io.*;
public class Multiplicationtable

{
public static void main(String[] args)throws IOException
{
    int num;
     BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a positive integer");
    num=Integer.parseInt(vc.readLine());
    for (int i = 1; i <= 10; ++i) {
    System.out.printf("%d * %d = %d \n", num, i, num * i);
    }
}
}
