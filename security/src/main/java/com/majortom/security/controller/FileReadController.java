package com.majortom.security.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 * Excel文件读取测试
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/10 18:40
 */
@RestController("/file")
public class FileReadController {

    @PostMapping("/read")
    public void readExcel(MultipartFile file) throws IOException {
        //1.读取Excel文件数据
        ExcelReader excelReader = ExcelUtil.getReader(file.getInputStream(), 0);
        List<List<Object>> dataList = excelReader.read();
        System.out.println(dataList.toString());
    }


}
