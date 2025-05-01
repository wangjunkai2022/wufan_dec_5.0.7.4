package cn.sharesdk.framework.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.common.util.f;
import com.join.mgps.Util.h0;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ResHelper;
import com.umeng.umcrash.UMCrash;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
/* compiled from: EventManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f840a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f843d = true;

    /* renamed from: b  reason: collision with root package name */
    private c f841b = new c();

    /* renamed from: c  reason: collision with root package name */
    private e f842c = e.a();

    private a() {
    }

    private String c(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = byteArrayInputStream.read(bArr, 0, 1024);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
                return Base64.encodeToString(byteArray, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(cn.sharesdk.framework.a.b.c cVar) {
        try {
            long b5 = this.f842c.b();
            if (b5 == 0) {
                b5 = this.f841b.b();
            }
            cVar.f877e = System.currentTimeMillis() - b5;
            this.f841b.a(cVar);
        } catch (Throwable th) {
            SSDKLog b6 = SSDKLog.b();
            b6.a("s l" + th, new Object[0]);
        }
    }

    public static a a() {
        if (f840a == null) {
            f840a = new a();
        }
        return f840a;
    }

    public void a(String str) {
        if (this.f841b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f841b.a(str);
    }

    public void b() {
        boolean a5;
        try {
            if (this.f842c.i()) {
                ArrayList<cn.sharesdk.framework.a.a.c> c5 = this.f841b.c();
                for (int i4 = 0; i4 < c5.size(); i4++) {
                    cn.sharesdk.framework.a.a.c cVar = c5.get(i4);
                    if (cVar.f861b.size() == 1) {
                        a5 = a(cVar.f860a, false);
                    } else {
                        a5 = a(c(cVar.f860a), true);
                    }
                    if (a5) {
                        this.f841b.a(cVar.f861b);
                    }
                }
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        long longValue = a.this.f842c.j().longValue();
                        long currentTimeMillis = System.currentTimeMillis();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(longValue);
                        int i4 = calendar.get(5);
                        calendar.setTimeInMillis(currentTimeMillis);
                        int i5 = calendar.get(5);
                        if (currentTimeMillis - longValue >= 86400000 && i4 != i5) {
                            HashMap<String, Object> a5 = a.this.f841b.a();
                            a.this.f842c.c(a5.containsKey(f.f10929g) ? "true".equals(String.valueOf(a5.get(f.f10929g))) : true);
                            if (a5.size() > 0) {
                                a.this.f842c.b(System.currentTimeMillis());
                            }
                        }
                        shareSDKCallback.onCallback(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    shareSDKCallback.onCallback(Boolean.FALSE);
                    SSDKLog.b().a(th);
                }
            }
        });
    }

    public void a(final Handler handler) {
        try {
            if (this.f842c.i()) {
                this.f842c.a(System.currentTimeMillis());
                this.f841b.a(new ShareSDKCallback<HashMap<String, Object>>() { // from class: cn.sharesdk.framework.a.a.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(HashMap<String, Object> hashMap) {
                        HashMap hashMap2;
                        HashMap hashMap3;
                        HashMap hashMap4;
                        if (hashMap == null || hashMap.isEmpty()) {
                            return;
                        }
                        try {
                            if (hashMap.containsKey("status") && ResHelper.parseInt(String.valueOf(hashMap.get("status"))) == -200) {
                                SSDKLog.b().a((String) hashMap.get("error"), new Object[0]);
                                return;
                            }
                        } catch (Throwable th) {
                            SSDKLog b5 = SSDKLog.b();
                            b5.a("get status" + th, new Object[0]);
                        }
                        try {
                            if (hashMap.containsKey(UMCrash.SP_KEY_TIMESTAMP)) {
                                a.this.f842c.a("service_time", Long.valueOf(System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(hashMap.get(UMCrash.SP_KEY_TIMESTAMP)))));
                            }
                        } catch (Throwable th2) {
                            SSDKLog b6 = SSDKLog.b();
                            b6.a(UMCrash.SP_KEY_TIMESTAMP + th2, new Object[0]);
                        }
                        try {
                            if (hashMap.containsKey("specurls") && (hashMap4 = (HashMap) hashMap.get("specurls")) != null && !hashMap4.isEmpty()) {
                                e.a().a("twitter_auth_url", String.valueOf(hashMap4.get("twitterAuthUrl")));
                            }
                        } catch (Throwable th3) {
                            SSDKLog b7 = SSDKLog.b();
                            b7.a("specurls" + th3, new Object[0]);
                        }
                        if (hashMap.containsKey("switchs") && (hashMap3 = (HashMap) hashMap.get("switchs")) != null) {
                            String valueOf = String.valueOf(hashMap3.get(com.alipay.sdk.packet.d.f4907p));
                            String valueOf2 = String.valueOf(hashMap3.get("share"));
                            String valueOf3 = String.valueOf(hashMap3.get(com.coremedia.iso.boxes.c.f9544u));
                            String valueOf4 = String.valueOf(hashMap3.get("backflow"));
                            String valueOf5 = String.valueOf(hashMap3.get("loginplus"));
                            String valueOf6 = String.valueOf(hashMap3.get("linkcard"));
                            a.this.f842c.b(valueOf);
                            a.this.f842c.d(valueOf2);
                            a.this.f842c.c(valueOf3);
                            a.this.f842c.a(valueOf4);
                            a.this.f842c.e(valueOf5);
                            a.this.f842c.f(valueOf6);
                        }
                        if (!hashMap.containsKey("serpaths") || (hashMap2 = (HashMap) hashMap.get("serpaths")) == null) {
                            return;
                        }
                        String valueOf7 = String.valueOf(hashMap2.get("defhost"));
                        String valueOf8 = String.valueOf(hashMap2.get("defport"));
                        if (!TextUtils.isEmpty(valueOf7) && !TextUtils.isEmpty(valueOf8)) {
                            if ("443".equals(valueOf8) || "80".equals(valueOf8)) {
                                a.this.f841b.b(MobSDK.checkRequestUrl(valueOf7));
                            } else {
                                c cVar = a.this.f841b;
                                cVar.b(MobSDK.checkRequestUrl(valueOf7) + ":" + valueOf8);
                            }
                        }
                        HashMap<String, String> hashMap5 = new HashMap<>();
                        if (hashMap2.containsKey("assigns")) {
                            HashMap hashMap6 = (HashMap) hashMap2.get("assigns");
                            if (hashMap6 == null || hashMap6.size() == 0) {
                                a.this.f841b.a((HashMap<String, String>) null);
                                return;
                            }
                            for (String str : hashMap6.keySet()) {
                                HashMap hashMap7 = (HashMap) hashMap6.get(str);
                                String valueOf9 = String.valueOf(hashMap7.get(com.alipay.sdk.cons.c.f4843f));
                                String valueOf10 = String.valueOf(hashMap7.get("port"));
                                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueOf9) && !TextUtils.isEmpty(valueOf10)) {
                                    hashMap5.put(str, "http://" + valueOf9 + ":" + valueOf10);
                                }
                            }
                            a.this.f841b.a(hashMap5);
                            handler.sendEmptyMessageDelayed(4, TTAdConstant.AD_MAX_EVENT_TIME);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    public HashMap<String, Object> c() {
        try {
            return this.f841b.d();
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return new HashMap<>();
        }
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) {
        try {
            if (this.f842c.i()) {
                if (!this.f842c.c()) {
                    cVar.f884l = null;
                }
                if (cVar instanceof cn.sharesdk.framework.a.b.b) {
                    a((cn.sharesdk.framework.a.b.b) cVar);
                    b(cVar);
                } else if (cVar instanceof cn.sharesdk.framework.a.b.f) {
                    a((cn.sharesdk.framework.a.b.f) cVar);
                } else {
                    b(cVar);
                }
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    public HashMap<String, Object> b(String str) {
        if (!this.f842c.i() && this.f842c.k()) {
            return new HashMap<>();
        }
        try {
            HashMap<String, Object> d5 = this.f841b.d(str);
            this.f842c.d(true);
            return d5;
        } catch (Throwable th) {
            this.f842c.d(false);
            SSDKLog.b().a(th);
            return new HashMap<>();
        }
    }

    private void a(cn.sharesdk.framework.a.b.b bVar) throws Throwable {
        boolean d5 = this.f842c.d();
        String str = bVar.f875c;
        if (d5 && !TextUtils.isEmpty(str)) {
            bVar.f875c = Data.Base64AES(str, bVar.f878f.substring(0, 16));
            return;
        }
        bVar.f876d = null;
        bVar.f875c = null;
    }

    private void a(final cn.sharesdk.framework.a.b.f fVar) throws Throwable {
        ArrayList arrayList;
        ArrayList<Bitmap> arrayList2;
        int f5 = this.f842c.f();
        boolean d5 = this.f842c.d();
        final f.a aVar = fVar.f898d;
        if (!d5) {
            fVar.f899m = null;
        }
        if (f5 == 1) {
            if (aVar != null && aVar.f905e != null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(aVar.f905e);
            }
            int size = (aVar == null || (arrayList2 = aVar.f906f) == null) ? 0 : arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                Bitmap bitmap = aVar.f906f.get(i4);
                try {
                    File createTempFile = File.createTempFile("bm_tmp", ".png");
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(createTempFile.getAbsolutePath());
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("bit" + th, new Object[0]);
                }
            }
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a((String) it2.next(), b.FINISH_SHARE, new ShareSDKCallback<String>() { // from class: cn.sharesdk.framework.a.a.3
                        @Override // cn.sharesdk.framework.ShareSDKCallback
                        /* renamed from: a */
                        public void onCallback(String str) {
                            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
                                return;
                            }
                            aVar.f904d.add(str);
                            a.this.b(fVar);
                        }
                    });
                }
                return;
            }
            b(fVar);
            return;
        }
        fVar.f898d = null;
        b(fVar);
    }

    private void a(String str, b bVar, ShareSDKCallback<String> shareSDKCallback) throws Throwable {
        double ceil;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(null);
                return;
            }
            return;
        }
        Bitmap.CompressFormat bmpFormat = BitmapHelper.getBmpFormat(str);
        float f5 = bVar == b.BEFORE_SHARE ? 600.0f : 200.0f;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 >= i5 && i5 > f5) {
            ceil = Math.ceil(i5 / f5);
        } else if (i4 < i5 && i4 > f5) {
            ceil = Math.ceil(i4 / f5);
        } else {
            a(str, shareSDKCallback);
            return;
        }
        int i6 = (int) ceil;
        if (i6 <= 0) {
            i6 = 1;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i6;
        options2.inPurgeable = true;
        options2.inInputShareable = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
        decodeFile.getHeight();
        decodeFile.getWidth();
        File createTempFile = File.createTempFile("bm_tmp2", h0.f27805a + bmpFormat.name().toLowerCase());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        decodeFile.compress(bmpFormat, 80, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        a(createTempFile.getAbsolutePath(), shareSDKCallback);
    }

    private void a(final String str, final ShareSDKCallback<String> shareSDKCallback) throws Throwable {
        DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.a.4
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        HashMap<String, Object> c5 = a.this.f841b.c(str);
                        if (c5 != null && c5.size() > 0) {
                            if (!c5.containsKey("status")) {
                                ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                                if (shareSDKCallback2 != null) {
                                    shareSDKCallback2.onCallback(null);
                                    return;
                                }
                                return;
                            } else if (ResHelper.parseInt(String.valueOf(c5.get("status"))) != 200) {
                                ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                                if (shareSDKCallback3 != null) {
                                    shareSDKCallback3.onCallback(null);
                                    return;
                                }
                                return;
                            } else {
                                String str2 = c5.containsKey("url") ? (String) c5.get("url") : null;
                                ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                                if (shareSDKCallback4 != null) {
                                    shareSDKCallback4.onCallback(str2);
                                    return;
                                }
                                return;
                            }
                        }
                        ShareSDKCallback shareSDKCallback5 = shareSDKCallback;
                        if (shareSDKCallback5 != null) {
                            shareSDKCallback5.onCallback(null);
                            return;
                        }
                        return;
                    }
                    ShareSDKCallback shareSDKCallback6 = shareSDKCallback;
                    if (shareSDKCallback6 != null) {
                        shareSDKCallback6.onCallback(null);
                    }
                } catch (Throwable unused) {
                    SSDKLog.b().a("up fi", new Object[0]);
                    ShareSDKCallback shareSDKCallback7 = shareSDKCallback;
                    if (shareSDKCallback7 != null) {
                        shareSDKCallback7.onCallback(null);
                    }
                }
            }
        });
    }

    private boolean a(String str, boolean z4) throws Throwable {
        return this.f841b.a(str, z4);
    }

    public void a(String str, int i4, boolean z4, String str2, ShareSDKCallback<String> shareSDKCallback) {
        try {
            if ((!this.f842c.i() || !this.f842c.e()) && shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
                return;
            }
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL content before replace link ===  %s", str);
            if (z4) {
                a(str, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i4, str2, shareSDKCallback);
            } else {
                a(str, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i4, str2, shareSDKCallback);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback("error:" + th.getMessage());
            }
        }
    }

    private void a(final String str, String str2, int i4, String str3, final ShareSDKCallback<String> shareSDKCallback) throws Throwable {
        ArrayList<String> arrayList = new ArrayList<>();
        final Pattern compile = Pattern.compile(str2);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() == 0 && shareSDKCallback != null) {
            shareSDKCallback.onCallback(str);
        }
        this.f841b.a(str, arrayList, i4, str3, new ShareSDKCallback<HashMap<String, Object>>() { // from class: cn.sharesdk.framework.a.a.5
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(HashMap<String, Object> hashMap) {
                if (hashMap != null && hashMap.size() > 0) {
                    if (!hashMap.containsKey("data")) {
                        shareSDKCallback.onCallback(str);
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = ((ArrayList) hashMap.get("data")).iterator();
                    while (it2.hasNext()) {
                        HashMap hashMap3 = (HashMap) it2.next();
                        hashMap2.put(String.valueOf(hashMap3.get("source")), String.valueOf(hashMap3.get("surl")));
                    }
                    Matcher matcher2 = compile.matcher(str);
                    StringBuilder sb = new StringBuilder();
                    int i5 = 0;
                    while (matcher2.find()) {
                        sb.append(str.substring(i5, matcher2.start()));
                        sb.append((String) hashMap2.get(matcher2.group()));
                        i5 = matcher2.end();
                    }
                    sb.append(str.substring(i5));
                    String sb2 = sb.toString();
                    SSDKLog.b().c("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb2);
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(sb2);
                        return;
                    }
                    return;
                }
                shareSDKCallback.onCallback(str);
            }
        });
    }

    public void a(HashMap<String, Object> hashMap) {
        try {
            this.f841b.b(hashMap);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    public HashMap<String, Object> a(String str, String str2) {
        try {
            return this.f841b.a(str, str2);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    public String a(String str, int i4, boolean z4, String str2, HashMap<String, String> hashMap) {
        String a5;
        try {
            if (this.f842c.i() && this.f842c.e()) {
                String str3 = hashMap.get("nt");
                if (!"none".equals(str3) && !TextUtils.isEmpty(str3)) {
                    if (z4 && (a5 = a(str, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i4, str2, hashMap)) != null && !a5.equals(str)) {
                        return a5;
                    }
                    String a6 = a(str, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i4, str2, hashMap);
                    if (a6 != null) {
                        if (!a6.equals(str)) {
                            return a6;
                        }
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return str;
        }
    }

    private String a(String str, String str2, int i4, String str3, HashMap<String, String> hashMap) throws Throwable {
        HashMap<String, Object> a5;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Pattern compile = Pattern.compile(str2);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() != 0 && (a5 = this.f841b.a(str, arrayList, i4, str3, hashMap)) != null && a5.size() > 0 && a5.containsKey("data")) {
            HashMap hashMap2 = new HashMap();
            Iterator it2 = ((ArrayList) a5.get("data")).iterator();
            while (it2.hasNext()) {
                HashMap hashMap3 = (HashMap) it2.next();
                hashMap2.put(String.valueOf(hashMap3.get("source")), String.valueOf(hashMap3.get("surl")));
            }
            Matcher matcher2 = compile.matcher(str);
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            while (matcher2.find()) {
                sb.append(str.substring(i5, matcher2.start()));
                sb.append((String) hashMap2.get(matcher2.group()));
                i5 = matcher2.end();
            }
            sb.append(str.substring(i5, str.length()));
            String sb2 = sb.toString();
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb2);
            return sb2;
        }
        return str;
    }
}
