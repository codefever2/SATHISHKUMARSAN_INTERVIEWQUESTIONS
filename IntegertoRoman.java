import java.util.*;

public class IntegertoRoman
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert to roman numerals");
        int x = sc.nextInt();
        HashMap<Integer,Character> hm= new LinkedHashMap<Integer,Character>();
        hm.put(5,'V');
        hm.put(10,'X');
        hm.put(50,'L');
        hm.put(100,'C');
        hm.put(500,'D');
        hm.put(1000,'M');
        String result="";
        while(x >= 10)
        {
            //System.out.println("while entry");
            String g = String.valueOf(x);
            int u = (int) Math.pow(10,g.length()-1);
            //System.out.println("u:"+u);
            int rem = x%u;
            int value  = x-rem;
            System.out.println("value :"+value);
            if(!hm.containsKey(value))
            {
                    List<Integer> set = new LinkedList<Integer>(hm.keySet());
                    System.out.println(set);
                    int h = set.size()-1;
                    while((h >=0)&&(value>0))
                    {
                        System.out.println("arraylist value :"+set.get(h));
                        if (set.get(h) <= value)
                        {
                            System.out.println("if entry");
                            result += hm.get(set.get(h));
                            value = value - set.get(h);
                            System.out.println("value :"+value);
                            System.out.println("inner interir result :"+result);
                            h++;
                        }
                        h--;
                    }
            }
            else
            {
                result = result + hm.get(value);
            }
           System.out.println("outer result :"+result);
            x=rem;
            //System.out.println("REM:"+rem);
            //System.out.println("x:"+x);
            if((x < 10)&&(x>=5))
            {
                result += hm.get(5);
                x=x%5;
            }
        }
        for(int i=0;i<x;i++)
        {
            result += 'I';
        }
        System.out.println("result :"+result);
    }
}
