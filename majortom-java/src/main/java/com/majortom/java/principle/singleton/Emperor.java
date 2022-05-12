package com.majortom.java.principle.singleton;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/5/12 12:30
 */
public class Emperor {

    private static int maxNumOfEmperor = 2;

    private static ArrayList<String> nameList = Lists.newArrayList();

    private static ArrayList<Emperor> emperorList = Lists.newArrayList();

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        countNumOfEmperor = new Random().nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
