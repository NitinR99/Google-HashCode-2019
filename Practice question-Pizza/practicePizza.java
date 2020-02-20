import java.io.*;
import java.util.*;
class practicePizza
{
    static LinkedList<Integer> calc(int max, int types, LinkedList<Integer> inputs)
    {
        int sum=0;
        LinkedList<Integer> arr= new LinkedList<Integer>();
        for(int i=inputs.size()-1;i>=0;i--)
        {
            if(!((sum+inputs.get(i))>max)&&!(arr.contains(inputs.get(i))))
            {
                sum+=inputs.get(i);
                arr.add(inputs.get(i));
            }
        }
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args) throws IOException
    {
        String input;
        LinkedList<Integer> inputs=new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("input\\d_quite_big.in"));
        input=br.readLine();
        StringTokenizer st=new StringTokenizer(input);
        int max = Integer.parseInt(st.nextToken());
        int types = Integer.parseInt(st.nextToken());
        input=br.readLine();
        st=new StringTokenizer(input);
        while(st.hasMoreTokens())
        {
            inputs.add(Integer.parseInt(st.nextToken()));
        }
        LinkedList<Integer> result=calc(max,types,inputs);
        PrintWriter pw=new PrintWriter(new FileWriter("q4.txt"));
        pw.println(result.size());
        for(int k=0;k<result.size();k++)
        {
            //print output in terms of index in input
            pw.print(inputs.indexOf(result.get(k))+" ");
        }
        pw.close();
    }
}