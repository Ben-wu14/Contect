package test_Group;
import java.awt.List;
import java.util.ArrayList;

import contectCore.*;
/*
 * ����ǰ�᣺���TestPerson����
 * 
 * ���������
 * This is a group name: ����
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 */
public class TestGroup {
	public static void main(String[] args) {
		//���Ե�һ�ֹ�������
		Group group = new Group("����");
		printer(group);
		
		//���Եڶ��ֹ�������
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		Group group2 = new Group("ͬѧ", list);
		printer(group2);
	}
	public static void printer(Group group){
		ArrayList<Person> list= group.getList();
		System.out.println("This is a group name: "+group.getListName());
		for (Person person : list) {
			System.out.println(person.getName());
		}
	}
}
