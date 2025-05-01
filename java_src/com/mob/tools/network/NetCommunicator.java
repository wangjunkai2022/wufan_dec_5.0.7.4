package com.mob.tools.network;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.MobProduct;
import com.mob.commons.aa;
import com.mob.commons.e;
import com.mob.commons.u;
import com.mob.commons.v;
import com.mob.mcl.b.a;
import com.mob.tools.MobLog;
import com.mob.tools.b.c;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.UIHandler;
import com.mob.tools.utils.i;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes5.dex */
public final class NetCommunicator implements PublicMemberKeeper {
    public static final String KEY_DUID_PREVIOUS = "duidPrevious";
    public static final String KEY_IS_MODIFIED = "isModified";

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f56806b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f56807c;

    /* renamed from: d  reason: collision with root package name */
    private MobRSA f56808d;

    /* renamed from: e  reason: collision with root package name */
    private NetworkHelper f56809e;

    /* renamed from: f  reason: collision with root package name */
    private NetworkHelper.NetworkTimeOut f56810f;

    /* renamed from: g  reason: collision with root package name */
    private ThreadPoolExecutor f56811g;
    public static final String KEY_DUID = C0811r.b("004Zcbcfchcb");

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f56805a = new ThreadPoolExecutor(3, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* loaded from: classes5.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th) {
        }

