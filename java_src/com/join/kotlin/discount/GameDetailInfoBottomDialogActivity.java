package com.join.kotlin.discount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailInfoBottomDialogBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.discount.adapter.GameDetailInfoBottomDialogAdapter;
import com.join.kotlin.discount.model.bean.GameDetailDialogInfoBean;
import com.join.kotlin.discount.proxy.GameDetailInfoBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailInfoBottomDialogViewModel;
import com.join.mgps.Util.c2;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailInfoBottomDialogActivity.kt */
/* loaded from: classes3.dex */
public final class GameDetailInfoBottomDialogActivity extends BaseVmDbDialogActivity<GameDetailInfoBottomDialogViewModel, ActivityDiscountGameDetailInfoBottomDialogBinding> implements GameDetailInfoBottomDialogClickProxy {
    @NotNull
    private final Lazy mAdapter$delegate;

    public GameDetailInfoBottomDialogActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailInfoBottomDialogAdapter>() { // from class: com.join.kotlin.discount.GameDetailInfoBottomDialogActivity$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailInfoBottomDialogAdapter invoke() {
                return new GameDetailInfoBottomDialogAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
    }

    private final GameDetailInfoBottomDialogAdapter getMAdapter() {
        return (GameDetailInfoBottomDialogAdapter) this.mAdapter$delegate.getValue();
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    @Nullable
    public View getContentView() {
        return getMDatabind().f15958b;
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailInfoBottomDialogViewModel) getMViewModel());
        getMDatabind().g(this);
        c2.s(this);
        Intent intent = getIntent();
        if (intent != null) {
            ((GameDetailInfoBottomDialogViewModel) getMViewModel()).getTitle().setValue(intent.getStringExtra("title"));
            ((GameDetailInfoBottomDialogViewModel) getMViewModel()).getContent().setValue(intent.getStringExtra("content"));
            ((GameDetailInfoBottomDialogViewModel) getMViewModel()).getBtnText().setValue(intent.getStringExtra("btnText"));
        }
        ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(((GameDetailInfoBottomDialogViewModel) getMViewModel()).getContent().getValue(), JsonMapper.getInstance().createCollectionType(ArrayList.class, GameDetailDialogInfoBean.class));
        getMDatabind().f15960d.setLayoutManager(new LinearLayoutManager(this));
        getMDatabind().f15960d.setAdapter(getMAdapter());
        getMAdapter().submitList(arrayList != null ? CollectionsKt___CollectionsKt.filterNotNull(arrayList) : null);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailInfoBottomDialogClickProxy
    public void onBackClick() {
        finish();
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailInfoBottomDialogClickProxy
    public void onConfirmClick() {
        finish();
    }
}
