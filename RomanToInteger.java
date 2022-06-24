import java.util.Scanner;
import java.util.*;

public class RomanToInteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum =0;
        HashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0;i<input.length();i++)
        {
            sum = sum+hm.get(input.charAt(i));
        }
    System.out.println("sum : "+sum);
    }
}
