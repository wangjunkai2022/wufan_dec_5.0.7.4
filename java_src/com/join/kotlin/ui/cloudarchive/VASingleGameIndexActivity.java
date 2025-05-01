package com.join.kotlin.ui.cloudarchive;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityVasingleGameIndexBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.cloudarchive.VASingleGameViewModle;
import com.join.mgps.Util.UtilsMy;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VASingleGameIndexActivity.kt */
/* loaded from: classes3.dex */
public final class VASingleGameIndexActivity extends BaseAppCompatActivity implements LoadBindClickProxy {
    @NotNull
    private final Lazy dataBinding$delegate;
    @NotNull
    private final Lazy viewModle$delegate;

    public VASingleGameIndexActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ActivityVasingleGameIndexBinding>() { // from class: com.join.kotlin.ui.cloudarchive.VASingleGameIndexActivity$dataBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityVasingleGameIndexBinding invoke() {
                return (ActivityVasingleGameIndexBinding) DataBindingUtil.setContentView(VASingleGameIndexActivity.this, R.layout.activity_vasingle_game_index);
            }
        });
        this.dataBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<VASingleGameViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.VASingleGameIndexActivity$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final VASingleGameViewModle invoke() {
                return (VASingleGameViewModle) new ViewModelProvider(VASingleGameIndexActivity.this, new ViewModelProvider.NewInstanceFactory()).get(VASingleGameViewModle.class);
            }
        });
        this.viewModle$delegate = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Integer num) {
        if (num != null && num.intValue() == 1) {
            return;
        }
        if ((num != null && num.intValue() == 2) || num == null) {
            return;
        }
        num.intValue();
    }

    @NotNull
    public final ActivityVasingleGameIndexBinding getDataBinding() {
        Object value = this.dataBinding$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dataBinding>(...)");
        return (ActivityVasingleGameIndexBinding) value;
    }

    @NotNull
    public final VASingleGameViewModle getViewModle() {
        return (VASingleGameViewModle) this.viewModle$delegate.getValue();
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        getViewModle().loadDatas(this);
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getViewModle().setListener(new VASingleGameViewModle.Listener() { // from class: com.join.kotlin.ui.cloudarchive.VASingleGameIndexActivity$onCreate$1
            @Override // com.join.kotlin.ui.cloudarchive.VASingleGameViewModle.Listener
            public void onCLickBack() {
                VASingleGameIndexActivity.this.finish();
            }
        });
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(21, this);
        String stringExtra = getIntent().getStringExtra("gameId");
        if (stringExtra != null) {
            getViewModle().initDatas(stringExtra);
        }
        getViewModle().loadDatas(this);
        getViewModle().getShowStatus().observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VASingleGameIndexActivity.onCreate$lambda$1((Integer) obj);
            }
        });
    }
}
