package com.join.mgps.ad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: LotteryUtil.java */
/* loaded from: classes4.dex */
public class p {
    public static int a(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size();
        double d5 = 0.0d;
        for (Double d6 : list) {
            d5 += d6.doubleValue();
        }
        ArrayList arrayList = new ArrayList(size);
        Double valueOf = Double.valueOf(0.0d);
        for (Double d7 : list) {
            valueOf = Double.valueOf(valueOf.doubleValue() + d7.doubleValue());
            arrayList.add(Double.valueOf(valueOf.doubleValue() / d5));
        }
        double random = Math.random();
        arrayList.add(Double.valueOf(random));
        Collections.sort(arrayList);
        return arrayList.indexOf(Double.valueOf(random));
    }

    public static int b(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size();
        double d5 = 0.0d;
        for (Double d6 : list) {
            d5 += d6.doubleValue();
        }
        ArrayList arrayList = new ArrayList(size);
        Double valueOf = Double.valueOf(0.0d);
        for (Double d7 : list) {
            valueOf = Double.valueOf(valueOf.doubleValue() + d7.doubleValue());
            arrayList.add(Double.valueOf(valueOf.doubleValue() / d5));
        }
        double random = Math.random();
        arrayList.add(Double.valueOf(random));
        Collections.sort(arrayList);
        return arrayList.indexOf(Double.valueOf(random));
    }
}
