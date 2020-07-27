package com.company;
import java.util.*;

public class Beagle {

    public static void main(String args[]) {

        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Encryption\n2 - Decryption");
        choice = sc.nextInt();
        if (choice == 1) {
            cEncryption();
        }
        if (choice == 2) {
            cDecryption();
        }
    }

    public static void cEncryption() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plaintext: ");
        String plaintext = sc.nextLine();
        System.out.println("Enter the shift value: ");
        
        int shift = sc.nextInt();
        String ciphertext = "";
        char character;
        
        for(int i=0; i < plaintext.length();i++)

        {
            character = plaintext.charAt(i);

            if(character >= 'a' && character <= 'z')
            {
                character = (char) (character + shift);

                if(character > 'z') {

                    character = (char) (character+'a'-'z'-1);
                }
                ciphertext = ciphertext + character;
            }


            else if(character >= 'A' && character <= 'Z') {

                character = (char) (character + shift);


                if(character > 'Z') {

                    character = (char) (character+'A'-'Z'-1);
                }
                ciphertext = ciphertext + character;
            }
            else {
                ciphertext = ciphertext + character;
            }

        }
        System.out.println("ciphertext : " + ciphertext);
    }

    public static void cDecryption() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the ciphertext message : ");
        String ciphertext = sc.nextLine();
        System.out.println("Enter the shift value : ");
       
        int shift = sc.nextInt();
        String cDecrypt = "";
        for(int i=0; i < ciphertext.length();i++)

        {

            char character = ciphertext.charAt(i);

            if(character >= 'a' && character <= 'z')
            {

                character = (char) (character - shift);


                if(character < 'a') {

                    character = (char) (character-'a'+'z'+1);
                }
                cDecrypt = cDecrypt + character;
            }

            else if(character >= 'A' && character <= 'Z')
            {

                character = (char) (character - shift);


                if (character < 'A') {

                    character = (char) (character-'A'+'Z'+1);
                }
                cDecrypt = cDecrypt + character;
            }
            else
            {
                cDecrypt = cDecrypt + character;
            }
        }
        System.out.println("decrypt message : " + cDecrypt);
    }
}