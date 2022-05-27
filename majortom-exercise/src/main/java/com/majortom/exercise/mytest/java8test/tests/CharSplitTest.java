package com.majortom.exercise.mytest.java8test.tests;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/13 12:50
 */
public class CharSplitTest {
    public static void main(String[] args) {
        String str="M4L";
        String primaryCode = str.substring(0,2);
        System.out.println(primaryCode);
        String secondaryCode = str.substring(2,3);
        System.out.println(secondaryCode);

        Map<String, Integer> dictItemMap = Maps.newHashMap();
        //是否在职
        dictItemMap.put("在职", 0);
        dictItemMap.put("离职", 1);
        //证件类型
        dictItemMap.put("身份证", 1);
        dictItemMap.put("军人证", 2);
        dictItemMap.put("护照", 3);
        //员工状态
        dictItemMap.put("待审核", 1);
        dictItemMap.put("待入职", 2);
        dictItemMap.put("待转正", 3);
        dictItemMap.put("已正式", 4);
        //在职身份
        dictItemMap.put("自签工", 1);
        dictItemMap.put("实习生", 2);
        dictItemMap.put("第三方", 3);
        //工作类型
        dictItemMap.put("科室", 1);
        dictItemMap.put("车间", 2);
        //薪酬类型
        dictItemMap.put("月薪制", 1);
        dictItemMap.put("时薪制", 2);
        //考勤类型
        dictItemMap.put("弹性", 1);
        dictItemMap.put("非弹性", 2);
        //打卡方式
        dictItemMap.put("企业微信", 1);
        dictItemMap.put("考勤机", 2);
        dictItemMap.put("两者都需要", 3);
        dictItemMap.put("企业微信加考勤机", 3);
        //绩效类型
        dictItemMap.put("KPI+PPI", 1);
        dictItemMap.put("绩效包", 2);
        //性别
        dictItemMap.put("男", 1);
        dictItemMap.put("女", 2);
        //最高学历
        dictItemMap.put("学前教育", 1);
        dictItemMap.put("小学", 2);
        dictItemMap.put("初中", 3);
        dictItemMap.put("高中", 4);
        dictItemMap.put("专科", 5);
        dictItemMap.put("本科", 6);
        dictItemMap.put("专升本", 7);
        dictItemMap.put("硕士研究生", 8);
        dictItemMap.put("博士研究生", 9);
        dictItemMap.put("其他", 0);
        //岗位性质
        dictItemMap.put("非管理", 1);
        dictItemMap.put("管理", 2);
        //工作地区
        dictItemMap.put("深圳", 1);
        dictItemMap.put("合肥", 2);
        dictItemMap.put("上海", 3);
        dictItemMap.put("重庆", 4);
        dictItemMap.put("南京", 5);
        dictItemMap.put("广州", 6);
        dictItemMap.put("兰州", 7);
        //合同类型
        dictItemMap.put("固定期限劳动合同", 1);
        dictItemMap.put("无固定期限劳动合同", 2);
        dictItemMap.put("单项劳动合同", 3);
        dictItemMap.put("实习协议", 4);
        //合同状态
        dictItemMap.put("未签订", 0);
        dictItemMap.put("已签订", 1);
        dictItemMap.put("待续签", 2);
        //是否近视
        dictItemMap.put("是", 0);
        dictItemMap.put("否", 1);
        //政治面貌
        dictItemMap.put("群众", 0);
        dictItemMap.put("团员", 1);
        dictItemMap.put("党员", 2);
        //婚姻状况
        dictItemMap.put("已婚", 0);
        dictItemMap.put("未婚", 1);
        dictItemMap.put("离异", 2);
        dictItemMap.put("丧偶", 3);
        //户籍性质
        dictItemMap.put("城镇", 0);
        dictItemMap.put("农村", 1);
        //房屋类型
        dictItemMap.put("自购房", 0);
        dictItemMap.put("租用", 1);
        //学历性质
        dictItemMap.put("统招", 0);
        dictItemMap.put("自考", 1);
        dictItemMap.put("成人教育", 2);
        //学位
        dictItemMap.put("学士", 0);
        dictItemMap.put("硕士", 1);
        dictItemMap.put("博士", 3);

        System.out.println(dictItemMap.get("合肥"));

    }
}
