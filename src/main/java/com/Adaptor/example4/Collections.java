package com.Adaptor.example4;

import java.util.Collection;
import java.util.Iterator;

/**
 * 兼容老版本接口
 *
 * @Author: yanzhihao
 * @Date 2022/2/9 4:43 下午
 */
public class Collections {

    public static Emueration emueration(final Collection c) {
        return new Emueration() {
            Iterator i = c.iterator();

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public Object nextElement() {
                return i.next();
            }
        };
    }
}
