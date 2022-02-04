import javax.swing.*;

public class Detail {
    String FirstName;
    String MiddleName;
    String LastName;

    int age;
    Detail(String FN,String MN,String LN,int A)
    {
        this.FirstName=FN;
        this.MiddleName=MN;
        this.LastName=LN;
        this.age = A;
    }
    Detail(String FN,String LN,int A)
    {
        this.FirstName=FN;
        this.LastName=LN;
       this.age=A;
    }
    String add(String a,String b,int c)
    {
        return a+b+c;
    }
    String add(String p,String q,String r,int s)
    {
        return p+q+r+s;
    }

    public static void main(String[] args) {
        Detail d1=new Detail("Ram","LAl","Shrestha",25);
        Detail d2=new Detail("Hari","Shrestha",32);
        System.out.println(d1.add(d1.FirstName,d1.LastName,d1.MiddleName,d1.age));
        System.out.println(d2.add(d2.FirstName,d2.LastName,d2.age));
    }
}
