package JavaPractice;

public class NumberofOccurenceofword {
	
	
	static int numberofoccurence(String str , String word) 
	{
		
		String a[] = str.split(" ");
		//System.out.print("content of array :" + a);
		int count = 0 ;
		for (int i = 0; i <a.length ; i ++ ) 
		{
		 if (word.equalsIgnoreCase(a[i]))
		 {
		count ++ ;	 
			  }
		}
		return count;
		}
	
	//example of how to split using for each loop
	static int numberofoccur(String entered , String word )
	{
		int count = 0 ;
		String[] wordcount = entered.split(" ") ;
		
	for (String ocurences : wordcount )
	{
	if (word.equalsIgnoreCase(ocurences))	
	{
	count ++ ;	
	}
	}
	return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Iamjitu my nameisjitu jitu Jitu is Jitu is Jitu good" ;
		String word = "jitu" ;
		//System.out.println("number of occurrences of word : " + numberofoccurence(str, word));
		System.out.println("number of occurences of word : " + numberofoccur(str, word)) ;	
	}

}
