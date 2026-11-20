import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tạo danh sách quản lý bằng ArrayList
        ArrayList<Sach> dsSach = new ArrayList<>();

        System.out.print("Nhập số lượng sách muốn thêm vào thư viện: ");
        int n = Integer.parseInt(sc.nextLine());

        // Nhập thông tin từng cuốn sách
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

            // Tạo đối tượng Sach và thêm vào danh sách
            Sach s = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
            dsSach.add(s);
        }

        // Xuất danh sách sách
        System.out.println("\n================ DANH SÁCH SÁCH TRONG THƯ VIỆN ================");
        for (Sach s : dsSach) {
            s.hienThiThongTin();
        }

        sc.close();
    }
}
