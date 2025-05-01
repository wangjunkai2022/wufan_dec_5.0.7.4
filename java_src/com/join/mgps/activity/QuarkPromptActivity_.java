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
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DownloadArgs;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class QuarkPromptActivity_ extends QuarkPromptActivity implements y3.a, a4.a, a4.b {
    public static final String D = "gameId";
    public static final String E = "args";
    private final a4.c B = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QuarkPromptActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QuarkPromptActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QuarkPromptActivity_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37071a;

        public d(Context context) {
            super(context, QuarkPromptActivity_.class);
        }

        public d a(DownloadArgs downloadArgs) {
            return (d) super.extra(QuarkPromptActivity_.E, downloadArgs);
        }

        public d b(String str) {
            return (d) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37071a;
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
            super(fragment.getActivity(), QuarkPromptActivity_.class);
            this.f37071a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f37046k = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f37047l = extras.getString("gameId");
            }
            if (extras.containsKey(E)) {
                this.f37048m = (DownloadArgs) extras.getSerializable(E);
            }
        }
    }

    public static d n0(Context context) {
        return new d(context);
    }

    public static d o0(Fragment fragment) {
        return new d(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.QuarkPromptActivity
    public void k0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.B);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_quark_prompt);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37037b = (TextView) aVar.internalFindViewById(R.id.tvDownloadQuark);
        this.f37038c = (TextView) aVar.internalFindViewById(R.id.tvDownloadNormal);
        this.f37039d = (TextView) aVar.internalFindViewById(R.id.tv_count_down);
        this.f37040e = (TextView) aVar.internalFindViewById(R.id.tv_count_desc);
        this.f37041f = aVar.internalFindViewById(R.id.container);
        this.f37042g = (RecyclerView) aVar.internalFindViewById(R.id.rv_tip_list);
        this.f37043h = (TextView) aVar.internalFindViewById(R.id.tv_count_pre);
        this.f37044i = (TextView) aVar.internalFindViewById(R.id.tv_file_name);
        this.f37045j = (TextView) aVar.internalFindViewById(R.id.tv_file_time);
        View internalFindViewById = aVar.internalFindViewById(R.id.v_quark_down);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        TextView textView = this.f37038c;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.B.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.B.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.B.a(this);
    }
}
