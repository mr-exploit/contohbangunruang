
public class bangunruang extends gabungan{
    
//  kubus
    public int luaskubus(){
        return 6 * (getsisi() * getsisi());
    }
    public int volumekubus(){
        return getsisi() * getsisi() * getsisi();
    }
    
//    balok
    public int luasbalok(){
        return 2 * getpanjang() * getlebar() + 2 * getpanjang() * getlebar() + 2 * getpanjang() * getlebar();
    }
    public int volumebalok(){
        return getpanjang()* getlebar()* gettinggi();
    }
//    kerucut
    public int luaskerucut(){  
        return (int) (3.14 * getjari() * ( getjari() + getsisi()));
    }
    public double volumekerucut(){
        return (int) ((3.14 * getjari() * getjari()) * gettinggi() / 3 );
    }
}
