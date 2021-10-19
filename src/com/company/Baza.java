package com.company;

class Baza {


    private char[] tab = new char[100]; /* ... */
    private Baza(){
    }
    private static Baza baza = new Baza();

    public static Baza getBaza() {
        if(baza != null) {
            synchronized (Baza.class) {
                if(baza != null) baza = new Baza();
            }
        }
        return baza;
    }

    public static IPolaczenie getPolaczenie() {
        return Polaczenie.getInstance();
    }

    private static class Polaczenie implements IPolaczenie {

        private static Baza baza =  getBaza();/* ... */
        private static Polaczenie[] polaczenia = new Polaczenie[]{new Polaczenie(), new Polaczenie(), new Polaczenie()};

        static int i = 0;

        public static IPolaczenie getInstance() {

            switch (i){
                case 0:
                    i = 1;
                    return polaczenia[i];
                case 1:
                    i = 2;
                    return polaczenia[i];
                case 2:
                    i = 0;
                    return polaczenia[i];
                default:
                    i = 0;
                    return polaczenia[i];
            }
        }

        public char get(int indeks) {
            return baza.tab[indeks];
        }

        public void set(int indeks, char c) {
            baza.tab[indeks] = c;
        }

        public int length() {
            return baza.tab.length;
        }
    }
}
