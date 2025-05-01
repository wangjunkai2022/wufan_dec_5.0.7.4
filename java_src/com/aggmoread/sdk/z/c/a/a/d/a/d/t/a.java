package com.aggmoread.sdk.z.c.a.a.d.a.d.t;

import android.app.Activity;
import android.text.TextUtils;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.e.d;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.g;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.qq.e.comm.compliance.ApkDownloadComplianceInterface;
import com.qq.e.comm.compliance.DownloadConfirmCallBack;
import com.qq.e.comm.compliance.DownloadConfirmListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f3076a = "AMHTAGGDT";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3077b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0120a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f3078a;

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0121a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f3079b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ byte[] f3080c;

            RunnableC0121a(i iVar, byte[] bArr) {
                this.f3079b = iVar;
                this.f3080c = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.b(this.f3079b, this.f3080c, C0120a.this.f3078a);
            }
        }

        C0120a(b bVar) {
            this.f3078a = bVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.d.c
        public void a(int i4, byte[] bArr, i iVar) {
            n.a(new RunnableC0121a(iVar, bArr));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(com.aggmoread.sdk.z.c.a.a.c.d dVar);

        void a(com.aggmoread.sdk.z.c.a.a.d.a.b bVar);
    }

    /* loaded from: classes2.dex */
    static class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private com.aggmoread.sdk.z.c.a.a.d.a.c f3082a;

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0122a implements c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Method f3083a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object[] f3084b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Method f3085c;

            /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0123a implements b {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c.a f3086a;

                C0123a(C0122a c0122a, c.a aVar) {
                    this.f3086a = aVar;
                }

                @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.b
                public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
                    this.f3086a.a(dVar);
                }

                @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.b
                public void a(com.aggmoread.sdk.z.c.a.a.d.a.b bVar) {
                    this.f3086a.a(bVar);
                }
            }

            C0122a(c cVar, Method method, Object[] objArr, Method method2) {
                this.f3083a = method;
                this.f3084b = objArr;
                this.f3085c = method2;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.a.c.b
            public void a(c.a aVar) {
                C0123a c0123a = new C0123a(this, aVar);
                a.a(c0123a, ((String) this.f3084b[2]) + "&resType=api");
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.a.c.b
            public void onCancel() {
                try {
                    e.b(a.f3076a, "dl cancel");
                    this.f3085c.invoke(this.f3084b[3], new Object[0]);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                }
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.a.c.b
            public void onConfirm() {
                try {
                    e.b(a.f3076a, "dl confirm");
                    this.f3083a.invoke(this.f3084b[3], new Object[0]);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                }
            }
        }

        public c(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
            this.f3082a = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                e.a(a.f3076a, "mn = %s", method.getName());
                if ("onDownloadConfirm".equals(method.getName())) {
                    e.a(a.f3076a, " args[3] = %s", objArr[3]);
                    if (DownloadConfirmCallBack.class.isInstance(objArr[3])) {
                        Method method2 = DownloadConfirmCallBack.class.getMethod("onConfirm", new Class[0]);
                        Method method3 = DownloadConfirmCallBack.class.getMethod("onCancel", new Class[0]);
                        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = this.f3082a;
                        if (cVar != null) {
                            cVar.a((Activity) objArr[0], ((Integer) objArr[1]).intValue(), new C0122a(this, method2, objArr, method3));
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                String str = a.f3076a;
                e.b(str, "dce = " + e5);
            }
            Object invoke = method.invoke(this, objArr);
            e.a(a.f3076a, "t %s, r %s", this, invoke);
            return invoke;
        }
    }

    public static String a(Object obj) {
        try {
            if (ApkDownloadComplianceInterface.class.isInstance(obj)) {
                return String.valueOf(ApkDownloadComplianceInterface.class.getMethod("getApkInfoUrl", new Class[0]).invoke(obj, new Object[0]));
            }
            return null;
        } catch (Exception e5) {
            String str = f3076a;
            e.b(str, "not found cls e = " + e5);
            return null;
        }
    }

    public static void a(b bVar, String str) {
        if (bVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a(new i(1001002005, "请求地址为空"));
            return;
        }
        String str2 = f3076a;
        e.b(str2, "info = " + str);
        com.aggmoread.sdk.z.c.a.a.e.d.a(str, null, new C0120a(bVar));
    }

    public static void a(Object obj, com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        e.a(f3076a, "ADC s = %s, l = %s, is = %s", obj, cVar, Boolean.valueOf(f3077b));
        if (cVar != null) {
            try {
                if (ApkDownloadComplianceInterface.class.isInstance(obj)) {
                    ApkDownloadComplianceInterface.class.getMethod("setDownloadConfirmListener", DownloadConfirmListener.class).invoke(obj, Proxy.newProxyInstance(DownloadConfirmListener.class.getClassLoader(), new Class[]{DownloadConfirmListener.class}, new c(cVar)));
                }
            } catch (Exception e5) {
                e.a(f3076a, "set err = %s", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(i iVar, byte[] bArr, b bVar) {
        JSONArray jSONArray;
        String str;
        String str2 = ";";
        if (iVar != null) {
            String str3 = f3076a;
            e.b(str3, "onError er " + iVar);
            bVar.a(new i(1001002005, "请求失败！"));
            return;
        }
        try {
            String str4 = new String(bArr, "UTF-8");
            JSONObject jSONObject = new JSONObject(str4);
            e.c(str4, "CD");
            if (!jSONObject.has("data")) {
                e.b(f3076a, "res null!");
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String str5 = f3076a;
            e.b(str5, "response = " + jSONObject2.toString());
            String string = jSONObject2.getString(TTDownloadField.TT_APP_NAME);
            String string2 = jSONObject2.getString("authorName");
            long optLong = jSONObject2.optLong("apkPublishTime");
            long optLong2 = jSONObject2.optLong("fileSize");
            String string3 = jSONObject2.getString("privacyAgreement");
            String string4 = jSONObject2.getString(TTDownloadField.TT_VERSION_NAME);
            String string5 = jSONObject2.getString("iconUrl");
            if (TextUtils.isEmpty(string5)) {
                string5 = jSONObject2.getString("icon_url");
            }
            String str6 = string5;
            JSONArray optJSONArray = jSONObject2.optJSONArray("permissions");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int i4 = 0;
                while (i4 < optJSONArray.length()) {
                    String string6 = optJSONArray.getString(i4);
                    if (!TextUtils.isEmpty(string6)) {
                        if (string6.contains(str2)) {
                            String[] split = string6.split(str2);
                            if (split != null && split.length > 0) {
                                String str7 = f3076a;
                                jSONArray = optJSONArray;
                                StringBuilder sb = new StringBuilder();
                                str = str2;
                                sb.append("length = ");
                                sb.append(split.length);
                                e.b(str7, sb.toString());
                                for (int i5 = 0; i5 < split.length; i5++) {
                                    String str8 = f3076a;
                                    e.b(str8, "arrs item " + split[i5]);
                                    arrayList.add(split[i5]);
                                }
                            }
                        } else {
                            jSONArray = optJSONArray;
                            str = str2;
                            arrayList.add(string6);
                        }
                        i4++;
                        optJSONArray = jSONArray;
                        str2 = str;
                    }
                    jSONArray = optJSONArray;
                    str = str2;
                    i4++;
                    optJSONArray = jSONArray;
                    str2 = str;
                }
            }
            g.a(arrayList);
            bVar.a(new com.aggmoread.sdk.z.c.a.a.d.a.b(string, string2, string4, optLong2, optLong, string3, arrayList, str6));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
