package com.leliuchn.learn.test;
/**
 * Created by leliuchn on 17/9/29.
 */
public class LatLngDistance {

    public final static double EARTH_RADIUS = 6378.137;

    public static void main(String args[]){
        double lat1 = 39.997176;
        double lng1 = 116.477763;

        double lat2 = 39.997176;
        double lng2 = 116.477763;

        double lat3 = 39.989559;
        double lng4 = 116.483654;

        double userlat = 40.008227;
        double userlng = 116.487379;

        double distance1 = computeDistance(lat1,lng1,userlat,userlng);
        System.out.println(distance1);
    }

    public static double computeDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = Math.toRadians(lat1);
        double radLat2 = Math.toRadians(lat2);
        double a = radLat1 - radLat2;
        double b = Math.toRadians(lng1) - Math.toRadians(lng2);

        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        return s * EARTH_RADIUS;
    }
}
