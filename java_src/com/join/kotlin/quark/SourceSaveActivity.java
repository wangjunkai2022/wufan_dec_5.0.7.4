package com.join.kotlin.quark;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceSaveBinding;
import com.join.kotlin.base.activity.BaseVmDbDialogActivity;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceSaveClickProxy;
import com.join.kotlin.quark.viewmodel.SourceSaveViewModel;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.c2;
import com.join.mgps.Util.q1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceSaveActivity.kt */
/* loaded from: classes3.dex */
public final class SourceSaveActivity extends BaseVmDbDialogActivity<SourceSaveViewModel, ActivitySourceSaveBinding> implements SourceSaveClickProxy {
    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void createObserver() {
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    @Nullable
    public View getContentView() {
        return getMDatabind().f17020b;
    }

    @Override // com.join.kotlin.base.activity.BaseVmDialogActivity
    public void initView(@Nullable Bundle bundle) {
        c2.s(this);
        Intent intent = getIntent();
        if (intent != null) {
            MutableLiveData<SourceListItemBean> itemBean = ((SourceSaveViewModel) getMViewModel()).getItemBean();
            Serializable serializableExtra = intent.getSerializableExtra("itemBean");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.join.kotlin.quark.model.bean.SourceListItemBean");
            itemBean.setValue((SourceListItemBean) serializableExtra);
        }
        getMDatabind().h((SourceSaveViewModel) getMViewModel());
        getMDatabind().g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.SourceSaveClickProxy
    public void onSaveClick() {
        SourceListItemBean value = ((SourceSaveViewModel) getMViewModel()).getItemBean().getValue();
        if (value != null) {
            IntentUtil.getInstance().startQuarkBrowser(this, q1.p(), value.getDisk_url(), value.getTitle(), value.getIcon());
        }
    }
}
