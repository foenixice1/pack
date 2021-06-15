package hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanvienFullTime[] arrNhanvienFulltime = new NhanvienFullTime[0];
        NhanVienPartTime[] arrNhanVienPartTime = new NhanVienPartTime[0];
        do {
            System.out.println("Menu");
            System.out.println("1.Thêm mới");
            System.out.println("2.Hiển thị");
            System.out.println("3.Hiển thị DSNV Fulltime có mức lương thấp hơn trung bình");
            System.out.println("4.Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1.NV Fulltime");
                    System.out.println("2.NV Parttime");
                    int num = scanner.nextInt();
                    if (num == 1) {
                        arrNhanvienFulltime = Manager.createFullTime(arrNhanvienFulltime);
                    } else if (num == 2) {
                        arrNhanVienPartTime = Manager.createPartTime(arrNhanVienPartTime);
                    } else {
                        System.out.println("Sai rồi nhập lại thôi ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrNhanvienFulltime.length; i++) {
                        if (arrNhanvienFulltime[i] != null) System.out.println(arrNhanvienFulltime[i]);
                    }
                    for (int i = 0; i < arrNhanVienPartTime.length; i++) {
                        if (arrNhanVienPartTime[i] != null) System.out.println(arrNhanVienPartTime[i]);
                    }

                    break;

                case 3:
                    float TBC = Manager.SUMluongthuc / Manager.i;
                    for (int i = 0; i < arrNhanvienFulltime.length; i++) {
                        if (Manager.arrLuongThucFullTime[i] < TBC) {
                            System.out.println(arrNhanvienFulltime[i]);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);


    }
}
