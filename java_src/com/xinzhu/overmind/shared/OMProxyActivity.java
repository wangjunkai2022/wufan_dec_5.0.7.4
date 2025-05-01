package com.xinzhu.overmind.shared;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OMProxyActivity.kt */
/* loaded from: classes6.dex */
public final class OMProxyActivity extends ComponentActivity {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f68263e = new a(null);
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final String f68264f = "com.om.proxy.action.BACKGROUND_RUNNING";
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private static final String f68265g = "com.om.proxy.action.ACTION_FINISH";
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final String f68266h = "com.om.proxy.action.INTENT_FINISH";
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f68267b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private Dialog f68268c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private ActivityResultLauncher<Intent> f68269d;

    /* compiled from: OMProxyActivity.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return OMProxyActivity.f68264f;
        }

        @NotNull
        public final String b() {
            return OMProxyActivity.f68265g;
        }

        @NotNull
        public final String c() {
            return OMProxyActivity.f68266h;
        }
    }

    public OMProxyActivity() {
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.xinzhu.overmind.shared.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                OMProxyActivity.q0(OMProxyActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f68269d = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(OMProxyActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(this$0.p0(this$0) ? -1 : 0);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(OMProxyActivity this$0, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + this$0.getPackageName()));
        this$0.f68269d.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(OMProxyActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Dialog dialog = this$0.f68268c;
            if (dialog != null) {
                dialog.dismiss();
            }
            this$0.f68268c = null;
            this$0.setResult(Build.VERSION.SDK_INT >= 23 ? this$0.p0(this$0) : true ? -1 : 0);
            this$0.finish();
        }
    }

    public final void k0() {
        Dialog dialog;
        Intent intent = getIntent();
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, f68264f)) {
            try {
                if (Build.VERSION.SDK_INT >= 23 && !p0(this)) {
                    boolean z4 = false;
                    if (this.f68268c == null) {
                        this.f68268c = new AlertDialog.Builder(this).setTitle("提示").setMessage("为保证应用正常运行，请允许本应用在后台运行").setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xinzhu.overmind.shared.d
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                OMProxyActivity.l0(OMProxyActivity.this, dialogInterface);
                            }
                        }).setPositiveButton("允许", new DialogInterface.OnClickListener() { // from class: com.xinzhu.overmind.shared.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                OMProxyActivity.m0(OMProxyActivity.this, dialogInterface, i4);
                            }
                        }).create();
                    }
                    Dialog dialog2 = this.f68268c;
                    if (dialog2 != null && dialog2.isShowing()) {
                        z4 = true;
                    }
                    if (z4 || (dialog = this.f68268c) == null) {
                        return;
                    }
                    dialog.show();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            setResult(-1, null);
            finish();
        }
    }

    @Nullable
    public final Dialog n0() {
        return this.f68268c;
    }

    @Nullable
    public final BroadcastReceiver o0() {
        return this.f68267b;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        sendBroadcast(new Intent(f68266h));
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xinzhu.overmind.shared.OMProxyActivity$onCreate$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, OMProxyActivity.f68263e.b())) {
                    OMProxyActivity.this.finish();
                }
            }
        };
        this.f68267b = broadcastReceiver;
        Intrinsics.checkNotNull(broadcastReceiver);
        registerReceiver(broadcastReceiver, new IntentFilter(f68265g));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.width = 1;
        attributes.height = 1;
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f68267b;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        k0();
    }

    @RequiresApi(23)
    public final boolean p0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    public final void r0(@Nullable Dialog dialog) {
        this.f68268c = dialog;
    }

    public final void s0(@Nullable BroadcastReceiver broadcastReceiver) {
        this.f68267b = broadcastReceiver;
    }
}
