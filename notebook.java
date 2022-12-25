package jv.seminar6;

public class notebook {
    private String company;//название фирмы ноутбука
    private int RAM;    // ОЗУ
    private int SSD;    // Объем ЖД
    private String OS;  // Операционная система
    private String color; // Цвет

    public notebook(String company,int RAM,int SSD,String OS, String color){
        this.company=company;
        this.RAM=RAM;
        this.SSD=SSD;
        this.OS=OS;
        this.color=color;
    }

    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public int getRAM(){
        return RAM;
    }

    public void setSSD(int SSD){
        this.SSD = SSD;
    }

    public int getSSD(){
        return SSD;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public String getOS(){
        return OS;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public String getInfo(){
        return "Название фирмы "+company+"\nЦвет " + color + "\nОбъем жесткого диска " + SSD + "\nОбъем оперативной памяти " + RAM + "\nОперационная система " + OS;
    }

}
