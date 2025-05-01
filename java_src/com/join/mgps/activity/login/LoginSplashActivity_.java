package com.join.mgps.activity.login;

import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import com.netease.nis.quicklogin.QuickLogin;
import com.wufan.user.service.protobuf.n0;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class LoginSplashActivity_ extends LoginSplashActivity implements y3.a, a4.a, a4.b {
    public static final String GAME_ID_EXTRA = "gameId";
    public static final String IS_BACK_FROM_OTHER_LOGIN_EXTRA = "isBackFromOtherLogin";
    public static final String IS_FORCED_LOGIN_EXTRA = "isForcedLogin";
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class IntentBuilder_ extends org.androidannotations.api.builder.a<IntentBuilder_> {
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, LoginSplashActivity_.class);
        }

        public IntentBuilder_ gameId(String str) {
            return (IntentBuilder_) super.extra("gameId", str);
        }

        public IntentBuilder_ isBackFromOtherLogin(boolean z4) {
            return (IntentBuilder_) super.extra(LoginSplashActivity_.IS_BACK_FROM_OTHER_LOGIN_EXTRA, z4);
        }

        public IntentBuilder_ isForcedLogin(boolean z4) {
            return (IntentBuilder_) super.extra("isForcedLogin", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.fragmentSupport_;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new f(this.context);
        }

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), LoginSplashActivity_.class);
            this.fragmentSupport_ = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.prefDef = new PrefDef_(this);
        c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.gameId = extras.getString("gameId");
            }
            if (extras.containsKey("isForcedLogin")) {
                this.isForcedLogin = extras.getBoolean("isForcedLogin");
            }
            if (extras.containsKey(IS_BACK_FROM_OTHER_LOGIN_EXTRA)) {
                this.isBackFromOtherLogin = extras.getBoolean(IS_BACK_FROM_OTHER_LOGIN_EXTRA);
            }
        }
    }

    public static IntentBuilder_ intent(Context context) {
        return new IntentBuilder_(context);
    }

    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void dismissLoadingDialog() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginSplashActivity_.3
            @Override // java.lang.Runnable
            public void run() {
                LoginSplashActivity_.super.dismissLoadingDialog();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void error(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginSplashActivity_.5
            @Override // java.lang.Runnable
            public void run() {
                LoginSplashActivity_.super.error(str);
            }
        }, 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.beans_.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void joinDevice() {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.login.LoginSplashActivity_.7
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    LoginSplashActivity_.super.joinDevice();
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void loginSuccess(final n0 n0Var) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginSplashActivity_.4
            @Override // java.lang.Runnable
            public void run() {
                LoginSplashActivity_.super.loginSuccess(n0Var);
            }
        }, 0L);
    }

    @Override // com.join.mgps.activity.login.LoginSplashActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.wufunlogin_splash_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.close = aVar.internalFindViewById(R.id.close);
        this.login = aVar.internalFindViewById(R.id.login);
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void oneKeyLogin(final String str, final String str2, final QuickLogin quickLogin) {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.login.LoginSplashActivity_.6
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    LoginSplashActivity_.super.oneKeyLogin(str, str2, quickLogin);
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void quitActivity() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginSplashActivity_.1
            @Override // java.lang.Runnable
            public void run() {
                LoginSplashActivity_.super.quitActivity();
            }
        }, 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // com.join.mgps.activity.login.LoginSplashActivity
    public void showLoadingDialog() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginSplashActivity_.2
            @Override // java.lang.Runnable
            public void run() {
                LoginSplashActivity_.super.showLoadingDialog();
            }
        }, 0L);
    }

    public static IntentBuilder_ intent(Fragment fragment) {
        return new IntentBuilder_(fragment);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.onViewChangedNotifier_.a(this);
    }
}
