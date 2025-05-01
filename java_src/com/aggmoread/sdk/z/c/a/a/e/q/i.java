package com.aggmoread.sdk.z.c.a.a.e.q;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
/* loaded from: classes2.dex */
public class i extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    protected Context f3542a;

    /* renamed from: b  reason: collision with root package name */
    protected String[] f3543b;

    /* renamed from: c  reason: collision with root package name */
    protected String f3544c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3545d;

    /* renamed from: e  reason: collision with root package name */
    protected h f3546e;

    public i(Context context, String str, String str2) {
        this(context, str, new String[]{str2});
    }

    public i(Context context, String str, String[] strArr) {
        super(context, 0);
        this.f3544c = "";
        this.f3545d = true;
        this.f3542a = context;
        this.f3544c = str;
        this.f3543b = strArr;
    }

    private Intent a(Intent intent) {
        try {
            if (this.f3544c.equals(intent.getPackage())) {
                intent.setPackage(b().getPackageName());
                com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "injectSendBroadcastIntent reset packageName name");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return intent;
    }

    private Intent b(Intent intent) {
        try {
            ComponentName component = intent.getComponent();
            com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "injectStartActivityIntent enter , " + component + " , packageName = " + intent.getPackage() + " , action = " + intent.getAction());
            if (component != null) {
                String className = component.getClassName();
                String packageName = component.getPackageName();
                String packageName2 = j.f3429q.getPackageName();
                boolean startsWith = className != null ? className.startsWith(packageName2) : false;
                com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "injectStartActivityIntent isStartCurrentPackageActivity = " + startsWith);
                String[] strArr = this.f3543b;
                if (strArr != null) {
                    for (String str : strArr) {
                        if ((this.f3544c.equals(packageName) && className != null && className.startsWith(str)) || startsWith) {
                            intent.setClassName(packageName2, className);
                            intent.setPackage(packageName2);
                            com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "injectStartActivityIntent reset packageName name");
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return intent;
    }

    public void a() {
        this.f3545d = true;
        com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "enable enter , packageName = " + this.f3544c);
    }

    protected Context b() {
        return this.f3542a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "ProxyContext#getApplicationContext enter, isEnable = " + this.f3545d + ",startActivityClassPrefix = " + this.f3543b);
        if (this.f3545d) {
            boolean a5 = g.a(this.f3543b);
            com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "fromClassPrefix = " + a5);
            if (a5) {
                if (this.f3546e == null) {
                    this.f3546e = new h(this);
                }
                return this.f3546e;
            }
        }
        return b().getApplicationContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ApplicationInfo getApplicationInfo() {
        if (this.f3545d) {
            ApplicationInfo applicationInfo = b().getApplicationInfo();
            String str = this.f3544c;
            applicationInfo.packageName = str;
            applicationInfo.processName = str;
            return applicationInfo;
        }
        return b().getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getOpPackageName() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "ProxyContext#getOpPackageName enter, isEnable = " + this.f3545d + " , proxyPackageName = " + this.f3544c);
        return (this.f3545d && g.a(this.f3543b)) ? this.f3544c : b().getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "ProxyContext#getPackageName enter, isEnable = " + this.f3545d + " , proxyPackageName = " + this.f3544c);
        return (this.f3545d && g.a(this.f3543b)) ? this.f3544c : b().getPackageName();
    }

    @Override // android.content.Context
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        b().registerComponentCallbacks(componentCallbacks);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendBroadcast(Intent intent) {
        b().sendBroadcast(a(intent));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendBroadcast(Intent intent, @Nullable String str) {
        b().sendBroadcast(a(intent), str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendOrderedBroadcast(Intent intent, @Nullable String str) {
        b().sendBroadcast(a(intent), str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendOrderedBroadcast(@NonNull Intent intent, @Nullable String str, @Nullable BroadcastReceiver broadcastReceiver, @Nullable Handler handler, int i4, @Nullable String str2, @Nullable Bundle bundle) {
        b().sendOrderedBroadcast(a(intent), str, broadcastReceiver, handler, i4, str2, bundle);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("proxyContext", "startActivity context = " + b());
        j.f3429q.startActivity(b(intent));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        Intent b5 = b(intent);
        if (Build.VERSION.SDK_INT >= 16) {
            j.f3429q.startActivity(b5, bundle);
        } else {
            j.f3429q.startActivity(b5);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
        b(intent);
        return b().startService(intent);
    }

    @Override // android.content.Context
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        b().unregisterComponentCallbacks(componentCallbacks);
    }
}
