package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.util.f;
import com.alipay.sdk.util.j;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class PayTask {

    /* renamed from: g  reason: collision with root package name */
    static final Object f4689g = com.alipay.sdk.util.f.class;

    /* renamed from: h  reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f4690h = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private Activity f4691a;

    /* renamed from: b  reason: collision with root package name */
    private com.alipay.sdk.widget.a f4692b;

    /* renamed from: c  reason: collision with root package name */
    private String f4693c = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: d  reason: collision with root package name */
    private String f4694d = "mclient.alipay.com/service/rest.htm";

    /* renamed from: e  reason: collision with root package name */
    private String f4695e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* renamed from: f  reason: collision with root package name */
    private Map<String, a> f4696f = new HashMap();

    public PayTask(Activity activity) {
        this.f4691a = activity;
        m.b b5 = m.b.b();
        Activity activity2 = this.f4691a;
        com.alipay.sdk.data.c.a();
        b5.c(activity2);
        com.alipay.sdk.app.statistic.a.a(activity);
        this.f4692b = new com.alipay.sdk.widget.a(activity, com.alipay.sdk.widget.a.f4970e);
    }

    private f.a a() {
        return new g(this);
    }

    private String b(com.alipay.sdk.protocol.b bVar) {
        String[] strArr = bVar.f4924c;
        Intent intent = new Intent(this.f4691a, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        if (strArr.length == 2) {
            bundle.putString("cookie", strArr[1]);
        }
        intent.putExtras(bundle);
        this.f4691a.startActivity(intent);
        Object obj = f4689g;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return h.a();
            }
        }
        String str = h.f4713a;
        return TextUtils.isEmpty(str) ? h.a() : str;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("alipay_exterface_invoke_assign_sign")) {
            return str;
        }
        return str.replace("alipay_exterface_invoke_assign_sign=" + j.e("alipay_exterface_invoke_assign_sign=", m.a.f71490d, str), "").replace("sdk_start_time\\\":" + j.e("sdk_start_time\\\":", "\\\"", str), "");
    }

    private static String d(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    private static boolean f(boolean z4, boolean z5, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i4];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i4++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z5;
        } else if (z4) {
            sb.append(m.a.f71490d);
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(m.a.f71493g);
            return true;
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(m.a.f71493g);
            return true;
        }
    }

    private String g(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !str.contains("alipay_exterface_invoke_assign_sign")) {
            str2 = str;
        } else {
            str2 = str.replace("alipay_exterface_invoke_assign_sign=" + j.e("alipay_exterface_invoke_assign_sign=", m.a.f71490d, str), "").replace("sdk_start_time\\\":" + j.e("sdk_start_time\\\":", "\\\"", str), "");
        }
        String a5 = new m.a(this.f4691a).a(str);
        synchronized (f4690h) {
            if (!TextUtils.isEmpty(f4690h.get(str2))) {
                i a6 = i.a(i.DOUBLE_REQUEST.a());
                return h.b(a6.a(), a6.b(), "");
            }
            f4690h.put(str2, "true");
            if (a5.contains("paymethod=\"expressGateway\"")) {
                String i4 = i(a5);
                f4690h.remove(str2);
                return i4;
            } else if (j.l(this.f4691a)) {
                com.alipay.sdk.util.f fVar = new com.alipay.sdk.util.f(this.f4691a, new g(this));
                String c5 = fVar.c(a5);
                fVar.e();
                if (TextUtils.equals(c5, com.alipay.sdk.util.f.f4952h)) {
                    String i5 = i(a5);
                    f4690h.remove(str2);
                    return i5;
                } else if (TextUtils.isEmpty(c5)) {
                    String a7 = h.a();
                    f4690h.remove(str2);
                    return a7;
                } else {
                    f4690h.remove(str2);
                    return c5;
                }
            } else {
                String i6 = i(a5);
                f4690h.remove(str2);
                return i6;
            }
        }
    }

    private void h() {
        com.alipay.sdk.widget.a aVar = this.f4692b;
        if (aVar != null) {
            aVar.c();
        }
    }

    private String i(String str) {
        i iVar;
        h();
        try {
            try {
                List<com.alipay.sdk.protocol.b> b5 = com.alipay.sdk.protocol.b.b(new com.alipay.sdk.packet.impl.d().b(this.f4691a, str).a().optJSONObject(com.alipay.sdk.cons.c.f4840c).optJSONObject(com.alipay.sdk.cons.c.f4841d));
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    if (b5.get(i4).f4922a == com.alipay.sdk.protocol.a.Update) {
                        String[] strArr = b5.get(i4).f4924c;
                        if (strArr.length == 3 && TextUtils.equals(com.alipay.sdk.cons.b.f4830c, strArr[0])) {
                            Context context = m.b.b().f71504a;
                            n.b a5 = n.b.a();
                            if (!TextUtils.isEmpty(strArr[1]) && !TextUtils.isEmpty(strArr[2])) {
                                a5.f71677a = strArr[1];
                                a5.f71678b = strArr[2];
                                n.a aVar = new n.a(context);
                                try {
                                    aVar.j(com.alipay.sdk.util.b.a(context).b(), com.alipay.sdk.util.b.a(context).e(), a5.f71677a, a5.f71678b);
                                } catch (Exception unused) {
                                } catch (Throwable th) {
                                    aVar.close();
                                    throw th;
                                }
                                aVar.close();
                            }
                        }
                    }
                }
                j();
                for (int i5 = 0; i5 < b5.size(); i5++) {
                    if (b5.get(i5).f4922a == com.alipay.sdk.protocol.a.WapPay) {
                        String b6 = b(b5.get(i5));
                        j();
                        return b6;
                    }
                }
                j();
                iVar = null;
            } catch (IOException e5) {
                i a6 = i.a(i.NETWORK_ERROR.a());
                com.alipay.sdk.app.statistic.a.e("net", e5);
                j();
                iVar = a6;
            }
            if (iVar == null) {
                iVar = i.a(i.FAILED.a());
            }
            return h.b(iVar.a(), iVar.b(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.alipay.sdk.widget.a aVar = this.f4692b;
        if (aVar != null) {
            aVar.f();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x02ea
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public String getVersion() {
        return "15.0.8";
    }

    public synchronized com.alipay.sdk.util.a h5Pay(String str, boolean z4) {
        com.alipay.sdk.util.a aVar = new com.alipay.sdk.util.a();
        try {
            str.trim();
            String[] split = pay(str, z4).split(";");
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                String substring = str2.substring(0, str2.indexOf("={"));
                String str3 = substring + "={";
                hashMap.put(substring, str2.substring(str2.indexOf(str3) + str3.length(), str2.lastIndexOf("}")));
            }
            if (hashMap.containsKey("resultStatus")) {
                aVar.c((String) hashMap.get("resultStatus"));
            }
            if (hashMap.containsKey("callBackUrl")) {
                aVar.d((String) hashMap.get("callBackUrl"));
            } else if (hashMap.containsKey("result")) {
                String str4 = (String) hashMap.get("result");
                if (str4.length() > 15) {
                    a aVar2 = this.f4696f.get(str);
                    if (aVar2 != null) {
                        if (TextUtils.isEmpty(aVar2.f4698b)) {
                            aVar.d(aVar2.f4697a);
                        } else {
                            aVar.d(com.alipay.sdk.data.a.f().f4862b.replace("$OrderId$", aVar2.f4698b));
                        }
                        this.f4696f.remove(str);
                        return aVar;
                    }
                    String e5 = j.e("&callBackUrl=\"", m.a.f71493g, str4);
                    if (TextUtils.isEmpty(e5)) {
                        e5 = j.e("&call_back_url=\"", m.a.f71493g, str4);
                        if (TextUtils.isEmpty(e5)) {
                            e5 = j.e("&return_url=\"", m.a.f71493g, str4);
                            if (TextUtils.isEmpty(e5)) {
                                e5 = URLDecoder.decode(j.e("&return_url=", m.a.f71490d, str4), "utf-8");
                                if (TextUtils.isEmpty(e5)) {
                                    e5 = URLDecoder.decode(j.e("&callBackUrl=", m.a.f71490d, str4), "utf-8");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(e5)) {
                        e5 = com.alipay.sdk.data.a.f().f4862b;
                    }
                    aVar.d(URLDecoder.decode(e5, "utf-8"));
                } else {
                    a aVar3 = this.f4696f.get(str);
                    if (aVar3 != null) {
                        aVar.d(aVar3.f4697a);
                        this.f4696f.remove(str);
                        return aVar;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return aVar;
    }

    public synchronized String pay(String str, boolean z4) {
        String g4;
        if (z4) {
            h();
        }
        g4 = g(str);
        com.alipay.sdk.data.a.f().b(this.f4691a);
        j();
        com.alipay.sdk.app.statistic.a.b(this.f4691a, str);
        return g4;
    }

    /* loaded from: classes2.dex */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        String f4697a;

        /* renamed from: b  reason: collision with root package name */
        String f4698b;

        private a() {
            this.f4697a = "";
            this.f4698b = "";
        }

        private String a() {
            return this.f4697a;
        }

        private void b(String str) {
            this.f4697a = str;
        }

        private String c() {
            return this.f4698b;
        }

        private void d(String str) {
            this.f4698b = str;
        }

        /* synthetic */ a(PayTask payTask, byte b5) {
            this();
        }
    }
}
