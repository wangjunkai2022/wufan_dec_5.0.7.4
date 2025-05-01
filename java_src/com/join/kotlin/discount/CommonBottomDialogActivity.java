package com.join.kotlin.discount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.GravityCompat;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountCommonBottomDialogBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.discount.proxy.CommonBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.CommonBottomDialogViewModel;
import com.join.mgps.Util.c2;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonBottomDialogActivity.kt */
/* loaded from: classes3.dex */
public final class CommonBottomDialogActivity extends BaseVmDbDialogActivity<CommonBottomDialogViewModel, ActivityDiscountCommonBottomDialogBinding> implements CommonBottomDialogClickProxy {
    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    @Nullable
    public View getContentView() {
        return getMDatabind().f15914c;
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((CommonBottomDialogViewModel) getMViewModel());
        getMDatabind().g(this);
        c2.s(this);
        Intent intent = getIntent();
        if (intent != null) {
            ((CommonBottomDialogViewModel) getMViewModel()).getTitle().setValue(intent.getStringExtra("title"));
            ((CommonBottomDialogViewModel) getMViewModel()).getContent().setValue(intent.getStringExtra("content"));
            ((CommonBottomDialogViewModel) getMViewModel()).getBtnConfirmText().setValue(intent.getStringExtra("btnText"));
            ((CommonBottomDialogViewModel) getMViewModel()).getBtnCancelText().setValue(intent.getStringExtra("btnCancelText"));
            getMDatabind().f15916e.setGravity(intent.getIntExtra("content_gravity", 0) == 0 ? 17 : GravityCompat.START);
        }
    }

    @Override // com.join.kotlin.discount.proxy.CommonBottomDialogClickProxy
    public void onCancelClick() {
        finish();
    }

    @Override // com.join.kotlin.discount.proxy.CommonBottomDialogClickProxy
    public void onConfirmClick() {
        setResult(-1, getIntent());
        finish();
    }
}
