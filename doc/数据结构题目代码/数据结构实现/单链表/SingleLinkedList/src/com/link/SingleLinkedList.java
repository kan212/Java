package com.link;

//������
class LinkedList{
	//����������ݺ�ָ��
	private String data;
	private LinkedList next;
	public LinkedList(String data) {
		this.data = data;
	}
	//�������
	public void append(LinkedList x){
		LinkedList p = this;
		while(p.next != null){
			p = p.next;
		}
		p.next = x;
	}
	//��������
	public void add(LinkedList x){
		x.next = next;
		next = x;
	}
	//��ʾ����
	public void show(){
		LinkedList p = this;
		while(p!= null){
			System.out.println(p.data);
			p = p.next;
		}
	}
	
}

public class SingleLinkedList {
   public static void main(String[] args) {
	   //ͷָ��ָ��10
	LinkedList head = new LinkedList("10");
	//����������Ӽ�������
	head.append(new LinkedList("30"));
	head.append(new LinkedList("40"));
	head.append(new LinkedList("50"));
	//���������
	head.add(new LinkedList("20"));
	head.show();
}
}
