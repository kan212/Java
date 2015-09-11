/**
 * Project Name:LinkedListOperation File Name:Test.java Package Name:
 * Date:2015-3-19����3:06:56 Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn
 * All Rights Reserved.
 * 
 */
class LinkedList {
	public int data;
	public LinkedList next;

	public LinkedList(int data) {
     this.data = data;
	}
	
	//β�����Ԫ��
	public void append(LinkedList x){
		LinkedList p = this;
		while(p.next != null){
			p = p.next;
		}
		//��ͷ��βѭ���������ҵ�β��
		p.next = x;
	}

}

public class Test {

	public static void main(String[] args) {
		//����һ������
		LinkedList list = new LinkedList(10);
		//��β�����������Ԫ��
		LinkedList cell = new LinkedList(30);
		list.append(cell);
		list.append(new LinkedList(40));
		list.append(new LinkedList(50));
		list.append(new LinkedList(60));
		//����
		//Operations.add(list, new LinkedList(20));
		//ɾ��
		//Operations.delete(list, cell);
        //��ʾ
		Operations.show(list);
	}

}
