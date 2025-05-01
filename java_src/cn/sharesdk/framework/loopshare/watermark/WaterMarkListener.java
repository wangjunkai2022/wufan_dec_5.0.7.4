package cn.sharesdk.framework.loopshare.watermark;
@Deprecated
/* loaded from: classes2.dex */
public interface WaterMarkListener {
    void onCancel();

    void onEnd(int i4);

    void onFailed(String str, int i4);

    void onProgress(int i4);

    void onStart();
}
