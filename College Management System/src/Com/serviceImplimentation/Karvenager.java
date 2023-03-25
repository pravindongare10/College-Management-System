package Com.serviceImplimentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Com.model.Batch;
import Com.model.Course;
import Com.model.Faculty;
import Com.model.Student;
import Com.service.Cjc;

public class Karvenager implements Cjc {
	List<Course> clist=new ArrayList<>();
	List<Faculty>flist=new ArrayList<>();
	List<Batch>blist=new ArrayList<>();
	List<Student>slist=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void addCourse()
	 {
		 Course c1=new Course();
		 System.out.println("__Enter Course Details__ :");
		 System.out.println("Enter Course Id:");
		 c1.setCid(sc.nextInt());
		 System.out.println("Enter Course Name:");
		 c1.setCname(sc.next());
		 clist.add(c1);	
		System.out.println("--Course Details added Successfully--");
	 }
	
	@Override
	 public void viewCourse()
	 {
		System.out.println("Course details");
		for(Course co:clist)
		{
			System.out.println("Course id:"+co.getCid());
			System.out.println("Course nmae:"+co.getCname());
					
		}
		 
	 }

	 
	 public void addFaculty()
	 {
		 boolean a1=false;
			Faculty f=new Faculty();
			System.out.println("__Enter Faculty Details__");
			System.out.println("Enter Faculty id");
			f.setFid(sc.nextInt());
			System.out.println("Enter Faculty Name");
			f.setFname(sc.next());
			Iterator <Course>itr =clist.iterator();
			System.out.println("Enter courseId to add");
			int cid=sc.nextInt();
			while(itr.hasNext())
			{
				Course c=itr.next();
				int cid1=c.getCid();
				if(cid==cid1)
				{
					f.setCourse(c);
					flist.add(f);
					a1=true;
					break;
				}
			}
			if(a1==true)
				{
					System.out.println("--Faculty Details Added Successfully--");
				}
			else
			{
				System.out.println("Please enter valid course id");
			}
		
		 
	 }
	 public void viewFaculty()
	 {
		System.out.println("__Faculty details__");
		for(Faculty fa:flist)
		{
			System.out.println("Faculty id:"+fa.getFid());
			System.out.println("Faculty name:"+fa.getFname());
			System.out.println("Course id:"+fa.getCourse().getCid());
			System.out.println("Course name:"+fa.getCourse().getCname());
		}
	 }
	 
	 
	 public void addBatch()
	 {
		 boolean b1=false;
			Batch b=new Batch();
			System.out.println("__Enter Batch Details__");
			System.out.println("Enter Batch id");
			b.setBid(sc.nextInt());
			System.out.println("Enter Batch name");
			b.setBname(sc.next());
			Iterator <Faculty>itr1 =flist.iterator();
			System.out.println("Enter Faculty Id for Batch");
			int fid=sc.nextInt();
			while(itr1.hasNext())
			{
				Faculty f=itr1.next();
				
				int fid1=f.getFid();
				if(fid==fid1)
				{
					b.setFaculty(f);
					blist.add(b);
					b1=true;
					break;
				}
			}
			if(b1==true)
			{
				System.out.println("Batch details added Successfully");
			}
			else
			{
				System.out.println("Please enter valid faculty id for batch");
			}
		
	 }
	 public void viewBatch()
	 {
			System.out.println("__Batch details__");
			for(Batch ba:blist)
			{
				System.out.println("Batch id:"+ba.getBid());
				System.out.println("Batch name:"+ba.getBname());
				System.out.println("Faculty id:"+ba.getFaculty().getFid());
				System.out.println("Faculty name:"+ba.getFaculty().getFname());
				System.out.println("Course id:"+ba.getFaculty().getCourse().getCid());
				System.out.println("Cousre name:"+ba.getFaculty().getCourse().getCname());
			}
	 }
	 
	 
	 public void addStudent()
	 {
		 boolean c1=false;
			Student s=new Student();
			System.out.println("__Enter Student Details__");
			System.out.println("Enter Student id");
			s.setSid(sc.nextInt());
			System.out.println("Enter Student name");
			s.setSname(sc.next());
			
			Iterator <Batch>itr2 =blist.iterator();
			System.out.println("Enter BatchId for Student");
			int bid=sc.nextInt();
			while(itr2.hasNext())
			{
				Batch b=itr2.next();
				int bid1=b.getBid();
				if(bid==bid1)
				{
					s.setBatch(b);
					slist.add(s);
					c1=true;
					break;
				}
			}
			if(c1==true)
			{
				System.out.println("Student Details added Successfully");
			}
			else
			{
				System.out.println("Please enter valid batch id");
			}
		 
	 }
	 public void viewStudent()
	 {
		 System.out.println("__Student details__");
			for(Student st:slist)
			{
				System.out.println("Student id:"+st.getSid());
				System.out.println("Student name:"+st.getSname());
				System.out.println("Batch id:"+st.getBatch().getBid());
				System.out.println("Batch name:"+st.getBatch().getBname());
				System.out.println("Faculty id:"+st.getBatch().getFaculty().getFid());
				System.out.println("Faculty name:"+st.getBatch().getFaculty().getFname());
				System.out.println("Course id:"+st.getBatch().getFaculty().getCourse().getCid());
				System.out.println("Cousre name:"+st.getBatch().getFaculty().getCourse().getCname());
			}
		 
	 }
		
}
