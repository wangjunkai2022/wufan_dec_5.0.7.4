package com.join.kotlin.ui.account.viewmodle;

import android.content.Context;
import android.graphics.Color;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.ui.account.modle.UnThirdPartRequest;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.x1;
import com.join.mgps.dto.MMSRequesBean;
import com.wufan.user.service.protobuf.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UnbindViewModle.kt */
/* loaded from: classes3.dex */
public final class UnbindViewModle extends ViewModel {
    private boolean breakCodeCountDown;
    @Nullable
    private z1 coluting;
    @NotNull
    private MutableLiveData<String> moble = new MutableLiveData<>();
    @NotNull
    private String mobleNumber = "";
    @NotNull
    private MutableLiveData<String> account = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> codeText = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> sendCodeButnText = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> sendCodeButnColor = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>();
    private int colorNormal = Color.parseColor("#3CA4FD");
    private int colorWait = Color.parseColor("#4C4B5F");
    private boolean canSendCode = true;
    @NotNull
    private String platform = "";
    @NotNull
    private MutableLiveData<Boolean> hidesoftWard = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> callStatus = new MutableLiveData<>();

    public UnbindViewModle() {
        this.hidesoftWard.setValue(Boolean.FALSE);
        this.title.setValue("解绑帐号");
        this.moble.setValue("");
        this.account.setValue("");
        this.codeText.setValue("");
        this.sendCodeButnText.setValue("获取验证码");
        this.sendCodeButnColor.setValue(Integer.valueOf(this.colorNormal));
        this.callStatus.setValue(0);
    }

    @NotNull
    public final MutableLiveData<String> getAccount() {
        return this.account;
    }

    public final boolean getBreakCodeCountDown() {
        return this.breakCodeCountDown;
    }

    @NotNull
    public final MutableLiveData<Integer> getCallStatus() {
        return this.callStatus;
    }

    public final boolean getCanSendCode() {
        return this.canSendCode;
    }

    @NotNull
    public final MutableLiveData<String> getCodeText() {
        return this.codeText;
    }

    public final int getColorNormal() {
        return this.colorNormal;
    }

    public final int getColorWait() {
        return this.colorWait;
    }

    @Nullable
    public final z1 getColuting() {
        return this.coluting;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHidesoftWard() {
        return this.hidesoftWard;
    }

    @NotNull
    public final MutableLiveData<String> getMoble() {
        return this.moble;
    }

    @NotNull
    public final String getMobleNumber() {
        return this.mobleNumber;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final MutableLiveData<Integer> getSendCodeButnColor() {
        return this.sendCodeButnColor;
    }

    @NotNull
    public final MutableLiveData<String> getSendCodeButnText() {
        return this.sendCodeButnText;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.join.kotlin.ui.account.modle.UnThirdPartRequest, T] */
    public final void sendUnbindThridPart(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str = this.mobleNumber;
        String valueOf = String.valueOf(this.codeText.getValue());
        int uid = accountData.getUid();
        String token = accountData.getToken();
        Intrinsics.checkNotNullExpressionValue(token, "account.token");
        objectRef.element = new UnThirdPartRequest(str, valueOf, "", uid, token, this.platform);
        this.hidesoftWard.setValue(Boolean.TRUE);
        T t4 = objectRef.element;
        UnThirdPartRequest unThirdPartRequest = (UnThirdPartRequest) t4;
        String g4 = x1.g(t4);
        Intrinsics.checkNotNullExpressionValue(g4, "getSign(request)");
        unThirdPartRequest.setSign(g4);
        k.f(s1.f71252b, d1.c(), null, new UnbindViewModle$sendUnbindThridPart$job$1(objectRef, context, this, null), 2, null);
    }

    public final void sendsmsCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.canSendCode) {
            this.canSendCode = false;
            MMSRequesBean mMSRequesBean = new MMSRequesBean();
            mMSRequesBean.setMobile(this.mobleNumber);
            mMSRequesBean.setType(MMSRequesBean.TYPE_BIND);
            mMSRequesBean.setSign(x1.g(mMSRequesBean));
            k.f(s1.f71252b, d1.c(), null, new UnbindViewModle$sendsmsCode$job$1(mMSRequesBean, this, context, null), 2, null);
        }
    }

    public final void setAccount(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.account = mutableLiveData;
    }

    public final void setBreakCodeCountDown(boolean z4) {
        this.breakCodeCountDown = z4;
    }

    public final void setCallStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.callStatus = mutableLiveData;
    }

    public final void setCanSendCode(boolean z4) {
        this.canSendCode = z4;
    }

    public final void setCodeText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.codeText = mutableLiveData;
    }

    public final void setColorNormal(int i4) {
        this.colorNormal = i4;
    }

    public final void setColorWait(int i4) {
        this.colorWait = i4;
    }

    public final void setColuting(@Nullable z1 z1Var) {
        this.coluting = z1Var;
    }

    public final void setHidesoftWard(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.hidesoftWard = mutableLiveData;
    }

    public final void setMoble(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.moble = mutableLiveData;
    }

    public final void setMobleNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobleNumber = str;
    }

    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setSendCodeButnColor(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sendCodeButnColor = mutableLiveData;
    }

    public final void setSendCodeButnText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sendCodeButnText = mutableLiveData;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }
}
