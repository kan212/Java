import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:NomalTree
 * File Name:NomalTree.java
 * Package Name:
 * Date:2015-3-17����4:01:16
 * Copyright (c) 2015, shixi_hongtao@staff.sina.com.cn All Rights Reserved.
 *
 */

/**
 * ClassName:NomalTree <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015-3-17 ����4:01:16 <br/>
 * @author   acer
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class NomalTree {

	public List<Node> list = new ArrayList<Node>();
	
	class Node{
		private String data;//����
		private String parent;//���ڵ�
	}

	//���
	public void add(String parent,String child){
		Node n = new Node();
		n.data = child;
		n.parent = parent;
		list.add(n);
	}
	
	//��ȡ���ڵ�
	public String getParent(String child){
	     for (int i = 0; i < list.size(); i++) {
			if(list.get(i).data.equals(child)) 
				return list.get(i).parent;
		}
	     return "null";
	}
	//��ȡ�ӽڵ�
	public List<String> getChild(String parent){
		List<String> lst = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).parent.equals(parent))
				lst.add(list.get(i).data);
		}
		return lst;
	}
	
	
	public static void main(String[] args) {
       		
        NomalTree t = new NomalTree();
        t.add("����","����");
        t.add("����","ŷ��");
        t.add("����","����");
        t.add("����","�й�");
        t.add("����","�ձ�");
        t.add("����","����");
        t.add("�й�","����");
        t.add("�й�","�Ϻ�");
        t.add("�й�","����");
        //��ȡ�й����ӽڵ�
        System.out.println(t.getParent("�й�"));
        System.out.println("-------------------");
        System.out.println(t.getChild("�й�"));
        
	}

}
