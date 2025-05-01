package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56143a = s.a("002Sfcgc");

    /* renamed from: b  reason: collision with root package name */
    private static final String f56144b = s.a("0056dldkOjie");

    /* renamed from: c  reason: collision with root package name */
    private static final String f56145c = s.a("005'dldkUjZdc!e");

    /* renamed from: d  reason: collision with root package name */
    private static final String f56146d = s.a("016Bhfhejfhlhihhikhdhjfh8d5ffXcKdcefdi");

    /* renamed from: e  reason: collision with root package name */
    private static ac f56147e;

    /* renamed from: f  reason: collision with root package name */
    private String f56148f;

    /* renamed from: g  reason: collision with root package name */
    private Context f56149g = MobSDK.getContext();

    /* renamed from: h  reason: collision with root package name */
    private TreeMap<String, Object> f56150h;

    private ac() {
    }

    public static ac a() {
        if (f56147e == null) {
            synchronized (ac.class) {
                if (f56147e == null) {
                    f56147e = new ac();
                }
            }
        }
        return f56147e;
    }

    private String d() {
        this.f56150h = new TreeMap<>();
        String str = null;
        try {
            String e5 = e();
            boolean a5 = a(f());
            if (TextUtils.isEmpty(e5)) {
                str = a(this.f56150h);
            } else {
                NLog mobLog = MobLog.getInstance();
                mobLog.d("[%s] %s", f56143a, "tk status: " + a5);
                str = !a5 ? e5 : a(this.f56150h);
            }
            f56147e.f56148f = str;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return str;
    }

    private String e() {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        String str;
        DataInputStream dataInputStream2 = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f56149g, f56144b);
            if (!dataCacheFile.exists() || dataCacheFile.length() <= 0) {
                str = null;
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(dataCacheFile);
                try {
                    dataInputStream = new DataInputStream(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = null;
                }
                try {
                    str = dataInputStream.readUTF();
                    dataInputStream2 = dataInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MobLog.getInstance().d(th);
                        v.a(dataInputStream, fileInputStream);
                        return null;
                    } catch (Throwable th3) {
                        v.a(dataInputStream, fileInputStream);
                        throw th3;
                    }
                }
            }
            v.a(dataInputStream2, fileInputStream);
            return str;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
            fileInputStream = null;
        }
    }

    private HashMap<String, Object> f() {
        return a(f56146d, ResHelper.readFromFileNoCompress(ResHelper.getDataCacheFile(this.f56149g, f56145c)));
    }

    public String b() {
        if (TextUtils.isEmpty(this.f56148f)) {
            synchronized (ac.class) {
                if (TextUtils.isEmpty(this.f56148f)) {
                    return d();
                }
            }
        }
        return this.f56148f;
    }

    public String c() {
        String str = this.f56148f;
        return TextUtils.isEmpty(str) ? e() : str;
    }

    private boolean a(HashMap<String, Object> hashMap) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        DH.requester(MobSDK.getContext()).getDeviceKey().request(new DH.DHResponder() { // from class: com.mob.commons.ac.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                strArr[0] = dHResponse.getDeviceKey();
                countDownLatch.countDown();
            }
        });
        try {
            this.f56150h.put(s.a("007CefZdciOdkdjec"), DH.SyncMtd.getManufacturer());
            this.f56150h.put(s.a("005$dfdkdcNfg"), DH.SyncMtd.getModel());
            this.f56150h.put(s.a("006MfiecfiddMf,dj"), Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
            String str = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                this.f56150h.put(s.a("0086dc5fCdddiFcfFeedc"), str);
            }
            this.f56150h.put(s.a("004Gdcdgdidc"), e.a((MobProduct) null));
            String MD5 = Data.MD5(new JSONObject(this.f56150h).toString());
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put(s.a("010Vej!fefHdjYdg1hcdchi"), MD5);
            b(treeMap);
            if (hashMap == null || hashMap.isEmpty() || !MD5.equals((String) hashMap.get(s.a("010JejRfef djLdg)hcdchi")))) {
                return true;
            }
            MobLog.getInstance().d("[%s] %s", f56143a, "No changes");
            return false;
        } catch (Throwable th) {
            MobLog.getInstance().e(th);
            return false;
        }
    }

    private void b(String str) {
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f56149g, f56144b);
            if (dataCacheFile != null) {
                fileOutputStream = new FileOutputStream(dataCacheFile);
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    try {
                        dataOutputStream2.writeUTF(str);
                        dataOutputStream2.flush();
                        dataOutputStream = dataOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        try {
                            MobLog.getInstance().d(th);
                            v.a(dataOutputStream, fileOutputStream);
                            return;
                        } catch (Throwable th2) {
                            v.a(dataOutputStream, fileOutputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                fileOutputStream = null;
            }
            v.a(dataOutputStream, fileOutputStream);
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void b(TreeMap<String, Object> treeMap) {
        ResHelper.writeToFileNoCompress(ResHelper.getDataCacheFile(this.f56149g, f56145c), a(f56146d, treeMap));
    }

    private String a(TreeMap<String, Object> treeMap) {
        HashMap hashMap;
        String str = null;
        if (!b.c() || treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(s.a("007+ef%dciPdkdjec"), treeMap.get(s.a("007+ef%dciPdkdjec")));
            hashMap2.put(s.a("005!dfdkdcAfg"), treeMap.get(s.a("005!dfdkdcAfg")));
            hashMap2.put(s.a("006:fiecfidd=f?dj"), treeMap.get(s.a("006:fiecfidd=f?dj")));
            hashMap2.put(s.a("008;dc1f7dddiPcf-eedc"), treeMap.get(s.a("008;dc1f7dddiPcf-eedc")));
            hashMap2.put(s.a("0040dcdgdidc"), treeMap.get(s.a("0040dcdgdidc")));
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put(s.a("006djj;ehBfFec"), u.a());
            hashMap3.put("m", a(HashonHelper.fromHashMap(hashMap2)));
            HashMap<String, String> hashMap4 = new HashMap<>();
            hashMap4.put(s.a("013=ekfi?f djhkeedc:feiLdi9i0ec"), aa.c());
            hashMap4.put(s.a("004=dfdkdidc"), com.mob.tools.b.c.a(MobSDK.getContext()).d().ai());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            NetworkHelper networkHelper = new NetworkHelper();
            HashMap fromJson = HashonHelper.fromJson(networkHelper.httpPostNew(i.a().a("gclg") + s.a("007lKdk(jfeGdidc"), hashMap3, hashMap4, networkTimeOut));
            if (!"200".equals(String.valueOf(fromJson.get(s.a("004cHdkdcLf")))) || (hashMap = (HashMap) fromJson.get(s.a("004,dcQdid"))) == null) {
                return null;
            }
            String str2 = (String) hashMap.get(s.a("005i>dkeh3fe"));
            try {
                f56147e.f56148f = str2;
                b(str2);
                return str2;
            } catch (Throwable th) {
                th = th;
                str = str2;
                MobLog.getInstance().e(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        DataOutputStream dataOutputStream;
        byte[] c5 = v.c();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(gZIPOutputStream);
                    try {
                        bufferedOutputStream2.write(str.getBytes("utf-8"));
                        bufferedOutputStream2.flush();
                        v.a(bufferedOutputStream2, gZIPOutputStream, byteArrayOutputStream);
                        byte[] AES128Encode = Data.AES128Encode(c5, byteArrayOutputStream.toByteArray());
                        byte[] encode = new MobRSA(1024).encode(c5, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream2 = null;
                        }
                        try {
                            dataOutputStream.writeInt(encode.length);
                            dataOutputStream.write(encode);
                            dataOutputStream.writeInt(AES128Encode.length);
                            dataOutputStream.write(AES128Encode);
                            dataOutputStream.flush();
                            v.a(dataOutputStream, byteArrayOutputStream2);
                            return Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = dataOutputStream;
                            v.a(bufferedOutputStream, byteArrayOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = bufferedOutputStream2;
                        v.a(bufferedOutputStream, gZIPOutputStream, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                gZIPOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }

    private byte[] a(String str, TreeMap<String, Object> treeMap) {
        try {
            return Data.EncodeNoPadding(str, new JSONObject(treeMap).toString());
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return new HashMap<>();
        }
    }
}
