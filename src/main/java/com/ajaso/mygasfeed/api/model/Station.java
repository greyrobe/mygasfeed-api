package com.ajaso.mygasfeed.api.model;

/**
 * Author: Adam J Jaso Jr
 * Adam J Jaso Jr 2014
 */
public class Station
{
    public long id;
    public String country;
    public String price;
    public String address;
    public int diesel;
    public double lat;
    public double lng;
    public String station;
    public String region;
    public String city;
    public String date;
    public String distance;

    public static class Detail
    {
        public String address;
        public long id;
        public String city;
        public String region;
        public String country;
        public double lat;
        public double lng;
        public String station_name;
        public String reg_price;
        public String reg_date;
        public String mid_price;
        public String mid_date;
        public String pre_price;
        public String pre_date;
        public int diesel;
    }
}
