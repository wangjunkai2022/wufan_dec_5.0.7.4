package com.join.mgps.activity.mygame.dialog;

import a4.b;
import a4.c;
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
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.f;
import y3.a;
/* loaded from: classes4.dex */
public final class WufunGameDownFirstNotPermissDialog_ extends WufunGameDownFirstNotPermissDialog implements a, a4.a, b {
    public static final String FROM_EXTRA = "from";
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class IntentBuilder_ extends org.androidannotations.api.builder.a<IntentBuilder_> {
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, WufunGameDownFirstNotPermissDialog_.class);
        }

        public IntentBuilder_ from(int i4) {
            return (IntentBuilder_) super.extra("from", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.fragmentSupport_;
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

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), WufunGameDownFirstNotPermissDialog_.class);
            this.fragmentSupport_ = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.prefDef = new PrefDef_(this);
        c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("from")) {
            return;
        }
        this.from = extras.getInt("from");
    }

    public static IntentBuilder_ intent(Context context) {
        return new IntentBuilder_(context);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.beans_.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.wufungame_first_downpermiss_dialog);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.img = (SimpleDraweeView) aVar.internalFindViewById(R.id.img);
        this.gameName = (TextView) aVar.internalFindViewById(R.id.gameName);
        View internalFindViewById = aVar.internalFindViewById(R.id.mainxxx);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.settingInfo);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.startButn);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.close);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WufunGameDownFirstNotPermissDialog_.this.mainxxx();
                }
            });
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WufunGameDownFirstNotPermissDialog_.this.settingInfo();
                }
            });
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WufunGameDownFirstNotPermissDialog_.this.startButn();
                }
            });
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WufunGameDownFirstNotPermissDialog_.this.close();
                }
            });
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    public static IntentBuilder_ intent(Fragment fragment) {
        return new IntentBuilder_(fragment);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.onViewChangedNotifier_.a(this);
    }
}
