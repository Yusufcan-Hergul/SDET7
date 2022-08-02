package gun40.Ornek2;

public abstract class  Sekil {
//1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
//2- Bu classın Alan ve cevre abstract metodları ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
    //  sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
    //        3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
    //4- Bunlardan birer örnek main metodunda çalıştırınız.

    private String name;

    public abstract double alan();

    public abstract double cevre();


    public void ciz() {
        System.out.println("this.name = " + this.name);
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                '}';

    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





