package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.model.TaskBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: AppLinkRunnable.java */
/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static String f6954a = "AppLinkRunnable";

    /* renamed from: b  reason: collision with root package name */
    private TaskBean.BackTaskArrayBean f6955b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6956c;

    public e(Context context, TaskBean.BackTaskArrayBean backTaskArrayBean) {
        this.f6956c = context;
        this.f6955b = backTaskArrayBean;
    }

    private void a() {
        int i4;
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = new ArrayList();
            List<TaskBean.BackTaskArrayBean.AppLinkBean> apps = this.f6955b.getApps();
            if (apps == null || apps.size() <= 0) {
                return;
            }
            Iterator<TaskBean.BackTaskArrayBean.AppLinkBean> it2 = apps.iterator();
            while (true) {
                i4 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                TaskBean.BackTaskArrayBean.AppLinkBean next = it2.next();
                String valueOf = av.a(this.f6956c, next.getTestLink()) ? String.valueOf(1) : String.valueOf(0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appLinkId", next.getAppLinkId());
                jSONObject.put("isLink", valueOf);
                arrayList2.add(jSONObject.toString());
            }
            List<String> report = this.f6955b.getReport();
            if (report == null || report.size() <= 0) {
                return;
            }
            while (i4 < report.size()) {
                if (TextUtils.isEmpty(report.get(i4))) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    com.beizi.fusion.b.c.a(this.f6956c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "590.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), "", arrayList2.toString(), report.get(i4), false));
                }
                i4++;
                arrayList2 = arrayList;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6955b != null) {
            try {
                if (System.currentTimeMillis() - av.p(this.f6956c).longValue() < 86400000) {
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            for (int i4 = 0; i4 < this.f6955b.getRepeatCount(); i4++) {
                if (this.f6955b.getMethod().equalsIgnoreCase("GET")) {
                    try {
                        a();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        com.beizi.fusion.b.c.a(this.f6956c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                    }
                }
            }
            com.beizi.fusion.b.c.a(this.f6956c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        }
    }
}
