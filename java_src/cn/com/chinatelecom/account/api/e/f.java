package cn.com.chinatelecom.account.api.e;

import android.content.Context;
import cn.com.chinatelecom.account.api.CtAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f703a = "f";

    /* renamed from: b  reason: collision with root package name */
    private static int f704b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, e> f705c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static List<e> f706d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static e f707e = null;

    public static synchronized e a(String str) {
        e eVar;
        synchronized (f.class) {
            try {
                eVar = f705c.containsKey(str) ? f705c.get(str) : null;
                if (eVar == null) {
                    eVar = new e(str);
                    f705c.put(str, eVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return new e(str);
            }
        }
        return eVar;
    }

    public static void a(Context context, String str) {
        cn.com.chinatelecom.account.a.c.a(context, str);
    }

    public static synchronized void a(String str, JSONObject jSONObject, String str2) {
        synchronized (f.class) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (f705c.containsKey(str)) {
                f705c.get(str).g(str2);
                return;
            }
            if (f706d.size() > 0) {
                for (e eVar : f706d) {
                    if (eVar.a() != null && eVar.a().equals(str) && jSONObject != null) {
                        jSONObject.remove("data");
                        eVar.g(jSONObject.toString());
                        eVar.g(str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (f.class) {
                e eVar = f707e;
                if (eVar != null) {
                    arrayList.add(eVar.toString());
                    f707e = null;
                }
                for (e eVar2 : f706d) {
                    arrayList.add(eVar2.toString());
                }
                f704b = 0;
                f706d.clear();
            }
            if (arrayList.isEmpty()) {
                return;
            }
            cn.com.chinatelecom.account.a.c.a(context, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized void b(String str) {
        synchronized (f.class) {
            try {
                if (f705c.containsKey(str)) {
                    e eVar = f705c.get(str);
                    f707e = eVar;
                    eVar.b();
                    f705c.remove(str);
                }
            } finally {
            }
        }
    }

    public static void b(String str, JSONObject jSONObject, String str2) {
        try {
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("msg");
            if (optInt == 0) {
                a(str).a(optInt).e(optString);
            } else {
                a(str).a(optInt).e(optString).d(str2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void c(String str) {
        try {
            synchronized (f.class) {
                if (f705c.containsKey(str)) {
                    e eVar = f705c.get(str);
                    eVar.b();
                    f706d.add(eVar);
                    f705c.remove(str);
                }
                if (f704b != 1 && !f706d.isEmpty()) {
                    f704b = 1;
                    new Timer().schedule(new TimerTask() { // from class: cn.com.chinatelecom.account.api.e.f.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            f.b(CtAuth.mContext);
                        }
                    }, 8000L);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
