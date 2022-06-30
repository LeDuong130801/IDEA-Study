package idea.project.study.enity;

public class LichSuThi {
    String tenNguoiDung;
    String idDeThi;
    int soCauDung;
    int soCauHoi;
    String tenDeThi;

    public LichSuThi() {
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getIdDeThi() {
        return idDeThi;
    }

    public void setIdDeThi(String idDeThi) {
        this.idDeThi = idDeThi;
    }

    public int getSoCauDung() {
        return soCauDung;
    }

    public void setSoCauDung(int soCauDung) {
        this.soCauDung = soCauDung;
    }

    public int getSoCauHoi() {
        return soCauHoi;
    }

    public void setSoCauHoi(int soCauHoi) {
        this.soCauHoi = soCauHoi;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public LichSuThi(String tenNguoiDung, String idDeThi, int soCauDung, int soCauHoi, String tenDeThi) {
        this.tenNguoiDung = tenNguoiDung;
        this.idDeThi = idDeThi;
        this.soCauDung = soCauDung;
        this.soCauHoi = soCauHoi;
        this.tenDeThi = tenDeThi;
    }
}
