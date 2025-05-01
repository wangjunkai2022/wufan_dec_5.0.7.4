package com.join.mgps.activity.gamedetail;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.BaseAppCompatActivity;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.GameDetailCommentListFragment;
import com.join.kotlin.discount.GameDetailFragment;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.request.GameDetailRequest;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.q1;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.GamedetialModleBtFragemnt;
import com.join.mgps.activity.GamedetialModleFiveFragemnt;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TipBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.rpc.impl.i;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.psk.eventmodule.StatFactory;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import java.util.Iterator;
import me.relex.photodraweeview.d;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import p1.f;
@EActivity(R.layout.gamedetail_video_main_activity)
/* loaded from: classes4.dex */
public class GamedetailVideoMainActivity extends BaseAppCompatActivity {
    private static final String BUNDLE_FRAGMENTS_KEY = "android:support:fragments";
    private static final String OPTION_VIEW = "view";
    public static boolean hasInAnim;
    @Extra
    boolean autodown;
    @ViewById
    ImageView backImg;
    private Context context;
    @Extra
    ExtBean extBean;
    @ViewById
    FrameLayout fragment;
    @Extra
    int from;
    @Extra
    String gameId;
    @Extra
    boolean isShowComment;
    @ViewById
    View iv_back;
    @ViewById
    ConstraintLayout layout_new;
    @ViewById
    RelativeLayout layout_old;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_layout;
    @ViewById
    View mainCover;
    @ViewById
    View main_content;
    private GamedetialModleFourBean modleFourBeanShow;
    @Pref
    PrefDef_ prefDef;
    @ViewById
    View setNetwork;
    @ViewById
    View statuHVIew;
    private int statubarH;
    @ViewById
    TabLayout tablayout;
    private com.join.android.app.common.manager.b tintManager;
    @ViewById
    ViewPager viewPager;
    @ViewById
    ViewPager2 viewpager;
    private ArrayList<String> tabTitles = new ArrayList<>();
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private boolean detailTabDarkColor = false;
    GameDetailVideoFragment fragmentVideo = null;
    BaseGameDetailFragment fragmentDetial = null;
    boolean showCover = false;
    int xoffW = 200;
    boolean isFromVideo = false;

    private void backCheck() {
        BaseGameDetailFragment baseGameDetailFragment;
        if (!this.isFromVideo || (baseGameDetailFragment = this.fragmentDetial) == null) {
            return;
        }
        baseGameDetailFragment.backpressedTofinishActivity();
    }

