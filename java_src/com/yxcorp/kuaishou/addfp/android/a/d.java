package com.yxcorp.kuaishou.addfp.android.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.yxcorp.kuaishou.addfp.android.b.g;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f68579e;

    /* renamed from: a  reason: collision with root package name */
    private e f68580a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap f68581b = new ConcurrentHashMap(10);

    /* renamed from: c  reason: collision with root package name */
    private Context f68582c;

    /* renamed from: d  reason: collision with root package name */
    private int f68583d;

    private d(Context context) {
        this.f68580a = null;
        this.f68583d = 0;
        try {
            this.f68582c = context;
            this.f68580a = new e(context);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f68583d = this.f68582c.getApplicationInfo().targetSdkVersion;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static d a(Context context) {
        if (f68579e == null) {
            synchronized (d.class) {
                if (f68579e == null) {
                    f68579e = new d(context);
                }
            }
        }
        return f68579e;
    }

    private String a(HashMap hashMap) {
        ObjectOutputStream objectOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(hashMap);
                String str = new String(Base64.encode(com.yxcorp.kuaishou.addfp.android.b.b.c(byteArrayOutputStream.toByteArray(), "20212102sjcudiab".getBytes()), 0));
                try {
                    objectOutputStream.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                            return "";
                        } catch (IOException unused2) {
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }

    public static void a(Context context, String str) {
        FileWriter fileWriter;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                File file = new File(com.yxcorp.kuaishou.addfp.android.b.b.a(context, false), new String(Base64.decode("Lm91a2R0ZnQ=", 0)));
                new File(file.getParent()).mkdirs();
                fileWriter = new FileWriter(file, false);
                try {
                    fileWriter.write(str);
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Throwable unused) {
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
            } catch (Throwable unused2) {
                fileWriter = null;
            }
        } catch (IOException unused3) {
        }
    }

    public synchronized Pair a() {
        byte[] bArr;
        if (this.f68581b != null) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty((String) this.f68581b.get("cache_e"))) {
                return Pair.create(Pair.create(Boolean.TRUE, sb.toString()), this.f68581b);
            }
        }
        this.f68581b.clear();
        String b5 = this.f68580a.b();
        if (!TextUtils.isEmpty(b5)) {
            try {
                bArr = Base64.decode(b5, 0);
            } catch (Throwable unused) {
                bArr = null;
            }
            if (bArr == null) {
                try {
                    bArr = Base64.decode(b5, 8);
                } catch (Throwable unused2) {
                }
            }
            JSONObject jSONObject = new JSONObject(new String(com.yxcorp.kuaishou.addfp.android.b.b.b(bArr, "20212102sjcudiab".getBytes())));
            this.f68581b.put("cache_e", jSONObject.optString("cache_e", ""));
            this.f68581b.put("cache_m", jSONObject.optString("cache_m", ""));
            this.f68581b.put("c_time", Long.toString(jSONObject.optLong("c_time", 0L)));
        }
        ConcurrentHashMap concurrentHashMap = this.f68581b;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty((String) this.f68581b.get("cache_e"))) {
                return Pair.create(Pair.create(Boolean.TRUE, sb2.toString()), this.f68581b);
            }
        }
        return Pair.create(Pair.create(Boolean.TRUE, "8"), null);
    }

    public String a(String str) {
        try {
            File file = new File(com.yxcorp.kuaishou.addfp.android.b.b.a(this.f68582c, false), new String(Base64.decode(str, 0)));
            if (!file.exists()) {
                return "";
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString().trim();
                }
                sb.append(readLine);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public synchronized void a(String str, String str2) {
        byte[] bArr;
        LinkedHashMap linkedHashMap = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f68581b.put("c_time", Long.toString(currentTimeMillis));
            this.f68581b.put("cache_e", str);
            this.f68581b.put("cache_m", str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("c_time", currentTimeMillis);
            jSONObject.put("cache_e", str);
            jSONObject.put("cache_m", str2);
            byte[] c5 = com.yxcorp.kuaishou.addfp.android.b.b.c(jSONObject.toString().getBytes(), "20212102sjcudiab".getBytes());
            try {
                bArr = Base64.encode(c5, 0);
            } catch (Throwable unused) {
                bArr = null;
            }
            if (bArr == null) {
                try {
                    bArr = Base64.encode(c5, 8);
                } catch (Throwable unused2) {
                }
            }
            if (bArr != null) {
                this.f68580a.a(new String(bArr));
            }
        } catch (Throwable unused3) {
        }
        try {
            String a5 = com.yxcorp.kuaishou.addfp.c.a.a.a(this.f68582c, "k_w_o_d_out_dtt");
            if (TextUtils.isEmpty(a5) && g.a(this.f68582c, new String[]{com.kuaishou.weapon.p0.g.f55589i, com.kuaishou.weapon.p0.g.f55590j})) {
                a5 = a("Lm91a2R0ZnQ=");
            }
            if (!TextUtils.isEmpty(a5) && (linkedHashMap = b(a5)) != null) {
                c cVar = b.f68573a;
                String a6 = cVar.a();
                if (!TextUtils.isEmpty(a6)) {
                    if (linkedHashMap.containsKey(a6)) {
                        linkedHashMap.remove(a6);
                    }
                    linkedHashMap.put(cVar.a(), str);
                }
            }
            if (linkedHashMap == null || linkedHashMap.size() == 0) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(b.f68573a.a(), str);
            }
            String a7 = a(linkedHashMap);
            if (!TextUtils.isEmpty(a7)) {
                try {
                    Settings.System.putString(this.f68582c.getContentResolver(), "k_w_o_d_out_dtt", a7);
                } catch (Throwable unused4) {
                }
                if (g.a(this.f68582c, new String[]{com.kuaishou.weapon.p0.g.f55589i, com.kuaishou.weapon.p0.g.f55590j})) {
                    a(this.f68582c, a7);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public LinkedHashMap b(String str) {
        Throwable th;
        ObjectInputStream objectInputStream = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(com.yxcorp.kuaishou.addfp.android.b.b.b(Base64.decode(str.getBytes(), 0), "20212102sjcudiab".getBytes())));
                try {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) objectInputStream2.readObject();
                    try {
                        objectInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return linkedHashMap;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = objectInputStream2;
                    try {
                        th.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return new LinkedHashMap();
                    } catch (Throwable th3) {
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return new LinkedHashMap();
    }

    public boolean b() {
        return this.f68583d >= 30;
    }
}
