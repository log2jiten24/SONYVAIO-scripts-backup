package JavaPractice;

import java.io.*;
class FrequencyCount
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
       
       //Enter the string 
       System.out.println("Enter the string : ");
       String str = br.readLine() ;
       
       //Enter the substring to be searched
       System.out.println("Enter the substring : ");
       String substr = br.readLine() ;
       
       int ind , count = 0 ;
       
       for (int i = 0 ; i+substr.length() < str.length() ; i ++)
       {	   
       ind = str.indexOf(substr, i);
       if (ind > 0 ) {
       count ++ ;
       i = ind ;
       ind = -1 ;
        
          }
    }
    System.out.println("Occurence of "+substr+" in String : " + count );   
       
      }
        }
