package uts_pbo;

/**
 * Asala Melani
 * XII RPL B
 */
public class Uts_pbo {
    public static void main(String[] args) {
        String salam = "Assalamu'alaikum semuanya";
        System.out.println(salam);
        
        char result= salam.charAt(2);
        String ya= salam.substring(23,25);
        System.out.println(result+"a"+ya);
        
        String a = salam.substring(0,2);
        String b= salam.substring(3,6);
        System.out.println(a+b);
        
        String ME= salam.substring(18,20);
        StringBuilder d= new StringBuilder(ME);
        System.out.println(d.reverse()+(salam.replaceAll("(.*)Assalamu'alaikum semuanya(.*)","lani")));
        
        System.out.println(salam.indexOf("i"));
        
        String kelas="rpl B";
        String k = kelas.toUpperCase();
         System.out.println(k);
    
}
}