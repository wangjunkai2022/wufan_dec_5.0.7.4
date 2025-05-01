package com.join.kotlin.base;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.join.kotlin.base.widget.loadCallBack.EmptyCallback;
import com.join.kotlin.base.widget.loadCallBack.ErrorCallback;
import com.join.kotlin.base.widget.loadCallBack.LoadingCallback;
import com.join.kotlin.quark.loadCallBack.EmptyQuarkSourceCallback;
import com.join.mgps.va.overmind.VApp;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseApp.kt */
/* loaded from: classes.dex */
public class BaseApp extends VApp implements ViewModelStoreOwner {
    private ViewModelStore mAppViewModelStore;
    @Nullable
    private ViewModelProvider.Factory mFactory;

    private final ViewModelProvider.Factory getAppFactory() {
        if (this.mFactory == null) {
            this.mFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(this);
        }
        ViewModelProvider.Factory factory = this.mFactory;
        Intrinsics.checkNotNull(factory, "null cannot be cast to non-null type androidx.lifecycle.ViewModelProvider.Factory");
        return factory;
    }

    @NotNull
    public final ViewModelProvider getAppViewModelProvider() {
        return new ViewModelProvider(this, getAppFactory());
    }

    @NotNull
    public ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.mAppViewModelStore;
        if (viewModelStore == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAppViewModelStore");
            return null;
        }
        return viewModelStore;
    }

    @Override // com.join.mgps.va.overmind.VApp, com.papa91.arc.MApplication, com.papa91.arc.BuglyApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        this.mAppViewModelStore = new ViewModelStore();
        c.b().a(new LoadingCallback()).a(new ErrorCallback()).a(new EmptyCallback()).a(new EmptyQuarkSourceCallback()).h(SuccessCallback.class).d();
    }
}
