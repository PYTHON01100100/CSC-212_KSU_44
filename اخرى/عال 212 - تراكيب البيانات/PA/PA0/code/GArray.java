
public interface GArray<T extends Comparable<T>> {

	// Return the element at position i
	T get(int i);

	// Set the element at position i
	void set(int i, T e);

	// Changes the size of the array to n. If n is less than the current size, the first n elements are kept.
	void resize(int n);

	// Returns the length of the array.
	int length();
	
	// Executes selection sort (increasing order) on the first n elements of the array until at most k swaps are made.
	void selectionSort(int n, int k);

}
