package com.scs.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;  
import org.springframework.stereotype.Service;
@Service
public class HashcoderMain {  
  
 public String getHashPassword(String password) {  
//System.out.println("1"+password);	 
  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
  
  //System.out.println("2");
  String hashedPassword = passwordEncoder.encode(password);
  //System.out.println("3"+hashedPassword);
  //System.out.println("Original Password:"+password+"Hashcoded Password:"+hashedPassword);  
  //System.out.println("4");
  return hashedPassword;  
 }
}