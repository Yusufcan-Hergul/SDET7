package gün23;

public class araydosru {
    public static void main(String[] args) {

        String[] dizi={"bcd","abd","jude","bcd"};

        for (int i = 0; i < dizi.length; i++) {

            for (int j = i+1; j < dizi.length ; j++) {
                if (dizi[i].equals(dizi[j])){
                    System.out.println("dizi[i] = " + dizi[i]);
                
            }
            
        }

        


        }
    }
}
