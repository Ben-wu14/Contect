package test_GroupList;

import contectCore.*;
/*
 * ����ǰ��:
 * ���TestGroup�Ĳ���
 * 
 * Ԥ�ڽ����
 * 
 * 1st Group
 * 2nd Group
 */
public class Test_newGroup {
	public static void main(String[] args) {
		GroupList groupList = new GroupList();
		Group group = new Group("1st Group");
		Group group2 = new Group("2nd Group");
		groupList.newGroup(group);
		groupList.newGroup(group2);
		printer(groupList);
	}
	public static void printer(GroupList groupList){
		for (Group group : groupList.getGroups()) {
			System.out.println(group.getListName());
		}
	}
}