        public void onResultOk(T t4) {
        }
    }

    /* loaded from: classes5.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
            super(str);
        }
    }

    public NetCommunicator(int i4, String str, String str2) {
        this(i4, str, str2, null);
    }

    public static String checkHttpRequestUrl(String str) {
        return v.b(str);
    }

    public static String dynamicModifyUrl(String str) {
        return v.a(str);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() throws Throwable {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C0811r.b("003Idg%eCdb"), u.a());
        hashMap.put(C0811r.b("013?djehJeZcigjddcbYedhFch3hGdb"), aa.c());
        hashMap.put(C0811r.b("0047cecjchcb"), c.a(MobSDK.getContext()).d().ai());
        return hashMap;
    }

    public static synchronized String getDUID(MobProduct mobProduct) {
        String a5;
        synchronized (NetCommunicator.class) {
            a5 = e.a(mobProduct);
        }
        return a5;
    }

    public static synchronized HashMap<String, Object> getDUIDWithModifyInfo(MobProduct mobProduct) {
        HashMap<String, Object> b5;
        synchronized (NetCommunicator.class) {
            b5 = e.b(mobProduct);
        }
        return b5;
    }

    public void addTcpIntercept(String str) {
        try {
            a.a(str);
        } catch (Throwable unused) {
        }
    }

    public void removeTcpIntercept(String str) {
        try {
            a.b(str);
        } catch (Throwable unused) {
        }
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z4, Callback<T> callback) {
        request(true, null, hashMap, str, z4, callback);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z4) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z4);
    }

    public String requestSynchronizedGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        try {
            a.a((String) null);
            String a5 = a.a(false, str, hashMap, hashMap2, this.f56810f);
            NLog mobLog = MobLog.getInstance();
            mobLog.d(">>> gt res:  " + a5, new Object[0]);
            return a5;
        } catch (Throwable unused) {
            return this.f56809e.httpGetNew(str, hashMap, hashMap2, this.f56810f);
        }
    }

    public <T> T requestWithoutEncode(boolean z4, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z5) throws Throwable {
        return (T) a(z4, hashMap, a(hashMap2), str, true, false, z5);
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f56811g = threadPoolExecutor;
    }

    public NetCommunicator(int i4, String str, String str2, NetworkHelper.NetworkTimeOut networkTimeOut) {
        this.f56808d = new MobRSA(i4);
        this.f56806b = new BigInteger(str, 16);
        this.f56807c = new BigInteger(str2, 16);
        this.f56809e = new NetworkHelper();
        if (networkTimeOut != null) {
            this.f56810f = networkTimeOut;
        } else {
            NetworkHelper.NetworkTimeOut networkTimeOut2 = new NetworkHelper.NetworkTimeOut();
            this.f56810f = networkTimeOut2;
            networkTimeOut2.readTimout = 30000;
            networkTimeOut2.connectionTimeout = 5000;
        }
        this.f56811g = f56805a;
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z4, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z4, callback);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z4) throws Throwable {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z4);
    }

    private String a(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return "{}";
        }
        String fromHashMap = HashonHelper.fromHashMap(hashMap);
        return fromHashMap.length() == 0 ? "{}" : fromHashMap;
    }

    public <T> void request(final boolean z4, final HashMap<String, String> hashMap, final HashMap<String, Object> hashMap2, final String str, final boolean z5, final Callback<T> callback) {
        this.f56811g.execute(new i() { // from class: com.mob.tools.network.NetCommunicator.1
            @Override // com.mob.tools.utils.i
            public void a() {
                try {
                    final Object requestSynchronized = NetCommunicator.this.requestSynchronized(z4, hashMap, hashMap2, str, z5);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultOk(requestSynchronized);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultError(th);
                                return false;
                            }
                        });
                    }
                }
            }
        });
    }

    public <T> T requestSynchronized(String str, String str2, boolean z4) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z4);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z4) throws Throwable {
        return (T) requestSynchronized(true, hashMap, str, str2, z4);
    }

    private <T> T a(boolean z4, HashMap<String, String> hashMap, String str, String str2, boolean z5, boolean z6, boolean z7) throws Throwable {
        byte[] c5 = v.c();
        byte[] a5 = a(c5, str, z5);
        boolean z8 = true;
        String[] strArr = new String[1];
        HttpResponseCallback a6 = a(c5, strArr, z7);
        if (z6) {
            String encodeToString = Base64.encodeToString(a5, 2);
            HashMap<String, String> a7 = a(z4, hashMap, str, encodeToString.getBytes("utf-8").length);
            StringPart stringPart = new StringPart();
            stringPart.append(encodeToString);
            NLog mobLog = MobLog.getInstance();
            mobLog.d(">>>  request(" + str2 + "): " + str + "\nheader = " + a7.toString(), new Object[0]);
            try {
                a.a((String) null);
            } catch (Throwable unused) {
                z8 = false;
            }
            if (z8) {
                a.a(false, str2, a7, stringPart, -1, a6, this.f56810f);
            } else {
                this.f56809e.rawPost(str2, a7, stringPart, -1, a6, this.f56810f);
            }
        } else {
            HashMap<String, String> a8 = a(z4, hashMap, str, -1);
            NLog mobLog2 = MobLog.getInstance();
            mobLog2.d(">>>  request(" + str2 + "): " + str + "\nheader = " + a8.toString(), new Object[0]);
            try {
                a.a((String) null);
            } catch (Throwable unused2) {
                z8 = false;
            }
            if (z8) {
                a.a(false, str2, a8, a5, -1, a6, this.f56810f);
            } else {
                this.f56809e.httpPostWithBytes(str2, a5, a8, -1, a6, this.f56810f);
            }
        }
        if (strArr[0] != null) {
            NLog mobLog3 = MobLog.getInstance();
            mobLog3.d(">>> response(" + str2 + "): " + strArr[0], new Object[0]);
            if (z7) {
                return (T) a(strArr[0]);
            }
            return (T) strArr[0];
        }
        return null;
    }

    public <T> T requestSynchronized(boolean z4, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z5) throws Throwable {
        return (T) a(z4, hashMap, a(hashMap2), str, z5, true, true);
    }

    public <T> T requestSynchronized(boolean z4, HashMap<String, String> hashMap, String str, String str2, boolean z5) throws Throwable {
        return (T) a(z4, hashMap, str, str2, z5, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] a(byte[] bArr, String str, boolean z4) throws Throwable {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        GZIPOutputStream gZIPOutputStream;
        DataOutputStream dataOutputStream = null;
        if (z4) {
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(gZIPOutputStream);
                        try {
                            bufferedOutputStream.write(str.getBytes("utf-8"));
                            bufferedOutputStream.flush();
                            v.a(bufferedOutputStream, gZIPOutputStream, byteArrayOutputStream2);
                            bytes = byteArrayOutputStream2.toByteArray();
                        } catch (Throwable th) {
                            th = th;
                            dataOutputStream = bufferedOutputStream;
                            v.a(dataOutputStream, gZIPOutputStream, byteArrayOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream2 = null;
                gZIPOutputStream = null;
            }
        } else {
            bytes = str.getBytes("utf-8");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                try {
                    byte[] encode = this.f56808d.encode(bArr, this.f56806b, this.f56807c);
                    dataOutputStream2.writeInt(encode.length);
                    dataOutputStream2.write(encode);
                    byte[] AES128Encode = Data.AES128Encode(bArr, bytes);
                    dataOutputStream2.writeInt(AES128Encode.length);
                    dataOutputStream2.write(AES128Encode);
                    dataOutputStream2.flush();
                    v.a(dataOutputStream2, byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = dataOutputStream2;
                    v.a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
        }
    }

    private HashMap<String, String> a(boolean z4, HashMap<String, String> hashMap, String str, int i4) throws Throwable {
        HashMap<String, String> hashMap2;
        if (!z4) {
            hashMap2 = null;
        } else if (i4 > 0) {
            hashMap2 = a(str, i4);
        } else {
            hashMap2 = getCommonDefaultHeaders();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return hashMap2;
    }

    private HashMap<String, String> a(String str, int i4) throws Throwable {
        HashMap<String, String> commonDefaultHeaders = getCommonDefaultHeaders();
        String b5 = C0811r.b("004Yehchdi:d");
        commonDefaultHeaders.put(b5, Data.MD5(str + MobSDK.getAppSecret()));
        commonDefaultHeaders.put(C0811r.b("014.dccj)dhedh)gjedLedIdiGhg"), String.valueOf(i4));
        return commonDefaultHeaders;
    }

    private HttpResponseCallback a(final byte[] bArr, final String[] strArr, final boolean z4) {
        return new HttpResponseCallback() { // from class: com.mob.tools.network.NetCommunicator.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStream inputStream;
                int responseCode = httpConnection.getResponseCode();
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    inputStream = responseCode == 200 ? httpConnection.getInputStream() : httpConnection.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            for (int read = inputStream.read(bArr2); read != -1; read = inputStream.read(bArr2)) {
                                byteArrayOutputStream2.write(bArr2, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            if (responseCode == 200) {
                                if (z4) {
                                    long a5 = NetCommunicator.this.a(httpConnection);
                                    if (a5 != -1 && a5 == byteArray.length) {
                                        strArr[0] = NetCommunicator.this.a(bArr, byteArray);
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put(C0811r.b("010ghhi5dk*hchBcfeh"), Integer.valueOf(responseCode));
                                        hashMap.put(C0811r.b("006%ehKhchMcfeh"), -2);
                                        hashMap.put(C0811r.b("005eOcicicjci"), "Illegal content length");
                                        throw new NetworkError(HashonHelper.fromHashMap(hashMap));
                                    }
                                } else {
                                    strArr[0] = new String(byteArray, "utf-8");
                                }
                                v.a(byteArrayOutputStream2, inputStream);
                                return;
                            }
                            HashMap fromJson = HashonHelper.fromJson(new String(byteArray, "utf-8"));
                            fromJson.put(C0811r.b("010ghhi@dkChchJcfeh"), Integer.valueOf(responseCode));
                            throw new NetworkError(HashonHelper.fromHashMap(fromJson));
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            v.a(byteArrayOutputStream, inputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(HttpConnection httpConnection) throws Throwable {
        List<String> a5 = a(httpConnection, C0811r.b("014Mdccj8dhedh'gjed8edZdiFhg"));
        if (a5 == null || a5.size() <= 0) {
            return -1L;
        }
        return Long.parseLong(a5.get(0));
    }

    private List<String> a(HttpConnection httpConnection, String str) throws Throwable {
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) {
            return null;
        }
        for (String str2 : headerFields.keySet()) {
            if (str2 != null && str2.equals(str)) {
                return headerFields.get(str2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(byte[] bArr, byte[] bArr2) throws Throwable {
        return new String(Data.AES128Decode(bArr, Base64.decode(bArr2, 2)), "utf-8");
    }

    private Object a(String str) throws Throwable {
        if (str != null) {
            HashMap fromJson = HashonHelper.fromJson(str.trim());
            if (!fromJson.isEmpty()) {
                Object obj = fromJson.get(C0811r.b("003]ci3e]eh"));
                return obj == null ? fromJson.get(C0811r.b("004Mcb8chc")) : obj;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(C0811r.b("0064eh hch8cfeh"), -1);
            hashMap.put(C0811r.b("005e;cicicjci"), "RS is empty");
            throw new NetworkError(HashonHelper.fromHashMap(hashMap));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C0811r.b("006.ehVhch>cfeh"), -1);
        hashMap2.put(C0811r.b("005e1cicicjci"), "RS is empty");
        throw new NetworkError(HashonHelper.fromHashMap(hashMap2));
    }
}
