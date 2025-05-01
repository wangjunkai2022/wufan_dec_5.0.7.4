package com.qq.e.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.qq.e.comm.constants.ErrorCode;
import com.qq.e.comm.managers.a;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.GDTLogger;
/* loaded from: classes5.dex */
public abstract class AbstractAD<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f59652a;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f59656e;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f59654c = false;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f59655d = false;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f59653b = new Handler(Looper.getMainLooper());

    private void c(final Context context, final String str, final String str2) {
        this.f59656e = true;
        if (a.b().d()) {
            final String a5 = a.b().a();
            if (com.qq.e.comm.a.a(context)) {
                this.f59655d = true;
                a.f59829g.execute(new Runnable() { // from class: com.qq.e.ads.AbstractAD.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            final POFactory pOFactory = a.b().c().getPOFactory();
                            AbstractAD.this.f59653b.post(new Runnable() { // from class: com.qq.e.ads.AbstractAD.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        POFactory pOFactory2 = pOFactory;
                                        if (pOFactory2 != null) {
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            AbstractAD abstractAD = AbstractAD.this;
                                            abstractAD.f59652a = (T) abstractAD.a(context, pOFactory2, a5, str, str2);
                                            AbstractAD.this.f59654c = true;
                                            AbstractAD abstractAD2 = AbstractAD.this;
                                            T t4 = abstractAD2.f59652a;
                                            if (t4 == null) {
                                                abstractAD2.a(ErrorCode.POFACTORY_GET_INTERFACE_ERROR);
                                            } else {
                                                abstractAD2.a((AbstractAD) t4);
                                            }
                                        } else {
                                            AbstractAD.this.f59654c = true;
                                            AbstractAD.this.a(ErrorCode.PLUGIN_INIT_ERROR);
                                        }
                                    } catch (Throwable th) {
                                        GDTLogger.e("初始化错误：初始化广告实例时发生异常", th);
                                        AbstractAD.this.f59654c = true;
                                        AbstractAD.this.a(2001);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            GDTLogger.e("初始化错误：初始化插件时发生异常", th);
                            AbstractAD.this.f59654c = true;
                            AbstractAD.this.a(ErrorCode.PLUGIN_INIT_ERROR);
                        }
                    }
                });
                return;
            }
            GDTLogger.e("Manifest文件中Activity/Service/Permission的声明有问题或者Permission权限未授予");
            a(4002);
            return;
        }
        a(2003);
    }

    protected abstract T a(Context context, POFactory pOFactory, String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(final int i4) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(i4);
        } else {
            this.f59653b.post(new Runnable() { // from class: com.qq.e.ads.AbstractAD.2
                @Override // java.lang.Runnable
                public void run() {
                    AbstractAD.this.b(i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            c(context, str, "");
            return;
        }
        GDTLogger.e("初始化错误：参数错误context或posId为空");
        a(2001);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            c(context, str, str2);
            return;
        }
        GDTLogger.e("初始化错误：参数错误，context、posId、token 不可为空");
        a(2001);
    }

    protected abstract void a(T t4);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        GDTLogger.e(getClass().getSimpleName() + ":调用方法 " + str + "异常，广告实例还未初始化");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() {
        return this.f59656e && this.f59655d;
    }

    protected abstract void b(int i4);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b() {
        return this.f59654c;
    }
}
