package Rabota;

public class Sotrydnik {
    private String Name;
    private String Famil;
    private String Otchestvo;
    private String Dolgnost;
    private String kolk;
    private double zar;

    public Sotrydnik() {
        Name = "Без имени";
        Famil = "Без фамилии";
        Otchestvo = "Без отчества";
        Dolgnost = "Без должности";
        kolk = "Пациентов за месяц не выявлено";
        zar = 0;
    }

    public Sotrydnik(String n, String f, String o, String d, String k, double z) {
        Name = n;
        Famil = f;
        Otchestvo = o;
        Dolgnost = d;
        kolk = k;
        zar = z;
    }


    public String getName() {
        return Name;
    }

    public String getFamil() {
        return Famil;
    }

    public String getOtchestvo() {
        return Otchestvo;
    }

    public String getDolgnost() {
        return Dolgnost;
    }

    public String getKolk() {
        return kolk;
    }

    public double getzar() {
        return zar;
    }

    public void setName(String newName) {
        Name = newName;
    }

    public void setFamil(String newFamil) {
        Famil = newFamil;
    }

    public void setOtchestvo(String newOtchestvo) {
        Otchestvo = newOtchestvo;
    }

    public void setDolgnost(String newDolgnost) {
        Dolgnost = newDolgnost;
    }

    public void setkolk(String newkolk) {
        kolk = newkolk;
    }

    public void setzar(double newzar) {
        if (newzar > 0) zar = newzar;
    }

    public void printAboutObject() {
        System.out.println("\nИмя сотрудника: " + Name);
        System.out.println("Фамилия сотрудника: " + Famil);
        System.out.println("Отчество сотрудника: " + Otchestvo);
        System.out.println("Должность: " + Dolgnost);
        System.out.println("Количество пациентов за месяц: " + kolk);
        System.out.println("Зарплата: " + zar);
    }
}