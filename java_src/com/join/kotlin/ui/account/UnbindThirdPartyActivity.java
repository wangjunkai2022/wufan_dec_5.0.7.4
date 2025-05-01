package com.join.kotlin.ui.account;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.account.viewmodle.UnbindViewModle;
import com.join.kotlin.ui.base.BasViewModleActivity;
import com.join.kotlin.ui.base.DataBindingConfig;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.BTActivityBean;
import com.wufan.user.service.protobuf.n0;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UnbindThirdPartyActivity.kt */
/* loaded from: classes3.dex */
public final class UnbindThirdPartyActivity extends BasViewModleActivity implements ClickProxy {
    public UnbindViewModle viewModle;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.join.kotlin.ui.base.BasViewModleActivity
    @NotNull
    public DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.unbind_thridpart_activity, 34, getViewModle()).addBindingParam(7, this);
    }

    @NotNull
    public final UnbindViewModle getViewModle() {
        UnbindViewModle unbindViewModle = this.viewModle;
        if (unbindViewModle != null) {
            return unbindViewModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModle");
        return null;
    }

    @Override // com.join.kotlin.ui.base.BasViewModleActivity
    public void initViewModel() {
        setViewModle((UnbindViewModle) getActivityScopeViewModel(UnbindViewModle.class));
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickBack() {
        getViewModle().setBreakCodeCountDown(true);
        finish();
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickItem(@NotNull BTActivityBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.ui.base.BasViewModleActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("type");
        getViewModle().setPlatform(String.valueOf(stringExtra));
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1429950110) {
                if (hashCode != -189985820) {
                    if (hashCode == 1477838041 && stringExtra.equals("WB_OPENID")) {
                        getViewModle().getTitle().setValue("解绑微博");
                    }
                } else if (stringExtra.equals("QQ_OPENID")) {
                    getViewModle().getTitle().setValue("解绑QQ");
                }
            } else if (stringExtra.equals("WEIXIN_OPENID")) {
                getViewModle().getTitle().setValue("解绑微信");
            }
        }
        n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        MutableLiveData<String> account = getViewModle().getAccount();
        account.setValue("你的帐号为： " + accountData.getAccount());
        getViewModle().getMoble().setValue(accountData.z());
        UnbindViewModle viewModle = getViewModle();
        String z4 = accountData.z();
        Intrinsics.checkNotNullExpressionValue(z4, "accountBean.mobile");
        viewModle.setMobleNumber(z4);
        getViewModle().sendsmsCode(this);
        MutableLiveData<Integer> callStatus = getViewModle().getCallStatus();
        final Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.join.kotlin.ui.account.UnbindThirdPartyActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                if (num != null && num.intValue() == 1) {
                    UnbindThirdPartyActivity.this.finish();
                }
            }
        };
        callStatus.observe(this, new Observer() { // from class: com.join.kotlin.ui.account.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UnbindThirdPartyActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        MutableLiveData<Boolean> hidesoftWard = getViewModle().getHidesoftWard();
        final Function1<Boolean, Unit> function12 = new Function1<Boolean, Unit>() { // from class: com.join.kotlin.ui.account.UnbindThirdPartyActivity$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
                r2 = r1.this$0.getViewBinding();
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(java.lang.Boolean r2) {
                /*
                    r1 = this;
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                    if (r2 == 0) goto L17
                    com.join.kotlin.ui.account.UnbindThirdPartyActivity r2 = com.join.kotlin.ui.account.UnbindThirdPartyActivity.this
                    androidx.databinding.ViewDataBinding r2 = com.join.kotlin.ui.account.UnbindThirdPartyActivity.access$getViewBinding(r2)
                    if (r2 == 0) goto L17
                    com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBinding r2 = (com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBinding) r2
                    android.widget.TextView r2 = r2.f26798c
                    o2.a.b(r2)
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.account.UnbindThirdPartyActivity$onCreate$2.invoke2(java.lang.Boolean):void");
            }
        };
        hidesoftWard.observe(this, new Observer() { // from class: com.join.kotlin.ui.account.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UnbindThirdPartyActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModle().setBreakCodeCountDown(true);
    }

    public final void setViewModle(@NotNull UnbindViewModle unbindViewModle) {
        Intrinsics.checkNotNullParameter(unbindViewModle, "<set-?>");
        this.viewModle = unbindViewModle;
    }
}
