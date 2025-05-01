package com.netease.nis.quicklogin.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.R;
import com.netease.nis.quicklogin.helper.UnifyUiConfig;
import com.netease.nis.quicklogin.listener.LoginListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.ui.CmccLoginActivity;
import com.netease.nis.quicklogin.ui.ProtocolDetailActivity;
import com.netease.nis.quicklogin.ui.YDQuickLoginActivity;
import com.netease.nis.quicklogin.utils.g;
import com.netease.nis.quicklogin.view.FastClickButton;
import com.netease.nis.quicklogin.view.GifView;
import com.netease.nis.quicklogin.view.PlayerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class LoginUiHelper {

    /* renamed from: a  reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f57578a;

    /* renamed from: b  reason: collision with root package name */
    private Context f57579b;

    /* renamed from: c  reason: collision with root package name */
    private UnifyUiConfig f57580c;

    /* renamed from: d  reason: collision with root package name */
    private h f57581d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<CheckBox> f57582e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<CheckBox> f57583f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<ViewGroup> f57584g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<RelativeLayout> f57585h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<RelativeLayout> f57586i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<RelativeLayout> f57587j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57588k = true;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<QuickLoginTokenListener> f57589l;

    /* renamed from: m  reason: collision with root package name */
    private WeakReference<Activity> f57590m;

    /* renamed from: n  reason: collision with root package name */
    private PlayerView f57591n;

    /* renamed from: o  reason: collision with root package name */
    private String f57592o;

    /* loaded from: classes5.dex */
    public interface CustomViewListener {
        void onClick(Context context, View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f57593a;

        a(Activity activity) {
            this.f57593a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginUiHelper.this.a(3, 0);
            this.f57593a.finish();
            if (com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57589l)) {
                try {
                    ((QuickLoginTokenListener) LoginUiHelper.this.f57589l.get()).onCancelGetToken();
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f57595a;

        b(Activity activity) {
            this.f57595a = activity;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                com.netease.nis.quicklogin.utils.d.a(this.f57595a, "97cf3773301f48ca974131655f05bdfa");
                LoginUiHelper.this.a(2, 1);
                if (LoginUiHelper.this.f57580c.getCheckedImageDrawable() != null) {
                    ((CheckBox) LoginUiHelper.this.f57582e.get()).setBackground(LoginUiHelper.this.f57580c.getCheckedImageDrawable());
                    return;
                } else if (TextUtils.isEmpty(LoginUiHelper.this.f57580c.getCheckedImageName())) {
                    return;
                } else {
                    ((CheckBox) LoginUiHelper.this.f57582e.get()).setBackgroundResource(LoginUiHelper.this.f57581d.c(LoginUiHelper.this.f57580c.getCheckedImageName()));
                    return;
                }
            }
            LoginUiHelper.this.a(2, 0);
            if (LoginUiHelper.this.f57580c.getUnCheckedImageNameDrawable() != null) {
                ((CheckBox) LoginUiHelper.this.f57582e.get()).setBackground(LoginUiHelper.this.f57580c.getUnCheckedImageNameDrawable());
            } else if (TextUtils.isEmpty(LoginUiHelper.this.f57580c.getUnCheckedImageName())) {
            } else {
                ((CheckBox) LoginUiHelper.this.f57582e.get()).setBackgroundResource(LoginUiHelper.this.f57581d.c(LoginUiHelper.this.f57580c.getUnCheckedImageName()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginUiHelper.this.a(1, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FastClickButton f57598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f57599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f57600c;

        /* loaded from: classes5.dex */
        class a implements DialogInterface.OnClickListener {
            a(d dVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* loaded from: classes5.dex */
        class b implements DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                ((CheckBox) LoginUiHelper.this.f57582e.get()).setChecked(true);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (LoginUiHelper.this.f57580c.getPrivacyDialogAuto()) {
                    d.this.f57598a.performClick();
                }
            }
        }

        d(FastClickButton fastClickButton, ViewGroup viewGroup, Activity activity) {
            this.f57598a = fastClickButton;
            this.f57599b = viewGroup;
            this.f57600c = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CharSequence privacyDialogText;
            if (!com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57582e) || !((CheckBox) LoginUiHelper.this.f57582e.get()).isChecked()) {
                if (com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57584g)) {
                    ((ViewGroup) LoginUiHelper.this.f57584g.get()).setVisibility(8);
                }
                this.f57598a.a(false);
                LoginUiHelper.this.a(4, 0);
                LoginListener loginListener = LoginUiHelper.this.f57580c.getLoginListener();
                LinearLayout linearLayout = (LinearLayout) this.f57600c.findViewById(R.id.yd_ll_protocol);
                TextView textView = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.yd_tv_privacy) : null;
                if (textView == null) {
                    Toast.makeText(LoginUiHelper.this.f57579b, R.string.yd_privacy_agree, 1).show();
                    return;
                }
                if (loginListener != null) {
                    try {
                        if (loginListener.onDisagreePrivacy(textView, this.f57598a)) {
                            return;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f57600c);
                if (!TextUtils.isEmpty(LoginUiHelper.this.f57580c.getPrivacyDialogText())) {
                    privacyDialogText = LoginUiHelper.this.f57580c.getPrivacyDialogText();
                } else {
                    privacyDialogText = com.netease.nis.quicklogin.utils.a.a(0, LoginUiHelper.this.f57580c, "请您仔细阅读", "，点击“确定”，表示您已经阅读并同意以上协议");
                }
                AlertDialog create = builder.setMessage(privacyDialogText).setPositiveButton("确认", new b()).setNegativeButton("取消", new a(this)).create();
                if (!this.f57600c.isFinishing()) {
                    create.show();
                }
                ((TextView) create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
                ((TextView) create.findViewById(16908299)).setTextSize(2, LoginUiHelper.this.f57580c.getPrivacyDialogTextSize() != 0.0f ? LoginUiHelper.this.f57580c.getPrivacyDialogTextSize() : 13.0f);
                return;
            }
            if (LoginUiHelper.this.f57580c.getLoadingVisible() && com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57584g)) {
                ((ViewGroup) LoginUiHelper.this.f57584g.get()).setVisibility(0);
            }
            LoginUiHelper.this.a(4, 1);
            this.f57598a.a(true);
            this.f57599b.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e implements Application.ActivityLifecycleCallbacks {
        e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            LoginUiHelper.this.a(activity, "onActivityCreated");
            try {
                if (LoginUiHelper.this.b(activity) && LoginUiHelper.this.f57580c != null && LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() != null) {
                    LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onCreate(activity);
                }
                if (activity instanceof CmccLoginActivity) {
                    ((CmccLoginActivity) activity).a(LoginUiHelper.this.f57580c);
                }
                if (activity instanceof YDQuickLoginActivity) {
                    ((YDQuickLoginActivity) activity).a(LoginUiHelper.this.f57580c);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            try {
                if (LoginUiHelper.this.b(activity)) {
                    LoginUiHelper.this.f57588k = true;
                    if (LoginUiHelper.this.f57580c != null && LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() != null) {
                        LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onDestroy(activity);
                    }
                    if (com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57585h)) {
                        ((RelativeLayout) LoginUiHelper.this.f57585h.get()).removeAllViews();
                    }
                    if (com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57586i)) {
                        ((RelativeLayout) LoginUiHelper.this.f57586i.get()).removeAllViews();
                    }
                    if (com.netease.nis.quicklogin.utils.a.a(LoginUiHelper.this.f57587j)) {
                        ((RelativeLayout) LoginUiHelper.this.f57587j.get()).removeAllViews();
                    }
                    if (LoginUiHelper.this.f57591n != null) {
                        LoginUiHelper.this.f57591n.suspend();
                        LoginUiHelper.this.f57591n.setOnErrorListener(null);
                        LoginUiHelper.this.f57591n.setOnPreparedListener(null);
                        LoginUiHelper.this.f57591n.setOnCompletionListener(null);
                        LoginUiHelper.this.f57591n = null;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            LoginUiHelper.this.a(activity, "onActivityDestroyed");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            LoginUiHelper.this.a(activity, "onActivityPaused");
            try {
                if (LoginUiHelper.this.b(activity) && LoginUiHelper.this.f57580c != null && LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() != null) {
                    LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onPause(activity);
                }
                if (LoginUiHelper.this.f57591n == null || !LoginUiHelper.this.f57591n.isPlaying()) {
                    return;
                }
                LoginUiHelper.this.f57591n.pause();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            LoginUiHelper.this.a(activity, "onActivityResumed");
            Logger.d("onePass [timeEnd]" + System.currentTimeMillis());
            try {
                if (LoginUiHelper.this.f57588k && LoginUiHelper.this.b(activity)) {
                    LoginUiHelper.this.f57590m = new WeakReference(activity);
                }
                if (LoginUiHelper.this.f57580c != null) {
                    if (LoginUiHelper.this.b(activity)) {
                        if (LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() != null) {
                            LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onResume(activity);
                        }
                        if (LoginUiHelper.this.f57588k) {
                            if (LoginUiHelper.this.f57580c.isDialogMode()) {
                                i.a((Activity) LoginUiHelper.this.f57590m.get(), LoginUiHelper.this.f57580c.getDialogWidth(), LoginUiHelper.this.f57580c.getDialogHeight(), LoginUiHelper.this.f57580c.getDialogX(), LoginUiHelper.this.f57580c.getDialogY(), LoginUiHelper.this.f57580c.isBottomDialog());
                            } else {
                                LoginUiHelper.this.d(activity);
                            }
                            if (!LoginUiHelper.this.n(activity)) {
                                return;
                            }
                            LoginUiHelper.this.c(activity);
                            LoginUiHelper.this.l(activity);
                            if (activity instanceof CmccLoginActivity) {
                                LoginUiHelper.this.m(activity);
                            }
                            if (activity instanceof YDQuickLoginActivity) {
                                LoginUiHelper.this.e(activity);
                                ((YDQuickLoginActivity) activity).a(LoginUiHelper.this.f57580c.getLoginListener());
                                LoginUiHelper.this.a(activity, ((YDQuickLoginActivity) activity).f57569m);
                            }
                            if (LoginUiHelper.this.f57580c.getBackgroundShadow() != null) {
                                LoginUiHelper loginUiHelper = LoginUiHelper.this;
                                loginUiHelper.a((Activity) loginUiHelper.f57590m.get(), LoginUiHelper.this.f57580c.getBackgroundShadow());
                            }
                            LoginUiHelper loginUiHelper2 = LoginUiHelper.this;
                            loginUiHelper2.a((Activity) loginUiHelper2.f57590m.get());
                            LoginUiHelper.this.f57588k = false;
                        }
                        if (LoginUiHelper.this.f57591n != null) {
                            LoginUiHelper.this.f57591n.start();
                        }
                    }
                    if (activity instanceof ProtocolDetailActivity) {
                        if (LoginUiHelper.this.f57580c.isProtocolDialogMode()) {
                            i.a(activity, LoginUiHelper.this.f57580c.getDialogWidth(), LoginUiHelper.this.f57580c.getDialogHeight(), LoginUiHelper.this.f57580c.getDialogX(), LoginUiHelper.this.f57580c.getDialogY(), LoginUiHelper.this.f57580c.isBottomDialog());
                        }
                        if (!TextUtils.isEmpty(LoginUiHelper.this.f57580c.getProtocolBackgroundImage())) {
                            activity.findViewById(R.id.yd_ll_root_detail).setBackgroundResource(LoginUiHelper.this.f57581d.c(LoginUiHelper.this.f57580c.getProtocolBackgroundImage()));
                        }
                        LoginUiHelper.this.l(activity);
                        LoginUiHelper.this.k(activity);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            LoginUiHelper.this.a(activity, "onActivityStarted");
            try {
                if (!LoginUiHelper.this.b(activity) || LoginUiHelper.this.f57580c == null || LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() == null) {
                    return;
                }
                LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onStart(activity);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            LoginUiHelper.this.a(activity, "onActivityStopped");
            try {
                if (!LoginUiHelper.this.b(activity) || LoginUiHelper.this.f57580c == null || LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks() == null) {
                    return;
                }
                LoginUiHelper.this.f57580c.getActivityLifecycleCallbacks().onStop(activity);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f57604a;

        f(LoginUiHelper loginUiHelper, g gVar) {
            this.f57604a = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CustomViewListener customViewListener = this.f57604a.f57607c;
            if (customViewListener != null) {
                try {
                    customViewListener.onClick(view.getContext(), this.f57604a.f57605a);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public View f57605a;

        /* renamed from: b  reason: collision with root package name */
        public int f57606b;

        /* renamed from: c  reason: collision with root package name */
        public CustomViewListener f57607c;
    }

    public LoginUiHelper(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.f57579b = applicationContext;
            this.f57581d = h.a(applicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) activity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        j(activity);
        h(activity);
        f(activity);
        for (View view : i.a(viewGroup)) {
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!TextUtils.isEmpty(charSequence) && charSequence.contains("****")) {
                    int id = view.getId();
                    int i4 = R.id.yd_et_number;
                    if (id != i4 && activity.findViewById(i4) != null) {
                        ((EditText) activity.findViewById(i4)).setText(charSequence);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).setVisibility(8);
                        }
                    }
                }
            }
            if ((view instanceof CheckBox) && view.getId() != R.id.yd_cb_privacy) {
                CheckBox checkBox = (CheckBox) view;
                ViewGroup viewGroup2 = (ViewGroup) checkBox.getParent().getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                this.f57583f = new WeakReference<>(checkBox);
            }
        }
        i(activity);
        ViewGroup viewGroup3 = (viewGroup.getChildCount() < 3 || !(viewGroup.getChildAt(2) instanceof ViewGroup)) ? null : (ViewGroup) viewGroup.getChildAt(2);
        if ((viewGroup3 instanceof RelativeLayout) && viewGroup3.getChildCount() == 1) {
            viewGroup3.setVisibility(8);
            g(activity);
            int i5 = R.id.yd_btn_oauth;
            if (activity.findViewById(i5) != null) {
                FastClickButton fastClickButton = (FastClickButton) activity.findViewById(i5);
                fastClickButton.setOnClickListener(new d(fastClickButton, viewGroup3, activity));
            }
        }
        a(activity, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(Activity activity) {
        ViewGroup viewGroup;
        if (activity instanceof CmccLoginActivity) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_root);
            if (relativeLayout == null) {
                if (com.netease.nis.quicklogin.utils.a.a(this.f57589l)) {
                    this.f57589l.get().onGetMobileNumberError(this.f57592o, "移动接口添加易盾布局文件失败");
                }
                com.netease.nis.quicklogin.utils.g.c().a(g.c.MONITOR_SDK_INTERNAL, com.netease.nis.quicklogin.b.b.OTHER.ordinal(), this.f57592o, 2, 0, 0, "移动接口添加易盾布局文件失败", System.currentTimeMillis());
                com.netease.nis.quicklogin.utils.g.c().d();
                activity.finish();
                return false;
            }
            UnifyUiConfig unifyUiConfig = this.f57580c;
            if (unifyUiConfig != null && unifyUiConfig.getLoadingView() != null) {
                viewGroup = this.f57580c.getLoadingView();
                viewGroup.bringToFront();
                relativeLayout.addView(viewGroup);
                viewGroup.setVisibility(8);
            } else {
                viewGroup = (ViewGroup) activity.findViewById(R.id.yd_rl_loading);
            }
            this.f57585h = new WeakReference<>(relativeLayout);
            this.f57584g = new WeakReference<>(viewGroup);
            return true;
        }
        return true;
    }

    private void j(Activity activity) {
        RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_navigation);
        if (relativeLayout != null) {
            if (this.f57580c.getNavBackgroundColor() != 0) {
                relativeLayout.setBackgroundColor(this.f57580c.getNavBackgroundColor());
            }
            if (this.f57580c.isHideNav()) {
                relativeLayout.setVisibility(4);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.height = i.a(this.f57579b, this.f57580c.getNavHeight());
            relativeLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) activity.findViewById(R.id.yd_iv_navigation);
        if (imageView != null) {
            if (this.f57580c.isHideBackIcon()) {
                imageView.setVisibility(4);
            }
            if (this.f57580c.getNavBackIconDrawable() != null) {
                imageView.setImageDrawable(this.f57580c.getNavBackIconDrawable());
            } else if (!TextUtils.isEmpty(this.f57580c.getNavBackIcon())) {
                imageView.setImageResource(this.f57581d.c(this.f57580c.getNavBackIcon()));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.width = i.a(this.f57579b, this.f57580c.getNavBackIconWidth());
            layoutParams2.height = i.a(this.f57579b, this.f57580c.getNavBackIconHeight());
            if (this.f57580c.getNavBackIconGravity() == 0 && this.f57580c.isDialogMode()) {
                layoutParams2.addRule(11);
            } else {
                layoutParams2.addRule(this.f57580c.getNavBackIconGravity() != 5 ? 9 : 11);
            }
            if (this.f57580c.getNavBackIconMargin() != 0) {
                layoutParams2.setMargins(this.f57580c.getNavBackIconMargin(), this.f57580c.getNavBackIconMargin(), this.f57580c.getNavBackIconMargin(), this.f57580c.getNavBackIconMargin());
            }
            imageView.setLayoutParams(layoutParams2);
            imageView.setOnClickListener(new a(activity));
        }
        TextView textView = (TextView) activity.findViewById(R.id.yd_tv_navigation);
        if (textView != null) {
            if (!TextUtils.isEmpty(this.f57580c.getNavTitle())) {
                textView.setText(this.f57580c.getNavTitle());
            }
            if (this.f57580c.getNavTitleColor() != 0) {
                textView.setTextColor(this.f57580c.getNavTitleColor());
            }
            if (this.f57580c.getNavTitleSize() != 0) {
                textView.setTextSize(this.f57580c.getNavTitleSize());
            } else if (this.f57580c.getNavTitleDpSize() != 0) {
                textView.setTextSize(1, this.f57580c.getNavTitleDpSize());
            }
            if (this.f57580c.isNavTitleBold()) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (this.f57580c.getNavTitleDrawable() != null) {
                textView.setCompoundDrawables(this.f57580c.getNavTitleDrawable(), null, null, null);
                if (this.f57580c.getNavTitleDrawablePadding() != 0) {
                    textView.setCompoundDrawablePadding(this.f57580c.getNavTitleDrawablePadding());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Activity activity) {
        RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_navigation);
        if (relativeLayout != null) {
            if (this.f57580c.getProtocolNavColor() != 0) {
                relativeLayout.setBackgroundColor(this.f57580c.getProtocolNavColor());
            }
            if (this.f57580c.getProtocolNavHeight() != 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.height = i.a(this.f57579b, this.f57580c.getProtocolNavHeight());
                relativeLayout.setLayoutParams(layoutParams);
            }
        }
        TextView textView = (TextView) activity.findViewById(R.id.yd_tv_navigation);
        if (textView != null) {
            if (this.f57580c.getProtocolNavTitleSize() != 0) {
                textView.setTextSize(this.f57580c.getProtocolNavTitleSize());
            } else if (this.f57580c.getProtocolNavTitleDpSize() != 0) {
                textView.setTextSize(1, this.f57580c.getProtocolNavTitleDpSize());
            }
            if (this.f57580c.getProtocolNavTitleColor() != 0) {
                textView.setTextColor(this.f57580c.getProtocolNavTitleColor());
            }
        }
        ImageView imageView = (ImageView) activity.findViewById(R.id.yd_iv_navigation);
        if (imageView != null) {
            if (this.f57580c.getProtocolNavBackIconDrawable() != null) {
                imageView.setImageDrawable(this.f57580c.getProtocolNavBackIconDrawable());
            } else if (!TextUtils.isEmpty(this.f57580c.getProtocolNavBackIcon())) {
                imageView.setImageDrawable(this.f57581d.b(this.f57580c.getProtocolNavBackIcon()));
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (this.f57580c.getProtocolNavBackIconWidth() != 0) {
                layoutParams2.width = i.a(this.f57579b, this.f57580c.getProtocolNavBackIconWidth());
            }
            if (this.f57580c.getProtocolNavBackIconHeight() != 0) {
                layoutParams2.height = i.a(this.f57579b, this.f57580c.getProtocolNavBackIconHeight());
            }
            imageView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Activity activity) {
        i.a(activity, this.f57580c.getStatusBarColor());
        i.a(activity, this.f57580c.isStatusBarDarkColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        String backgroundImage = this.f57580c.getBackgroundImage();
        Drawable backgroundImageDrawable = this.f57580c.getBackgroundImageDrawable();
        String backgroundGif = this.f57580c.getBackgroundGif();
        Drawable backgroundGifDrawable = this.f57580c.getBackgroundGifDrawable();
        if ((!TextUtils.isEmpty(backgroundImage) || backgroundImageDrawable != null) && TextUtils.isEmpty(backgroundGif) && backgroundGifDrawable == null) {
            View findViewById = activity.findViewById(R.id.yd_rl_root);
            if (activity instanceof CmccLoginActivity) {
                findViewById.setBackgroundColor(0);
                findViewById = (View) findViewById.getParent();
            }
            if (backgroundImageDrawable != null) {
                findViewById.setBackground(backgroundImageDrawable);
            } else {
                findViewById.setBackgroundResource(this.f57581d.c(backgroundImage));
            }
        }
        String backgroundVideo = this.f57580c.getBackgroundVideo();
        String backgroundVideoImage = this.f57580c.getBackgroundVideoImage();
        Drawable backgroundVideoImageDrawable = this.f57580c.getBackgroundVideoImageDrawable();
        if (TextUtils.isEmpty(backgroundGif) && backgroundGifDrawable == null) {
            if (TextUtils.isEmpty(backgroundVideo)) {
                return;
            }
            if (TextUtils.isEmpty(backgroundVideoImage) && backgroundVideoImageDrawable == null) {
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_root);
            relativeLayout.setFitsSystemWindows(false);
            PlayerView playerView = new PlayerView(this.f57579b);
            this.f57591n = playerView;
            playerView.setVideoURI(Uri.parse(backgroundVideo));
            if (this.f57580c.getBackgroundVideoImageDrawable() != null) {
                this.f57591n.setLoadingImageResId(backgroundVideoImageDrawable);
            } else {
                this.f57591n.setLoadingImageResId(this.f57581d.c(backgroundVideoImage));
            }
            this.f57591n.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f57591n.e();
            relativeLayout.addView(this.f57591n, 0);
            this.f57585h = new WeakReference<>(relativeLayout);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) activity.findViewById(R.id.yd_rl_root);
        relativeLayout2.setFitsSystemWindows(false);
        GifView gifView = new GifView(this.f57579b);
        if (backgroundGifDrawable != null) {
            gifView.setGifDrawable(backgroundGifDrawable);
        } else {
            gifView.setGifResId(this.f57581d.c(backgroundGif));
        }
        gifView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout2.addView(gifView, 0);
        this.f57585h = new WeakReference<>(relativeLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        if (Build.VERSION.SDK_INT == 26) {
            if (this.f57580c.isLandscape()) {
                activity.setRequestedOrientation(3);
            }
        } else if (this.f57580c.isLandscape()) {
            activity.setRequestedOrientation(0);
        } else {
            activity.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity) {
        if (TextUtils.isEmpty(this.f57580c.getActivityEnterAnimation()) && TextUtils.isEmpty(this.f57580c.getActivityExitAnimation())) {
            return;
        }
        activity.overridePendingTransition(!TextUtils.isEmpty(this.f57580c.getActivityEnterAnimation()) ? this.f57581d.a(this.f57580c.getActivityEnterAnimation()) : 0, TextUtils.isEmpty(this.f57580c.getActivityExitAnimation()) ? 0 : this.f57581d.a(this.f57580c.getActivityExitAnimation()));
    }

    private void f(Activity activity) {
        TextView textView = (TextView) activity.findViewById(R.id.yd_tv_brand);
        if (textView != null) {
            if (this.f57580c.getSloganSize() != 0) {
                textView.setTextSize(this.f57580c.getSloganSize());
            } else if (this.f57580c.getSloganDpSize() != 0) {
                textView.setTextSize(1, this.f57580c.getSloganDpSize());
            }
            if (this.f57580c.getSloganColor() != 0) {
                textView.setTextColor(this.f57580c.getSloganColor());
            }
            if (this.f57580c.getSloganTopYOffset() != 0) {
                i.d(textView, this.f57580c.getSloganTopYOffset());
            }
            if (this.f57580c.getSloganBottomYOffset() != 0) {
                i.a(textView, this.f57580c.getSloganBottomYOffset());
            }
            if (this.f57580c.getSloganXOffset() != 0) {
                i.e(textView, this.f57580c.getSloganXOffset());
            } else {
                i.b(textView);
            }
        }
    }

    private void g(Activity activity) {
        FastClickButton fastClickButton = (FastClickButton) activity.findViewById(R.id.yd_btn_oauth);
        if (fastClickButton != null) {
            Context applicationContext = activity.getApplicationContext();
            fastClickButton.setAllCaps(false);
            if (this.f57580c.getLoginBtnWidth() != 0) {
                fastClickButton.getLayoutParams().width = i.a(applicationContext, this.f57580c.getLoginBtnWidth());
            }
            if (this.f57580c.getLoginBtnHeight() != 0) {
                fastClickButton.getLayoutParams().height = i.a(applicationContext, this.f57580c.getLoginBtnHeight());
            }
            if (!TextUtils.isEmpty(this.f57580c.getLoginBtnText())) {
                fastClickButton.setText(this.f57580c.getLoginBtnText());
            }
            if (this.f57580c.getLoginBtnTextColor() != 0) {
                fastClickButton.setTextColor(this.f57580c.getLoginBtnTextColor());
            }
            if (this.f57580c.getLoginBtnTextSize() != 0) {
                fastClickButton.setTextSize(this.f57580c.getLoginBtnTextSize());
            } else if (this.f57580c.getLoginBtnTextDpSize() != 0) {
                fastClickButton.setTextSize(1, this.f57580c.getLoginBtnTextDpSize());
            }
            if (this.f57580c.getLoginBtnTopYOffset() != 0) {
                i.d(fastClickButton, this.f57580c.getLoginBtnTopYOffset());
            }
            if (this.f57580c.getLoginBtnBottomYOffset() != 0) {
                i.a(fastClickButton, this.f57580c.getLoginBtnBottomYOffset());
            }
            if (this.f57580c.getLoginBtnXOffset() != 0) {
                i.e(fastClickButton, this.f57580c.getLoginBtnXOffset());
            } else {
                i.b(fastClickButton);
            }
            if (this.f57580c.getLoginBtnBackgroundDrawable() != null) {
                fastClickButton.setBackground(this.f57580c.getLoginBtnBackgroundDrawable());
            } else if (TextUtils.isEmpty(this.f57580c.getLoginBtnBackgroundRes())) {
            } else {
                fastClickButton.setBackground(h.a(applicationContext).b(this.f57580c.getLoginBtnBackgroundRes()));
            }
        }
    }

    private void h(Activity activity) {
        RelativeLayout.LayoutParams layoutParams;
        ImageView imageView = (ImageView) activity.findViewById(R.id.yd_iv_logo);
        if (imageView != null) {
            int logoWidth = this.f57580c.getLogoWidth();
            int logoHeight = this.f57580c.getLogoHeight();
            if (logoWidth != 0 || logoHeight != 0) {
                if (logoWidth == 0) {
                    layoutParams = new RelativeLayout.LayoutParams(i.a(this.f57579b, 70.0f), i.a(this.f57579b, logoHeight));
                } else if (logoHeight == 0) {
                    layoutParams = new RelativeLayout.LayoutParams(i.a(this.f57579b, logoWidth), i.a(this.f57579b, 70.0f));
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(i.a(this.f57579b, logoWidth), i.a(this.f57579b, logoHeight));
                }
                imageView.setLayoutParams(layoutParams);
            }
            if (this.f57580c.getLogoTopYOffset() != 0) {
                i.d(imageView, this.f57580c.getLogoTopYOffset());
            }
            if (this.f57580c.getLogoBottomYOffset() != 0) {
                i.a(imageView, this.f57580c.getLogoBottomYOffset());
            }
            if (this.f57580c.getLogoXOffset() != 0) {
                i.e(imageView, this.f57580c.getLogoXOffset());
            } else {
                i.b(imageView);
            }
            if (this.f57580c.getLogoIconDrawable() != null) {
                imageView.setImageDrawable(this.f57580c.getLogoIconDrawable());
            } else if (!TextUtils.isEmpty(this.f57580c.getLogoIconName())) {
                imageView.setImageResource(this.f57581d.c(this.f57580c.getLogoIconName()));
            }
            if (this.f57580c.isHideLogo()) {
                imageView.setVisibility(4);
            }
        }
    }

    private void i(Activity activity) {
        EditText editText = (EditText) activity.findViewById(R.id.yd_et_number);
        if (editText != null) {
            if (this.f57580c.getMaskNumberSize() != 0) {
                editText.setTextSize(this.f57580c.getMaskNumberSize());
            } else if (this.f57580c.getMaskNumberDpSize() != 0) {
                editText.setTextSize(1, this.f57580c.getMaskNumberDpSize());
            }
            if (this.f57580c.getMaskNumberColor() != 0) {
                editText.setTextColor(this.f57580c.getMaskNumberColor());
            }
            if (this.f57580c.getMaskNumberTypeface() != null) {
                editText.setTypeface(this.f57580c.getMaskNumberTypeface());
            }
            if (this.f57580c.getMaskNumberTopYOffset() != 0) {
                i.d(editText, this.f57580c.getMaskNumberTopYOffset());
            }
            if (this.f57580c.getMaskNumberBottomYOffset() != 0) {
                i.a(editText, this.f57580c.getMaskNumberBottomYOffset());
            }
            if (!TextUtils.isEmpty(this.f57580c.getMaskNumberBackgroundRes())) {
                editText.setBackground(h.a(activity).b(this.f57580c.getMaskNumberBackgroundRes()));
            }
            if (this.f57580c.getMaskNumberXOffset() != 0) {
                i.e(editText, this.f57580c.getMaskNumberXOffset());
            } else {
                i.b(editText);
            }
            if (this.f57580c.getMaskNumberListener() != null) {
                try {
                    this.f57580c.getMaskNumberListener().onGetMaskNumber(editText, editText.getText().toString());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void b() {
        if (com.netease.nis.quicklogin.utils.a.a(this.f57590m)) {
            this.f57590m.get().finish();
        }
    }

    public void b(boolean z4) {
        if (com.netease.nis.quicklogin.utils.a.a(this.f57582e)) {
            this.f57582e.get().setChecked(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Activity activity) {
        return (activity instanceof CmccLoginActivity) || (activity instanceof YDQuickLoginActivity);
    }

    public void a(UnifyUiConfig unifyUiConfig, String str) {
        this.f57580c = unifyUiConfig;
        this.f57592o = str;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f57578a;
        if (activityLifecycleCallbacks == null) {
            a();
        } else {
            ((Application) this.f57579b).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        ((Application) this.f57579b).registerActivityLifecycleCallbacks(this.f57578a);
    }

    public void a(QuickLoginTokenListener quickLoginTokenListener) {
        this.f57589l = new WeakReference<>(quickLoginTokenListener);
    }

    public void a(boolean z4) {
        if (com.netease.nis.quicklogin.utils.a.a(this.f57584g)) {
            this.f57584g.get().setVisibility(z4 ? 0 : 8);
        }
    }

    public void a(int i4, View view) {
        if (i4 == 1) {
            WeakReference<RelativeLayout> weakReference = this.f57586i;
            if (weakReference != null) {
                weakReference.get().removeView(view);
            }
        } else if (i4 == 0) {
            WeakReference<RelativeLayout> weakReference2 = this.f57587j;
            if (weakReference2 != null) {
                weakReference2.get().removeView(view);
            }
        } else {
            WeakReference<RelativeLayout> weakReference3 = this.f57585h;
            if (weakReference3 != null) {
                weakReference3.get().removeView(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, boolean z4) {
        j(activity);
        h(activity);
        i(activity);
        f(activity);
        g(activity);
        if (z4) {
            a(activity, 1);
        } else {
            a(activity, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, int i5) {
        try {
            UnifyUiConfig unifyUiConfig = this.f57580c;
            if (unifyUiConfig == null || unifyUiConfig.getClickEventListener() == null) {
                return;
            }
            this.f57580c.getClickEventListener().onClick(i4, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(Activity activity, int i4) {
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.yd_ll_protocol);
        if (linearLayout != null) {
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.yd_cb_privacy);
            this.f57582e = new WeakReference<>(checkBox);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.yd_rl_privacy);
            if (this.f57580c.isHidePrivacyCheckBox()) {
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
            } else if (this.f57580c.getCheckBoxGravity() != 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.gravity = this.f57580c.getCheckBoxGravity();
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (this.f57580c.getPrivacyCheckBoxWidth() != 0) {
                checkBox.getLayoutParams().width = i.a(activity, this.f57580c.getPrivacyCheckBoxWidth());
            }
            if (this.f57580c.getPrivacyCheckBoxHeight() != 0) {
                checkBox.getLayoutParams().height = i.a(activity, this.f57580c.getPrivacyCheckBoxHeight());
            }
            if (com.netease.nis.quicklogin.utils.a.a(this.f57583f)) {
                this.f57583f.get().setChecked(true);
            }
            if (com.netease.nis.quicklogin.utils.a.a(this.f57582e)) {
                if (this.f57580c.isPrivacyState()) {
                    this.f57582e.get().setChecked(true);
                    com.netease.nis.quicklogin.utils.d.a(activity, "97cf3773301f48ca974131655f05bdfa");
                    if (this.f57580c.getCheckedImageDrawable() != null) {
                        this.f57582e.get().setBackground(this.f57580c.getCheckedImageDrawable());
                    } else if (!TextUtils.isEmpty(this.f57580c.getCheckedImageName())) {
                        this.f57582e.get().setBackgroundResource(this.f57581d.c(this.f57580c.getCheckedImageName()));
                    }
                } else {
                    this.f57582e.get().setChecked(false);
                    if (this.f57580c.getUnCheckedImageNameDrawable() != null) {
                        this.f57582e.get().setBackground(this.f57580c.getUnCheckedImageNameDrawable());
                    } else if (!TextUtils.isEmpty(this.f57580c.getUnCheckedImageName())) {
                        this.f57582e.get().setBackgroundResource(this.f57581d.c(this.f57580c.getUnCheckedImageName()));
                    }
                }
                this.f57582e.get().setOnCheckedChangeListener(new b(activity));
            }
            TextView textView = (TextView) linearLayout.findViewById(R.id.yd_tv_privacy);
            if (textView != null) {
                textView.setOnClickListener(new c());
                if (this.f57580c.getPrivacyLineSpacingAdd() != 0.0f) {
                    textView.setLineSpacing(i.a(this.f57579b, this.f57580c.getPrivacyLineSpacingAdd()), this.f57580c.getPrivacyLineSpacingMul() > 0.0f ? this.f57580c.getPrivacyLineSpacingMul() : 1.0f);
                }
                com.netease.nis.quicklogin.utils.a.a(i4, this.f57580c, textView);
                if (this.f57580c.getPrivacySize() != 0) {
                    textView.setTextSize(this.f57580c.getPrivacySize());
                } else if (this.f57580c.getPrivacyDpSize() != 0) {
                    textView.setTextSize(1, this.f57580c.getPrivacyDpSize());
                }
                if (this.f57580c.getPrivacyTextMarginLeft() != 0) {
                    i.b(textView, this.f57580c.getPrivacyTextMarginLeft());
                }
                if (this.f57580c.getPrivacyTopYOffset() != 0 && this.f57580c.getPrivacyBottomYOffset() == 0) {
                    i.d(linearLayout, this.f57580c.getPrivacyTopYOffset() + i.b(this.f57579b));
                }
                if (this.f57580c.getPrivacyBottomYOffset() != 0) {
                    i.a(linearLayout, this.f57580c.getPrivacyBottomYOffset());
                }
                if (this.f57580c.getPrivacyMarginLeft() != 0) {
                    i.e(linearLayout, this.f57580c.getPrivacyMarginLeft());
                } else {
                    i.c(linearLayout);
                }
                if (this.f57580c.getPrivacyMarginRight() != 0) {
                    i.c(textView, this.f57580c.getPrivacyMarginRight());
                }
                if (this.f57580c.isPrivacyTextGravityCenter()) {
                    textView.setGravity(17);
                }
                if (this.f57580c.getPrivacyTextLayoutGravity() != 0) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.gravity = this.f57580c.getPrivacyTextLayoutGravity();
                    textView.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    private void a() {
        this.f57578a = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, View view) {
        RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_root);
        if (relativeLayout == null || this.f57591n == null) {
            return;
        }
        relativeLayout.addView(view, 1);
        this.f57585h = new WeakReference<>(relativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        ArrayList<g> customViewHolders = this.f57580c.getCustomViewHolders();
        if (customViewHolders == null) {
            return;
        }
        Iterator<g> it2 = customViewHolders.iterator();
        while (it2.hasNext()) {
            g next = it2.next();
            if (next.f57605a != null) {
                a(activity, next);
            }
        }
    }

    private void a(Activity activity, g gVar) {
        if (gVar.f57605a.getParent() == null) {
            int i4 = gVar.f57606b;
            if (i4 == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.yd_rl_navigation);
                relativeLayout.addView(gVar.f57605a);
                this.f57586i = new WeakReference<>(relativeLayout);
            } else if (i4 == 0) {
                RelativeLayout relativeLayout2 = (RelativeLayout) activity.findViewById(R.id.yd_rl_body);
                relativeLayout2.addView(gVar.f57605a);
                this.f57587j = new WeakReference<>(relativeLayout2);
            } else if (i4 == 2) {
                RelativeLayout relativeLayout3 = (RelativeLayout) activity.findViewById(R.id.yd_rl_root);
                relativeLayout3.addView(gVar.f57605a);
                this.f57585h = new WeakReference<>(relativeLayout3);
            }
        }
        View view = gVar.f57605a;
        if (view != null) {
            view.setOnClickListener(new f(this, gVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, String str) {
        if ((activity instanceof CmccLoginActivity) || (activity instanceof YDQuickLoginActivity) || (activity instanceof ProtocolDetailActivity)) {
            if (!"onActivityResumed".equals(str) && !"onActivityDestroyed".equals(str)) {
                Logger.d("[ActivityLifecycle] " + str + " ---> " + activity.getLocalClassName());
                return;
            }
            Logger.d("[ActivityLifecycle] " + str + " ---> " + activity.getLocalClassName() + " isNotSetLoginUi=" + this.f57588k);
        }
    }
}
