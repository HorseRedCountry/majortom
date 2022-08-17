package com.majortom.web.pojo.vo;

import com.majortom.web.pojo.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 *  分页查询 视图类
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 12:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageVo {

    //总数
    private int total;
    //每页数据量
    private int pageSize;
    //当前页码
    private int currentPage;

}
