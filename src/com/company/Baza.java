package com.company;

class Baza {
    private Baza(){
    }

    private char[] tab = new char[100]; /* ... */


    public static IPolaczenie getPolaczenie() {
        return Polaczenie.getInstance();
    }

    private static class Polaczenie implements IPolaczenie {

        private static Baza baza = new Baza(); /* ... */
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
