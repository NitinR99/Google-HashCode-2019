import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

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
	static int counter=0;
    public static void main(String[] args) throws IOException
    {
    		int i = 0;
    		int k = 1;
    		int val1;
    		int val2;
    		int val3;
    		String c;
    		String lib;
    		String liby[];
    		Library libber;
    		Scanner br = new Scanner(new FileReader("C:\\Users\\a_example (1).txt"));
    		StringTokenizer st;
    		String gen = br.nextLine();
    		String scores = br.nextLine();
    		ArrayList <Library> libList = new ArrayList<Library>();
    		Set<Integer> set = new HashSet<Integer>();
    		
    		
    		
    		while(br.hasNextLine()){
    			lib = br.nextLine(); 
    			st = new StringTokenizer(lib);
    			while(st.hasMoreTokens()) {
    				c=st.nextToken();
    				val1=Integer.parseInt(c);
    				c=st.nextToken();
    				val2=Integer.parseInt(c);
    				c=st.nextToken();
    				val3=Integer.parseInt(c);
    				libber = new Library(counter,val1, val2, val3);
    				
    				int k=calc(libber);
    				
    				libList.add(libber);
    			}
    			
    			lib = br.nextLine();
    			st = new StringTokenizer(lib);
    			
    			while(st.hasMoreTokens()) {
    				c=st.nextToken();
    				val1=Integer.parseInt(c);
    				k*=val1;
    				set.add(val1);
    				
    				
    			}
    			i++;
    		}
    		
    		
    }
    
    /* (num og boof*shipcap)/sindays + bookpointstotal */
    public static int calc(Library libber) {
    	int k=0;
    	
    	libber.
    	
    	return k;
    }
}
