package com.xinzhu.overmind.client.hook.env;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.util.ArraySet;
import com.alipay.sdk.util.j;
import com.join.mgps.receiver.BootReceiver_;
import com.xinzhu.haunted.android.content.n;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
import com.xinzhu.overmind.utils.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ClientSystemEnv.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f67601a = "com.tencent.mm";

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f67602b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f67603c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f67604d;

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f67605e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f67606f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f67607g;

    /* renamed from: h  reason: collision with root package name */
    private static final List<String> f67608h;

    /* renamed from: i  reason: collision with root package name */
    private static final List<String> f67609i;

    /* renamed from: j  reason: collision with root package name */
    private static final String f67610j = ".overmind";

    static {
        ArrayList arrayList = new ArrayList();
        f67602b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f67603c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        f67604d = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        f67605e = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        f67606f = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        f67607g = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        f67608h = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        f67609i = arrayList8;
        arrayList.add(q.a.f73126a);
        arrayList.add("com.google.android.webview");
        arrayList.add("com.google.android.webview.dev");
        arrayList.add("com.google.android.webview.beta");
        arrayList.add("com.google.android.webview.canary");
        arrayList.add("com.android.webview");
        arrayList.add("com.android.camera");
        arrayList.add("com.android.chrome");
        arrayList.add("com.android.providers.downloads");
        arrayList.add("com.huawei.webview");
        arrayList2.add("com.noshufou.android.su");
        arrayList2.add("com.noshufou.android.su.elite");
        arrayList2.add("eu.chainfire.supersu");
        arrayList2.add("com.koushikdutta.superuser");
        arrayList2.add("com.thirdparty.superuser");
        arrayList2.add("com.yellowes.su");
        arrayList2.add("com.topjohnwu.magisk");
        arrayList8.addAll(arrayList2);
        arrayList3.add("de.robv.android.xposed.installer");
        arrayList4.add("com.huawei.hwid");
        arrayList4.add("com.vivo.sdkplugin");
        arrayList5.add("com.tencent.mm");
        arrayList5.add(j.f4963b);
        arrayList5.add("com.tencent.mobileqq");
        arrayList6.add("android.permission.ACCOUNT_MANAGER");
        arrayList6.add("android.permission.RECEIVE_BOOT_COMPLETED");
        arrayList6.add("android.permission.BACKUP");
        arrayList7.add(MindAccountManagerService.ACTION_VISIBLE_ACCOUNTS_CHANGED);
        arrayList7.add(MindAccountManagerService.ACTION_ACCOUNT_REMOVED);
        arrayList7.add(BootReceiver_.f53984a);
        arrayList7.add("android.intent.action.PACKAGE_CHANGED");
        arrayList7.add(BootReceiver_.f53985b);
        arrayList7.add("android.intent.action.USER_ADDED");
        arrayList7.add("android.intent.action.USER_REMOVED");
        arrayList7.add("android.accounts.LOGIN_ACCOUNTS_CHANGED");
    }

    public static List<String> a() {
        return f67605e;
    }

    public static boolean b(String str) {
        return f67607g.contains(str);
    }

    public static boolean c(String str) {
        if (Overmind.get().isHideRoot() && f67603c.contains(str)) {
            return true;
        }
        return Overmind.get().isHideXposed() && f67604d.contains(str);
    }

    public static boolean d(String str) {
        return f67609i.contains(str);
    }

    public static boolean e(ComponentName componentName) {
        return componentName != null && f(componentName.getPackageName());
    }

    public static boolean f(String str) {
        ApplicationInfo f5;
        List<String> list = f67602b;
        if (list.contains(str) || str.equals(Overmind.getMainPkg()) || str.equals(Overmind.getPluginPkg()) || f67606f.contains(str)) {
            return true;
        }
        if (b.f(str)) {
            return false;
        }
        if (e.j()) {
            f5 = Overmind.getHostPm().g(str, 0L, Overmind.getHostUserId());
        } else {
            f5 = Overmind.getHostPm().f(str, 0, Overmind.getHostUserId());
        }
        if (f5 != null) {
            int i4 = f5.flags;
            if ((i4 & 1) != 0 || (i4 & 128) != 0) {
                list.add(str);
                return true;
            }
        }
        return false;
    }

    public static boolean g(String str) {
        return f67608h.contains(str);
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(f67610j) ? str.substring(0, str.indexOf(f67610j)) : str;
    }

    public static Intent i(Intent intent) {
        if (intent == null || !intent.getAction().endsWith(f67610j)) {
            return intent;
        }
        Intent intent2 = new Intent(intent);
        intent2.setAction(h(intent2.getAction()));
        return intent2;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        if (f67608h.contains(str)) {
            return str + f67610j;
        }
        return str;
    }

    public static Intent k(Intent intent) {
        if (intent == null || !g(intent.getAction())) {
            return intent;
        }
        Intent intent2 = new Intent(intent);
        intent2.setAction(j(intent2.getAction()));
        return intent2;
    }

    public static void l(IntentFilter intentFilter) {
        if (intentFilter != null) {
            n nVar = new n(intentFilter);
            if (!e.k()) {
                ArrayList arrayList = (ArrayList) nVar.h();
                if (arrayList != null) {
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        listIterator.set(j((String) listIterator.next()));
                    }
                    return;
                }
                return;
            }
            ArraySet arraySet = (ArraySet) nVar.h();
            ArraySet arraySet2 = new ArraySet();
            if (arraySet != null) {
                Iterator it2 = arraySet.iterator();
                while (it2.hasNext()) {
                    arraySet2.add(j((String) it2.next()));
                }
            }
            nVar.m(arraySet2);
        }
    }
}
