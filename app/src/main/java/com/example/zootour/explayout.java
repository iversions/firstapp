package com.example.zootour;

public class explayout {

    private String coname, des, dtfrom, dtto;
    private int cologo;

    public explayout(String coname, String des, String dtfrom, String dtto, int cologo) {
        this.coname = coname;
        this.des = des;
        this.dtfrom = dtfrom;
        this.dtto = dtto;
        this.cologo = cologo;

    }


    public String getConame() {
        return coname;
    }

    public String getDes() {
        return des;
    }

    public String getDtfrom() {
        return dtfrom;
    }

    public String getDtto() {
        return dtto;
    }

    public int getCologo() {
        return cologo;
    }
}
