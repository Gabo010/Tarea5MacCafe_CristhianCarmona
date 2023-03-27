package ICO_POO_2258;

public class MaqCafe {
    private int aguaTotal;
    private int cafeTotal;
    private int cremaTotal;
    private int vasosTotal;

    public MaqCafe() {
       aguaTotal = 5000;
       cafeTotal = 1000;
       cremaTotal = 1500;
       vasosTotal = 50;
    }

    public MaqCafe(int aguaTotal, int cafeTotal, int cremaTotal, int vasosTotal) {
        this.aguaTotal = aguaTotal;
        this.cafeTotal = cafeTotal;
        this.cremaTotal = cremaTotal;
        this.vasosTotal = vasosTotal;
    }

    public int getAguaTotal() {
        return aguaTotal;
    }

    public void setAguaTotal(int aguaTotal) {
        this.aguaTotal = aguaTotal;
    }

    public int getCafeTotal() {
        return cafeTotal;
    }

    public void setCafeTotal(int cafeTotal) {
        this.cafeTotal = cafeTotal;
    }

    public int getCremaTotal() {
        return cremaTotal;
    }

    public void setCremaTotal(int cremaTotal) {
        this.cremaTotal = cremaTotal;
    }

    public int getVasosTotal() {
        return vasosTotal;
    }

    public void setVasosTotal(int vasosTotal) {
        this.vasosTotal = vasosTotal;
    }

    @Override
    public String toString() {
        return "MaqCafe{" +
                "aguaTotal=" + aguaTotal +
                ", cafeTotal=" + cafeTotal +
                ", cremaTotal=" + cremaTotal +
                ", vasosTotal=" + vasosTotal +
                '}';
    }
    public void Americano(){
        int agua = 180;
        int cafe = 15;
        int vaso = 1;
        int resta = aguaTotal - agua;
        int resta2 = cafeTotal - cafe;
        int resta3 = vasosTotal - vaso;
        setAguaTotal(resta);
        setCafeTotal(resta2);
        setVasosTotal(resta3);
        System.out.println("El cafe americano esta listo\n");
    }
    public void Expresso(){
        int agua = 120;
        int cafe = 20;
        int vaso = 1;
        int resta = aguaTotal - agua;
        int resta2 = cafeTotal - cafe;
        int resta3 = vasosTotal - vaso;
        setAguaTotal(resta);
        setCafeTotal(resta2);
        setVasosTotal(resta3);
        System.out.println("El Expreso esta listo\n");
    }
    public void Capuchino(){
        int agua = 100;
        int cafe = 14;
        int vaso = 1;
        int crema = 70;
        int resta = aguaTotal - agua;
        int resta2 = cafeTotal - cafe;
        int resta3 = vasosTotal - vaso;
        int resta4 = cremaTotal - crema;
        setAguaTotal(resta);
        setCafeTotal(resta2);
        setVasosTotal(resta3);
        setCremaTotal(resta4);
        System.out.println("El capuchino esta listo\n");
    }
}
