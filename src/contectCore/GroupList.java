package contectCore;

import java.awt.List;
import java.util.ArrayList;

public class GroupList implements Save{
	private ArrayList<Group> groups;
	public GroupList() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Group> getGroups() {
		return groups;
	}
	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}
	public void newGroup(){
	 // TODO �����µ��鵽groups��	
	}
	public void removeGroup(Group delete){
		//TODO ��groups��ɾ��delete���
	}
	public void removeListOfGroup(List list){
		//TODO ɾ��list���г����������
	}
	@Override
	public void saveInfor() {
		// TODO �����е������Ϣ���浽�ı���
		
	}
}
