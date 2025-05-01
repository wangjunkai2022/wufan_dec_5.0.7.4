package com.join.mgps.ad.adapter;

import android.content.Context;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.SdkConfig;
/* compiled from: KSInit.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f39664a;

    public static void a(Context context, String str, s1.a aVar) {
        try {
            if (!f39664a) {
                KsAdSDK.init(context, new SdkConfig.Builder().appId(str).build());
                f39664a = true;
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
