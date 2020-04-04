package strategiesClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSort<E> extends AbstractSortingStrategy<E> {

	public BubbleSort(Comparator<E> cmp) { 
		super("BubbleSort", cmp); 
	}
	
	@Override
	public void sortList(ArrayList<E> dataSet) {
		int n = dataSet.size(); 

		/* TODO ADD CODE HERE FOLLOWING PSEUDOCODE (ALMOST VERBATIM) FROM LECTURE
		 * 
		 * To compare two values in dataSet, use something like:
		 *    if (cmp.compare(dataSet.get(?), dataSet.get(?)) > 0)
		 * To swap, use something like:
		 *    SortingUtils.swapListElements(dataSet, i, j); 
		 *    assuming that i and j are indexes within dataSet.
		 */
	}

}