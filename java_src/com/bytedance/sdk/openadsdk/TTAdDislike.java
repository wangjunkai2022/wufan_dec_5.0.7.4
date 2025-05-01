package com.bytedance.sdk.openadsdk;
/* loaded from: classes2.dex */
public interface TTAdDislike {

    /* loaded from: classes2.dex */
    public interface DislikeInteractionCallback {
        void onCancel();

        void onSelected(int i4, String str, boolean z4);

        void onShow();
    }

    boolean isShow();

    void resetDislikeStatus();

    void setDislikeInteractionCallback(DislikeInteractionCallback dislikeInteractionCallback);

    void setDislikeSource(String str);

    void showDislikeDialog();
}
