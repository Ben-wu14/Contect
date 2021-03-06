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
	//getter 和 setter
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
		list.add(newPerson);
		//TODO 加入联系人到组别中
	}
	public void deletePerson(Person deletePerson){
		//TODO 从组别中删除联系人
		for (int i = 0; i < list.size(); i++) {
			int isSame=list.get(i).getName().compareTo(deletePerson.getName());
			if(isSame==0){
				list.remove(i);
			}
		}
	}
	public void addListOfPeople(ArrayList<Person> listOfperson){
		for (Person person : listOfperson)
			list.add(person);
		//TODO 把列表中的人全部加入到组里
	}
	public void addGroupOfPeople(Group group) {
		for (Person person : group.list)
			list.add(person);
		//TODO 把已有组别内的联系人添加到现在的组别里面
	}
	public void deleteListOfPeople(ArrayList<Person> listOfpeople){
		//TODO 把列表里的人全部从组里删除
		for (int i = 0; i < listOfpeople.size(); i++) {
			deletePerson(listOfpeople.get(i));
		}
	}
	@Override
	public void saveInfor() {
		// TODO 把内容保存至文本中
		
	}
}
