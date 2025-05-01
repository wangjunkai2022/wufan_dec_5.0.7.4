package com.vuaukou.vco.hykiiuy;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
@TargetApi(28)
/* loaded from: classes8.dex */
public final class g extends AppComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    private AppComponentFactory f64853a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f64854b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f64855c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f64856d = a.auu.a.c("LQoZSwscDCBLFQsFAQonAVoEEQNLIwIHDAxdEjsDAQs=");

    /* renamed from: e  reason: collision with root package name */
    private boolean f64857e = false;

    private synchronized AppComponentFactory a(ClassLoader classLoader) {
        if (this.f64853a == null && this.f64855c != null && !"".equals(this.f64855c)) {
            try {
                this.f64853a = (AppComponentFactory) classLoader.loadClass(this.f64855c).newInstance();
            } catch (Exception e5) {
            }
        }
        return this.f64853a;
    }

    private void a(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        if (this.f64857e) {
            return;
        }
        f.a(classLoader, applicationInfo);
        ClassLoader cl = MyJni.cl(classLoader, applicationInfo, this.f64856d);
        applicationInfo.className = this.f64854b;
        this.f64857e = true;
        new StringBuilder(a.auu.a.c("HhcbHRgwCiMVGwsEHREIBBcRDgEcbgwaDBVfRS0JFRYSPwovAREXQU5F")).append(cl);
    }

    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        AppComponentFactory a5 = a(classLoader);
        return a5 != null ? a5.instantiateActivity(classLoader, str, intent) : super.instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        a(classLoader, f.a());
        if (str.equals(MyApplication.class.getName())) {
            str = this.f64854b;
        }
        AppComponentFactory a5 = a(classLoader);
        return a5 != null ? a5.instantiateApplication(classLoader, str) : super.instantiateApplication(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    @TargetApi(29)
    public final ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        new StringBuilder(a.auu.a.c("JwsHEQAdEScEAAAiHwQ9FjgKABcAPF8=")).append(classLoader.toString());
        a(classLoader, applicationInfo);
        AppComponentFactory a5 = a(classLoader);
        return a5 != null ? a5.instantiateClassLoader(classLoader, applicationInfo) : super.instantiateClassLoader(classLoader, applicationInfo);
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        AppComponentFactory a5 = a(classLoader);
        return a5 != null ? a5.instantiateProvider(classLoader, str) : super.instantiateProvider(classLoader, str);
    }
}
