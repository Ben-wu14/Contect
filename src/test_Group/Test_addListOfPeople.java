package test_Group;

import java.util.ArrayList;
/*
 * ����ǰ�᣺
 * ���TestPerson�Ĳ���
 * ���TestGroup�Ĳ���
 * ���Test_addPerson�Ĳ���
 * 
 * Ԥ�ڽ����
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * Jone
 * Lily
 * Jony
 */
import contectCore.Group;
import contectCore.Person;

public class Test_addListOfPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		Group group2 = new Group("ͬѧ", list);
		printer(group2);
		
		//����addListofPeople
		ArrayList<Person>list2=new ArrayList<>();
		list2.add(new Person("Jone"));
		list2.add(new Person("Lily"));
		list2.add(new Person("Jony"));
		group2.addListOfPeople(list2);
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
