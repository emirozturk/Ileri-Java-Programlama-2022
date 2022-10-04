package org.emirozturk;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Squad squad;
    public static void main(String[] args) {
        squad = FileOps.readFile("/Users/emirozturk/Desktop/data.json");
        scanner = new Scanner(System.in);
        menu();
        FileOps.writeFile(squad,"/Users/emirozturk/Desktop/data.json");
    }
    static void menu(){
        while(true){
            listSquad();
            System.out.println("1. Üye Ekle");
            System.out.println("2. Üye Sil");
            System.out.println("3. Güncelle");
            System.out.println("4. Çıkış");
            System.out.println("Seçim:");
            int option = scanner.nextInt();
            if (option == 1)addMember();
            else if (option == 2) removeMember();
            else if (option == 3) updateSquad();
            else if (option == 4) break;
        }
    }
    private static void listSquad(){
        System.out.println(squad.getInfo());
    }
    private static void updateSquad() {
        System.out.println("Yeni isim giriniz");
        var newName = scanner.nextLine();
        squad.updateName(newName);
    }

    private static void removeMember() {
        System.out.println("Üye adı giriniz");
        String memberName = scanner.nextLine();
        int result = squad.removeMember(memberName);
        if(result==-1)System.out.println("Hata");
        if(result==0) System.out.println("Bulunamadı");
        if(result==1) System.out.println("Silindi");
    }

    private static void addMember() {
        var newMember = new Member();
        System.out.println("İsim Giriniz");
        newMember.setName(scanner.nextLine());
        System.out.println("Yaş Giriniz");
        newMember.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Gizli Kimlik");
        newMember.setSecretIdentity(scanner.nextLine());
        var powers = new ArrayList<String>();
        var power = "";
        while(true) {
            System.out.println("Güç");
            power = scanner.nextLine();
            if(power.equals(""))break;
            powers.add(power);
        }
        newMember.setPowers(powers);
        squad.addMember(newMember);
    }
}