import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    protected String maSach;
    protected int ngayNhap, thangNhap, namNhap;
    protected double donGia;
    protected int soLuong;
    protected String nxb;

    public Sach() {
    }

    public Sach(String maSach, int ngayNhap, int thangNhap, int namNhap, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.thangNhap = thangNhap;
        this.namNhap = namNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }

    public String getMaSach() {
        return maSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNxb() {
        return nxb;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void nhap(Scanner sc) {
        sc.nextLine(); // Xử lý trôi lệnh
        System.out.print("Ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Ngay, thang, nam nhap: ");
        ngayNhap = sc.nextInt();
        thangNhap = sc.nextInt();
        namNhap = sc.nextInt();
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        System.out.print("So luong: ");
        soLuong = sc.nextInt();
        sc.nextLine(); // Xử lý trôi lệnh
        System.out.print("Nha xuat ban: ");
        nxb = sc.nextLine();
    }

    public void xuat() {
        System.out.println("------------------------------");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap + "/" + thangNhap + "/" + namNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nxb);
    }
}

class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, int ngayNhap, int thangNhap, int namNhap, double donGia, int soLuong, String nxb,
            String tinhTrang) {
        super(maSach, ngayNhap, thangNhap, namNhap, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        }
        return soLuong * donGia * 0.5;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Tinh trang (moi hoac cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("------------------------------");
    }
}

class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, int ngayNhap, int thangNhap, int namNhap, double donGia, int soLuong, String nxb,
            double thue) {
        super(maSach, ngayNhap, thangNhap, namNhap, donGia, soLuong, nxb);
        this.thue = thue;
    }

    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap thue: ");
        thue = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("------------------------------");
    }
}