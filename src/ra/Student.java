package ra;

import java.util.Scanner;

public class Student {
    private int maHs;
    private String nameHs;
    private int age;
    private boolean sex;
    private String address;
    private String sdt;

    public Student() {
    }

    public Student(int maHs, String nameHs, int age, boolean sex, String address, String sdt) {
        this.maHs = maHs;
        this.nameHs = nameHs;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.sdt = sdt;
    }

    public int getMaHs() {
        return maHs;
    }

    public void setMaHs(int maHs) {
        this.maHs = maHs;
    }

    public String getNameHs() {
        return nameHs;
    }

    public void setNameHs(String nameHs) {
        this.nameHs = nameHs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Mời bạn nhập vào MaSV của bạn: ");
        maHs = Integer.parseInt(sc.nextLine());*/
        System.out.println("Mời bạn nhập vào TenSV của bạn: ");
        nameHs = sc.nextLine();
        System.out.println("Mời bạn nhập vào tuổi của bạn: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập địa chỉ của bạn: ");
        address = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính của bạn: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời bạn nhập sdt của bạn: ");
        sdt = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("%-15s %-15s %-15d %-15s %-15b %-15s \n",maHs,nameHs,age,address,sex,sdt);
    }
}
