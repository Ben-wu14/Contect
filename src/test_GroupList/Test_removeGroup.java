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
 * 
 * 1st Group
 * 3rd Group
 */
import contectCore.Group;
import contectCore.GroupList;

public class Test_removeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupList groupList = new GroupList();
		Group group = new Group("1st Group");
		Group group2 = new Group("2nd Group");
		Group group3 = new Group("3rd Group");
		groupList.newGroup(group);
		groupList.newGroup(group2);
		groupList.newGroup(group3);
		printer(groupList);
		
		System.out.println();
		
		groupList.removeGroup(group2);
		printer(groupList);
		
	}
	public static void printer(GroupList groupList){
		for (Group group : groupList.getGroups()) {
			System.out.println(group.getListName());
		}
	}
}
