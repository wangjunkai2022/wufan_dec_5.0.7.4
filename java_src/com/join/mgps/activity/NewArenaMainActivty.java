package com.join.mgps.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.fragment.NewArenaMainFragment;
import com.join.mgps.fragment.NewArenaMainFragment_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activty_new_arena)
/* loaded from: classes.dex */
public class NewArenaMainActivty extends FriendActivity {
    @ViewById
    RelativeLayout O;
    @ViewById
    FrameLayout P;
    TextView Q;
    LinearLayout R;
    TextView S;
    ScrollTextViewLayout T;
    ImageView U;
    ImageView V;
    ImageView W;
    private Animation Z;

    /* renamed from: p0  reason: collision with root package name */
    private NewArenaMainFragment f36123p0;

    /* renamed from: p1  reason: collision with root package name */
    private FragmentManager f36124p1;
    private Context N = this;
    private int X = 0;
    private int Y = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void a1() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        setSystemUiHide(true);
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            com.join.mgps.Util.d0.a().d(this);
        }
        getWindow().getDecorView().setSystemUiVisibility(1028);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f36124p1 = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        View inflate = LayoutInflater.from(this.N).inflate(R.layout.download_title_layout, (ViewGroup) null);
        this.Q = (TextView) inflate.findViewById(R.id.biground);
        this.R = (LinearLayout) inflate.findViewById(R.id.downloadLayout);
        this.T = (ScrollTextViewLayout) inflate.findViewById(R.id.scroll_text_layout);
        this.S = (TextView) inflate.findViewById(R.id.scroll_text);
        this.U = (ImageView) inflate.findViewById(R.id.hasNewFinishedGameImage);
        this.V = (ImageView) inflate.findViewById(R.id.downloadLine);
        this.W = (ImageView) inflate.findViewById(R.id.imageLoading);
        this.R.setVisibility(8);
        this.O.removeAllViews();
        this.O.addView(inflate);
        NewArenaMainFragment newArenaMainFragment = this.f36123p0;
        if (newArenaMainFragment == null) {
            NewArenaMainFragment_ newArenaMainFragment_ = new NewArenaMainFragment_();
            this.f36123p0 = newArenaMainFragment_;
            beginTransaction.add(R.id.mg_mian_fragmentlayout, newArenaMainFragment_);
        } else {
            beginTransaction.show(newArenaMainFragment);
        }
        try {
            beginTransaction.commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        checkDownlodingNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkDownlodingNumber() {
        this.X = p1.f.K().S();
        this.Y = p1.f.K().W(this);
        updateLine(p1.f.K().a0());
        int i4 = this.X;
        if (i4 != 0) {
            updateDownloadingPoint(i4);
        } else if (this.Y != 0) {
            updateNoOpenPoint();
        } else {
            updateHidePoint();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31376j = "BATTLE_HOME_PAGE";
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        if (nVar.c() != 8) {
            checkDownlodingNumber();
        }
    }

    void startLineAnimation() {
        this.V.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.img_translate);
        this.Z = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.W.setVisibility(8);
        this.W.startAnimation(this.Z);
        this.Z.setAnimationListener(new a());
    }

    void stopLineAnimation() {
        this.W.clearAnimation();
        this.W.setVisibility(8);
        this.V.setImageResource(R.drawable.line_white_bg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadingPoint(int i4) {
        this.Q.setVisibility(8);
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.Q.setLayoutParams(layoutParams);
            this.Q.setCompoundDrawables(null, null, null, null);
            this.Q.setBackgroundResource(R.drawable.mygame_big_round);
            this.Q.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            this.Q.setGravity(17);
            this.Q.setLayoutParams(layoutParams2);
            this.Q.setCompoundDrawables(null, null, null, null);
            this.Q.setBackgroundResource(R.drawable.message_round);
            this.Q.setPadding(1, 0, 2, 1);
        }
        TextView textView = this.Q;
        textView.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateHidePoint() {
        stopLineAnimation();
        this.Q.setVisibility(8);
        this.Q.setText("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateLine(int i4) {
        this.T.setDrawable(getResources().getDrawable(R.drawable.papa_download_butn));
        if (i4 == 0) {
            stopLineAnimation();
            return;
        }
        this.V.setImageResource(R.drawable.line_blue_bg);
        startLineAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateNoOpenPoint() {
        stopLineAnimation();
        this.Q.setVisibility(8);
        this.Q.setText("");
        Drawable drawable = getResources().getDrawable(R.drawable.mygame_litle_round);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
    }
}
