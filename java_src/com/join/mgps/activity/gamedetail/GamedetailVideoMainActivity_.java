package com.join.mgps.activity.gamedetail;

import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class GamedetailVideoMainActivity_ extends GamedetailVideoMainActivity implements y3.a, a4.a, a4.b {
    public static final String AUTODOWN_EXTRA = "autodown";
    public static final String EXT_BEAN_EXTRA = "extBean";
    public static final String FROM_EXTRA = "from";
    public static final String GAME_ID_EXTRA = "gameId";
    public static final String IS_SHOW_COMMENT_EXTRA = "isShowComment";
    private final c onViewChangedNotifier_ = new c();
    private final Map<Class<?>, Object> beans_ = new HashMap();

    /* loaded from: classes4.dex */
    public static class IntentBuilder_ extends org.androidannotations.api.builder.a<IntentBuilder_> {
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, GamedetailVideoMainActivity_.class);
        }

        public IntentBuilder_ autodown(boolean z4) {
            return (IntentBuilder_) super.extra(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        }

        public IntentBuilder_ extBean(ExtBean extBean) {
            return (IntentBuilder_) super.extra("extBean", extBean);
        }

        public IntentBuilder_ from(int i4) {
            return (IntentBuilder_) super.extra("from", i4);
        }

        public IntentBuilder_ gameId(String str) {
            return (IntentBuilder_) super.extra("gameId", str);
        }

        public IntentBuilder_ isShowComment(boolean z4) {
            return (IntentBuilder_) super.extra(GamedetailVideoMainActivity_.IS_SHOW_COMMENT_EXTRA, z4);
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
            super(fragment.getActivity(), GamedetailVideoMainActivity_.class);
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
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.gameId = extras.getString("gameId");
            }
            if (extras.containsKey("extBean")) {
                this.extBean = (ExtBean) extras.getSerializable("extBean");
            }
            if (extras.containsKey(AUTODOWN_EXTRA)) {
                this.autodown = extras.getBoolean(AUTODOWN_EXTRA);
            }
            if (extras.containsKey("from")) {
                this.from = extras.getInt("from");
            }
            if (extras.containsKey(IS_SHOW_COMMENT_EXTRA)) {
                this.isShowComment = extras.getBoolean(IS_SHOW_COMMENT_EXTRA);
            }
        }
    }

    public static IntentBuilder_ intent(Context context) {
        return new IntentBuilder_(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void animFinish() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.10
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.animFinish();
            }
        }, 600L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.beans_.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void getDetialData() {
        org.androidannotations.api.a.l(new a.c("", 0L, "") { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.13
            @Override // org.androidannotations.api.a.c
            public void execute() {
                try {
                    GamedetailVideoMainActivity_.super.getDetialData();
                } catch (Throwable th) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void hideLoadingDelay() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.5
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.hideLoadingDelay();
            }
        }, 200L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.gamedetail_video_main_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.viewPager = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.fragment = (FrameLayout) aVar.internalFindViewById(R.id.fragment);
        this.iv_back = aVar.internalFindViewById(R.id.iv_back);
        this.mainCover = aVar.internalFindViewById(R.id.mainCover);
        this.statuHVIew = aVar.internalFindViewById(R.id.statuHVIew);
        this.loding_layout = aVar.internalFindViewById(R.id.loding_layout);
        this.loding_faile = aVar.internalFindViewById(R.id.loding_faile);
        this.main_content = aVar.internalFindViewById(R.id.main_content);
        this.setNetwork = aVar.internalFindViewById(R.id.setNetwork);
        this.layout_old = (RelativeLayout) aVar.internalFindViewById(R.id.layout_old);
        this.layout_new = (ConstraintLayout) aVar.internalFindViewById(R.id.layout_new);
        this.viewpager = (ViewPager2) aVar.internalFindViewById(R.id.viewpager);
        this.tablayout = (TabLayout) aVar.internalFindViewById(R.id.tablayout);
        this.backImg = (ImageView) aVar.internalFindViewById(R.id.backImg);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View view = this.setNetwork;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    GamedetailVideoMainActivity_.this.setNetwork();
                }
            });
        }
        ImageView imageView = this.backImg;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    GamedetailVideoMainActivity_.this.backImg();
                }
            });
        }
        View view2 = this.iv_back;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    GamedetailVideoMainActivity_.this.iv_back();
                }
            });
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    GamedetailVideoMainActivity_.this.relodingimag();
                }
            });
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.beans_.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void scroolToposition() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.9
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.scroolToposition();
            }
        }, 1250L);
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
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void shakeAnim() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.8
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.shakeAnim();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.12
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.showLoding();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.11
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.showLodingFailed();
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void updateNewUi(final GameDetailBean gameDetailBean) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.7
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.updateNewUi(gameDetailBean);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity
    public void updateUi(final GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new Runnable() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_.6
            @Override // java.lang.Runnable
            public void run() {
                GamedetailVideoMainActivity_.super.updateUi(gamedetialModleFourBean);
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
