package com.bank.Date;

public enum Month {
        FARVARDIN("FARVARDIN",1 ),ORDIBEHESHT("ORDIBEHESHT", 2),KHORDAD("KHORDAD", 3),
        TIR("TIR", 4),MORDAD("MORDAD", 5),SHAHRIVAR("SHAHRIVAR", 6),
        MEHR("MEHR", 7),ABAN("ABAN", 8),AZAR("AZAR",9),
        DEY("DEY", 10),BAHMAN("BAHMAN", 11),ESFAND("ESFAND" , 12);

        private String abbr;

        private int number ;
        Month(String abbr , int number ) {
            this.abbr = abbr;
            this.number= number;
        }

        public int getNumber() {
            return number;
        }

        public void setAbbr(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }

        @Override
        public String toString() {
            return  abbr ;}
    }


