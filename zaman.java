package dokuzuncuuygulama;
public class zamannnn {
    int dakika;
    int saniye;
    int saat;
    void zamaniYaz(){
    System.out.println("Zaman: "+saat+":"+dakika+":"+saniye);
}
void ilerle(int sn){
for(int i=0;i<sn;i++){
    saniye++;
    if (saniye==60){
    saniye=0;
    dakika++;
        if (dakika==60){
        dakika=0;
        saat++;
            if(saat==24){
            saat=0;
            }
        }
    }
}
zamaniYaz();
}
}