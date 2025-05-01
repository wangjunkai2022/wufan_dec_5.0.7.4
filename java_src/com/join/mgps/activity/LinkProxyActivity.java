package com.join.mgps.activity;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameVerByBg;
import com.join.mgps.dto.ResultMainBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_link_proxy)
/* loaded from: classes4.dex */
public class LinkProxyActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ForumLoadingView f34201b;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.e f34202c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends ForumLoadingView.e {
        a(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            LinkProxyActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends ForumLoadingView.e {
        b(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            LinkProxyActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ForumLoadingView.e {
        c(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            LinkProxyActivity.this.j0();
        }
    }

    private void i0() {
        int i4;
        String str;
        l0(true);
        String a5 = com.join.mgps.Util.a1.a(this, getIntent());
        if (TextUtils.isEmpty(a5)) {
            l0(false);
            return;
        }
        try {
            try {
                str = getPackageManager().getPackageInfo(a5, 0).versionName;
                i4 = getPackageManager().getPackageInfo(a5, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                i4 = 0;
            }
            k0(a5, i4, str);
        } catch (Exception unused) {
            l0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f34202c = com.join.mgps.rpc.impl.d.P1();
        f0(1);
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(int i4) {
        ForumLoadingView forumLoadingView = this.f34201b;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f34201b;
            forumLoadingView2.setListener(new c(forumLoadingView2));
            this.f34201b.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new a(forumLoadingView));
            this.f34201b.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多内容哦~");
            ForumLoadingView forumLoadingView3 = this.f34201b;
            forumLoadingView3.setListener(new b(forumLoadingView3));
            this.f34201b.setReloadingVisibility(0);
            this.f34201b.j(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(GameVerByBg gameVerByBg) {
        if (gameVerByBg == null) {
            return;
        }
        String game_id = gameVerByBg.getGame_id();
        String tpl_type = gameVerByBg.getTpl_type();
        int jump_type = gameVerByBg.getJump_type();
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(game_id);
        intentDateBean.setTpl_type(tpl_type);
        intentDateBean.setJump_type(jump_type);
        ExtBean extBean = new ExtBean();
        extBean.setFrom("updateFromMarket");
        intentDateBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        IntentUtil.getInstance().goMGMainActivity2Front(this);
    }

    void j0() {
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str, int i4, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.f34202c == null) {
                this.f34202c = com.join.mgps.rpc.impl.d.P1();
            }
            ResultMainBean resultMainBean = null;
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData != null) {
                    accountData.getUid();
                }
                ResultMainBean<GameVerByBg> z02 = this.f34202c.z0(RequestBeanUtil.getInstance(this).getGameVerByBgArgs(str, i4, str2));
                String str3 = "抱歉，未找到该游戏";
                if (z02 != null && z02.getFlag() == 1) {
                    if (z02.getMessages() != null && z02.getMessages().getData() != null && !TextUtils.isEmpty(z02.getMessages().getData().getGame_id())) {
                        g0(z02.getMessages().getData());
                    } else {
                        showMessage("抱歉，未找到该游戏");
                        h0();
                    }
                } else {
                    if (z02 != null && !TextUtils.isEmpty(z02.getError_info())) {
                        str3 = z02.getError_info();
                    }
                    showMessage(str3);
                    h0();
                }
                l0(false);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showMessage(0 != 0 ? resultMainBean.getError_info() : "服务访问异常，请稍后再试");
                l0(false);
                return;
            }
        }
        showMessage(getString(R.string.net_connect_failed));
        l0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(boolean z4) {
        if (z4) {
            this.f34201b.m();
            f0(1);
            return;
        }
        f0(2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }
}
