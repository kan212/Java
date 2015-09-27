package com.data.structure.sort;

/**
 * 
 * @author kan212
 * 堆排序
 *
 */
public class HeapSort implements Sort {

	@Override
	public void sort(int[] arr) {
		heapSort(arr);
	}
	
	public void heapSort(int[] arr) {
		// 建立初始堆,从最后一个非叶子节点开始比较（arr.length-1）/2
		for (int i = arr.length - 1; i >= 0; i--) {
			heapOne(arr,arr.length,i);
		}
		int n = arr.length;
		while (n > 0) {
			System.out.print("结果： " + arr[0] + " ");// 输出堆顶元素
			arr[0] = arr[n - 1];// 最后一个元素移动到堆顶
			n--;
			heapOne(arr, n, 0);
		}
	}

	// 节点K进行筛选
	// a:堆数据，n:堆中有效数据个数 k:待筛选节点
	private void heapOne(int[] arr, int length, int i) {
		int k1 = 2 * i + 1; //左子树计算
		int k2 = 2 * i + 2; //右子树计算
		if(k1 >= length && k2 >= length) {
			return ;//已经是叶子
		}
		int a1 = Integer.MAX_VALUE;
		int a2 = Integer.MAX_VALUE;
		if(k1 < length) {
			a1 = arr[k1];//左边的孩子
			System.out.println("a1 : " + a1);
		}
		if(k2 < length) {
			a2 = arr[k2];//右边的孩子
			System.out.println("a2 : " + a2);
		}
		if(arr[i] <= a1 && arr[i] <= a2) {
			return ;//堆满足
		}
		if(a1 < a2) {
			int t = arr[i];
			arr[i] = arr[k1];
			arr[k1] = t;
			heapOne(arr, length, k1);
		}else {
			int t = arr[i];
			arr[i] = arr[k2];
			arr[k2] = t;
			heapOne(arr, length, k2);
		}
	}


}
