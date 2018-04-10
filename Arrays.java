/*************************************************************************

Lab 5, CS 111, Fall 2016

***************************************************************************/

public class Arrays {

    public static void main (String[] args) {
	
	int[] myArray = new int[12];
	
	myArray[0] = 31;
	myArray[1] = 28;
	myArray[2] = 34;
	myArray[3] = 30;
	myArray[4] = 31;
	myArray[5] = 30;
	myArray[6] = 31;
	myArray[7] = 40;
	myArray[8] = 30;
	myArray[9] = 31;
	myArray[10] = 30;
	myArray[11] = 55;

	// Note: I could have just said
	//   int[] myArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	System.out.println ("The sum of the values is " + doSum(myArray));
	System.out.println ();

	int mrBig = max(myArray);
	System.out.println ("The largest value is " + mrBig);
	System.out.println ();
	
	System.out.println ("It occurs " + doCount(myArray, mrBig) +" times.");
	System.out.println ();

	System.out.println ("The sum of the elements in odd positions is " +
			    weirdSum(myArray));
	System.out.println ();

	System.out.println ( neighborTest(myArray) + " of the elements are " +
			     "bigger than the element that\n  immediately " +
			     "precedes it.");
	System.out.println ();
    }
    
    /////////////////////////////////////////////////////////////////////
    
    static int doSum (int[] a) {   // adds up the elements

	int total = 0;
	for (int i=0; i<(a.length); ++i)
	    total += a[i];

	return total;
    }

    /////////////////////////////////////////////////////////////////////
    
    static int max (int[] a) {             // what is the biggest value in a
	
	int largest = 0;
	int len = (a.length-1);
	for (int i=0; i<len; i++) { 
	    if (a[i+1]>a[i]) largest = a[i+1];
	    else largest = a[i];
        }
	System.out.println(largest);
      	return largest;
    }
	
    /////////////////////////////////////////////////////////////////////

    static int doCount (int[] a, int x) {  // how many times does x occur in a
	int count = 0;
	int size = (a.length);
	for (int i=0; i<size; i++) {
	    if (a[i] == x) count++;
	}   
	return count;   // changed
    }

    /////////////////////////////////////////////////////////////////////
    
    static int weirdSum (int[] a) {        // adds up the odd positions
	int total = 0;
	for (int i = 0; i<(a.length); i++)
	    if (i % 2 != 0)total += a[i]; 
        System.out.println(total);	
	return total;   // changed
    }
	
    /////////////////////////////////////////////////////////////////////
    
    static int neighborTest (int[] a) {    // how many elements are bigger
	int count = 0;// than the preceding element
	
	for (int i = 1; i<(a.length); i++){
	    if (a[i]>a[i-1])count++;
	}
	return count;   //
    }
	
}    


