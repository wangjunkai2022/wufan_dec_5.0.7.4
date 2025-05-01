package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HandShankAdView;
import com.join.mgps.db.tables.HandShankTable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class HandShankYesActivity_ extends HandShankYesActivity implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f33875o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f33876p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankYesActivity_.this.H0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankYesActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankYesActivity_.this.y0();
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
                HandShankYesActivity_.super.z0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HandShankTable f33881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, HandShankTable handShankTable) {
            super(str, j4, str2);
            this.f33881b = handShankTable;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                HandShankYesActivity_.super.J0(this.f33881b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f33883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f33883b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                HandShankYesActivity_.super.I0(this.f33883b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends org.androidannotations.api.builder.a<g> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33885a;

        public g(Context context) {
            super(context, HandShankYesActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33885a;
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

        public g(Fragment fragment) {
            super(fragment.getActivity(), HandShankYesActivity_.class);
            this.f33885a = fragment;
        }
    }

    public static g O0(Context context) {
        return new g(context);
    }

    public static g P0(Fragment fragment) {
        return new g(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HandShankYesActivity
    public void I0(List<HandShankTable> list) {
        org.androidannotations.api.a.l(new f("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HandShankYesActivity
    public void J0(HandShankTable handShankTable) {
        org.androidannotations.api.a.l(new e("", 0L, "", handShankTable));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33876p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33875o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.handshank_layout_yes);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33857d = (ListView) aVar.internalFindViewById(R.id.listview);
        this.f33858e = (FrameLayout) aVar.internalFindViewById(R.id.handshank_tip_lay);
        this.f33859f = (Button) aVar.internalFindViewById(R.id.rightButn);
        this.f33860g = (TextView) aVar.internalFindViewById(R.id.papahandList);
        this.f33866m = (HandShankAdView) aVar.internalFindViewById(R.id.mAdView);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        Button button = this.f33859f;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        TextView textView = this.f33860g;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33876p.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33875o.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HandShankYesActivity
    public void z0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33875o.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33875o.a(this);
    }
}
