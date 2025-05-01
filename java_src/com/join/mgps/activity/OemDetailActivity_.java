package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class OemDetailActivity_ extends OemDetailActivity implements y3.a, a4.a, a4.b {
    private final a4.c K = new a4.c();
    private final Map<Class<?>, Object> L = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OemDetailActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f36257b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                OemDetailActivity_.super.o0(this.f36257b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                OemDetailActivity_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36260a;

        public d(Context context) {
            super(context, OemDetailActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36260a;
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

        public d(Fragment fragment) {
            super(fragment.getActivity(), OemDetailActivity_.class);
            this.f36260a = fragment;
        }
    }

    public static d G0(Context context) {
        return new d(context);
    }

    public static d H0(Fragment fragment) {
        return new d(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.L.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.OemDetailActivity
    public void o0(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.K);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_forum_gift_detail_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36222c = aVar.internalFindViewById(R.id.back_image);
        this.f36223d = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f36224e = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f36225f = aVar.internalFindViewById(R.id.bottom);
        this.f36226g = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f36227h = (LinearLayout) aVar.internalFindViewById(R.id.oemTypeLayout1);
        this.f36228i = (LinearLayout) aVar.internalFindViewById(R.id.oemTypeLayout2);
        this.f36229j = (LinearLayout) aVar.internalFindViewById(R.id.oemTypeLayout3);
        this.f36230k = (SimpleDraweeView) aVar.internalFindViewById(R.id.giftIcon);
        this.f36231l = (TextView) aVar.internalFindViewById(R.id.giftName);
        this.f36232m = (TextView) aVar.internalFindViewById(R.id.giftExpireDate);
        this.f36233n = (LinearLayout) aVar.internalFindViewById(R.id.giftRetainLayout);
        this.f36234o = (TextView) aVar.internalFindViewById(R.id.giftRetain);
        this.f36235p = (TextView) aVar.internalFindViewById(R.id.cdkNum);
        this.f36236q = (TextView) aVar.internalFindViewById(R.id.giftTip);
        this.f36237r = (Button) aVar.internalFindViewById(R.id.receiveButton);
        this.f36238s = (Button) aVar.internalFindViewById(R.id.goToOem);
        this.f36239t = (TextView) aVar.internalFindViewById(R.id.giftTitle);
        this.f36240u = (TextView) aVar.internalFindViewById(R.id.giftContent);
        this.f36241v = (TextView) aVar.internalFindViewById(R.id.giftUseTitle);
        this.f36242w = (TextView) aVar.internalFindViewById(R.id.giftUseContent);
        this.f36243x = aVar.internalFindViewById(R.id.myGiftPackage);
        this.f36244y = (TextView) aVar.internalFindViewById(R.id.myGiftPackageCount);
        View view = this.f36222c;
        if (view != null) {
            view.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.L.put(cls, t4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.K.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.OemDetailActivity
    public void t0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.K.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.K.a(this);
    }
}
