package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.GameTransferHistoryAdapter_;
import com.join.mgps.adapter.GameTransferListAdapter_;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameTransferActivity_ extends GameTransferActivity implements y3.a, a4.a, a4.b {
    public static final String E1 = "Flag";
    private final a4.c C1 = new a4.c();
    private final Map<Class<?>, Object> D1 = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameTransferActivity_.super.S0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32842b;

        h(String str) {
            this.f32842b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferActivity_.super.toast(this.f32842b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f32844b;

        i(DownloadTask downloadTask) {
            this.f32844b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferActivity_.super.k0(this.f32844b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTransferActivity_.super.V0();
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32847a;

        public k(Context context) {
            super(context, GameTransferActivity_.class);
        }

        public k a(int i4) {
            return (k) super.extra(GameTransferActivity_.E1, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32847a;
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
            super(fragment.getActivity(), GameTransferActivity_.class);
            this.f32847a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f32824z = new PrefDef_(this);
        a4.c.b(this);
        this.R = (PowerManager) getSystemService("power");
        this.f32802e = GameTransferListAdapter_.y(this, null);
        this.f32804g = GameTransferHistoryAdapter_.x(this, null);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(E1)) {
            return;
        }
        this.f32816r = extras.getInt(E1);
    }

    public static k w1(Context context) {
        return new k(context);
    }

    public static k x1(Fragment fragment) {
        return new k(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameTransferActivity
    public void S0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameTransferActivity
    public void V0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameTransferActivity
    public void k0(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new i(downloadTask), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_transfer);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32799b = (TextView) aVar.internalFindViewById(R.id.game_transfer_title_txt);
        this.f32800c = (TextView) aVar.internalFindViewById(R.id.game_transfer_right_phone_txt);
        this.f32801d = (RecyclerView) aVar.internalFindViewById(R.id.game_transfer_list_rv);
        this.f32803f = (RecyclerView) aVar.internalFindViewById(R.id.game_transfer_historyList_rv);
        this.f32805h = (TextView) aVar.internalFindViewById(R.id.game_transfer_bottom_navigation_left_txt);
        this.f32808k = (TextView) aVar.internalFindViewById(R.id.game_transfer_bottom_navigation_right_txt);
        this.f32809l = (Button) aVar.internalFindViewById(R.id.game_transfer_ok_btn);
        this.f32810m = (TextView) aVar.internalFindViewById(R.id.game_transfer_selected_num_txt);
        this.f32811n = (TextView) aVar.internalFindViewById(R.id.game_transfer_list_choose_all_txt);
        this.f32813p = (RelativeLayout) aVar.internalFindViewById(R.id.game_transfer_history_hint_rl);
        View internalFindViewById = aVar.internalFindViewById(R.id.game_transfer_list_hint_close_img);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.game_transfer_back_img);
        TextView textView = this.f32805h;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        TextView textView2 = this.f32808k;
        if (textView2 != null) {
            textView2.setOnClickListener(new c());
        }
        Button button = this.f32809l;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        TextView textView3 = this.f32811n;
        if (textView3 != null) {
            textView3.setOnClickListener(new f());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g());
        }
        u0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D1.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.C1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameTransferActivity
    public void toast(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.C1.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.C1.a(this);
    }
}
