import java.util.Scanner;

public class KDVTutarihesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar,kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = inp.nextDouble();

        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Orani: "+kdvOran);
        System.out.println("KDV Tutari: "+kdvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);

    }
}
