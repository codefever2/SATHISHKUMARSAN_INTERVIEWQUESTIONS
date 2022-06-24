//huffman decoder

import java.util.*;

/* ....  1. HuffmanDecoder
        Here we will not make huffman code, but we'll be decoding one
        The dictionary is already known and it consist of only five coded letters.
        A → 0
        B → 10
        C → 110
        D → 1110
        E → 1111
        You are given the encoded string, return the original one.
         Eg.
        Input 1101110 Output:CD
        Input 11111100 Output: ECA .... */
public class Main
{
    public static void main(String[] args)
    {
        HashMap<String,Character> hm = new HashMap<String,Character>();
        hm.put("0",'A');
        hm.put("10",'B');
        hm.put("110",'C');
        hm.put("1110",'D');
        hm.put("1111",'E');
        String result="";
        List<String> al = new ArrayList<String>();
        al.add("0");
        al.add("10");
        al.add("110");
        al.add("1110");
        al.add("1111");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i=0;i<input.length();i++)
        {
            //System.out.println("for entry");
            //System.out.println("i:"+i);
            int j=4;
            if(i==input.length()-1)
            {
                j=1;
            }
            else if((i+j) > (input.length()-1))
            {
                j=input.length()-1-i+1;
            }
            while(j>=1)
            {
                //System.out.println("while entry");
                String c = input.substring(i, i+j);
                j--;
                //System.out.println("c : "+c);
                if(al.contains(c))
                {
                    result = result+String.valueOf(hm.get(c));
                    //System.out.println("result :"+result);
                    i=i+j;
                    break;
                }
            }
        }
        System.out.println("result:"+result);
    }
}
