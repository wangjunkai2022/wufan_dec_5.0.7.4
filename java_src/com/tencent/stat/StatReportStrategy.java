package com.tencent.stat;
/* loaded from: classes6.dex */
public enum StatReportStrategy {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);
    

    /* renamed from: a  reason: collision with root package name */
    int f62863a;

    StatReportStrategy(int i4) {
        this.f62863a = i4;
    }

    public static StatReportStrategy getStatReportStrategy(int i4) {
        StatReportStrategy[] values;
        for (StatReportStrategy statReportStrategy : values()) {
            if (i4 == statReportStrategy.a()) {
                return statReportStrategy;
            }
        }
        return null;
    }

    public int a() {
        return this.f62863a;
    }
}
