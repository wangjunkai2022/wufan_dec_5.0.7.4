package com.join.mgps.activity.screenshot;

import a4.b;
import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
import org.androidannotations.api.builder.f;
import y3.a;
/* loaded from: classes4.dex */
public final class ScreenShortBigImagActivity_ extends ScreenShortBigImagActivity implements a, a4.a, b {
    public static final String GAME_ID_EXTRA = "gameId";
    public static final String PN_EXTRA = "pn";
    public static final String POSITION_EXTRA = "position";
    public static final String TYPE_ID_EXTRA = "typeId";
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class IntentBuilder_ extends org.androidannotations.api.builder.a<IntentBuilder_> {
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, ScreenShortBigImagActivity_.class);
        }

        public IntentBuilder_ gameId(String str) {
            return (IntentBuilder_) super.extra("gameId", str);
        }

        public IntentBuilder_ pn(int i4) {
            return (IntentBuilder_) super.extra("pn", i4);
        }

        public IntentBuilder_ position(int i4) {
            return (IntentBuilder_) super.extra("position", i4);
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

        public IntentBuilder_ typeId(int i4) {
            return (IntentBuilder_) super.extra("typeId", i4);
        }

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), ScreenShortBigImagActivity_.class);
            this.fragmentSupport_ = fragment;
        }
    }

    private void init_(Bundle bundle) {
        c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("position")) {
                this.position = extras.getInt("position");
            }
            if (extras.containsKey("gameId")) {
                this.gameId = extras.getString("gameId");
            }
            if (extras.containsKey("typeId")) {
                this.typeId = extras.getInt("typeId");
            }
            if (extras.containsKey("pn")) {
                this.pn = extras.getInt("pn");
            }
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.screenshot.ScreenShortBigImagActivity
    public void loadListData(final int i4) {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.screenshot.ScreenShortBigImagActivity_.4
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    ScreenShortBigImagActivity_.super.loadListData(i4);
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.screenshort_bigimag_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.viewPager = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.positionShow = (TextView) aVar.internalFindViewById(R.id.positionShow);
        this.message = (TextView) aVar.internalFindViewById(R.id.message);
        this.nameAndDate = (TextView) aVar.internalFindViewById(R.id.nameAndDate);
        this.back = (ImageView) aVar.internalFindViewById(R.id.back);
        this.bottomLayout = (LinearLayout) aVar.internalFindViewById(R.id.bottomLayout);
        ViewPager viewPager = this.viewPager;
        if (viewPager != null) {
            viewPager.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortBigImagActivity_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ScreenShortBigImagActivity_.this.viewPager();
                }
            });
        }
        ImageView imageView = this.back;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortBigImagActivity_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ScreenShortBigImagActivity_.this.back();
                }
            });
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.screenshot.ScreenShortBigImagActivity
    public void updateUi(final List<ScreenShortListItemBean> list) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.screenshot.ScreenShortBigImagActivity_.3
            @Override // java.lang.Runnable
            public void run() {
                ScreenShortBigImagActivity_.super.updateUi(list);
            }
        }, 0L);
    }

    public static IntentBuilder_ intent(Fragment fragment) {
        return new IntentBuilder_(fragment);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.onViewChangedNotifier_.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.onViewChangedNotifier_.a(this);
    }
}
