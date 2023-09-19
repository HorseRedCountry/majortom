package com.majortom.chapter14.finalversion;

import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/19 21:53
 **/
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
