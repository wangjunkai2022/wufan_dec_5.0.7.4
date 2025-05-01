package com.join.mgps.va.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.join.android.app.mgsim.wufun.R;
import com.kuaishou.weapon.p0.g;
@TargetApi(23)
/* loaded from: classes5.dex */
public class PermissionRequestActivity extends Activity {

    /* renamed from: g  reason: collision with root package name */
    public static final int f54917g = 995;

    /* renamed from: h  reason: collision with root package name */
    public static final String f54918h = "extra.permission";

    /* renamed from: i  reason: collision with root package name */
    public static final String f54919i = "extra.app_name";

    /* renamed from: j  reason: collision with root package name */
    public static final String f54920j = "extra.user_id";

    /* renamed from: k  reason: collision with root package name */
    public static final String f54921k = "extra.package_name";

    /* renamed from: b  reason: collision with root package name */
    private int f54922b;

    /* renamed from: c  reason: collision with root package name */
    private String f54923c;

    /* renamed from: d  reason: collision with root package name */
    private String f54924d;

    /* renamed from: e  reason: collision with root package name */
    Dialog f54925e;

    /* renamed from: f  reason: collision with root package name */
    AlertDialog.Builder f54926f = null;

    /* loaded from: classes5.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", PermissionRequestActivity.this.getPackageName(), null));
            PermissionRequestActivity.this.startActivity(intent);
            PermissionRequestActivity.this.finish();
        }
    }

    public static boolean a(int[] iArr) {
        for (int i4 : iArr) {
            if (i4 == -1) {
                return false;
            }
        }
        return true;
    }

    public static void b(@NonNull Activity activity, @NonNull String[] strArr, @NonNull String str, int i4, @NonNull String str2, int i5) {
        Intent intent = new Intent(activity, PermissionRequestActivity.class);
        intent.putExtra(f54918h, strArr);
        intent.putExtra(f54919i, str);
        intent.putExtra(f54921k, str2);
        intent.putExtra(f54920j, i4);
        activity.startActivityForResult(intent, i5);
        activity.overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String[] stringArrayExtra = intent.getStringArrayExtra(f54918h);
        this.f54923c = intent.getStringExtra(f54919i);
        this.f54924d = intent.getStringExtra(f54921k);
        this.f54922b = intent.getIntExtra(f54920j, -1);
        requestPermissions(stringArrayExtra, f54917g);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (a(iArr)) {
            Intent intent = new Intent();
            intent.putExtra("pkg", this.f54924d);
            intent.putExtra("user_id", this.f54922b);
            setResult(-1, intent);
            finish();
            return;
        }
        Dialog dialog = this.f54925e;
        if (dialog == null) {
            this.f54926f = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
        } else if (dialog.isShowing()) {
            return;
        }
        this.f54926f.setTitle("提示");
        boolean z4 = false;
        for (String str : strArr) {
            if (str.equals(g.f55589i) || str.equals(g.f55590j)) {
                z4 = true;
            }
        }
        if (z4) {
            this.f54926f.setMessage("需要打开读写存储权限，请去设置中开启权限");
        } else {
            this.f54926f.setMessage("请去设置中开启权限");
        }
        this.f54926f.setPositiveButton("去打开", new a());
        this.f54925e = this.f54926f.show();
    }
}
