import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

class practicePizza
{
   private static ArrayList<Integer> Input, Output;
    
    private static int MAX, Types, score = 0; // types is num
   
    
    static ArrayList<Integer> calc(int max,  ArrayList<Integer> inputs)
    {
        score = 0;
       ArrayList<Integer> arr= new ArrayList<Integer>();
        int sum = 0;
        int j, i = inputs.size() - 1;
        boolean test1 = true, test2 = true;
        while (i >= 0 && test1) {
            ArrayList<Integer> TempSolution = new ArrayList<Integer>();
            j = i;
            
            while (j >= 0 && test2) {

                int temp = inputs.get(j);
                if (sum + temp < max) {
                    sum = sum + temp;
                    TempSolution.add(j);
                } else if (sum + temp == max) {
                    sum = sum + temp;
                    TempSolution.add(j);
                    test2 = false;
                    test1 = false;
                }
                j--;
            }
            if (score < sum) {
                score = sum;
                arr = TempSolution;
            }
            if (arr.size() == inputs.size()) {
                test1 = false;

            }

            i--;
        }

        return arr;
       
    }
    public static void main(String[] args) throws IOException
    {
        String[] input = {"a_example", "b_small", "c_medium", "d_quite_big", "e_also_big"};
        
       
        
        for(int i = 0; i < input.length; i++)
        {
            getInputFromTheFile(input[i]);
            
            Output = calc(MAX, Input);
          Collections.reverse(Output);
          
            writeToFile(input[i]);
            System.out.println("\nSCORE : " + score);
        }
        
    }
    
    static void getInputFromTheFile(String inputName) throws IOException
    {
        Input = new ArrayList<Integer>();
               BufferedReader br = new BufferedReader(new FileReader(inputName + ".in"));
        String line, firstLine;
               
        firstLine = br.readLine();
        String[] vars;
        vars = firstLine.split(" ");

        MAX = Integer.valueOf(vars[0]); // Maximum Pizza slices requires
        Types = Integer.valueOf(vars[1]); // Number of Pizzas available
        // Create the pizza list by reading the file
        System.out.println("-------input of " + inputName);
        System.out.println(MAX + " " + Types);
        while ((line = br.readLine()) != null) {

            String letters[] = line.split(" ");

            for (int i = 0; i < letters.length; i++) {
                Input.add(Integer.valueOf(letters[i]));
                System.out.print(letters[i] + " ");
            }
        }
        br.close();
        
    }
    
    static void writeToFile(String inputName) throws IOException
    {
       
        PrintWriter pw=new PrintWriter("output_" + inputName + ".txt", "UTF-8");
         pw.println(Output.size());
                   System.out.println(Output.size());
                   for (int i = 0; i < Output.size(); i++) {
                       pw.print(Output.get(i) + " ");
                       System.out.print(Output.get(i) + " ");
                   }
                   pw.close();
    }
}
