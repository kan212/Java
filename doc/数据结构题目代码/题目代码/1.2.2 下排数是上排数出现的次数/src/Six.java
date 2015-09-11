
import java.util.InputMismatchException;
import java.util.Scanner;

/**
	��6 ��
	����10 ����ʱ�䣬�������Ÿ���ʮ�������������������Ӧ��ʮ����
	Ҫ������ÿ����������ǰ������ʮ���������ų��ֵĴ�����
	���ŵ�ʮ�������£�
	��0��1��2��3��4��5��6��7��8��9��
	�������⣬ò�ƺ��ѣ�10 ���ӹ�ȥ�ˣ������е��ˣ���Ŀ����û������
	��һ�����ӣ�
	��ֵ: 0,1,2,3,4,5,6,7,8,9
	����: 6,2,1,0,0,0,1,0,0,0
	0 �����ų�����6 �Σ�1 �����ų�����2 �Σ�
	2 �����ų�����1 �Σ�3 �����ų�����0 ��....
	�Դ�����..
 */

/**
 * ...
 */
class BottomArrGenerate {
	
	/**
	 * ��������������
	 * @param ���鳤��
	 * @return ���ɵ�����
	 */
	public static int[] generateArr(int n) {
		if (n < 4) {
			System.out.println("�����벻С��4������");
			return null;
		}
		
		int[] top = new int[n];	// 0-nһ�����е�����
		int[] bottom = new int[n];	// ���
		
		for (int i = 0 ; i < top.length; i++)
			top[i] = i;
		
		for (int m = 0; m < n + 2; m++) {
			boolean flag = true;	// �ҵ������־
			
			for (int i = 0; i < n; i++) {	// ��λ��Ӧ
				int count = getCount(i, bottom);
				if (bottom[i] != count) {	// ����һ��������Ĵ�������
					bottom[i] = count;
					flag = false;
				}
			}

			if (flag)	// ����2�εõ��Ĵ���һ������Ϊ��ȷ���
				break;
			
			if (n + 1 == m && !flag) {	// �㷨��ȱ�ݣ�n=5ʱ���н��2,1,2,0,0�ģ����½�������2�����ֵ�����������־��㲻����
				System.out.println("�Ҳ������");
				return null;
			}
		}

		return bottom;
	}
	
	/**
	 * ���ĳ���������г��ֵĴ���
	 * @param ��
	 * @param ����
	 * @return �����������г��ִ���
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
			System.out.println("����������");
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

