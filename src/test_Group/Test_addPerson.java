package test_Group;

import java.util.ArrayList;

import contectCore.Group;
import contectCore.Person;

/*
 * ����ǰ�᣺
 * ͨ��TestGroup����
 * Ԥ�ڽ����
 * ����sam��ͬѧ�б�
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * Sam
 */
public class Test_addPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		Group group2 = new Group("ͬѧ");
		group2.addListOfPeople(list);
		Person delPerson=new Person("Sam");
		//����addPerson����
		System.out.println("����sam��ͬѧ�б�");
		group2.addPerson(delPerson);
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
