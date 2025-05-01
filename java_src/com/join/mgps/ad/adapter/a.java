package com.join.mgps.ad.adapter;

import android.content.Context;
import com.beizi.fusion.BeiZis;
/* compiled from: BZInit.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f39662a;

    public static void a(Context context, String str, s1.a aVar) {
        try {
            if (!f39662a) {
                BeiZis.init(context, str);
                f39662a = true;
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
