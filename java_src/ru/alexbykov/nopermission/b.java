package ru.alexbykov.nopermission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
/* compiled from: PermissionHelper.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: j  reason: collision with root package name */
    private static final int f73251j = 98;

    /* renamed from: k  reason: collision with root package name */
    private static final int f73252k = 0;

    /* renamed from: a  reason: collision with root package name */
    private Activity f73253a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f73254b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f73255c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f73256d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f73257e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f73258f;

    /* renamed from: g  reason: collision with root package name */
    private AlertDialog.Builder f73259g;

    /* renamed from: h  reason: collision with root package name */
    private int f73260h;

    /* renamed from: i  reason: collision with root package name */
    private int f73261i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionHelper.java */
    /* loaded from: classes7.dex */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f73262b;

        a(String[] strArr) {
            this.f73262b = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            b.this.b(this.f73262b);
        }
    }

    public b(Activity activity) {
        this.f73253a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void b(String[] strArr) {
        Activity activity = this.f73253a;
        if (activity != null) {
            activity.requestPermissions(strArr, 98);
        } else {
            this.f73254b.requestPermissions(strArr, 98);
        }
    }

    @SuppressLint({"NewApi"})
    private void e(String[] strArr) {
        if (this.f73259g != null && l(strArr)) {
            x(strArr);
        } else {
            b(strArr);
        }
    }

    @RequiresApi(api = 23)
    private void f() {
        String[] h4 = h();
        if (h4.length > 0) {
            e(h4);
        } else {
            this.f73256d.run();
        }
    }

    private AlertDialog.Builder g(@StringRes int i4, @StringRes int i5) {
        Context context = getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(context.getString(i4));
        builder.setMessage(context.getString(i5));
        builder.setCancelable(false);
        return builder;
    }

    private Context getContext() {
        Activity activity = this.f73253a;
        return activity == null ? this.f73254b.getContext() : activity;
    }

    private String[] h() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f73255c) {
            if (m(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private boolean i() {
        return (this.f73256d == null || this.f73257e == null) ? false : true;
    }

    private boolean j() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @SuppressLint({"NewApi"})
    private boolean k(String str) {
        Activity activity = this.f73253a;
        if (activity != null) {
            return !activity.shouldShowRequestPermissionRationale(str);
        }
        return !this.f73254b.shouldShowRequestPermissionRationale(str);
    }

    private boolean l(String[] strArr) {
        for (String str : strArr) {
            if (k(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean m(String str) {
        Activity activity = this.f73253a;
        return activity != null ? ContextCompat.checkSelfPermission(activity, str) != 0 : ContextCompat.checkSelfPermission(this.f73254b.getContext(), str) != 0;
    }

    @SuppressLint({"NewApi"})
    private void t(String str) {
        if (k(str)) {
            u();
        } else {
            this.f73257e.run();
        }
        z();
    }

    private void u() {
        Runnable runnable = this.f73258f;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void v() {
        if (j()) {
            f();
        } else {
            this.f73256d.run();
        }
    }

    private void x(String[] strArr) {
        this.f73259g.setPositiveButton(this.f73260h, new a(strArr));
        AlertDialog create = this.f73259g.create();
        create.show();
        if (this.f73261i != 0) {
            create.getButton(-1).setTextColor(this.f73261i);
        }
    }

    private void z() {
        this.f73257e = null;
        this.f73256d = null;
        if (this.f73259g != null) {
            this.f73259g = null;
            this.f73260h = 0;
        }
        if (this.f73258f != null) {
            this.f73258f = null;
        }
    }

    @Deprecated
    public void A() {
        z();
    }

    public b B(@StringRes int i4, @StringRes int i5, @StringRes int i6) {
        this.f73260h = i6;
        this.f73259g = g(i4, i5);
        return this;
    }

    public b c(String str) {
        this.f73255c = r0;
        String[] strArr = {str};
        return this;
    }

    public b d(String... strArr) {
        this.f73255c = strArr;
        return this;
    }

    public b n(Runnable runnable) {
        this.f73257e = runnable;
        return this;
    }

    @Deprecated
    public b o(Runnable runnable) {
        this.f73257e = runnable;
        return this;
    }

    public b p(Runnable runnable) {
        this.f73258f = runnable;
        return this;
    }

    @SuppressLint({"NewApi"})
    public void q(int i4, String[] strArr, int[] iArr) {
        if (i4 == 98) {
            for (String str : strArr) {
                if (m(str)) {
                    t(str);
                    return;
                }
            }
        }
        this.f73256d.run();
        z();
    }

    public b r(Runnable runnable) {
        this.f73256d = runnable;
        return this;
    }

    public void s() {
        if (i()) {
            v();
            return;
        }
        throw new RuntimeException("permissionSuccessListener or permissionDeniedListener have null reference. You must realize onSuccess and onDenied methods");
    }

    public b w(@ColorRes int i4) {
        this.f73261i = ContextCompat.getColor(getContext(), i4);
        return this;
    }

    public void y() {
        Context context = getContext();
        Intent intent = new Intent();
        Uri fromParts = Uri.fromParts("package", context.getPackageName(), null);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        context.startActivity(intent);
    }

    public b(Fragment fragment) {
        this.f73254b = fragment;
    }
}
