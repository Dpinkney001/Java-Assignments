package project2016;

	import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.AbstractButton;
	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


	public class ProjectMain2 extends JFrame implements ActionListener
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int[] inputArray;
		private int anArray;
	    //private final int JTextField = anArray;
	   // private JTextArea textOutput2;
	    private JTextArea textInput;
	    private JTextArea multiplierVal;
	    private JTextArea textOutput;
	    private Component contentPane;
		private JTextArea targetVal;
	    public static int LINES = 3;
	    public static int CHAR_PER_LINE = 30;
		public static final int WIDTH = 500;
		public static final int HEIGHT = 500;
		public ProjectMain2()
		{
			setSize(WIDTH,HEIGHT);
			WindowDestroyer listener = new WindowDestroyer();
			addWindowListener(listener);
			Container contentPane = getContentPane();
			contentPane.setBackground(Color.RED);
			contentPane.setLayout(new FlowLayout());
			
			JButton multiplyButton = new JButton("Multiply Array");
			multiplyButton.addActionListener(this);
			contentPane.add(multiplyButton);
			
			JButton mergeSortButton = new JButton("MergeSort Array");
			mergeSortButton.addActionListener(this);
			contentPane.add(mergeSortButton);
			
			JButton bubbleSortButton = new JButton("Bubble Sort Array");
			bubbleSortButton.addActionListener(this);
			contentPane.add(bubbleSortButton);
			
			JButton linearSearchButton = new JButton("linear/Sequential Search");
			linearSearchButton.addActionListener(this);
			contentPane.add(linearSearchButton);
			
			JButton binarySearchButton = new JButton("Binary Search");
			binarySearchButton.addActionListener(this);
			contentPane.add(binarySearchButton);
			
			textInput = new JTextArea(LINES, CHAR_PER_LINE);
			textInput.setText("Enter number seperated by commas into the field below: ");
			contentPane.add(textInput);
			contentPane.setBackground(Color.WHITE);
			
			
			multiplierVal = new JTextArea(2,1);
			multiplierVal.setText("enter the value to multiply the array by: ");
			contentPane.add(multiplierVal);
			contentPane.setBackground(Color.WHITE);
			
			targetVal = new JTextArea(2,1);
			targetVal.setText("Enter value to search for: ");
			contentPane.add(targetVal);
			contentPane.setBackground(Color.WHITE);
			
			textOutput = new JTextArea(5,40);
			textOutput.setText("OUTPUT:  ");
			contentPane.add(textOutput);
			contentPane.setBackground(Color.RED);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			Container contentPane = getContentPane();
			
			
			
			//inputArray = getAsIntArray(textInput);
			/*
			public int[] getAsIntArray(JTextArea textInput2)
			{
				
				
				
				/*
			    String[] values = textInput2.getText().split(",");
			    int[] intValues = new int[values.length];
			    for(int index = 0; index < values.length; index++)
			    {
			        intValues[index] = Integer.parseInt(values[index]);
			    }
			     intValues;
			     */
			
	
			if (actionCommand.equals("Multiply Array"))
			{
				contentPane.setBackground(Color.BLUE);
				String fileName = "DuvallProgramOutput.txt";
				PrintWriter outputStream = null;
				try
				{
					outputStream = new PrintWriter(fileName);
				}
				catch(FileNotFoundException fnfe)
				{
					System.out.println("error opening the file " + fileName);
					System.exit(0);
				}
				
				String ArrayString = textInput.getText();
				String multiplier = multiplierVal.getText();
				String[] newArray = null;
				newArray = ArrayString.split(",");
				int multiplierInt = 0;
				multiplierInt = Integer.parseInt(multiplier);
				
				int multipliedArray [] = null;
				for(int item = 0; item < newArray.length; item++)
				{
					multipliedArray[item] = item * multiplierInt;
					
				}
				
				String multipliedArrayFinal = multipliedArray.toString();
				textOutput.setText(multipliedArrayFinal);
				/*
				String fileName = "DuvallProgramOutput.txt";
				PrintWriter outputStream = null;
				try
				{
					outputStream = new PrintWriter(fileName);
				}
				catch(FileNotFoundException fnfe)
				{
					System.out.println("error opening the file " + fileName);
					System.exit(0);
				}
				*/
				outputStream.println(multipliedArrayFinal);
				outputStream.close();
				
				/*
				int multiplier = 0;
				
				multiplier = turnIntoStringThenToInt(multiplierVal);
			
			    // call to method for multiplying the array
				int multipliedArrayOutput [] = null;
				public int [] multiplyArray(int array[],int multiplierValue)
				{
					
					int newArray [] = null;
					for (int item = 0; item < array.length; item++)
					{
						array[item] = item * multiplierValue; 
					    newArray[item] = array[item];
					}
					return newArray;
				}
			    multipliedArrayOutput = multiplyArray(inputArray, multiplier);
			    //turnArrayIntoTextField(multipliedArrayOutput, textOutput);
			*/
			}
			
			else if (actionCommand.equals("MergeSort Array"))
			{
				contentPane.setBackground(Color.BLACK);
			    //merge(inputArray, inputArray, inputArray.length - 1);
				/*
				private static void merge(int [] bigArray, int [] firstHalf, int [] lastHalf)
				{
					//need 3 vars
					 int indexLH = 0;
					 int indexFH = 0;
					 int indexBigArray = 0;
					 
					 
					 
					//while index of FH < FH.length && INDEX OF LH < LH length
					// compare value at current index AGAINST VALUE AT CURR INDEX OF LH
					// copy the lesser of the two into the larger array and increment index
					// increment index
					 
					 while ((indexFH < firstHalf.length) && (indexLH < lastHalf.length))
					 {
						 if(indexFH < firstHalf[indexFH])
						 {
							 
						 }
					 }
					
					//  arrays hit the end.. no more values to compare
					// while FH index < FH length.....
					//copy all FH values incrementing indexes along the way
					
				}

				
				// recursive method merge sort... that use split and merge to accomplish sorting
				public static void mergeSort(int [] anArray)
				{
					if(anArray.length >= 2)
					{
						int halfLength = anArray.length/2;
						int[] firstHalf = new int[halfLength];
						int[] lastHalf = new int[anArray.length - halfLength];
						split(anArray, firstHalf, lastHalf);
						mergeSort(firstHalf);
					}
				}
			
			}
			
			*/
			else if (actionCommand.equals("Bubble Sort Array"))
			{
				contentPane.setBackground(Color.RED);
				bubbleSort(inputArray);
			}
			
			
			else if (actionCommand.equals("linear/Sequential Search"))
			{
				contentPane.setBackground(Color.MAGENTA);
				intTargetVal = turnTextFieldIntoInt(targetVal);
				sequentialSearch(inputArray, intTargetVal);
				// method for linear searching. takes array and target as parameters searches each item for a match. 
				// returns match. if not  a -1
			        public static int sequentialSearch(int[]anArray, int target)
			        {
			        	for(int i = 0; i < anArray.length; i++)
			        	{
			        		if (target == anArray[i])
			        		{
			        			return i;
			        		}
			        	}
			        	return -1;
			        }

				
				
			}
			else if (actionCommand.equals("Binary Search"))
			{
				contentPane.setBackground(Color.CYAN);
				binarySearch(int array [], int startI, int match, int endI);
				
				
				
				
			}
			else
				System.out.println("Error in button interface.");
		}
	/*	
		public turnValueIntoTextField(int value, JTextField var)
		{
			return textOutput;
		}
		
		public String  turnArrayIntoTextField(int[] arr, JTextField area)
		{
			String arrayValues = "";
			for (int i = 0; i < arr.length; i++)
			{
				arrayValues = arrayValues + " " + arr[i];
			}
		     return textOutput.setText(arrayValues);
		}
		public int turnTextFieldIntoInt(JTextField var)
		{
			return intTargetVal;
		}
		
		public <JTextField> int turnIntoStringThenToInt(JTextField var)
		{
			String newString = "";
			int multiplierValue;
			newString = ((AbstractButton) var).getText();
			
		
		multiplierValue = Integer.parseInt(newString);
		return multiplierValue;
		}
		
		
		//takes JTEXTAREA  string array and split it by ",". turn each object into an int and form new array,
		// return array
		public int[] getAsIntArray(JTextArea textInput2)
		{
		    String[] values = textInput2.getText().split(",");
		    int[] intValues = new int[values.length];
		    for(int index = 0; index < values.length; index++)
		    {
		        intValues[index] = Integer.parseInt(values[index]);
		    }
		    return intValues;
		}
		
		
		// method to take array and mutlipier value and multiply each item in the array by the multiplier
		// value and then forms new array
		public int [] multiplyArray(int array[],int multiplierValue)
		{
			
			int newArray [] = null;
			for (int item = 0; item < array.length; item++)
			{
				array[item] = item * multiplierValue; 
			    newArray[item] = array[item];
			}
			return newArray;
		}
		
		// method for linear searching. takes array and target as parameters searches each item for a match. 
		// returns match. if not  a -1
	        public static int sequentialSearch(int[]anArray, int target)
	        {
	        	for(int i = 0; i < anArray.length; i++)
	        	{
	        		if (target == anArray[i])
	        		{
	        			return i;
	        		}
	        	}
	        	return -1;
	        }

			private static void merge(int [] bigArray, int [] firstHalf, int [] lastHalf)
			{
				//need 3 vars
				 int indexLH = 0;
				 int indexFH = 0;
				 int indexBigArray = 0;
				 
				 
				 
				//while index of FH < FH.length && INDEX OF LH < LH length
				// compare value at current index AGAINST VALUE AT CURR INDEX OF LH
				// copy the lesser of the two into the larger array and increment index
				// increment index
				 
				 while ((indexFH < firstHalf.length) && (indexLH < lastHalf.length))
				 {
					 if(indexFH < firstHalf[indexFH])
					 {
						 
					 }
				 }
				
				//  arrays hit the end.. no more values to compare
				// while FH index < FH length.....
				//copy all FH values incrementing indexes along the way
				
			}

			
			// recursive method merge sort... that use split and merge to accomplish sorting
			public static void mergeSort(int [] anArray)
			{
				if(anArray.length >= 2)
				{
					int halfLength = anArray.length/2;
					int[] firstHalf = new int[halfLength];
					int[] lastHalf = new int[anArray.length - halfLength];
					split(anArray, firstHalf, lastHalf);
					mergeSort(firstHalf);
				}
			}
		
		private static void split(int[] anArray, int[] firstHalf,
					int[] lastHalf) {
				// TODO Auto-generated method stub
				
			}

		
		 public static int  binarySearch(int array [], int startI, int match, int endI)
		    {
		    	int midpoint = (startI + endI)/2;
		    	if (startI > endI)
		    	{
		    		return -1;
		    	}
		    	// midpoint is start + end divided by tw
		    	else if(match == array[midpoint])
		    	{
		    		return midpoint;// found the value... reurn index;
		    	}
		    	else if(match > array[midpoint])
		    	{
		    		return binarySearch(array, match, (midpoint+1), endI);
		    	}
		    	else{
		    		return binarySearch(array, match, startI, (midpoint -1));
		    	
		    	}
		
		
		
		public  void multiplyArray(int array[],JTextArea multiplierVal2)
		{
		
			multiplierVal = multiplierVal2;
			int [] newArray = new int[inputArray.length];
			for (int item = 0; item < inputArray.length; item++)
			{
				newArray[item] = item *  multiplierVal; 
			    
			}
			//print to a file
			String fileName = "DuvallOutputFile.txt";
			PrintWriter outputStream = null;
			try
			{
				outputStream = new PrintWriter(fileName);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Error opening the file " + fileName);
				System.exit(0);
			}
		}
			
			private static  int sweap(int [] array, int a, int b)
			{
		
			    int [] array1 = null;
				int temp = array1[a];
				array1[a] = array1[b];
				return array1[b] = temp;
			}
			//bubble sort

			public static  int[] bubblesort(int [] array1)
			{
				boolean notSorted;
				{
					for(int i=0; i<array1.length-1; i++)
					{
						int j = i+1;
						if ( (array1[i] > array1[j] ))
						{
							sweap(array1, i, j);
							notSorted = true;
							
						}
					}
				}
			return array1;
			}
		
	*/
		//WORKING MAIN CODE----------------------------------------------
		
public static void main(String[] args)
{
	ProjectMain2 gui = new ProjectMain2();
	gui.setVisible(true);
}
}   //WORKING MAIN CODE DO NOT EDIT-----------------------------------------
			
	
	/*
	 * public int [] multiplyArray(int array[],int multiplierValue)
		{
			
			int newArray [] = null;
			for (int item = 0; item < array.length; item++)
			{
				array[item] = item * multiplierValue; 
			    newArray[item] = array[item];
			}
			return newArray;
		}
		
		public mergeSort(int array [])
		{
			private static void merge(int [] bigArray, int [] firstHalf, int [] lastHalf)
			{
				//need 3 vars
				 int indexLH = 0;
				 int indexFH = 0;
				 int indexBigArray = 0;
				 
				 
				 
				//while index of FH < FH.length && INDEX OF LH < LH length
				// compare value at current index AGAINST VALUE AT CURR INDEX OF LH
				// copy the lesser of the two into the larger array and increment index
				// increment index
				 
				 while ((indexFH < firstHalf.length) && (indexLH < lastHalf.length))
				 {
					 if(indexFH < firstHalf[indexFH])
					 {
						 
					 }
				 }
				
				// let's just say one of hte arrays hit the end.. no more values to compare
				// while FH index < FH length.....
				//copy all FH values incrementing indexes along the way
				
			}

			
			// recursive method merge sort... that use split and merge to accomplish sorting
			public statyic void mergeSort(int [] anArray)
			{
				if(anArray.length >= 2)
				{
					int halfLength = anArray.length/2;
					int[] firstHalf = new int[halfLength];
					int[] lastHalf = new int[anArray.length - halfLength];
					split(anArray, firstHalf, lastHalf);
					mergeSort(firstHalf);
				}
			}
		}
			
			
			return mergeSortArray;
		}
		public bubbleSort(int array [] )
		{
			
			private static int sweap(int array, int a, int b)
			{
				int temp = array[a];
				array[a] = array[b];
				array[b] = temp;
			}
			//bubble s ort

			public static void bubblesort(int [] array)
			{
				boolean notSorted;
				{
					for(int i=0; i<array.length-1; i++)
					{
						int j = i+1;
						if ( (array[i] > array[j] )){
							swap(array, i, j);
							notSorted=true;
							
						}
					}
				}
			return bubbleSortArray;
		}
		public linearSearch( int array [])
		{
			return linearSearchArray;
		}
		
			 public static int  binarySearch(int array [], int startI, int match, int endI)
			    {
			    	int midpoint =(startI + endI)/2;
			    	if (startI > endI)
			    	{
			    		return -1;
			    	}
			    	// midpoint is start + end divided by tw
			    	else if(match == arr[midpoint])
			    	{
			    		return midpoint;// found the value... reurn index;
			    	}
			    	else if(match > arr[midpoint])
			    	{
			    		return binarySearch(arr, match, (midpoint+1), endI);
			    	}
			    	else{
			    		return binarySearch(arr, match, startI, (midpoint -1));
			    	
*/