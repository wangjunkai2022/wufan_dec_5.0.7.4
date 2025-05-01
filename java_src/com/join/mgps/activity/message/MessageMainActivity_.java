package com.join.mgps.activity.message;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MessageMainActivity_ extends MessageMainActivity implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f39278s = "index";

    /* renamed from: t  reason: collision with root package name */
    public static final String f39279t = "isLike";

    /* renamed from: u  reason: collision with root package name */
    public static final String f39280u = "isMessage";

    /* renamed from: v  reason: collision with root package name */
    public static final String f39281v = "intentDateBean";

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f39282q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f39283r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageMainActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageMainActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageMainActivity_.super.f0();
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
                MessageMainActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MessageMainActivity_.super.getRedPointData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39289a;

        public f(Context context) {
            super(context, MessageMainActivity_.class);
        }

        public f a(int i4) {
            return (f) super.extra("index", i4);
        }

        public f b(IntentDateBean intentDateBean) {
            return (f) super.extra("intentDateBean", intentDateBean);
        }

        public f c(boolean z4) {
            return (f) super.extra(MessageMainActivity_.f39279t, z4);
        }

        public f d(boolean z4) {
            return (f) super.extra(MessageMainActivity_.f39280u, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f39289a;
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

        public f(Fragment fragment) {
            super(fragment.getActivity(), MessageMainActivity_.class);
            this.f39289a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("index")) {
                this.f39268k = extras.getInt("index");
            }
            if (extras.containsKey(f39279t)) {
                this.f39269l = extras.getBoolean(f39279t);
            }
            if (extras.containsKey(f39280u)) {
                this.f39270m = extras.getBoolean(f39280u);
            }
            if (extras.containsKey("intentDateBean")) {
                this.f39271n = (IntentDateBean) extras.getSerializable("intentDateBean");
            }
        }
    }

    public static f k0(Context context) {
        return new f(context);
    }

    public static f l0(Fragment fragment) {
        return new f(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageMainActivity
    public void f0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39283r.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageMainActivity
    public void getData() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageMainActivity
    public void getRedPointData() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f39282q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_message_main);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39259b = (SlidingTabLayout) aVar.internalFindViewById(R.id.tableLayout);
        this.f39260c = (ImageView) aVar.internalFindViewById(R.id.back);
        this.f39261d = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        View internalFindViewById = aVar.internalFindViewById(R.id.setting);
        ImageView imageView = this.f39260c;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39283r.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f39282q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f39282q.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f39282q.a(this);
    }
}
