package com.aiwebops.learnjava.group1;

import java.util.Scanner;

public class InputCode {

    public String inputOneToNine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1 to 9");
        String line = scanner.nextLine();
        return line;
    }

    public static void main(String[] args){
        InputCode ic = new InputCode();
        String line = ic.inputOneToNine();
        System.out.println(line);
    }

}
