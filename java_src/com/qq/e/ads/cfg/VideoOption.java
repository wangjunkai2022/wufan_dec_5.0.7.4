package com.qq.e.ads.cfg;

import com.qq.e.comm.util.GDTLogger;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class VideoOption {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f59683a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59684b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59685c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f59686d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f59687e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f59688f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f59689g;

    /* renamed from: h  reason: collision with root package name */
    private final int f59690h;

    /* renamed from: i  reason: collision with root package name */
    private final int f59691i;

    /* loaded from: classes5.dex */
    public static final class AutoPlayPolicy {
        public static final int ALWAYS = 1;
        public static final int NEVER = 2;
        public static final int WIFI = 0;
    }

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private boolean f59692a = true;

        /* renamed from: b  reason: collision with root package name */
        private int f59693b = 1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f59694c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f59695d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f59696e = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f59697f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f59698g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f59699h;

        /* renamed from: i  reason: collision with root package name */
        private int f59700i;

        public VideoOption build() {
            return new VideoOption(this);
        }

        public Builder setAutoPlayMuted(boolean z4) {
            this.f59692a = z4;
            return this;
        }

        public Builder setAutoPlayPolicy(int i4) {
            if (i4 < 0 || i4 > 2) {
                i4 = 1;
                GDTLogger.e("setAutoPlayPolicy 设置失败，值只能为0到2之间的数值, 重置为 : 1");
            }
            this.f59693b = i4;
            return this;
        }

        @Deprecated
        public Builder setDetailPageMuted(boolean z4) {
            this.f59698g = z4;
            return this;
        }

        @Deprecated
        public Builder setEnableDetailPage(boolean z4) {
            this.f59696e = z4;
            return this;
        }

        public Builder setEnableUserControl(boolean z4) {
            this.f59697f = z4;
            return this;
        }

        public Builder setMaxVideoDuration(int i4) {
            this.f59699h = i4;
            return this;
        }

        public Builder setMinVideoDuration(int i4) {
            this.f59700i = i4;
            return this;
        }

        public Builder setNeedCoverImage(boolean z4) {
            this.f59695d = z4;
            return this;
        }

        public Builder setNeedProgressBar(boolean z4) {
            this.f59694c = z4;
            return this;
        }
    }

    private VideoOption(Builder builder) {
        this.f59683a = builder.f59692a;
        this.f59684b = builder.f59693b;
        this.f59685c = builder.f59694c;
        this.f59686d = builder.f59695d;
        this.f59687e = builder.f59696e;
        this.f59688f = builder.f59697f;
        this.f59689g = builder.f59698g;
        this.f59690h = builder.f59699h;
        this.f59691i = builder.f59700i;
    }

    public boolean getAutoPlayMuted() {
        return this.f59683a;
    }

    public int getAutoPlayPolicy() {
        return this.f59684b;
    }

    public int getMaxVideoDuration() {
        return this.f59690h;
    }

    public int getMinVideoDuration() {
        return this.f59691i;
    }

    public JSONObject getOptions() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("autoPlayMuted", Boolean.valueOf(this.f59683a));
            jSONObject.putOpt("autoPlayPolicy", Integer.valueOf(this.f59684b));
            jSONObject.putOpt("detailPageMuted", Boolean.valueOf(this.f59689g));
        } catch (Exception e5) {
            GDTLogger.d("Get video options error: " + e5.getMessage());
        }
        return jSONObject;
    }

    @Deprecated
    public boolean isDetailPageMuted() {
        return this.f59689g;
    }

    @Deprecated
    public boolean isEnableDetailPage() {
        return this.f59687e;
    }

    public boolean isEnableUserControl() {
        return this.f59688f;
    }

    public boolean isNeedCoverImage() {
        return this.f59686d;
    }

    public boolean isNeedProgressBar() {
        return this.f59685c;
    }
}
