package com.join.mgps.activity.message;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.MessageDetailFeedBackBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class FeedBackMessageDetailActivity_ extends FeedBackMessageDetailActivity implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f39238s = "issueId";

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f39239q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f39240r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MessageDetailFeedBackBean.FeedbackReplies f39242b;

        b(MessageDetailFeedBackBean.FeedbackReplies feedbackReplies) {
            this.f39242b = feedbackReplies;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.f0(this.f39242b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FeedBackMessageDetailActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f39245b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FeedBackMessageDetailActivity_.super.i0(this.f39245b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBackMessageDetailActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBackMessageDetailActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBackMessageDetailActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBackMessageDetailActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements TextWatcher {
        i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            FeedBackMessageDetailActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MessageDetailFeedBackBean f39252b;

        j(MessageDetailFeedBackBean messageDetailFeedBackBean) {
            this.f39252b = messageDetailFeedBackBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.l0(this.f39252b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39254b;

        k(String str) {
            this.f39254b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.showMessage(this.f39254b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedBackMessageDetailActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39258a;

        public n(Context context) {
            super(context, FeedBackMessageDetailActivity_.class);
        }

        public n a(String str) {
            return (n) super.extra(FeedBackMessageDetailActivity_.f39238s, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f39258a;
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

        public n(Fragment fragment) {
            super(fragment.getActivity(), FeedBackMessageDetailActivity_.class);
            this.f39258a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f39238s)) {
            return;
        }
        this.f39233m = extras.getString(f39238s);
    }

    public static n u0(Context context) {
        return new n(context);
    }

    public static n v0(Fragment fragment) {
        return new n(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void f0(MessageDetailFeedBackBean.FeedbackReplies feedbackReplies) {
        org.androidannotations.api.b.e("", new b(feedbackReplies), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39240r.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void getData() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void i0(String str) {
        org.androidannotations.api.a.l(new d("", 0L, "", str));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void j0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void l0(MessageDetailFeedBackBean messageDetailFeedBackBean) {
        org.androidannotations.api.b.e("", new j(messageDetailFeedBackBean), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f39239q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_message_detail_feedback);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39222b = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f39223c = (TextView) aVar.internalFindViewById(R.id.tvFeedBackGameName);
        this.f39224d = (TextView) aVar.internalFindViewById(R.id.tvFeedBackReason);
        this.f39225e = (TextView) aVar.internalFindViewById(R.id.tvFeedBackDesc);
        this.f39226f = (TextView) aVar.internalFindViewById(R.id.tvTime);
        this.f39227g = (RecyclerView) aVar.internalFindViewById(R.id.rvComment);
        this.f39228h = (EditText) aVar.internalFindViewById(R.id.etComment);
        this.f39229i = (TextView) aVar.internalFindViewById(R.id.tvSend);
        this.f39230j = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f39231k = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f39232l = (LinearLayout) aVar.internalFindViewById(R.id.llMain);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new f());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new g());
        }
        TextView textView = this.f39229i;
        if (textView != null) {
            textView.setOnClickListener(new h());
        }
        TextView textView2 = (TextView) aVar.internalFindViewById(R.id.etComment);
        if (textView2 != null) {
            textView2.addTextChangedListener(new i());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39240r.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f39239q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.FeedBackMessageDetailActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new k(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f39239q.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f39239q.a(this);
    }
}
