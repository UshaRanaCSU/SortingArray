import java.util.*;
class Student{

    int rollNo;
    String name,address;
    Student(int rollNo,String name,String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return  this.rollNo+" -- "+this.name+" -- "+this.address;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.name.compareTo(b.name);
    }
}

class SortByRollNo implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.rollNo-b.rollNo;
    }
}


