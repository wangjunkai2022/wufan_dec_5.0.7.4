package com.beizi.ad.lance.a;

import java.util.Random;
/* compiled from: ProbabilityUtil.java */
/* loaded from: classes2.dex */
public class o {
    public static boolean a(int i4) {
        float nextInt = new Random().nextInt(100);
        l.c("BeiZisAd", "ratio = " + nextInt + ",ratioCheckNum = " + i4);
        return nextInt < ((float) i4);
    }
}
