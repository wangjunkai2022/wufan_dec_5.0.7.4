package com.join.mgps.ad.adapter;

import android.content.Context;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
/* compiled from: GdtInit.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f39663a;

    /* compiled from: GdtInit.java */
    /* loaded from: classes4.dex */
    class a implements GDTAdSdk.OnStartListener {
        a() {
        }

        @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
        public void onStartFailed(Exception exc) {
        }

        @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
        public void onStartSuccess() {
        }
    }

    public static void a(Context context, String str, s1.a aVar) {
        try {
            if (!f39663a) {
                GDTAdSdk.initWithoutStart(context, str);
                GDTAdSdk.start(new a());
                GlobalSetting.setChannel(1);
                GlobalSetting.setEnableMediationTool(true);
                f39663a = true;
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
