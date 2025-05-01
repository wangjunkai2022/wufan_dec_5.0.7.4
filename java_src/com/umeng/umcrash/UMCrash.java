package com.umeng.umcrash;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.h5pagesdk.H5Manager;
import com.efs.sdk.launch.LaunchManager;
import com.efs.sdk.memoryinfo.UMMemoryMonitor;
import com.efs.sdk.pa.IPaClient;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.CustomLogInfo;
import com.uc.crashsdk.export.ICrashClient;
import com.uc.crashsdk.export.LogType;
import com.umeng.pagesdk.PageManger;
import com.umeng.powersdk.PowerManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import q.a;
/* loaded from: classes6.dex */
public class UMCrash {
    private static final boolean DEFAULT_VALUE_CRASH_ANR = true;
    private static final boolean DEFAULT_VALUE_CRASH_JAVA = true;
    private static final boolean DEFAULT_VALUE_CRASH_NATIVE = true;
    private static final boolean DEFAULT_VALUE_CRASH_UNEXP = false;
    private static final boolean DEFAULT_VALUE_FLUTTER = true;
    private static final boolean DEFAULT_VALUE_H5PAGE = true;
    private static final boolean DEFAULT_VALUE_LAUNCH = true;
    private static final boolean DEFAULT_VALUE_MEM = true;
    private static final boolean DEFAULT_VALUE_NET = true;
    private static final boolean DEFAULT_VALUE_PA = true;
    private static final boolean DEFAULT_VALUE_PAGE = true;
    private static final boolean DEFAULT_VALUE_POWER = true;
    private static final String INTEGRATIONTESTING_SP = "itconfig";
    private static final String IT_DEBUGKEY = "apm_debugkey";
    private static final String IT_SENDAGING = "apm_sendaging";
    private static final String KEY_ACTIITY_ON_CREATED = "onCreated";
    private static final String KEY_ACTIITY_ON_DESTROYED = "onDestroyed";
    private static final String KEY_ACTIITY_ON_PAUSED = "onPaused";
    private static final String KEY_ACTIITY_ON_RESUMED = "onResumed";
    private static final String KEY_ACTIITY_ON_STARTED = "onStarted";
    private static final String KEY_ACTIITY_ON_STOPPED = "onStopped";
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_SESSION_ID = "um_session_id";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    private static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    public static final String KEY_DEBUGKEY = "um_dk";
    public static final String KEY_ENABLE_ANR = "enableANRLog";
    public static final String KEY_ENABLE_CRASH_JAVA = "enableJavaLog";
    public static final String KEY_ENABLE_CRASH_NATIVE = "enableNativeLog";
    public static final String KEY_ENABLE_CRASH_UNEXP = "enableUnexpLog";
    public static final String KEY_ENABLE_FLUTTER = "enableFlutterLog";
    public static final String KEY_ENABLE_H5PAGE = "enableH5PageLog";
    public static final String KEY_ENABLE_LAUNCH = "enableLaunchLog";
    public static final String KEY_ENABLE_MEM = "enableMemLog";
    public static final String KEY_ENABLE_NET = "enableNetLog";
    public static final String KEY_ENABLE_PA = "enablePaLog";
    public static final String KEY_ENABLE_PAGE = "enablePageLog";
    public static final String KEY_ENABLE_POWER = "enablePowerLog";
    public static final String KEY_HEADER_ACCESS = "um_access";
    public static final String KEY_HEADER_ACCESS_SUBTYPE = "um_access_subtype";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_BESRIAL = "um_bserial";
    public static final String KEY_HEADER_BSVER = "um_bsver";
    public static final String KEY_HEADER_BVER = "um_bver";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_DEBUGKEY = "um_dk";
    public static final String KEY_HEADER_NETWORK_TYPE = "um_network_type";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    private static final int KEY_MAX_LENGTH = 20480;
    private static final int KEY_MAX_LENGTH_128 = 128;
    public static final String KEY_PA_TIMEOUT_TIME = "pa_timeout_time";
    public static final String SP_KEY_DEBUG = "debugkey";
    public static final String SP_KEY_TIMESTAMP = "timestamp";
    private static final String TAG = "UMCrash";
    private static String crashSdkVersion = "1.9.5";
    private static boolean isBuildId = true;
    private static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isZip = true;
    private static Context mContext;
    private static UMCrashCallback mUMCrashCallback;
    public static EfsReporter sReporter;
    private static String userBesrial;
    private static String userBsver;
    private static String userBver;
    private static Object pageArrayLock = new Object();
    private static ArrayList<String> mArrayList = new ArrayList<>(10);
    private static boolean isPA = false;
    private static boolean isLa = false;
    private static boolean isNet = false;
    private static boolean isPage = false;
    private static boolean isPower = false;
    private static boolean isFlutter = false;
    private static boolean enableJavaLog = true;
    private static boolean enableNativeLog = true;
    private static boolean enableANRLog = true;
    private static boolean enablePaLog = true;
    private static boolean enableLaunchLog = true;
    private static boolean enableMemLog = true;
    private static boolean enableNetLog = true;
    private static boolean enableH5PageLog = true;
    private static boolean enablePageLog = true;
    private static boolean enablePowerLog = true;
    private static boolean enableFlutterLog = true;
    private static final long DEFAULT_PA_TIMEOUT_TIME = 2000;
    private static long paTimeoutTime = DEFAULT_PA_TIMEOUT_TIME;
    private static int index = 0;
    private static boolean isOpenUserCrash = true;
    private static boolean isUploadNowUserCrash = false;

