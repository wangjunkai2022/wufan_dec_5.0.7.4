package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;
/* loaded from: classes6.dex */
public class PageConfigManger {
    public static final String APM_FPSPERF_COLLECT_INTERVAL = "apm_pageperf_collect_interval";
    public static final String APM_FPSPERF_COLLECT_INTERVAL_TOGETHER = "apm_pageperf_collect_interval_together";
    public static final String APM_FPSPERF_COLLECT_MAX_PERIOD_SEC = "apm_pageperf_collect_max_period_sec";

    /* renamed from: b  reason: collision with root package name */
    private Context f64642b;

    /* renamed from: c  reason: collision with root package name */
    private EfsReporter f64643c;

    /* renamed from: d  reason: collision with root package name */
    private int f64644d;

    /* renamed from: f  reason: collision with root package name */
    private int f64646f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f64647g;

    /* renamed from: a  reason: collision with root package name */
    private final String f64641a = "PageConfigManager";

    /* renamed from: e  reason: collision with root package name */
    private final int f64645e = 0;

    public PageConfigManger(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.f64644d = 100;
        this.f64647g = false;
        Context applicationContext = context.getApplicationContext();
        this.f64642b = applicationContext;
        this.f64643c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_page", 0);
        if (sharedPreferences != null) {
            this.f64646f = sharedPreferences.getInt("apm_pageperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f64642b.getSharedPreferences("efs_page", 0);
        int i4 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_pageperf_sampling_rate", -1) : -1;
        this.f64643c.getAllSdkConfig(new String[]{"apm_pageperf_sampling_rate", APM_FPSPERF_COLLECT_INTERVAL, APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, APM_FPSPERF_COLLECT_MAX_PERIOD_SEC}, new IConfigCallback() { // from class: com.umeng.pagesdk.PageConfigManger.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor edit6;
                try {
                    SharedPreferences sharedPreferences3 = PageConfigManger.this.f64642b.getSharedPreferences("efs_page", 0);
                    if (sharedPreferences3 == null || (edit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_pageperf_sampling_rate");
                    if (obj != null) {
                        edit6.putInt("apm_pageperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL);
                    if (obj2 != null) {
                        edit6.putFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, Float.parseFloat(obj2.toString()) * 1000.0f);
                    }
                    Object obj3 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER);
                    if (obj3 != null) {
                        edit6.putInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, Integer.parseInt(obj3.toString()));
                    }
                    Object obj4 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC);
                    if (obj4 != null) {
                        edit6.putLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, Long.parseLong(obj4.toString()) * 1000);
                    }
                    edit6.commit();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i4 != -1) {
            this.f64644d = i4;
        }
        boolean z4 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f64642b.getSharedPreferences("efs_page", 0);
            long j4 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z5 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i5 = this.f64644d;
            if (i5 == 0) {
                if (z5 && sharedPreferences3 != null && (edit5 = sharedPreferences3.edit()) != null) {
                    edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    edit5.commit();
                }
                if (j4 != 0 && sharedPreferences3 != null && (edit4 = sharedPreferences3.edit()) != null) {
                    edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    edit4.commit();
                }
            } else {
                boolean z6 = i5 != this.f64646f;
                Long valueOf = Long.valueOf(j4);
                int i6 = this.f64644d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (z5 && valueOf3.longValue() < 86400000 && !z6) {
                    boolean z7 = PageManger.isDebug;
                } else if (valueOf3.longValue() >= 86400000 || z6) {
                    if (i6 != 0 && (i6 == 100 || new Random().nextInt(100) <= i6)) {
                        boolean z8 = PageManger.isDebug;
                    } else {
                        boolean z9 = PageManger.isDebug;
                        z4 = false;
                    }
                    SharedPreferences sharedPreferences4 = this.f64642b.getSharedPreferences("efs_page", 0);
                    if (sharedPreferences4 != null && (edit3 = sharedPreferences4.edit()) != null) {
                        edit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z4);
                        edit3.commit();
                    }
                    if (sharedPreferences4 != null && (edit2 = sharedPreferences4.edit()) != null) {
                        edit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                        edit2.commit();
                    }
                } else {
                    boolean z10 = PageManger.isDebug;
                }
            }
            z4 = false;
        }
        this.f64647g = z4;
        SharedPreferences sharedPreferences5 = this.f64642b.getSharedPreferences("efs_page", 0);
        if (sharedPreferences5 == null || (edit = sharedPreferences5.edit()) == null) {
            return;
        }
        edit.putInt("apm_pageperf_sampling_rate_last", this.f64644d);
        edit.commit();
    }

    public boolean enableTracer() {
        return this.f64647g;
    }
}
