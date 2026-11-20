import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();

        System.out.print("Nhập số lượng sách muốn thêm vào thư viện: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin sách thứ " + (i + 1) + " ---");
            System.out.print("Nhập mã sách: ");
            String maSach = sc.nextLine();

            System.out.print("Nhập tiêu đề sách: ");
            String tieuDe = sc.nextLine();

            System.out.print("Nhập tác giả: ");
            String tacGia = sc.nextLine();

            System.out.print("Nhập năm xuất bản: ");
            int namXuatBan = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            // Khởi tạo đối tượng qua Constructor đầy đủ tham số
            Sach s = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            dsSach.add(s);
        }

        // In danh sách sách ra màn hình
        System.out.println("\n================ DANH SÁCH SÁCH (TUẦN 8 - ĐÓNG GÓI) ================");
        for (Sach s : dsSach) {
            s.hienThiThongTin();
        }

        sc.close();
    }
}
