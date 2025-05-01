package com.join.mgps.va.overmind;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import com.join.android.app.common.utils.m;
import com.join.mgps.Util.g2;
import com.papa91.arc.MApplication;
import com.xinzhu.overmind.Overmind;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: VApp.kt */
@SourceDebugExtension({"SMAP\nVApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VApp.kt\ncom/join/mgps/va/overmind/VApp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n1855#3,2:181\n*S KotlinDebug\n*F\n+ 1 VApp.kt\ncom/join/mgps/va/overmind/VApp\n*L\n173#1:181,2\n*E\n"})
/* loaded from: classes.dex */
public class VApp extends MApplication {
    @NotNull
    public static final String TAG = "VApp";
    private static Context context;
    protected SharedPreferences sp;
    @NotNull
    public static final a Companion = new a(null);
    private static boolean virtualDeviceStatus = true;

    /* compiled from: VApp.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Context a() {
            Context context = VApp.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                return null;
            }
            return context;
        }

        public final boolean b() {
            return VApp.virtualDeviceStatus;
        }

        public final void c(boolean z4) {
            VApp.virtualDeviceStatus = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(VApp this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        virtualDeviceStatus = this$0.virtualDeviceStatus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context context2) {
        super.attachBaseContext(context2);
        Intrinsics.checkNotNull(context2);
        context = context2;
        if (isEmulator()) {
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("PrefDef", 4);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(\"Pr…_PROCESS or MODE_PRIVATE)");
        setSp(sharedPreferences);
        if (getSp().getBoolean("firstShowUserPermiss", true)) {
            return;
        }
        try {
            com.xinzhu.overmind.shared.g gVar = new com.xinzhu.overmind.shared.g();
            Context context3 = context;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            }
            gVar.g(context3);
            gVar.f();
            if (com.xinzhu.overmind.utils.e.g()) {
                Overmind.get().setXPEnable(false);
            }
            Overmind.get().getAppLifecycleCallback();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @NotNull
    protected final SharedPreferences getSp() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sp");
        return null;
    }

    public final boolean isEmulator() {
        List listOf;
        String a5 = m.a(this);
        StringBuilder sb = new StringBuilder();
        sb.append("emulator check: [");
        sb.append(getPackageName());
        sb.append(' ');
        sb.append(a5);
        sb.append(']');
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{":fba", ":fc", ":gba", ":sfc", ":md", ":gbc", ":ps", ":wsc", ":psp", ":y"});
        Iterator it2 = listOf.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(a5, getPackageName() + ((String) it2.next()))) {
                return true;
            }
        }
        return Build.VERSION.SDK_INT < 21;
    }

    public final boolean isMindProcess() {
        return Overmind.get().isMonitorProcess() || Overmind.get().isServerProcess() || Overmind.get().isVirtualProcess();
    }

    @Override // com.papa91.arc.MApplication, android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (isMindProcess()) {
            return;
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.papa91.arc.MApplication, com.papa91.arc.BuglyApplication, android.app.Application
    public void onCreate() {
        if (isEmulator()) {
            super.onCreate();
            return;
        }
        new Thread(new Runnable() { // from class: com.join.mgps.va.overmind.e
            @Override // java.lang.Runnable
            public final void run() {
                VApp.onCreate$lambda$0(VApp.this);
            }
        }).start();
        if (!getSp().getBoolean("firstShowUserPermiss", true)) {
            Overmind.get().doCreate();
            if (Overmind.get().isVirtualProcess()) {
                Overmind.get().setCustomCallback(new com.xinzhu.overmind.shared.b());
            }
            if (isMindProcess()) {
                return;
            }
        }
        super.onCreate();
    }

    @Nullable
    public String readStringFromFile(@Nullable String str) {
        String str2 = "";
        if (new File(str).exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str), "UTF-8"));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                str2 = str2 + readLine;
                            } catch (IOException e5) {
                                e = e5;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return str2;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        bufferedReader2.close();
                        bufferedReader2.close();
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return str2;
        }
        return "";
    }

    protected final void setSp(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sp = sharedPreferences;
    }

    public boolean virtualDeviceStatus() {
        int i4;
        List listOf;
        try {
            i4 = getSp().getInt("virtualDeviceState", -1);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (i4 != -1) {
            return i4 != 0;
        }
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"294_4.8.8.8", "284_4.8.6.6", "260_4.8.2"});
        StringBuilder sb = new StringBuilder();
        Context context2 = context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        sb.append(context2.getFilesDir().getPath());
        sb.append(File.separator);
        sb.append("host_app.inf");
        String readStringFromFile = readStringFromFile(sb.toString());
        if (g2.i(readStringFromFile)) {
            try {
                JSONObject jSONObject = new JSONObject(readStringFromFile);
                int i5 = jSONObject.getInt("mainHostVersionCode");
                String string = jSONObject.getString("mainHostVersionName");
                if (listOf.contains(i5 + '_' + string)) {
                    getSp().edit().putInt("virtualDeviceState", 0).commit();
                    return false;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                getSp().edit().putInt("virtualDeviceState", 1).commit();
                return true;
            }
        }
        getSp().edit().putInt("virtualDeviceState", 1).commit();
        return true;
    }
}
