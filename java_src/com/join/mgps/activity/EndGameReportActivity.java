package com.join.mgps.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.EndGameReportActivity;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.EndGameReportTypeBean;
import com.join.mgps.dto.RequestEndGameReportReasonArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_end_game_report)
/* loaded from: classes4.dex */
public class EndGameReportActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f30220b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    EditText f30221c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ConstraintLayout f30222d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f30223e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.k f30224f;

    /* renamed from: g  reason: collision with root package name */
    EndGameReportTypeBean f30225g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BaseQuickAdapter<EndGameReportTypeBean, BaseViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private List<EndGameReportTypeBean> f30226a;

        public a(@Nullable List<EndGameReportTypeBean> list) {
            super(R.layout.item_end_game_report_list, list);
            this.f30226a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(EndGameReportTypeBean endGameReportTypeBean, View view) {
            EndGameReportActivity.this.f30225g = endGameReportTypeBean;
            for (EndGameReportTypeBean endGameReportTypeBean2 : this.f30226a) {
                endGameReportTypeBean2.setSelected(TextUtils.equals(endGameReportTypeBean2.getCode(), endGameReportTypeBean.getCode()));
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final EndGameReportTypeBean endGameReportTypeBean) {
            ((ImageView) baseViewHolder.getView(R.id.ivCheck)).setSelected(endGameReportTypeBean.isSelected());
            baseViewHolder.setText(R.id.tvReason, endGameReportTypeBean.getName());
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameReportActivity.a.this.c(endGameReportTypeBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f30224f = com.join.mgps.rpc.impl.i.D0();
        h0();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        if (this.f30225g == null) {
            showTost("请选择举报类型");
            return;
        }
        EditText editText = this.f30221c;
        if (editText != null && TextUtils.isEmpty(editText.getText().toString().trim())) {
            showTost("请填写举报描述");
        } else {
            j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestEndGameReportReasonArgs requestEndGameReportReasonArgs = new RequestEndGameReportReasonArgs();
            requestEndGameReportReasonArgs.setType("mg_game_feedback_endgame");
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameReportReasonArgs);
            requestModel.setDefault(this);
            ResponseModel<List<EndGameReportTypeBean>> C = this.f30224f.C(requestModel.makeSign());
            if (C != null && C.getCode() == 200) {
                updateUi(C.getData());
                return;
            } else {
                finish();
                return;
            }
        }
        showTost(getResources().getString(R.string.net_connect_failed));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestEndGameReportReasonArgs requestEndGameReportReasonArgs = new RequestEndGameReportReasonArgs();
            requestEndGameReportReasonArgs.setType("mg_game_feedback_endgame");
            requestEndGameReportReasonArgs.setUid(AccountUtil_.getInstance_(this).getUid());
            requestEndGameReportReasonArgs.setMsg(this.f30221c.getText().toString().trim());
            requestEndGameReportReasonArgs.setValue(this.f30225g.getCode());
            requestEndGameReportReasonArgs.setResourceId(this.f30223e);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameReportReasonArgs);
            requestModel.setDefault(this);
            ResponseModel N = this.f30224f.N(requestModel.makeSign());
            if (N != null && N.getCode() == 200) {
                k0();
                return;
            } else {
                showTost("举报失败");
                return;
            }
        }
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        showTost("举报成功");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        com.join.mgps.Util.c2.o(this, 16777215, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<EndGameReportTypeBean> list) {
        this.f30220b.setLayoutManager(new GridLayoutManager(this, 2));
        this.f30220b.setAdapter(new a(list));
    }
}
