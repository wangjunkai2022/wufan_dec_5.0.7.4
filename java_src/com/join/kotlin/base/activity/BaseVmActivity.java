package com.join.kotlin.base.activity;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.join.kotlin.base.ext.GetViewModelExtKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmActivity.kt */
@SourceDebugExtension({"SMAP\nBaseVmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n*L\n1#1,60:1\n29#2,6:61\n*S KotlinDebug\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n*L\n28#1:61,6\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseVmActivity<VM extends BaseViewModel> extends BaseDownloadActivity {
    public VM mViewModel;

    private final VM createViewModel() {
        return (VM) new ViewModelProvider(this).get((Class) GetViewModelExtKt.getVmClazz(this));
    }

    private final void init(Bundle bundle) {
        setMViewModel(createViewModel());
        initView(bundle);
        createObserver();
    }

    public static /* synthetic */ void showLoading$default(BaseVmActivity baseVmActivity, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i4 & 1) != 0) {
            str = "请求网络中...";
        }
        baseVmActivity.showLoading(str);
    }

    public abstract void createObserver();

    @NotNull
    public final VM getMViewModel() {
        VM vm = this.mViewModel;
        if (vm != null) {
            return vm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        return null;
    }

    @Nullable
    public View initDataBind() {
        return null;
    }

    public abstract void initView(@Nullable Bundle bundle);

    public abstract int layoutId();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.base.activity.BaseDownloadActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        View initDataBind = initDataBind();
        if (initDataBind != null) {
            setContentView(initDataBind);
        } else {
            setContentView(layoutId());
        }
        init(bundle);
    }

    public final void setMViewModel(@NotNull VM vm) {
        Intrinsics.checkNotNullParameter(vm, "<set-?>");
        this.mViewModel = vm;
    }

    public final void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
