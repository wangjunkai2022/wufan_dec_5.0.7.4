package com.join.mgps.activity.login;

import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.pref.PrefDef_;
import com.netease.nis.quicklogin.QuickLogin;
import com.wufan.user.service.protobuf.n0;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class LoginMainActivity_ extends LoginMainActivity implements y3.a, a4.a, a4.b {
    public static final String GAME_ID_EXTRA = "gameId";
    public static final String INTENT_FROM_EXTRA = "intentFrom";
    public static final String IS_FORCED_LOGIN_EXTRA = "isForcedLogin";
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class IntentBuilder_ extends org.androidannotations.api.builder.a<IntentBuilder_> {
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, LoginMainActivity_.class);
        }

        public IntentBuilder_ gameId(String str) {
            return (IntentBuilder_) super.extra("gameId", str);
        }

        public IntentBuilder_ intentFrom(int i4) {
            return (IntentBuilder_) super.extra("intentFrom", i4);
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
            super(fragment.getActivity(), LoginMainActivity_.class);
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
            if (extras.containsKey("intentFrom")) {
                this.intentFrom = extras.getInt("intentFrom");
            }
            if (extras.containsKey("gameId")) {
                this.gameId = extras.getString("gameId");
            }
            if (extras.containsKey("isForcedLogin")) {
                this.isForcedLogin = extras.getBoolean("isForcedLogin");
            }
        }
    }

    public static IntentBuilder_ intent(Context context) {
        return new IntentBuilder_(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void checkPhoneLogin(final String str, final String str2, final QuickLogin quickLogin, final String str3) {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.login.LoginMainActivity_.21
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    LoginMainActivity_.super.checkPhoneLogin(str, str2, quickLogin, str3);
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void delayFinish() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.14
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.delayFinish();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void error(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.20
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.error(str);
            }
        }, 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.beans_.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void goRegin(final AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.19
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.goRegin(accountRegisterThirdwaiRequestBean);
            }
        }, 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void joinDevice() {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.login.LoginMainActivity_.23
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    LoginMainActivity_.super.joinDevice();
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void login(final int i4, final String str, final String str2, final int i5, final String str3) {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.login.LoginMainActivity_.22
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    LoginMainActivity_.super.login(i4, str, str2, i5, str3);
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void loginSuccess(final n0 n0Var, final RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.18
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.loginSuccess(n0Var, rewardBean);
            }
        }, 0L);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.loginmain_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.title = (TextView) aVar.internalFindViewById(R.id.title);
        this.phoneNumber = (EditText) aVar.internalFindViewById(R.id.phoneNumber);
        this.clear = aVar.internalFindViewById(R.id.clear);
        this.otherLogin = aVar.internalFindViewById(R.id.otherLogin);
        this.cancleLogin = aVar.internalFindViewById(R.id.cancleLogin);
        this.nextStep = aVar.internalFindViewById(R.id.nextStep);
        this.xieyi = (TextView) aVar.internalFindViewById(R.id.xieyi);
        this.checkBox = (CheckBox) aVar.internalFindViewById(R.id.checkBox);
        View internalFindViewById = aVar.internalFindViewById(R.id.shengming);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.toOtherLogin);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.cancle);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.back);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.loginQQLayout);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.loginWechatLayout);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.loginWeiboLayout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LoginMainActivity_.this.shengming();
                }
            });
        }
        View view = this.otherLogin;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LoginMainActivity_.this.otherLogin();
                }
            });
        }
        TextView textView = this.xieyi;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LoginMainActivity_.this.xieyi();
                }
            });
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LoginMainActivity_.this.toOtherLogin();
                }
            });
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LoginMainActivity_.this.cancle();
                }
            });
        }
        View view2 = this.cancleLogin;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    LoginMainActivity_.this.cancleLogin();
                }
            });
        }
        View view3 = this.clear;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view4) {
                    LoginMainActivity_.this.clear();
                }
            });
        }
        View view4 = this.nextStep;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    LoginMainActivity_.this.nextStep();
                }
            });
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    LoginMainActivity_.this.back();
                }
            });
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    LoginMainActivity_.this.loginQQLayout();
                }
            });
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    LoginMainActivity_.this.loginWechatLayout();
                }
            });
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.login.LoginMainActivity_.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    LoginMainActivity_.this.loginWeiboLayout();
                }
            });
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void showKeyborad(final EditText editText) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.13
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.showKeyborad(editText);
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.15
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.showLoding();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.16
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.showLodingDismis();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.login.LoginMainActivity
    public void showMessage(final String str) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.login.LoginMainActivity_.17
            @Override // java.lang.Runnable
            public void run() {
                LoginMainActivity_.super.showMessage(str);
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
