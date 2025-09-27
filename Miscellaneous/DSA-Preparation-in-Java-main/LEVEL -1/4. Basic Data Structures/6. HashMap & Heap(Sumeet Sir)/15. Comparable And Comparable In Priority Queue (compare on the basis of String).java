//Code
import java.util.*;

public class Main {
  static class StudentWeightComparator implements Comparator<Student>{
      public int compare(Student s1,Student s2)
      {
          return s1.wt-s2.wt;
      }
  }
  static class StudentHeightComparator implements Comparator<Student>{
      public int  compare(Student s1,Student s2)
      {
       return s1.marks-s2.marks;   
      }
  }
static class Student implements Comparable<Student>{
  String name;
  int ht;
  int wt;
  int marks;
  Student(String name ,int ht,int wt,int marks)
  {
    this.name=name;
    this.ht=ht;
    this.wt=wt;
    this.marks=marks;
  }
  public String toString(){
    return this.name+"->"+this.ht+","+this.wt+","+this.marks;
  }
  public int compareTo(Student other)
  {
    return this.name.compareTo(other.name);
  }
  
}
  public static void main(String[] args) {
    // Write your code here
    //A
    // Student s=new Student("A",180,75);
    // System.out.println(s);
PriorityQueue<Student> pq=new PriorityQueue<>();
PriorityQueue<Student> pqWt=new PriorityQueue<>(new StudentWeightComparator());
PriorityQueue<Student> pqMarks=new PriorityQueue<>(new StudentHeightComparator());
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

/*On the basis of Height
B->150,85,90
D->165,65,100
E->177,55,91
A->180,75,99
C->185,72,98
On the basis of weight
E->177,55,91
D->165,65,100
C->185,72,98
A->180,75,99
B->150,85,90
On the basis of marks
B->150,85,90
E->177,55,91
C->185,72,98
A->180,75,99
D->165,65,100*/