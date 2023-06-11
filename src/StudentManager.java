import ra.Student;

import java.util.Scanner;
import java.util.Set;

public class StudentManager {
    static Student[] arrStudent = new Student[1000];
    static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********************MENU********************");
            System.out.println("1.Hiển thị danh sách tất cả học sinh");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4.Xoá học sinh");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    inputStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
        } while (true);
    }

    public static void inputStudent(Scanner sc) {
        System.out.println("mời bạn nhập thông tin sinh viên: " + index + 1);
        Student st = new Student();
        st.setMaHs(index + 1);
        st.inputData();
        arrStudent[index] = st;
        index++;
    }

    public static void displayStudent() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n", "Mã SV", "Tên SV", "Tuổi", "Địa chỉ", "Giới tính", "Số điện thoại");
        for (int i = 0; i < index; i++) {
            arrStudent[i].displayData();
        }
    }

    public static void updateStudent(Scanner sc) {
        System.out.println("Mời bạn nhập mã sinh viên mà bạn muốn cập nhật: ");
        int maHs = Integer.parseInt(sc.nextLine());
        int indexStudent = -1;
        for (int i = 0; i < index; i++) {
            if (arrStudent[i].getMaHs()==maHs) {
                indexStudent = i;
                break;
            }
        }
        if (indexStudent != -1) {
            System.out.println("Mời bạn nhập tên sinh viên cần cập nhật (Enter để bỏ qua): ");
            String tenSV = sc.nextLine();
            if (!tenSV.isEmpty()) {
                arrStudent[indexStudent].setNameHs(tenSV);
            }
            System.out.println("Mời bạn nhập tuổi sinh viên cần cập nhật (Enter để bỏ qua): ");
            String age = sc.nextLine();
            if (!age.isEmpty()) {
                arrStudent[indexStudent].setAge(Integer.parseInt(age));
            }
            System.out.println("Mời bạn nhập địa chỉ mà bạn muốn cập nhật: ");
            String address = sc.nextLine();
            arrStudent[indexStudent].setAddress(address);
            System.out.println("Mời bạn nhập giới tính mà bạn muốn cập nhật: ");
            String sex = sc.nextLine();
            if (!sex.isEmpty()) {
                arrStudent[indexStudent].setSex(Boolean.parseBoolean(sex));
            }
            System.out.println("Mời bạn nhập số điện thoại mà bạn muốn cập nhật: ");
            String sdt = sc.nextLine();
            arrStudent[indexStudent].setSdt(sdt);
            System.out.println("Thông tin sinh viên đã được cập nhật.");
        } else {
            System.err.println("Mã sinh viên không tồn tại.");
        }
    }
    public static void deleteStudent(Scanner sc) {
        System.out.println("Mời bạn nhập mã sinh viên cần xóa: ");
        int maHs = Integer.parseInt(sc.nextLine());
        int indexStudent = -1;
        for (int i = 0; i < index; i++) {
            if (arrStudent[i].getMaHs()==maHs) {
                indexStudent = i;
                break;
            }
        }
        if (indexStudent != -1) {
            for (int i = indexStudent; i < index - 1; i++) {
                arrStudent[i] = arrStudent[i + 1];
            }
            arrStudent[index - 1] = null;
            index--;
            System.out.println("Thông tin sinh viên đã được xóa.");
        } else {
            System.err.println("Mã sinh viên không tồn tại.");
        }
    }
}