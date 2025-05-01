package com.join.mgps.activity;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.UpdateFeatureDialog;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.uc.crashsdk.export.LogType;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.update_feature_dialog)
/* loaded from: classes4.dex */
public class UpdateFeatureDialog extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f38244b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f38245c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    CommonAdBean f38246d;

    /* renamed from: e  reason: collision with root package name */
    private Context f38247e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {
        public a() {
            super(R.layout.item_update_feature_dialog, UpdateFeatureDialog.this.f38246d.getAd_info_list());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(CommonGameInfoBean commonGameInfoBean, View view) {
            IntentUtil.getInstance().intentActivity(UpdateFeatureDialog.this.f38247e, commonGameInfoBean.getIntentDataBean());
            UpdateFeatureDialog.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final CommonGameInfoBean commonGameInfoBean) {
            baseViewHolder.setText(R.id.tvTitle, commonGameInfoBean.getTitle()).setText(R.id.tvSubTitle, commonGameInfoBean.getSub_title()).setText(R.id.tvBtn, commonGameInfoBean.getDescription()).setVisible(R.id.divider, baseViewHolder.getLayoutPosition() < getItemCount() - 1);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.i3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpdateFeatureDialog.a.this.c(commonGameInfoBean, view);
                }
            });
        }
    }

    private void h0() {
        this.f38244b.setAdapter(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f38247e = this;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        CommonAdBean commonAdBean = this.f38246d;
        if (commonAdBean == null || commonAdBean.getAd_info_list() == null || this.f38246d.getAd_info_list().size() <= 0) {
            finish();
        }
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
