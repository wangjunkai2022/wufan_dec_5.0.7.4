package com.tencent.cos.task;

import com.alipay.sdk.util.f;
/* loaded from: classes6.dex */
public enum TaskState {
    WAITING(0, "waitting"),
    SENDING(1, "sending"),
    FINISH(2, "finish"),
    SUCCEED(3, "succeed"),
    FAILED(4, f.f4952h),
    PAUSE(5, "pause"),
    CANCEL(6, "cancel"),
    RETRY(7, "retry"),
    DISABLE(8, "disable");
    
    private int code;
    private String desc;

    TaskState(int i4, String str) {
        this.code = i4;
        this.desc = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
