

import java.util.Scanner;

class school1{
    private String name,address,phonenumber,principleName, statusOfSchool;
    private int noNonteachingStaff,noTeacher;
    private boolean admissionOpen;


    school1(){
       name=null;
       address=null;
       phonenumber=null;
       principleName=null;
       statusOfSchool =null;
       noNonteachingStaff=0;
       noTeacher=0;
       admissionOpen=false;
    }
    school1(String name,String address, String phonenumber, String principleName,String StatusOfSchool,int noNonteachingStaff,int noTeacher,boolean admissionOpen){
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.principleName=principleName;
        this.statusOfSchool =StatusOfSchool;
        this.noNonteachingStaff=noNonteachingStaff;
        this.noTeacher=noTeacher;
        this.admissionOpen=admissionOpen;
    }

    String getName(){
        return name;
    }
    void setName(String n){
        this.name=n;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String a){
        this.address=a;
    }

    String getNumber(){
        return phonenumber;
    }
    void setNumber(String num){
        this.phonenumber=num;
    }


    String getPrincipleName(){
        return principleName;
    }
    void setPrincipleName(String principleName){
        this.principleName=principleName;
    }
    String getStatusOfSchool(){
        return statusOfSchool;
    }
    void setStatusOfSchool(String StatusOfSchool){
        this.statusOfSchool =StatusOfSchool;
    }
    int getnoNonteachingStaff(){
        return noNonteachingStaff;
    }
    void setnoNonteachingStaff(int noNonteachingStaff){
        this.noNonteachingStaff=noNonteachingStaff;
    }

    int getnoTeacher(){
        return noTeacher;
    }
    void setnoTeacher(int noTeacher){
        this.noTeacher=noTeacher;
    }

    boolean getadmissionOpen(){
        return admissionOpen;
    }
    void setAdmissionOpen(boolean admissionOpen){
        this.admissionOpen=admissionOpen;
    }

}

class Student extends school1{
    private String name,address,phone,Clas;
    Student(){
        name=null;
        address=null;
        phone=null;
        Clas=null;
    }
    Student(String name , String address , String phone , String Clas){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.Clas=Clas;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String address){
        this.address=address;
    }

    String getPhone(){
        return phone;
    }
    void setPhone(String phone){
        this.phone=phone;
    }

    String getClas(){
        return Clas;
    }
    void setClas(String clas){
        this.Clas=clas;
    }
}

class Teacher extends school1 {
    String teacherName, teacherPhone, teacherAddress;

    Teacher() {
        teacherName = null;
        teacherPhone = null;
        teacherAddress = null;
    }

    Teacher(String teacherName, String teacherPhone, String teacherAddress) {
        this.teacherName = teacherName;
        this.teacherPhone = teacherPhone;
        this.teacherAddress = teacherAddress;
    }

    String getteacherName() {
        return teacherName;
    }

    void setteacherName(String name) {
        this.teacherName = teacherName;
    }

    String getteacherAddress() {
        return teacherAddress;
    }

    void setteacherAddress(String address) {
        this.teacherAddress = teacherAddress;
    }

    String getteacherPhone() {
        return teacherPhone;
    }

    void setteacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }


}


class parent extends student{
    private String parentName,relation;
    parent(){
        parentName=null;
        relation=null;
    }
    parent(String parentName,String relation){
        this.parentName=parentName;
        this.relation=relation;

    }
    String getParentName(){
        return parentName;
    }
    void setParentName(String parentName){
        this.parentName=parentName;
    }

    String getRelation(){
        return relation;
    }
    void setPhone(String relation){
        this.relation=relation;
    }



}

    public class school {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user="user";int pass=123;
        System.out.println("Enter user name : ");
        String uname=sc.next();
        System.out.println("Enter Password");
        int pas=sc.nextInt();
        
        if(uname==user && pas==pass){

            System.out.println("press 1 for teacher / press 2 for Student ");

            int val=sc.nextInt();
            switch (val){
                case 1:
                    System.out.println("You are Teacher ");
                    break;
                case 2:
                    System.out.println("You are Student ");
                    break;
                default:
                    System.out.println("You chose Wrong option");
            }
            
        }
        else{
            System.out.println("Please Enter correct Username & Password");
        }
        
        
        
        
       




        school1 obj=new school1();
        obj.setName("Abhijit");
        obj.setAddress("Jadavpur");
        obj.setNumber("9946500742");
        obj.setPrincipleName("H.M Choudhury");
        obj.setnoNonteachingStaff(10);
        obj.setnoTeacher(20);
        obj.setAdmissionOpen(true);
        obj.setStatusOfSchool("Secondary");



        Teacher obj1=new Teacher();
        obj1.setteacherName("Akash");
        obj1.setteacherPhone("993746555");
        obj1.setteacherAddress("garia");




    }

}
