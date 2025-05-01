package com.join.kotlin.discount;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.databinding.ActivityGameDetailCommentDataBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.discount.adapter.CommentDataViewpagerAdapter;
import com.join.kotlin.discount.model.bean.CommentStatisticDataBean;
import com.join.kotlin.discount.proxy.GameDetailCommentDataClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentDataViewModel;
import com.join.mgps.Util.c2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCommentDataActivity.kt */
/* loaded from: classes3.dex */
public final class GameDetailCommentDataActivity extends BaseVmDbActivity<GameDetailCommentDataViewModel, ActivityGameDetailCommentDataBinding> implements GameDetailCommentDataClickProxy {
    @Nullable
    private CommentStatisticDataBean dataBean;
    private int defaultIndex;
    @NotNull
    private ArrayList<String> tabTitles = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTabAndViewpager$lambda$0(GameDetailCommentDataActivity this$0, TabLayout.Tab tab, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.setText(this$0.tabTitles.get(i4));
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
    }

    @Nullable
    public final CommentStatisticDataBean getDataBean() {
        return this.dataBean;
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final void initTabAndViewpager(@Nullable String str) {
        CommentStatisticDataBean commentStatisticDataBean = this.dataBean;
        String avg_duration = commentStatisticDataBean != null ? commentStatisticDataBean.getAvg_duration() : null;
        if (!(avg_duration == null || avg_duration.length() == 0)) {
            this.tabTitles.add("时长数据");
        } else if (this.defaultIndex == 1) {
            this.defaultIndex = 0;
        }
        if (this.tabTitles.isEmpty()) {
            finish();
            return;
        }
        getMDatabind().f16231f.setAdapter(new CommentDataViewpagerAdapter(this.tabTitles, str, this));
        new TabLayoutMediator(getMDatabind().f16230e, getMDatabind().f16231f, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.join.kotlin.discount.a
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i4) {
                GameDetailCommentDataActivity.initTabAndViewpager$lambda$0(GameDetailCommentDataActivity.this, tab, i4);
            }
        }).attach();
        getMDatabind().f16231f.setCurrentItem(this.defaultIndex);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        c2.s(this);
        getMDatabind().h((GameDetailCommentDataViewModel) getMViewModel());
        getMDatabind().g(this);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("commentData") : null;
        Intent intent2 = getIntent();
        this.defaultIndex = intent2 != null ? intent2.getIntExtra("defaultIndex", 0) : 0;
        this.dataBean = (CommentStatisticDataBean) JsonMapper.getInstance().fromJson(stringExtra, CommentStatisticDataBean.class);
        initTabAndViewpager(stringExtra);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailCommentDataClickProxy
    public void onBackClick() {
        finish();
    }

    public final void setDataBean(@Nullable CommentStatisticDataBean commentStatisticDataBean) {
        this.dataBean = commentStatisticDataBean;
    }

    public final void setDefaultIndex(int i4) {
        this.defaultIndex = i4;
    }
}
