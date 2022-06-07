package com.majortom.java.exercise.image;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
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
    public static void main(String[] args){
        try {
            BufferedImage image = null;
            image = ImageIO.read(new File("d:/original.jpg"));
            // 创建画笔
            Graphics2D pen = image.createGraphics();
            //设置画笔颜色
            pen.setColor(new Color(179, 250, 233, 200));
            // 设置画笔字体样式为微软雅黑，斜体，文字大小为20px
            pen.setFont(new Font("微软雅黑", Font.ITALIC, 20));
            // 写上水印文字和坐标
            pen.drawString("文字水印测试", 30, 550);
            // 创建新图片文件
            File file = new File("E:/output/testWater.jpg");
            // 将处理好的图片数据写入到新图片文件中
            FileOutputStream fos = new FileOutputStream(file);
            ImageIO.write(image, "jpg", fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
