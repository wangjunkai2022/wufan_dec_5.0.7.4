package com.bytedance.android.live.base.api.push;
/* loaded from: classes2.dex */
public interface PushInterceptor {

    /* loaded from: classes2.dex */
    public static class InterceptResult {
        public boolean intercept;
        public String interceptReason;

        public InterceptResult() {
        }

        public InterceptResult(boolean z4) {
            this(z4, "");
        }

        public InterceptResult(boolean z4, String str) {
            this.intercept = z4;
            this.interceptReason = "";
        }
    }

    InterceptResult intercept();
}
