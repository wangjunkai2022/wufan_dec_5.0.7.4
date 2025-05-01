package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FriendInviteBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class FriendInviteActivity_ extends FriendInviteActivity implements y3.a, a4.a, a4.b {
    public static final String W = "inviteNotification";
    private final a4.c U = new a4.c();
    private final Map<Class<?>, Object> V = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendInviteActivity_.this.a1();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendInviteActivity_.this.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendInviteActivity_.this.b1();
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendInviteActivity_.super.c1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.a<e> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31421a;

        public e(Context context) {
            super(context, FriendInviteActivity_.class);
        }

        public e a(FriendInviteBean friendInviteBean) {
            return (e) super.extra(FriendInviteActivity_.W, friendInviteBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31421a;
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
            return new org.androidannotations.api.builder.f(this.context);
        }

        public e(Fragment fragment) {
            super(fragment.getActivity(), FriendInviteActivity_.class);
            this.f31421a = fragment;
        }
    }

    public static e f1(Context context) {
        return new e(context);
    }

    public static e g1(Fragment fragment) {
        return new e(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(W)) {
            return;
        }
        this.R = (FriendInviteBean) extras.getSerializable(W);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.FriendInviteActivity
    public void c1() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.V.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.U);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_friend_invite);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.N = (SimpleDraweeView) aVar.internalFindViewById(R.id.avatar);
        this.O = (TextView) aVar.internalFindViewById(R.id.name);
        this.P = (TextView) aVar.internalFindViewById(R.id.decline);
        this.Q = (TextView) aVar.internalFindViewById(R.id.gameName);
        View internalFindViewById = aVar.internalFindViewById(R.id.accept);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.iv_close);
        TextView textView = this.P;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.V.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.U.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.U.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.U.a(this);
    }
}
