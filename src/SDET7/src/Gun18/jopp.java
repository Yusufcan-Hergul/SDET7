package Gun18;

public class jopp {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız  yazdırınız.

        int[] eleman=new int[50];

        for (int i = 0; i < eleman.length; i++) {
            eleman[i]=(int) (Math.random()*10);
        }
        for (int i = 0; i < eleman.length; i++) {
            if (eleman[i]%2==0)
                eleman[i]=2;

            else eleman[i]=1;
            }
        for (int i = 0; i < eleman.length; i++) {
            System.out.println("eleman[i] = " + eleman[i]);
            
        }
        }



    }

