package idea.project.study.enity;

public class DeThi {
    String idDeThi;
    String tenDeThi;
    String tacGia;
    String ngayTao;
    int thoiGian;
    boolean isLimitTime;

    public DeThi(String idDeThi, String tenDeThi, String tacGia, String ngayTao, int thoiGian, boolean isLimitTime) {
        this.idDeThi = idDeThi;
        this.tenDeThi = tenDeThi;
        this.tacGia = tacGia;
        this.ngayTao = ngayTao;
        this.thoiGian = thoiGian;
        this.isLimitTime = isLimitTime;
    }

    public DeThi() {
    }

    public String getIdDeThi() {
        return idDeThi;
    }

    public void setIdDeThi(String idDeThi) {
        this.idDeThi = idDeThi;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public boolean isLimitTime() {
        return isLimitTime;
    }

    public void setLimitTime(boolean limitTime) {
        isLimitTime = limitTime;
    }
}
