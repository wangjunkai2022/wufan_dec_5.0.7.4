package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.album.MyIconActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.HeadPortraitTable;
import com.join.mgps.dto.AccountChangeUserinfoRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.HeadPicRequestBean;
import com.join.mgps.dto.UserHeadPortrait;
import com.wufan.user.service.protobuf.n0;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mg_choose_layout)
/* loaded from: classes4.dex */
public class MGChooseIconActivity extends FragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f34249b;

    /* renamed from: c  reason: collision with root package name */
    private com.join.mgps.adapter.a f34250c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    GridView f34251d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f34252e;

    /* renamed from: g  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f34254g;

    /* renamed from: h  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f34255h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f34256i;

    /* renamed from: j  reason: collision with root package name */
    MApplication f34257j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f34258k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f34259l;

    /* renamed from: n  reason: collision with root package name */
    private List<HeadPortraitTable> f34261n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    int f34262o;

    /* renamed from: f  reason: collision with root package name */
    private List<HeadPortraitTable> f34253f = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private boolean f34260m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: com.join.mgps.activity.MGChooseIconActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0331a implements Consumer<com.tbruyelle.rxpermissions2.b> {
            C0331a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
                if (bVar.f62140b) {
                    Intent intent = new Intent();
                    intent.setClass(MGChooseIconActivity.this.f34249b, MyIconActivity.class);
                    intent.putExtra("from", MGChooseIconActivity.this.f34262o);
                    MGChooseIconActivity.this.f34249b.startActivity(intent);
                } else if (bVar.f62141c) {
                } else {
                    com.join.mgps.Util.b0.f0(MGChooseIconActivity.this.f34249b).X(MGChooseIconActivity.this.f34249b, bVar);
                }
            }
        }

        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 != 0) {
                MGChooseIconActivity.this.f34250c.b(i4);
                MGChooseIconActivity mGChooseIconActivity = MGChooseIconActivity.this;
                mGChooseIconActivity.n0(((HeadPortraitTable) mGChooseIconActivity.f34253f.get(i4)).getHead_portrait_pic());
                return;
            }
            new com.tbruyelle.rxpermissions2.c(MGChooseIconActivity.this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new C0331a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f34256i = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f34257j = mApplication;
        mApplication.e(this);
        this.f34249b = this;
        this.f34254g = com.join.mgps.Util.b0.f0(this).x(this);
        this.f34252e.setText("选择图像");
        this.f34251d.setSelector(new ColorDrawable(0));
        this.f34255h = AccountUtil_.getInstance_(this).getAccountData();
        this.f34251d.setOnItemClickListener(new a());
        this.f34261n = b2.y.n().d();
        com.join.mgps.adapter.a aVar = new com.join.mgps.adapter.a(this.f34249b, this.f34253f, this.f34255h.d0(), false);
        this.f34250c = aVar;
        this.f34251d.setAdapter((ListAdapter) aVar);
        HeadPortraitTable headPortraitTable = new HeadPortraitTable();
        headPortraitTable.setId(R.drawable.choose_butn_selector);
        headPortraitTable.setHead_portrait_pic("相机");
        this.f34253f.add(headPortraitTable);
        List<HeadPortraitTable> list = this.f34261n;
        if (list != null && list.size() > 0) {
            this.f34253f.addAll(this.f34261n);
            this.f34250c.notifyDataSetChanged();
            this.f34260m = true;
        }
        l0();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this.f34249b).b(str);
    }

    void h0() {
        try {
            String localUserIcon = AccountUtil_.getInstance_(this).getLocalUserIcon();
            if (com.join.mgps.Util.g2.i(localUserIcon)) {
                File file = new File(localUserIcon);
                if (file.exists()) {
                    file.delete();
                    Fresco.getImagePipeline().e(MyImageLoader.G(file));
                }
            }
            AccountUtil_.getInstance_(this).setLocalUserIcon(null);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    HeadPicRequestBean headPicRequestBean = new HeadPicRequestBean();
                    headPicRequestBean.setUid(this.f34255h.getUid());
                    headPicRequestBean.setToken(this.f34255h.getToken());
                    headPicRequestBean.setSign(com.join.mgps.Util.x1.g(headPicRequestBean));
                    AccountResultMainBean<UserHeadPortrait> t4 = this.f34256i.t(headPicRequestBean.getParams());
                    if (t4 != null && t4.getError() == 0 && t4.getData().isIs_success()) {
                        this.f34260m = true;
                        k0(t4.getData().getHead_portrait_pic());
                    }
                    if (this.f34260m) {
                        return;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    if (this.f34260m) {
                        return;
                    }
                }
                j0();
            } catch (Throwable th) {
                if (!this.f34260m) {
                    j0();
                }
                throw th;
            }
        } else if (this.f34260m) {
        } else {
            j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f34258k.setVisibility(8);
        this.f34259l.setVisibility(0);
        this.f34251d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(List<String> list) {
        this.f34258k.setVisibility(8);
        this.f34259l.setVisibility(8);
        this.f34251d.setVisibility(0);
        b2.y.n().a();
        for (int i4 = 0; i4 < list.size(); i4++) {
            HeadPortraitTable headPortraitTable = new HeadPortraitTable();
            headPortraitTable.setHead_portrait_pic(list.get(i4));
            b2.y.n().k(headPortraitTable);
        }
        List<HeadPortraitTable> d5 = b2.y.n().d();
        this.f34253f.removeAll(this.f34261n);
        this.f34253f.addAll(d5);
        this.f34250c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        if (this.f34260m) {
            this.f34258k.setVisibility(8);
            this.f34259l.setVisibility(8);
            this.f34251d.setVisibility(0);
            return;
        }
        this.f34258k.setVisibility(0);
        this.f34259l.setVisibility(8);
        this.f34251d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(String str) {
        n0.b builder = this.f34255h.toBuilder();
        builder.K3(str);
        this.f34255h = builder.build();
        AccountUtil_.getInstance_(this.f34249b).saveAccountData(this.f34255h, this);
        com.join.mgps.listener.a.b().c();
        try {
            MyImageLoader.k(str);
            h0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        setResult(10001);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoading();
            try {
                AccountChangeUserinfoRequestBean accountChangeUserinfoRequestBean = new AccountChangeUserinfoRequestBean();
                accountChangeUserinfoRequestBean.setGender(this.f34255h.v1());
                accountChangeUserinfoRequestBean.setAccount(this.f34255h.getAccount());
                accountChangeUserinfoRequestBean.setNick_name(this.f34255h.getNickname());
                accountChangeUserinfoRequestBean.setUid(this.f34255h.getUid());
                accountChangeUserinfoRequestBean.setToken(this.f34255h.getToken());
                accountChangeUserinfoRequestBean.setAvatar_src(str);
                accountChangeUserinfoRequestBean.setSign(com.join.mgps.Util.x1.g(accountChangeUserinfoRequestBean));
                AccountResultMainBean<AccountTokenSuccess> c5 = this.f34256i.c(accountChangeUserinfoRequestBean.getParams());
                if (c5 != null && c5.getError() == 0) {
                    if (c5.getData().is_success()) {
                        m0(str);
                    } else {
                        error(c5.getData().getError_msg());
                    }
                } else {
                    error("连接失败，请稍后再试。");
                }
                showLodingDismis();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingDismis();
                error("连接失败，请稍后再试。");
                return;
            }
        }
        error("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.d1 d1Var = this.f34254g;
        if (d1Var != null && d1Var.isShowing()) {
            this.f34254g.dismiss();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        l0();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        this.f34254g.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var = this.f34254g;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f34254g.dismiss();
    }
}
