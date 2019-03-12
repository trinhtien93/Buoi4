package com.t3h.dongvat;

public class DongVat {

    protected String ten;
    protected String tuoi;
    protected Boolean gioitinh;
    protected String loai;

    public DongVat(String ten, String tuoi, Boolean gioitinh, String loai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.loai = loai;
    }

    public void inThongTin() {
        System.out.println("Ten" + ten);
        System.out.println("Tuoi" + tuoi);
        System.out.println("gioitinh" + gioitinh);
        System.out.println("loai" + loai);
    }
}