package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vv.vv.vv.vv.a;
import com.bykv.vv.vv.vv.vv.b;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
/* loaded from: classes2.dex */
public class u extends com.bytedance.sdk.openadsdk.api.m implements IDownloadButtonClickListener {
    public u(EventListener eventListener) {
        this.vv = eventListener;
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleComplianceDialog(boolean z4) {
        vv(ValueSetConstants.VALUE_HANDLE_COMPLIANCE_DIALOG, vv() ? null : b.b().d(a.b().j(ValueSetConstants.VALUE_HANDLE_COMPLIANCE_DIALOG_SHOULD_SHOW, z4).a()).a());
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleMarketFailedComplianceDialog() {
        vv(ValueSetConstants.VALUE_HANDLE_MARKET_FAILED_COMPLIANCE_DIALOG);
    }
}
