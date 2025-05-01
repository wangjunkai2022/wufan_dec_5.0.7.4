package com.join.kotlin.discount;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.discount.proxy.GameDetailClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailViewModel;
import com.join.mgps.dto.ExtBean;
import com.uc.crashsdk.export.LogType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailActivity.kt */
@SourceDebugExtension({"SMAP\nGameDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,276:1\n13579#2,2:277\n13644#2,3:279\n*S KotlinDebug\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n*L\n101#1:277,2\n128#1:279,3\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailActivity extends BaseVmDbActivity<GameDetailViewModel, ActivityDiscountGameDetailBinding> implements GameDetailClickProxy {
    @Nullable
    private String defaultBtnImage;
    private boolean detailTabDarkColor;
    @Nullable
    private ExtBean ext;
    @Nullable
    private String gameId;
    @NotNull
    private String[] tabTitles = {"详情", "评价"};
    @NotNull
    private ArrayList<Fragment> fragments = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTab() {
        int selectedTabPosition = getMDatabind().f15928d.getSelectedTabPosition();
        if (selectedTabPosition == 0 && !this.detailTabDarkColor) {
            getMDatabind().f15926b.setImageResource(R.drawable.back_icon_discover);
        } else {
            getMDatabind().f15926b.setImageResource(R.drawable.back_icon);
        }
        int tabCount = getMDatabind().f15928d.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout.Tab tabAt = getMDatabind().f15928d.getTabAt(i4);
            if (tabAt != null) {
                if (tabAt.getCustomView() == null) {
                    return;
                }
                View customView = tabAt.getCustomView();
                TextView textView = customView != null ? (TextView) customView.findViewById(R.id.tv_tab) : null;
                View customView2 = tabAt.getCustomView();
                TextView textView2 = customView2 != null ? (TextView) customView2.findViewById(R.id.tv_num) : null;
                if (tabAt.isSelected()) {
                    if (textView != null) {
                        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
                    }
                    if (textView != null) {
                        textView.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? Color.parseColor("#000000") : Color.parseColor("#FFFFFF"));
                    }
                    if (textView2 != null) {
                        textView2.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? Color.parseColor("#000000") : Color.parseColor("#FFFFFF"));
                    }
                } else {
                    if (textView != null) {
                        textView.setTypeface(Typeface.DEFAULT);
                    }
                    if (textView != null) {
                        textView.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? Color.parseColor("#919191") : Color.parseColor("#FFFFFF"));
                    }
                    if (textView2 != null) {
                        textView2.setTextColor((selectedTabPosition != 0 || this.detailTabDarkColor) ? Color.parseColor("#919191") : Color.parseColor("#FFFFFF"));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void setTabData$default(GameDetailActivity gameDetailActivity, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            str2 = "";
        }
        gameDetailActivity.setTabData(str, str2);
    }

    private final void transparentStatuBar() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            if (i4 >= 19) {
                getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
                return;
            }
            return;
        }
        Window window = getWindow();
        window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
        window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
    }

    public final int getTabBottom() {
        return getMDatabind().f15928d.getBottom();
    }

    public final void initTabAndViewpager() {
        String[] strArr;
        Fragment gameDetailFragment;
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
            Intrinsics.checkNotNullExpressionValue(declaredField, "ViewPager2::class.java.g…redField(\"mRecyclerView\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(getMDatabind().f15929e);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) obj;
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            Intrinsics.checkNotNullExpressionValue(declaredField2, "RecyclerView::class.java…claredField(\"mTouchSlop\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(recyclerView);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 3));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        for (String str : this.tabTitles) {
            TabLayout.Tab customView = getMDatabind().f15928d.newTab().setCustomView(R.layout.layout_custom_tab_game_detail);
            Intrinsics.checkNotNullExpressionValue(customView, "mDatabind.tablayout.newT…t_custom_tab_game_detail)");
            View customView2 = customView.getCustomView();
            TextView textView = customView2 != null ? (TextView) customView2.findViewById(R.id.tv_tab) : null;
            if (textView != null) {
                textView.setText(str);
            }
            View customView3 = customView.getCustomView();
            TextView textView2 = customView3 != null ? (TextView) customView3.findViewById(R.id.tv_num) : null;
            if (textView2 != null) {
                textView2.setTextColor(-1);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            getMDatabind().f15928d.addTab(customView);
        }
        getMDatabind().f15928d.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.join.kotlin.discount.GameDetailActivity$initTabAndViewpager$2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@Nullable TabLayout.Tab tab) {
                GameDetailActivity.this.refreshTab();
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@Nullable TabLayout.Tab tab) {
                GameDetailActivity.this.refreshTab();
                GameDetailActivity.this.getMDatabind().f15929e.setCurrentItem(tab != null ? tab.getPosition() : 0);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@Nullable TabLayout.Tab tab) {
            }
        });
        this.fragments.clear();
        String[] strArr2 = this.tabTitles;
        int length = strArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str2 = strArr2[i4];
            int i6 = i5 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("type", str2);
            bundle.putString("gameId", this.gameId);
            bundle.putString("defaultBtnImage", this.defaultBtnImage);
            bundle.putString("ext", JsonMapper.getInstance().toJson(this.ext));
            bundle.putBoolean("autoDownload", getIntent().getBooleanExtra("autoDownload", false));
            bundle.putBoolean("showNewServer", getIntent().getBooleanExtra("showNewServer", false));
            if (i5 == 0) {
                gameDetailFragment = new GameDetailFragment();
            } else if (i5 != 1) {
                gameDetailFragment = new GameDetailFragment();
            } else {
                gameDetailFragment = new GameDetailCommentListFragment();
            }
            gameDetailFragment.setArguments(bundle);
            this.fragments.add(gameDetailFragment);
            i4++;
            i5 = i6;
        }
        getMDatabind().f15929e.setAdapter(new FragmentStateAdapter() { // from class: com.join.kotlin.discount.GameDetailActivity$initTabAndViewpager$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(GameDetailActivity.this);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NotNull
            public Fragment createFragment(int i7) {
                ArrayList arrayList;
                arrayList = GameDetailActivity.this.fragments;
                Object obj3 = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj3, "fragments[position]");
                return (Fragment) obj3;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                ArrayList arrayList;
                arrayList = GameDetailActivity.this.fragments;
                return arrayList.size();
            }
        });
        getMDatabind().f15929e.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.join.kotlin.discount.GameDetailActivity$initTabAndViewpager$5
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i7, float f5, int i8) {
                GameDetailActivity.this.getMDatabind().f15928d.setScrollPosition(i7, f5, true, false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i7) {
                TabLayout.Tab tabAt = GameDetailActivity.this.getMDatabind().f15928d.getTabAt(i7);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        });
        getMDatabind().f15929e.setCurrentItem(0);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailViewModel) getMViewModel());
        getMDatabind().g(this);
        transparentStatuBar();
        this.gameId = getIntent().getStringExtra("gameId");
        this.defaultBtnImage = getIntent().getStringExtra("defaultBtnImage");
        this.ext = (ExtBean) JsonMapper.getInstance().fromJson(getIntent().getStringExtra("ext"), ExtBean.class);
        if (this.gameId == null) {
            finish();
        } else {
            initTabAndViewpager();
        }
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailClickProxy
    public void onBackClick() {
        finish();
    }

    public final void selectTab(int i4) {
        getMDatabind().f15929e.setCurrentItem(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9, "0") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, "0") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTabData(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding r0 = r8.getMDatabind()
            com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding r0 = (com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.f15928d
            r1 = 0
            r0.setVisibility(r1)
            androidx.databinding.ViewDataBinding r0 = r8.getMDatabind()
            com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding r0 = (com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.f15928d
            int r0 = r0.getTabCount()
            r2 = 1
            r3 = 1
        L1a:
            if (r3 >= r0) goto L96
            androidx.databinding.ViewDataBinding r4 = r8.getMDatabind()
            com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding r4 = (com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.f15928d
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.getTabAt(r3)
            if (r4 == 0) goto L93
            boolean r5 = r4.isSelected()
            if (r5 != 0) goto L92
            android.view.View r5 = r4.getCustomView()
            if (r5 != 0) goto L38
            goto L92
        L38:
            android.view.View r4 = r4.getCustomView()
            if (r4 == 0) goto L48
            r5 = 2131301957(0x7f091645, float:1.8221987E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 != 0) goto L4c
            goto L5a
        L4c:
            if (r3 != r2) goto L53
            java.lang.String r5 = java.lang.String.valueOf(r9)
            goto L57
        L53:
            java.lang.String r5 = java.lang.String.valueOf(r10)
        L57:
            r4.setText(r5)
        L5a:
            if (r4 != 0) goto L5d
            goto L93
        L5d:
            java.lang.String r5 = "0"
            r6 = 8
            if (r3 != r2) goto L78
            if (r9 == 0) goto L6e
            int r7 = r9.length()
            if (r7 != 0) goto L6c
            goto L6e
        L6c:
            r7 = 0
            goto L6f
        L6e:
            r7 = 1
        L6f:
            if (r7 != 0) goto L8e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r5)
            if (r5 == 0) goto L8d
            goto L8e
        L78:
            if (r10 == 0) goto L83
            int r7 = r10.length()
            if (r7 != 0) goto L81
            goto L83
        L81:
            r7 = 0
            goto L84
        L83:
            r7 = 1
        L84:
            if (r7 != 0) goto L8e
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r5)
            if (r5 == 0) goto L8d
            goto L8e
        L8d:
            r6 = 0
        L8e:
            r4.setVisibility(r6)
            goto L93
        L92:
            return
        L93:
            int r3 = r3 + 1
            goto L1a
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.GameDetailActivity.setTabData(java.lang.String, java.lang.String):void");
    }

    public final void setTabIsDarkColor(boolean z4) {
        this.detailTabDarkColor = z4;
        refreshTab();
    }
}
