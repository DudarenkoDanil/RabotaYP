package Rabota;

public class Raschet {
    private int Otchet;
    private double sum;
    private String ras;
    private double proc;


    public Raschet(int Otchet, double sum, String ras, double proc) {
        this.Otchet = Otchet;
        this.sum = sum;
        this.ras = ras;
        this.proc = proc;
    }

    public int getOtchet() {
        return Otchet;
    }

    public double getsum() {
        return sum;
    }

    public String getras() {
        return ras;
    }

    public double getproc() {
        return proc;
    }

    public void setOtchet(int newOtchet) {
        if (newOtchet > 0) Otchet = newOtchet;
    }

    public void setsum(double newsum) {
        if (newsum > 0) sum = newsum;
    }

    public void setras(String newras) {
        ras = newras;
    }

    public void setproc(double newproc) {
        if (newproc > 0) proc = newproc;
    }

    public void printAboutObject() {
        System.out.println("Расчёт: " + ras);
        System.out.println("Номер расчётного счёта: " + Otchet);
        System.out.println("Процент прибыли за месяц: " + proc);
        System.out.println("Количество суммы прибыли за месяц: " + sum);
    }
}