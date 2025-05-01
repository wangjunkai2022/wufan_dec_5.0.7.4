package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.model.DownloadShortInfo;
/* loaded from: classes2.dex */
public class i implements Bridge {
    private DownloadShortInfo vv;

    public i(DownloadShortInfo downloadShortInfo) {
        this.vv = downloadShortInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        switch (i4) {
            case ValueSetConstants.VALUE_DOWNLOAD_SHORT_EQUALS /* 223700 */:
                return (T) Boolean.valueOf(equals(valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_SHORT_EQUALS_PARAMETER, Object.class)));
            case ValueSetConstants.VALUE_DOWNLOAD_SHORT_HASH_CODE /* 223701 */:
                hashCode();
                return null;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.hashCode();
        }
        return 0;
    }

    public long i() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.currentBytes;
        }
        return -1L;
    }

    public int m() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.status;
        }
        return -1;
    }

    public boolean n() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.onlyWifi;
        }
        return false;
    }

    public String o() {
        DownloadShortInfo downloadShortInfo = this.vv;
        return downloadShortInfo != null ? downloadShortInfo.fileName : "";
    }

    public long p() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.totalBytes;
        }
        return -1L;
    }

    public int u() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.failStatus;
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().g(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_ID, vv()).f(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_STATUS, m()).g(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_TOTAL_BYTES, p()).g(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_CURRENT_BYTES, i()).i(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_FILE_NAME, o()).f(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_FAIL_STATUS, u()).j(ValueSetConstants.VALUE_DOWNLOAD_SHORT_GET_ONLY_WIFI, n()).a();
    }

    public long vv() {
        DownloadShortInfo downloadShortInfo = this.vv;
        if (downloadShortInfo != null) {
            return downloadShortInfo.id;
        }
        return -1L;
    }
}
