package gun44;

public class JavaTryCatch {
    public static void main(String[] args) {
        String str="";
        System.out.println("program başladı");
        int a=5;
        int b=0;
        int c=0;
        
        try {
            char ilkharf=str.charAt(0);
            c = a / b;
        }
        catch (StringIndexOutOfBoundsException hata){
            System.out.println("kelime boş oldugu için harf alınamadı");
        }
        catch (ArithmeticException hata){
            System.out.println("sayı sıfıra bölünmez");
        }
        catch (Exception hata){
            System.out.println("hata.getMessage() = " + hata.getMessage());
        }
    }
}
