package testMain;
import java.awt.List;
import java.util.ArrayList;

import contectCore.*;
/*
 * ����ǰ�᣺���TestPerson����
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
		
		Person delPerson=new Person("Sam");
		//����addPerson����
		System.out.println("����sam��ͬѧ�б�");
		group2.addPerson(delPerson);
		printer(group2);
		
		//����deletePerson����
		System.out.println("ɾ��sam��");
		group2.deletePerson(delPerson);
		printer(group2);
		
		//����addListofPeople
		ArrayList<Person>list2=new ArrayList<>();
		list2.add(new Person("Jone"));
		list2.add(new Person("Lily"));
		list2.add(new Person("Jony"));
		group.addListOfPeople(list2);
		printer(group);
		
		//����deleteListOfPeople
		ArrayList<Person>list3=new ArrayList<>();
		list3.add(new Person("Jone"));
		list3.add(new Person("Lily"));
		group.deleteListOfPeople(list3);
		printer(group);
		
	}
	public static void printer(Group group){
		ArrayList<Person> list= group.getList();
		System.out.println("This is a group name: "+group.getListName());
		for (Person person : list) {
			System.out.println(person.getName());
		}
	}
}
/*
 * ���������
 * This is a group name: ����
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * ����sam��ͬѧ�б�
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * Sam
 * ɾ��sam��
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * This is a group name: ����
 * Jone
 * Lily
 * Jony
 * This is a group name: ����
 * Jony
 */
