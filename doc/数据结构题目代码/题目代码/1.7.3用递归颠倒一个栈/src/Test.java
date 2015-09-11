import java.util.Stack;

/**
 * Project Name:1.7.3�õݹ�ߵ�һ��ջ
 * File Name:Test.java
 * Package Name:
 * Date:2015-3-27����10:30:34
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015-3-27 ����10:30:34 <br/>
 * 
 * @author acer
 * @version
 * @since JDK 1.6
 * @see
 */
public class Test {
	/**
	 * Q 66.�ߵ�ջ�� ��Ŀ���õݹ�ߵ�һ��ջ����������ջ{1,2,3,4,5}��1��ջ���� �ߵ�֮���ջΪ{5,4,3,2,1}��5����ջ���� 1.
	 * Pop the top element 2. Reverse the remaining stack 3. Add the top element
	 * to the bottom of the remaining stack
	 */
	/**
	 * 
	 * 1��POP��ջ��Ԫ�� 2��ʣ��Ԫ�صߵ����� 3����POP����ջ��Ԫ�طŵ�ջ��
	 */
	public static void main(String[] args) {
		Test r = new Test();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i < 5; i++) {
			stack.add(i);
		}
		r.printStack(stack);
		r.reverseStack(stack);
		r.printStack(stack);
	}

	public void reverseStack(Stack<Integer> stack) {
		if (!stack.empty()) {
			Integer top = stack.pop();
			System.out.println(top);
			reverseStack(stack);
			addToBottom(stack, top);
		}
	}

	public void addToBottom(Stack<Integer> stack, Integer ele) {
		System.out.println("add" + ele);
		if (stack.empty()) {
			stack.push(ele);
		} else {
			Integer top = stack.pop();
			addToBottom(stack, ele);// important
			stack.push(top);
		}
	}

	public void printStack(Stack<Integer> stack) {
		/*
		 * while(!stack.empty()){ System.out.print(stack.pop()+","); }
		 */
		// we don't remove the elements in the stack.
		for (Integer x : stack) {
			System.out.print(x + ",");
		}
		System.out.println();
	}
}
