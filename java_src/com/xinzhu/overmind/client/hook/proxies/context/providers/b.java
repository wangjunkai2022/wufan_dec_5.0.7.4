package com.xinzhu.overmind.client.hook.proxies.context.providers;

import android.annotation.SuppressLint;
import android.content.AttributionSource;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: DownloadProviderStub.java */
/* loaded from: classes6.dex */
public class b extends com.xinzhu.overmind.client.hook.b implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67669c = b.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f67670d = "android:query-arg-sql-selection";

    /* renamed from: e  reason: collision with root package name */
    public static final String f67671e = "android:query-arg-sql-selection-args";

    /* renamed from: f  reason: collision with root package name */
    public static final String f67672f = "android:query-arg-sql-sort-order";

    /* renamed from: g  reason: collision with root package name */
    private static final String f67673g = "notificationpackage";

    /* renamed from: h  reason: collision with root package name */
    private static final String f67674h = "notificationclass";

    /* renamed from: i  reason: collision with root package name */
    public static final String f67675i = "is_visible_in_downloads_ui";

    /* renamed from: j  reason: collision with root package name */
    public static final String f67676j = "visibility";

    /* renamed from: k  reason: collision with root package name */
    public static final String f67677k = "description";

    /* renamed from: l  reason: collision with root package name */
    public static final String f67678l = "hint";

    /* renamed from: b  reason: collision with root package name */
    private IInterface f67679b;

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.proxies.context.providers.d
    public IInterface b(IInterface iInterface, String str) {
        this.f67679b = iInterface;
        injectHook();
        return (IInterface) getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return this.f67679b;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    @SuppressLint({"NewApi"})
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String[] strArr;
        String str;
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.f67679b, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            if (objArr[0] instanceof String) {
                String str2 = (String) objArr[0];
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
        if (name.equals("insert")) {
            int a6 = com.xinzhu.overmind.utils.helpers.c.a(objArr, Uri.class) + 1;
            ContentValues contentValues = (ContentValues) objArr[a6];
            String asString = contentValues.getAsString(f67673g);
            com.xinzhu.overmind.b.c(f67669c, "content provider <insert>, notificationPkg " + asString);
            if (asString == null) {
                return method.invoke(this.f67679b, objArr);
            }
            String asString2 = contentValues.getAsString("hint");
            if (asString2 != null) {
                contentValues.put("hint", asString2.replace(asString, Overmind.getHostPkg()));
            }
            contentValues.put("visibility", (Integer) 1);
            contentValues.put(f67673g, Overmind.getHostPkg());
            objArr[a6] = contentValues;
            return method.invoke(this.f67679b, objArr);
        } else if (!name.equals("query")) {
            return method.invoke(this.f67679b, objArr);
        } else {
            int length = objArr.length - 4;
            String str3 = null;
            if (e.w()) {
                Bundle bundle = (Bundle) objArr[length + 2];
                if (bundle != null) {
                    str3 = bundle.getString(f67670d);
                    strArr = bundle.getStringArray(f67671e);
                    str = bundle.getString(f67672f);
                } else {
                    str = null;
                    strArr = null;
                }
            } else {
                str3 = (String) objArr[length + 2];
                strArr = (String[]) objArr[length + 3];
                str = (String) objArr[length + 4];
            }
            com.xinzhu.overmind.b.c(f67669c, "content provider <query>, selection " + str3 + " selectionArgs " + Arrays.toString(strArr) + " sortOrder " + str);
            return method.invoke(this.f67679b, objArr);
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
    }
}
