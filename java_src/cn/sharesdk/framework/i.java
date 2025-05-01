package cn.sharesdk.framework;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.k;
import com.mob.MobSDK;
import com.mob.commons.eventrecoder.EventRecorder;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: ShareSDKCoreThread.java */
/* loaded from: classes2.dex */
public class i extends cn.sharesdk.framework.utils.f {

    /* renamed from: b  reason: collision with root package name */
    private a f1013b;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1022k;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1021j = true;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, HashMap<String, String>> f1014c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Platform> f1015d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Integer> f1016e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, String> f1017f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, CustomPlatform> f1018g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private HashMap<Integer, HashMap<String, Object>> f1019h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<Integer, Service> f1020i = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShareSDKCoreThread.java */
    /* loaded from: classes2.dex */
    public enum a {
        INITIALIZING,
        READY
    }

    private void h() {
        synchronized (this.f1014c) {
            this.f1014c.clear();
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            InputStream inputStream = null;
            try {
                inputStream = MobSDK.getContext().getAssets().open("ShareSDK.xml");
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
            newPullParser.setInput(inputStream, "utf-8");
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    HashMap<String, String> hashMap = new HashMap<>();
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i4 = 0; i4 < attributeCount; i4++) {
                        hashMap.put(newPullParser.getAttributeName(i4), newPullParser.getAttributeValue(i4).trim());
                    }
                    this.f1014c.put(name, hashMap);
                }
            }
            inputStream.close();
        }
    }

    @Override // cn.sharesdk.framework.utils.f
    protected void b(Message message) {
    }

    public boolean b() {
        return h.c();
    }

    @Override // cn.sharesdk.framework.utils.f
    public void c() {
        this.f1013b = a.INITIALIZING;
        SSDKLog.a();
        EventRecorder.prepare();
        h();
        super.c();
    }

    public void d(Class<? extends CustomPlatform> cls) {
        synchronized (this.f1018g) {
            if (this.f1018g.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            CustomPlatform newInstance = cls.newInstance();
            this.f1018g.put(Integer.valueOf(cls.hashCode()), newInstance);
            if (newInstance != null && newInstance.b()) {
                this.f1017f.put(Integer.valueOf(newInstance.getPlatformId()), newInstance.getName());
                this.f1016e.put(newInstance.getName(), Integer.valueOf(newInstance.getPlatformId()));
            }
        }
    }

    public void e(Class<? extends CustomPlatform> cls) {
        int hashCode = cls.hashCode();
        synchronized (this.f1018g) {
            this.f1018g.remove(Integer.valueOf(hashCode));
        }
    }

    public boolean f() {
        synchronized (this.f1019h) {
            HashMap<Integer, HashMap<String, Object>> hashMap = this.f1019h;
            return hashMap != null && hashMap.size() > 0;
        }
    }

    public void g() {
        try {
            ResHelper.clearCache(MobSDK.getContext());
        } catch (Throwable th) {
            SSDKLog.b().b(th);
        }
    }

    public void b(Class<? extends Service> cls) {
        synchronized (this.f1020i) {
            int hashCode = cls.hashCode();
            if (this.f1020i.containsKey(Integer.valueOf(hashCode))) {
                this.f1020i.get(Integer.valueOf(hashCode)).onUnbind();
                this.f1020i.remove(Integer.valueOf(hashCode));
            }
        }
    }

    public void a(Activity activity) {
        h.a(activity);
    }

    public Activity a() {
        return h.b();
    }

    public boolean e() {
        return this.f1022k;
    }

    public void a(boolean z4) {
        h.a(z4);
    }

    public <T extends Service> T c(Class<T> cls) {
        T cast;
        synchronized (this.f1020i) {
            if (this.f1013b == a.INITIALIZING) {
                this.f1020i.wait();
            }
            cast = cls.cast(this.f1020i.get(Integer.valueOf(cls.hashCode())));
        }
        return cast;
    }

    @Override // cn.sharesdk.framework.utils.f
    protected void a(Message message) {
        synchronized (this.f1020i) {
            synchronized (this.f1015d) {
                String checkRecord = EventRecorder.checkRecord(ShareSDK.SDK_TAG);
                if (!TextUtils.isEmpty(checkRecord)) {
                    cn.sharesdk.framework.a.a.a().a((HashMap<String, Object>) null);
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("EventRecorder checkRecord result ==" + checkRecord);
                    g();
                }
                EventRecorder.clear();
                this.f1015d.clear();
                ArrayList<Platform> a5 = h.a();
                if (a5 != null) {
                    this.f1015d.addAll(a5);
                }
                Iterator<Platform> it2 = this.f1015d.iterator();
                while (it2.hasNext()) {
                    Platform next = it2.next();
                    this.f1017f.put(Integer.valueOf(next.getPlatformId()), next.getName());
                    this.f1016e.put(next.getName(), Integer.valueOf(next.getPlatformId()));
                }
                h.a(this.f1059a);
                a aVar = a.READY;
                this.f1013b = aVar;
                new Thread() { // from class: cn.sharesdk.framework.i.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        i.this.a((ShareSDKCallback<Boolean>) null);
                    }
                }.start();
                this.f1013b = aVar;
                this.f1015d.notify();
                this.f1020i.notify();
            }
        }
    }

    public void b(int i4) {
        NetworkHelper.readTimout = i4;
    }

    public void b(boolean z4) {
        this.f1022k = z4;
    }

    public int b(String str) {
        synchronized (this.f1015d) {
            synchronized (this.f1018g) {
                if (this.f1016e.containsKey(str)) {
                    return this.f1016e.get(str).intValue();
                }
                return 0;
            }
        }
    }

    public Platform[] d() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f1015d) {
            if (this.f1013b == a.INITIALIZING) {
                this.f1015d.wait();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Platform> it2 = this.f1015d.iterator();
        while (it2.hasNext()) {
            Platform next = it2.next();
            if (next != null && next.b()) {
                next.a();
                arrayList.add(next);
            }
        }
        h.a(arrayList);
        for (Map.Entry<Integer, CustomPlatform> entry : this.f1018g.entrySet()) {
            CustomPlatform value = entry.getValue();
            if (value != null && value.b()) {
                arrayList.add(value);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        int size = arrayList.size();
        Platform[] platformArr = new Platform[size];
        for (int i4 = 0; i4 < size; i4++) {
            platformArr[i4] = (Platform) arrayList.get(i4);
        }
        SSDKLog.b().c("sort list use time: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return platformArr;
    }

    public String c(int i4) {
        String str;
        synchronized (this.f1015d) {
            synchronized (this.f1018g) {
                str = this.f1017f.get(Integer.valueOf(i4));
            }
        }
        return str;
    }

    public String b(String str, String str2) {
        synchronized (this.f1014c) {
            HashMap<String, String> hashMap = this.f1014c.get(str);
            if (hashMap == null) {
                return null;
            }
            return hashMap.get(str2);
        }
    }

    public void a(Class<? extends Service> cls) {
        synchronized (this.f1020i) {
            if (this.f1020i.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            Service newInstance = cls.newInstance();
            this.f1020i.put(Integer.valueOf(cls.hashCode()), newInstance);
            newInstance.onBind();
        }
    }

    public Platform a(String str) {
        Platform[] d5;
        if (str == null || (d5 = d()) == null) {
            return null;
        }
        for (Platform platform : d5) {
            if (str.equals(platform.getName())) {
                return platform;
            }
        }
        return null;
    }

    public void a(int i4) {
        NetworkHelper.connectionTimeout = i4;
    }

    public void a(int i4, Platform platform) {
        h.a(i4, platform);
    }

    public void a(String str, int i4) {
        h.a(str, i4);
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        synchronized (this.f1014c) {
            HashMap<String, String> hashMap2 = this.f1014c.get(str);
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            synchronized (hashMap2) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        hashMap2.put(key, String.valueOf(value));
                    }
                }
            }
            this.f1014c.put(str, hashMap2);
        }
        synchronized (this.f1015d) {
            if (this.f1013b == a.INITIALIZING) {
                this.f1015d.wait();
            }
        }
        Iterator<Platform> it2 = this.f1015d.iterator();
        while (it2.hasNext()) {
            Platform next = it2.next();
            if (next != null && next.getName().equals(str)) {
                next.a();
                return;
            }
        }
    }

    public void a(List<HashMap<String, Object>> list) {
        synchronized (this.f1014c) {
            for (HashMap<String, Object> hashMap : list) {
                String str = null;
                HashMap<String, String> hashMap2 = new HashMap<>();
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key.equals("platformName")) {
                        str = String.valueOf(entry.getValue());
                    }
                    if (value != null) {
                        hashMap2.put(key, String.valueOf(value));
                    }
                }
                this.f1014c.put(str, hashMap2);
            }
        }
        synchronized (this.f1015d) {
            if (this.f1013b == a.INITIALIZING) {
                this.f1015d.wait();
            }
        }
    }

    public void a(String str, String str2) {
        synchronized (this.f1014c) {
            this.f1014c.put(str2, this.f1014c.get(str));
        }
    }

    public void a(int i4, int i5) {
        synchronized (this.f1019h) {
            this.f1019h.put(Integer.valueOf(i5), this.f1019h.get(Integer.valueOf(i4)));
        }
    }

    public String a(int i4, String str) {
        synchronized (this.f1019h) {
            HashMap<String, Object> hashMap = this.f1019h.get(Integer.valueOf(i4));
            String str2 = null;
            if (hashMap == null) {
                return null;
            }
            Object obj = hashMap.get(str);
            if (obj != null) {
                str2 = String.valueOf(obj);
            }
            return str2;
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            if (a.READY != this.f1013b) {
                SSDKLog.b().a("Statistics module unopened", new Object[0]);
                if (shareSDKCallback != null) {
                    shareSDKCallback.onCallback(Boolean.FALSE);
                    return;
                }
                return;
            }
            DH.requester(MobSDK.getContext()).getDeviceKey().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.i.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    try {
                        final String deviceKey = dHResponse.getDeviceKey();
                        boolean z4 = false;
                        if (TextUtils.isEmpty(deviceKey)) {
                            SSDKLog.b().a("dk null", new Object[0]);
                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                            if (shareSDKCallback2 != null) {
                                shareSDKCallback2.onCallback(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        final cn.sharesdk.framework.a.a a5 = cn.sharesdk.framework.a.a.a();
                        HashMap a6 = i.this.a(a5, a5.c(), deviceKey);
                        if (a6 != null && a6.size() > 0) {
                            z4 = i.this.a(a6);
                        }
                        if (!z4) {
                            i.this.a(a5, shareSDKCallback, deviceKey);
                        } else {
                            k.a(new k.a() { // from class: cn.sharesdk.framework.i.2.1
                                @Override // cn.sharesdk.framework.utils.k.a
                                public void a() throws Throwable {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    i.this.a(a5, shareSDKCallback, deviceKey);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        SSDKLog.b().a(th);
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.FALSE);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cn.sharesdk.framework.a.a aVar, ShareSDKCallback<Boolean> shareSDKCallback, String str) {
        try {
            HashMap<String, Object> b5 = aVar.b(str);
            HashMap<String, Object> a5 = a(aVar, b5, str);
            if (a5 != null && a5.size() > 0) {
                if (a(a5)) {
                    aVar.a(b5);
                    if (shareSDKCallback != null) {
                        shareSDKCallback.onCallback(Boolean.TRUE);
                    }
                }
            } else {
                SSDKLog.b().a("d i n");
                if (shareSDKCallback != null) {
                    shareSDKCallback.onCallback(Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            SSDKLog.b().b(th);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> a(cn.sharesdk.framework.a.a aVar, HashMap<String, Object> hashMap, String str) {
        try {
            if (hashMap.containsKey("error")) {
                SSDKLog.b().c("ShareSDK parse sns config ==>>", new Hashon().fromHashMap(hashMap));
                return null;
            } else if (!hashMap.containsKey(com.facebook.common.util.f.f10929g)) {
                SSDKLog.b().a("ShareSDK platform config result ==>>", "SNS configuration is empty");
                return null;
            } else {
                String str2 = (String) hashMap.get(com.facebook.common.util.f.f10929g);
                if (str2 == null) {
                    return null;
                }
                return aVar.a(str2, str);
            }
        } catch (Throwable th) {
            SSDKLog.b().b(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HashMap<String, Object> hashMap) {
        synchronized (this.f1019h) {
            HashMap<Integer, HashMap<String, Object>> a5 = h.a(hashMap);
            if (a5 == null || a5.size() <= 0) {
                return false;
            }
            this.f1019h.clear();
            this.f1019h = a5;
            return true;
        }
    }

    public void a(String str, boolean z4, int i4, String str2, ShareSDKCallback<String> shareSDKCallback) {
        if (a.READY == this.f1013b) {
            cn.sharesdk.framework.a.a.a().a(str, i4, z4, str2, shareSDKCallback);
        } else if (shareSDKCallback != null) {
            shareSDKCallback.onCallback(str);
        }
    }
}
