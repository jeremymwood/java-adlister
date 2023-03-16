package com.codeup.adlister.Util;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
    private static final int ROUNDS = 12;

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }

    public static boolean check(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
//
//    public static void main(String[] args) {
//        String pw = "password";
//        System.out.println(Password.hash(pw));
//        System.out.println(Password.hash(pw));
//        System.out.println(Password.hash(pw));
//        System.out.println(Password.hash(pw));
//        String hash = "$2a$12$Vt9xJ9MTr7RmAVDP5fjHP.zkj4OttrSVgDYaPfxhUy.jeDutxoPee";
//        System.out.println(Password.check(pw, hash));
//    }
}