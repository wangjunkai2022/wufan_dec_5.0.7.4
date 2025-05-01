package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.model.TaskBean;
import java.util.List;
/* compiled from: ClipUtil.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private static o f6996b;

    /* renamed from: a  reason: collision with root package name */
    private String f6997a = "ClipUtil";

    /* renamed from: c  reason: collision with root package name */
    private Context f6998c;

    private o(Context context) {
        this.f6998c = context.getApplicationContext();
    }

    public static o a(Context context) {
        if (f6996b == null) {
            synchronized (o.class) {
                if (f6996b == null) {
                    f6996b = new o(context);
                }
            }
        }
        return f6996b;
    }

    public void a(final TaskBean.BackTaskArrayBean backTaskArrayBean) {
        if (backTaskArrayBean != null && !TextUtils.isEmpty(backTaskArrayBean.getContentUrl())) {
            com.beizi.fusion.b.c.a(this.f6998c).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            final List<String> report = backTaskArrayBean.getReport();
            if (report == null || report.size() <= 0) {
                return;
            }
            h.b().e().execute(new Runnable() { // from class: com.beizi.fusion.g.o.1
                @Override // java.lang.Runnable
                public void run() {
                    for (int i4 = 0; i4 < report.size(); i4++) {
                        if (!TextUtils.isEmpty((CharSequence) report.get(i4))) {
                            if (ab.a(au.a(o.this.f6998c, (String) report.get(i4), null), backTaskArrayBean.getUserAgent()) != null) {
                                com.beizi.fusion.b.c.a(o.this.f6998c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "520.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                            } else {
                                com.beizi.fusion.b.c.a(o.this.f6998c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "520.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                            }
                            try {
                                Thread.sleep(backTaskArrayBean.getSleepTime());
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                }
            });
            return;
        }
        com.beizi.fusion.b.c.a(this.f6998c).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
    }
}
