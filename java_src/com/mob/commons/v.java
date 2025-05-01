package com.mob.commons;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.join.mgps.Util.h0;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f56478a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f56479b = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mob.commons.v$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56484a;

        static {
            int[] iArr = new int[InternationalDomain.values().length];
            f56484a = iArr;
            try {
                iArr[InternationalDomain.JP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56484a[InternationalDomain.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Context a() {
        try {
            Object b5 = b();
            if (b5 != null) {
                return (Context) ReflectHelper.invokeInstanceMethod(b5, com.mob.commons.a.l.a("014Vfk(gjJge0kkhYejPdejEejelXf"), new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static Object b() {
        Object a5;
        final ReflectHelper.a<Void, Object> aVar = new ReflectHelper.a<Void, Object>() { // from class: com.mob.commons.v.1
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Void r4) {
                return ReflectHelper.invokeStaticMethodNoThrow(ReflectHelper.importClassNoThrow(com.mob.commons.a.l.a("026efGedekelejedem=ekk2emgeKdjDejeeej)j+fdgdKiTekWgeZed"), null), com.mob.commons.a.l.a("021dHehekek3gfj6geWdj.ejeeej;jAfdgd5iNek1ge<ed"), null, new Object[0]);
            }
        };
        if ((Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() || Build.VERSION.SDK_INT >= 18) && (a5 = aVar.a(null)) != null) {
            return a5;
        }
        final Object obj = new Object();
        final Object[] objArr = new Object[1];
        synchronized (obj) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.v.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    synchronized (obj) {
                        objArr[0] = aVar.a(null);
                        obj.notify();
                    }
                    return false;
                }
            });
            obj.wait();
        }
        return objArr[0];
    }

    public static Object c(String str) throws Throwable {
        return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(com.mob.commons.a.l.a("017Fih^eJeeQe-emHhef?fkemhkehIfj*ejegMg")), com.mob.commons.a.l.a("010[fk7gj6hkeh=fj=ejegGg"), new Object[0]), com.mob.commons.a.l.a("004gWfj'gd"), new Object[]{str}, new Class[]{String.class});
    }

    public static Object d(String str) {
        try {
            return MobSDK.getContext().getSystemService(str);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String d() {
        if (TextUtils.isEmpty(f56478a)) {
            synchronized (f56479b) {
                try {
                    if (TextUtils.isEmpty(f56478a)) {
                        f56478a = new com.mob.tools.utils.d(MobSDK.getContext()).a();
                    }
                }
            }
        }
        return f56478a;
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        }
    }

    public static byte[] c() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        Throwable th;
        try {
            SecureRandom secureRandom = new SecureRandom();
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeLong(secureRandom.nextLong());
                    dataOutputStream.writeLong(secureRandom.nextLong());
                    dataOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a(dataOutputStream, byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
                th = th;
                a(dataOutputStream, byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        }
    }

    public static void a(final com.mob.tools.utils.e<ArrayList<HashMap<String, Object>>> eVar) {
        DH.requester(MobSDK.getContext()).getMwlfo().getMbcdi().request(new DH.DHResponder() { // from class: com.mob.commons.v.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                ArrayList arrayList = new ArrayList();
                try {
                    ArrayList<HashMap<String, Object>> mwlfo = dHResponse.getMwlfo();
                    if (mwlfo != null && !mwlfo.isEmpty()) {
                        ArrayList<String> g4 = b.g();
                        if (g4 != null && !g4.isEmpty()) {
                            String mbcdi = dHResponse.getMbcdi();
                            Iterator<HashMap<String, Object>> it2 = mwlfo.iterator();
                            while (it2.hasNext()) {
                                HashMap<String, Object> next = it2.next();
                                Object obj = next.get(com.mob.commons.a.l.a("005Sgkfmfmffgm"));
                                if (obj != null && String.valueOf(obj).equals(mbcdi)) {
                                    next.put(com.mob.commons.a.l.a("010Keieiei%d6ehekfeelWff"), Boolean.TRUE);
                                    mbcdi = null;
                                }
                                HashMap hashMap = new HashMap();
                                Iterator<String> it3 = g4.iterator();
                                while (it3.hasNext()) {
                                    String next2 = it3.next();
                                    Object obj2 = next.get(next2);
                                    if (obj2 != null) {
                                        hashMap.put(next2, obj2);
                                    }
                                }
                                arrayList.add(hashMap);
                            }
                        }
                        com.mob.tools.utils.e.this.a(null);
                        return;
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().w(th);
                }
                com.mob.tools.utils.e eVar2 = com.mob.tools.utils.e.this;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                eVar2.a(arrayList);
            }
        });
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        if (str.startsWith(com.mob.commons.a.l.a("007ijjklmm"))) {
            str = str.replace(com.mob.commons.a.l.a("007ijjklmm"), "");
        }
        if (str.startsWith("https://")) {
            str = str.replace("https://", "");
        }
        if (MobSDK.checkV6()) {
            str2 = com.mob.commons.a.l.a("002Deeii");
        } else {
            int i4 = AnonymousClass4.f56484a[MobSDK.getDomain().ordinal()];
            if (i4 == 1) {
                str2 = "jp";
            } else if (i4 == 2) {
                str2 = com.mob.commons.a.l.a("002Eehgj");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return b(com.mob.commons.a.l.a("007ijjklmm") + str);
        }
        if (str.startsWith(str2 + h0.f27805a)) {
            return b(com.mob.commons.a.l.a("007ijjklmm") + str);
        }
        return b(com.mob.commons.a.l.a("007ijjklmm") + str2 + "-" + str);
    }

    public static String b(String str) {
        Uri parse;
        String scheme;
        String str2;
        try {
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean checkForceHttps = MobSDK.checkForceHttps();
        if (checkForceHttps || (Build.VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
            str = str.trim();
            if (str.startsWith(com.mob.commons.a.l.a("007ijjklmm")) && (parse = Uri.parse(str.trim())) != null && (scheme = parse.getScheme()) != null && scheme.equals(com.mob.commons.a.l.a("004ijjk"))) {
                String host = parse.getHost();
                String path = parse.getPath();
                String query = parse.getQuery();
                String str3 = "";
                if (host != null) {
                    int port = parse.getPort();
                    StringBuilder sb = new StringBuilder();
                    sb.append(host);
                    if (port > 0 && port != 80) {
                        str2 = ":" + port;
                        sb.append(str2);
                        host = sb.toString();
                        if (!checkForceHttps && Build.VERSION.SDK_INT >= 24 && ((Boolean) ReflectHelper.invokeInstanceMethod(NetworkSecurityPolicy.getInstance(), com.mob.commons.a.l.a("027Nejgjfe.hge;ekPjg]fjMjEgdekFeFfgfgejPd^hm.gAekegej8jjg-ed"), host)).booleanValue()) {
                            return str;
                        }
                    }
                    str2 = "";
                    sb.append(str2);
                    host = sb.toString();
                    if (!checkForceHttps) {
                        return str;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https://");
                sb2.append(host);
                if (path == null) {
                    path = "";
                }
                sb2.append(path);
                if (query != null) {
                    str3 = "?" + query;
                }
                sb2.append(str3);
                return sb2.toString();
            }
        }
        return str;
    }

    public static void a(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            b(file);
            return;
        }
        String[] list = file.list();
        if (list != null && list.length != 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    b(file2);
                }
            }
            b(file);
            return;
        }
        b(file);
    }

    public static void b(View view) {
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("input_method");
        if (systemServiceSafe == null) {
            return;
        }
        ((InputMethodManager) systemServiceSafe).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
    }

    private static void b(File file) {
        ReflectHelper.invokeInstanceMethod(file, com.mob.commons.a.l.a("006>ed.ghgjg"), null, null, null);
    }

    public static void a(View view) {
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("input_method");
        if (systemServiceSafe == null) {
            return;
        }
        ((InputMethodManager) systemServiceSafe).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT < 33 ? (Intent) ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.a.l.a("016GekOg.fkejgj(jgGekhkFgdg!ejee6gIek"), new Object[]{broadcastReceiver, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class}, null) : (Intent) ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.a.l.a("016=ek=gCfkejgjAjg%ekhk,gdg?ejeeMg)ek"), new Object[]{broadcastReceiver, intentFilter, 4}, new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE}, null);
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.a.l.a("018FehCf_ek[g!fkejgj9jgNekhkSgdg,ejee^g0ek"), new Object[]{broadcastReceiver}, new Class[]{BroadcastReceiver.class}, null);
    }

    public static boolean a(long j4, long j5) {
        if (j4 <= 0 || j5 <= 0) {
            return false;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(new Date(j4)).equals(simpleDateFormat.format(new Date(j5)));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    public static String a(String str, int i4) {
        int parseInt;
        int i5 = 0;
        int i6 = 3;
        if (str.startsWith("00")) {
            parseInt = Integer.parseInt(str.substring(2, 3));
        } else if (str.startsWith("0")) {
            parseInt = Integer.parseInt(str.substring(1, 3));
        } else {
            parseInt = Integer.parseInt(str.substring(0, 3));
        }
        char[] charArray = str.toCharArray();
        int[] iArr = new int[parseInt];
        boolean z4 = true;
        while (i6 < charArray.length) {
            if (charArray[i6] < 'a') {
                z4 = !z4;
            } else {
                if (z4) {
                    iArr[i5] = charArray[i6] - i4;
                } else {
                    iArr[i5] = (charArray[i6] - i4) * 10;
                    i6++;
                    iArr[i5] = iArr[i5] + (charArray[i6] - i4);
                }
                int i7 = iArr[i5];
                i5++;
            }
            i6++;
        }
        return c.a(iArr);
    }
}
