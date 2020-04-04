package strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort<E> extends AbstractSortingStrategy<E> {

	public InsertionSort(Comparator<E> cmp) { 
		super("InsertionSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 

		/* TODO ADD CODE HERE FOLLOWING PSEUDOCODE (ALMOST VERBATIM) FROM LECTURE
		 * 
		 * To compare two values, use something like:
		 *    if (cmp.compare(dataSet.get(?), valToInsert) > 0)
		 */
	}

}