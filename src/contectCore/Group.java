package contectCore;

import java.awt.List;
import java.util.ArrayList;

public class Group implements Save{
	private ArrayList<Person>list;
	private String listName;
	public Group(String listName) {
		// TODO Auto-generated constructor stub
		this.listName=listName;
	}
	public Group(String listName,ArrayList<Person>list) {
		// TODO Auto-generated constructor stub
		this.list=list;
		this.listName=listName;
	}
	//getter �� setter
	public ArrayList<Person> getList() {
		return list;
	}
	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	
	
	public void addPerson(Person newPerson){
		//TODO ������ϵ�˵������
	}
	public void deletePerson(Person deletePerson){
		//TODO �������ɾ����ϵ��
		list.remove(list.get(list.indexOf(deletePerson)));
	}
	public void addListOfPeople(ArrayList<Person> listOfperson){
		//TODO ���б��е���ȫ�����뵽����
	}
	public void addGroupOfPeople(Group group) {
		//TODO ����������ڵ���ϵ����ӵ����ڵ��������
	}
	public void deleteListOfPeople(ArrayList<Person> listOfpeople){
		//TODO ���б������ȫ��������ɾ��
		
	}
	@Override
	public void saveInfor() {
		// TODO �����ݱ������ı���
		
	}
}
