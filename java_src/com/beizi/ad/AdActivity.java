package com.beizi.ad;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.beizi.ad.internal.activity.c;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.DeviceInfo;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.WebviewUtil;
import java.util.Locale;
/* loaded from: classes2.dex */
public class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5148a;

    /* renamed from: b  reason: collision with root package name */
    static Class f5149b = AdActivity.class;

    /* renamed from: c  reason: collision with root package name */
    private a f5150c;

    /* renamed from: com.beizi.ad.AdActivity$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5152a;

        static {
            int[] iArr = new int[b.values().length];
            f5152a = iArr;
            try {
                iArr[b.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5152a[b.landscape.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5152a[b.portrait.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        WebView f();
    }

    /* loaded from: classes2.dex */
    public enum b {
        portrait,
        landscape,
        none
    }

    public static Class a() {
        return f5149b;
    }

    public static void b(Activity activity) {
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.f5150c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            String stringExtra = getIntent().getStringExtra("ACTIVITY_TYPE");
            boolean booleanExtra = getIntent().getBooleanExtra("ACTIVITY_CAN_JUMP", false);
            if (TextUtils.isEmpty(stringExtra)) {
                HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_no_type));
                finish();
            } else if ("INTERSTITIAL".equals(stringExtra)) {
                com.beizi.ad.internal.activity.b bVar = new com.beizi.ad.internal.activity.b(this);
                this.f5150c = bVar;
                bVar.a();
            } else if ("BROWSER".equals(stringExtra)) {
                com.beizi.ad.internal.activity.a aVar = new com.beizi.ad.internal.activity.a(this, booleanExtra);
                this.f5150c = aVar;
                aVar.a();
            } else if (ServerResponse.EXTRAS_KEY_MRAID.equals(stringExtra)) {
                c cVar = new c(this);
                this.f5150c = cVar;
                cVar.a();
            } else if ("DOWNLOADBROWSER".equals(stringExtra)) {
                com.beizi.ad.internal.activity.a aVar2 = new com.beizi.ad.internal.activity.a(this, booleanExtra);
                this.f5150c = aVar2;
                aVar2.a();
                new Thread(new Runnable() { // from class: com.beizi.ad.AdActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i4 = 0;
                        while (i4 != 3) {
                            i4++;
                            if (AdActivity.f5148a) {
                                AdActivity.f5148a = false;
                                AdActivity.this.finish();
                                i4 = 3;
                            }
                            SystemClock.sleep(500L);
                        }
                    }
                }).start();
            }
            CookieSyncManager.createInstance(this);
            CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
            if (cookieSyncManager != null) {
                cookieSyncManager.startSync();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        a aVar = this.f5150c;
        if (aVar != null) {
            aVar.c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        a aVar = this.f5150c;
        if (aVar != null) {
            WebviewUtil.onPause(aVar.f());
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
        if (cookieSyncManager != null) {
            cookieSyncManager.stopSync();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        a aVar = this.f5150c;
        if (aVar != null) {
            WebviewUtil.onResume(aVar.f());
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
        if (cookieSyncManager != null) {
            cookieSyncManager.startSync();
        }
        super.onResume();
    }

    public static void a(Activity activity) {
        b(activity, activity.getResources().getConfiguration().orientation);
    }

    @TargetApi(9)
    private static void b(Activity activity, int i4) {
        String str = DeviceInfo.getInstance().model;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        boolean z4 = DeviceInfo.getInstance().brand.toUpperCase(locale).equals("AMAZON") && (upperCase.equals("KFTT") || upperCase.equals("KFJWI") || upperCase.equals("KFJWA"));
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        if (i4 == 1) {
            int rotation = defaultDisplay.getRotation();
            if (rotation != 1 && rotation != 2) {
                activity.setRequestedOrientation(1);
            } else {
                activity.setRequestedOrientation(9);
            }
        } else if (i4 == 2) {
            int rotation2 = defaultDisplay.getRotation();
            if (z4) {
                if (rotation2 != 0 && rotation2 != 1) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(8);
                }
            } else if (rotation2 != 0 && rotation2 != 1) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(0);
            }
        }
    }

    public static void a(Activity activity, int i4) {
        b(activity, i4);
    }

    public static void a(Activity activity, b bVar) {
        int i4 = activity.getResources().getConfiguration().orientation;
        int i5 = AnonymousClass2.f5152a[bVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i4 = 2;
            } else if (i5 == 3) {
                i4 = 1;
            }
            b(activity, i4);
            return;
        }
        activity.setRequestedOrientation(-1);
    }
}