    /* loaded from: classes6.dex */
    private static class CrashClientImpl implements ICrashClient {
        private CrashClientImpl() {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onAddCrashStats(String str, int i4, int i5) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public File onBeforeUploadLog(File file) {
            return file;
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onCrashRestarting(boolean z4) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public String onGetCallbackInfo(String str, boolean z4) {
            String onCallback;
            String str2 = null;
            if (UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                try {
                    if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("source", 0);
                        jSONObject.put("action_name", "page_view");
                        jSONObject.put("action_page_state", UMCrash.isPage);
                        JSONArray jSONArray = new JSONArray();
                        for (int i4 = 0; i4 < UMCrash.mArrayList.size(); i4++) {
                            String str3 = (String) UMCrash.mArrayList.get(i4);
                            if (str3 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", str3);
                                jSONArray.put(jSONObject2);
                            }
                        }
                        jSONObject.put("action_parameter", jSONArray);
                        str2 = jSONObject.toString();
                        if (UMCrash.isDebug) {
                            String unused = UMCrash.TAG;
                            StringBuilder sb = new StringBuilder();
                            sb.append("page json is ");
                            sb.append(str2);
                        }
                    }
                } catch (Throwable unused2) {
                }
                return str2;
            } else if (UMCrash.KEY_CALLBACK_UMID.equals(str)) {
                return UMCrash.getUMID(UMCrash.mContext);
            } else {
                if (UMCrash.KEY_CALLBACK_USER_STRING.equals(str)) {
                    if (UMCrash.mUMCrashCallback == null || (onCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                        return null;
                    }
                    return onCallback.trim().getBytes().length > UMCrash.KEY_MAX_LENGTH ? UMCrashUtils.splitByByte(onCallback, UMCrash.KEY_MAX_LENGTH) : onCallback;
                } else if (UMCrash.KEY_CALLBACK_SESSION_ID.equals(str)) {
                    return UMCrash.getSessionId(UMCrash.mContext);
                } else {
                    return null;
                }
            }
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onLogGenerated(File file, String str) {
        }
    }

    /* loaded from: classes6.dex */
    private static class PaClientImpl implements IPaClient {
        private PaClientImpl() {
        }

        @Override // com.efs.sdk.pa.IPaClient
        public String onGetCallbackInfo() {
            String onCallback;
            if (UMCrash.mUMCrashCallback == null || (onCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                return null;
            }
            return onCallback.trim().getBytes().length > UMCrash.KEY_MAX_LENGTH ? UMCrashUtils.splitByByte(onCallback, UMCrash.KEY_MAX_LENGTH) : onCallback;
        }
    }

    static /* synthetic */ int access$1008() {
        int i4 = index;
        index = i4 + 1;
        return i4;
    }

    static /* synthetic */ int access$1010() {
        int i4 = index;
        index = i4 - 1;
        return i4;
    }

    @Deprecated
    public static void enableANRLog(boolean z4) {
        enableANRLog = z4;
    }

    public static void enableJavaScriptBridge(WebView webView) {
        enableJavaScriptBridge((View) webView);
    }

    @Deprecated
    public static void enableMemoryMonitor(boolean z4) {
        UMMemoryMonitor.get().setEnable(z4);
    }

    @Deprecated
    public static void enableNativeLog(boolean z4) {
        enableNativeLog = z4;
    }

    public static void generateCustomLog(Throwable th, String str) {
        if (isOpenUserCrash && th != null && !TextUtils.isEmpty(str)) {
            try {
                CustomLogInfo build = new UMCustomLogInfoBuilder(str).stack(th).build();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(KEY_CALLBACK_UMID);
                arrayList.add(KEY_CALLBACK_PAGE_ACTION);
                arrayList.add(KEY_CALLBACK_SESSION_ID);
                arrayList.add(KEY_CALLBACK_USER_STRING);
                build.mCallbacks = arrayList;
                StringBuilder sb = new StringBuilder();
                sb.append("upload is ");
                sb.append(isUploadNowUserCrash);
                build.mUploadNow = isUploadNowUserCrash;
                CrashApi crashApi = CrashApi.getInstance();
                if (crashApi == null) {
                    return;
                }
                crashApi.generateCustomLog(build);
            } catch (Throwable unused) {
            }
        }
    }

    public static EfsReporter getReporter() {
        return sReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String getSessionId(Context context) {
        Class<?> cls;
        Method method;
        synchronized (UMCrash.class) {
            String str = null;
            if (context == null) {
                return null;
            }
            try {
                cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    method = cls.getMethod("getSid", Context.class);
                } catch (NoSuchMethodException unused2) {
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(null, context);
                        if (invoke != null) {
                            str = invoke.toString();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
            }
            return str;
        }
    }

    public static String getUMAPMFlag() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 0);
            jSONObject.put("crash", 1);
            if (enableJavaLog) {
                jSONObject.put("crashJava", 1);
            } else {
                jSONObject.put("crashJava", 0);
            }
            if (enableNativeLog) {
                jSONObject.put("crashNative", 1);
            } else {
                jSONObject.put("crashNative", 0);
            }
            if (enableANRLog) {
                jSONObject.put(LogType.ANR_TYPE, 1);
            } else {
                jSONObject.put(LogType.ANR_TYPE, 0);
            }
            if (isPA) {
                jSONObject.put("pa", 1);
            } else {
                jSONObject.put("pa", 0);
            }
            if (isLa) {
                jSONObject.put("la", 1);
            } else {
                jSONObject.put("la", 0);
            }
            if (UMMemoryMonitor.get().isEnable()) {
                jSONObject.put("mem", 1);
            } else {
                jSONObject.put("mem", 0);
            }
            if (isNet) {
                jSONObject.put("net", 1);
            } else {
                jSONObject.put("net", 0);
            }
            if (H5Manager.getH5ConfigMananger() != null && H5Manager.getH5ConfigMananger().isH5TracerEnable()) {
                jSONObject.put("h5", 1);
            } else {
                jSONObject.put("h5", 0);
            }
            if (isOpenUserCrash) {
                jSONObject.put("crashUser", 1);
            } else {
                jSONObject.put("crashUser", 0);
            }
            if (isPage) {
                jSONObject.put("page", 1);
            } else {
                jSONObject.put("page", 0);
            }
            if (isPower) {
                jSONObject.put("power", 1);
            } else {
                jSONObject.put("power", 0);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String getUMID(Context context) {
        Class<?> cls;
        Method method;
        synchronized (UMCrash.class) {
            String str = null;
            if (context == null) {
                return null;
            }
            try {
                cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    method = cls.getMethod("getUMIDString", Context.class);
                } catch (NoSuchMethodException unused2) {
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(null, context);
                        if (invoke != null) {
                            str = invoke.toString();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
            }
            return str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:4|(2:5|6)|7|(4:8|9|(1:11)|(1:14))|16|(5:17|18|(1:20)|(1:22)(1:221)|23)|24|(15:25|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)(1:218)|38|(1:40)|41|42|(1:44)(1:217)|45)|(5:(53:47|48|49|50|51|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|66|67|(1:69)(1:213)|70|(1:72)|73|75|76|77|78|(1:207)(1:82)|83|84|(1:86)(1:204)|87|88|(5:90|91|(1:93)|94|(1:200))(1:201)|98|99|(1:101)(1:197)|102|103|(1:105)|(1:107)(2:179|(2:181|(3:183|184|(4:186|(1:188)|189|(1:191)(1:(1:193))))(1:194)))|108|109|(1:111)|(1:113)(2:171|(2:173|(1:175)(1:176)))|114|115|(1:117)|(1:119)(2:160|(2:162|(3:164|165|(1:167))(1:168)))|120|121|(1:123)|(1:125)(2:149|(2:151|(3:153|154|(1:156))(1:157)))|126|127|(1:129)|(2:135|(3:137|138|(2:140|142)(1:143))(1:144))(1:145))|126|127|(0)|(2:131|132)(3:133|135|(0)(0)))|216|75|76|77|78|(1:80)|207|83|84|(0)(0)|87|88|(0)(0)|98|99|(0)(0)|102|103|(0)|(0)(0)|108|109|(0)|(0)(0)|114|115|(0)|(0)(0)|120|121|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:4|(2:5|6)|7|(4:8|9|(1:11)|(1:14))|16|(5:17|18|(1:20)|(1:22)(1:221)|23)|24|25|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)(1:218)|38|(1:40)|41|42|(1:44)(1:217)|45|(5:(53:47|48|49|50|51|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|66|67|(1:69)(1:213)|70|(1:72)|73|75|76|77|78|(1:207)(1:82)|83|84|(1:86)(1:204)|87|88|(5:90|91|(1:93)|94|(1:200))(1:201)|98|99|(1:101)(1:197)|102|103|(1:105)|(1:107)(2:179|(2:181|(3:183|184|(4:186|(1:188)|189|(1:191)(1:(1:193))))(1:194)))|108|109|(1:111)|(1:113)(2:171|(2:173|(1:175)(1:176)))|114|115|(1:117)|(1:119)(2:160|(2:162|(3:164|165|(1:167))(1:168)))|120|121|(1:123)|(1:125)(2:149|(2:151|(3:153|154|(1:156))(1:157)))|126|127|(1:129)|(2:135|(3:137|138|(2:140|142)(1:143))(1:144))(1:145))|126|127|(0)|(2:131|132)(3:133|135|(0)(0)))|216|75|76|77|78|(1:80)|207|83|84|(0)(0)|87|88|(0)(0)|98|99|(0)(0)|102|103|(0)|(0)(0)|108|109|(0)|(0)(0)|114|115|(0)|(0)(0)|120|121|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(56:4|5|6|7|(4:8|9|(1:11)|(1:14))|16|(5:17|18|(1:20)|(1:22)(1:221)|23)|24|25|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)(1:218)|38|(1:40)|41|42|(1:44)(1:217)|45|(5:(53:47|48|49|50|51|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|66|67|(1:69)(1:213)|70|(1:72)|73|75|76|77|78|(1:207)(1:82)|83|84|(1:86)(1:204)|87|88|(5:90|91|(1:93)|94|(1:200))(1:201)|98|99|(1:101)(1:197)|102|103|(1:105)|(1:107)(2:179|(2:181|(3:183|184|(4:186|(1:188)|189|(1:191)(1:(1:193))))(1:194)))|108|109|(1:111)|(1:113)(2:171|(2:173|(1:175)(1:176)))|114|115|(1:117)|(1:119)(2:160|(2:162|(3:164|165|(1:167))(1:168)))|120|121|(1:123)|(1:125)(2:149|(2:151|(3:153|154|(1:156))(1:157)))|126|127|(1:129)|(2:135|(3:137|138|(2:140|142)(1:143))(1:144))(1:145))|126|127|(0)|(2:131|132)(3:133|135|(0)(0)))|216|75|76|77|78|(1:80)|207|83|84|(0)(0)|87|88|(0)(0)|98|99|(0)(0)|102|103|(0)|(0)(0)|108|109|(0)|(0)(0)|114|115|(0)|(0)(0)|120|121|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:4|5|6|7|(4:8|9|(1:11)|(1:14))|16|17|18|(1:20)|(1:22)(1:221)|23|24|25|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)(1:218)|38|(1:40)|41|42|(1:44)(1:217)|45|(5:(53:47|48|49|50|51|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|66|67|(1:69)(1:213)|70|(1:72)|73|75|76|77|78|(1:207)(1:82)|83|84|(1:86)(1:204)|87|88|(5:90|91|(1:93)|94|(1:200))(1:201)|98|99|(1:101)(1:197)|102|103|(1:105)|(1:107)(2:179|(2:181|(3:183|184|(4:186|(1:188)|189|(1:191)(1:(1:193))))(1:194)))|108|109|(1:111)|(1:113)(2:171|(2:173|(1:175)(1:176)))|114|115|(1:117)|(1:119)(2:160|(2:162|(3:164|165|(1:167))(1:168)))|120|121|(1:123)|(1:125)(2:149|(2:151|(3:153|154|(1:156))(1:157)))|126|127|(1:129)|(2:135|(3:137|138|(2:140|142)(1:143))(1:144))(1:145))|126|127|(0)|(2:131|132)(3:133|135|(0)(0)))|216|75|76|77|78|(1:80)|207|83|84|(0)(0)|87|88|(0)(0)|98|99|(0)(0)|102|103|(0)|(0)(0)|108|109|(0)|(0)(0)|114|115|(0)|(0)(0)|120|121|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0251, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0288, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0289, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029d, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02de, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02df, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f4, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x036c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x036d, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a4, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03f2, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x043f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0440, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0250, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290 A[Catch: all -> 0x029c, TryCatch #22 {all -> 0x029c, blocks: (B:110:0x028c, B:112:0x0290, B:113:0x0299), top: B:252:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0299 A[Catch: all -> 0x029c, TRY_LEAVE, TryCatch #22 {all -> 0x029c, blocks: (B:110:0x028c, B:112:0x0290, B:113:0x0299), top: B:252:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a4 A[Catch: all -> 0x02de, TRY_LEAVE, TryCatch #23 {all -> 0x02de, blocks: (B:117:0x02a0, B:119:0x02a4, B:126:0x02be, B:128:0x02c4, B:130:0x02ca, B:131:0x02db, B:120:0x02a9, B:122:0x02af), top: B:253:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02db A[Catch: all -> 0x02de, TRY_LEAVE, TryCatch #23 {all -> 0x02de, blocks: (B:117:0x02a0, B:119:0x02a4, B:126:0x02be, B:128:0x02c4, B:130:0x02ca, B:131:0x02db, B:120:0x02a9, B:122:0x02af), top: B:253:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6 A[Catch: all -> 0x02f3, TryCatch #20 {all -> 0x02f3, blocks: (B:135:0x02e2, B:137:0x02e6, B:138:0x02f0), top: B:261:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f0 A[Catch: all -> 0x02f3, TRY_LEAVE, TryCatch #20 {all -> 0x02f3, blocks: (B:135:0x02e2, B:137:0x02e6, B:138:0x02f0), top: B:261:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0305 A[Catch: all -> 0x036c, TryCatch #22 {all -> 0x036c, blocks: (B:142:0x02f7, B:144:0x0305, B:146:0x0314, B:149:0x031b, B:151:0x0321, B:165:0x0369, B:152:0x0326, B:154:0x032c, B:156:0x0344, B:159:0x0355, B:161:0x0361), top: B:259:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0314 A[Catch: all -> 0x036c, TryCatch #22 {all -> 0x036c, blocks: (B:142:0x02f7, B:144:0x0305, B:146:0x0314, B:149:0x031b, B:151:0x0321, B:165:0x0369, B:152:0x0326, B:154:0x032c, B:156:0x0344, B:159:0x0355, B:161:0x0361), top: B:259:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037e A[Catch: all -> 0x03a3, TryCatch #25 {all -> 0x03a3, blocks: (B:169:0x0370, B:171:0x037e, B:173:0x038d, B:176:0x0394, B:178:0x039a, B:179:0x03a0), top: B:256:0x0370 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038d A[Catch: all -> 0x03a3, TryCatch #25 {all -> 0x03a3, blocks: (B:169:0x0370, B:171:0x037e, B:173:0x038d, B:176:0x0394, B:178:0x039a, B:179:0x03a0), top: B:256:0x0370 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b5 A[Catch: all -> 0x03f1, TryCatch #21 {all -> 0x03f1, blocks: (B:183:0x03a7, B:185:0x03b5, B:187:0x03c4, B:190:0x03cb, B:192:0x03d1, B:199:0x03ee, B:193:0x03d8, B:195:0x03de), top: B:260:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c4 A[Catch: all -> 0x03f1, TryCatch #21 {all -> 0x03f1, blocks: (B:183:0x03a7, B:185:0x03b5, B:187:0x03c4, B:190:0x03cb, B:192:0x03d1, B:199:0x03ee, B:193:0x03d8, B:195:0x03de), top: B:260:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0403 A[Catch: all -> 0x043f, TryCatch #18 {all -> 0x043f, blocks: (B:203:0x03f5, B:205:0x0403, B:207:0x0412, B:210:0x0419, B:212:0x041f, B:219:0x043c, B:213:0x0426, B:215:0x042c), top: B:262:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0412 A[Catch: all -> 0x043f, TryCatch #18 {all -> 0x043f, blocks: (B:203:0x03f5, B:205:0x0403, B:207:0x0412, B:210:0x0419, B:212:0x041f, B:219:0x043c, B:213:0x0426, B:215:0x042c), top: B:262:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0451 A[Catch: all -> 0x0488, TryCatch #16 {all -> 0x0488, blocks: (B:223:0x0443, B:225:0x0451, B:230:0x0465, B:232:0x046b, B:233:0x0472, B:235:0x0478), top: B:265:0x0443 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046b A[Catch: all -> 0x0488, TRY_LEAVE, TryCatch #16 {all -> 0x0488, blocks: (B:223:0x0443, B:225:0x0451, B:230:0x0465, B:232:0x046b, B:233:0x0472, B:235:0x0478), top: B:265:0x0443 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void init(final android.content.Context r16, final java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umcrash.UMCrash.init(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void initConfig(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean(KEY_ENABLE_CRASH_JAVA, true)) {
                enableJavaLog = true;
            } else {
                enableJavaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_CRASH_NATIVE, true)) {
                enableNativeLog = true;
            } else {
                enableNativeLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_ANR, true)) {
                enableANRLog = true;
            } else {
                enableANRLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_PA, true)) {
                enablePaLog = true;
            } else {
                enablePaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_LAUNCH, true)) {
                enableLaunchLog = true;
            } else {
                enableLaunchLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_MEM, true)) {
                enableMemLog = true;
            } else {
                enableMemLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_NET, true)) {
                enableNetLog = true;
            } else {
                enableNetLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_H5PAGE, true)) {
                enableH5PageLog = true;
            } else {
                enableH5PageLog = false;
            }
            paTimeoutTime = bundle.getLong(KEY_PA_TIMEOUT_TIME, DEFAULT_PA_TIMEOUT_TIME);
            if (bundle.getBoolean(KEY_ENABLE_PAGE, true)) {
                enablePageLog = true;
            } else {
                enablePageLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_POWER, true)) {
                enablePowerLog = true;
            } else {
                enablePowerLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_FLUTTER, true)) {
                enableFlutterLog = true;
            } else {
                enableFlutterLog = false;
            }
        }
    }

    private static void initReporter(final Context context, String str, String str2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(KEY_HEADER_UMID, getUMID(context));
        hashMap.put(KEY_HEADER_CHANNEL, str2);
        hashMap.put(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
        hashMap.put(KEY_HEADER_OS, a.f73126a);
        hashMap.put(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
        try {
            String[] activeUser = UMCrashUtils.getActiveUser(context);
            if (activeUser != null && activeUser.length == 2) {
                hashMap.put(KEY_HEADER_PUID, activeUser[1]);
                hashMap.put(KEY_HEADER_PROVIDER, activeUser[0]);
            }
        } catch (Throwable unused) {
            hashMap.put(KEY_HEADER_PUID, "");
            hashMap.put(KEY_HEADER_PROVIDER, "");
        }
        if (!TextUtils.isEmpty(userBver)) {
            hashMap.put(KEY_HEADER_BVER, userBver);
        }
        if (!TextUtils.isEmpty(userBsver)) {
            hashMap.put(KEY_HEADER_BSVER, userBsver);
        }
        if (!TextUtils.isEmpty(userBesrial)) {
            hashMap.put(KEY_HEADER_BESRIAL, userBesrial);
        }
        try {
            if (UMCrashUtils.isHarmony(context)) {
                hashMap.put("others_OS", "harmony");
            } else {
                hashMap.put("others_OS", "Android");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        EfsReporter build = new EfsReporter.Builder(context.getApplicationContext(), str, KEY_APM_DEFAULT_SECRET).debug(isDebug).efsDirRootName(KEY_APM_ROOT_NAME).printLogDetail(isDebug).intl(isIntl).enableWaStat(false).build();
        sReporter = build;
        build.addPublicParams(hashMap);
        try {
            sReporter.getAllSdkConfig(new String[]{UMCrashContent.APM_STATE_HIT_WL, UMCrashContent.APM_STATE_FLUTTER, UMCrashContent.APM_STATE_POWER, UMCrashContent.APM_STATE_PAGE, UMCrashContent.APM_STATE_NET, UMCrashContent.APM_STATE_NET_REQUEST_BODY, UMCrashContent.APM_STATE_NATIVE_H5, UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE, UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE, UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE, UMCrashContent.APM_CRASH_USER_SAMPLING_RATE, UMCrashContent.APM_CRASH_USER_MAX_COUNT, UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE}, new IConfigCallback() { // from class: com.umeng.umcrash.UMCrash.6
                @Override // com.efs.sdk.base.observer.IConfigCallback
                public void onChange(Map<String, Object> map) {
                    try {
                        Object obj = map.get(UMCrashContent.APM_STATE_NET);
                        if (obj != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("callback netRate is ");
                                sb.append(obj.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET, obj);
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    try {
                        Object obj2 = map.get(UMCrashContent.APM_STATE_NET_REQUEST_BODY);
                        if (obj2 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("callback netReqBodyRate is ");
                                sb2.append(obj2.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET_REQUEST_BODY, obj2);
                        }
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    try {
                        Object obj3 = map.get(UMCrashContent.APM_STATE_NATIVE_H5);
                        if (obj3 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("callback nativeH5Rate is ");
                                sb3.append(obj3.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NATIVE_H5, obj3);
                        }
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    try {
                        UMCrash.saveLocalCrashSampling(context, map);
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                    try {
                        UMCrash.updateLocalCrashConfig(context, map);
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                    try {
                        Object obj4 = map.get(UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE);
                        if (obj4 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("callback uploadType is ");
                                sb4.append(obj4.toString());
                            }
                            if (Integer.valueOf(obj4.toString()).intValue() == 0) {
                                boolean unused2 = UMCrash.isUploadNowUserCrash = true;
                            } else {
                                boolean unused3 = UMCrash.isUploadNowUserCrash = false;
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, obj4);
                        }
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                    }
                    try {
                        Object obj5 = map.get(UMCrashContent.APM_STATE_PAGE);
                        if (obj5 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("callback pageRate is ");
                                sb5.append(obj5.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_PAGE, obj5);
                        }
                    } catch (Throwable th8) {
                        th8.printStackTrace();
                    }
                    try {
                        Object obj6 = map.get(UMCrashContent.APM_STATE_POWER);
                        if (obj6 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("callback powerRate is ");
                                sb6.append(obj6);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_POWER, obj6);
                        }
                    } catch (Throwable th9) {
                        th9.printStackTrace();
                    }
                    try {
                        Object obj7 = map.get(UMCrashContent.APM_STATE_HIT_WL);
                        if (obj7 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("callback hitwl is ");
                                sb7.append(obj7);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_HIT_WL, obj7);
                        }
                    } catch (Throwable th10) {
                        th10.printStackTrace();
                    }
                    try {
                        Object obj8 = map.get(UMCrashContent.APM_STATE_FLUTTER);
                        if (obj8 != null) {
                            if (UMCrash.isDebug) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("callback flutterRate is ");
                                sb8.append(obj8);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_FLUTTER, obj8);
                        }
                    } catch (Throwable th11) {
                        th11.printStackTrace();
                    }
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void isBuildId(boolean z4) {
        isBuildId = z4;
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
        if (uMCrashCallback != null) {
            mUMCrashCallback = uMCrashCallback;
            if (CrashApi.getInstance() != null) {
                CrashApi.getInstance().registerInfoCallback(KEY_CALLBACK_USER_STRING, 1048593);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveActivityState(String str, String str2) {
        try {
            ArrayList<String> arrayList = mArrayList;
            if (arrayList != null) {
                if (arrayList.size() >= 20) {
                    mArrayList.remove(0);
                }
                ArrayList<String> arrayList2 = mArrayList;
                arrayList2.add(str + "-" + System.currentTimeMillis() + "-" + str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveLocalCrashSampling(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return;
        }
        Object obj = map.get(UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE);
        if (obj != null) {
            if (isDebug) {
                StringBuilder sb = new StringBuilder();
                sb.append("callback crashJavaSampling is ");
                sb.append(obj.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE, obj);
        }
        Object obj2 = map.get(UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE);
        if (obj2 != null) {
            if (isDebug) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("callback crashNativeSampling is ");
                sb2.append(obj2.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE, obj2);
        }
        Object obj3 = map.get(UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE);
        if (obj3 != null) {
            if (isDebug) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("callback crashANRSampling is ");
                sb3.append(obj3.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE, obj3);
        }
        Object obj4 = map.get(UMCrashContent.APM_CRASH_USER_SAMPLING_RATE);
        if (obj4 != null) {
            if (isDebug) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("callback crashUserSampling is ");
                sb4.append(obj4.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_SAMPLING_RATE, obj4);
        }
    }

    public static void setAppVersion(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.trim().getBytes().length > 128) {
                    str = UMCrashUtils.splitByByte(str, 128);
                }
                userBver = str;
            } else {
                boolean z4 = isDebug;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2.trim().getBytes().length > 128) {
                    str2 = UMCrashUtils.splitByByte(str2, 128);
                }
                userBsver = str2;
            } else {
                boolean z5 = isDebug;
            }
            if (!TextUtils.isEmpty(str3)) {
                if (str3.trim().getBytes().length > 128) {
                    str3 = UMCrashUtils.splitByByte(str3, 128);
                }
                userBesrial = str3;
            } else {
                boolean z6 = isDebug;
            }
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi != null) {
                if (!TextUtils.isEmpty(userBver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BVER, userBver);
                }
                if (!TextUtils.isEmpty(userBsver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                }
                if (!TextUtils.isEmpty(userBesrial)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                }
            } else {
                boolean z7 = isDebug;
            }
            HashMap hashMap = new HashMap(1);
            if (!TextUtils.isEmpty(userBver)) {
                hashMap.put(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                hashMap.put(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                hashMap.put(KEY_HEADER_BESRIAL, userBesrial);
            }
            EfsReporter efsReporter = sReporter;
            if (efsReporter != null) {
                efsReporter.addPublicParams(hashMap);
            } else {
                boolean z8 = isDebug;
            }
            if (!TextUtils.isEmpty(userBver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BSVER, userBsver);
            }
            if (TextUtils.isEmpty(userBesrial)) {
                return;
            }
            UMCrashUtils.setCommonTag(KEY_HEADER_BESRIAL, userBesrial);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setDebug(boolean z4) {
        isDebug = z4;
        LaunchManager.isDebug = z4;
        H5Manager.isDebug = z4;
        PageManger.isDebug = z4;
        PowerManager.isDebug = z4;
    }

    public static void setPaTimeoutTime(long j4) {
        paTimeoutTime = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateLocalCrashConfig(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        Object obj = map.get(UMCrashContent.APM_CRASH_USER_MAX_COUNT);
        if (obj != null) {
            if (isDebug) {
                StringBuilder sb = new StringBuilder();
                sb.append("callback crashMaxUserCount is ");
                sb.append(obj.toString());
            }
            bundle.putInt("mMaxCustomLogCountPerTypePerDay", Integer.valueOf(obj.toString()).intValue());
            bundle.putInt("mMaxUploadCustomLogCountPerDay", Integer.valueOf(obj.toString()).intValue());
        }
        CrashApi.getInstance().updateCustomInfo(bundle);
    }

    private static void updateLocalCrashSampling(Object obj, Object obj2, Object obj3, Object obj4) {
        CrashApi crashApi = CrashApi.getInstance();
        if (crashApi != null) {
            if (obj != null && UMCrashUtils.random(Integer.valueOf(obj.toString()).intValue())) {
                crashApi.disableLog(16);
            }
            if (obj2 != null && UMCrashUtils.random(Integer.valueOf(obj2.toString()).intValue())) {
                crashApi.disableLog(1);
            }
            if (obj3 != null && UMCrashUtils.random(Integer.valueOf(obj3.toString()).intValue())) {
                crashApi.disableLog(1048576);
            }
            if (obj4 == null || !UMCrashUtils.random(Integer.valueOf(obj4.toString()).intValue())) {
                return;
            }
            isOpenUserCrash = false;
        }
    }

    private static void useIntlServices(boolean z4) {
        isIntl = z4;
        if (isDebug) {
            StringBuilder sb = new StringBuilder();
            sb.append("useIntlServices is ");
            sb.append(isIntl);
        }
    }

    public static void enableJavaScriptBridge(View view) {
        try {
            H5Manager.setWebView(view);
        } catch (Throwable unused) {
        }
    }

    public static void generateCustomLog(String str, String str2) {
        if (isOpenUserCrash && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                CustomLogInfo customLogInfo = new CustomLogInfo(null, "exception");
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(KEY_CALLBACK_UMID);
                arrayList.add(KEY_CALLBACK_PAGE_ACTION);
                arrayList.add(KEY_CALLBACK_SESSION_ID);
                arrayList.add(KEY_CALLBACK_USER_STRING);
                customLogInfo.mCallbacks = arrayList;
                StringBuilder sb = new StringBuilder();
                sb.append("upload is ");
                sb.append(isUploadNowUserCrash);
                customLogInfo.mUploadNow = isUploadNowUserCrash;
                HashMap hashMap = new HashMap(20);
                hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
                hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
                StringBuffer stringBuffer = new StringBuffer();
                for (Map.Entry entry : hashMap.entrySet()) {
                    stringBuffer.append((String) entry.getKey());
                    stringBuffer.append(":");
                    stringBuffer.append((String) entry.getValue());
                    stringBuffer.append("\n");
                }
                String str3 = "Exception message:\nBack traces starts.\n" + str + "\nBack traces ends.";
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append(str3);
                    stringBuffer.append("\n");
                }
                customLogInfo.mData = stringBuffer;
                CrashApi crashApi = CrashApi.getInstance();
                if (crashApi == null) {
                    return;
                }
                crashApi.generateCustomLog(customLogInfo);
            } catch (Throwable unused) {
            }
        }
    }
}
