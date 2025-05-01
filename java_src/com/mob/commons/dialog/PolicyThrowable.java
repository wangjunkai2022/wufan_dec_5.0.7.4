package com.mob.commons.dialog;
@Deprecated
/* loaded from: classes5.dex */
public class PolicyThrowable extends Throwable {
    private int code;

    public PolicyThrowable() {
        super("Privacy policy is not accepted");
    }

    public int getCode() {
        return this.code;
    }

    public PolicyThrowable(String str) {
        super(str);
    }

    public PolicyThrowable(String str, Throwable th) {
        super(str, th);
    }

    public PolicyThrowable(int i4, String str) {
        this(str);
        this.code = i4;
    }

    public PolicyThrowable(int i4, String str, Throwable th) {
        this(str, th);
        this.code = i4;
    }

    public PolicyThrowable(Throwable th) {
        super(th);
    }
}
