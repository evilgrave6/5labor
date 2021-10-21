package fslf;
import java.util.Scanner;
import java.io.*;
//вариант3
public class Zadanie {
    public static void main(String[] args) throws IOException {
        File one = new File("D:\\kolich.txt");
        File two = new File("D:\\res.txt");
        DataInputStream ty1 = null; //ввод
        DataOutputStream mk1 = null;//вывод
        DataOutputStream mk2 = null;
        DataInputStream ty2 = null;
        Scanner sc = new Scanner(System.in);
        try {
            if (one.exists()) one.createNewFile();
            two.createNewFile();
            mk1 = new DataOutputStream(new FileOutputStream(one));
            System.out.println("сколько чисел хотите написать? и вводите ");
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                int x = sc.nextInt(); //числа
                mk1.writeInt(x);
            }
            ty1 = new DataInputStream(new FileInputStream(one));
            mk2 = new DataOutputStream(new FileOutputStream(two));
            int n;
            System.out.println("\nкратные 3:  ");
            while (true) {
                n = ty1.readInt();
                    if (n % 3 == 0) {
                        mk2.writeInt(n);
                        System.out.println(n);
                }
            }
        }
        catch (IOException e) {
            System.out.println("End of file");
        }
        } }


