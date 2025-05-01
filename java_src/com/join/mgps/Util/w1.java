package com.join.mgps.Util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.ShortcutReceiver;
/* compiled from: ShortcutUtil.java */
/* loaded from: classes3.dex */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28140a = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShortcutUtil.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28142c;

        a(Context context, String str) {
            this.f28141b = context;
            this.f28142c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.join.android.app.common.dialog.d(this.f28141b, this.f28142c).show();
        }
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT > 25) {
            String str = Build.BRAND;
            String str2 = (str.equalsIgnoreCase("vivo") || str.equalsIgnoreCase("iqoo")) ? "清理" : "卸载";
            ShortcutInfoCompat.Builder builder = new ShortcutInfoCompat.Builder(context, "uninstall");
            Intent intent = new Intent("android.intent.action.MAIN", null, context, MGMainActivity_.class);
            intent.setFlags(603979776);
            intent.putExtra("dynamicShortcutType", "uninstall");
            ShortcutManagerCompat.pushDynamicShortcut(context, builder.setShortLabel(str2).setIcon(IconCompat.createWithResource(context, R.drawable.icon)).setIntent(intent).build());
        }
    }

    public static void b(Context context, String str, String str2, Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
        }
        if (bitmap == null) {
            l2.a(context).b("创建失败！");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClass(context, MGMainActivity_.class);
                intent.putExtra("shortcutGameId", str2);
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str).setIntent(intent).build(), PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutReceiver.class), 134217728).getIntentSender());
                e(context, str2);
            }
        } else {
            Intent intent2 = new Intent(f28140a);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, 142, 142, true));
            Intent intent3 = new Intent("android.intent.action.MAIN");
            intent3.setClass(context, MGMainActivity_.class);
            intent3.putExtra("shortcutGameId", str2);
            intent3.addFlags(TTAdConstant.KEY_CLICK_AREA);
            intent3.addCategory("android.intent.category.LAUNCHER");
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
            context.sendBroadcast(intent2);
            e(context, str2);
        }
        new Handler().postDelayed(new a(context, str2), 500L);
    }

    public static void c(Context context, String str, String str2, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClass(context, MGMainActivity_.class);
                intent.putExtra("shortcutGameId", str2);
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str).setIntent(intent).build(), PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutReceiver.class), 134217728).getIntentSender());
                e(context, str2);
                return;
            }
            return;
        }
        Intent intent2 = new Intent(f28140a);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, 142, 142, true));
        Intent intent3 = new Intent("android.intent.action.MAIN");
        intent3.setClass(context, MGMainActivity_.class);
        intent3.putExtra("shortcutGameId", str2);
        intent3.addFlags(TTAdConstant.KEY_CLICK_AREA);
        intent3.addCategory("android.intent.category.LAUNCHER");
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
        context.sendBroadcast(intent2);
        e(context, str2);
    }

    public static boolean d(Context context, String str) {
        if (context == null) {
            return false;
        }
        String d5 = new PrefDef_(context).addedShortcutGames().d();
        if (g2.h(d5) || g2.h(str)) {
            return false;
        }
        return d5.contains(str);
    }

    public static void e(Context context, String str) {
        PrefDef_ prefDef_ = new PrefDef_(context);
        String d5 = prefDef_.addedShortcutGames().d();
        if (g2.i(str)) {
            if (g2.h(d5)) {
                prefDef_.addedShortcutGames().g(str);
            } else if (d5.contains(str)) {
            } else {
                prefDef_.addedShortcutGames().g(d5 + "," + str);
            }
        }
    }

    public static void f(Context context) {
        ShortcutManagerCompat.removeAllDynamicShortcuts(context);
    }

    public static boolean g(Context context, String str) {
        PrefDef_ prefDef_ = new PrefDef_(context);
        String d5 = prefDef_.addedShortcutGames().d();
        if (!g2.h(d5) && !g2.h(str) && !g2.h(d5) && d5.contains(str)) {
            if (d5.contains("," + str)) {
                d5.replace("," + str, "");
            } else {
                d5.replace(str, "");
            }
            prefDef_.addedShortcutGames().g(d5);
        }
        return false;
    }
}
