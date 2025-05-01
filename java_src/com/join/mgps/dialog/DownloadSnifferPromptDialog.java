package com.join.mgps.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.WebViewSearchActivity_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.dialog_sniffer_promt)
/* loaded from: classes4.dex */
public class DownloadSnifferPromptDialog extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    DownloadTask f49154b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f49155c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    String f49156d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f49157e;

    /* renamed from: g  reason: collision with root package name */
    Button f49159g;

    /* renamed from: h  reason: collision with root package name */
    Button f49160h;

    /* renamed from: i  reason: collision with root package name */
    Button f49161i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f49162j;

    /* renamed from: k  reason: collision with root package name */
    b f49163k;

    /* renamed from: f  reason: collision with root package name */
    int f49158f = 7;

    /* renamed from: l  reason: collision with root package name */
    private ContentObserver f49164l = new a(new Handler());

    /* loaded from: classes4.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            int i4;
            if (Build.VERSION.SDK_INT < 21) {
                i4 = Settings.System.getInt(DownloadSnifferPromptDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            } else {
                i4 = Settings.Global.getInt(DownloadSnifferPromptDialog.this.getContentResolver(), "navigationbar_is_min", 0);
            }
            if (i4 == 1) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadSnifferPromptDialog.this.f49162j.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                DownloadSnifferPromptDialog.this.f49162j.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadSnifferPromptDialog.this.f49162j.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = DownloadSnifferPromptDialog.this.getNavigationBarHeight();
            DownloadSnifferPromptDialog.this.f49162j.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            int i4 = 0;
            if (DownloadSnifferPromptDialog.this.isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) DownloadSnifferPromptDialog.this.f49162j.getLayoutParams();
                int navigationBarHeight = DownloadSnifferPromptDialog.this.getNavigationBarHeight();
                if (!com.join.mgps.Util.k1.e() || Build.VERSION.SDK_INT > 19) {
                    i4 = navigationBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
                DownloadSnifferPromptDialog.this.f49162j.setLayoutParams(layoutParams);
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) DownloadSnifferPromptDialog.this.f49162j.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            DownloadSnifferPromptDialog.this.f49162j.setLayoutParams(layoutParams2);
        }
    }

    public static boolean checkDeviceHasNavigationBar(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", q.a.f73126a);
        boolean z4 = false;
        boolean z5 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z4 = "0".equals(str) ? true : z5;
            }
            return z4;
        } catch (Exception unused) {
            return z5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNavigationBarHeight() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", q.a.f73126a));
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int k0(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static View l0(Activity activity) {
        return new View(activity);
    }

    public static void o0(Activity activity, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 21) {
            activity.getWindow().setNavigationBarColor(i4);
        } else if (i5 >= 19) {
            activity.getWindow().addFlags(134217728);
            View l02 = l0(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, k0(activity));
            layoutParams.gravity = 80;
            l02.setLayoutParams(layoutParams);
            l02.setBackgroundColor(i4);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(l02);
        }
    }

    private void registerNavigationBarObserver() {
        if (Build.VERSION.SDK_INT < 21) {
            getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.f49164l);
        } else {
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_is_min"), true, this.f49164l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f49159g = (Button) findViewById(R.id.btnDownload);
        this.f49160h = (Button) findViewById(R.id.btnSource);
        this.f49161i = (Button) findViewById(R.id.btnSearch);
        if (!TextUtils.isEmpty(this.f49157e) && this.f49157e.equals("1")) {
            this.f49158f |= 1;
        } else {
            this.f49158f &= 6;
        }
        if (!TextUtils.isEmpty(this.f49155c)) {
            this.f49158f |= 2;
        } else {
            this.f49158f &= 5;
        }
        if (!TextUtils.isEmpty(this.f49156d)) {
            this.f49158f |= 4;
        } else {
            this.f49158f &= 3;
        }
        p0(this.f49158f);
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        DownloadTask downloadTask = this.f49154b;
        if (downloadTask != null) {
            com.php25.PDownload.d.e(downloadTask, this);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        WebViewSearchActivity_.c1(this).b(this.f49156d).a(this.f49154b).start();
        finish();
    }

    public boolean isNavigationBarShow() {
        if (Build.VERSION.SDK_INT < 17) {
            return (ViewConfiguration.get(this).hasPermanentMenuKey() || KeyCharacterMap.deviceHasKey(4)) ? false : true;
        }
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.Util.k1.e()) {
            return com.join.mgps.Util.k1.a(this) && !com.join.mgps.Util.k1.f(this);
        }
        if (com.join.mgps.Util.k1.g() && Settings.Global.getInt(getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return point2.y != point.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        WebViewSearchActivity_.c1(this).b(this.f49155c).a(this.f49154b).start();
        finish();
    }

    void m0() {
        try {
            registerContentResolver();
            if (checkDeviceHasNavigationBar(this) && isNavigationBarShow()) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f49162j.getLayoutParams();
                int navigationBarHeight = getNavigationBarHeight();
                if (com.join.mgps.Util.k1.e() && Build.VERSION.SDK_INT <= 19) {
                    navigationBarHeight = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = navigationBarHeight;
                this.f49162j.setLayoutParams(layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            getContentResolver().unregisterContentObserver(this.f49163k);
            getContentResolver().unregisterContentObserver(this.f49164l);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void p0(int i4) {
        this.f49158f = i4;
        if ((i4 & 1) == 1) {
            this.f49159g.setVisibility(0);
        } else {
            this.f49159g.setVisibility(8);
        }
        if (((i4 & 2) >> 1) == 1) {
            this.f49160h.setVisibility(0);
        } else {
            this.f49160h.setVisibility(8);
        }
        if (((i4 & 4) >> 2) == 1) {
            this.f49161i.setVisibility(0);
        } else {
            this.f49161i.setVisibility(8);
        }
    }

    void registerContentResolver() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f49163k = new b(new Handler());
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_hide_bar_enabled"), true, this.f49163k);
            registerNavigationBarObserver();
        }
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        com.join.mgps.Util.c2.o(this, 16777215, true);
    }
}
