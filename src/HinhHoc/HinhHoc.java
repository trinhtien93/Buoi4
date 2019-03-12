package HinhHoc;

public abstract class HinhHoc {
    protected String tenhinh;

    public HinhHoc(String tenhinh) {
        this.tenhinh = tenhinh;
    }

    public abstract void tinhDienTIch();

    public abstract void tinhChuVi();

}
