package com.join.kotlin.base.ext;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SystemServiceExt.kt */
@SourceDebugExtension({"SMAP\nSystemServiceExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemServiceExt.kt\ncom/join/kotlin/base/ext/SystemServiceExtKt\n*L\n1#1,59:1\n30#1:60\n30#1:61\n30#1:62\n30#1:63\n30#1:64\n30#1:65\n30#1:66\n30#1:67\n30#1:68\n30#1:69\n30#1:70\n30#1:71\n30#1:72\n30#1:73\n30#1:74\n30#1:75\n30#1:76\n30#1:77\n30#1:78\n30#1:79\n30#1:80\n30#1:81\n30#1:82\n30#1:83\n30#1:84\n30#1:85\n*S KotlinDebug\n*F\n+ 1 SystemServiceExt.kt\ncom/join/kotlin/base/ext/SystemServiceExtKt\n*L\n32#1:60\n33#1:61\n34#1:62\n35#1:63\n36#1:64\n37#1:65\n38#1:66\n39#1:67\n40#1:68\n41#1:69\n42#1:70\n43#1:71\n44#1:72\n45#1:73\n46#1:74\n47#1:75\n48#1:76\n49#1:77\n50#1:78\n51#1:79\n52#1:80\n53#1:81\n54#1:82\n55#1:83\n56#1:84\n57#1:85\n*E\n"})
/* loaded from: classes3.dex */
public final class SystemServiceExtKt {
    @Nullable
    public static final AccessibilityManager getAccessibilityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
    }

    @Nullable
    public static final ActivityManager getActivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ActivityManager) ContextCompat.getSystemService(context, ActivityManager.class);
    }

    @Nullable
    public static final AlarmManager getAlarmManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (AlarmManager) ContextCompat.getSystemService(context, AlarmManager.class);
    }

    @Nullable
    public static final AudioManager getAudioManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (AudioManager) ContextCompat.getSystemService(context, AudioManager.class);
    }

    @Nullable
    public static final BatteryManager getBatteryManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (BatteryManager) ContextCompat.getSystemService(context, BatteryManager.class);
    }

    @Nullable
    public static final CarrierConfigManager getCarrierConfigManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (CarrierConfigManager) ContextCompat.getSystemService(context, CarrierConfigManager.class);
    }

    @Nullable
    public static final ClipboardManager getClipboardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ClipboardManager) ContextCompat.getSystemService(context, ClipboardManager.class);
    }

    @Nullable
    public static final ConnectivityManager getConnectivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
    }

    @Nullable
    public static final DownloadManager getDownloadManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DownloadManager) ContextCompat.getSystemService(context, DownloadManager.class);
    }

    @Nullable
    public static final InputMethodManager getInputMethodManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (InputMethodManager) ContextCompat.getSystemService(context, InputMethodManager.class);
    }

    @Nullable
    public static final JobScheduler getJobScheduler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (JobScheduler) ContextCompat.getSystemService(context, JobScheduler.class);
    }

    @Nullable
    public static final KeyguardManager getKeyguardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (KeyguardManager) ContextCompat.getSystemService(context, KeyguardManager.class);
    }

    @Nullable
    public static final LayoutInflater getLayoutInflater(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (LayoutInflater) ContextCompat.getSystemService(context, LayoutInflater.class);
    }

    @Nullable
    public static final LocationManager getLocationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (LocationManager) ContextCompat.getSystemService(context, LocationManager.class);
    }

    @Nullable
    public static final MediaRouter getMediaRouter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (MediaRouter) ContextCompat.getSystemService(context, MediaRouter.class);
    }

    @Nullable
    public static final NotificationManager getNotificationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (NotificationManager) ContextCompat.getSystemService(context, NotificationManager.class);
    }

    @Nullable
    public static final PowerManager getPowerManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (PowerManager) ContextCompat.getSystemService(context, PowerManager.class);
    }

    @Nullable
    public static final SearchManager getSearchManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (SearchManager) ContextCompat.getSystemService(context, SearchManager.class);
    }

    @Nullable
    public static final SensorManager getSensorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (SensorManager) ContextCompat.getSystemService(context, SensorManager.class);
    }

    @Nullable
    public static final StorageManager getStorageManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (StorageManager) ContextCompat.getSystemService(context, StorageManager.class);
    }

    @Nullable
    public static final SubscriptionManager getSubscriptionManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (SubscriptionManager) ContextCompat.getSystemService(context, SubscriptionManager.class);
    }

    public static final /* synthetic */ <T> T getSystemService(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    @Nullable
    public static final TelephonyManager getTelephonyManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
    }

    @Nullable
    public static final UiModeManager getUiModeManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (UiModeManager) ContextCompat.getSystemService(context, UiModeManager.class);
    }

    @Nullable
    public static final Vibrator getVibrator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (Vibrator) ContextCompat.getSystemService(context, Vibrator.class);
    }

    @Nullable
    public static final WifiManager getWifiManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (WifiManager) ContextCompat.getSystemService(context, WifiManager.class);
    }

    @Nullable
    public static final WindowManager getWindowManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (WindowManager) ContextCompat.getSystemService(context, WindowManager.class);
    }
}
