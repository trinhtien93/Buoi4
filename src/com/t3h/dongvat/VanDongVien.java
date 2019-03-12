package com.t3h.dongvat;

import com.t3h.connguoi.ConNguoi;
import com.t3h.dongvat.Cho;

public class VanDongVien  extends ConNguoi {


    protected Cho cho;
    protected int sobanthang;
    protected String caulacbo;
    protected int Soao;



    public VanDongVien(Cho  cho, int sobanthang, String caulacbo, int soao) {
        super(ten,diachi,nghenghiep,gioitinh);
        this.Cho = cho;
        this.sobanthang = sobanthang;
        this.caulacbo = caulacbo;
        Soao = soao;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("caulacbo" +caulacbo);
        System.out.println("Sobanthang" +sobanthang);
        System.out.println("Soao" +Soao);
    }

    @Override
    public void daiDongVatDiDao() {
        super.daiDongVatDiDao();
        System.out.println("Dat chodidao cong vien");
    }
}
