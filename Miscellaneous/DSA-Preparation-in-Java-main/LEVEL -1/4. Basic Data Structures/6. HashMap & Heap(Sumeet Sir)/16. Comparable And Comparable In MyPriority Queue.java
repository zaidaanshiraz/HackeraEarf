//Code
import java.util.*;

public class Main {

public static class MyPriorityQueue<T>
  {
    ArrayList <T> data;
    Comparator cmptr;
public MyPriorityQueue()
{
      data=new ArrayList<>();
      cmptr=null;
}
public MyPriorityQueue(Comparator cmptr)
{
      data=new ArrayList<>();
   this.cmptr=cmptr;
}
public void add(T val)
{
    data.add(val);
    upheapify(data.size()-1);
}
void upheapify(int i)
{
      if(i==0)
      {
        return ;
      }
      int pi=(i-1)/2;
      if(isSmaller(i,pi)==true)
      {
        swap(pi,i);
        upheapify(pi);
      }
}
public T peek()
{
      if(data.size()==0)
      {
        System.out.println("Underflow");
        return null;
      }
      return data.get(0);
}
public T remove()
{
        if(data.size()==0)
      {
        System.out.println("Underflow");
        return null;
      }
      swap(0,data.size()-1);
      T val=data.remove(data.size()-1);
      downHeapify(0);
      return val;
}
void downHeapify(int i)
{
      int mini=0;
      int lci=2*i+1;
      if(lci<data.size()&&(isSmaller(lci,mini)==true))
      {
        mini=lci;
      }
        int rci=2*i+2;
      if(rci<data.size()&&(isSmaller(rci,mini)==true))
      {
        mini=rci;
      }
      if(mini!=i)
      {
        swap(i,mini);
        downHeapify(mini);
      }
}
public int size()
{
      return data.size();
}
void swap(int i,int j)
{
      T ith=data.get(i);
      T jth=data.get(j);
      data.set(i,ith);
      data.set(j,ith);
}
boolean isSmaller(int i,int j)
{
      T ith =data.get(i);
        T jth =data.get(j);
        if(cmptr!=null)
        {
          if(cmptr.compare(ith,jth)<0)
          {
            return true;
          }
          else
          {
            return false;
          }
        }
        else
        {
          Comparable cith=(Comparable) ith;
          Comparable cjth=(Comparable) jth;
          if(cith.compareTo(cjth)<0)
          {
              return true;
          }
          else
          {
              return false;
          }
        }
}
  }
static class Student implements Comparable<Student>
{
    String name;
    int height;
    int weight;
    int marks;
    Student(String name ,int height,int weight,int marks)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.marks=marks;

    }
    public int compareTo(Student other)
    {
        return this.name.compareTo(other.name);
    }
    public String toString(){
        return (this.name+"["+this.height+","+this.weight+","+this.marks+"]");
    }
}
static class StudentHeightComparator implements Comparator<Student>
{
    public int compare(Student student1,Student student2)
    {
        return student1.height-student2.height;
    }
}
static class StudentWeightComparator implements Comparator<Student>
{
    public int compare(Student student1,Student student2)
    {
        return student1.weight-student2.weight;
    }
}
static class StudentMarksComparator implements Comparator<Student>
{
    public int compare(Student student1,Student student2)
    {
        return student1.marks-student2.marks;
    }
}
public static void main(String[] args) {
    // Write your code here
    MyPriorityQueue<Student> pq=new MyPriorityQueue<>();
MyPriorityQueue<Student> pqWt=new MyPriorityQueue<>(new StudentWeightComparator());
MyPriorityQueue<Student> pqMarks=new MyPriorityQueue<>(new StudentHeightComparator());
Student []students=new Student[5];
students[0]=new Student("A",180,75,99);
students[1]=new Student("Z",150,85,90);
students[2]=new Student("D",185,72,98);
students[3]=new Student("C",165,65,100);
students[4]=new Student("E",177,55,91);

for(Student student:students)
{
  pq.add(student);
    pqWt.add(student);
  pqMarks.add(student);

}
System.out.println("On the basis of name");
while(pq.size()>0)
{
  Student student =pq.peek();
  pq.remove();
  System.out.println(student);
}
System.out.println("On the basis of weight");
while(pqWt.size()>0)
{
  Student student =pqWt.peek();
  pqWt.remove();
  System.out.println(student);
}
System.out.println("On the basis of marks");
while(pqMarks.size()>0)
{
  Student student =pqMarks.peek();
  pqMarks.remove();
  System.out.println(student);
}
}
  }
//Ouput
/*On the basis of name
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
On the basis of weight
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
On the basis of marks
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
A[180,75,99]
*/