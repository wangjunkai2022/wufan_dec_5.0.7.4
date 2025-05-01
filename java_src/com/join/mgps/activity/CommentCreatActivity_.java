package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommentCreatActivity_ extends CommentCreatActivity implements y3.a, a4.a, a4.b {
    public static final String C = "commentId";
    public static final String D = "commentContent";
    public static final String E = "commentStars";
    public static final String F = "gameId";
    public static final String G = "gameType";
    public static final String H = "gameIsStart";
    public static final String I = "packageName";
    public static final String J = "isEdit";
    public static final String K = "phoneModel";
    public static final String L = "commentScoreSwitch";
    public static final String M = "bespeakSwitch";
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentCreatActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentCreatActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f29405c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f29406d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f29407e;

        c(int i4, double d5, String str, String str2) {
            this.f29404b = i4;
            this.f29405c = d5;
            this.f29406d = str;
            this.f29407e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentCreatActivity_.super.k0(this.f29404b, this.f29405c, this.f29406d, this.f29407e);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f29410c;

        d(String str, boolean z4) {
            this.f29409b = str;
            this.f29410c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentCreatActivity_.super.l0(this.f29409b, this.f29410c);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f29412b;

        e(CommentResponse commentResponse) {
            this.f29412b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentCreatActivity_.super.m0(this.f29412b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29414b;

        f(String str) {
            this.f29414b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentCreatActivity_.super.showMessage(this.f29414b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f29416b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f29418d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, float f5, String str3, String str4) {
            super(str, j4, str2);
            this.f29416b = f5;
            this.f29417c = str3;
            this.f29418d = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentCreatActivity_.super.p0(this.f29416b, this.f29417c, this.f29418d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentCreatActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends org.androidannotations.api.builder.a<i> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29421a;

        public i(Context context) {
            super(context, CommentCreatActivity_.class);
        }

        public i a(int i4) {
            return (i) super.extra("bespeakSwitch", i4);
        }

        public i b(String str) {
            return (i) super.extra("commentContent", str);
        }

        public i c(String str) {
            return (i) super.extra("commentId", str);
        }

        public i d(String str) {
            return (i) super.extra("commentScoreSwitch", str);
        }

        public i e(float f5) {
            return (i) super.extra("commentStars", f5);
        }

        public i f(String str) {
            return (i) super.extra("gameId", str);
        }

        public i g(int i4) {
            return (i) super.extra("gameIsStart", i4);
        }

        public i h(String str) {
            return (i) super.extra("gameType", str);
        }

        public i i(boolean z4) {
            return (i) super.extra("isEdit", z4);
        }

        public i j(String str) {
            return (i) super.extra("packageName", str);
        }

        public i k(String str) {
            return (i) super.extra(CommentCreatActivity_.K, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29421a;
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

        public i(Fragment fragment) {
            super(fragment.getActivity(), CommentCreatActivity_.class);
            this.f29421a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f29396x = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("commentId")) {
                this.f29384l = extras.getString("commentId");
            }
            if (extras.containsKey("commentContent")) {
                this.f29385m = extras.getString("commentContent");
            }
            if (extras.containsKey("commentStars")) {
                this.f29386n = extras.getFloat("commentStars");
            }
            if (extras.containsKey("gameId")) {
                this.f29387o = extras.getString("gameId");
            }
            if (extras.containsKey("gameType")) {
                this.f29388p = extras.getString("gameType");
            }
            if (extras.containsKey("gameIsStart")) {
                this.f29389q = extras.getInt("gameIsStart");
            }
            if (extras.containsKey("packageName")) {
                this.f29390r = extras.getString("packageName");
            }
            if (extras.containsKey("isEdit")) {
                this.f29391s = extras.getBoolean("isEdit");
            }
            if (extras.containsKey(K)) {
                this.f29392t = extras.getString(K);
            }
            if (extras.containsKey("commentScoreSwitch")) {
                this.f29393u = extras.getString("commentScoreSwitch");
            }
            if (extras.containsKey("bespeakSwitch")) {
                this.f29394v = extras.getInt("bespeakSwitch");
            }
        }
    }

    public static i w0(Context context) {
        return new i(context);
    }

    public static i x0(Fragment fragment) {
        return new i(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void j0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void k0(int i4, double d5, String str, String str2) {
        org.androidannotations.api.b.e("", new c(i4, d5, str, str2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void l0(String str, boolean z4) {
        org.androidannotations.api.b.e("", new d(str, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void m0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new e(commentResponse), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.comment_creat_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29375c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29376d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f29377e = (TextView) aVar.internalFindViewById(R.id.textTopRight);
        this.f29378f = (MStarBar) aVar.internalFindViewById(R.id.mstarBar);
        this.f29379g = (LinearLayout) aVar.internalFindViewById(R.id.starLl);
        this.f29380h = (TextView) aVar.internalFindViewById(R.id.mstarBarTx);
        this.f29381i = (EditText) aVar.internalFindViewById(R.id.commentcreat_et);
        this.f29382j = (CheckBox) aVar.internalFindViewById(R.id.phoneModleCB);
        this.f29383k = (TextView) aVar.internalFindViewById(R.id.tvTips);
        ImageView imageView = this.f29375c;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        TextView textView = this.f29377e;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        afterView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void p0(float f5, String str, String str2) {
        org.androidannotations.api.a.l(new g("", 0L, "", f5, str, str2));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.A.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentCreatActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.A.a(this);
    }
}
