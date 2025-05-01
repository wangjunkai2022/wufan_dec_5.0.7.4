package com.join.kotlin.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.join.kotlin.base.ext.GetViewModelExtKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmFragment.kt */
/* loaded from: classes3.dex */
public abstract class BaseVmFragment<VM extends BaseViewModel> extends Fragment {
    @NotNull
    private final Handler handler = new Handler();
    private boolean isFirst = true;
    public AppCompatActivity mActivity;
    public VM mViewModel;

    private final VM createViewModel() {
        return (VM) new ViewModelProvider(this).get((Class) GetViewModelExtKt.getVmClazz(this));
    }

    private final void init(Bundle bundle) {
        setMViewModel(createViewModel());
        initView(bundle);
        createObserver();
    }

    private final void onVisible() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.STARTED && this.isFirst) {
            this.handler.postDelayed(new Runnable() { // from class: com.join.kotlin.base.fragment.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseVmFragment.onVisible$lambda$0(BaseVmFragment.this);
                }
            }, lazyLoadTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisible$lambda$0(BaseVmFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lazyLoadData();
        this$0.isFirst = false;
    }

    private final void registorDefUIChange() {
    }

    public static /* synthetic */ void showLoading$default(BaseVmFragment baseVmFragment, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i4 & 1) != 0) {
            str = "请求网络中...";
        }
        baseVmFragment.showLoading(str);
    }

    protected final void addLoadingObserve(@NotNull BaseViewModel... viewModels) {
        Intrinsics.checkNotNullParameter(viewModels, "viewModels");
    }

    public abstract void createObserver();

    public abstract void dismissLoading();

    @NotNull
    public final AppCompatActivity getMActivity() {
        AppCompatActivity appCompatActivity = this.mActivity;
        if (appCompatActivity != null) {
            return appCompatActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        return null;
    }

    @NotNull
    public final VM getMViewModel() {
        VM vm = this.mViewModel;
        if (vm != null) {
            return vm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        return null;
    }

    public void initData() {
    }

    public abstract void initView(@Nullable Bundle bundle);

    public abstract int layoutId();

    public abstract void lazyLoadData();

    public long lazyLoadTime() {
        return 300L;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setMActivity((AppCompatActivity) context);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(layoutId(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        onVisible();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.isFirst = true;
        setMViewModel(createViewModel());
        initView(bundle);
        createObserver();
        registorDefUIChange();
        initData();
    }

    public final void setMActivity(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<set-?>");
        this.mActivity = appCompatActivity;
    }

    public final void setMViewModel(@NotNull VM vm) {
        Intrinsics.checkNotNullParameter(vm, "<set-?>");
        this.mViewModel = vm;
    }

    public abstract void showLoading(@NotNull String str);
}
