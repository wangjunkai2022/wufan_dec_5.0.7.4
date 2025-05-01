package com.join.kotlin.quark;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.join.android.app.mgsim.wufun.databinding.ActivityShareSourceBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.quark.callback.IDialogShareSourceCallback;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.ShareSourceClickProxy;
import com.join.kotlin.quark.viewmodel.ShareSourceViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.c2;
import com.papa91.arc.ext.ToastManager;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ShareSourceActivity.kt */
/* loaded from: classes3.dex */
public final class ShareSourceActivity extends BaseVmDbDialogActivity<ShareSourceViewModel, ActivityShareSourceBinding> implements ShareSourceClickProxy {
    @Nullable
    private IDialogShareSourceCallback sourceCallback;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$5$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$5$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
        ShareSourceViewModel shareSourceViewModel = (ShareSourceViewModel) getMViewModel();
        MutableLiveData<String> diskUrl = shareSourceViewModel.getDiskUrl();
        final Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.join.kotlin.quark.ShareSourceActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                if (str != null) {
                    ((ShareSourceViewModel) ShareSourceActivity.this.getMViewModel()).getSubmitEnable().setValue(Boolean.valueOf(!(str.length() == 0)));
                }
            }
        };
        diskUrl.observe(this, new Observer() { // from class: com.join.kotlin.quark.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ShareSourceActivity.createObserver$lambda$5$lambda$3(Function1.this, obj);
            }
        });
        MutableLiveData<ResultState<Boolean>> resultData = shareSourceViewModel.getResultData();
        final Function1<ResultState<? extends Boolean>, Unit> function12 = new Function1<ResultState<? extends Boolean>, Unit>() { // from class: com.join.kotlin.quark.ShareSourceActivity$createObserver$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends Boolean> resultState) {
                invoke2((ResultState<Boolean>) resultState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResultState<Boolean> resultState) {
                ShareSourceActivity.this.dismissLoading();
                if (resultState == null) {
                    ToastManager.show("共享资源失败");
                    return;
                }
                final ShareSourceActivity shareSourceActivity = ShareSourceActivity.this;
                BaseViewModelExtKt.parseState$default(shareSourceActivity, resultState, new Function1<Boolean, Unit>() { // from class: com.join.kotlin.quark.ShareSourceActivity$createObserver$1$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke2(bool);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool) {
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            ToastManager.show("共享资源成功");
                            IDialogShareSourceCallback sourceCallback = ShareSourceActivity.this.getSourceCallback();
                            if (sourceCallback != null) {
                                sourceCallback.onSuccess();
                            }
                            ShareSourceActivity.this.finish();
                            return;
                        }
                        ToastManager.show("共享资源失败");
                    }
                }, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.ShareSourceActivity$createObserver$1$2.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                        invoke2(appException);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AppException it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ToastManager.show(it2.getErrorMsg());
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        resultData.observe(this, new Observer() { // from class: com.join.kotlin.quark.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ShareSourceActivity.createObserver$lambda$5$lambda$4(Function1.this, obj);
            }
        });
    }

    @Nullable
    public final IDialogShareSourceCallback getSourceCallback() {
        return this.sourceCallback;
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        Serializable serializableExtra;
        c2.s(this);
        IDialogActivityCallback iDialogActivityCallback = this.callback;
        if (iDialogActivityCallback != null && (iDialogActivityCallback instanceof IDialogShareSourceCallback)) {
            Intrinsics.checkNotNull(iDialogActivityCallback, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IDialogShareSourceCallback");
            this.sourceCallback = (IDialogShareSourceCallback) iDialogActivityCallback;
        }
        Intent intent = getIntent();
        if (intent != null && (serializableExtra = intent.getSerializableExtra("_wishPoolItem")) != null && (serializableExtra instanceof SourceListItemBean)) {
            ((ShareSourceViewModel) getMViewModel()).setWishPoolItem((SourceListItemBean) serializableExtra);
        }
        getMDatabind().h((ShareSourceViewModel) getMViewModel());
        getMDatabind().g(this);
    }

    @Override // com.join.kotlin.quark.proxy.ShareSourceClickProxy
    public void onBackClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.ShareSourceClickProxy
    public void onShareClick() {
        showLoading();
        String uid = AccountUtil_.getInstance_(this).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this@ShareSourceActivity).uid");
        ((ShareSourceViewModel) getMViewModel()).sourceAngel(uid);
    }

    public final void setSourceCallback(@Nullable IDialogShareSourceCallback iDialogShareSourceCallback) {
        this.sourceCallback = iDialogShareSourceCallback;
    }
}
