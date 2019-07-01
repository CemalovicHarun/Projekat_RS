package sample;

import java.time.LocalDate;

    public class Korisnik {
        private int idKorisnika;
        private String nazivFirme;
        private String adresa;
        private int porezniBroj;
        private String odgovornoLice;
        private int telefonskiBroj;
        private String eMail;




        public Korisnik(int idKorisnika, String nazivFirme, String adresa, int porezniBroj,String odgovornoLice,int telefonskiBroj,String eMail) {
            this.idKorisnika = idKorisnika;
            this.nazivFirme = nazivFirme;
            this.adresa = adresa;
            this.porezniBroj = porezniBroj;
            this.odgovornoLice = odgovornoLice;
            this.telefonskiBroj = telefonskiBroj;
            this.eMail = eMail;

        }

        public Korisnik() {
        }

        public int getIdKorisnika() {
            return idKorisnika;
        }

        public void setIdKorisnika(int idKorisnika) {
            this.idKorisnika = idKorisnika;
        }

        public String getNazivFirme() {
            return nazivFirme;
        }

        public void setNazivFirme(String nazivFirme) {
            this.nazivFirme = nazivFirme;
        }

        public String getAdresa() {
            return adresa;
        }

        public void setAdresa(String adresa) {
            this.adresa = adresa;
        }

        public int getPorezniBroj() {
            return porezniBroj;
        }

        public void setPorezniBroj(int porezniBroj) {
            this.porezniBroj = porezniBroj;
        }

        public String getOdgovornoLice() {
            return odgovornoLice;
        }

        public void setOdgovornoLice(String odgovornoLice) {
            this.odgovornoLice = odgovornoLice;
        }

        public int getTelefonskiBroj() {
            return telefonskiBroj;
        }

        public void setTelefonskiBroj(int telefonskiBroj) {
            this.telefonskiBroj = telefonskiBroj;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        @Override
        public String toString() {
            return "Korisnik{}";
        }
    }
