package com.join.mgps.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseFragmentActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.AbouSubMenuAdapter;
import com.join.mgps.adapter.AboutTopMenuAdapter;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.RequestCommonAdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.ext.ToastManager;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.about_activity)
/* loaded from: classes4.dex */
public class MGPapaAboutActivity extends BaseFragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f34884b;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.b f34886d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.e f34887e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f34888f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f34889g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f34890h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RecyclerView f34891i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f34892j;
    @Pref

    /* renamed from: k  reason: collision with root package name */
    PrefDef_ f34893k;

    /* renamed from: l  reason: collision with root package name */
    private AbouSubMenuAdapter f34894l;

    /* renamed from: m  reason: collision with root package name */
    private AboutTopMenuAdapter f34895m;

    /* renamed from: c  reason: collision with root package name */
    private String f34885c = getClass().getSimpleName();

    /* renamed from: n  reason: collision with root package name */
    private boolean f34896n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends LinearLayoutManager {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends LinearLayoutManager {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends UniversalItemDecoration {
        c() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = Color.parseColor("#F3F3F3");
            aVar.f46237d = (int) MGPapaAboutActivity.this.getResources().getDimension(R.dimen.wdp2);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends UniversalItemDecoration {
        d() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46237d = (int) MGPapaAboutActivity.this.getResources().getDimension(R.dimen.wdp6);
            return aVar;
        }
    }

    private void i0(String str) {
        ((ClipboardManager) this.f34884b.getSystemService("clipboard")).setText(str);
        ToastManager.show(str + " 已复制到剪贴板");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        k0((CommonGameInfoBean) baseQuickAdapter.getItem(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        k0((CommonGameInfoBean) baseQuickAdapter.getItem(i4));
    }

    private void n0() {
        String d5 = this.f34893k.wf_app_about().d();
        if (com.join.mgps.Util.g2.i(d5)) {
            try {
                p0((List) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().createCollectionType(List.class, CommonGameInfoBean.class)));
                this.f34896n = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void h0() {
        this.f34887e = com.join.mgps.rpc.impl.d.P1();
        this.f34886d = com.join.mgps.rpc.impl.a.c0();
        this.f34884b = this;
        com.join.mgps.Util.c2.q(this, R.color.activity_about);
        this.f34894l = new AbouSubMenuAdapter();
        AboutTopMenuAdapter aboutTopMenuAdapter = new AboutTopMenuAdapter();
        this.f34895m = aboutTopMenuAdapter;
        aboutTopMenuAdapter.setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.mgps.activity.k1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                MGPapaAboutActivity.this.l0(baseQuickAdapter, view, i4);
            }
        });
        this.f34894l.setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.mgps.activity.l1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                MGPapaAboutActivity.this.m0(baseQuickAdapter, view, i4);
            }
        });
        this.f34891i.setLayoutManager(new a(this));
        this.f34892j.setLayoutManager(new b(this));
        this.f34891i.setAdapter(this.f34895m);
        this.f34892j.setAdapter(this.f34894l);
        this.f34891i.setLayoutManager(new LinearLayoutManager(this));
        this.f34892j.setLayoutManager(new LinearLayoutManager(this));
        o0();
        this.f34891i.addItemDecoration(new c());
        this.f34892j.addItemDecoration(new d());
        j0();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this.f34884b)) {
            try {
                RequestCommonAdArgs requestCommonAdArgs = new RequestCommonAdArgs();
                requestCommonAdArgs.setPage(1);
                requestCommonAdArgs.setPositionMarkList(new ArrayList<String>() { // from class: com.join.mgps.activity.MGPapaAboutActivity.5
                    {
                        add("WF_APP_ABOUT");
                    }
                });
                RequestModel requestModel = new RequestModel(this.f34884b);
                requestModel.setArgs(requestCommonAdArgs);
                ResponseModel<List<CommonAdBean>> v02 = com.join.mgps.rpc.impl.i.D0().v0(requestModel.makeSign());
                if (v02 == null || v02.getData() == null || v02.getData().size() <= 0) {
                    return;
                }
                for (CommonAdBean commonAdBean : v02.getData()) {
                    if (TextUtils.equals(commonAdBean.getPosition_mark(), "WF_APP_ABOUT") && commonAdBean.getAd_info_list() != null) {
                        this.f34893k.wf_app_about().g(JsonMapper.toJsonString(commonAdBean.getAd_info_list()));
                        if (this.f34896n) {
                            return;
                        }
                        p0(commonAdBean.getAd_info_list());
                        return;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void k0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean.getJp_info() != null && "action_copy".equals(commonGameInfoBean.getJp_info().getLink_type_val())) {
            i0(commonGameInfoBean.getDescription());
        } else if (commonGameInfoBean.getJp_info() != null) {
            IntentUtil.getInstance().intentActivity(this, commonGameInfoBean.getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f34890h.setText("V 5.0.7.4");
        TextUtils.isEmpty("wufun");
        this.f34888f.setText("关于悟饭");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(List<CommonGameInfoBean> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CommonGameInfoBean commonGameInfoBean : list) {
            if ("top_menu".equals(commonGameInfoBean.getSub_title())) {
                arrayList.add(commonGameInfoBean);
            } else if ("bottom".equals(commonGameInfoBean.getSub_title())) {
                arrayList2.add(commonGameInfoBean);
            }
        }
        this.f34895m.submitList(arrayList);
        this.f34894l.submitList(arrayList2);
    }
}
