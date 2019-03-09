import java.text.*;
import java.util.Scanner;

import javax.swing.*;

public class EdmMtCalculator 
{
	static int totMtCells, over16m, mgrMemReq, frMemReq;
	final static int THRESHOLD = 16000000;
	final static int UPTO16M_MGR = 32;
	final static int OVER16M_MGR = 8;
	final static int UPTO16M_FR = 64;
	final static int OVER16M_FR = 16;
	
	public static void main(String[] args) 
	{
		
		String inputRows, inputColumns, inputFiles;
		int numRows, numMtCols, numFiles; // inputRows; inputColumns;
		
		// Get number of rows in data source
		// inputRows = JOptionPane.showInputDialog(null, "Enter the total nubmer \nof rows in the data source", "ROWS", JOptionPane.PLAIN_MESSAGE);
		// inputRows = System.in.("Enter the total number of rows > ");
		// numRows = Integer.parseInt(inputRows);
		
		Scanner inputDevice = new Scanner(System.in);
	    System.out.print("Enter tolal # of rows >> ");
	    inputRows = inputDevice.nextLine();
	    numRows = Integer.parseInt(inputRows);
		
		// Get number of columns in data source
		// inputColumns = JOptionPane.showInputDialog(null, "Enter the nubmer of multi-token \ncolumns in the data source", "MT COLS", JOptionPane.PLAIN_MESSAGE);
		// numMtCols = Integer.parseInt(inputColumns);
	    System.out.print("Enter # of MT columns >> ");
	    inputColumns = inputDevice.nextLine();
	    numMtCols = Integer.parseInt(inputColumns);
	    
	    System.out.print("Enter the number of *.rdx files >> ");
	    inputFiles = inputDevice.nextLine();
	    numFiles = Integer.parseInt(inputFiles);
		
		calcMem(numRows, numMtCols, numFiles);
	}
		/**
		JOptionPane.showConfirmDialog(null, "Your index has " + totMtCells + " multi-token cells." + 
				"\nYou will need the following additional RAM: " + 
				"\nEnforce Indexer (VontuManager):  " + mgrMemReq + " bytes" + 
				"\nDetection Server (File Reader): " + frMemReq + " bytes", "ADD MEMORY", JOptionPane.PLAIN_MESSAGE);
	}
		**/
	private static void calcMem(int rows, int cols, int files) 
	{
		totMtCells = rows * cols;
		// over16m = totMtCells - THRESHOLD;
		// System.out.println("total cells / over 16m " + totMtCells + over16m);
		
		if (totMtCells <= THRESHOLD)
		{
			mgrMemReq = totMtCells * UPTO16M_MGR; // 32
			frMemReq = totMtCells * UPTO16M_FR * files;  // 64
		}
		else
		{
			mgrMemReq = (THRESHOLD * UPTO16M_MGR) + (over16m * OVER16M_MGR);
			frMemReq = (THRESHOLD * UPTO16M_FR) + (over16m * OVER16M_FR);
		}
	}
	public static String formatFileSize(long size) 
	{
	    String hrSize = null;
	    double b = size;
	    double k = size/1024.0;
	    double m = ((size/1024.0)/1024.0);
	    double g = (((size/1024.0)/1024.0)/1024.0);
	    double t = ((((size/1024.0)/1024.0)/1024.0)/1024.0);

	    DecimalFormat dec = new DecimalFormat("0.00");

	    if ( t>1 ) {
	        hrSize = dec.format(t).concat(" TB");
	    } else if ( g>1 ) {
	        hrSize = dec.format(g).concat(" GB");
	    } else if ( m>1 ) {
	        hrSize = dec.format(m).concat(" MB");
	    } else if ( k>1 ) {
	        hrSize = dec.format(k).concat(" KB");
	    } else {
	        hrSize = dec.format(b).concat(" Bytes");
	    }
	    return hrSize;
	}
}
