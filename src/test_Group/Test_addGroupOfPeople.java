package test_Group;
/*
 * ����ǰ�᣺
 * ���TestPerson�Ĳ���
 * ���TestGroup�Ĳ���
 * ���Test_addListOfPerson�Ĳ���
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
 * Jason
 */
import java.util.ArrayList;

import contectCore.Group;
import contectCore.Person;

public class Test_addGroupOfPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>list=new ArrayList<>();
		list.add(new Person("Jerry"));
		list.add(new Person("Tom"));
		list.add(new Person("vicky"));
		Group group2 = new Group("ͬѧ", list);
		printer(group2);
		
		Group newGroup = new Group("�ں���");
		newGroup.addGroupOfPeople(group2);
		newGroup.addPerson(new Person("Jason"));
		printer(newGroup);
		
	}
	public static void printer(Group group){
		ArrayList<Person> list= group.getList();
		System.out.println("This is a group name: "+group.getListName());
		for (Person person : list) {
			System.out.println(person.getName());
		}
	}
}
