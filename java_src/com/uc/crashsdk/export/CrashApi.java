package com.uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CrashApi {

    /* renamed from: a  reason: collision with root package name */
    private static CrashApi f63188a = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f63189c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f63190d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f63191b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z4, boolean z5, boolean z6) {
        this.f63191b = false;
        Context a5 = a(context);
        b(a5);
        b.f63121g = z5;
        b.f63122h = z6;
        if (b.L()) {
            b(a5);
            a(a5, customInfo, versionInfo, iCrashClient);
            if (z4) {
                a();
            }
            if (b.f63121g && e.e("libcrashsdk.so")) {
                b.f63120f = true;
                b();
            }
        } else if (customInfo != null && versionInfo != null) {
            g.a(customInfo);
            try {
                a(a5, customInfo, versionInfo, iCrashClient);
            } catch (Throwable th) {
                a(th);
            }
            if (z4) {
                try {
                    a();
                } catch (Throwable th2) {
                    a(th2);
                }
            }
            try {
                b.M();
                h.a();
                d.a();
                com.uc.crashsdk.a.g.j();
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            try {
                if (!b.a(a5)) {
                    a.d("crashsdk", "registerLifecycleCallbacks failed!");
                }
            } catch (Throwable th4) {
                com.uc.crashsdk.a.g.a(th4);
            }
            try {
                com.uc.crashsdk.a.n();
                e.A();
                e.B();
            } catch (Throwable th5) {
                com.uc.crashsdk.a.g.a(th5);
            }
            try {
                if (g.r() && b.F() && !this.f63191b) {
                    e.G();
                    this.f63191b = true;
                }
            } catch (Throwable th6) {
                com.uc.crashsdk.a.g.b(th6);
            }
        } else {
            a.d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
    }

    private static void a() {
        if (b.f63115a) {
            a.b("Has enabled java log!");
            return;
        }
        e.s();
        e.o();
        b.f63115a = true;
    }

    private static void b() {
        synchronized (b.f63119e) {
            if (b.f63121g && b.f63120f) {
                if (b.f63116b) {
                    a.b("Has enabled native log!");
                    return;
                }
                c();
                e.D();
                b.f63116b = true;
                JNIBridge.cmd(6);
                g.d();
            }
        }
    }

    private static void c() {
        if (b.f63118d) {
            return;
        }
        g.b();
        JNIBridge.cmd(5);
        g.c();
        b.f63118d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z4, boolean z5, boolean z6) {
        CrashApi crashApi;
        synchronized (CrashApi.class) {
            if (f63188a == null) {
                f63188a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z4, z5, z6);
            }
            crashApi = f63188a;
        }
        return crashApi;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4) {
        return createInstanceEx(context, str, z4, null);
    }

    public static CrashApi getInstance() {
        return f63188a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str != null && str2 != null) {
            return com.uc.crashsdk.a.b(str, str2);
        }
        throw null;
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        Objects.requireNonNull(dumpFileInfo);
        String str2 = dumpFileInfo.mCategory;
        if (str2 != null && (str = dumpFileInfo.mFileTobeDump) != null) {
            int i4 = dumpFileInfo.mLogType;
            if ((1048849 & i4) == 0) {
                return 0;
            }
            return com.uc.crashsdk.a.a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i4, dumpFileInfo.mDeleteAfterDump);
        }
        throw null;
    }

    public void addHeaderInfo(String str, String str2) {
        Objects.requireNonNull(str);
        com.uc.crashsdk.a.a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (a("addStatInfo")) {
            return false;
        }
        if (!com.uc.crashsdk.a.g.a(str)) {
            if (str.length() <= 24) {
                if (str2 != null && str2.length() > 512) {
                    str2 = str2.substring(0, 512);
                }
                return h.a(str, str2);
            }
            throw new IllegalArgumentException("key is too long!");
        }
        throw null;
    }

    public void crashSoLoaded() {
        if (a("crashSoLoaded")) {
            return;
        }
        b.f63120f = true;
        b();
        synchronized (b.f63119e) {
            if (b.f63122h && b.f63120f && !b.f63117c) {
                if (!b.f63118d) {
                    c();
                    g.d();
                }
                e.x();
                b.f63117c = true;
            }
        }
        com.uc.crashsdk.a.n();
        e.m();
    }

    public int createCachedInfo(String str, int i4, int i5) {
        Objects.requireNonNull(str);
        if (i4 > 0) {
            if ((1048849 & i5) == 0) {
                return 0;
            }
            return com.uc.crashsdk.a.a(str, i4, i5);
        }
        throw new IllegalArgumentException("capacity must > 0!");
    }

    public void disableLog(int i4) {
        synchronized (b.f63119e) {
            b.b(i4);
            if (LogType.isForJava(i4) && b.f63115a) {
                e.t();
                b.f63115a = false;
            }
            if (LogType.isForNative(i4)) {
                if (b.f63116b) {
                    JNIBridge.cmd(9);
                    b.f63116b = false;
                } else {
                    b.f63121g = false;
                }
            }
            if (LogType.isForANR(i4)) {
                b.a(false);
            }
            if (LogType.isForUnexp(i4)) {
                if (b.f63117c) {
                    if (e.z()) {
                        b.f63117c = false;
                    }
                } else {
                    b.f63122h = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb;
        Objects.requireNonNull(customLogInfo);
        if (customLogInfo.mData != null && (str = customLogInfo.mLogType) != null) {
            if (!str.contains("_") && !customLogInfo.mLogType.contains(" ")) {
                ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
                if (arrayList == null || arrayList.size() <= 0) {
                    sb = null;
                } else {
                    sb = new StringBuilder();
                    Iterator<Integer> it2 = customLogInfo.mDumpTids.iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next().intValue());
                        sb.append(" ");
                    }
                }
                long j4 = customLogInfo.mAddHeader ? 1L : 0L;
                if (customLogInfo.mAddFooter) {
                    j4 |= 2;
                }
                if (customLogInfo.mAddLogcat) {
                    j4 |= 4;
                }
                if (customLogInfo.mAddThreadsDump) {
                    j4 |= 8;
                }
                if (customLogInfo.mAddBuildId) {
                    j4 |= 16;
                }
                if (customLogInfo.mUploadNow) {
                    j4 |= 32;
                }
                return e.a(customLogInfo.mData, customLogInfo.mLogType, j4, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb != null ? sb.toString() : null);
            }
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        }
        throw new NullPointerException("mData or mLogType is null!");
    }

    public boolean generateTraces(String str, long j4) {
        if (a("generateTraces")) {
            return false;
        }
        if (b.f63118d) {
            return JNIBridge.nativeCmd(12, j4, str, null) == 1;
        }
        a.d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (a("getCrashLogUploadUrl")) {
            return null;
        }
        return e.k();
    }

    public ParcelFileDescriptor getHostFd() {
        return e.E();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return e.E();
    }

    public int getLastExitType() {
        if (a("getLastExitType")) {
            return 1;
        }
        return b.I();
    }

    public int getLastExitTypeEx() {
        if (a("getLastExitTypeEx")) {
            return 1;
        }
        return b.J();
    }

    public Throwable getUncaughtException() {
        return e.v();
    }

    public int getUnexpReason() {
        if (a("getUnexpReason")) {
            return 100;
        }
        return e.w();
    }

    public void onExit() {
        b.w();
    }

    public boolean registerCallback(int i4, ValueCallback<Bundle> valueCallback) {
        Objects.requireNonNull(valueCallback);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return com.uc.crashsdk.d.b(valueCallback);
                    }
                    throw new IllegalArgumentException("Unknown event type: " + i4);
                }
                return com.uc.crashsdk.d.d(valueCallback);
            }
            return com.uc.crashsdk.d.c(valueCallback);
        }
        return com.uc.crashsdk.d.a(valueCallback);
    }

    public int registerInfoCallback(String str, int i4) {
        Objects.requireNonNull(str);
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i4, null, 0L, 0);
    }

    public int registerThread(int i4, String str) {
        return com.uc.crashsdk.a.a(i4, str);
    }

    public int reportCrashStats(boolean z4) {
        if (a("reportCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::reportCrashStats. currentProcessOnly: " + z4);
        }
        e.d(z4);
        return e.e(z4);
    }

    public int resetCrashStats(boolean z4) {
        if (a("resetCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::resetCrashStats. currentProcessOnly: " + z4);
        }
        return e.f(z4);
    }

    public void setForeground(boolean z4) {
        b.b(z4);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (a("setNewInstall")) {
            return;
        }
        b.v();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        Objects.requireNonNull(customInfo);
        return g.b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (a("updateUnexpInfo")) {
            return false;
        }
        return com.uc.crashsdk.a.a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        Objects.requireNonNull(versionInfo);
        g.a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (a("uploadCrashLogs")) {
            return;
        }
        e.a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4, Bundle bundle) {
        return createInstanceEx(context, str, z4, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f63188a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f63189c = bundle.getBoolean("useApplicationContext", true);
        Context a5 = a(context);
        b(a5);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = false;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z4;
        bundle.putString("crver", "2.0");
        CustomInfo a6 = g.a(customInfo, bundle);
        VersionInfo a7 = g.a(bundle);
        boolean z5 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_JAVA, true);
        boolean z6 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_NATIVE, true);
        boolean z7 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_UNEXP, b.F());
        boolean z8 = bundle.getBoolean(UMCrash.KEY_ENABLE_ANR, true);
        CrashApi createInstance = createInstance(a5, a6, a7, iCrashClient, z5, z6, z7);
        createInstance.disableLog(805306368);
        b.a(z8);
        if (z6 || z7) {
            if (e.e("libcrashsdk.so")) {
                createInstance.crashSoLoaded();
            } else {
                a.d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i4 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i4 >= 0 && b.F()) {
            e.b(i4);
        }
        return createInstance;
    }

    public int registerInfoCallback(String str, int i4, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i4, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        return updateCustomInfo(g.a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        updateVersionInfo(g.a(bundle));
    }

    private static void a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        com.uc.crashsdk.d.a(iCrashClient);
        g.a(customInfo, versionInfo);
        if (b.L()) {
            return;
        }
        e.p();
        e.a(context);
        e.b(context);
    }

    public int addDumpFile(String str, String str2, int i4, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i4);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    private static Context a(Context context) {
        if (context != null) {
            if (!f63189c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            a.d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
        a.d("crashsdk", "context can not be null!");
        throw null;
    }

    private static void b(Context context) {
        try {
            if (f63190d) {
                return;
            }
            com.uc.crashsdk.a.g.a(context);
            com.uc.crashsdk.a.f63035a = context.getPackageName();
            f63190d = true;
        } catch (Throwable th) {
            a(th);
        }
    }

    private static void a(Throwable th) {
        new e().a(Thread.currentThread(), th, true);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    private static boolean a(String str) {
        if (b.L()) {
            a.d("crashsdk", "Can not call '" + str + "' in isolated process!");
            return true;
        }
        return false;
    }
}
