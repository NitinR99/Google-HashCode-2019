import java.io.*;
import java.util.*;

class practicePizza
{
    //parse input file
    //calculations
    //write to output file
    void calc()
    {
        int no=17;
        int types=4;
        int a[]={2,5,6,8};

    }

    public static void main(String[] args) throws IOException
    {

        String input;
        int[] inputs;
        BufferedReader br = new BufferedReader(new FileReader("input\\a_example.in"));
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
      System.out.println(max+" "+types);
        for(int k=0;k<inputs.length;k++) {
            System.out.println(inputs[k]);
        }

    }
}
