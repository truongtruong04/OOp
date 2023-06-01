package Student.Test;

import Student.Student;

public class studdent {
    public static void main (String  [] args ){
        Student t = new Student();
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student d = new Student();
        Student e = new Student();
        t.setName("phạm văn trường ");
        a.setYearold("18");
        b.setName("trịnh hữu ngọc anh");
        c.setYearold("18");
        d.setName("trịnh cao quý ");
        e.setYearold("18");
        System.out.println(t.getName());
        System.out.println(a.getYearold());
        System.out.println(b.getName());
        System.out.println(c.getYearold());
        System.out.println(d.getName());
        System.out.println(e.getYearold());

    }
}
