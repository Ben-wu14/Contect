package test_GroupList;
/*
 * ����ǰ��:
 * ���TestGroup�Ĳ���
 * ���Test_newGroup����
 * 
 * Ԥ�ڽ����
 * 
 * 1st Group
 * 2nd Group
 * 3rd Group
 * 4th Group
 * 
 * 2nd Group
 * 4th Group
 */
import java.util.ArrayList;
import java.util.List;

import contectCore.Group;
import contectCore.GroupList;

public class Test_removeListOfGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupList groupList = new GroupList();
		Group group = new Group("1st Group");
		Group group2 = new Group("2nd Group");
		Group group3 = new Group("3rd Group");
		Group group4 = new Group("4th Group");
		groupList.newGroup(group);
		groupList.newGroup(group2);
		groupList.newGroup(group3);
		groupList.newGroup(group4);
		printer(groupList);
		
		System.out.println();
		
		List<Group> list = new ArrayList<>();
		list.add(group3);
		list.add(group);
		groupList.removeListOfGroup(list);
		printer(groupList);
		
	}
	public static void printer(GroupList groupList){
		for (Group group : groupList.getGroups()) {
			System.out.println(group.getListName());
		}
	}

}
