package org.launchcode.java.studios.countingCharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> characters = new HashMap<>();
        String prompt;
        do{
            System.out.println("String:");
            prompt = input.nextLine();
        } while (prompt == "");
        char[] charactersInString = prompt.toCharArray();
        for (char character : charactersInString){
            if (characters.containsKey(character)){
                Integer newCount = (characters.get(character)) + 1;
                characters.put(character, newCount);
            } else {
                characters.put(character, 1);
            }
        }
        System.out.println(characters);
    }

    }
