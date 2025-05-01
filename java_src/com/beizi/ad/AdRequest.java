package com.beizi.ad;

import android.os.Bundle;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.p;
import java.util.Date;
import java.util.Set;
/* loaded from: classes2.dex */
public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = com.beizi.ad.internal.network.a.f6069b;
    public static final int ERROR_CODE_AD_CACHE_FAILED = 6;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_AD_NOT_AVAILABLE = 3;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NOT_READY_TO_REQUEST = 4;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_SUCCESS = -1;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int INVALID_DISPLAY = 5;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: a  reason: collision with root package name */
    private final a.C0179a f5157a;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final a.C0179a mImpl;

        public Builder() {
            a.C0179a c0179a = new a.C0179a();
            this.mImpl = c0179a;
            c0179a.b(AdRequest.DEVICE_ID_EMULATOR);
        }

        public Builder addKeyword(String str) {
            this.mImpl.a(str);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends com.beizi.ad.b.b> cls, Bundle bundle) {
            this.mImpl.a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.mImpl.b(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date) {
            this.mImpl.a(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            p.a(str, (Object) "Content URL must be non-null.");
            p.a(str, (Object) "Content URL must be non-empty.");
            p.a(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.mImpl.c(str);
            return this;
        }

        public Builder setGender(int i4) {
            this.mImpl.a(i4);
            return this;
        }

        public Builder setIsDesignedForFamilies(boolean z4) {
            this.mImpl.b(z4);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.mImpl.d(str);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z4) {
            this.mImpl.a(z4);
            return this;
        }
    }

    public Date getBirthday() {
        return this.f5157a.a();
    }

    public String getContentUrl() {
        return this.f5157a.b();
    }

    public int getGender() {
        return this.f5157a.c();
    }

    public Set<String> getKeywords() {
        return this.f5157a.d();
    }

    public <T> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f5157a.a((Class<? extends com.beizi.ad.b.b>) cls);
    }

    public a.C0179a impl() {
        return this.f5157a;
    }

    private AdRequest(Builder builder) {
        this.f5157a = builder.mImpl;
    }
}
