package test_Group;
/*
 * ����ǰ�᣺
 * ���TestPerson�Ĳ���
 * ���TestGroup�Ĳ���
 * ���Test_deletePerson�Ĳ���
 * 
 * Ԥ�ڽ����
 * This is a group name: ͬѧ
 * Jerry
 * Tom
 * vicky
 * Jone
 * Jony
 * This is a group name: ͬѧ
 * Jerry
 * vicky
 * 
 */
import java.util.ArrayList;

import contectCore.Group;
import contectCore.Person;

public class Test_deleteListOfPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		list.add(new Person("Jone"));
		list.add(new Person("Jony"));
		Group group2 = new Group("ͬѧ", list);
		printer(group2);
		
		//����addListofPeople
		ArrayList<Person>list2=new ArrayList<>();
		list2.add(new Person("Jone"));
		list2.add(new Person("Tom"));
		list2.add(new Person("Jony"));
		group2.deleteListOfPeople(list2);
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
