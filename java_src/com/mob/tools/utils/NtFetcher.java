package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.mob.commons.CSCenter;
import com.mob.commons.s;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
/* loaded from: classes5.dex */
public class NtFetcher implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static NtFetcher f56985a;

    /* renamed from: b  reason: collision with root package name */
    private Context f56986b;

    /* renamed from: c  reason: collision with root package name */
    private BroadcastReceiver f56987c;

    /* renamed from: d  reason: collision with root package name */
    private String f56988d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f56989e;

    private NtFetcher(Context context) {
        this.f56986b = context;
        a();
    }

    @TargetApi(21)
    private ConnectivityManager.NetworkCallback b() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.mob.tools.utils.NtFetcher.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                super.onLinkPropertiesChanged(network, linkProperties);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i4) {
                super.onLosing(network, i4);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    private boolean b(int i4) {
        return i4 == 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f56988d = g();
        this.f56989e = Integer.valueOf(d());
    }

    private boolean c(int i4) {
        return i4 == 13;
    }

    private int d() {
        if (DH.SyncMtd.getSystemServiceSafe("phone") != null && DH.SyncMtd.checkPermission(s.a("035deYdcdjdkdidcdl_jf2djdfdififididk(e4dlgjgifdfldhglfkgheggidhelfcfdfcgi"))) {
            if (Build.VERSION.SDK_INT >= 24) {
                return com.mob.tools.b.e.a(this.f56986b).c();
            }
            return com.mob.tools.b.e.a(this.f56986b).b();
        }
        return -1;
    }

    private boolean d(int i4) {
        switch (i4) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    private void e() {
        this.f56987c = new BroadcastReceiver() { // from class: com.mob.tools.utils.NtFetcher.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equalsIgnoreCase(s.a("036de@dcdjdkdidcdlSefi.dlPc(dk-ee(dledghegeggiedfceegkeefcildhedfkfdegidgi"))) {
                        NtFetcher.this.c();
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(s.a("036de[dcdjdkdidcdlSefi^dlAc9dk1ee?dledghegeggiedfceegkeefcildhedfkfdegidgi"));
        v.a(this.f56987c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver = this.f56987c;
        if (broadcastReceiver != null) {
            v.a(broadcastReceiver);
            this.f56987c = null;
        }
    }

    private String g() {
        if (DH.SyncMtd.checkPermission(s.a("035de=dcdjdkdidcdl'jfMdjdfdififididkYe,dlgjgifdfldhglfkgheggidhelfcfdfcgi")) && CSCenter.getInstance().isPhoneStateDataEnable()) {
            return h();
        }
        return getNetworkTypeDesensitized();
    }

    public static NtFetcher getInstance(Context context) {
        if (f56985a == null) {
            synchronized (NtFetcher.class) {
                if (f56985a == null) {
                    f56985a = new NtFetcher(context);
                }
            }
        }
        return f56985a;
    }

    private String h() {
        Object systemServiceSafe;
        NetworkInfo activeNetworkInfo;
        try {
            if (DH.SyncMtd.checkPermission(s.a("039de(dcdjdkdidcdlMjf)djdfdififididkVeNdlfdededgieleldheggifcgfghgjicdhelfcfdfcgi")) && (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("connectivity")) != null && (activeNetworkInfo = ((ConnectivityManager) systemServiceSafe).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    int b5 = com.mob.tools.b.e.a(this.f56986b).b();
                    if (a(b5)) {
                        return s.a("002;hiid");
                    }
                    if (c(b5)) {
                        return s.a("002Ihlid");
                    }
                    return s.a(d(b5) ? "002Ljfid" : "002Gheid");
                } else if (type != 1) {
                    switch (type) {
                        case 6:
                            return s.a("005'fgdidf3d9ei");
                        case 7:
                            return s.a("009>ffLg,dg=fi0dkdkLih");
                        case 8:
                            return s.a("005$dcdgdfdfec");
                        case 9:
                            return s.a("008fihf=djXefi");
                        default:
                            return String.valueOf(type);
                    }
                } else {
                    return s.a("004Qfgdiefdi");
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
        return s.a("004e4dk]ef");
    }

    public synchronized int getDtNtType() {
        if (this.f56989e == null) {
            this.f56989e = Integer.valueOf(d());
        }
        return this.f56989e.intValue();
    }

    @SuppressLint({"MissingPermission"})
    public String getNetworkTypeDesensitized() {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo = null;
        try {
            if (DH.SyncMtd.checkPermission(s.a("039deTdcdjdkdidcdl)jf)djdfdififididk'e_dlfdededgieleldheggifcgfghgjicdhelfcfdfcgi")) && (connectivityManager = (ConnectivityManager) DH.SyncMtd.getSystemServiceSafe("connectivity")) != null) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    String a5 = s.a("004Jfgdiefdi");
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("networkInfo: " + networkInfo2, new Object[0]);
                    return a5;
                }
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                if (networkInfo3 != null && networkInfo3.getState() == NetworkInfo.State.CONNECTED) {
                    String subtypeName = networkInfo3.getSubtypeName();
                    if (s.a("002Ceggj").equalsIgnoreCase(subtypeName)) {
                        String a6 = s.a("002Ohiid");
                        NLog mobLog2 = MobLog.getInstance();
                        mobLog2.d("networkInfo: " + networkInfo3, new Object[0]);
                        return a6;
                    } else if (s.a("003Vfefcgi").equalsIgnoreCase(subtypeName)) {
                        String a7 = s.a("002Thlid");
                        NLog mobLog3 = MobLog.getInstance();
                        mobLog3.d("networkInfo: " + networkInfo3, new Object[0]);
                        return a7;
                    } else if (a(subtypeName)) {
                        String a8 = s.a("002@jfid");
                        NLog mobLog4 = MobLog.getInstance();
                        mobLog4.d("networkInfo: " + networkInfo3, new Object[0]);
                        return a8;
                    } else if (!b(subtypeName)) {
                        NLog mobLog5 = MobLog.getInstance();
                        mobLog5.d("networkInfo: " + networkInfo3, new Object[0]);
                        return subtypeName;
                    } else {
                        String a9 = s.a("0028heid");
                        NLog mobLog6 = MobLog.getInstance();
                        mobLog6.d("networkInfo: " + networkInfo3, new Object[0]);
                        return a9;
                    }
                }
                NetworkInfo networkInfo4 = connectivityManager.getNetworkInfo(7);
                if (networkInfo4 != null && networkInfo4.getState() == NetworkInfo.State.CONNECTED) {
                    String a10 = s.a("009VffDg$dg4fiHdkdk^ih");
                    NLog mobLog7 = MobLog.getInstance();
                    mobLog7.d("networkInfo: " + networkInfo4, new Object[0]);
                    return a10;
                }
                NetworkInfo networkInfo5 = connectivityManager.getNetworkInfo(8);
                if (networkInfo5 != null && networkInfo5.getState() == NetworkInfo.State.CONNECTED) {
                    String a11 = s.a("005]dcdgdfdfec");
                    NLog mobLog8 = MobLog.getInstance();
                    mobLog8.d("networkInfo: " + networkInfo5, new Object[0]);
                    return a11;
                }
                NetworkInfo networkInfo6 = connectivityManager.getNetworkInfo(9);
                if (networkInfo6 != null && networkInfo6.getState() == NetworkInfo.State.CONNECTED) {
                    String a12 = s.a("008fihf]djLefi");
                    NLog mobLog9 = MobLog.getInstance();
                    mobLog9.d("networkInfo: " + networkInfo6, new Object[0]);
                    return a12;
                }
                networkInfo = connectivityManager.getNetworkInfo(6);
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    String a13 = s.a("005Ffgdidf(dYei");
                    NLog mobLog10 = MobLog.getInstance();
                    mobLog10.d("networkInfo: " + networkInfo, new Object[0]);
                    return a13;
                }
            }
            NLog mobLog11 = MobLog.getInstance();
            mobLog11.d("networkInfo: " + networkInfo, new Object[0]);
        } catch (Throwable th) {
            try {
                MobLog.getInstance().e(th);
                NLog mobLog12 = MobLog.getInstance();
                mobLog12.d("networkInfo: " + ((Object) null), new Object[0]);
            } catch (Throwable th2) {
                NLog mobLog13 = MobLog.getInstance();
                mobLog13.d("networkInfo: " + ((Object) null), new Object[0]);
                throw th2;
            }
        }
        return s.a("004e6dk*ef");
    }

    public synchronized String getNtType() {
        if (TextUtils.isEmpty(this.f56988d)) {
            this.f56988d = g();
        }
        return this.f56988d;
    }

    public void recycle() {
        f();
    }

    @SuppressLint({"MissingPermission"})
    private void a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) DH.SyncMtd.getSystemServiceSafe("connectivity");
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26 && DH.SyncMtd.checkPermission(s.a("039de_dcdjdkdidcdl!jf*djdfdififididk<e>dlfdededgieleldheggifcgfghgjicdhelfcfdfcgi"))) {
                connectivityManager.registerDefaultNetworkCallback(b());
            } else if (i4 >= 21 && DH.SyncMtd.checkPermission(s.a("039deCdcdjdkdidcdl<jfYdjdfdififididk)e%dlfdededgieleldheggifcgfghgjicdhelfcfdfcgi"))) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), b());
            } else {
                e();
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    private boolean b(Object obj) {
        Object serviceState;
        if (obj != null && DH.SyncMtd.checkPermission(s.a("035de8dcdjdkdidcdl3jfKdjdfdififididk e]dlgjgifdfldhglfkgheggidhelfcfdfcgi")) && Build.VERSION.SDK_INT >= 26) {
            if (CSCenter.getInstance().isPhoneStateDataEnable()) {
                serviceState = ReflectHelper.invokeInstanceMethodNoThrow(obj, s.a("0157ejOfi)el=fKdjdddi,cfYel:idif"), null, new Object[0]);
            } else {
                serviceState = CSCenter.getInstance().getServiceState();
            }
            if (serviceState != null && ((Integer) ReflectHelper.invokeInstanceMethodNoThrow(serviceState, s.a("010:ejYfi^egdjel6idif"), 0, new Object[0])).intValue() == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean b(String str) {
        return s.a("0046eeflgieg").equalsIgnoreCase(str) | ((s.a("004Pedflhcfd").equalsIgnoreCase(str) | s.a("0041giflidgi").equalsIgnoreCase(str)) | s.a("004Yidglgjel").equalsIgnoreCase(str));
    }

    private boolean a(int i4) {
        Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("phone");
        if (systemServiceSafe == null) {
            return false;
        }
        if (a(systemServiceSafe) || b(systemServiceSafe)) {
            return true;
        }
        return b(i4);
    }

    private boolean a(Object obj) {
        Object serviceState;
        if (obj != null && DH.SyncMtd.checkPermission(s.a("035de]dcdjdkdidcdl^jf8djdfdififididk=eZdlgjgifdfldhglfkgheggidhelfcfdfcgi"))) {
            if (CSCenter.getInstance().isPhoneStateDataEnable()) {
                String manufacturer = DH.SyncMtd.getManufacturer();
                serviceState = null;
                if (!TextUtils.isEmpty(manufacturer) && ((manufacturer.contains(s.a("006hPdgQdWfg]f5di")) || manufacturer.contains(s.a("006KfkdgYd^fgHfBdi")) || manufacturer.contains(s.a("006%fkekfdgfgiee"))) && Build.VERSION.SDK_INT >= 29)) {
                    serviceState = ReflectHelper.invokeInstanceMethodNoThrow(obj, s.a("015AejPfi:elVfUdjdddi(cf.elYidif"), null, new Object[0]);
                }
            } else {
                serviceState = CSCenter.getInstance().getServiceState();
            }
            if (serviceState != null && ((Integer) ReflectHelper.invokeInstanceMethodNoThrow(serviceState, s.a("016Gej9fi:fkfgeg-fi4fgdkdjehfcec.jf"), 0, new Object[0])).intValue() == 20) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str) {
        return s.a("005Lfkelglfdgl").equalsIgnoreCase(str) | (((((((s.a("006Ygigkflghdhfh").equalsIgnoreCase(str) | s.a("006Ogigkflghdhfd").equalsIgnoreCase(str)) | s.a("005+fkelflglfd").equalsIgnoreCase(str)) | s.a("004>fkelglfd").equalsIgnoreCase(str)) | s.a("0059fkelekglfd").equalsIgnoreCase(str)) | s.a("0048ekhcfcel").equalsIgnoreCase(str)) | s.a("0055gifkgjglfl").equalsIgnoreCase(str)) | s.a("006Vgigkflghdhfj").equalsIgnoreCase(str));
    }
}
