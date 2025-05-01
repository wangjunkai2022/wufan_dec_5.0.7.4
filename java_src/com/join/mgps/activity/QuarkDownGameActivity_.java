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
import com.join.mgps.dto.ExtInfoBean;
import com.join.mgps.dto.WebDiskInfo;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class QuarkDownGameActivity_ extends QuarkDownGameActivity implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    public static final String f36976t = "web_disk_info";

    /* renamed from: u  reason: collision with root package name */
    public static final String f36977u = "extInfo";

    /* renamed from: v  reason: collision with root package name */
    public static final String f36978v = "gameName";

    /* renamed from: w  reason: collision with root package name */
    public static final String f36979w = "gameId";

    /* renamed from: x  reason: collision with root package name */
    public static final String f36980x = "gameIconUrl";

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f36981r = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f36982s = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36983a;

        public a(Context context) {
            super(context, QuarkDownGameActivity_.class);
        }

        public a a(ExtInfoBean extInfoBean) {
            return (a) super.extra(QuarkDownGameActivity_.f36977u, extInfoBean);
        }

        public a b(String str) {
            return (a) super.extra("gameIconUrl", str);
        }

        public a c(String str) {
            return (a) super.extra("gameId", str);
        }

        public a d(String str) {
            return (a) super.extra("gameName", str);
        }

        public a e(WebDiskInfo webDiskInfo) {
            return (a) super.extra(QuarkDownGameActivity_.f36976t, webDiskInfo);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36983a;
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

        public a(Fragment fragment) {
            super(fragment.getActivity(), QuarkDownGameActivity_.class);
            this.f36983a = fragment;
        }
    }

    public static a i0(Context context) {
        return new a(context);
    }

    private void init_(Bundle bundle) {
        this.f36974p = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f36976t)) {
                this.f36969k = (WebDiskInfo) extras.getSerializable(f36976t);
            }
            if (extras.containsKey(f36977u)) {
                this.f36970l = (ExtInfoBean) extras.getSerializable(f36977u);
            }
            if (extras.containsKey("gameName")) {
                this.f36971m = extras.getString("gameName");
            }
            if (extras.containsKey("gameId")) {
                this.f36972n = extras.getString("gameId");
            }
            if (extras.containsKey("gameIconUrl")) {
                this.f36973o = extras.getString("gameIconUrl");
            }
        }
    }

    public static a j0(Fragment fragment) {
        return new a(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36982s.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36981r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_quark_down_game);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36960b = aVar.internalFindViewById(R.id.v_close1);
        this.f36961c = (TextView) aVar.internalFindViewById(R.id.tv_download);
        this.f36962d = (TextView) aVar.internalFindViewById(R.id.tv_not_ask);
        this.f36963e = (TextView) aVar.internalFindViewById(R.id.tv_desc);
        this.f36964f = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_game_icon);
        this.f36965g = (TextView) aVar.internalFindViewById(R.id.tv_game_name);
        this.f36966h = (TextView) aVar.internalFindViewById(R.id.tv_game_price);
        this.f36967i = (TextView) aVar.internalFindViewById(R.id.tv_label);
        this.f36968j = aVar.internalFindViewById(R.id.cl_content);
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36982s.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36981r.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36981r.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36981r.a(this);
    }
}
