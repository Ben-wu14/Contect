package test_FullLIst;

import contectCore.FullList;
import contectCore.Person;

public class TestFullList {
	public static void main(String[] args) {
		FullList fullList = new FullList();
		Person person1=new Person("ben");
		fullList.addNewPerson(person1);
		fullList.addNewPerson(new Person("ten"));
		fullList.addNewPerson(new Person("bill"));
		fullList.addNewPerson(new Person("xian"));
		fullList.addNewPerson(new Person("���ෲ"));
		fullList.addNewPerson(new Person("�ⶫ��"));
		fullList.addNewPerson(new Person("123ľͷ��"));
		fullList.addNewPerson(new Person("apple"));
		fullList.addNewPerson(new Person("Tom"));
		fullList.addNewPerson(new Person("����"));
		fullList.addNewPerson(new Person("zeze"));
		fullList.addNewPerson(new Person("xj"));
		fullList.addNewPerson(new Person("�����"));
		fullList.removePerson(person1);
		
		for (Person person : fullList.getPersonList()) {
			System.out.println(person.getName());
		}
		for (int person : fullList.getHeader()) {
			System.out.println(person);
		}
		System.out.println(fullList.getPersonList().get(fullList.getHeader()[26]).getName());
	}
}
