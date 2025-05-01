package com.ss.android.socialbase.downloader.u;

import androidx.annotation.NonNull;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class t {

    /* renamed from: m  reason: collision with root package name */
    private int f61441m;
    private final JSONObject vv;

    private t(JSONObject jSONObject) {
        this.vv = jSONObject;
    }

    private int j() {
        return this.vv.optInt("url_balance", 2);
    }

    public long b() {
        long optInt = this.vv.optInt("read_timeout", -1);
        if (optInt >= 4000) {
            return optInt;
        }
        return -1L;
    }

    public int i() {
        return this.vv.optInt("buffer_count", 512);
    }

    public int jh() {
        return this.vv.optInt("ip_strategy", 0);
    }

    public long k() {
        long optInt = this.vv.optInt("connect_timeout", -1);
        if (optInt >= 2000) {
            return optInt;
        }
        return -1L;
    }

    public boolean m() {
        return j() > 0;
    }

    public long n() {
        long optInt = this.vv.optInt("segment_min_kb", 512) * 1024;
        if (optInt < 65536) {
            return 65536L;
        }
        return optInt;
    }

    public int o() {
        return this.vv.optInt("buffer_size", 8192);
    }

    public boolean p() {
        return j() == 1;
    }

    public float q() {
        return Math.min(Math.max(0.0f, (float) this.vv.optDouble("poor_speed_ratio", 0.0d)), 1.0f);
    }

    public long qv() {
        long optInt = this.vv.optInt("segment_min_init_mb", 10) * 1048576;
        if (optInt < 5242880) {
            return 5242880L;
        }
        return optInt;
    }

    public float r() {
        return (float) this.vv.optDouble("main_ratio", 0.0d);
    }

    public int t() {
        return this.vv.optInt("ratio_segment", 0);
    }

    public boolean u() {
        return this.vv.optInt("segment_mode", 1) == 0;
    }

    public void vv(int i4) {
        this.f61441m = m(i4);
    }

    public long wv() {
        long optInt = this.vv.optInt("segment_max_kb", 0) * 1048576;
        if (optInt < n()) {
            return -1L;
        }
        return optInt;
    }

    private int m(int i4) {
        int optInt = this.vv.optInt("thread_count", 4);
        if (optInt > 16) {
            optInt = 16;
        }
        if (optInt > 0) {
            return j() == 1 ? Math.min(optInt, i4) : optInt;
        } else if (j() > 0) {
            return i4;
        } else {
            return 1;
        }
    }

    public int vv() {
        return this.f61441m;
    }

    @NonNull
    public static t vv(@NonNull JSONObject jSONObject) {
        return new t(jSONObject);
    }
}
