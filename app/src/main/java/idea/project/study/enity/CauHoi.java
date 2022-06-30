package idea.project.study.enity;

import android.media.Image;

import java.util.ArrayList;

public class CauHoi {
    String idCauHoi;
    String noiDung;
    ArrayList<String> listCauTraLoi;
    String idDeThi;
    boolean multichoice;
    ArrayList<Integer> DapAn;

    public String getIdCauHoi() {
        return idCauHoi;
    }

    public void setIdCauHoi(String idCauHoi) {
        this.idCauHoi = idCauHoi;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public ArrayList<String> getListCauTraLoi() {
        return listCauTraLoi;
    }

    public void setListCauTraLoi(ArrayList<String> listCauTraLoi) {
        this.listCauTraLoi = listCauTraLoi;
    }

    public String getIdDeThi() {
        return idDeThi;
    }

    public void setIdDeThi(String idDeThi) {
        this.idDeThi = idDeThi;
    }

    public boolean isMultichoice() {
        return multichoice;
    }

    public void setMultichoice(boolean multichoice) {
        this.multichoice = multichoice;
    }

    public ArrayList<Integer> getDapAn() {
        return DapAn;
    }

    public void setDapAn(ArrayList<Integer> dapAn) {
        DapAn = dapAn;
    }

    public CauHoi(String idCauHoi, String noiDung, ArrayList<String> listCauTraLoi, String idDeThi, boolean multichoice, ArrayList<Integer> dapAn) {
        this.idCauHoi = idCauHoi;
        this.noiDung = noiDung;
        this.listCauTraLoi = listCauTraLoi;
        this.idDeThi = idDeThi;
        this.multichoice = multichoice;
        DapAn = dapAn;
    }

    public CauHoi() {
    }
}
