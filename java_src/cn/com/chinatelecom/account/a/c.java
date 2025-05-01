package cn.com.chinatelecom.account.a;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.e.g;
import java.net.URLEncoder;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c extends cn.com.chinatelecom.account.api.d.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f520b = "c";

    private static void a(Context context, int i4) {
        try {
            cn.com.chinatelecom.account.api.e.c.a(context, "key_c_l_l_v", i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(Context context, String str) {
        str.hashCode();
        a(context, !str.equals("OFF") ? !str.equals("ERROR") ? 0 : -1 : -2);
    }

    public static void a(Context context, List<String> list) {
        int b5 = b(context);
        if (b5 == -2) {
            return;
        }
        b(context, list, b5);
    }

    private static int b(Context context) {
        try {
            return cn.com.chinatelecom.account.api.e.c.b(context, "key_c_l_l_v", 0);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static String b(Context context, String str) {
        return a.a(context, g.c(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context, Queue<String> queue) {
        JSONArray jSONArray = new JSONArray();
        String jSONArray2 = jSONArray.toString();
        if (!queue.isEmpty()) {
            for (String str : queue) {
                try {
                    jSONArray.put(new JSONObject(str));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (jSONArray.length() <= 0) {
            return "";
        }
        String jSONArray3 = jSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray3)) {
            try {
                jSONArray2 = URLEncoder.encode(Helper.guulam(context, jSONArray3), "UTF-8");
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return b(context, jSONArray2);
    }

    private static void b(final Context context, final List<String> list, final int i4) {
        cn.com.chinatelecom.account.api.d.a.a(new Runnable() { // from class: cn.com.chinatelecom.account.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Queue c5 = c.c(context, list, i4);
                    if (c5.isEmpty()) {
                        return;
                    }
                    String b5 = c.b(context, c5);
                    JSONObject jSONObject = null;
                    int i5 = -1;
                    try {
                        if (!TextUtils.isEmpty(b5)) {
                            JSONObject jSONObject2 = new JSONObject(b5);
                            try {
                                i5 = jSONObject2.getInt("code");
                                jSONObject = jSONObject2;
                            } catch (Exception e5) {
                                e = e5;
                                jSONObject = jSONObject2;
                                e.printStackTrace();
                                if (jSONObject != null) {
                                }
                                c.b(context, c5, i4);
                                return;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                    if (jSONObject != null || i5 != 0) {
                        c.b(context, c5, i4);
                        return;
                    }
                    c.c(context);
                    c5.clear();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Queue<String> queue, int i4) {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (queue != null && !queue.isEmpty()) {
            int i5 = 0;
            for (String str2 : queue) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (i4 != -1 || jSONObject.getInt("rt") != 0) {
                    jSONArray.put(jSONObject);
                    i5++;
                    if (i5 > 10) {
                        break;
                    }
                }
            }
        }
        if (jSONArray.length() > 0) {
            try {
                str = Helper.eneulret(jSONArray.toString());
            } catch (Exception e6) {
                e6.printStackTrace();
                str = null;
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.a(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Queue<String> c(Context context, List<String> list, int i4) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (c.class) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            String a5 = b.a(context);
            if (!TextUtils.isEmpty(a5)) {
                try {
                    JSONArray jSONArray = new JSONArray(new String(Helper.dneulret(cn.com.chinatelecom.account.api.a.c.a(a5))));
                    int length = jSONArray.length();
                    for (int i5 = 0; i5 < length && i5 <= 10; i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        if (jSONObject != null) {
                            concurrentLinkedQueue.add(jSONObject.toString());
                        }
                    }
                    b.a(context, "");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (i4 == -1) {
                for (String str : list) {
                    try {
                        if (new JSONObject(str).getInt("rt") != 0) {
                            concurrentLinkedQueue.add(str);
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            } else if (i4 == 0) {
                concurrentLinkedQueue.addAll(list);
            }
            while (concurrentLinkedQueue.size() > 10) {
                concurrentLinkedQueue.poll();
            }
        }
        return concurrentLinkedQueue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        b.a(context, "");
    }
}