    private int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshTab() {
        int selectedTabPosition = this.tablayout.getSelectedTabPosition();
        if (selectedTabPosition == 0 && !this.detailTabDarkColor) {
            this.backImg.setImageResource(R.drawable.back_icon_discover);
        } else {
            this.backImg.setImageResource(R.drawable.back_icon);
        }
        for (int i4 = 0; i4 < this.tablayout.getTabCount(); i4++) {
            TabLayout.Tab tabAt = this.tablayout.getTabAt(i4);
            if (tabAt != null && tabAt.getCustomView() != null) {
                TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tv_tab);
                TextView textView2 = (TextView) tabAt.getCustomView().findViewById(R.id.tv_num);
                int i5 = -1;
                if (tabAt.isSelected()) {
                    textView.setTypeface(Typeface.create("sans-serif-medium", 0));
                    textView.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? -16777216 : -1);
                    textView2.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? -16777216 : -16777216);
                } else {
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? Color.parseColor("#919191") : -1);
                    if (selectedTabPosition != 0 || this.detailTabDarkColor) {
                        i5 = Color.parseColor("#919191");
                    }
                    textView2.setTextColor(i5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPoint(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ExtBean extBean = this.extBean;
        String str7 = "";
        if (extBean != null) {
            str2 = extBean.getFrom();
            str3 = this.extBean.getLocation();
            try {
                if (!TextUtils.isEmpty(str2)) {
                    this.extBean.set_from_type(Integer.parseInt(str2));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            str4 = this.extBean.getDataFlag();
            str5 = this.extBean.getKeyword();
            str6 = this.extBean.getWhere();
        } else {
            str2 = "";
            str3 = str2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
        }
        ExtBean extBean2 = this.extBean;
        if (extBean2 != null && extBean2.get_from_type() != 0) {
            str2 = this.extBean.get_from_type() + "";
            str3 = this.extBean.getRecPosition();
        }
        String str8 = str2;
        String str9 = str3;
        if ("112".equals(str8) || "147".equals(str8)) {
            str7 = this.extBean.getReMarks();
        }
        p.l(this.context).t2(this.gameId, AccountUtil_.getInstance_(this.context).getUid(), str8, str, str9, str, str7, str4, str5, str6);
    }

    public static void startTActivity(Activity activity, View view, String str, boolean z4, ExtBean extBean) {
        Intent intent = new Intent(activity, GamedetailVideoMainActivity_.class);
        intent.putExtra(EndGameDetailActivity_.R, true);
        intent.putExtra("gameId", str);
        intent.putExtra(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        intent.putExtra("extBean", extBean);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.context = this;
        this.statubarH = getStatusBarHeight(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.statuHVIew.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.height = this.statubarH;
            this.statuHVIew.setLayoutParams(layoutParams);
        } else {
            layoutParams.height = 1;
            this.statuHVIew.setLayoutParams(layoutParams);
        }
        this.xoffW = getResources().getDimensionPixelOffset(R.dimen.wdp250);
        getDetialData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 600)
    public void animFinish() {
        hasInAnim = false;
    }

    public void autoPlayVideo(StandardVideoView standardVideoView) {
        if ((this.viewPager.getCurrentItem() == 1 || this.viewPager.getVisibility() == 8) && Build.VERSION.SDK_INT >= 21 && standardVideoView != null && standardVideoView.d()) {
            standardVideoView.startPlayLogic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void backImg() {
        finish();
    }

    protected boolean clearFragmentsTag() {
        return true;
    }

    public void clickBack() {
        backCheck();
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        GameDetailVideoFragment gameDetailVideoFragment = this.fragmentVideo;
        if (gameDetailVideoFragment != null) {
            gameDetailVideoFragment.clearVideo();
        }
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDetialData() {
        if (j.j(this.context)) {
            try {
                n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
                if (accountData == null) {
                    accountData = n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.context);
                requestModel.setArgs(new GameDetailRequest(this.gameId, String.valueOf(accountData.getUid()), f.K().A()));
                ResponseModel<GameDetailDataBean> body = i.D0().B0().w(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200) {
                    GameDetailDataBean data = body.getData();
                    if (data.getWf_data() != null) {
                        updateUi(data.getWf_data());
                        return;
                    } else if (data.getDiscount_data() != null) {
                        updateNewUi(data.getDiscount_data());
                        return;
                    }
                }
                showLodingFailed();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    public GamedetialModleFourBean getModleFourBeanShow() {
        return this.modleFourBeanShow;
    }

    public BaseGameDetailFragment getModleFourFragment() {
        return this.fragmentDetial;
    }

    public int getTabBottom() {
        return this.tablayout.getBottom();
    }

    public int getViewpagerCurrentPage() {
        return this.viewPager.getCurrentItem();
    }

    public boolean gethideOrshowCover() {
        return this.showCover;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = d.f71604s1)
    public void hideLoadingDelay() {
        this.iv_back.setVisibility(8);
        this.main_content.setVisibility(0);
        this.loding_layout.setVisibility(8);
        this.loding_faile.setVisibility(8);
        this.mainCover.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        backCheck();
        finish();
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GameDetailVideoFragment gameDetailVideoFragment = this.fragmentVideo;
        if (gameDetailVideoFragment != null) {
            gameDetailVideoFragment.clearVideo();
        }
        GameDetailVideoFragment gameDetailVideoFragment2 = this.fragmentVideo;
        if (gameDetailVideoFragment2 != null) {
            gameDetailVideoFragment2.onDestroy();
        }
        backCheck();
        BaseGameDetailFragment baseGameDetailFragment = this.fragmentDetial;
        if (baseGameDetailFragment == null || !baseGameDetailFragment.onBackPressedMy()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        if (bundle != null && clearFragmentsTag()) {
            bundle.remove(BUNDLE_FRAGMENTS_KEY);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null || !clearFragmentsTag()) {
            return;
        }
        bundle.remove(BUNDLE_FRAGMENTS_KEY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        getDetialData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1250)
    public void scroolToposition() {
        this.viewPager.scrollTo(this.xoffW, 0);
    }

    public void selectTab(int i4) {
        this.viewpager.setCurrentItem(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.context);
    }

    public void setTabIsDarkColor(boolean z4) {
        this.detailTabDarkColor = z4;
        refreshTab();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void shakeAnim() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                GamedetailVideoMainActivity.this.viewPager.scrollTo((int) (f5.floatValue() * GamedetailVideoMainActivity.this.xoffW), 0);
                if (f5.floatValue() == 1.0f) {
                    new PrefDef_(GamedetailVideoMainActivity.this.context).firstIntentgamedetialVideo().g(Boolean.FALSE);
                }
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    public void shakeAnimback() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(600L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                GamedetailVideoMainActivity.this.viewPager.scrollTo((int) (f5.floatValue() * GamedetailVideoMainActivity.this.xoffW), 0);
                f5.floatValue();
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
        animFinish();
        this.prefDef.firstIntentgamedetialVideo().g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.loding_layout.setVisibility(0);
            this.loding_faile.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.loding_layout.setVisibility(8);
        try {
            GamedetialModleFourBean gamedetialModleFourBean = this.modleFourBeanShow;
            if (gamedetialModleFourBean == null || g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                this.loding_faile.setVisibility(0);
                if (j.j(this.context)) {
                    this.setNetwork.setVisibility(8);
                } else {
                    this.setNetwork.setVisibility(0);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateNewUi(GameDetailBean gameDetailBean) {
        Fragment gameDetailFragment;
        this.layout_old.setVisibility(8);
        this.layout_new.setVisibility(0);
        hideLoadingDelay();
        this.tabTitles.clear();
        this.tabTitles.add("详情");
        this.tabTitles.add("评价");
        Iterator<String> it2 = this.tabTitles.iterator();
        while (it2.hasNext()) {
            TabLayout.Tab customView = this.tablayout.newTab().setCustomView(R.layout.layout_custom_tab_game_detail);
            TextView textView = (TextView) customView.getCustomView().findViewById(R.id.tv_tab);
            TextView textView2 = (TextView) customView.getCustomView().findViewById(R.id.tv_num);
            textView.setText(it2.next());
            textView2.setTextColor(-1);
            textView2.setVisibility(8);
            this.tablayout.addTab(customView);
        }
        this.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                GamedetailVideoMainActivity.this.refreshTab();
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                GamedetailVideoMainActivity.this.refreshTab();
                GamedetailVideoMainActivity.this.viewpager.setCurrentItem(tab.getPosition());
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }
        });
        this.fragments.clear();
        for (int i4 = 0; i4 < this.tabTitles.size(); i4++) {
            Bundle bundle = new Bundle();
            bundle.putString("type", this.tabTitles.get(i4));
            bundle.putString("gameId", this.gameId);
            if (i4 == 0) {
                gameDetailFragment = new GameDetailFragment();
            } else if (i4 == 1) {
                gameDetailFragment = new GameDetailCommentListFragment();
            } else {
                gameDetailFragment = new GameDetailFragment();
            }
            gameDetailFragment.setArguments(bundle);
            this.fragments.add(gameDetailFragment);
        }
        this.viewpager.setAdapter(new FragmentStateAdapter(this) { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.3
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NonNull
            public Fragment createFragment(int i5) {
                return (Fragment) GamedetailVideoMainActivity.this.fragments.get(i5);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return GamedetailVideoMainActivity.this.fragments.size();
            }
        });
        this.viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.4
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i5, float f5, int i6) {
                super.onPageScrolled(i5, f5, i6);
                GamedetailVideoMainActivity.this.tablayout.setScrollPosition(i5, f5, true, false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i5) {
                super.onPageSelected(i5);
                if (GamedetailVideoMainActivity.this.tablayout.getTabAt(i5) != null) {
                    GamedetailVideoMainActivity.this.tablayout.getTabAt(i5).select();
                }
            }
        });
        this.viewpager.setCurrentItem(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(GamedetialModleFourBean gamedetialModleFourBean) {
        this.modleFourBeanShow = gamedetialModleFourBean;
        this.layout_old.setVisibility(0);
        this.layout_new.setVisibility(8);
        final boolean e5 = q1.e(gamedetialModleFourBean.getTag_info());
        ExtBean extBean = this.extBean;
        if (extBean != null) {
            this.modleFourBeanShow.set_from_type(extBean.get_from_type());
            this.modleFourBeanShow.setRecPosition(this.extBean.getRecPosition());
            if (g2.i(this.extBean.getVolcanoOther())) {
                this.modleFourBeanShow.setPosition_path((StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(this.extBean.getVolcanoOther(), StatFactory.VolcanoOther.class));
            }
        }
        this.modleFourBeanShow.set_from(101);
        GamedetailViewbean video_and_cover = gamedetialModleFourBean.getVideo_and_cover();
        if (video_and_cover != null && g2.i(video_and_cover.getVideo_url()) && this.from == 2) {
            this.iv_back.setVisibility(8);
            this.main_content.setVisibility(0);
            this.loding_layout.setVisibility(8);
            this.loding_faile.setVisibility(8);
            this.viewPager.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            boolean booleanValue = this.prefDef.firstIntentgamedetialVideo().d().booleanValue();
            if (booleanValue) {
                this.showCover = true;
                hasInAnim = true;
            }
            this.fragmentVideo = new GameDetailVideoFragment_();
            boolean booleanExtra = getIntent().getBooleanExtra(EndGameDetailActivity_.R, false);
            if (booleanExtra) {
                this.gameId = getIntent().getStringExtra("gameId");
                this.autodown = getIntent().getBooleanExtra(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, false);
                this.extBean = (ExtBean) getIntent().getSerializableExtra("extBean");
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("videoDatas", video_and_cover);
            bundle.putSerializable("extBean", this.extBean);
            bundle.putString("gameId", this.gameId);
            this.fragmentVideo.setArguments(bundle);
            arrayList.add(new FragmentPagerAdapter.a("视频", this.fragmentVideo));
            if (gamedetialModleFourBean.getBt_game_switch() == 1) {
                GamedetialModleBtFragemnt w02 = GamedetialModleBtFragemnt.w0(this.gameId, this.extBean, this.autodown, booleanExtra, this.isShowComment);
                this.fragmentDetial = w02;
                arrayList.add(new FragmentPagerAdapter.a("详情", w02));
            } else {
                GamedetialModleFiveFragemnt A0 = GamedetialModleFiveFragemnt.A0(this.gameId, this.extBean, this.autodown, booleanExtra, this.isShowComment);
                this.fragmentDetial = A0;
                arrayList.add(new FragmentPagerAdapter.a("详情", A0));
            }
            this.viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), arrayList));
            this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity.1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i4) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i4, float f5, int i5) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i4) {
                    if (i4 == 0) {
                        BaseGameDetailFragment baseGameDetailFragment = GamedetailVideoMainActivity.this.fragmentDetial;
                        if (baseGameDetailFragment != null) {
                            baseGameDetailFragment.pauseVideo();
                        }
                        GamedetailVideoMainActivity.this.fragmentVideo.resumVideo();
                        GamedetailVideoMainActivity.this.sendPoint("1");
                    } else if (i4 == 1) {
                        GamedetailVideoMainActivity.this.fragmentVideo.pauseVideo();
                        BaseGameDetailFragment baseGameDetailFragment2 = GamedetailVideoMainActivity.this.fragmentDetial;
                        if (baseGameDetailFragment2 != null) {
                            baseGameDetailFragment2.resumVideo();
                            GamedetailVideoMainActivity.this.fragmentDetial.hideCover();
                        }
                        p.l(GamedetailVideoMainActivity.this.context).O1(Event.video_visitGamePage, new Ext().setGameId(GamedetailVideoMainActivity.this.gameId));
                        GamedetailVideoMainActivity.hasInAnim = false;
                        GamedetailVideoMainActivity.this.sendPoint(e5 ? "3" : "0");
                    }
                }
            });
            if (booleanValue) {
                this.showCover = true;
                hasInAnim = true;
                shakeAnim();
            }
            sendPoint("1");
        } else {
            this.main_content.setVisibility(0);
            this.mainCover.setVisibility(0);
            this.iv_back.setVisibility(0);
            hideLoadingDelay();
            this.fragment.setVisibility(0);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            boolean booleanExtra2 = getIntent().getBooleanExtra(EndGameDetailActivity_.R, false);
            this.isFromVideo = booleanExtra2;
            if (booleanExtra2) {
                this.gameId = getIntent().getStringExtra("gameId");
                this.autodown = getIntent().getBooleanExtra(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, false);
                this.extBean = (ExtBean) getIntent().getSerializableExtra("extBean");
            }
            if (gamedetialModleFourBean.getBt_game_switch() == 1) {
                GamedetialModleBtFragemnt w03 = GamedetialModleBtFragemnt.w0(this.gameId, this.extBean, this.autodown, this.isFromVideo, this.isShowComment);
                this.fragmentDetial = w03;
                beginTransaction.add((int) R.id.fragment, w03);
                sendPoint("2");
            } else {
                GamedetialModleFiveFragemnt A02 = GamedetialModleFiveFragemnt.A0(this.gameId, this.extBean, this.autodown, this.isFromVideo, this.isShowComment);
                this.fragmentDetial = A02;
                beginTransaction.add(R.id.fragment, A02);
                sendPoint(e5 ? "3" : "0");
            }
            beginTransaction.commitAllowingStateLoss();
        }
        if (this.modleFourBeanShow.getTag_info() != null) {
            Iterator<TipBean> it2 = this.modleFourBeanShow.getTag_info().iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().getId(), "242")) {
                    try {
                        Ext ext = new Ext();
                        ext.setResultCode("discount_game");
                        ext.setScenesCode(getClass().getSimpleName());
                        Data data = new Data();
                        data.setGameId(Long.parseLong(this.modleFourBeanShow.getGame_id()));
                        p.l(this.context).Y(Event.expGameAdPage, ext, data);
                        return;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
            }
        }
    }
}
