package atrıca;

public class ayrıca {
    public static void main(String[] args) {

    OrtakKelime("Ben java'yı seviyorum");


    }
    public static String OrtakKelime(String cumle){

        String ortakelime="";
        String[] kelimeler=cumle.split(" ");//degişkenin tipini dogru verdikten sonra, parametrenin adı önemli degil
        for (int i = 0; i < kelimeler.length; i++) {

            if ((i+1)*2> kelimeler.length){
                ortakelime=kelimeler[i];
                break;
            }
        }return ortakelime;

    }

}
