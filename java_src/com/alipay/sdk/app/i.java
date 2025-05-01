package com.alipay.sdk.app;

import com.kwad.library.solder.lib.ext.PluginError;
import com.qq.e.comm.constants.ErrorCode;
/* loaded from: classes2.dex */
public enum i {
    SUCCEEDED(ErrorCode.PrivateError.LOAD_TIME_OUT, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(PluginError.ERROR_BUILD_REMOTE_PLUGIN_INFO, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");
    

    /* renamed from: h  reason: collision with root package name */
    private int f4722h;

    /* renamed from: i  reason: collision with root package name */
    private String f4723i;

    i(int i4, String str) {
        this.f4722h = i4;
        this.f4723i = str;
    }

    private void b(int i4) {
        this.f4722h = i4;
    }

    public final int a() {
        return this.f4722h;
    }

    private void a(String str) {
        this.f4723i = str;
    }

    public final String b() {
        return this.f4723i;
    }

    public static i a(int i4) {
        if (i4 != 4001) {
            if (i4 != 5000) {
                if (i4 != 8000) {
                    if (i4 != 9000) {
                        if (i4 != 6001) {
                            if (i4 != 6002) {
                                return FAILED;
                            }
                            return NETWORK_ERROR;
                        }
                        return CANCELED;
                    }
                    return SUCCEEDED;
                }
                return PAY_WAITTING;
            }
            return DOUBLE_REQUEST;
        }
        return PARAMS_ERROR;
    }
}
