package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;
import java.util.*;

public class Karvenagar implements Cjc
{
Scanner sc=new Scanner(System.in);
List<Course> clist=new ArrayList<>();
List<Faculty> flist=new ArrayList<>();
List<Batch> blist=new ArrayList<>();
List<Student> slist=new ArrayList<>();

public void addCourse()
{
Course c=new Course();
System.out.println("Enter Your Cid:");
c.setCid(sc.nextInt());
System.out.println("Enter Your Cname:");
c.setCname(sc.next());
clist.add(c);
}
public void viewCourse()
{
Iterator<Course>itr=clist.iterator();
while(itr.hasNext())
{
Course co=itr.next();
System.out.println("Cource.id:"+co.getCid());
System.out.println("Cource.Name:"+co.getCname()); 
}
}


public void addFaculty()
{
Faculty f=new Faculty();
System.out.println("Enter Your Fid:");
f.setFid(sc.nextInt());
System.out.println("Enter Your Fname:");
f.setFname(sc.next());
System.out.println("Enter Your Cource Cid:"); 
int cid=sc.nextInt();
for(Course c : clist) 
{
if(c.getCid()==cid) 
{
f.setCourse(c);
}
else
{
System.out.println("Cource Not Found");
}
}
flist.add(f); 
}
public void viewFaculty(){
Iterator<Faculty>itr1=flist.iterator();
while(itr1.hasNext())
{
Faculty co1=itr1.next();
System.out.println("Faculty.id:"+co1.getFid());
System.out.println("Faculty.Name:"+co1.getFname());
System.out.println("Cource.id:"+co1.getCourse().getCid());
System.out.println("Cource.Name:"+co1.getCourse().getCname());
}
}



public void addBatch()
{
Batch b=new Batch();
System.out.println("Enter Your Bid:");
b.setBid(sc.nextInt());
System.out.println("Enter Your Bname:");
b.setBname(sc.next());
System.out.println("Enter Faculty ID for this batch:");
int fid = sc.nextInt();
for (Faculty f : flist) 
{
if (f.getFid()==fid) 
{
b.setFaculty(f);
}
else
{
System.out.println("Cource Not Found");
}
}
blist.add(b);  
}
public void viewBatch()
{
Iterator<Batch>itr2=blist.iterator();
while(itr2.hasNext())
{
Batch co2=itr2.next();
System.out.println("Batch.id:"+co2.getBid());
System.out.println("Batch.Name:"+co2.getBname());
System.out.println("Faculty.id:"+co2.getFaculty().getFid());
System.out.println("Faculty.Name:"+co2.getFaculty().getFname());
System.out.println("Course.id:"+co2.getFaculty().getCourse().getCid());
System.out.println("Course.Name:"+co2.getFaculty().getCourse().getCname());
}
}



public void addStudent()
{
Student s=new Student();
System.out.println("Enter Your Sid:");
s.setSid(sc.nextInt());
System.out.println("Enter Your Sname:");
s.setSname(sc.next());
System.out.println("Enter Your Batch Bid:"); 
int bid=sc.nextInt();
for(Batch b : blist) 
{
if(b.getBid()==bid) 
{
s.setBatch(b);
}
else
{
System.out.println("Course Not Found");
}
}
slist.add(s);  
}
public void viewStudent(){
Iterator<Student>itr3=slist.iterator();
while(itr3.hasNext())
{
Student co3=itr3.next();
System.out.println("Student.id:"+co3.getSid());
System.out.println("Student.Name:"+co3.getSname());
System.out.println("Batch.id:"+co3.getBatch().getBid());
System.out.println("Batch.Name:"+co3.getBatch().getBname());
System.out.println("Faculty.id:"+co3.getBatch().getFaculty().getFid());
System.out.println("Faculty.Name:"+co3.getBatch().getFaculty().getFname());
System.out.println("Course.id:"+co3.getBatch().getFaculty().getCourse().getCid());
System.out.println("Course.Name:"+co3.getBatch().getFaculty().getCourse().getCname());
}
}
}


