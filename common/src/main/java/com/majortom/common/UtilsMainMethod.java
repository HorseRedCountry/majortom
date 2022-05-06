package com.majortom.common;

import com.majortom.common.utils.DistanceUtils;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/6 22:49
 */
public class UtilsMainMethod {
    public static void main(String[] args) {
        double longitudeA = 117.216475;
        double latitudeA = 31.816223;
        double longitudeB = 117.216367;
        double latitudeB = 31.816346;
        System.out.println(DistanceUtils.getDistance(longitudeA, latitudeA, longitudeB, latitudeB));
    }
}
