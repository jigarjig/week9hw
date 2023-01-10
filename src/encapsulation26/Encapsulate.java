package encapsulation26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate ob = new Encapsulate();
            ob.setName("Bhavesh");
            ob.setAge(19);
            ob.setRollNo(51);

            System.out.println("CodeBusters name :" +ob.getName());
            System.out.println("Codebusters age :" +ob.getAge());
            System.out.println("CodeBusters rollNo :" +ob.getRollNo());



        }
    }
}
