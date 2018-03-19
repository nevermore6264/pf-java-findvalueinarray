import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] students = {"Hiếu","Thủy","Khoa","Đạt","Hùng"};

        System.out.println("Nhập tên cần tìm kiếm:");
        String input_name = scanner.nextLine();

        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input_name)) {
                System.out.println("Có tìm thấy sinh viên: " + input_name + " ở vị trí: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Không tìm thấy: " + input_name + " trong list");
    }
}
