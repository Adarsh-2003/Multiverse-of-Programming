class Student {
    int studId,rno;
    String name;
    public void showData(){
        System.out.println("Student id " +studId);
        System.out.println("Student name " +name);
        System.out.println("Student roll no. " +rno);
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="aman";
        s1.studId=2024;
        s1.rno=12;
        s1.showData();

        Student s2 = new Student();
        s2.name="adarsh";
        s2.studId=2024;
        s2.rno=11;
        s2.showData();
    }
}

/*
Basic class and object creation using classes to create objects and objects to call
methods associated with the class.
*/

//created multiple objects using single class