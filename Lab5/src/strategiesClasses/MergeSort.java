package strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Implementation of MergeSort
 * 
 * @author pedroirivera-vega
 */
public class MergeSort<E> extends AbstractSortingStrategy<E> {

	public MergeSort(Comparator<E> cmp) { 
		super("MergeSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		/* We start things off by telling ms to sort the whole thing */
		ms(dataSet, 0, dataSet.size()-1); 
	}

	/**
	 * Applies the divide and conquer strategy to sort using 
	 * MergeSort algorithm. It works on the portion of the list
	 * from position first to position last (first..last). 
	 * 
	 * @param data   The ArrayList being sorted
	 * @param first  The index of first position in portion to be sorted
	 * @param last   The index of last  position in portion to be sorted
	 */
	private void ms(ArrayList<E> data, int first, int last) {
		// ADD CODE HERE 1
	}

	/**
	 * Merges two sorted portions of the list -- see discussion
	 * in the lab's document. 
	 * 
	 * @param data   The ArrayList being sorted
	 * @param first  Index where the first sorted half starts
	 * @param mid    Index where the first sorted half ends
	 * @param last   Index where the second sorted half ends
	 */
	@SuppressWarnings("unchecked")
	private void merge(ArrayList<E> data, int first, int mid, int last) {
	     E[] tempList = (E[]) new Object[last-first+1]; 
	     int index1 = first, last1 = mid;  // Start and end of first sorted half
	     int index2 = mid+1, last2 = last; // Start and end of second sorted half
	     int indexTL = 0; // index of tempList
	     while (index1 <= last1 && index2 <= last2) 
	         if (cmp.compare(data.get(index1), data.get(index2)) <=0)
	             tempList[indexTL++] = data.get(index1++); 
	         else 
	             tempList[indexTL++] = data.get(index2++);

	     /* move the remaining data to tempList -- notice that only one 
	        of the following loops will iterate at least once */
	     while (index1 <= last1) 
	         tempList[indexTL++] = data.get(index1++);
	     while (index2 <= last2) 
	         tempList[indexTL++] = data.get(index2++);
			
	     /* put sorted data back to the ArrayList */
	     for (int i=0; i<tempList.length; i++) 
	    	 data.set(first+i, tempList[i]); 		
	}

}