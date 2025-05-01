package com.uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import com.android.dex.DexFormat;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static RuntimeException f63197a = null;

    /* renamed from: b  reason: collision with root package name */
    public static RuntimeException f63198b = null;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f63199c = true;

    /* renamed from: d  reason: collision with root package name */
    private static CustomInfo f63200d;

    /* renamed from: e  reason: collision with root package name */
    private static VersionInfo f63201e;

    /* renamed from: g  reason: collision with root package name */
    private static String f63203g;

    /* renamed from: h  reason: collision with root package name */
    private static String f63204h;

    /* renamed from: i  reason: collision with root package name */
    private static String f63205i;

    /* renamed from: j  reason: collision with root package name */
    private static String f63206j;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f63202f = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static final Object f63207k = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A() {
        return f63200d.mLogMaxBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B() {
        return f63200d.mLogMaxUploadBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long C() {
        return f63200d.mMaxUploadBytesPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D() {
        return f63200d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E() {
        return f63200d.mMaxUploadCustomLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F() {
        return f63200d.mMaxCustomLogCountPerTypePerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G() {
        return f63200d.mInfoUpdateInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H() {
        return f63200d.mInfoSaveFrequency;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I() {
        return f63200d.mReservedJavaFileHandleCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J() {
        return f63200d.mFdDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K() {
        return f63200d.mThreadsDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L() {
        return f63200d.mAutoDetectLifeCycle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean M() {
        return f63200d.mMonitorBattery;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N() {
        return f63200d.mAnrTraceStrategy;
    }

    public static boolean O() {
        CustomInfo customInfo = f63200d;
        return customInfo == null || customInfo.mDebug;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P() {
        CustomInfo customInfo = f63200d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    public static boolean Q() {
        return f63200d.mEnableStatReport;
    }

    public static boolean R() {
        return f63200d.mIsInternational;
    }

    public static boolean S() {
        return f63200d.mAddPvForNewDay;
    }

    public static String T() {
        if (com.uc.crashsdk.a.g.a(f63201e.mVersion)) {
            return a.a();
        }
        return a(f63201e.mVersion);
    }

    public static String U() {
        return com.uc.crashsdk.a.g.a(f63201e.mSubVersion) ? "release" : f63201e.mSubVersion;
    }

    public static String V() {
        if (com.uc.crashsdk.a.g.a(f63201e.mBuildId)) {
            return ad();
        }
        return a(f63201e.mBuildId);
    }

    public static String W() {
        if (f63204h == null) {
            f63204h = com.uc.crashsdk.a.g.b() + File.separatorChar + f63200d.mTagFilesFolderName + File.separatorChar;
        }
        return f63204h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String X() {
        if (f63205i == null) {
            f63205i = com.uc.crashsdk.a.g.b() + File.separatorChar + f63200d.mCrashLogsFolderName + File.separatorChar;
        }
        return f63205i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String Y() {
        if (f63206j == null) {
            if (!com.uc.crashsdk.a.g.a(f63200d.mLogsBackupPathName)) {
                String trim = f63200d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!trim.endsWith(str)) {
                    trim = trim + str;
                }
                f63206j = trim;
            } else {
                f63206j = (com.uc.crashsdk.a.g.b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f63200d.mCrashLogsFolderName + File.separatorChar;
            }
        }
        return f63206j;
    }

    public static boolean Z() {
        return f63200d.mEnableCrpStat;
    }

    public static void a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f63200d = customInfo2;
        c(customInfo2);
        if (!f63200d.mZipLog) {
            f63197a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f63200d.mEncryptLog) {
            f63198b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f63201e = new VersionInfo(versionInfo);
        if (b.L()) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static boolean aa() {
        return f63200d.mEnableStatToWPKDirect;
    }

    public static String ab() {
        return f63200d.mUserId;
    }

    public static String ac() {
        return f63200d.mChannel;
    }

    private static String ad() {
        ZipFile zipFile;
        Throwable th;
        String str = f63203g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(com.uc.crashsdk.a.g.c());
                try {
                    f63203g = Long.toHexString(zipFile.getEntry(DexFormat.DEX_IN_JAR_NAME).getCrc());
                    com.uc.crashsdk.a.a.a("crashsdk", "version unique build id: " + f63203g);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f63203g = "";
                        com.uc.crashsdk.a.g.a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f63203g;
                    } catch (Throwable th3) {
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th4) {
            zipFile = null;
            th = th4;
        }
        return f63203g;
    }

    private static void ae() {
        if (b.f63118d) {
            JNIBridge.nativeSet(24, 1L, a.f63036b, null);
        }
    }

    public static void b() {
        JNIBridge.set(103, com.uc.crashsdk.a.g.b());
        JNIBridge.set(104, f63200d.mTagFilesFolderName);
        JNIBridge.set(105, f63200d.mCrashLogsFolderName);
        JNIBridge.set(106, Y());
        JNIBridge.set(107, e.h());
        JNIBridge.set(108, b.a());
        JNIBridge.set(109, T());
        JNIBridge.set(110, U());
        JNIBridge.set(111, V());
        JNIBridge.set(112, "211215141717");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, e.q());
        JNIBridge.set(5, f63200d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f63200d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f63200d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f63200d.mNativeCrashLogFileName);
        JNIBridge.set(101, f63200d.mUnexpCrashLogFileName);
        JNIBridge.set(35, f63200d.mEnableMemoryGroup);
        JNIBridge.set(36, f63200d.mEnableLibcMallocDetail);
        JNIBridge.set(131, f63200d.mLibcMallocDetailConfig);
        JNIBridge.set(102, f63200d.mAppId);
        JNIBridge.set(38, f63200d.mCrashRateUploadUrl);
        JNIBridge.set(39, f63200d.mCrashSDKAuthUrl);
    }

    private static void c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long b5 = e.b();
            if (b5 >= 1) {
                customInfo.mMaxBuiltinLogFilesCount = 200;
                customInfo.mMaxCustomLogFilesCount = 100;
                customInfo.mMaxUploadBytesPerDay = 268435456L;
                customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
                customInfo.mMaxUploadCustomLogCountPerDay = 2000;
                customInfo.mMaxCustomLogCountPerTypePerDay = 100;
                customInfo.mMaxAnrLogCountPerProcess = 100;
                customInfo.mAnrTraceStrategy = 2;
                if (b5 >= 2) {
                    customInfo.mSyncUploadSetupCrashLogs = true;
                    customInfo.mSyncUploadLogs = true;
                    if (b5 >= 3) {
                        customInfo.mBackupLogs = true;
                        customInfo.mPrintStackInfos = true;
                        customInfo.mDebug = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    public static void d() {
        JNIBridge.set(23, f63200d.mIsInternational);
        if (b.H()) {
            JNIBridge.set(34, true);
        }
        if (e.i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f63200d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f63200d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(b.B());
        JNIBridge.set(2, b.F());
        a.e();
        a.g();
        a.i();
        a.k();
        JNIBridge.set(113, a.f63035a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f63200d.mThreadsDumpMinLimit);
        JNIBridge.set(122, a.a());
        JNIBridge.set(33, a.c());
        ae();
        b.K();
        b.D();
        com.uc.crashsdk.a.g.k();
    }

    public static String e() {
        return f63200d.mAppId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (com.uc.crashsdk.a.g.b(f63200d.mJavaCrashLogFileName) || com.uc.crashsdk.a.g.b(f63200d.mNativeCrashLogFileName)) {
            return true;
        }
        return com.uc.crashsdk.a.g.b(f63200d.mUnexpCrashLogFileName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        return f63200d.mJavaCrashLogFileName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h() {
        return f63200d.mCrashRestartInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return f63200d.mCallJavaDefaultHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j() {
        return f63200d.mDumpHprofDataForJavaOOM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k() {
        return f63200d.mRenameFileToDefaultName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l() {
        return f63200d.mMaxBuiltinLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m() {
        return f63200d.mMaxCustomLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n() {
        return f63200d.mMaxJavaLogcatLineCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o() {
        return f63200d.mUnexpDelayMillSeconds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p() {
        return f63200d.mUnexpSubTypes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return f63200d.mBackupLogs;
    }

    public static boolean r() {
        return f63200d.mSyncUploadSetupCrashLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s() {
        return f63200d.mSyncUploadLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        return f63200d.mOmitJavaCrash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return f63200d.mAutoDeleteOldVersionStats;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v() {
        return f63200d.mZipLog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w() {
        return f63200d.mZippedLogExtension;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x() {
        return f63200d.mEncryptLog;
    }

    public static String y() {
        return f63200d.mCrashLogUploadUrl;
    }

    public static String z() {
        return f63200d.mCrashRateUploadUrl;
    }

    public static void a(CustomInfo customInfo) {
        boolean z4 = f63199c;
        if (!z4 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z4 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    public static void a(VersionInfo versionInfo) {
        synchronized (f63202f) {
            f63201e = new VersionInfo(versionInfo);
            e.c();
            if (b.f63118d) {
                JNIBridge.set(109, T());
                JNIBridge.set(110, U());
                JNIBridge.set(111, V());
                JNIBridge.set(112, "211215141717");
                JNIBridge.cmd(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        b.y();
        b.x();
        if (f63200d.mBackupLogs) {
            File file = new File(Y());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static void c() {
        JNIBridge.set(11, P());
        JNIBridge.set(12, f63200d.mBackupLogs);
        JNIBridge.set(13, f63200d.mCrashRestartInterval);
        JNIBridge.set(14, f63200d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f63200d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f63200d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f63200d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, O());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f63200d.mOmitNativeCrash);
        JNIBridge.set(32, f63200d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f63200d.mDisableSignals);
        JNIBridge.set(9, f63200d.mDisableBackgroundSignals);
        CustomInfo customInfo = f63200d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f63200d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    private static String a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    public static int b(CustomInfo customInfo) {
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        synchronized (f63207k) {
            i4 = 0;
            if (customInfo != null) {
                c(customInfo);
                if (f63200d == null) {
                    f63200d = new CustomInfo();
                }
                CustomInfo customInfo2 = f63200d;
                boolean z6 = true;
                if (a(customInfo.mAppId, customInfo2.mAppId)) {
                    i5 = 0;
                    z4 = false;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (b.f63118d) {
                        JNIBridge.set(102, str);
                    }
                    i5 = 1;
                    z4 = true;
                }
                if (!a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i5++;
                }
                if (!a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (b.f63118d) {
                        JNIBridge.set(100, str2);
                    }
                    i5++;
                    z4 = true;
                }
                if (!a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (b.f63118d) {
                        JNIBridge.set(101, str3);
                    }
                    i5++;
                    z4 = true;
                }
                if (z4) {
                    e.c();
                    if (b.f63118d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z7 = customInfo2.mPrintStackInfos;
                boolean z8 = customInfo.mPrintStackInfos;
                if (z7 != z8) {
                    customInfo2.mPrintStackInfos = z8;
                    if (b.f63118d) {
                        JNIBridge.set(11, z8);
                    }
                    i5++;
                }
                boolean z9 = customInfo2.mDebug;
                boolean z10 = customInfo.mDebug;
                if (z9 != z10) {
                    customInfo2.mDebug = z10;
                    if (b.f63118d) {
                        JNIBridge.set(18, z10);
                    }
                    i5++;
                }
                boolean z11 = customInfo2.mBackupLogs;
                boolean z12 = customInfo.mBackupLogs;
                if (z11 != z12) {
                    customInfo2.mBackupLogs = z12;
                    if (b.f63118d) {
                        JNIBridge.set(12, z12);
                    }
                    i5++;
                }
                boolean z13 = customInfo2.mOmitNativeCrash;
                boolean z14 = customInfo.mOmitNativeCrash;
                if (z13 != z14) {
                    customInfo2.mOmitNativeCrash = z14;
                    if (b.f63118d) {
                        JNIBridge.set(21, z14);
                    }
                    i5++;
                }
                int i6 = customInfo2.mCrashRestartInterval;
                int i7 = customInfo.mCrashRestartInterval;
                if (i6 != i7) {
                    customInfo2.mCrashRestartInterval = i7;
                    if (b.f63118d) {
                        JNIBridge.set(13, i7);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        b.M();
                    }
                    i5++;
                }
                int i8 = customInfo2.mMaxBuiltinLogFilesCount;
                int i9 = customInfo.mMaxBuiltinLogFilesCount;
                if (i8 != i9) {
                    customInfo2.mMaxBuiltinLogFilesCount = i9;
                    if (b.f63118d) {
                        JNIBridge.set(14, i9);
                    }
                    i5++;
                }
                int i10 = customInfo2.mMaxNativeLogcatLineCount;
                int i11 = customInfo.mMaxNativeLogcatLineCount;
                if (i10 != i11) {
                    customInfo2.mMaxNativeLogcatLineCount = i11;
                    if (b.f63118d) {
                        JNIBridge.set(15, i11);
                    }
                    i5++;
                }
                int i12 = customInfo2.mMaxJavaLogcatLineCount;
                int i13 = customInfo.mMaxJavaLogcatLineCount;
                if (i12 != i13) {
                    customInfo2.mMaxJavaLogcatLineCount = i13;
                    i5++;
                }
                int i14 = customInfo2.mMaxUnexpLogcatLineCount;
                int i15 = customInfo.mMaxUnexpLogcatLineCount;
                if (i14 != i15) {
                    customInfo2.mMaxUnexpLogcatLineCount = i15;
                    if (b.f63118d) {
                        JNIBridge.set(16, i15);
                    }
                    i5++;
                }
                int i16 = customInfo2.mMaxAnrLogcatLineCount;
                int i17 = customInfo.mMaxAnrLogcatLineCount;
                if (i16 != i17) {
                    customInfo2.mMaxAnrLogcatLineCount = i17;
                    if (b.f63118d) {
                        JNIBridge.set(31, i17);
                    }
                    i5++;
                }
                boolean z15 = customInfo2.mZipLog;
                boolean z16 = customInfo.mZipLog;
                if (z15 != z16) {
                    customInfo2.mZipLog = z16;
                    if (!z16) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f63197a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i5++;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z6 = z5;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i5++;
                }
                if (z6 && b.f63118d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i18 = customInfo2.mLogMaxBytesLimit;
                int i19 = customInfo.mLogMaxBytesLimit;
                if (i18 != i19) {
                    customInfo2.mLogMaxBytesLimit = i19;
                    if (b.f63118d) {
                        JNIBridge.set(4, i19);
                    }
                    i5++;
                }
                boolean z17 = customInfo2.mEncryptLog;
                boolean z18 = customInfo.mEncryptLog;
                if (z17 != z18) {
                    customInfo2.mEncryptLog = z18;
                    if (z18) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f63198b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i5++;
                }
                boolean z19 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z20 = customInfo.mSyncUploadSetupCrashLogs;
                if (z19 != z20) {
                    customInfo2.mSyncUploadSetupCrashLogs = z20;
                    i5++;
                }
                boolean z21 = customInfo2.mSyncUploadLogs;
                boolean z22 = customInfo.mSyncUploadLogs;
                if (z21 != z22) {
                    customInfo2.mSyncUploadLogs = z22;
                    i5++;
                }
                int i20 = customInfo2.mMaxCustomLogFilesCount;
                int i21 = customInfo.mMaxCustomLogFilesCount;
                if (i20 != i21) {
                    customInfo2.mMaxCustomLogFilesCount = i21;
                    i5++;
                }
                boolean z23 = customInfo2.mOmitJavaCrash;
                boolean z24 = customInfo.mOmitJavaCrash;
                if (z23 != z24) {
                    customInfo2.mOmitJavaCrash = z24;
                    i5++;
                }
                int i22 = customInfo2.mLogMaxUploadBytesLimit;
                int i23 = customInfo.mLogMaxUploadBytesLimit;
                if (i22 != i23) {
                    customInfo2.mLogMaxUploadBytesLimit = i23;
                    i5++;
                }
                long j4 = customInfo2.mMaxUploadBytesPerDay;
                long j5 = customInfo.mMaxUploadBytesPerDay;
                if (j4 != j5) {
                    customInfo2.mMaxUploadBytesPerDay = j5;
                    i5++;
                }
                int i24 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i25 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i24 != i25) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i25;
                    i5++;
                }
                int i26 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i27 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i26 != i27) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i27;
                    i5++;
                }
                int i28 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i29 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i28 != i29) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i29;
                    i5++;
                }
                int i30 = customInfo2.mMaxAnrLogCountPerProcess;
                int i31 = customInfo.mMaxAnrLogCountPerProcess;
                if (i30 != i31) {
                    customInfo2.mMaxAnrLogCountPerProcess = i31;
                    if (b.f63118d) {
                        JNIBridge.set(32, f63200d.mMaxAnrLogCountPerProcess);
                    }
                    i5++;
                }
                boolean z25 = customInfo2.mCallJavaDefaultHandler;
                boolean z26 = customInfo.mCallJavaDefaultHandler;
                if (z25 != z26) {
                    customInfo2.mCallJavaDefaultHandler = z26;
                    i5++;
                }
                boolean z27 = customInfo2.mCallNativeDefaultHandler;
                boolean z28 = customInfo.mCallNativeDefaultHandler;
                if (z27 != z28) {
                    customInfo2.mCallNativeDefaultHandler = z28;
                    i5++;
                    if (b.f63118d) {
                        JNIBridge.set(5, f63200d.mCallNativeDefaultHandler);
                    }
                }
                boolean z29 = customInfo2.mDumpUserSolibBuildId;
                boolean z30 = customInfo.mDumpUserSolibBuildId;
                if (z29 != z30) {
                    customInfo2.mDumpUserSolibBuildId = z30;
                    i5++;
                    if (b.f63118d) {
                        JNIBridge.set(6, f63200d.mDumpUserSolibBuildId);
                    }
                }
                boolean z31 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z32 = customInfo.mDumpHprofDataForJavaOOM;
                if (z31 != z32) {
                    customInfo2.mDumpHprofDataForJavaOOM = z32;
                    i5++;
                }
                boolean z33 = customInfo2.mRenameFileToDefaultName;
                boolean z34 = customInfo.mRenameFileToDefaultName;
                if (z33 != z34) {
                    customInfo2.mRenameFileToDefaultName = z34;
                    i5++;
                }
                boolean z35 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z36 = customInfo.mAutoDeleteOldVersionStats;
                if (z35 != z36) {
                    customInfo2.mAutoDeleteOldVersionStats = z36;
                    i5++;
                }
                int i32 = customInfo2.mFdDumpMinLimit;
                int i33 = customInfo.mFdDumpMinLimit;
                if (i32 != i33) {
                    customInfo2.mFdDumpMinLimit = i33;
                    if (b.f63118d) {
                        JNIBridge.set(10, i33);
                    }
                    i5++;
                }
                int i34 = customInfo2.mThreadsDumpMinLimit;
                int i35 = customInfo.mThreadsDumpMinLimit;
                if (i34 != i35) {
                    customInfo2.mThreadsDumpMinLimit = i35;
                    if (b.f63118d) {
                        JNIBridge.set(22, i35);
                    }
                    i5++;
                }
                int i36 = customInfo2.mInfoUpdateInterval;
                int i37 = customInfo.mInfoUpdateInterval;
                if (i36 != i37) {
                    if (i36 <= 0 && i37 > 0) {
                        a.a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i5++;
                }
                int i38 = customInfo2.mInfoSaveFrequency;
                int i39 = customInfo.mInfoSaveFrequency;
                if (i38 != i39) {
                    customInfo2.mInfoSaveFrequency = i39;
                    i5++;
                }
                long j6 = customInfo2.mDisableBackgroundSignals;
                long j7 = customInfo.mDisableBackgroundSignals;
                if (j6 != j7) {
                    customInfo2.mDisableBackgroundSignals = j7;
                    if (b.f63118d) {
                        JNIBridge.set(9, j7);
                    }
                    i5++;
                }
                boolean z37 = customInfo2.mEnableStatReport;
                boolean z38 = customInfo.mEnableStatReport;
                if (z37 != z38) {
                    customInfo2.mEnableStatReport = z38;
                    if (z38) {
                        e.B();
                    }
                    i5++;
                }
                boolean z39 = customInfo2.mEnableCrpStat;
                boolean z40 = customInfo.mEnableCrpStat;
                if (z39 != z40) {
                    customInfo2.mEnableCrpStat = z40;
                    i5++;
                }
                boolean z41 = customInfo2.mEnableStatToWPKDirect;
                boolean z42 = customInfo.mEnableStatToWPKDirect;
                if (z41 != z42) {
                    customInfo2.mEnableStatToWPKDirect = z42;
                    i5++;
                }
                boolean z43 = customInfo2.mIsInternational;
                boolean z44 = customInfo.mIsInternational;
                if (z43 != z44) {
                    customInfo2.mIsInternational = z44;
                    if (b.f63118d) {
                        JNIBridge.set(23, z44);
                    }
                    e.l();
                    com.uc.crashsdk.a.d.c();
                    h.k();
                    i5++;
                }
                boolean z45 = customInfo2.mAutoDetectLifeCycle;
                boolean z46 = customInfo.mAutoDetectLifeCycle;
                if (z45 != z46) {
                    customInfo2.mAutoDetectLifeCycle = z46;
                    if (z46) {
                        b.C();
                    }
                    i5++;
                }
                boolean z47 = customInfo2.mMonitorBattery;
                boolean z48 = customInfo.mMonitorBattery;
                if (z47 != z48) {
                    customInfo2.mMonitorBattery = z48;
                    e.c(b.B());
                    i5++;
                }
                int i40 = customInfo2.mUnexpSubTypes;
                int i41 = customInfo.mUnexpSubTypes;
                if (i40 != i41) {
                    customInfo2.mUnexpSubTypes = i41;
                    i5++;
                }
                boolean z49 = customInfo2.mEnableMemoryGroup;
                boolean z50 = customInfo.mEnableMemoryGroup;
                if (z49 != z50) {
                    customInfo2.mEnableMemoryGroup = z50;
                    if (b.f63118d) {
                        JNIBridge.set(35, z50);
                    }
                    i5++;
                }
                boolean z51 = customInfo2.mEnableLibcMallocDetail;
                boolean z52 = customInfo.mEnableLibcMallocDetail;
                if (z51 != z52) {
                    customInfo2.mEnableLibcMallocDetail = z52;
                    if (b.f63118d) {
                        JNIBridge.set(36, z52);
                    }
                    i5++;
                }
                String str4 = customInfo2.mLibcMallocDetailConfig;
                String str5 = customInfo.mLibcMallocDetailConfig;
                if (str4 != str5) {
                    customInfo2.mLibcMallocDetailConfig = str5;
                    if (b.f63118d) {
                        JNIBridge.set(131, str5);
                    }
                    i5++;
                }
                if (!a(customInfo.mUserId, customInfo2.mUserId)) {
                    customInfo2.mUserId = customInfo.mUserId;
                    i5++;
                }
                if (!a(customInfo.mChannel, customInfo2.mChannel)) {
                    customInfo2.mChannel = customInfo.mChannel;
                    i5++;
                }
                if (!a(customInfo2.mCrashLogUploadUrl, customInfo.mCrashLogUploadUrl)) {
                    customInfo2.mCrashLogUploadUrl = customInfo.mCrashLogUploadUrl;
                    i5++;
                }
                if (!a(customInfo2.mCrashRateUploadUrl, customInfo.mCrashRateUploadUrl)) {
                    String str6 = customInfo.mCrashRateUploadUrl;
                    customInfo2.mCrashRateUploadUrl = str6;
                    i5++;
                    if (b.f63118d) {
                        JNIBridge.set(38, str6);
                    }
                }
                if (!a(customInfo2.mCrashSDKAuthUrl, customInfo.mCrashSDKAuthUrl)) {
                    String str7 = customInfo.mCrashSDKAuthUrl;
                    customInfo2.mCrashSDKAuthUrl = str7;
                    i5++;
                    if (b.f63118d) {
                        JNIBridge.set(39, str7);
                    }
                }
                i4 = i5;
            }
        }
        return i4;
    }

    public static CustomInfo a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = f63200d;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e5) {
                        com.uc.crashsdk.a.g.a(e5);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    public static VersionInfo a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f63201e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!com.uc.crashsdk.a.g.a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!com.uc.crashsdk.a.g.a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!com.uc.crashsdk.a.g.a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!com.uc.crashsdk.a.g.a(string4)) {
            a.f63036b = string4;
            ae();
        }
        return versionInfo;
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
