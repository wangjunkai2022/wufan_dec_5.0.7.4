package com.xinzhu.overmind.shared;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.join.mgps.Util.w0;
import com.join.mgps.va.overmind.VApp;
import com.xinzhu.overmind.Overmind;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OvermindLoadCallback.kt */
/* loaded from: classes.dex */
public final class g {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<Application.ActivityLifecycleCallbacks> f68288c = null;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final String f68290e = "com.join.android.app.mgsim.wufun.virtual.service.dbprovider";

    /* renamed from: a  reason: collision with root package name */
    private final String f68291a = com.xinzhu.overmind.shared.b.class.getSimpleName();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final a f68287b = new a(null);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<Activity> f68289d = new WeakReference<>(null);

    /* compiled from: OvermindLoadCallback.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WeakReference<Application.ActivityLifecycleCallbacks> a() {
            return g.f68288c;
        }

        @NotNull
        public final WeakReference<Activity> b() {
            return g.f68289d;
        }

        public final void c(@Nullable WeakReference<Application.ActivityLifecycleCallbacks> weakReference) {
            g.f68288c = weakReference;
        }

        public final void d(@NotNull WeakReference<Activity> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            g.f68289d = weakReference;
        }
    }

    /* compiled from: OvermindLoadCallback.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.xinzhu.overmind.client.hook.a {
        b() {
        }

        @Override // com.xinzhu.overmind.client.hook.a
        public void a(@NotNull String packageName, @NotNull String processName, @Nullable Application application) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(processName, "processName");
            String unused = g.this.f68291a;
            StringBuilder sb = new StringBuilder();
            sb.append("afterApplicationOnCreate: pkg ");
            sb.append(packageName);
            sb.append(", processName ");
            sb.append(processName);
            if (application != null) {
                try {
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(application).edit();
                    edit.putString("wfMainPkg", Overmind.getMainPkg());
                    edit.putString("wfExtPkg", Overmind.getPluginPkg());
                    edit.apply();
                } catch (Exception unused2) {
                }
            }
            g.this.j(packageName, processName, application);
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", packageName);
                h.a(g.f68290e, "statPoint", null, bundle);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.xinzhu.overmind.client.hook.a
        public void b(@Nullable String str, @Nullable String str2, @Nullable Application application) {
            String unused = g.this.f68291a;
            StringBuilder sb = new StringBuilder();
            sb.append("beforeApplicationOnCreate: pkg ");
            sb.append(str);
            sb.append(", processName ");
            sb.append(str2);
            g.this.h(application);
        }

        @Override // com.xinzhu.overmind.client.hook.a
        public void c(@Nullable String str, @Nullable String str2, @Nullable Context context) {
            String unused = g.this.f68291a;
            StringBuilder sb = new StringBuilder();
            sb.append("beforeCreateApplication: pkg ");
            sb.append(str);
            sb.append(", processName ");
            sb.append(str2);
        }
    }

    /* compiled from: OvermindLoadCallback.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.xinzhu.overmind.client.hook.delegate.a {
        c() {
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, null);
            }
            aVar.d(new WeakReference<>(activity));
            String str = g.this.f68291a;
            com.xinzhu.overmind.b.a(str, "onActivityCreated " + activity.getClass().getSimpleName());
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            }
            aVar.d(new WeakReference<>(activity));
            w0.e("onActivityDestroyed " + activity.getClass().getSimpleName());
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            }
            aVar.d(new WeakReference<>(activity));
            String str = g.this.f68291a;
            com.xinzhu.overmind.b.a(str, "onActivityPaused " + activity.getClass().getSimpleName());
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            }
            aVar.d(new WeakReference<>(activity));
            String str = g.this.f68291a;
            com.xinzhu.overmind.b.a(str, "onActivityResumed " + activity.getClass().getSimpleName());
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            }
            aVar.d(new WeakReference<>(activity));
            String str = g.this.f68291a;
            com.xinzhu.overmind.b.a(str, "onActivityStarted " + activity.getClass().getSimpleName());
        }

        @Override // com.xinzhu.overmind.client.hook.delegate.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
            Intrinsics.checkNotNullParameter(activity, "activity");
            a aVar = g.f68287b;
            WeakReference<Application.ActivityLifecycleCallbacks> a5 = aVar.a();
            if (a5 != null && (activityLifecycleCallbacks = a5.get()) != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            }
            aVar.d(new WeakReference<>(activity));
            String str = g.this.f68291a;
            com.xinzhu.overmind.b.a(str, "onActivityStopped " + activity.getClass().getSimpleName());
        }
    }

    /* compiled from: OvermindLoadCallback.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.xinzhu.overmind.client.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f68294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f68295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f68296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f68297d;

        d(Context context, g gVar, boolean z4, boolean z5) {
            this.f68294a = context;
            this.f68295b = gVar;
            this.f68296c = z4;
            this.f68297d = z5;
        }

        @Override // com.xinzhu.overmind.client.a
        @NotNull
        public String getHostPackageName() {
            String packageName = this.f68294a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return packageName;
        }

        @Override // com.xinzhu.overmind.client.a
        @NotNull
        public String getMainAuthorityPrefix() {
            return "com.join.android.app.mgsim.wufun";
        }

        @Override // com.xinzhu.overmind.client.a
        @NotNull
        public String getMainPackageName() {
            return "com.join.android.app.mgsim.wufun";
        }

        @Override // com.xinzhu.overmind.client.a
        @NotNull
        public String getPluginAuthorityPrefix() {
            return "com.join.android.app.mgsim.wufun.addon";
        }

        @Override // com.xinzhu.overmind.client.a
        @NotNull
        public String getPluginPackageName() {
            return "com.join.android.app.mgsim.wufun.addon";
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean ifDisableDaemonService() {
            return false;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean ifDisablePluginPackageAutoManage() {
            return true;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean ifDisableVirtualDeviceForPackage(@Nullable String str, int i4) {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            bundle.putInt("userId", i4);
            Bundle bundle2 = null;
            try {
                bundle2 = h.a(g.f68290e, "miniGameInfo", null, bundle);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if ((bundle2 == null || !bundle2.getBoolean("isMiniGame")) && VApp.Companion.b()) {
                return bundle2 != null && bundle2.getInt("vm_device_switch") == 0;
            }
            return true;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean isHideRoot() {
            return this.f68296c;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean isHideXposed() {
            return this.f68297d;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean isPluginValid() {
            return this.f68295b.i(this.f68294a);
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean use32BitMainPackage() {
            return true;
        }

        @Override // com.xinzhu.overmind.client.a
        public boolean useRandomGeneratedVirtualDevice() {
            return false;
        }
    }

    public final void f() {
        Overmind.get().setAppLifecycleCallback(new b());
        Overmind.get().setActivityLifecycleCallback(new c());
    }

    public final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        Overmind.get().doAttachBaseContext(context, new d(context, this, sharedPreferences.getBoolean("root_hide", true), sharedPreferences.getBoolean("xp_hide", false)));
    }

    public final void h(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 4);
            if (sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", -1) == -1) {
                sharedPreferences.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 7).apply();
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 4);
            if (sharedPreferences2.getInt("kitsBitmask", -1) == -1) {
                sharedPreferences2.edit().putInt("kitsBitmask", 551).apply();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.join.android.app.mgsim.wufun.addon", 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager\n …TA_DATA\n                )");
            int i4 = applicationInfo.metaData.getInt("support_vm_version");
            boolean z4 = applicationInfo.metaData.getBoolean("full_aar_plugin");
            Integer num = com.xinzhu.overmind.shared.a.f68280j;
            if (num == null) {
                return false;
            }
            return num.intValue() == i4 && z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public final void j(@NotNull String packageName, @NotNull String processName, @Nullable Application application) {
        boolean contains$default;
        int indexOf$default;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (application == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                String str = this.f68291a;
                com.xinzhu.overmind.b.a(str, "isCleartextTrafficPermitted " + isCleartextTrafficPermitted);
            }
            if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(processName)) {
                String str2 = "";
                String str3 = null;
                if (Intrinsics.areEqual(packageName, processName)) {
                    String str4 = this.f68291a;
                    com.xinzhu.overmind.b.a(str4, "launchMod start:" + processName);
                    Object a02 = new com.join.mgps.va.overmind.d().a0(packageName, processName, application);
                    if (a02 != null && (a02 instanceof Application.ActivityLifecycleCallbacks)) {
                        f68288c = new WeakReference<>(a02);
                    }
                    String str5 = this.f68291a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("launchMod finish:");
                    sb.append(processName);
                    sb.append(", activityLifeCallback:");
                    WeakReference<Application.ActivityLifecycleCallbacks> weakReference = f68288c;
                    if (weakReference != null && (activityLifecycleCallbacks = weakReference.get()) != null) {
                        str3 = activityLifecycleCallbacks.getClass().getName();
                    }
                    sb.append(str3);
                    com.xinzhu.overmind.b.a(str5, sb.toString());
                } else {
                    contains$default = StringsKt__StringsKt.contains$default((CharSequence) processName, (CharSequence) ":", false, 2, (Object) null);
                    if (contains$default) {
                        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) processName, ":", 0, false, 6, (Object) null);
                        str2 = processName.substring(indexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).substring(startIndex)");
                    }
                }
                String str6 = this.f68291a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("process->");
                if (TextUtils.isEmpty(str2)) {
                    str2 = "main";
                }
                sb2.append(str2);
                com.xinzhu.overmind.b.a(str6, sb2.toString());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
