
public class pratikum7 {
        public static void main(String[] args) {

                // Bangun Ruang
                System.out.println("=======================================");
                System.out.println("Bangun ruang");
                System.out.println("");

                // Kubus
                System.out.println("hitung kubus ");
                bangunruang br1 = new bangunruang();
                br1.setsisi(7);
                System.out.println("luas kubus adalah : " + br1.luaskubus());

                bangunruang br2 = new bangunruang();
                br2.setsisi(5);
                System.out.println("Volume kubus adalah : " + br2.volumekubus());
                System.out.println("");

                // Balok
                System.out.println("hitung balok ");
                bangunruang br3 = new bangunruang();
                br3.setpanjang(6);
                br3.setlebar(11);
                System.out.println("luas balok adalah : " + br3.luasbalok());

                bangunruang br4 = new bangunruang();
                br4.setpanjang(4);
                br4.setlebar(7);
                br4.settinggi(8);
                System.out.println("Volume balok adalah : " + br4.volumebalok());
                System.out.println("");

                // Balok
                System.out.println("hitung kerucut ");
                bangunruang br5 = new bangunruang();
                br5.setjari(15);
                br5.setsisi(11);
                System.out.println("luas kerucut adalah : " + br5.luaskerucut());

                bangunruang br6 = new bangunruang();
                br6.setjari(24);
                br6.settinggi(13);
                System.out.println("Volume kerucut adalah : " + br6.volumekerucut());
        }
}
