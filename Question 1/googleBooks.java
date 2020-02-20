import java.io.*;
import java.util.*;

class Library
{
    int id;
    int no_books;
    int signup_days;
    int shipcap;
    ArrayList<Integer> scoreBooks;
    Library(int identity, int numberbooks, int signupdays, int shippingcap)
    {
        id=identity;
        no_books=numberbooks;
        signup_days=signupdays;
        shipcap=shippingcap;
    }
    public String toString()
    {
        return "Library id:"+id+"\nNumber of books:"+no_books+"\nSignup days:"+signup_days+"\nShipping capacity:"+shipcap+"";
    }
}


public class googleBooks
{
    
    static int Book, Libraries, Days;
     private static ArrayList<Integer> Input, Output;
    
    public static void main(String[] args)
    {
       
        
        
        String[] fileNames = {"a_example", "b_read_on", "c_incunabula", "d_tough_choices", "e_so_many_books"};
        
        for(int i =0; i< fileNames.length; i++)
        {
            
            
            getInputFromFile(fileNames[i]);
            
            
            
            
        }
    
    }
    
    
    static void getInputFromFile(String fileName) throws FileNotFoundException
    {
        Input = new ArrayList<Integer>();
        
        BufferedReader fr = new BufferedReader(new FileReader(fileName + ".txt"));
        
        String line, firstLine;
        firstLine = fr.readLine();
        String[] vars;
        vars = firstLine.split(" ");
        
        Books = Integer.valueOf(vars[0]); // the number of books
        Libraries = Integer.valueOf(vars[1]); // the number of libraries
        Days = Integer.valueOf(vars[2]); // the number of days for signup
        
        System.out.println("======= input of " + fileName);
        System.out.println(Books + " " + Libraries + " " Num);
        
        while((line = fr.readLine()) != null)
        {
            
            String scores[] line.split(" ");
            
            for(int i = 0; i < Books.length; i++)
            {
                Input.add(Integer.valueOf(scores[i]));
                System.out.print(scores[i] + " ");
            }
        }
        
        
        
    }
    
    
    
    
    
    
}
