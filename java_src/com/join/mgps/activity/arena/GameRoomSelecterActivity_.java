package com.join.mgps.activity.arena;

import a4.b;
import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameInfoBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class GameRoomSelecterActivity_ extends GameRoomSelecterActivity implements y3.a, a4.a, b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f38858l = "mGameInfo";

    /* renamed from: j  reason: collision with root package name */
    private final c f38859j = new c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f38860k = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38861a;

        public a(Context context) {
            super(context, GameRoomSelecterActivity_.class);
        }

        public a a(GameInfoBean gameInfoBean) {
            return (a) super.extra("mGameInfo", gameInfoBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.f38861a;
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
            return new f(this.context);
        }

        public a(Fragment fragment) {
            super(fragment.getActivity(), GameRoomSelecterActivity_.class);
            this.f38861a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("mGameInfo")) {
            return;
        }
        this.f38842f = (GameInfoBean) extras.getSerializable("mGameInfo");
    }

    public static a k0(Context context) {
        return new a(context);
    }

    public static a l0(Fragment fragment) {
        return new a(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38860k.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.f38859j);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.newarena_gameroom_selecter_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38838b = (RecyclerView) aVar.internalFindViewById(R.id.recyclerViewGamelist);
        this.f38839c = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38860k.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38859j.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38859j.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38859j.a(this);
    }
}
