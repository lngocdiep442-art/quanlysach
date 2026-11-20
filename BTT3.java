import java.util.Scanner;

public class quanlysahc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NHẬP THÔNG TIN SÁCH NHẬP KHO ===");

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập đơn giá (VNĐ): ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        double thanhTien = donGia * soLuong;

        double phiVanChuyen = thanhTien * 0.05;

        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n================ BÁO CÁO NHẬP KHO ================");
        System.out.println("Mã sách     : " + maSach);
        System.out.println("Tên sách    : " + tenSach);
        System.out.println("Tác giả     : " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá     : " + donGia + " VNĐ");
        System.out.println("Số lượng    : " + soLuong + " cuốn");
        System.out.println("------------------------------------------------");
        System.out.println("Thành tiền        : " + thanhTien + " VNĐ");
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen + " VNĐ");
        System.out.println("TỔNG TIỀN NHẬP KHO : " + tongTienNhap + " VNĐ");
        System.out.println("==================================================");

        sc.close();
    }
}
