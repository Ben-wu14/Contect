package test_Group;

/*
 * ����ǰ�᣺
 * ���Test_Person
 * ���TestGroup
 * ���addPerson����
 * 
 * Ԥ�ڽ����
 * 
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
 */
import java.util.ArrayList;

import contectCore.Group;
import contectCore.Person;

public class Test_deletePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		Group group2 = new Group("ͬѧ", list);
		
		Person delPerson=new Person("Sam");
		//����addPerson����
		group2.addPerson(delPerson);
		printer(group2);
		
		//����deletePerson����
		System.out.println("ɾ��sam��");
		group2.deletePerson(delPerson);
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
