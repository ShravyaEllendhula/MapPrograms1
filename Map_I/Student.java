package com.java.Map_I;

public class Student implements Comparable<Student>
{
	int sId;
	String sName;
	
	public Student(int sId, String sName) 
	{ 
		this.sId = sId;
		this.sName = sName;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}

	@Override
	public int compareTo(Student stu) 
	{
		if(sId==stu.sId)
		{
			return 0;
		}
		else if(sName.compareTo(stu.sName)<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
