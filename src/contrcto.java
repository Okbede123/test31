public class contrcto{

    int Giaxe;

    contrcto(){
        // Contructor nay co mot tham so la ten.
        System.out.println("Ten xe la :");
    }
    public void setGia( int gia ){
        Giaxe = gia;
    }

    public int getGia( ){
        System.out.println("Gia mua xe la :" + Giaxe );
        return Giaxe;
    }
    public static void main(String []args){
        /* Tao doi tuong */
        contrcto Xecuatoi = new contrcto( );

        /* Goi mot phuong thuc lop de thiet lap gia xe */
        Xecuatoi.setGia( 1000000000 );

        /* Goi mot phuong thuc lop khac de lay gia xe */
        Xecuatoi.getGia( );

        /* Ban cung co the truy cap bien instance nhu sau */
        System.out.println("Gia tri bien :" + Xecuatoi.Giaxe );
    }
}