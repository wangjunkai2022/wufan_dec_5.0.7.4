package com.join.mgps.Util;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.Locale;
/* compiled from: TagAliasOperatorHelper.java */
/* loaded from: classes3.dex */
public class i2 {

    /* renamed from: d  reason: collision with root package name */
    private static final String f27841d = "JIGUANG-TagAliasHelper";

    /* renamed from: e  reason: collision with root package name */
    public static int f27842e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f27843f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f27844g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f27845h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f27846i = 4;

    /* renamed from: j  reason: collision with root package name */
    public static final int f27847j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f27848k = 6;

    /* renamed from: l  reason: collision with root package name */
    public static final int f27849l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f27850m = 2;

    /* renamed from: n  reason: collision with root package name */
    private static i2 f27851n;

    /* renamed from: a  reason: collision with root package name */
    private Context f27852a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<Object> f27853b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private Handler f27854c = new a();

    /* compiled from: TagAliasOperatorHelper.java */
    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                return;
            }
            Object obj = message.obj;
            if (obj != null && (obj instanceof String)) {
                w0.d(i2.f27841d, "retry set mobile number");
                i2.f27842e++;
                String str = (String) message.obj;
                i2.this.f27853b.put(i2.f27842e, str);
                if (i2.this.f27852a != null) {
                    i2 i2Var = i2.this;
                    i2Var.h(i2Var.f27852a, i2.f27842e, str);
                    return;
                }
                w0.c(i2.f27841d, "#unexcepted - context was null");
                return;
            }
            w0.c(i2.f27841d, "#unexcepted - msg obj was incorrect");
        }
    }

    private i2() {
    }

    private boolean a(int i4, String str) {
        if (!e0.e(this.f27852a)) {
            w0.c(f27841d, "no network");
            return false;
        } else if (i4 == 6002 || i4 == 6024) {
            w0.a(f27841d, "need retry");
            Message message = new Message();
            message.what = 2;
            message.obj = str;
            this.f27854c.sendMessageDelayed(message, 60000L);
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[1];
            objArr[0] = i4 == 6002 ? "timeout" : "server internal error”";
            e0.j(String.format(locale, "Failed to set mobile number due to %s. Try again after 60s.", objArr), this.f27852a);
            return true;
        } else {
            return false;
        }
    }

    private String e(int i4) {
        switch (i4) {
            case 1:
                return "add";
            case 2:
                return "set";
            case 3:
                return "delete";
            case 4:
                return "clean";
            case 5:
                return "get";
            case 6:
                return "check";
            default:
                return "unkonw operation";
        }
    }

    public static i2 f() {
        if (f27851n == null) {
            synchronized (i2.class) {
                if (f27851n == null) {
                    f27851n = new i2();
                }
            }
        }
        return f27851n;
    }

    private String g(boolean z4, int i4, int i5) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = e(i4);
        objArr[1] = z4 ? "alias" : " tags";
        objArr[2] = i5 == 6002 ? "timeout" : "server too busy";
        return String.format(locale, "Failed to %s %s due to %s. Try again after 60s.", objArr);
    }

    public Object d(int i4) {
        return this.f27853b.get(i4);
    }

    public void h(Context context, int i4, String str) {
    }

    public void i(Context context) {
        if (context != null) {
            this.f27852a = context.getApplicationContext();
        }
    }

    public void j(int i4, Object obj) {
        this.f27853b.put(i4, obj);
    }

    public Object k(int i4) {
        return this.f27853b.get(i4);
    }
}
