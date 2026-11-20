public class Sach {
    // Yêu cầu 1: Đóng gói tất cả thuộc tính với từ khóa private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor mặc định (không tham số)
    public Sach() {}

    // Yêu cầu 4: Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); // Gọi setter để áp dụng kiểm tra ràng buộc
        setSoLuong(soLuong);       // Gọi setter để áp dụng kiểm tra ràng buộc
    }

    // Yêu cầu 2 & 3: Các phương thức Getter và Setter có kiểm tra hợp lệ

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3: Kiểm tra năm xuất bản hợp lệ (> 0 và <= năm hiện tại)
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = 2026; 
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("⚠️ Năm xuất bản (" + namXuatBan + ") không hợp lệ! Tự động gán bằng năm " + currentYear);
            this.namXuatBan = currentYear;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3: Kiểm tra số lượng không được âm (>= 0)
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("⚠️ Số lượng (" + soLuong + ") không được âm! Tự động gán bằng 0.");
            this.soLuong = 0;
        }
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach +
                           " | Tiêu đề: " + tieuDe +
                           " | Tác giả: " + tacGia +
                           " | Năm xuất bản: " + namXuatBan +
                           " | Số lượng: " + soLuong);
    }
}
