package org.emirozturk;

import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Squad squad;
    public static void main(String[] args) {
        squad = FileOps.readFile("");
        scanner = new Scanner(System.in);
        menu();
        FileOps.writeFile(squad,"");
    }
    static void menu(){
        while(true){
            listSquad();
            System.out.println("1. Üye Ekle\n");
            System.out.println("2. Üye Sil\n");
            System.out.println("3. Güncelle\n");
            System.out.println("4. Çıkış\n");
            System.out.println("Seçim:");
            int option = scanner.nextInt();
            if (option == 1)addMember();
            else if (option == 2) removeMember();
            else if (option == 3) updateSquad();
            else if (option == 4) break;
        }
    }
    private static void listSquad(){

    }
    private static void updateSquad() {

    }

    private static void removeMember() {

    }

    private static void addMember() {

    }
}