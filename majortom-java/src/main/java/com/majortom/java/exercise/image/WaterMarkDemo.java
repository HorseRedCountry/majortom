package com.majortom.java.exercise.image;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * <p>
 * 水印工具类 Demo
 * </P>
 *
 * @author Major Tom
 * @since 2022/6/2 15:46
 */
public class WaterMarkDemo {
    public static void main(String[] args) throws IOException {
        Thumbnails.of(new File("d://original.jpg"))
                .size(160, 160)
                .rotate(90)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("d://watermark.png")), 0.5f)
                .outputQuality(0.8)
                .toFile(new File("d://image-with-watermark.jpg"));
    }
}
