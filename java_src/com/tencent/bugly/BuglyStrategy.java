package com.tencent.bugly;

import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes.dex */
public class BuglyStrategy {

    /* renamed from: c  reason: collision with root package name */
    private String f62167c;

    /* renamed from: d  reason: collision with root package name */
    private String f62168d;

    /* renamed from: e  reason: collision with root package name */
    private String f62169e;

    /* renamed from: f  reason: collision with root package name */
    private long f62170f;

    /* renamed from: g  reason: collision with root package name */
    private String f62171g;

    /* renamed from: h  reason: collision with root package name */
    private String f62172h;

    /* renamed from: i  reason: collision with root package name */
    private String f62173i;

    /* renamed from: t  reason: collision with root package name */
    private a f62184t;

    /* renamed from: j  reason: collision with root package name */
    private boolean f62174j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f62175k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f62176l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f62177m = true;

    /* renamed from: n  reason: collision with root package name */
    private Class<?> f62178n = null;

    /* renamed from: o  reason: collision with root package name */
    private boolean f62179o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f62180p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f62181q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f62182r = true;

    /* renamed from: s  reason: collision with root package name */
    private boolean f62183s = false;

    /* renamed from: a  reason: collision with root package name */
    protected int f62165a = 31;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f62166b = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f62185u = true;

    /* compiled from: BUGLY */
    /* loaded from: classes3.dex */
    public static class a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i4, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i4, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str = this.f62168d;
        if (str == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().f62261l;
        }
        return str;
    }

    public synchronized String getAppPackageName() {
        String str = this.f62169e;
        if (str == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().f62252c;
        }
        return str;
    }

    public synchronized long getAppReportDelay() {
        return this.f62170f;
    }

    public synchronized String getAppVersion() {
        String str = this.f62167c;
        if (str == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().f62259j;
        }
        return str;
    }

    public synchronized int getCallBackType() {
        return this.f62165a;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f62166b;
    }

    public synchronized a getCrashHandleCallback() {
        return this.f62184t;
    }

    public synchronized String getDeviceID() {
        return this.f62172h;
    }

    public synchronized String getDeviceModel() {
        return this.f62173i;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f62171g;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f62178n;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f62179o;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f62175k;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f62176l;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f62174j;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f62177m;
    }

    public boolean isMerged() {
        return this.f62185u;
    }

    public boolean isReplaceOldChannel() {
        return this.f62180p;
    }

    public synchronized boolean isUploadProcess() {
        return this.f62181q;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f62182r;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f62183s;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f62168d = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f62169e = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j4) {
        this.f62170f = j4;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f62167c = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z4) {
        this.f62179o = z4;
        return this;
    }

    public synchronized void setCallBackType(int i4) {
        this.f62165a = i4;
    }

    public synchronized void setCloseErrorCallback(boolean z4) {
        this.f62166b = z4;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.f62184t = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f62172h = str;
        return this;
    }

    public synchronized BuglyStrategy setDeviceModel(String str) {
        this.f62173i = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z4) {
        this.f62175k = z4;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z4) {
        this.f62176l = z4;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z4) {
        this.f62174j = z4;
        return this;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z4) {
        this.f62177m = z4;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f62171g = str;
        return this;
    }

    public void setMerged(boolean z4) {
        this.f62185u = z4;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z4) {
        this.f62183s = z4;
        return this;
    }

    public void setReplaceOldChannel(boolean z4) {
        this.f62180p = z4;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z4) {
        this.f62181q = z4;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z4) {
        this.f62182r = z4;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f62178n = cls;
        return this;
    }
}
