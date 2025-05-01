package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vv.vv.vv.vv.a;
import com.bykv.vv.vv.vv.vv.b;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
/* loaded from: classes2.dex */
public class n extends com.bytedance.sdk.openadsdk.api.m implements OnItemClickListener {
    public n(EventListener eventListener) {
        this.vv = eventListener;
    }

    @Override // com.ss.android.download.api.config.OnItemClickListener
    public void onItemClick(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        vv(ValueSetConstants.VALUE_ON_ITEM_CLICK, vv() ? null : b.b().d(a.b().h(ValueSetConstants.VALUE_DOWNLOAD_MODEL, new p(downloadModel)).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG, new m(downloadEventConfig)).h(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER, new vv(downloadController)).a()).a());
    }
}
