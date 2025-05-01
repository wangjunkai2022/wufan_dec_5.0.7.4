package com.ta.utdid2.aid;

import android.content.Context;
import android.text.TextUtils;
import com.ta.utdid2.android.utils.d;
import com.ta.utdid2.android.utils.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f61985c = "com.ta.utdid2.aid.b";

    /* renamed from: d  reason: collision with root package name */
    private static final String f61986d = "http://hydra.alibaba.com/";

    /* renamed from: e  reason: collision with root package name */
    private static final String f61987e = "/get_aid/";

    /* renamed from: f  reason: collision with root package name */
    private static final String f61988f = "auth[token]=";

    /* renamed from: g  reason: collision with root package name */
    private static final String f61989g = "&type=";

    /* renamed from: h  reason: collision with root package name */
    private static final String f61990h = "&id=";

    /* renamed from: i  reason: collision with root package name */
    private static final String f61991i = "&aid=";

    /* renamed from: j  reason: collision with root package name */
    private static final String f61992j = "data";

    /* renamed from: k  reason: collision with root package name */
    private static final String f61993k = "aid";

    /* renamed from: l  reason: collision with root package name */
    private static final String f61994l = "action";

    /* renamed from: m  reason: collision with root package name */
    private static final String f61995m = "isError";

    /* renamed from: n  reason: collision with root package name */
    private static final String f61996n = "status";

    /* renamed from: o  reason: collision with root package name */
    private static final String f61997o = "utdid";

    /* renamed from: p  reason: collision with root package name */
    private static final String f61998p = "new";

    /* renamed from: q  reason: collision with root package name */
    private static final String f61999q = "changed";

    /* renamed from: r  reason: collision with root package name */
    private static final String f62000r = "unchanged";

    /* renamed from: s  reason: collision with root package name */
    private static final String f62001s = "true";

    /* renamed from: t  reason: collision with root package name */
    private static final String f62002t = "false";

    /* renamed from: u  reason: collision with root package name */
    private static final String f62003u = "200";

    /* renamed from: v  reason: collision with root package name */
    private static final String f62004v = "404";

    /* renamed from: w  reason: collision with root package name */
    private static final String f62005w = "401";

    /* renamed from: x  reason: collision with root package name */
    private static final int f62006x = 1000;

    /* renamed from: y  reason: collision with root package name */
    private static final int f62007y = 3000;

    /* renamed from: z  reason: collision with root package name */
    private static b f62008z;

    /* renamed from: a  reason: collision with root package name */
    private Context f62009a;

    /* renamed from: b  reason: collision with root package name */
    private Object f62010b = new Object();

    public b(Context context) {
        this.f62009a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2.has("action") && jSONObject2.has("aid")) {
                    String string = jSONObject2.getString("action");
                    return (string.equalsIgnoreCase(f61998p) || string.equalsIgnoreCase(f61999q)) ? jSONObject2.getString("aid") : str2;
                }
                return str2;
            } else if (jSONObject.has(f61995m) && jSONObject.has("status")) {
                String string2 = jSONObject.getString(f61995m);
                String string3 = jSONObject.getString("status");
                if (string2.equalsIgnoreCase(f62001s)) {
                    if (string3.equalsIgnoreCase(f62004v) || string3.equalsIgnoreCase(f62005w)) {
                        if (d.f62050b) {
                            new StringBuilder("remove the AID, status:").append(string3);
                        }
                        return "";
                    }
                    return str2;
                }
                return str2;
            } else {
                return str2;
            }
        } catch (JSONException e5) {
            e5.toString();
            return str2;
        } catch (Exception e6) {
            e6.toString();
            return str2;
        }
    }

    public static synchronized b f(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f62008z == null) {
                f62008z = new b(context);
            }
            bVar = f62008z;
        }
        return bVar;
    }

    private static String g(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        try {
            str3 = URLEncoder.encode(str3, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
        }
        sb.append(f61986d);
        sb.append(str);
        sb.append("/get_aid/?auth[token]=");
        sb.append(str2);
        sb.append("&type=utdid&id=");
        sb.append(str3);
        sb.append(f61991i);
        sb.append(str4);
        return sb.toString();
    }

    public String h(String str, String str2, String str3, String str4) {
        String g4 = g(str, str2, str3, str4);
        int i4 = f.g(this.f62009a) ? 3000 : 1000;
        if (d.f62050b) {
            StringBuilder sb = new StringBuilder("url:");
            sb.append(g4);
            sb.append("; timeout:");
            sb.append(i4);
        }
        a aVar = new a(new HttpPost(g4));
        aVar.start();
        try {
            synchronized (this.f62010b) {
                this.f62010b.wait(i4);
            }
        } catch (Exception e5) {
            e5.toString();
        }
        String a5 = aVar.a();
        if (d.f62050b) {
            new StringBuilder("mLine:").append(a5);
        }
        return e(a5, str4);
    }

    public void i(String str, String str2, String str3, String str4, a3.a aVar) {
        String g4 = g(str, str2, str3, str4);
        if (d.f62050b) {
            StringBuilder sb = new StringBuilder("url:");
            sb.append(g4);
            sb.append("; len:");
            sb.append(g4.length());
        }
        new a(new HttpPost(g4), aVar, str4, str, str2).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        HttpPost f62011b;

        /* renamed from: c  reason: collision with root package name */
        String f62012c;

        /* renamed from: d  reason: collision with root package name */
        a3.a f62013d;

        /* renamed from: e  reason: collision with root package name */
        String f62014e;

        /* renamed from: f  reason: collision with root package name */
        String f62015f;

        /* renamed from: g  reason: collision with root package name */
        String f62016g;

        public a(HttpPost httpPost) {
            this.f62012c = "";
            this.f62016g = "";
            this.f62011b = httpPost;
        }

        public String a() {
            return this.f62012c;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:56:0x005b). Please submit an issue!!! */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HttpResponse httpResponse;
            a3.a aVar = this.f62013d;
            if (aVar != null) {
                aVar.a(1000, this.f62014e);
            }
            BufferedReader bufferedReader = null;
            try {
                httpResponse = new DefaultHttpClient().execute(this.f62011b);
            } catch (Exception e5) {
                a3.a aVar2 = this.f62013d;
                if (aVar2 != null) {
                    aVar2.a(1002, this.f62014e);
                }
                String unused = b.f61985c;
                e5.toString();
                httpResponse = null;
            }
            try {
                if (httpResponse == null) {
                    String unused2 = b.f61985c;
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), Charset.forName("UTF-8")));
                }
            } catch (Exception e6) {
                a3.a aVar3 = this.f62013d;
                if (aVar3 != null) {
                    aVar3.a(1002, this.f62014e);
                }
                String unused3 = b.f61985c;
                e6.toString();
            }
            try {
                if (bufferedReader != null) {
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (d.f62050b) {
                            String unused4 = b.f61985c;
                        }
                        this.f62012c = readLine;
                    }
                } else {
                    String unused5 = b.f61985c;
                }
            } catch (Exception e7) {
                a3.a aVar4 = this.f62013d;
                if (aVar4 != null) {
                    aVar4.a(1002, this.f62014e);
                }
                String unused6 = b.f61985c;
                e7.toString();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    if (d.f62050b) {
                        String unused7 = b.f61985c;
                    }
                } catch (IOException e8) {
                    String unused8 = b.f61985c;
                    e8.toString();
                }
            }
            if (this.f62013d == null) {
                synchronized (b.this.f62010b) {
                    b.this.f62010b.notifyAll();
                }
                return;
            }
            String e9 = b.e(this.f62012c, this.f62014e);
            this.f62013d.a(1001, e9);
            c.d(b.this.f62009a, this.f62015f, e9, this.f62016g);
        }

        public a(HttpPost httpPost, a3.a aVar, String str, String str2, String str3) {
            this.f62012c = "";
            this.f62016g = "";
            this.f62011b = httpPost;
            this.f62013d = aVar;
            this.f62014e = str;
            this.f62015f = str2;
            this.f62016g = str3;
        }
    }
}
