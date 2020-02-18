import java.io.*;
import java.util.*;

class practicePizza
{
    //parse input file
    //calculations
    //write to output file

    public static void main(String[] args) throws IOException
    {

        String input;
        String[] inputs;
        BufferedReader br = new BufferedReader(new FileReader("input\\a_example.in"));
        input=br.readLine();

        inputs=input.split(" ");

        int max = Integer.parseInt(inputs[0]);
        int types = Integer.parseInt(inputs[1]);

        System.out.println(max+" "+types);

        input=br.readLine();
        inputs=input.split(" ");

       int type0 = Integer.parseInt(inputs[0]);
       int type1 = Integer.parseInt(inputs[1]);
       int type2 = Integer.parseInt(inputs[2]);
       int type3 = Integer.parseInt(inputs[3]);
       System.out.println(type0+" "+type1+" "+type2+" "+type3);

    }
}