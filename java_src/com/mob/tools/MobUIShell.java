package com.mob.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.join.mgps.Util.h0;
import com.mob.commons.a.l;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.ReflectHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class MobUIShell extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, FakeActivity> f56543a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private FakeActivity f56544b;

    static {
        MobLog.getInstance().d("===============================", new Object[0]);
        String replace = "2024-10-16".replace("-0", "-").replace("-", h0.f27805a);
        MobLog.getInstance().d(l.a("009Tidelgggdelel;h1gjjg") + replace, new Object[0]);
        MobLog.getInstance().d("===============================", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(Object obj) {
        return a(String.valueOf(System.currentTimeMillis()), obj);
    }

    private boolean b() {
        if (this.f56544b == null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            if (data != null && l.a("005:egelggehej").equals(data.getScheme())) {
                FakeActivity a5 = a(data.getHost());
                this.f56544b = a5;
                if (a5 != null) {
                    NLog mobLog = MobLog.getInstance();
                    mobLog.i("MUIShell found executor: " + this.f56544b.getClass());
                    this.f56544b.setActivity(this);
                    return true;
                }
            }
            try {
                String stringExtra = intent.getStringExtra(l.a("011he<ehPfdi;eiJj_ejeg$g"));
                String stringExtra2 = intent.getStringExtra(l.a("013g(fjXgdCehYj8elekeiCfeHeg9g"));
                FakeActivity remove = f56543a.remove(stringExtra);
                this.f56544b = remove;
                if (remove == null) {
                    FakeActivity remove2 = f56543a.remove(intent.getScheme());
                    this.f56544b = remove2;
                    if (remove2 == null) {
                        FakeActivity a6 = a();
                        this.f56544b = a6;
                        if (a6 == null) {
                            NLog mobLog2 = MobLog.getInstance();
                            mobLog2.w(new RuntimeException("Executor lost! launchTime = " + stringExtra + ", executorName: " + stringExtra2));
                            return false;
                        }
                    }
                }
                NLog mobLog3 = MobLog.getInstance();
                mobLog3.i("MUIShell found executor: " + this.f56544b.getClass());
                this.f56544b.setActivity(this);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return false;
            }
        }
        return true;
    }

    private boolean c() {
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField(l.a("013=egge0dj0ejeeejLj*fdffDfVfgel"));
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e5) {
            MobLog.getInstance().w(e5, "Fix orientation for 8.0 encountered exception", new Object[0]);
            return false;
        }
    }

    private boolean d() {
        Exception e5;
        boolean z4;
        Method method;
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        try {
            TypedArray obtainStyledAttributes = this.f56544b.activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            method = ActivityInfo.class.getMethod(l.a("023Wejgjgdek6ef7gj[h[eh$dgfjBhiekhdHh el6ejTejOfNfk"), TypedArray.class);
            method.setAccessible(true);
            z4 = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
        } catch (Exception e6) {
            e5 = e6;
            z4 = false;
        }
        try {
            method.setAccessible(false);
        } catch (Exception e7) {
            e5 = e7;
            MobLog.getInstance().w(e5);
            return z4;
        }
        return z4;
    }

    @Override // android.app.Activity
    public void finish() {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity == null || !fakeActivity.onFinish()) {
            super.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.onActivityResult(i4, i5, intent);
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (b()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onCreate", new Object[0]);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 26 && d()) {
                c();
            }
            if (i4 >= 21) {
                this.f56544b.activity.getWindow().addFlags(Integer.MIN_VALUE);
                this.f56544b.activity.getWindow().setStatusBarColor(0);
            }
            super.onCreate(bundle);
            this.f56544b.onCreate();
            return;
        }
        super.onCreate(bundle);
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        FakeActivity fakeActivity = this.f56544b;
        return fakeActivity != null ? fakeActivity.onCreateOptionsMenu(menu) : onCreateOptionsMenu;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.sendResult();
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onDestroy", new Object[0]);
            this.f56544b.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f56544b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i4, keyEvent) : false) {
                return true;
            }
            return super.onKeyDown(i4, keyEvent);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        try {
            FakeActivity fakeActivity = this.f56544b;
            if (fakeActivity != null ? fakeActivity.onKeyEvent(i4, keyEvent) : false) {
                return true;
            }
            return super.onKeyUp(i4, keyEvent);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity == null) {
            super.onNewIntent(intent);
        } else {
            fakeActivity.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        FakeActivity fakeActivity = this.f56544b;
        return fakeActivity != null ? fakeActivity.onOptionsItemSelected(menuItem) : onOptionsItemSelected;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.f56544b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onPause", new Object[0]);
            this.f56544b.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        if (this.f56544b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onRestart", new Object[0]);
            this.f56544b.onRestart();
        }
        super.onRestart();
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (this.f56544b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onResume", new Object[0]);
            this.f56544b.onResume();
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        if (this.f56544b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onStart", new Object[0]);
            this.f56544b.onStart();
        }
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        if (this.f56544b != null) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d(this.f56544b.getClass().getSimpleName() + " onStop", new Object[0]);
            this.f56544b.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        setContentView(LayoutInflater.from(this).inflate(i4, (ViewGroup) null));
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i4) {
        if (Build.VERSION.SDK_INT == 26 && d()) {
            return;
        }
        super.setRequestedOrientation(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (b()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i5 = 0;
            while (i5 < stackTrace.length) {
                if (stackTrace[i5].toString().startsWith(l.a("030Qih)e+ee.e2em9hef-fkemgdMi:ekGge(edemfk!gjNfm?jedLfigdek^edg")) && (i5 = i5 + 2) < stackTrace.length) {
                    int onSetTheme = this.f56544b.onSetTheme(i4, stackTrace[i5].toString().startsWith(l.a("048efBedekelejedem^ekk@emgeLdjFejeeej2j]fdgdUi)ekIgeVedem)kg ekfgelekeggfLeZeh2fdi.ge0djNejeeejNjDfd")));
                    if (onSetTheme > 0) {
                        super.setTheme(onSetTheme);
                        return;
                    }
                    return;
                }
                i5++;
            }
        }
        super.setTheme(i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4) {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i4, null);
        }
        super.startActivityForResult(intent, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(String str, Object obj) {
        f56543a.put(str, (FakeActivity) obj);
        return str;
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        if (view == null) {
            return;
        }
        super.setContentView(view);
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    private FakeActivity a(String str) {
        Object newInstance;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith(h0.f27805a)) {
                str = getPackageName() + str;
            }
            String importClass = ReflectHelper.importClass(str);
            if (TextUtils.isEmpty(importClass) || (newInstance = ReflectHelper.newInstance(importClass, new Object[0])) == null || !(newInstance instanceof FakeActivity)) {
                return null;
            }
            return (FakeActivity) newInstance;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.beforeStartActivityForResult(intent, i4, bundle);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            super.startActivityForResult(intent, i4, bundle);
        } else {
            super.startActivityForResult(intent, i4);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        if (layoutParams == null) {
            super.setContentView(view);
        } else {
            super.setContentView(view, layoutParams);
        }
        FakeActivity fakeActivity = this.f56544b;
        if (fakeActivity != null) {
            fakeActivity.setContentView(view);
        }
    }

    public FakeActivity a() {
        String str;
        try {
            str = getPackageManager().getActivityInfo(getComponentName(), 128).metaData.getString(l.a("015Ted-gOfgCe1ehFhj:geXdjFejeeejMj4fd"));
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            str = null;
        }
        return a(str);
    }
}
