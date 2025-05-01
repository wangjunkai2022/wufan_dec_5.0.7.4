package com.xinzhu.overmind.client.hook.proxies.context.providers;

import android.annotation.SuppressLint;
import android.content.AttributionSource;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: SettingsProviderStub.java */
/* loaded from: classes6.dex */
public class c extends com.xinzhu.overmind.client.hook.b implements d {

    /* renamed from: c  reason: collision with root package name */
    private static final int f67680c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static final int f67681d = 1;

    /* renamed from: b  reason: collision with root package name */
    private IInterface f67682b;

    private static Bundle c(String str, String str2) {
        Bundle bundle = new Bundle();
        if (e.d()) {
            bundle.putString("name", str);
            bundle.putString("value", str2);
        } else {
            bundle.putString(str, str2);
        }
        return bundle;
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.proxies.context.providers.d
    public IInterface b(IInterface iInterface, String str) {
        this.f67682b = iInterface;
        injectHook();
        return (IInterface) getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return this.f67682b;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    @SuppressLint({"NewApi"})
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.f67682b, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            if (objArr[0] instanceof String) {
                String str = (String) objArr[0];
                objArr[0] = Overmind.getHostPkg();
            }
            if (e.h()) {
                try {
                    int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, AttributionSource.class);
                    if (a5 >= 0) {
                        ContextFixer.fixAttributionSource((AttributionSource) objArr[a5]);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        String name = method.getName();
        name.hashCode();
        if (!name.equals("call")) {
            if (!name.equals("query")) {
                return method.invoke(this.f67682b, objArr);
            }
            Uri uri = (Uri) objArr[objArr.length - 4];
            com.xinzhu.overmind.b.c(com.xinzhu.overmind.client.hook.b.TAG, "content provider <query> " + uri);
            if (uri.toString().equals("content://settings/config")) {
                return null;
            }
            return method.invoke(this.f67682b, objArr);
        }
        int length = objArr.length - 4;
        String str2 = (String) objArr[length + 1];
        String str3 = (String) objArr[length + 2];
        com.xinzhu.overmind.b.c(com.xinzhu.overmind.client.hook.b.TAG, "content provider <call> " + Arrays.toString(objArr));
        if (str2.startsWith("GET_")) {
            if (str3.equalsIgnoreCase("user_setup_complete")) {
                return c(str3, "1");
            }
            if (str3.equalsIgnoreCase("install_non_market_apps")) {
                return c(str3, "1");
            }
            if (str3.equalsIgnoreCase("android_id")) {
                MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
                if (b5 != null && b5.f68007b) {
                    return c(str3, b5.f68008c);
                }
            } else if (str3.equals("adb_enabled") || str3.equals("development_settings_enabled")) {
                return c(str3, "0");
            }
        } else if (str2.startsWith("PUT_")) {
            if (str2.endsWith("secure") || str2.endsWith("global") || str2.endsWith("system")) {
                return null;
            }
        } else if (str2.startsWith("LIST_")) {
            return null;
        }
        try {
            return method.invoke(this.f67682b, objArr);
        } catch (Throwable th2) {
            if ((th2.getCause() instanceof SecurityException) || (th2.getCause() instanceof IllegalArgumentException)) {
                return null;
            }
            throw th2;
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
    }
}
