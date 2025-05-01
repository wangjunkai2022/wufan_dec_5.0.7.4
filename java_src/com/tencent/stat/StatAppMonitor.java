package com.tencent.stat;
/* loaded from: classes6.dex */
public class StatAppMonitor implements Cloneable {
    public static final int FAILURE_RESULT_TYPE = 1;
    public static final int LOGIC_FAILURE_RESULT_TYPE = 2;
    public static final int SUCCESS_RESULT_TYPE = 0;

    /* renamed from: a  reason: collision with root package name */
    private String f62818a;

    /* renamed from: b  reason: collision with root package name */
    private long f62819b;

    /* renamed from: c  reason: collision with root package name */
    private long f62820c;

    /* renamed from: d  reason: collision with root package name */
    private int f62821d;

    /* renamed from: e  reason: collision with root package name */
    private long f62822e;

    /* renamed from: f  reason: collision with root package name */
    private int f62823f;

    /* renamed from: g  reason: collision with root package name */
    private int f62824g;

    public StatAppMonitor(String str) {
        this.f62818a = null;
        this.f62819b = 0L;
        this.f62820c = 0L;
        this.f62821d = 0;
        this.f62822e = 0L;
        this.f62823f = 0;
        this.f62824g = 1;
        this.f62818a = str;
    }

    public StatAppMonitor(String str, int i4, int i5, long j4, long j5, long j6, int i6) {
        this.f62818a = null;
        this.f62819b = 0L;
        this.f62820c = 0L;
        this.f62821d = 0;
        this.f62822e = 0L;
        this.f62823f = 0;
        this.f62824g = 1;
        this.f62818a = str;
        this.f62819b = j4;
        this.f62820c = j5;
        this.f62821d = i4;
        this.f62822e = j6;
        this.f62823f = i5;
        this.f62824g = i6;
    }

    /* renamed from: clone */
    public StatAppMonitor m27clone() {
        try {
            return (StatAppMonitor) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getInterfaceName() {
        return this.f62818a;
    }

    public long getMillisecondsConsume() {
        return this.f62822e;
    }

    public long getReqSize() {
        return this.f62819b;
    }

    public long getRespSize() {
        return this.f62820c;
    }

    public int getResultType() {
        return this.f62821d;
    }

    public int getReturnCode() {
        return this.f62823f;
    }

    public int getSampling() {
        return this.f62824g;
    }

    public void setInterfaceName(String str) {
        this.f62818a = str;
    }

    public void setMillisecondsConsume(long j4) {
        this.f62822e = j4;
    }

    public void setReqSize(long j4) {
        this.f62819b = j4;
    }

    public void setRespSize(long j4) {
        this.f62820c = j4;
    }

    public void setResultType(int i4) {
        this.f62821d = i4;
    }

    public void setReturnCode(int i4) {
        this.f62823f = i4;
    }

    public void setSampling(int i4) {
        if (i4 <= 0) {
            i4 = 1;
        }
        this.f62824g = i4;
    }
}
