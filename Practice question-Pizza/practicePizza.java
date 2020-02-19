import java.io.*;
import java.util.*;
class practicePizza
{
    private static LinkedList<Integer> Output;
    private static LinkedList<Integer> inputs=new LinkedList<Integer>();
    
    private static int max, types;
    private static  LinkedList<Integer> result=calc(max,types,inputs);
    
    static LinkedList<Integer> calc(int max, int types, LinkedList<Integer> inputs)
    {
        int sum=0;
        LinkedList<Integer> arr= new LinkedList<Integer>();
        for(int i=inputs.size()-1;i>=0;i--)
        {
            if(!((sum+inputs.get(i))>max))
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
        String[] input = {"a_example", "b_small", "c_medium", "d_quite_big", "e_also_big"};
        
       
        
        for(int i = 0; i < input.length; i++)
        {
            getInputFromTheFile(input[i]);
          
            writeToFile(input[i]);
        }
        
    }
    
    static void getInputFromTheFile(String inputName) throws IOException
    {
        
               BufferedReader br = new BufferedReader(new FileReader(inputName + ".in"));
        //String firstLine, secondLine;
               inputName=br.readLine();
               StringTokenizer st=new StringTokenizer(inputName);
                max = Integer.parseInt(st.nextToken()); // maximum pizza slices that are required
                types = Integer.parseInt(st.nextToken()); // the number of pizzas available
               inputName=br.readLine();
               st=new StringTokenizer(inputName);
               while(st.hasMoreTokens())
               {
                   inputs.add(Integer.parseInt(st.nextToken()));
               }
        
    }
    
    static void writeToFile(String inputName) throws IOException
    {
       
        PrintWriter pw=new PrintWriter("output\\" + inputName + ".txt", "UTF-8");
        pw.println(result.size());
        for(int k=0;k<result.size();k++)
        {
            //print output in terms of index in input
            pw.print(inputs.indexOf(result.get(k))+" ");
        }
        pw.close();
    }
}
