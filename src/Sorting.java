import java.util.*;
public class Sorting{
    public static void main(String args[]){

        ArrayList<Student> data=new ArrayList<Student>(10);

        int rollno[]={1,2,3,4,5,6,7,8,9,10};
        String names[]={"James Smith","Michael Smith","Robert Smith","Maria Garcia","David Smith","Maria Rodriguez","Jorge Mitchell","James Johnson","Maria Martinez","Maria Hernandez"};
        String addresses[]={"3475 Jarvisville Road","516 Clay Lick Road"," 201 Irish Lane","4885 Thomas Street","3179 Maxwell Farm Road","3490 University Hill Road","3535 Sherman Street",
                "56 Sycamore Street","3346 Kelly Drive","3458 Central Avenue"};
        for(int i=0;i<10;i++){
            Student s=new Student(rollno[i],names[i],addresses[i]);
            data.add(s);
        }

        SortByName sort_name=new SortByName();
        for(int i=0;i<data.size()-1;i++){
            for(int j=i+1;j<data.size();j++){
                if(sort_name.compare(data.get(i),data.get(j))>0){
                    Student s=data.get(i);
                    data.set(i,data.get(j));
                    data.set(j,s);
                }
            }
        }

        System.out.println("Students Information sorted by name");
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }

        SortByRollNo sort_roll=new SortByRollNo();
        for(int i=0;i<data.size()-1;i++){
            for(int j=i+1;j<data.size();j++){
                if(sort_roll.compare(data.get(i),data.get(j))>0){
                    Student s=data.get(i);
                    data.set(i,data.get(j));
                    data.set(j,s);
                }
            }
        }

        System.out.println("Students Information sorted by rollno ");
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
}