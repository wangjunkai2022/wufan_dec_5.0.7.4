package com.aggmoread.sdk.client;

import android.app.Activity;
/* loaded from: classes2.dex */
public interface AMAdDownloadConfirmListener {

    /* loaded from: classes2.dex */
    public interface ApkInfoLoadListener {
        void onApkInfo(AMAdApkInfo aMAdApkInfo);

        void onApkInfoLoadFailed(AMError aMError);

        void onApkInfoLoading();
    }

    /* loaded from: classes2.dex */
    public interface Controller {
        void loadAppInfo(ApkInfoLoadListener apkInfoLoadListener);

        void onCancel();

        void onConfirm();
    }

    void onDownloadConfirm(Activity activity, int i4, Controller controller);
}
