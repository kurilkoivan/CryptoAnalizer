package ru.javarush.kurilko.crypto.analizer;

import java.util.Scanner;

public class CesarAppMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = scan.nextLine();
        StringBuilder output = new StringBuilder();
        System.out.println("Enter key number");
        int keyVal = Integer.parseInt(scan.nextLine());
        char key = (char) keyVal;
        for (int x = 0; x < message.length(); x++) {
            char input = message.charAt(x);
            if(input >= 'A' && input <= 'Z'){
                input += key;
                if (input > 'Z')
                    input -=26;
                if(input < 'A')
                    input +=26;
                }
                else if (input >= 'a' && input <= 'z'){
                    input += key;
                    if (input > 'z')
                        input -=26;
                    if(input < 'a')
                        input +=26;
                    }
                else if (input >= '0' && input <= '9'){
                    input += (keyVal % 10);
                    if(input > '9')
                        input -= 10;
                    if(input < '0')
                        input += 10;
            }
            output.append(input);
                }
        System.out.println(output);
        scan.close();
    }
}


