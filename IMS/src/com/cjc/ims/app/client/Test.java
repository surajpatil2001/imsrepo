package com.cjc.ims.app.client;
import com.cjc.ims.app.model.*;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.serviceimpl.*;
import java.util.*;

public class Test
{
public static void main(String args[])
{	
Scanner sc=new Scanner(System.in);
Cjc c=new Karvenagar();
while(true)
{
System.out.println("Enter 1 : addCourse \n 2 :  viewCourse \n 3 : addFaculty \n 4 : viewFaculty \n 5 : addBatch \n 6 : viewBatch \n 7 :addStudent \n 8 : viewStudent");
System.out.println("Enter Your Choice:");
int ch=sc.nextInt();

if(ch==1)
{
c.addCourse();
System.out.println(); 
}

else if(ch==2)
{
c.viewCourse();
System.out.println();
}
else if(ch==3)
{
c.addFaculty();
System.out.println(); 
}
else if(ch==4)
{
c.viewFaculty();
System.out.println();
}
else if(ch==5)
{
c.addBatch();
System.out.println();
}
else if(ch==6)
{
c.viewBatch();
System.out.println();
}
else if(ch==7)
{
c.addStudent();
System.out.println();
}
else if(ch==8)
{
c.viewStudent();
System.out.println();
}
else
{
break;
}
}
}
}