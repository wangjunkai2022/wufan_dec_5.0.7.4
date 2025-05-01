package com.xinzhu.overmind.utils.wrappers;

import android.os.Build;
import java.util.Objects;
/* loaded from: classes.dex */
public class ObjectsWrapper {
    public static boolean equals(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
