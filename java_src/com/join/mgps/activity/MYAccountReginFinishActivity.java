package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.component.album.MyIconActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.db.tables.HeadPortraitTable;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountChangeUserinfoRequestBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.HeadPicRequestBean;
import com.join.mgps.dto.UserHeadPortrait;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.my_account_reginfinish_layout)
/* loaded from: classes4.dex */
public class MYAccountReginFinishActivity extends BaseActivity {

    /* renamed from: v  reason: collision with root package name */
    private static final String f35049v = "MYAccountReginFinishActivity";

    /* renamed from: b  reason: collision with root package name */
    MApplication f35050b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    MyGridView f35051c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f35052d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f35053e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35054f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ScrollView f35055g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f35056h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f35057i;

    /* renamed from: j  reason: collision with root package name */
    private com.join.mgps.adapter.a f35058j;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35060l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    AccountBean f35061m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    int f35062n;

    /* renamed from: o  reason: collision with root package name */
    private long f35063o;

    /* renamed from: q  reason: collision with root package name */
    private Context f35065q;

    /* renamed from: u  reason: collision with root package name */
    private String f35069u;

    /* renamed from: k  reason: collision with root package name */
    private int f35059k = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35064p = false;

    /* renamed from: r  reason: collision with root package name */
    private List<HeadPortraitTable> f35066r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private List<HeadPortraitTable> f35067s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private boolean f35068t = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: com.join.mgps.activity.MYAccountReginFinishActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0332a implements Consumer<com.tbruyelle.rxpermissions2.b> {
            C0332a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
                if (bVar.f62140b) {
                    Intent intent = new Intent();
                    intent.setClass(MYAccountReginFinishActivity.this.f35065q, MyIconActivity.class);
                    MYAccountReginFinishActivity.this.f35065q.startActivity(intent);
                } else if (bVar.f62141c) {
                } else {
                    com.join.mgps.Util.l2.a(MYAccountReginFinishActivity.this.f35065q).b("需要授权存储权限");
                }
            }
        }

        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 != 0) {
                MYAccountReginFinishActivity.this.f35058j.b(i4);
                MYAccountReginFinishActivity mYAccountReginFinishActivity = MYAccountReginFinishActivity.this;
                mYAccountReginFinishActivity.f35069u = ((HeadPortraitTable) mYAccountReginFinishActivity.f35066r.get(i4)).getHead_portrait_pic();
                return;
            }
            new com.tbruyelle.rxpermissions2.c(MYAccountReginFinishActivity.this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new C0332a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35057i = com.join.mgps.rpc.impl.a.c0();
        MApplication mApplication = (MApplication) getApplication();
        this.f35050b = mApplication;
        mApplication.e(this);
        int i4 = this.f35062n;
        if (i4 == 1 || i4 == 2) {
            this.f35054f.setText("注册成功");
        } else if (i4 == 3) {
            this.f35054f.setText("修改头像");
        }
        this.f35060l = com.join.mgps.Util.b0.f0(this).x(this);
        this.f35065q = this;
        com.join.mgps.adapter.a aVar = new com.join.mgps.adapter.a(this.f35065q, this.f35066r, this.f35061m.getAvatarSrc(), true);
        this.f35058j = aVar;
        this.f35051c.setAdapter((ListAdapter) aVar);
        this.f35051c.setSelector(new ColorDrawable(0));
        this.f35051c.setOnItemClickListener(new a());
        this.f35067s = b2.y.n().d();
        HeadPortraitTable headPortraitTable = new HeadPortraitTable();
        headPortraitTable.setId(R.drawable.choose_butn_selector);
        headPortraitTable.setHead_portrait_pic("相机");
        this.f35066r.add(headPortraitTable);
        List<HeadPortraitTable> list = this.f35067s;
        if (list != null && list.size() > 0) {
            this.f35066r.addAll(this.f35067s);
            this.f35058j.notifyDataSetChanged();
            this.f35068t = true;
        }
        p0();
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    HeadPicRequestBean headPicRequestBean = new HeadPicRequestBean();
                    headPicRequestBean.setUid(this.f35061m.getUid());
                    headPicRequestBean.setToken(this.f35061m.getToken());
                    headPicRequestBean.setSign(com.join.mgps.Util.x1.g(headPicRequestBean));
                    AccountResultMainBean<UserHeadPortrait> t4 = this.f35057i.t(headPicRequestBean.getParams());
                    if (t4 != null && t4.getError() == 0) {
                        if (t4.getData().isIs_success()) {
                            o0(t4.getData().getHead_portrait_pic());
                        } else {
                            l0();
                            error(t4.getData().getError_msg());
                        }
                    } else {
                        l0();
                        error("连接失败，请稍后再试。");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    l0();
                    error("连接失败，请稍后再试。");
                }
                return;
            } finally {
                showLodingDismis();
            }
        }
        error("没有网络，请先检查网络。");
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f35052d.setVisibility(8);
        this.f35053e.setVisibility(8);
        this.f35055g.setVisibility(0);
        this.f35051c.setVisibility(0);
        this.f35058j.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (System.currentTimeMillis() - this.f35063o <= 2000) {
            return;
        }
        this.f35063o = System.currentTimeMillis();
        r0(this.f35069u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(List<String> list) {
        this.f35052d.setVisibility(8);
        this.f35053e.setVisibility(8);
        this.f35051c.setVisibility(0);
        this.f35055g.setVisibility(0);
        b2.y.n().a();
        for (int i4 = 0; i4 < list.size(); i4++) {
            HeadPortraitTable headPortraitTable = new HeadPortraitTable();
            headPortraitTable.setHead_portrait_pic(list.get(i4));
            b2.y.n().k(headPortraitTable);
        }
        List<HeadPortraitTable> d5 = b2.y.n().d();
        this.f35066r.removeAll(this.f35067s);
        this.f35066r.addAll(d5);
        this.f35058j.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f35064p = true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            return false;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        if (this.f35068t) {
            this.f35052d.setVisibility(8);
            this.f35053e.setVisibility(8);
            this.f35055g.setVisibility(0);
            return;
        }
        this.f35052d.setVisibility(0);
        this.f35053e.setVisibility(8);
        this.f35055g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        this.f35050b.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            showLoding();
            try {
                AccountChangeUserinfoRequestBean accountChangeUserinfoRequestBean = new AccountChangeUserinfoRequestBean();
                accountChangeUserinfoRequestBean.setGender(1);
                accountChangeUserinfoRequestBean.setAccount(this.f35061m.getAccount());
                accountChangeUserinfoRequestBean.setNick_name(this.f35061m.getNickname());
                accountChangeUserinfoRequestBean.setUid(this.f35061m.getUid());
                accountChangeUserinfoRequestBean.setToken(this.f35061m.getToken());
                accountChangeUserinfoRequestBean.setAvatar_src(str);
                accountChangeUserinfoRequestBean.setSign(com.join.mgps.Util.x1.g(accountChangeUserinfoRequestBean));
                AccountResultMainBean<AccountTokenSuccess> c5 = this.f35057i.c(accountChangeUserinfoRequestBean.getParams());
                if (c5 != null && c5.getError() == 0) {
                    if (c5.getData().is_success()) {
                        q0();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f35060l.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingDismis() {
        com.join.mgps.dialog.d1 d1Var;
        if (this.f35064p || (d1Var = this.f35060l) == null) {
            return;
        }
        d1Var.dismiss();
    }
}
