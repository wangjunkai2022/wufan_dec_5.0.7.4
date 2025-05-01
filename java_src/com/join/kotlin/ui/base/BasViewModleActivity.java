package com.join.kotlin.ui.base;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.BaseAppCompatActivity;
import com.MApplication;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BasViewModleActivity.kt */
/* loaded from: classes3.dex */
public abstract class BasViewModleActivity extends BaseAppCompatActivity {
    @Nullable
    private ViewDataBinding dataBindingx;
    @NotNull
    private final Lazy mActivityProvider$delegate;
    @NotNull
    private final Lazy mApplicationProvider$delegate;

    public BasViewModleActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ViewModelProvider>() { // from class: com.join.kotlin.ui.base.BasViewModleActivity$mActivityProvider$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider invoke() {
                return new ViewModelProvider(BasViewModleActivity.this, new ViewModelProvider.NewInstanceFactory());
            }
        });
        this.mActivityProvider$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<ViewModelProvider>() { // from class: com.join.kotlin.ui.base.BasViewModleActivity$mApplicationProvider$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider invoke() {
                Context applicationContext = BasViewModleActivity.this.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.MApplication");
                ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
                Application application = BasViewModleActivity.this.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "application");
                return new ViewModelProvider((MApplication) applicationContext, companion.getInstance(application));
            }
        });
        this.mApplicationProvider$delegate = lazy2;
    }

    private final ViewModelProvider getMActivityProvider() {
        return (ViewModelProvider) this.mActivityProvider$delegate.getValue();
    }

    private final ViewModelProvider getMApplicationProvider() {
        return (ViewModelProvider) this.mApplicationProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public <T extends ViewModel> T getActivityScopeViewModel(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) getMActivityProvider().get(modelClass);
    }

    @NotNull
    protected <T extends ViewModel> T getApplicationScopeViewModel(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) getMApplicationProvider().get(modelClass);
    }

    @NotNull
    public abstract DataBindingConfig getDataBindingConfig();

    @Nullable
    public final ViewDataBinding getDataBindingx() {
        return this.dataBindingx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final ViewDataBinding getViewBinding() {
        return this.dataBindingx;
    }

    public abstract void initViewModel();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        initViewModel();
        DataBindingConfig dataBindingConfig = getDataBindingConfig();
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, dataBindingConfig.getLayout());
        this.dataBindingx = contentView;
        contentView.setLifecycleOwner(this);
        contentView.setVariable(dataBindingConfig.getVmVariableId(), dataBindingConfig.getStateViewModle());
        SparseArray<Object> bindingParms = dataBindingConfig.getBindingParms();
        if (bindingParms == null || bindingParms.size() <= 0) {
            return;
        }
        int i4 = 0;
        int size = bindingParms.size();
        if (size < 0) {
            return;
        }
        while (true) {
            contentView.setVariable(bindingParms.keyAt(i4), bindingParms.valueAt(i4));
            if (i4 == size) {
                return;
            }
            i4++;
        }
    }

    public final void setDataBindingx(@Nullable ViewDataBinding viewDataBinding) {
        this.dataBindingx = viewDataBinding;
    }
}
