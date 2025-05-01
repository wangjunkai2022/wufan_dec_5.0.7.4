package com.join.mgps.ad.adapter;

import android.content.Context;
import com.aggmoread.sdk.client.AMAdConfig;
import com.aggmoread.sdk.client.AMSdk;
/* compiled from: REInit.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f39665a;

    public static void a(Context context, String str, s1.a aVar) {
        try {
            if (!f39665a) {
                AMSdk.init(context, new AMAdConfig.Builder().build());
                f39665a = true;
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
