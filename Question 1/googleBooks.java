import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

class Library
{
    int id;
    boolean isRegistered;
    int no_books;
    int signup_days;
    int shipcap;
    ArrayList<Integer> scoreBooks;
    Library(int identity, int numberbooks, int signupdays, int shippingcap)
    {
        isRegistered=false;
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
<<<<<<< HEAD
   private static Queue<Integer> order = new LinkedList<>();
    public static void main(String[] args) throws IOException
    {
=======
    public static void main(String[] args) throws IOException {
>>>>>>> b7655c23a6dfc771786579a36c80ecfe218fa7bc
        int i = 0;
        int k = 0;
        int val1;
        int val2;
        int val3;
        int val4;
        int val5;
        int totaldays;
        int totalbooks;
        int totallibs;
        String c;
        String lib;
        String liby[];
        Library libber;
        Scanner br = new Scanner(new FileReader("b_read_on.txt"));
        StringTokenizer st;
        String gen = br.nextLine();
        st = new StringTokenizer(gen);
        while (st.hasMoreTokens()) {
            totalbooks=Integer.parseInt(st.nextToken());
            totallibs=Integer.parseInt(st.nextToken());
            totaldays=Integer.parseInt(st.nextToken());
        }
        String scores = br.nextLine();
        st = new StringTokenizer(scores);
        ArrayList<Integer> hiFi = new ArrayList<Integer>();//list of score of each book given as input
        while (st.hasMoreTokens()) {
            c = st.nextToken();
            val5 = Integer.parseInt(c);
            hiFi.add(val5);
        }
        ArrayList<Library> libList = new ArrayList<Library>();//list of libraries
        ArrayList<Integer> lowFi = new ArrayList<Integer>(); //list of score for each library from chris equation
        Set<Integer> set = new HashSet<Integer>();
        while (br.hasNextLine()) {
            lib = br.nextLine();
            st = new StringTokenizer(lib);
            while (st.hasMoreTokens()) {
                c = st.nextToken();
                val1 = Integer.parseInt(c);
                c = st.nextToken();
                val2 = Integer.parseInt(c);
                c = st.nextToken();
                val3 = Integer.parseInt(c);
                libber = new Library(counter, val1, val2, val3);
                libList.add(libber);
                lib = br.nextLine();
                st = new StringTokenizer(lib);
                while (st.hasMoreTokens()) {
                    c = st.nextToken();
                    val4 = Integer.parseInt(c);
                    val4 = hiFi.get(val4);
                    k += val4;
                    set.add(val4);
                }
                int kr = calc(libber, k);
                lowFi.add(kr);
            }
            k = 0;
        }
        System.out.println(lowFi);
        System.out.println(hiFi);
        System.out.println(set);

<<<<<<< HEAD
                
               
               
                
                
                 int kr=calc(libber,k);
                
                order.add(kr);
                
                lowFi.add(kr);
                
=======
        /////////////////////////////////////////////////////////////////////////
        //calculation part
        int index=0;
        int i=0,j=0;
        ArrayList<Integer> scannedBooks=new ArrayList<Integer>();//index of scanned books
        ArrayList<Library> registered = new ArrayList<Library>();//registered libraries
        int day_counter=0;
        while(day_counter<=totaldays) {
            //pick library with highest score in lowfi
            index=highindex(lowfi);
            //register day--
            libList.get(index).signup_days--;
            if(libList.get(index).signup_days==0)
            {
                registered.add(libList.get(index));


>>>>>>> b7655c23a6dfc771786579a36c80ecfe218fa7bc
            }
            //scan books
            int j=0;
            while(j<registered.size())//scanning of books for each library, depending on shipcap
            {
                registered.get(j)
            }
            day_counter++;
        }
        //start scanning books from each registered library, number of books scanned depends on shipcap

        System.out.println("Elements of queue-"+order);

        

<<<<<<< HEAD
        System.out.println(lowFi);
        System.out.println(set);
        
        
        

=======
        /////////////////////////////////////////////////////////////////////////
        //output part
>>>>>>> b7655c23a6dfc771786579a36c80ecfe218fa7bc

    }
    /* (num of book*shipcap)/signdays + bookpointstotal */
    public static int calc(Library libber, int total) {
        int k=0;

        int numBooks=libber.no_books;
        int ship=libber.shipcap;
        int signdays=libber.signup_days;

        k=(numBooks*ship)/signdays + total;
        
        System.out.println(k);

        return k;
    }
    //might throw error
    int highindex(LinkedList<Integer>A)
    {
        int x=0;
        for(int i=0;i<A.size();i++)
        {
            if(x<A.get(i))
            {
                x=A.get(i);
            }
        }
        return x;
    }
}