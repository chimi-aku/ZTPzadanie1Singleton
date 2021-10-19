package com.company;

public class Main {

    public static void main(String[] args) {
	    IPolaczenie link = Baza.getPolaczenie();
        IPolaczenie link2 = Baza.getPolaczenie();
        IPolaczenie link3 = Baza.getPolaczenie();
        IPolaczenie link4 = Baza.getPolaczenie();


        link.set(0, 'a');
        System.out.println("link2: " + link2.get(0));
        System.out.println("link3: " + link3.get(0));
        System.out.println("link4: " + link4.get(0));

        System.out.println(link);
        System.out.println(link2);
        System.out.println(link3);
        System.out.println(link4);





    }
}
