package hello.core.test;

import hello.core.member.Grade;

public class testfile {
    public static void main(String [] args){
        String tmp = "BASIC";
        System.out.println(Grade.BASIC.getClass().getName());
        System.out.println(Grade.BASIC instanceof Grade);

    }
}
