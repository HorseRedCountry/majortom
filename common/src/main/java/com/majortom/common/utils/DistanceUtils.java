package com.majortom.common.utils;

/**
 * <p>
 * 通过经纬度计算两点间的距离  工具类
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/6 22:35
 */
public class DistanceUtils {

    /**
     * 地球半径
     */
    private static final double EARTH_RADIUS = 6371000;

    /**
     * 转化为弧度
     *
     * @param d 经度/维度
     * @return 转化后的弧度
     */
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 计算A、B经纬度间的距离
     *
     * @param longitudeA A点经度
     * @param latitudeA  A点纬度
     * @param longitudeB B点经度
     * @param latitudeB  B点纬度
     * @return 距离（单位为米）
     */
    public static double getDistance(double longitudeA, double latitudeA, double longitudeB, double latitudeB) {
        double a = rad(latitudeA) - rad(latitudeB);
        double b = rad(longitudeA) - rad(longitudeB);
        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(rad(latitudeA)) * Math.cos(rad(latitudeB)) * Math.pow(Math.sin(b / 2), 2)));
        distance = distance * EARTH_RADIUS;
        distance = (double) Math.round(distance * 10000) / 10000;
        return distance;
    }

}
