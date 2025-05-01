package com.aggmoread.sdk.z.a.t;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f2568a = "com.aggmoread.sdk.a.adcomm.amsdk.AmCustomWebviewActivity";

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2569a = new C0081a();

        /* renamed from: com.aggmoread.sdk.z.a.t.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0081a implements a {
            C0081a() {
            }

            @Override // com.aggmoread.sdk.z.a.t.b.a
            public void onShow() {
            }
        }

        void onShow();
    }

    public static void a(Context context, String str, String str2, a aVar) {
        try {
            Class<?> cls = Class.forName(f2568a);
            cls.getDeclaredMethod("setWebViewStateListener", a.class).invoke(cls, aVar);
            Intent intent = new Intent(context, cls);
            intent.putExtra("mClickUrl", str2);
            intent.putExtra("title", str);
            intent.addFlags(268435456);
            context.getApplicationContext().startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
