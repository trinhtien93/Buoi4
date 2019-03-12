package com.t3h.connguoi;

public class ConNguoi {
    protected String ten;
    protected String diachi;
    protected  String Nghenghiep;
    protected   boolean Gioitinh;


    public ConNguoi(String diachi, String nghenghiep, boolean gioitinh) {
        this.diachi = diachi;
       this. Nghenghiep = nghenghiep;
      this.  Gioitinh = gioitinh;
    }

   public void daiDongVatDiDao(){

   }
    public void inThongTin(){
        System.out.println("Ten" +ten);
        System.out.println("Diachi"+diachi);
        System.out.println("");

    }

}
