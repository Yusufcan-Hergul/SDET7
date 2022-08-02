package gun28.gun3Ornek;

public class elektrikHesba {
    int toplamTüketim=0;
    double oran=0.7;
    double odenecekTutar=0;

public void tuketimEKLE(int tuketim){
    toplamTüketim+=tuketim;
}
public void setToplamTüketimYaz(){
    System.out.println("toplamTüketim = " + toplamTüketim);
}

}
