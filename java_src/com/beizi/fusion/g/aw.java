package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.model.TaskBean;
import java.util.List;
/* compiled from: TaskRunnable.java */
/* loaded from: classes2.dex */
public class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static String f6946a = "TaskRunnable";

    /* renamed from: b  reason: collision with root package name */
    private TaskBean.BackTaskArrayBean f6947b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6948c;

    public aw(Context context, TaskBean.BackTaskArrayBean backTaskArrayBean) {
        this.f6948c = context;
        this.f6947b = backTaskArrayBean;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6947b != null) {
            for (int i4 = 0; i4 < this.f6947b.getRepeatCount(); i4++) {
                if (this.f6947b.getMethod().equals("GET") && !TextUtils.isEmpty(this.f6947b.getContentUrl())) {
                    try {
                        com.beizi.fusion.b.b bVar = null;
                        ab.a(au.a(this.f6948c, this.f6947b.getContentUrl(), null), this.f6947b.getUserAgent());
                        Thread.sleep(this.f6947b.getSleepTime());
                        List<String> report = this.f6947b.getReport();
                        if (report != null && report.size() > 0) {
                            int i5 = 0;
                            while (i5 < report.size()) {
                                if (!TextUtils.isEmpty(report.get(i5))) {
                                    if (ab.a(au.a(this.f6948c, report.get(i5), bVar), this.f6947b.getUserAgent()) != null) {
                                        com.beizi.fusion.b.c.a(this.f6948c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "520.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                                    } else {
                                        com.beizi.fusion.b.c.a(this.f6948c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "520.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                                    }
                                    Thread.sleep(this.f6947b.getSleepTime());
                                }
                                i5++;
                                bVar = null;
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        com.beizi.fusion.b.c.a(this.f6948c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                    }
                }
            }
            com.beizi.fusion.b.c.a(this.f6948c).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "510.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        }
    }
}
