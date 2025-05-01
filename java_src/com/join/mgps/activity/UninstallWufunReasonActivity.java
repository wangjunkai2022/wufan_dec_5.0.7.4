package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.UninstallWufunReasonActivity;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.UninstallAppReasonBean;
import com.join.mgps.dto.UninstallAppReasonSubmitArgs;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_uninstall_wufun_reason)
/* loaded from: classes4.dex */
public class UninstallWufunReasonActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f38205b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    EditText f38206c;

    /* renamed from: e  reason: collision with root package name */
    private com.join.mgps.rpc.k f38208e;

    /* renamed from: f  reason: collision with root package name */
    private Context f38209f;

    /* renamed from: h  reason: collision with root package name */
    private a f38211h;

    /* renamed from: d  reason: collision with root package name */
    private int f38207d = -1;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f38210g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BaseQuickAdapter<String, BaseViewHolder> {
        public a(@Nullable List<String> list) {
            super(R.layout.item_uninstall_reason_list, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(BaseViewHolder baseViewHolder, View view) {
            UninstallWufunReasonActivity.this.f38207d = baseViewHolder.getLayoutPosition();
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull final BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R.id.tvReason, str);
            baseViewHolder.getView(R.id.ivCheck).setSelected(baseViewHolder.getLayoutPosition() == UninstallWufunReasonActivity.this.f38207d);
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.g3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UninstallWufunReasonActivity.a.this.c(baseViewHolder, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f38208e = com.join.mgps.rpc.impl.i.D0();
        this.f38209f = this;
        this.f38205b.setLayoutManager(new LinearLayoutManager(this));
        a aVar = new a(this.f38210g);
        this.f38211h = aVar;
        this.f38205b.setAdapter(aVar);
        getData();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.bottom_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                UninstallAppReasonSubmitArgs uninstallAppReasonSubmitArgs = new UninstallAppReasonSubmitArgs();
                uninstallAppReasonSubmitArgs.setUid(AccountUtil_.getInstance_(this.f38209f).getUid());
                requestModel.setArgs(uninstallAppReasonSubmitArgs);
                requestModel.setDefault(this);
                ResponseModel<UninstallAppReasonBean> T = this.f38208e.T(requestModel.makeSign());
                if (T == null || T.getCode() != 200 || T.getData() == null) {
                    return;
                }
                n0(T.getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        int i4 = this.f38207d;
        if (i4 < 0) {
            showToast("请选择卸载理由");
            return;
        }
        l0(this.f38210g.get(i4));
        Ext ext = new Ext();
        ext.setReMarks((this.f38207d + 1) + "");
        com.papa.sim.statistic.p.l(this.f38209f).O1(Event.clickUninstallSubmitBtn, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                UninstallAppReasonSubmitArgs uninstallAppReasonSubmitArgs = new UninstallAppReasonSubmitArgs();
                uninstallAppReasonSubmitArgs.setUid(AccountUtil_.getInstance_(this.f38209f).getUid());
                uninstallAppReasonSubmitArgs.setContent(str);
                uninstallAppReasonSubmitArgs.setText(this.f38206c.getText().toString().trim());
                requestModel.setArgs(uninstallAppReasonSubmitArgs);
                requestModel.setDefault(this);
                this.f38208e.Z(requestModel.makeSign());
                m0();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + getPackageName())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(UninstallAppReasonBean uninstallAppReasonBean) {
        if (uninstallAppReasonBean == null || uninstallAppReasonBean.getReason() == null) {
            return;
        }
        List<String> reason = uninstallAppReasonBean.getReason();
        this.f38210g = reason;
        this.f38211h.setNewData(reason);
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
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f38209f).b(str);
    }
}
