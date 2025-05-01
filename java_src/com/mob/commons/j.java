package com.mob.commons;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import com.umeng.analytics.pro.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static j f56386b = new j();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f56388c = false;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f56389d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f56390e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f56391f = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f56387a = new AtomicBoolean(false);

    private j() {
    }

    private boolean d() {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        DH.requester(MobSDK.getContext()).getCarrier().request(new DH.DHResponder() { // from class: com.mob.commons.j.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                String carrier = dHResponse.getCarrier();
                if (!TextUtils.isEmpty(carrier) && !TextUtils.equals("-1", carrier)) {
                    linkedBlockingQueue.offer(Boolean.valueOf(!carrier.startsWith("460")));
                }
                linkedBlockingQueue.offer(Boolean.valueOf(!j.this.a(MobSDK.getContext())));
            }
        });
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(120L, TimeUnit.MILLISECONDS);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean b() {
        return a(false);
    }

    public ConcurrentHashMap<String, Object> c() {
        return this.f56390e;
    }

    private synchronized boolean b(boolean z4) {
        long longValue;
        String str;
        try {
            if (z4) {
                HashMap fromJson = HashonHelper.fromJson(ab.a().d());
                if (fromJson.isEmpty()) {
                    fromJson = HashonHelper.fromJson(ab.a().c());
                }
                longValue = ((Long) ResHelper.forceCast(fromJson.get(s.a("004fcfGei")), 5L)).longValue() * 1000;
                str = (String) ResHelper.forceCast(fromJson.get(s.a("002cMdc")), s.a("006^hehehfhfhfhf"));
            } else {
                longValue = ((Long) b.a(s.a("004fcfTei"), 5L)).longValue() * 1000;
                str = (String) b.a(s.a("002c+dc"), s.a("006<hehehfhfhfhf"));
            }
            if (this.f56389d != 0 && System.currentTimeMillis() - this.f56389d <= longValue) {
                return this.f56388c;
            }
            boolean a5 = a(str);
            if (this.f56389d == 0 || a5 != this.f56388c) {
                c(a5);
            }
            this.f56389d = System.currentTimeMillis();
            this.f56388c = a5;
            return a5;
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
            return true;
        }
    }

    private void c(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put(s.a("005cgfdZdj"), Integer.valueOf(!z4 ? 1 : 0));
        hashMap.put(s.a("0021dg4c"), ResHelper.forceCast(this.f56390e.get(s.a("0021dg4c")), 0));
        hashMap.put(s.a("002Edgdc"), ResHelper.forceCast(this.f56390e.get(s.a("002Edgdc")), 0));
        hashMap.put(s.a("002)ddJj"), ResHelper.forceCast(this.f56390e.get(s.a("002)ddJj")), 0));
        hashMap.put(s.a("002NfgRj"), ResHelper.forceCast(this.f56390e.get(s.a("002NfgRj")), 0));
        hashMap.put(s.a("002Cdj>i"), ResHelper.forceCast(this.f56390e.get(s.a("002Cdj>i")), 0));
        hashMap.put(s.a("002*ei'j"), ResHelper.forceCast(this.f56390e.get(s.a("002*ei'j")), 0));
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(s.a("004i@ecSjf"), "ECMT");
        hashMap2.put(s.a("004%dc did"), hashMap);
        hashMap2.put(s.a("008=dcEdifi didf?f"), Long.valueOf(currentTimeMillis));
        c.a().a(currentTimeMillis, hashMap2);
    }

    public static j a() {
        return f56386b;
    }

    public synchronized boolean a(boolean z4) {
        return !b(z4);
    }

    private boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            char[] charArray = str.toCharArray();
            HashMap hashMap = new HashMap();
            boolean z4 = false;
            for (int i4 = 0; i4 < charArray.length; i4++) {
                if (charArray[i4] == '1') {
                    z4 |= a(i4);
                } else if (charArray[i4] != '0') {
                    List list = (List) hashMap.get(Character.valueOf(charArray[i4]));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Integer.valueOf(i4));
                    hashMap.put(Character.valueOf(charArray[i4]), list);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                boolean z5 = true;
                for (Integer num : (List) entry.getValue()) {
                    z5 &= a(num.intValue());
                }
                z4 |= z5;
            }
            return z4;
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
            return true;
        }
    }

    private boolean b(String str) {
        String d5 = v.d();
        if (TextUtils.isEmpty(d5) || d5.length() < str.length()) {
            return false;
        }
        String[] split = d5.split("");
        char[] charArray = str.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList();
        boolean z4 = false;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            if (charArray[i4] == '1') {
                z4 |= TextUtils.equals(split[i4], "1");
            } else if (charArray[i4] == '2') {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (arrayList.size() > 0) {
            boolean z5 = true;
            for (Integer num : arrayList) {
                z5 &= TextUtils.equals(split[num.intValue()], "1");
            }
            return z4 | z5;
        }
        return z4;
    }

    private boolean a(final int i4) {
        final boolean[] zArr = {true};
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        if (i4 == 0) {
            requester.checkUA();
        } else if (i4 == 1) {
            requester.usbEnable();
        } else if (i4 == 2) {
            requester.vpn();
        } else if (i4 == 3) {
            requester.isMwpy();
        } else if (i4 == 4) {
            requester.isRooted();
        } else if (i4 == 5) {
            requester.cx();
        }
        requester.request(new DH.DHResponder() { // from class: com.mob.commons.j.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                int i5 = i4;
                if (i5 == 0) {
                    zArr[0] = dHResponse.checkUA();
                    j.this.f56390e.put(s.a("002^dgQc"), Integer.valueOf(zArr[0] ? 1 : 0));
                } else if (i5 == 1) {
                    zArr[0] = dHResponse.usbEnable();
                    j.this.f56390e.put(s.a("002Xdgdc"), Integer.valueOf(zArr[0] ? 1 : 0));
                } else if (i5 == 2) {
                    zArr[0] = dHResponse.vpn();
                    j.this.f56390e.put(s.a("002:ddHj"), Integer.valueOf(zArr[0] ? 1 : 0));
                } else if (i5 == 3) {
                    zArr[0] = dHResponse.isMwpy();
                    j.this.f56390e.put(s.a("0027fg*j"), Integer.valueOf(zArr[0] ? 1 : 0));
                } else if (i5 == 4) {
                    zArr[0] = dHResponse.isRooted();
                    j.this.f56390e.put(s.a("002!dj^i"), Integer.valueOf(zArr[0] ? 1 : 0));
                } else if (i5 != 5) {
                } else {
                    zArr[0] = dHResponse.cx();
                    j.this.f56390e.put(s.a("002Eei8j"), Integer.valueOf(zArr[0] ? 1 : 0));
                }
            }
        });
        return zArr[0];
    }

    public boolean a(HashMap<String, Object> hashMap) {
        try {
            List<String> list = (List) ResHelper.forceCast(hashMap.get("j"), null);
            if (list != null && list.size() > 0) {
                boolean z4 = false;
                for (String str : list) {
                    if (str.contains(",")) {
                        boolean z5 = true;
                        for (String str2 : str.split(",")) {
                            z5 &= a(str2, hashMap);
                        }
                        z4 |= z5;
                    } else {
                        z4 |= a(str, hashMap);
                    }
                }
                this.f56390e.put(s.a("0063ej;jBdhdj(f5fi"), Boolean.valueOf(z4 ? false : true));
                return !z4;
            }
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
        }
        this.f56390e.put(s.a("006Qej*jKdhdj)f:fi"), Boolean.TRUE);
        return true;
    }

    private boolean b(final ArrayList<Boolean> arrayList, final List<String> list) {
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        if (list == null || list.size() == 0) {
            return false;
        }
        for (String str : list) {
            requester.isPackageInstalled(str);
        }
        final boolean[] zArr = {false};
        requester.request(new DH.DHResponder() { // from class: com.mob.commons.j.4
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    boolean isPackageInstalled = dHResponse.isPackageInstalled(i4);
                    arrayList.add(Boolean.valueOf(isPackageInstalled));
                    boolean[] zArr2 = zArr;
                    zArr2[0] = isPackageInstalled | zArr2[0];
                    if (zArr2[0]) {
                        return;
                    }
                }
            }
        });
        return zArr[0];
    }

    private boolean a(String str, HashMap<String, Object> hashMap) {
        boolean z4 = true;
        if (TextUtils.equals(str, "a")) {
            z4 = (((Integer) ResHelper.forceCast(hashMap.get("a"), 0)).intValue() == 1 && d()) ? false : false;
            this.f56391f.put("a", Boolean.valueOf(z4));
            return z4;
        } else if (TextUtils.equals(str, "p")) {
            ArrayList<Boolean> arrayList = new ArrayList<>();
            boolean b5 = b(arrayList, (List) ResHelper.forceCast(hashMap.get("p"), null));
            this.f56391f.put("p", arrayList);
            return b5;
        } else if (TextUtils.equals(str, "fp")) {
            ArrayList<Boolean> arrayList2 = new ArrayList<>();
            boolean b6 = b(arrayList2, (List) ResHelper.forceCast(hashMap.get("fp"), null));
            this.f56391f.put("fp", arrayList2);
            return b6;
        } else if (TextUtils.equals(str, "s")) {
            boolean a5 = a(new ArrayList<>(), (List) ResHelper.forceCast(hashMap.get("s"), null));
            this.f56391f.put("s", Boolean.valueOf(a5));
            return a5;
        } else if (TextUtils.equals(str, "fs")) {
            boolean a6 = a(new ArrayList<>(), (List) ResHelper.forceCast(hashMap.get("fs"), null));
            this.f56391f.put("fs", Boolean.valueOf(a6));
            return a6;
        } else if (TextUtils.equals(str, com.kuaishou.weapon.p0.t.f55701t)) {
            z4 = (((Integer) ResHelper.forceCast(hashMap.get(com.kuaishou.weapon.p0.t.f55701t), 0)).intValue() == 1 && com.mob.tools.b.c.a(MobSDK.getContext()).d().aw()) ? false : false;
            this.f56391f.put(com.kuaishou.weapon.p0.t.f55701t, Boolean.valueOf(z4));
            return z4;
        } else if (TextUtils.equals(str, aw.f63389t)) {
            boolean b7 = b((String) ResHelper.forceCast(hashMap.get(aw.f63389t), ""));
            this.f56391f.put(aw.f63389t, Boolean.valueOf(b7));
            return b7;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale.getLanguage().startsWith("zh") && TextUtils.equals(locale.getCountry(), "CN");
    }

    private boolean a(ArrayList<Boolean> arrayList, final List<String> list) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        if (list != null && list.size() > 0) {
            DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
            for (int i4 = 0; i4 < list.size(); i4++) {
                requester.queryIntentServices(new Intent(list.get(i4)), 0);
            }
            requester.request(new DH.DHResponder() { // from class: com.mob.commons.j.3
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        List<ResolveInfo> queryIntentServices = dHResponse.queryIntentServices(i5);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            linkedBlockingQueue.offer(Boolean.TRUE);
                        }
                    }
                    linkedBlockingQueue.offer(Boolean.FALSE);
                }
            });
        }
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(150L, TimeUnit.MILLISECONDS);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3) {
        try {
            Object obj = this.f56390e.get(s.a("006fNdfdhdjTf5fi"));
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) ResHelper.forceCast(obj, bool)).booleanValue();
            boolean booleanValue2 = ((Boolean) ResHelper.forceCast(this.f56390e.get(s.a("006Fej-j,dhdjUfSfi")), bool)).booleanValue();
            HashMap hashMap4 = new HashMap(4);
            hashMap4.put(s.a("003ZdjYf[fi"), Boolean.valueOf(booleanValue));
            hashMap4.put(s.a("003>djdidc"), ResHelper.forceCast(hashMap.get(s.a("003>djdidc")), null));
            if (!booleanValue && hashMap2 != null) {
                hashMap4.put(s.a("003Wfididc"), ResHelper.forceCast(hashMap2.get(s.a("003Wfididc")), null));
            } else {
                hashMap4.put(s.a("003:fididc"), ResHelper.forceCast(hashMap.get(s.a("003:fididc")), null));
            }
            this.f56390e.put(s.a("006f)dfdhdj2f7fi"), HashonHelper.fromHashMap(hashMap4));
            if (booleanValue) {
                HashMap hashMap5 = new HashMap(4);
                hashMap5.put(s.a("0031dj'f2fi"), Boolean.valueOf(booleanValue2));
                hashMap5.put(s.a("003Zdjdidc"), ResHelper.forceCast(hashMap.get(s.a("003Zdjdidc")), null));
                if (!booleanValue2 && hashMap3 != null) {
                    hashMap5.put(s.a("0030fididc"), ResHelper.forceCast(hashMap3.get(s.a("0030fididc")), null));
                } else {
                    hashMap5.put(s.a("0038fididc"), ResHelper.forceCast(hashMap.get(s.a("0038fididc")), null));
                }
                hashMap5.putAll(this.f56391f);
                this.f56390e.put(s.a("006[ejHjXdhdj;f$fi"), HashonHelper.fromHashMap(hashMap5));
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
