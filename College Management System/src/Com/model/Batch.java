package Com.model;

public class Batch {
	int bid;
	String bname;
	Faculty faculty;
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public int getBid()
	{
		return bid;
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return bname;
	}
	
	public void setFaculty(Faculty faculty)
	{
		this.faculty=faculty;
	}
	public Faculty getFaculty()
	{
		return faculty;
	}
}
