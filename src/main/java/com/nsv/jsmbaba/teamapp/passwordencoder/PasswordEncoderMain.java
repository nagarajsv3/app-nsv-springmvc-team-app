package com.nsv.jsmbaba.teamapp.passwordencoder;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderMain {
    public static void main(String[] args) {

        String password="baba";
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        String md5encoded = md5PasswordEncoder.encodePassword(password, null);
        System.out.println("md5encoded= "+md5encoded);


        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String bcryptencoded = bCryptPasswordEncoder.encode(password);
        System.out.println("bcryptencoded= "+bcryptencoded);

    }
}
