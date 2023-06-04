package java64;

import java.util.*;



    public class TreeSet{
        Set<String> thungPhieuDuThuong = new HashSet<String>();

        public TreeSet() {
            this.thungPhieuDuThuong = thungPhieuDuThuong;
        }

        public boolean themPhieu(String giaTri){
            return this.thungPhieuDuThuong.add(giaTri);
        }

        public boolean xoaPhieu(String giaTri){
            return this.thungPhieuDuThuong.remove(giaTri);
        }

        public boolean ktraPhieuTonTai(String giaTri){
            return this.thungPhieuDuThuong.contains(giaTri);
        }

        public boolean xoaPhieuDuThuong() {
            this.thungPhieuDuThuong.clear();
            return false;
        }

        public int laySoLuong(){
            return this.thungPhieuDuThuong.size();
        }

        public String rutMotPhieu(){
            String ketQua = "";
            Random rd = new Random();
            int viTri = rd.nextInt(this.thungPhieuDuThuong.size()-1);
            ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
            return ketQua;
        }
        public void inTatca (){
            System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));

        }

        public static void main(String[] args) {

            int luaChon=0;
            Scanner sc = new Scanner(System.in);
            TreeSet ss = new TreeSet();


            do {
                System.out.println("------------------------");
                System.out.println("Menu: ");
                System.out.println("1. Thêm mã số dự thưởng");
                System.out.println("2. Xóa mã số dự thưởng");
                System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay k?");
                System.out.println("4. Xóa tất cả các phiếu dự thưởng");
                System.out.println("5. Số lượng phiếu dự thưởng");
                System.out.println("6. Rút thăm trúng thưởng");
                System.out.println("7. In tất cả các phiếu");
                System.out.println("0. Thoát khỏi chương trình");
                luaChon = sc.nextInt();
                sc.nextLine();
                if (luaChon == 1 || luaChon == 2 || luaChon ==3){
                    System.out.println("Nhập vào mã dự thượng: ");
                    String giaTri = sc.nextLine();
                    if (luaChon == 1){
                        ss.themPhieu(giaTri);
                    }else if (luaChon==2){
                        ss.xoaPhieu(giaTri);
                    } else {
                        System.out.println("kết quả kiểm tra: "+ ss.ktraPhieuTonTai(giaTri));
                    }
                } else if (luaChon == 4) {
                    ss.xoaPhieuDuThuong();
                } else if (luaChon == 5) {
                    System.out.println("Lấy số lượng phiếu là: "+ss.laySoLuong());
                } else if (luaChon == 6) {
                    System.out.println("Mã số trúng thưởng là: "+ ss.rutMotPhieu());
                } else if (luaChon == 7) {
                    System.out.println("Các mã phiếu dự thưởng là: ");
                    ss.inTatca();
                }

            } while (luaChon!=0);
        }
    }
