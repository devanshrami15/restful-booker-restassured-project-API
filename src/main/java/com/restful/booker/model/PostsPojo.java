package com.restful.booker.model;

import java.util.List;

    public class PostsPojo {
        private String firstname;
        private String lastname;
        private String totalprice;
        private String depositpaid;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(String totalprice) {
            this.totalprice = totalprice;
        }

        public String getDepositpaid() {
            return depositpaid;
        }

        public void setDepositpaid(String depositpaid) {
            this.depositpaid = depositpaid;
        }

        public List<String> getBookingdates() {
            return bookingdates;
        }

        public void setBookingdates(List<String> bookingdates) {
            this.bookingdates = bookingdates;
        }

        public String getAdditionalneeds() {
            return additionalneeds;
        }

        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }

        private List<String> bookingdates;
        private String additionalneeds;

    }

