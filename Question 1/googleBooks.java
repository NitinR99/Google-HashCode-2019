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
    
    public static void main(String[] args)
    {
        private static ArrayList<Integer> Input, Output;
        
        
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
        
        String line, f
        
        
        
    }
    
    
    
    
    
    
}
