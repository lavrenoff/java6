package jv.seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        notebook nt1 = new notebook("ASUS", 64, 64 ,"Linux", "белый");
        notebook nt2 = new notebook("ACER", 128, 128 ,"Linux", "черный");
        notebook nt3 = new notebook("Digma", 128, 254 ,"Windows", "черный");
        notebook nt4 = new notebook("Apple", 254, 128 ,"Windows", "белый");
        notebook nt5 = new notebook("Apple", 64, 128 ,"macOS", "красный");

        HashSet<notebook> Set = new HashSet<>();
        Set.add(nt1);
        Set.add(nt2);
        Set.add(nt3);
        Set.add(nt4);
        Set.add(nt5);
        printInfo(Set);
        selectNote(Set);

    }

    public static void selectNote(HashSet<notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите по какому критерию необходимо отобрать ноутбуки:\n" +
                            "1 - производитель\n" +
                            "2 - цвет\n" +                            
                            "3 - объем жесткого диска\n" +
                            "4 - объем оперативной памяти\n" +
                            "5 - операционна система");
        int command = in.nextInt();
        if(command == 1){
            selectCompany(setNote);
        }
        else if(command == 2){
            selectColor(setNote);
        }
        else if(command == 3){
            selectSSD(setNote);
        }
        else if(command == 4){
            selectRam(setNote);
        }
        else if(command == 5){
            selectOs(setNote);
        }
    }

    public static void printInfo(HashSet<notebook> set){
        for (notebook elem : set) {
            System.out.println(elem.getInfo());
            System.out.println();
        }
    }

    public static void selectCompany(HashSet<notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную компанию:\n" +
                            "1 - ASUS\n" +
                            "2 - Lenovo\n" +
                            "3 - Digma\n" +
                            "4 - Apple\n");
        int n = in.nextInt();
        HashMap<Integer, String> comp = new HashMap<Integer, String>();
        comp.put(1, "ASUS");
        comp.put(2, "Lenovo");
        comp.put(3, "Digma");
        comp.put(4, "Apple");
        int i = 1;
        for (notebook elem : setNote) {
            if(elem.getCompany().equals(comp.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    private static void selectColor(HashSet<notebook> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужный цвет:\n" +
                            "1 - белый\n" +
                            "2 - черный\n" +
                            "3 - красный\n");
        int n = in.nextInt();
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "белый");
        color.put(2, "черный");
        color.put(3, "красный");
        int i = 1;
        for (notebook elem : setNote) {
            if(elem.getColor().equals(color.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }        
    }

    public static void selectSSD(HashSet<notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём жесткого диска:\n" +
                            "1 - 64Гб\n" +
                            "2 - 128ГБ\n" +
                            "3 - 256ГБ\n" );
        int n = in.nextInt();
        HashMap<Integer, Integer> hardDrive = new HashMap<Integer, Integer>();
        hardDrive.put(1, 64);
        hardDrive.put(2, 128);
        hardDrive.put(3, 256);
        int i = 1;
        for (notebook elem : setNote) {
            if(elem.getSSD() == hardDrive.get(n)){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    public static void selectRam(HashSet<notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём оперативной памяти:\n" +
                            "1 - 64Гб\n" +
                            "2 - 128ГБ\n" +
                            "3 - 254ГБ\n");
        int n = in.nextInt();
        HashMap<Integer, Integer> ram = new HashMap<Integer, Integer>();
        ram.put(1, 64);
        ram.put(2, 128);
        ram.put(3, 254);        
        int i = 1;
        for (notebook elem : setNote) {
            if(elem.getRAM() == ram.get(n)){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    private static void selectOs(HashSet<notebook> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите операционную систему:\n" +
                            "1 - Windows\n" +
                            "2 - Linux\n" +
                            "3 - macOS\n");
        int n = in.nextInt();
        HashMap<Integer, String> os = new HashMap<Integer, String>();
        os.put(1, "Windows");
        os.put(2, "Linux");
        os.put(3, "macOS");
        int i = 1;
        for (notebook elem : setNote) {
            if(elem.getOS().equals(os.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }        
    }


}
