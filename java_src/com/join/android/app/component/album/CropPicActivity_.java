package com.join.android.app.component.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ClipImageLayout;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CropPicActivity_ extends CropPicActivity implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f14966s = "CaptureUri";

    /* renamed from: t  reason: collision with root package name */
    public static final String f14967t = "from";

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f14968q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f14969r = new HashMap();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f14970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, File file) {
            super(str, j4, str2);
            this.f14970b = file;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CropPicActivity_.super.l0(this.f14970b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropPicActivity_.this.back_image();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CropPicActivity_.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.showLoading();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f14975b;

        e(Bitmap bitmap) {
            this.f14975b = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.i0(this.f14975b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.f0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14980b;

        i(String str) {
            this.f14980b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropPicActivity_.super.error(this.f14980b);
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CropPicActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f14983a;

        public k(Context context) {
            super(context, CropPicActivity_.class);
        }

        public k a(String str) {
            return (k) super.extra(CropPicActivity_.f14966s, str);
        }

        public k b(int i4) {
            return (k) super.extra("from", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f14983a;
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

        public k(Fragment fragment) {
            super(fragment.getActivity(), CropPicActivity_.class);
            this.f14983a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f14966s)) {
                this.f14960j = extras.getString(f14966s);
            }
            if (extras.containsKey("from")) {
                this.f14964n = extras.getInt("from");
            }
        }
    }

    public static k u0(Context context) {
        return new k(context);
    }

    public static k v0(Fragment fragment) {
        return new k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void e0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void f0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f14969r.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void i0(Bitmap bitmap) {
        org.androidannotations.api.b.e("", new e(bitmap), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void j0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void l0(File file) {
        org.androidannotations.api.a.l(new a("", 0L, "", file));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f14968q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.crop_pic_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f14952b = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f14953c = (Button) aVar.internalFindViewById(R.id.searchImage);
        this.f14954d = (ClipImageLayout) aVar.internalFindViewById(R.id.id_clipImageLayout);
        this.f14955e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f14959i = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        ImageView imageView = this.f14952b;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        Button button = this.f14953c;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f14969r.put(cls, t4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f14968q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void showLoading() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.android.app.component.album.CropPicActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f14968q.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f14968q.a(this);
    }
}
