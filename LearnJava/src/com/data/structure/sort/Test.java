package com.data.structure.sort;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 50 };
		Sort bubbleSort = new BubbleSort();
		Sort selectSort = new SelectSort();
		Sort insertionSort = new InsertionSort();
		Sort shellSort = new ShellSort();
		Sort quickSort = new QuickSort();
		Sort mergeSort = new MergeSort();
		Sort heapSort = new HeapSort();
		quickSort.sort(arr);
	}	
}
