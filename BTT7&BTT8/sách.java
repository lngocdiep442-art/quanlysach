// Lớp đại diện cho đối tượng Sách
public class Sach {
    // Thuộc tính của đối tượng Sách
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    // Constructor mặc định (không tham số)
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Phương thức in thông tin chi tiết của sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach +
                " | Tiêu đề: " + tieuDe +
                " | Tác giả: " + tacGia +
                " | Năm xuất bản: " + namXuatBan +
                " | Số lượng: " + soLuong);
    }
}
