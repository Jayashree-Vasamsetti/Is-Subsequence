package com.Playground;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main object=new Main();
        System.out.println(object.isSubsequence("fabcde","ace"));


    }

    public boolean isSubsequence(String s1,String s2){
        if(s1.length()<s2.length()){
            return false;
        }
        int j=0;
        for (int i=0;i<s1.length() &&  j<s2.length(); i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }

        return j==s2.length();
    }
}