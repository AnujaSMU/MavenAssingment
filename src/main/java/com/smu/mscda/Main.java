package com.smu.mscda;

import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in lowercase:");
        String input = scanner.nextLine();
        
        String capitalizedInput = StringUtils.capitalize(input);
        System.out.println("Capitalized Input: " + capitalizedInput);
        
        String md5Hex = DigestUtils.md5Hex(capitalizedInput);
        System.out.println("MD5 Hex: " + md5Hex);
        
        scanner.close();
    }
}