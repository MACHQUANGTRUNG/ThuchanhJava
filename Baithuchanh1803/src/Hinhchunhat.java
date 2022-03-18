public class Hinhchunhat {
    double dai, rong;
 
    // khởi tạo phương thức constructor có tham số
    public Hinhchunhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
 
    //khởi tạo phương thức constructor không có tham số
    public Hinhchunhat() {
    }
 
    //------------------begin getter and setter----------------------
    public double getRong() {
        return rong;
    }
 
    public double getDai() {
        return dai;
    }
 
    public void setRong(double rong) {
        this.rong = rong;
    }
 
    public void setDai(double dai) {
        this.dai = dai;
    }
 
    //------------------end getter and setter---------------------------
    //tạo hàm tính diện tích
    double tinhDienTich() {
        return dai * rong;
    }
 
    //tạo hàm tính chu vi
    double tinhChuVi() {
        return (dai + rong) * 2;
    }

}