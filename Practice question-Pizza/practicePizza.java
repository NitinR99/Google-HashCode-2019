import java.io.*;
import java.util.*;

class practicePizza
{
    //parse input file
    //calculations
    //write to output file
    static int[] calc(int max, int types, int[] inputs)
    {
        int sum=0;
        LinkedList<Integer> arr= new LinkedList<Integer>();
        for(int i=inputs.length-1;i>=0;i--)
        {
            if(!((sum+inputs[i])>max))
            {
                sum+=inputs[i];
                arr.add(inputs[i]);
            }
        }
        Collections.sort(arr);
        int b[]=arr.stream().mapToInt(Integer::intValue).toArray();
        return b;
    }

    public static void main(String[] args) throws IOException
    {

        String input;
        int[] inputs;
        BufferedReader br = new BufferedReader(new FileReader("input\\d_quite_big.in"));
        input=br.readLine();
        StringTokenizer st=new StringTokenizer(input);

        int max = Integer.parseInt(st.nextToken());
        int types = Integer.parseInt(st.nextToken());
        inputs=new int[types];
        input=br.readLine();
        st=new StringTokenizer(input);
        int i=0;
        while(st.hasMoreTokens())
        {
            inputs[i++]=Integer.parseInt(st.nextToken());
        }

        int result[]=calc(max,types,inputs);
        PrintWriter pw=new PrintWriter(new FileWriter("q4.txt"));
        pw.println(result.length);
        for(int k=0;k<result.length;k++)
        {
            pw.print(result[k]+" ");
        }
        pw.close();
    }
}