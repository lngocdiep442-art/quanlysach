import java.util.Scanner;

public class quanlysach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== QUẢN LÝ SÁCH THƯ VIỆN - TUẦN 4 ===");

        // --- THÔNG TIN NHẬP TỪ TUẦN 3 ---
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

        // ================= BÀI 1: KIỂM TRA TÍNH HỢP LỆ DỮ LIỆU =================
        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("❌ Lỗi: Đơn giá phải lớn hơn 0!");
            hopLe = false;
        }

        if (soLuong < 0) {
            System.out.println("❌ Lỗi: Số lượng không được nhỏ hơn 0!");
            hopLe = false;
        }

        int namHienTai = 2026;
        if (namXuatBan <= 0 || namXuatBan > namHienTai) {
            System.out.println("❌ Lỗi: Năm xuất bản không hợp lệ (phải từ 1 đến " + namHienTai + ")!");
            hopLe = false;
        }

        // Nếu dữ liệu nhập vào không hợp lệ thì dừng chương trình
        if (!hopLe) {
            System.out.println("\n⚠️ Thông tin sách không hợp lệ. Chương trình kết thúc!");
            sc.close();
            return;
        }

        // ================= BÀI 4: CHỌN LOẠI SÁCH DÙNG SWITCH-CASE =================
        System.out.println("\n--- CHỌN LOẠI SÁCH ---");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Vui lòng chọn loại sách (1-4): ");
        int chonLoai = Integer.parseInt(sc.nextLine());

        String loaiSach = "";
        switch (chonLoai) {
            case 1:
                loaiSach = "Sách giáo khoa";
                break;
            case 2:
                loaiSach = "Sách tham khảo";
                break;
            case 3:
                loaiSach = "Sách chuyên ngành";
                break;
            case 4:
                loaiSach = "Sách khác";
                break;
            default:
                loaiSach = "Sách khác (Mặc định)";
                System.out.println("⚠️ Lựa chọn không hợp lệ, hệ thống tự động gán là Sách khác.");
                break;
        }

        // --- TÍNH TOÁN GIÁ TRỊ (KẾ THỪA TỪ TUẦN 3) ---
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05; // 5% giá trị sách
        double tongTienNhap = thanhTien + phiVanChuyen;

        // ================= BÀI 2: PHÂN LOẠI MỨC GIÁ =================
        String mucGia = "";
        if (donGia < 50000) {
            mucGia = "Sách giá thấp";
        } else if (donGia <= 100000) { // Từ 50.000 đến 100.000
            mucGia = "Sách giá trung bình";
        } else if (donGia <= 200000) { // Từ 100.000 đến 200.000
            mucGia = "Sách giá cao";
        } else { // Trên 200.000
            mucGia = "Sách giá đặc biệt";
        }

        // ================= BÀI 3: PHÂN LOẠI TỒN KHO =================
        String trangThaiTonKho = "";
        if (soLuong == 0) {
            trangThaiTonKho = "Hết sách";
        } else if (soLuong <= 5) { // Từ 1 đến 5
            trangThaiTonKho = "Sắp hết";
        } else if (soLuong <= 20) { // Từ 6 đến 20
            trangThaiTonKho = "Còn ít";
        } else { // Trên 20
            trangThaiTonKho = "Còn nhiều";
        }

        // ================= HIỂN THỊ BÁO CÁO KẾT QUẢ =================
        System.out.println("\n================ BÁO CÁO QUẢN LÝ SÁCH (TUẦN 4) ================");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.println("Loại sách       : " + loaiSach);
        System.out.println("Đơn giá         : " + donGia + " VNĐ (" + mucGia + ")");
        System.out.println("Số lượng        : " + soLuong + " cuốn (" + trangThaiTonKho + ")");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Thành tiền      : " + thanhTien + " VNĐ");
        System.out.println("Phí vận chuyển  : " + phiVanChuyen + " VNĐ (5%)");
        System.out.println("TỔNG TIỀN NHẬP  : " + tongTienNhap + " VNĐ");
        System.out.println("================================================================");

        sc.close();
    }
}
