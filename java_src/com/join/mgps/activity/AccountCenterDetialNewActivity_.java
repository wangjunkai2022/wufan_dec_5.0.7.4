package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FavoritesCenterData;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class AccountCenterDetialNewActivity_ extends AccountCenterDetialNewActivity implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private final a4.c f28320k = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f28321l = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FavoritesCenterData f28322b;

        a(FavoritesCenterData favoritesCenterData) {
            this.f28322b = favoritesCenterData;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterDetialNewActivity_.super.f0(this.f28322b);
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountCenterDetialNewActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28325a;

        public c(Context context) {
            super(context, AccountCenterDetialNewActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28325a;
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

        public c(Fragment fragment) {
            super(fragment.getActivity(), AccountCenterDetialNewActivity_.class);
            this.f28325a = fragment;
        }
    }

    public static c i0(Context context) {
        return new c(context);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static c j0(Fragment fragment) {
        return new c(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterDetialNewActivity
    public void f0(FavoritesCenterData favoritesCenterData) {
        org.androidannotations.api.b.e("", new a(favoritesCenterData), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28321l.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterDetialNewActivity
    public void getData() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28320k);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_account_center_detial_new);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28300b = (SimpleDraweeView) aVar.internalFindViewById(R.id.titleImg);
        this.f28301c = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIcon);
        this.f28302d = (TextView) aVar.internalFindViewById(R.id.userName);
        this.f28303e = (TextView) aVar.internalFindViewById(R.id.tipName);
        this.f28304f = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.f28305g = (RecyclerView) aVar.internalFindViewById(R.id.recycleView);
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28321l.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28320k.a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28320k.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28320k.a(this);
    }
}
