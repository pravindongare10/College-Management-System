package Com.model;

public class Student {
	int sid;
	String sname;
	Batch batch;
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public int getSid()
	{
		return sid;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}
	public void setBatch(Batch batch)
	{
		this.batch=batch;
	}
	public Batch getBatch()
	{
		return batch;
	}
}
