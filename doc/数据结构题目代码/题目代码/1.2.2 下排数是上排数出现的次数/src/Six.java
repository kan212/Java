
import java.util.InputMismatchException;
import java.util.Scanner;

/**
	第6 题
	给你10 分钟时间，根据上排给出十个数，在其下排填出对应的十个数
	要求下排每个数都是先前上排那十个数在下排出现的次数。
	上排的十个数如下：
	【0，1，2，3，4，5，6，7，8，9】
	初看此题，貌似很难，10 分钟过去了，可能有的人，题目都还没看懂。
	举一个例子，
	数值: 0,1,2,3,4,5,6,7,8,9
	分配: 6,2,1,0,0,0,1,0,0,0
	0 在下排出现了6 次，1 在下排出现了2 次，
	2 在下排出现了1 次，3 在下排出现了0 次....
	以此类推..
 */

/**
 * ...
 */
class BottomArrGenerate {
	
	/**
	 * 按规则生成数组
	 * @param 数组长度
	 * @return 生成的数组
	 */
	public static int[] generateArr(int n) {
		if (n < 4) {
			System.out.println("请输入不小于4的整数");
			return null;
		}
		
		int[] top = new int[n];	// 0-n一次排列的数字
		int[] bottom = new int[n];	// 结果
		
		for (int i = 0 ; i < top.length; i++)
			top[i] = i;
		
		for (int m = 0; m < n + 2; m++) {
			boolean flag = true;	// 找到结果标志
			
			for (int i = 0; i < n; i++) {	// 逐位对应
				int count = getCount(i, bottom);
				if (bottom[i] != count) {	// 和上一次算出来的次数不符
					bottom[i] = count;
					flag = false;
				}
			}

			if (flag)	// 连续2次得到的次数一样，则为正确结果
				break;
			
			if (n + 1 == m && !flag) {	// 算法有缺陷，n=5时是有结果2,1,2,0,0的，底下结果如果有2个数字等于上面的数字就算不出来
				System.out.println("找不到结果");
				return null;
			}
		}

		return bottom;
	}
	
	/**
	 * 获得某数在数组中出现的次数
	 * @param 数
	 * @param 数组
	 * @return 数字在数组中出现次数
	 */
	public static int getCount(int num, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				count++;
			}
		}
		return count;
	}
}


public class Six {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = null;
		try {
			a = BottomArrGenerate.generateArr(scan.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
		}

		if (a != null) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			for (int i : a) {
				System.out.print(i + "\t");
			}
		}
	}
}

