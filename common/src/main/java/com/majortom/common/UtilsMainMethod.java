package com.majortom.common;

import cn.hutool.core.date.DateUtil;
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
        double distance=DistanceUtils.getDistance(longitudeA, latitudeA, longitudeB, latitudeB);
        System.out.println(distance<=300);
        String timeStr="2022-04-30 12:28:00";
        System.out.println(DateUtil.parse(timeStr,"yyyy-MM-dd HH:mm:ss"));
    }
}
