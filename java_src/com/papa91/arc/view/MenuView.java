package com.papa91.arc.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.papa91.arc.EmuActivity_psp;
import com.papa91.arc.bean.EndGameAllowBean;
import com.papa91.arc.widget.LoadingImageView;
import com.papa91.arc.widget.view.MImageView;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class MenuView extends RelativeLayout implements View.OnClickListener, View.OnTouchListener {
    private final String TAG;
    ImageView alert;
    LottieAnimationView animationResult;
    LottieAnimationView animationResult2;
    LottieAnimationView animationResult3;
    ImageView btnBorderReward;
    ImageView btnExit;
    View changeDisk;
    View cheating;
    ConstraintLayout clFailed;
    ConstraintLayout clReward;
    ConstraintLayout clStart;
    ConstraintLayout clSuccess;
    ConstraintLayout clSuccess2;
    CountDownTimer countDownTimer;
    Dialog dialog;
    private CountDownTimer endGameCountDownTimer;
    View exit;
    MImageView fAchievement;
    MImageView fCheating;
    MImageView fGate;
    MImageView fHide;
    MImageView fOneKey;
    MImageView fQuickSlot;
    MImageView fScreenShot;
    MImageView fShow;
    ImageView failedSubTitle;
    FrameLayout flCountDown;
    ConstraintLayout flStart;
    View forum;
    private boolean hasGetAward;
    private boolean hiding;
    boolean isRankTimeStop;
    boolean isSound;
    boolean isVibrate;
    ImageView ivBtn;
    ImageView ivBtnReward;
    ImageView ivCountDown;
    ImageView ivEndlessPoint;
    ImageView ivEndlessPointFailed;
    ImageView iv_timer;
    ConstraintLayout llAgain;
    LinearLayout llQuest;
    LinearLayout ll_menu_left;
    LinearLayout ll_menu_right;
    LinearLayout ll_play_time;
    LoadingImageView loadingView;
    View menuBar;
    View menuBarOutSide;
    int menuBarStatue;
    MenuViewListener menuViewListener;
    long millisUntilFinish;
    View pause;
    View pauseBar;
    View performance;
    View quickSlot;
    int rankTime;
    View reload;
    View resume;
    ScheduledExecutorService scheduledExecutorService;
    private boolean showAdImage;
    private boolean showChangeDisk;
    View slot;
    View stickKeys;
    TextView timer;
    View timerBg;
    View timerContainer;
    TextView tip;
    TextView tvCloseTips;
    TextView tvCloseTips2;
    TextView tvDesc;
    TextView tvPointCount;
    TextView tvPointCountFailed;
    TextView tvQuest;
    TextView tvRewardCount;
    TextView tvRewardCountDouble;
    TextView tvRewardTips1;
    TextView tvRewardTips2;
    TextView tvTime;
    TextView tvTimeCost;
    TextView tvTimeCost2;
    TextView tv_game_pass;
    TextView tv_time;
    View v_line;
    View vibrate;
    View voice;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.papa91.arc.view.MenuView$12  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass12 extends AnimatorListenerAdapter {
        final /* synthetic */ EndGameAllowBean val$bean;
        final /* synthetic */ int val$mills;

        AnonymousClass12(int i4, EndGameAllowBean endGameAllowBean) {
            this.val$mills = i4;
            this.val$bean = endGameAllowBean;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MenuView.this.tvTimeCost.setVisibility(0);
            float f5 = (this.val$mills * 1.0f) / 1000.0f;
            if (f5 < 60.0f) {
                new DecimalFormat("#0.00").format(f5);
            } else {
                int i4 = (int) f5;
                int i5 = i4 / 60;
                int i6 = i4 % 60;
            }
            MenuView.this.tvTimeCost.setText(this.val$bean.getElapsedTimeHint());
            if (this.val$bean.getAwardCards() > 0 && this.val$bean.getMultipleAwardCards() > 0) {
                MenuView.this.clReward.setVisibility(0);
            } else {
                MenuView.this.clReward.setVisibility(4);
            }
            TextView textView = MenuView.this.tvRewardCount;
            textView.setText(this.val$bean.getAwardCards() + "");
            TextView textView2 = MenuView.this.tvRewardCountDouble;
            textView2.setText(this.val$bean.getMultipleAwardCards() + "");
            new Handler().postDelayed(new Runnable() { // from class: com.papa91.arc.view.MenuView.12.1
                @Override // java.lang.Runnable
                public void run() {
                    MenuView.this.tvCloseTips.setVisibility(0);
                    MenuView.this.clSuccess.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.arc.view.MenuView.12.1.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            MenuView menuView = MenuView.this;
                            if (menuView.menuViewListener != null) {
                                if (!menuView.hasGetAward && MenuView.this.clReward.getVisibility() == 0) {
                                    MenuView.this.menuViewListener.getPassRewardPoint();
                                } else {
                                    MenuView.this.menuViewListener.exitEndGame(false);
                                }
                            }
                        }
                    });
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.papa91.arc.view.MenuView$13  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass13 extends AnimatorListenerAdapter {
        final /* synthetic */ EndGameAllowBean val$bean;
        final /* synthetic */ int val$mills;

        AnonymousClass13(int i4, EndGameAllowBean endGameAllowBean) {
            this.val$mills = i4;
            this.val$bean = endGameAllowBean;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            String sb;
            super.onAnimationEnd(animator);
            MenuView.this.tvTimeCost.setVisibility(0);
            float f5 = (this.val$mills * 1.0f) / 1000.0f;
            if (f5 < 60.0f) {
                sb = new DecimalFormat("#0.00").format(f5) + "秒";
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i4 = (int) f5;
                sb2.append(i4 / 60);
                sb2.append("分");
                sb2.append(i4 % 60);
                sb2.append("秒");
                sb = sb2.toString();
            }
            MenuView.this.tvTimeCost.setText("用时：" + sb);
            MenuView.this.tvRewardTips1.setVisibility(0);
            MenuView.this.tvRewardTips2.setVisibility(0);
            List<String> redPacketList = this.val$bean.getRedPacketList();
            if (redPacketList != null && redPacketList.size() > 0) {
                MenuView.this.tvRewardTips2.setText(redPacketList.get(new Random().nextInt(redPacketList.size())));
            }
            new Handler().postDelayed(new Runnable() { // from class: com.papa91.arc.view.MenuView.13.1
                @Override // java.lang.Runnable
                public void run() {
                    MenuView.this.tvCloseTips2.setVisibility(0);
                    MenuView.this.clSuccess2.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.arc.view.MenuView.13.1.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            MenuViewListener menuViewListener = MenuView.this.menuViewListener;
                            if (menuViewListener != null) {
                                menuViewListener.exitEndGame(false);
                            }
                        }
                    });
                }
            }, 1500L);
        }
    }

    public MenuView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
        this.isSound = true;
        this.isVibrate = false;
        this.hiding = false;
        this.showAdImage = false;
        this.showChangeDisk = false;
        this.isRankTimeStop = false;
        this.rankTime = 0;
        this.menuBarStatue = 0;
        initView();
    }

    private String formatEndGameTime(int i4) {
        String str = "";
        if (i4 <= 0) {
            return "";
        }
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 > 0) {
            str = "" + i5 + "分钟";
        }
        if (i6 > 0) {
            str = str + i6 + "秒";
        }
        return str + "内,";
    }

    private void initView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.menu_view, this);
        this.fCheating = (MImageView) inflate.findViewById(R.id.fCheating);
        this.fQuickSlot = (MImageView) inflate.findViewById(R.id.fQuickSlot);
        this.fHide = (MImageView) inflate.findViewById(R.id.fHide);
        this.fShow = (MImageView) inflate.findViewById(R.id.fShow);
        this.fScreenShot = (MImageView) inflate.findViewById(R.id.fScreenShot);
        this.fGate = (MImageView) inflate.findViewById(R.id.fGate);
        this.fOneKey = (MImageView) inflate.findViewById(R.id.fOneKey);
        this.fAchievement = (MImageView) inflate.findViewById(R.id.fAchievement);
        this.pause = inflate.findViewById(R.id.pause);
        this.pauseBar = inflate.findViewById(R.id.pauseBar);
        this.resume = inflate.findViewById(R.id.resume);
        this.menuBarOutSide = inflate.findViewById(R.id.menuBarOutSide);
        this.menuBar = inflate.findViewById(R.id.menuBar);
        this.exit = inflate.findViewById(R.id.exit);
        this.reload = inflate.findViewById(R.id.reload);
        this.voice = inflate.findViewById(R.id.voice);
        this.vibrate = inflate.findViewById(R.id.vibrate);
        this.quickSlot = inflate.findViewById(R.id.quickSlot);
        this.forum = inflate.findViewById(R.id.forum);
        this.changeDisk = inflate.findViewById(R.id.changeDisk);
        this.slot = inflate.findViewById(R.id.slot);
        this.cheating = inflate.findViewById(R.id.cheating);
        this.performance = inflate.findViewById(R.id.performance);
        this.stickKeys = inflate.findViewById(R.id.stickKeys);
        this.timerContainer = inflate.findViewById(R.id.timerContainer);
        this.timerBg = inflate.findViewById(R.id.timerBg);
        this.timer = (TextView) inflate.findViewById(R.id.timer);
        this.alert = (ImageView) inflate.findViewById(R.id.alert);
        this.btnBorderReward = (ImageView) inflate.findViewById(R.id.btnBorderReward);
        this.ivBtnReward = (ImageView) inflate.findViewById(R.id.ivBtnReward);
        this.tvRewardCount = (TextView) inflate.findViewById(R.id.tvRewardCount);
        this.tvRewardCountDouble = (TextView) inflate.findViewById(R.id.tvRewardCountDouble);
        this.ll_play_time = (LinearLayout) inflate.findViewById(R.id.ll_play_time);
        this.iv_timer = (ImageView) inflate.findViewById(R.id.iv_timer);
        this.tv_time = (TextView) inflate.findViewById(R.id.tv_time);
        this.v_line = inflate.findViewById(R.id.v_line);
        this.tv_game_pass = (TextView) inflate.findViewById(R.id.tv_game_pass);
        this.animationResult = (LottieAnimationView) inflate.findViewById(R.id.animationResult);
        this.animationResult2 = (LottieAnimationView) inflate.findViewById(R.id.animationResult2);
        this.animationResult3 = (LottieAnimationView) inflate.findViewById(R.id.animationResult3);
        this.ll_menu_left = (LinearLayout) inflate.findViewById(R.id.ll_menu_left);
        this.ll_menu_right = (LinearLayout) inflate.findViewById(R.id.ll_menu_right);
        this.clStart = (ConstraintLayout) inflate.findViewById(R.id.clStart);
        this.flStart = (ConstraintLayout) inflate.findViewById(R.id.flStart);
        this.tvPointCount = (TextView) inflate.findViewById(R.id.tvPointCount);
        this.ivEndlessPoint = (ImageView) inflate.findViewById(R.id.ivEndlessPoint);
        this.llAgain = (ConstraintLayout) inflate.findViewById(R.id.llAgain);
        this.ivCountDown = (ImageView) inflate.findViewById(R.id.ivCountDown);
        this.tvPointCountFailed = (TextView) inflate.findViewById(R.id.tvPointCountFailed);
        this.ivEndlessPointFailed = (ImageView) inflate.findViewById(R.id.ivEndlessPointFailed);
        this.failedSubTitle = (ImageView) inflate.findViewById(R.id.failedSubTitle);
        this.clFailed = (ConstraintLayout) inflate.findViewById(R.id.clFailed);
        this.flCountDown = (FrameLayout) inflate.findViewById(R.id.flCountDown);
        this.tvQuest = (TextView) inflate.findViewById(R.id.tvQuest);
        this.tvTime = (TextView) inflate.findViewById(R.id.tvTime);
        this.llQuest = (LinearLayout) inflate.findViewById(R.id.llQuest);
        this.clSuccess = (ConstraintLayout) inflate.findViewById(R.id.clSuccess);
        this.clSuccess2 = (ConstraintLayout) inflate.findViewById(R.id.clSuccess2);
        this.btnExit = (ImageView) inflate.findViewById(R.id.btnExit);
        this.tvDesc = (TextView) inflate.findViewById(R.id.tvDesc);
        this.tvCloseTips = (TextView) inflate.findViewById(R.id.tvCloseTips);
        this.tvCloseTips2 = (TextView) inflate.findViewById(R.id.tvCloseTips2);
        this.tvTimeCost = (TextView) inflate.findViewById(R.id.tvTimeCost);
        this.tvTimeCost2 = (TextView) inflate.findViewById(R.id.tvTimeCost2);
        this.tvRewardTips1 = (TextView) inflate.findViewById(R.id.tvRewardTips1);
        this.tvRewardTips2 = (TextView) inflate.findViewById(R.id.tvRewardTips2);
        this.clReward = (ConstraintLayout) inflate.findViewById(R.id.clReward);
        this.loadingView = (LoadingImageView) inflate.findViewById(R.id.loadingView);
        this.ivBtn = (ImageView) inflate.findViewById(R.id.ivBtn);
        this.fCheating.setOnClickListener(this);
        this.fQuickSlot.setOnClickListener(this);
        this.fHide.setOnClickListener(this);
        this.fShow.setOnClickListener(this);
        this.fScreenShot.setOnClickListener(this);
        this.fGate.setOnClickListener(this);
        this.fOneKey.setOnClickListener(this);
        this.fAchievement.setOnClickListener(this);
        this.pause.setOnClickListener(this);
        this.resume.setOnClickListener(this);
        this.menuBar.setOnClickListener(this);
        this.exit.setOnClickListener(this);
        this.reload.setOnClickListener(this);
        this.voice.setOnClickListener(this);
        this.vibrate.setOnClickListener(this);
        this.quickSlot.setOnClickListener(this);
        this.forum.setOnClickListener(this);
        this.slot.setOnClickListener(this);
        this.cheating.setOnClickListener(this);
        this.performance.setOnClickListener(this);
        this.stickKeys.setOnClickListener(this);
        this.timerBg.setOnClickListener(this);
        this.timer.setOnClickListener(this);
        this.changeDisk.setOnClickListener(this);
        this.tv_game_pass.setOnClickListener(this);
        this.flStart.setOnClickListener(this);
        this.llAgain.setOnClickListener(this);
        this.btnExit.setOnClickListener(this);
        this.clSuccess.setOnClickListener(this);
        this.clStart.setOnClickListener(this);
        this.clFailed.setOnClickListener(this);
        this.flCountDown.setOnClickListener(this);
        this.ivBtnReward.setOnClickListener(this);
        this.btnBorderReward.setOnClickListener(this);
        this.menuBar.setOnTouchListener(new View.OnTouchListener() { // from class: com.papa91.arc.view.MenuView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    MenuView.this.dismissMenu();
                    return true;
                }
                return false;
            }
        });
        this.menuBarOutSide.setOnTouchListener(this);
        this.changeDisk.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTime$0(int i4, int i5, int i6, int i7) {
        Object obj;
        Object obj2;
        Object obj3;
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null) {
            if (i4 >= menuViewListener.getMiniRankTime()) {
                this.tv_game_pass.setTextColor(Color.parseColor("#A7E0FF"));
            } else {
                this.tv_game_pass.setTextColor(Color.parseColor("#6F7989"));
            }
        }
        TextView textView = this.tv_time;
        StringBuilder sb = new StringBuilder();
        if (i5 > 9) {
            obj = Integer.valueOf(i5);
        } else {
            obj = "0" + i5;
        }
        sb.append(obj);
        sb.append(":");
        if (i6 > 9) {
            obj2 = Integer.valueOf(i6);
        } else {
            obj2 = "0" + i6;
        }
        sb.append(obj2);
        sb.append(":");
        if (i7 > 9) {
            obj3 = Integer.valueOf(i7);
        } else {
            obj3 = "0" + i7;
        }
        sb.append(obj3);
        textView.setText(sb.toString());
    }

    void alertRing() {
        if (this.millisUntilFinish / 1000 >= 10 || !(this.alert.getDrawable() instanceof AnimationDrawable)) {
            return;
        }
        ((AnimationDrawable) this.alert.getDrawable()).start();
    }

    void alertStop() {
        ImageView imageView = this.alert;
        if (imageView == null || !(imageView.getDrawable() instanceof AnimationDrawable)) {
            return;
        }
        ((AnimationDrawable) this.alert.getDrawable()).stop();
    }

    public void amplification() {
        if (menuShowing() || this.pauseBar.getVisibility() == 4) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.pauseBar, "translationY", 0.0f, this.pauseBar.getMeasuredHeight()).setDuration(160L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.papa91.arc.view.MenuView.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                MenuView.this.pauseBar.setVisibility(4);
            }
        });
        duration.start();
    }

    public void dismissMenu() {
        View view = this.menuBar;
        if (view == null || this.pauseBar == null || this.hiding) {
            return;
        }
        this.hiding = true;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.menuBar, "translationY", 0, view.getMeasuredHeight() - this.pauseBar.getMeasuredHeight()).setDuration(160L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.papa91.arc.view.MenuView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                MenuView.this.menuBar.setVisibility(8);
                MenuView.this.hiding = false;
                MenuViewListener menuViewListener = MenuView.this.menuViewListener;
                if (menuViewListener != null) {
                    menuViewListener.saveGameConfig();
                }
            }
        });
        duration.start();
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.needShowBottomBar()) {
            this.pauseBar.setVisibility(0);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pauseBar, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.papa91.arc.view.MenuView.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }
        });
        ofFloat.setDuration(180L);
        ofFloat.start();
        this.changeDisk.setVisibility(8);
    }

    public void endGameFailed(int i4, boolean z4, int i5) {
        hideAllEndGameView();
        this.clFailed.setVisibility(0);
        this.btnExit.setVisibility(0);
        if (z4) {
            this.ivEndlessPointFailed.setVisibility(0);
            this.tvPointCountFailed.setVisibility(8);
        } else {
            this.ivEndlessPointFailed.setVisibility(8);
            this.tvPointCountFailed.setVisibility(0);
            this.tvPointCountFailed.setText(String.valueOf(i4));
        }
        if (i5 == 1) {
            this.failedSubTitle.setImageResource(R.drawable.failed_time_out);
        } else if (i5 == 2) {
            this.failedSubTitle.setImageResource(R.drawable.failed_player_dead);
        } else if (i5 != 3) {
        } else {
            this.failedSubTitle.setImageResource(R.drawable.failed_player_harmed);
        }
    }

    public void endGameSuccess(int i4, EndGameAllowBean endGameAllowBean) {
        this.clSuccess.setOnClickListener(null);
        hideAllEndGameView();
        this.clSuccess.setVisibility(0);
        if (endGameAllowBean.isWelfareSwitch()) {
            showResultAnimationRedPackage(i4, endGameAllowBean);
        } else {
            showAnimationResult(i4, endGameAllowBean);
        }
    }

    public int getRankTime() {
        return this.rankTime;
    }

    public void hide() {
        hide(0);
    }

    public void hide2Float() {
        this.menuBarStatue = this.menuBar.getVisibility() == 0 ? 1 : 0;
        MImageView mImageView = this.fShow;
        ObjectAnimator duration = ObjectAnimator.ofFloat(mImageView, "translationX", -mImageView.getMeasuredWidth(), 0.0f).setDuration(180L);
        duration.addListener(new Animator.AnimatorListener() { // from class: com.papa91.arc.view.MenuView.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MenuView.this.fShow.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        duration.start();
        this.fHide.hide(true);
        this.fScreenShot.hide(true);
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isShowAchievementIcon()) {
            this.fAchievement.hide(true);
        }
        MenuViewListener menuViewListener2 = this.menuViewListener;
        if (menuViewListener2 != null && menuViewListener2.isShowGate()) {
            this.fGate.hide(true);
        }
        MenuViewListener menuViewListener3 = this.menuViewListener;
        if (menuViewListener3 != null && menuViewListener3.isShowOnekey()) {
            this.fOneKey.hide(true);
        }
        MenuViewListener menuViewListener4 = this.menuViewListener;
        if (menuViewListener4 != null && menuViewListener4.isShowCheating()) {
            this.fCheating.hide(true);
        }
        MenuViewListener menuViewListener5 = this.menuViewListener;
        if (menuViewListener5 != null && menuViewListener5.isShowQuickSlot()) {
            this.fQuickSlot.hide(true);
        }
        MenuViewListener menuViewListener6 = this.menuViewListener;
        if (menuViewListener6 != null && menuViewListener6.isRankGame()) {
            this.ll_play_time.setVisibility(8);
        }
        this.pauseBar.setVisibility(8);
        this.pause.setVisibility(8);
        this.menuBar.setVisibility(8);
    }

    public void hideAllEndGameView() {
        this.clStart.setVisibility(8);
        this.clFailed.setVisibility(8);
        this.clSuccess.setVisibility(8);
        this.flCountDown.setVisibility(8);
        this.btnExit.setVisibility(8);
        this.llQuest.setVisibility(8);
        this.clSuccess.setVisibility(8);
    }

    public void hideTimer() {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            this.ll_play_time.setVisibility(8);
            return;
        }
        View view = this.timerContainer;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean isTimerShowing() {
        return this.timerContainer.getVisibility() == 0 && this.millisUntilFinish / 1000 > 0;
    }

    public boolean menuShowing() {
        View view = this.menuBar;
        return view != null && view.getVisibility() == 0;
    }

    public void narrow() {
        if (this.pauseBar.getVisibility() == 0) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.pauseBar, "translationY", this.pauseBar.getMeasuredHeight(), 0.0f).setDuration(160L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.papa91.arc.view.MenuView.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                MenuView.this.pauseBar.setVisibility(0);
            }
        });
        duration.start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuViewListener menuViewListener;
        int id = view.getId();
        if (id == R.id.pause) {
            popupMenu();
            MenuViewListener menuViewListener2 = this.menuViewListener;
            if (menuViewListener2 != null) {
                menuViewListener2.gameOnPause();
            }
        } else if (id == R.id.resume) {
            dismissMenu();
            MenuViewListener menuViewListener3 = this.menuViewListener;
            if (menuViewListener3 != null) {
                menuViewListener3.gameOnResume();
            }
        } else if (id == R.id.menuBarOutSide) {
            if (!menuShowing() || this.hiding) {
                return;
            }
            dismissMenu();
            MenuViewListener menuViewListener4 = this.menuViewListener;
            if (menuViewListener4 != null) {
                menuViewListener4.gameOnResume();
            }
        } else if (id == R.id.menuBar) {
        } else {
            if (id == R.id.fHide) {
                hide2Float();
                MenuViewListener menuViewListener5 = this.menuViewListener;
                if (menuViewListener5 != null) {
                    menuViewListener5.onHideMenu();
                }
            } else if (id == R.id.fShow) {
                show();
            } else if (id != R.id.slot && id != R.id.fQuickSlot) {
                if (id != R.id.cheating && id != R.id.fCheating) {
                    if (id == R.id.performance) {
                        MenuViewListener menuViewListener6 = this.menuViewListener;
                        if (menuViewListener6 != null) {
                            menuViewListener6.showMenuPerformance();
                        }
                        dismissMenu();
                        return;
                    } else if (id == R.id.exit) {
                        MenuViewListener menuViewListener7 = this.menuViewListener;
                        if (menuViewListener7 != null) {
                            menuViewListener7.exit();
                            return;
                        }
                        return;
                    } else if (id == R.id.reload) {
                        showReloadPrompt();
                        return;
                    } else if (id == R.id.voice) {
                        boolean z4 = !this.isSound;
                        this.isSound = z4;
                        MenuViewListener menuViewListener8 = this.menuViewListener;
                        if (menuViewListener8 != null) {
                            menuViewListener8.voice(z4);
                        }
                        if (this.isSound) {
                            this.voice.setBackgroundResource(R.drawable.voice);
                            return;
                        } else {
                            this.voice.setBackgroundResource(R.drawable.voice_mute);
                            return;
                        }
                    } else if (id == R.id.vibrate) {
                        boolean z5 = !this.isVibrate;
                        this.isVibrate = z5;
                        MenuViewListener menuViewListener9 = this.menuViewListener;
                        if (menuViewListener9 != null) {
                            menuViewListener9.vibrate(z5);
                        }
                        if (this.isVibrate) {
                            this.vibrate.setBackgroundResource(R.drawable.vibrate);
                            return;
                        } else {
                            this.vibrate.setBackgroundResource(R.drawable.vibrate_off);
                            return;
                        }
                    } else if (id == R.id.quickSlot) {
                        MenuViewListener menuViewListener10 = this.menuViewListener;
                        if (menuViewListener10 != null) {
                            menuViewListener10.quickSlot();
                            return;
                        }
                        return;
                    } else if (id == R.id.forum) {
                        MenuViewListener menuViewListener11 = this.menuViewListener;
                        if (menuViewListener11 != null) {
                            menuViewListener11.forum();
                            return;
                        }
                        return;
                    } else if (id == R.id.stickKeys) {
                        MenuViewListener menuViewListener12 = this.menuViewListener;
                        if (menuViewListener12 != null) {
                            menuViewListener12.keysSetting();
                            return;
                        }
                        return;
                    } else if (id != R.id.timerBg && id != R.id.timer) {
                        if (id == R.id.fGate) {
                            MenuViewListener menuViewListener13 = this.menuViewListener;
                            if (menuViewListener13 != null) {
                                menuViewListener13.showMenuGate();
                                return;
                            }
                            return;
                        } else if (id == R.id.fOneKey) {
                            MenuViewListener menuViewListener14 = this.menuViewListener;
                            if (menuViewListener14 != null) {
                                menuViewListener14.showMenuOnekey();
                                return;
                            }
                            return;
                        } else if (id == R.id.fScreenShot) {
                            if (this.showAdImage) {
                                MenuViewListener menuViewListener15 = this.menuViewListener;
                                if (menuViewListener15 != null) {
                                    menuViewListener15.onAdImageClick();
                                    return;
                                }
                                return;
                            }
                            MenuViewListener menuViewListener16 = this.menuViewListener;
                            if (menuViewListener16 != null) {
                                menuViewListener16.onScreenShot();
                                return;
                            }
                            return;
                        } else if (id == R.id.changeDisk) {
                            dismissMenu();
                            MenuViewListener menuViewListener17 = this.menuViewListener;
                            if (menuViewListener17 != null) {
                                menuViewListener17.onChangeDisk();
                            }
                            MenuViewListener menuViewListener18 = this.menuViewListener;
                            if (menuViewListener18 != null) {
                                menuViewListener18.gameOnResume();
                                return;
                            }
                            return;
                        } else if (id == R.id.tv_game_pass) {
                            MenuViewListener menuViewListener19 = this.menuViewListener;
                            if (menuViewListener19 != null) {
                                menuViewListener19.onRankFinish(this.rankTime);
                                return;
                            }
                            return;
                        } else if (id == R.id.flStart) {
                            MenuViewListener menuViewListener20 = this.menuViewListener;
                            if (menuViewListener20 != null) {
                                menuViewListener20.startEndGame();
                                return;
                            }
                            return;
                        } else if (id == R.id.llAgain) {
                            MenuViewListener menuViewListener21 = this.menuViewListener;
                            if (menuViewListener21 != null) {
                                menuViewListener21.restartEndGame();
                                return;
                            }
                            return;
                        } else if (id == R.id.btnExit) {
                            MenuViewListener menuViewListener22 = this.menuViewListener;
                            if (menuViewListener22 != null) {
                                menuViewListener22.exitEndGame(true);
                                return;
                            }
                            return;
                        } else if (id == R.id.clSuccess) {
                            MenuViewListener menuViewListener23 = this.menuViewListener;
                            if (menuViewListener23 != null) {
                                menuViewListener23.exitEndGame(false);
                                return;
                            }
                            return;
                        } else if (id == R.id.clStart || id == R.id.clFailed || id == R.id.flCountDown) {
                            return;
                        } else {
                            if (id == R.id.btnBorderReward) {
                                MenuViewListener menuViewListener24 = this.menuViewListener;
                                if (menuViewListener24 != null) {
                                    menuViewListener24.getPassRewardPoint();
                                    this.hasGetAward = true;
                                    return;
                                }
                                return;
                            } else if (id == R.id.ivBtnReward) {
                                MenuViewListener menuViewListener25 = this.menuViewListener;
                                if (menuViewListener25 != null) {
                                    menuViewListener25.playVideoForReward();
                                    this.hasGetAward = true;
                                    return;
                                }
                                return;
                            } else if (id != R.id.fAchievement || (menuViewListener = this.menuViewListener) == null) {
                                return;
                            } else {
                                menuViewListener.showAchievementDialog(1);
                                return;
                            }
                        }
                    } else {
                        MenuViewListener menuViewListener26 = this.menuViewListener;
                        if (menuViewListener26 != null) {
                            menuViewListener26.showTimeLimitedDialog1();
                        }
                        EmuActivity_psp.sendLimitStat("OnClickPSPCutDown");
                        return;
                    }
                }
                MenuViewListener menuViewListener27 = this.menuViewListener;
                if (menuViewListener27 != null) {
                    menuViewListener27.showMenuCheating();
                }
                dismissMenu();
            } else {
                MenuViewListener menuViewListener28 = this.menuViewListener;
                if (menuViewListener28 != null) {
                    menuViewListener28.showMenuSlot();
                }
                dismissMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        releaseTimer();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (menuShowing()) {
            dismissMenu();
            MenuViewListener menuViewListener = this.menuViewListener;
            if (menuViewListener != null) {
                menuViewListener.gameOnResume();
                return true;
            }
            return true;
        }
        return false;
    }

    public void pauseTimer() {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            this.isRankTimeStop = true;
            return;
        }
        releaseTimer();
        alertStop();
    }

    public void popupMenu() {
        View view;
        if (this.menuBar == null || (view = this.pauseBar) == null) {
            return;
        }
        view.setVisibility(8);
        this.menuBar.setVisibility(0);
        int measuredHeight = this.menuBar.getMeasuredHeight() - this.pauseBar.getMeasuredHeight();
        if (measuredHeight == 0) {
            measuredHeight = (int) TypedValue.applyDimension(1, 106.0f, getResources().getDisplayMetrics());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pop start=");
        sb.append(0);
        sb.append(", end=");
        sb.append(measuredHeight);
        ObjectAnimator.ofFloat(this.menuBar, "translationY", measuredHeight, 0).setDuration(180L).start();
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null) {
            this.isSound = menuViewListener.IsSoundEnable();
        }
        MenuViewListener menuViewListener2 = this.menuViewListener;
        if (menuViewListener2 != null) {
            this.isVibrate = menuViewListener2.IsHapticFeedbackEnable();
        }
        if (this.isSound) {
            this.voice.setBackgroundResource(R.drawable.voice);
        } else {
            this.voice.setBackgroundResource(R.drawable.voice_mute);
        }
        if (this.isVibrate) {
            this.vibrate.setBackgroundResource(R.drawable.vibrate);
        } else {
            this.vibrate.setBackgroundResource(R.drawable.vibrate_off);
        }
        MenuViewListener menuViewListener3 = this.menuViewListener;
        if (menuViewListener3 != null) {
            this.changeDisk.setVisibility(menuViewListener3.getChangeDiskState() ? 0 : 8);
        }
    }

    public void releaseTimer() {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.isRankTimeStop = true;
                try {
                    scheduledExecutorService.shutdown();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            return;
        }
        alertStop();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.countDownTimer = null;
        }
    }

    public void resumeTimer() {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            this.isRankTimeStop = false;
        } else {
            startTimer(this.millisUntilFinish);
        }
    }

    public void setMenuViewListener(MenuViewListener menuViewListener) {
        this.menuViewListener = menuViewListener;
        if (menuViewListener.isShowAchievementIcon()) {
            this.fAchievement.setVisibility(0);
        } else {
            this.fAchievement.setVisibility(8);
        }
        if (this.menuViewListener.isShowGate()) {
            this.fGate.setVisibility(0);
        } else {
            this.fGate.setVisibility(8);
        }
        if (this.menuViewListener.isShowOnekey()) {
            this.fOneKey.setVisibility(0);
        } else {
            this.fOneKey.setVisibility(8);
        }
        if (this.menuViewListener.isShowCheating()) {
            this.fCheating.setVisibility(0);
        } else {
            this.fCheating.setVisibility(8);
        }
        if (this.menuViewListener.isShowQuickSlot()) {
            this.fQuickSlot.setVisibility(0);
        } else {
            this.fQuickSlot.setVisibility(8);
        }
        if (this.menuViewListener.needShowTimer()) {
            showTimer();
        } else {
            hideTimer();
        }
        MenuViewListener menuViewListener2 = this.menuViewListener;
        if (menuViewListener2 != null && menuViewListener2.needShowBottomBar()) {
            this.pauseBar.setVisibility(0);
        } else {
            this.pauseBar.setVisibility(8);
        }
        MenuViewListener menuViewListener3 = this.menuViewListener;
        if (menuViewListener3 != null && menuViewListener3.isRankAutoUpload()) {
            this.tv_game_pass.setVisibility(8);
            this.v_line.setVisibility(8);
        } else {
            this.tv_game_pass.setVisibility(0);
            this.v_line.setVisibility(0);
        }
        MenuViewListener menuViewListener4 = this.menuViewListener;
        if (menuViewListener4 == null || !menuViewListener4.isEndGame()) {
            return;
        }
        this.ll_menu_left.setVisibility(8);
        this.ll_menu_right.setVisibility(8);
        this.pause.setVisibility(8);
        this.pauseBar.setVisibility(8);
        this.menuBar.setVisibility(8);
    }

    public void setRankTimeStop(boolean z4) {
        this.isRankTimeStop = z4;
    }

    public void setTime(long j4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((j4 / 1000) + " "));
        SpannableString spannableString = new SpannableString("进入广告");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#9C7140")), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        this.timer.setText(spannableStringBuilder);
    }

    public void show() {
        setVisibility(0);
        MImageView mImageView = this.fShow;
        ObjectAnimator duration = ObjectAnimator.ofFloat(mImageView, "translationX", 0.0f, -mImageView.getMeasuredWidth()).setDuration(180L);
        duration.addListener(new Animator.AnimatorListener() { // from class: com.papa91.arc.view.MenuView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MenuView.this.fShow.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        duration.start();
        this.fHide.show(true);
        this.fScreenShot.show(true);
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isShowOnekey()) {
            this.fOneKey.show(true);
        }
        MenuViewListener menuViewListener2 = this.menuViewListener;
        if (menuViewListener2 != null && menuViewListener2.isShowGate()) {
            this.fGate.show(true);
        }
        MenuViewListener menuViewListener3 = this.menuViewListener;
        if (menuViewListener3 != null && menuViewListener3.isShowCheating()) {
            this.fCheating.show(true);
        }
        MenuViewListener menuViewListener4 = this.menuViewListener;
        if (menuViewListener4 != null && menuViewListener4.isShowQuickSlot()) {
            this.fQuickSlot.show(true);
        }
        MenuViewListener menuViewListener5 = this.menuViewListener;
        if (menuViewListener5 != null && menuViewListener5.isShowAchievementIcon()) {
            this.fAchievement.show(true);
        }
        MenuViewListener menuViewListener6 = this.menuViewListener;
        if (menuViewListener6 != null && menuViewListener6.needShowBottomBar()) {
            this.pauseBar.setVisibility(0);
            this.pause.setVisibility(0);
        } else {
            this.pauseBar.setVisibility(8);
            this.pause.setVisibility(8);
        }
        MenuViewListener menuViewListener7 = this.menuViewListener;
        if (menuViewListener7 != null && menuViewListener7.isRankGame()) {
            this.ll_play_time.setVisibility(0);
        } else {
            this.ll_play_time.setVisibility(8);
        }
        this.menuBar.setVisibility(8);
        if (this.menuBarStatue == 1) {
            popupMenu();
            this.menuBarStatue = 0;
        }
    }

    public void showAdImage(boolean z4, String str) {
        this.showAdImage = z4;
        if (z4) {
            this.fScreenShot.setController(Fresco.newDraweeControllerBuilder().a(Uri.parse(str)).E(true).build());
            return;
        }
        this.fScreenShot.setImageResource(R.drawable.f_screen_shot);
    }

    public void showAnimationResult(int i4, EndGameAllowBean endGameAllowBean) {
        this.clSuccess.setVisibility(0);
        this.clSuccess2.setVisibility(8);
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null) {
            String endGameScore = menuViewListener.getEndGameScore(i4);
            endGameScore.hashCode();
            char c5 = 65535;
            switch (endGameScore.hashCode()) {
                case 65:
                    if (endGameScore.equals("A")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 66:
                    if (endGameScore.equals("B")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 67:
                    if (endGameScore.equals("C")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 83:
                    if (endGameScore.equals("S")) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            String str = "C.json";
            switch (c5) {
                case 0:
                    str = "A.json";
                    break;
                case 1:
                    str = "B.json";
                    break;
                case 3:
                    str = "S.json";
                    break;
            }
            this.animationResult.setImageAssetsFolder("animation_png/");
            this.animationResult.setAnimation(str);
            this.animationResult.setRepeatCount(0);
            this.animationResult.D();
            this.animationResult.g(new AnonymousClass12(i4, endGameAllowBean));
        }
    }

    public void showEndGameCountdown() {
        hideAllEndGameView();
        this.flCountDown.setVisibility(0);
        this.ivCountDown.setImageResource(R.drawable.count_down_3);
        new CountDownTimer(3200L, 1000L) { // from class: com.papa91.arc.view.MenuView.14
            @Override // android.os.CountDownTimer
            public void onFinish() {
                MenuView.this.flCountDown.setVisibility(8);
                MenuView.this.showQuestAndTime();
                MenuViewListener menuViewListener = MenuView.this.menuViewListener;
                if (menuViewListener != null) {
                    menuViewListener.gameOnResume();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                long j5 = j4 / 1000;
                if (j5 == 3) {
                    MenuView.this.ivCountDown.setImageResource(R.drawable.count_down_3);
                } else if (j5 == 2) {
                    MenuView.this.ivCountDown.setImageResource(R.drawable.count_down_2);
                } else if (j5 == 1) {
                    MenuView.this.ivCountDown.setImageResource(R.drawable.count_down_1);
                }
            }
        }.start();
    }

    public void showEndGameStart(boolean z4, int i4, boolean z5) {
        hideAllEndGameView();
        this.clStart.setVisibility(0);
        this.btnExit.setVisibility(0);
        this.loadingView.setVisibility(z4 ? 0 : 4);
        this.ivBtn.setVisibility(z4 ? 4 : 0);
        this.tvDesc.setVisibility(z4 ? 4 : 0);
        this.flStart.setVisibility(z4 ? 4 : 0);
        if (z5) {
            this.ivEndlessPoint.setVisibility(0);
            this.tvPointCount.setVisibility(8);
        } else {
            this.ivEndlessPoint.setVisibility(8);
            this.tvPointCount.setVisibility(0);
            this.tvPointCount.setText(String.valueOf(i4));
        }
        if (this.menuViewListener != null) {
            this.tvDesc.setText(Html.fromHtml("<font color='#FFA600'>" + formatEndGameTime(this.menuViewListener.getEndGameLimitTime()) + "</font>" + this.menuViewListener.getEndGameDesc()));
        }
    }

    public void showQuestAndTime() {
        if (this.menuViewListener != null) {
            hideAllEndGameView();
            this.llQuest.setVisibility(0);
            this.tvQuest.setText(this.menuViewListener.getEndGameDesc());
            final int endGameLimitTime = this.menuViewListener.getEndGameLimitTime();
            CountDownTimer countDownTimer = this.endGameCountDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            CountDownTimer countDownTimer2 = new CountDownTimer(2147483647L, 1000L) { // from class: com.papa91.arc.view.MenuView.15
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    MenuView.this.llQuest.setVisibility(8);
                    cancel();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    int gamePlayTime = endGameLimitTime - (MenuView.this.menuViewListener.getGamePlayTime() / 1000);
                    TextView textView = MenuView.this.tvTime;
                    textView.setText("剩余时间：" + gamePlayTime + "秒");
                    if (gamePlayTime <= 0) {
                        onFinish();
                    }
                }
            };
            this.endGameCountDownTimer = countDownTimer2;
            countDownTimer2.start();
        }
    }

    public void showReloadPrompt() {
        if (this.dialog == null) {
            Dialog dialog = new Dialog(getContext(), R.style.PspDialog);
            this.dialog = dialog;
            dialog.setContentView(R.layout.dialog_exit);
            this.dialog.setCanceledOnTouchOutside(true);
            this.tip = (TextView) this.dialog.findViewById(R.id.textView2);
            this.dialog.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: com.papa91.arc.view.MenuView.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Dialog dialog2 = MenuView.this.dialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                    }
                }
            });
        }
        this.dialog.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() { // from class: com.papa91.arc.view.MenuView.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dialog dialog2 = MenuView.this.dialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                MenuView.this.dismissMenu();
                MenuViewListener menuViewListener = MenuView.this.menuViewListener;
                if (menuViewListener != null) {
                    menuViewListener.reload();
                }
            }
        });
        this.tip.setText("是否要重新启动游戏？");
        if (this.dialog.isShowing()) {
            return;
        }
        this.dialog.show();
    }

    public void showResultAnimationRedPackage(int i4, EndGameAllowBean endGameAllowBean) {
        this.clSuccess2.setVisibility(0);
        this.clSuccess.setVisibility(8);
        this.animationResult2.setImageAssetsFolder("light_png/");
        this.animationResult2.setAnimation("light.json");
        this.animationResult2.setRepeatCount(-1);
        this.animationResult2.D();
        this.animationResult3.setImageAssetsFolder("red_package_png/");
        this.animationResult3.setAnimation("red_package.json");
        this.animationResult3.setRepeatCount(0);
        this.animationResult3.D();
        this.animationResult3.g(new AnonymousClass13(i4, endGameAllowBean));
    }

    public void showTimer() {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            this.ll_play_time.setVisibility(0);
            this.timerContainer.setVisibility(8);
            return;
        }
        View view = this.timerContainer;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void startTimer(long j4) {
        MenuViewListener menuViewListener = this.menuViewListener;
        if (menuViewListener != null && menuViewListener.isRankGame()) {
            if (this.scheduledExecutorService == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                this.scheduledExecutorService = newScheduledThreadPool;
                newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.papa91.arc.view.MenuView.10
                    @Override // java.lang.Runnable
                    public void run() {
                        MenuView menuView = MenuView.this;
                        if (!menuView.isRankTimeStop) {
                            menuView.rankTime++;
                        }
                        menuView.updateTime(menuView.rankTime);
                    }
                }, 1L, 1L, TimeUnit.SECONDS);
            }
        } else if (this.countDownTimer == null) {
            this.millisUntilFinish = j4;
            CountDownTimer countDownTimer = new CountDownTimer(j4, 1000L) { // from class: com.papa91.arc.view.MenuView.11
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    MenuView menuView = MenuView.this;
                    menuView.millisUntilFinish = 0L;
                    menuView.alertRing();
                    MenuView.this.hideTimer();
                    MenuViewListener menuViewListener2 = MenuView.this.menuViewListener;
                    if (menuViewListener2 != null) {
                        menuViewListener2.showTimeLimitedDialog2();
                    }
                    EmuActivity_psp.sendLimitStat("PSPLimitPopup");
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j5) {
                    MenuView.this.millisUntilFinish = j5;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ((j5 / 1000) + " "));
                    SpannableString spannableString = new SpannableString("进入广告");
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#9C7140")), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    MenuView.this.timer.setText(spannableStringBuilder);
                    MenuView.this.alertRing();
                    MenuViewListener menuViewListener2 = MenuView.this.menuViewListener;
                    if (menuViewListener2 != null) {
                        menuViewListener2.onTimerTick(j5);
                    }
                }
            };
            this.countDownTimer = countDownTimer;
            countDownTimer.start();
        }
    }

    public void updateTime(final int i4) {
        final int i5 = i4 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        int i6 = i4 - (i5 * SdkConfigData.DEFAULT_REQUEST_INTERVAL);
        final int i7 = i6 / 60;
        final int i8 = i6 - (i7 * 60);
        post(new Runnable() { // from class: com.papa91.arc.view.a
            @Override // java.lang.Runnable
            public final void run() {
                MenuView.this.lambda$updateTime$0(i4, i5, i7, i8);
            }
        });
    }

    public void hide(int i4) {
        if (i4 == 1) {
            this.menuBarStatue = this.menuBar.getVisibility() != 0 ? 0 : 1;
        }
        setVisibility(4);
    }

    public MenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = getClass().getSimpleName();
        this.isSound = true;
        this.isVibrate = false;
        this.hiding = false;
        this.showAdImage = false;
        this.showChangeDisk = false;
        this.isRankTimeStop = false;
        this.rankTime = 0;
        this.menuBarStatue = 0;
        initView();
    }

    public MenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.TAG = getClass().getSimpleName();
        this.isSound = true;
        this.isVibrate = false;
        this.hiding = false;
        this.showAdImage = false;
        this.showChangeDisk = false;
        this.isRankTimeStop = false;
        this.rankTime = 0;
        this.menuBarStatue = 0;
        initView();
    }
}
