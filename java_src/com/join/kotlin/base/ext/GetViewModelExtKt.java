package com.join.kotlin.base.ext;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.join.kotlin.base.BaseApp;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: GetViewModelExt.kt */
/* loaded from: classes3.dex */
public final class GetViewModelExtKt {
    public static final /* synthetic */ <VM extends BaseViewModel> VM getAppViewModel(AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Application application = appCompatActivity.getApplication();
        BaseApp baseApp = application instanceof BaseApp ? (BaseApp) application : null;
        Objects.requireNonNull(baseApp, "你的Application没有继承框架自带的BaseApp类，暂时无法使用getAppViewModel该方法");
        ViewModelProvider appViewModelProvider = baseApp.getAppViewModelProvider();
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) appViewModelProvider.get(BaseViewModel.class);
    }

    public static final <VM> VM getVmClazz(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        return (VM) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public static final /* synthetic */ <VM extends BaseViewModel> VM getAppViewModel(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Application application = fragment.requireActivity().getApplication();
        BaseApp baseApp = application instanceof BaseApp ? (BaseApp) application : null;
        Objects.requireNonNull(baseApp, "你的Application没有继承框架自带的BaseApp类，暂时无法使用getAppViewModel该方法");
        ViewModelProvider appViewModelProvider = baseApp.getAppViewModelProvider();
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) appViewModelProvider.get(BaseViewModel.class);
    }
}
