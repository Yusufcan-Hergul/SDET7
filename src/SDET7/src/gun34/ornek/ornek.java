package gun34.ornek;

public class ornek {



        enum Aylar{
            OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,

            TEMMUZ,AGUSTOS,EYLUL,EKİM,KASIM,ARALIK
        }

    public static void main(String[] args) {

        int ayno=5;
        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case SUBAT:
                System.out.println(28);break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKİM:
            case ARALIK:
                System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
                System.out.println(30);break;
    }
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a:Aylar.values())
            System.out.println("a = " + a);

        if (ay == Aylar.MAYIS){
            System.out.println("maaş zam ayı");
        }



    }
}
