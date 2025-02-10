package dokuzuncuuygulama;
public class Dokuzuncuuygulama {
    public static void main(String[] args) {
        zamannnn X = new zamannnn();
        zamannnn Y = new zamannnn();  
        X.saat=9;
        X.dakika=0;
        X.saniye=0;
        X.ilerle(35*60+12);
        System.out.print("X kosucusu ");
        X.ilerle(35*60+12);
        System.out.println("de kosuyu tamamlamistir");
        Y.saat=9;
        Y.dakika=0;
        Y.saniye=0;
        System.out.print("Y kosucusu ");
        Y.ilerle((35*60+12)+(31*60+3));
        System.out.println("de kosuyu tamamlamistir");
        
        
        }
    }
    

