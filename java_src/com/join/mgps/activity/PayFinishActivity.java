package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PapayResult;
import com.join.mgps.dto.PayGameDetialBean;
import com.join.mgps.dto.RequestAppDetialArgs;
import com.join.mgps.dto.ResultMainBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
@EActivity(R.layout.payfinish_activirty)
/* loaded from: classes4.dex */
public class PayFinishActivity extends BaseActivity {
    @Extra

    /* renamed from: b  reason: collision with root package name */
    PapayResult f36846b;

    /* renamed from: c  reason: collision with root package name */
    DownloadTask f36847c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.e f36848d;

    /* renamed from: e  reason: collision with root package name */
    Context f36849e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.android.app.common.http.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f36850a;

        a(boolean z4) {
            this.f36850a = z4;
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            PayFinishActivity.this.showTost("获取游戏信息失败");
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            ResultMainBean resultMainBean = (ResultMainBean) obj;
            if (resultMainBean != null && resultMainBean.getFlag() != 0) {
                PayGameDetialBean payGameDetialBean = (PayGameDetialBean) resultMainBean.getMessages().getData();
                if (payGameDetialBean != null) {
                    if (payGameDetialBean.getGame_info() != null) {
                        CollectionBeanSub game_info = payGameDetialBean.getGame_info();
                        DownloadTask F = p1.f.K().F(game_info.getGame_id());
                        Intent intent = new Intent(o1.a.G);
                        intent.putExtra("gameData", game_info);
                        PayFinishActivity.this.sendBroadcast(intent);
                        if (F == null && this.f36850a) {
                            com.php25.PDownload.d.c(game_info.getDownloadtaskDown(), PayFinishActivity.this.f36849e);
                        }
                        PayFinishActivity.this.finish();
                        return;
                    }
                    PayFinishActivity.this.showTost("稍后再试");
                }
            } else if (resultMainBean != null && resultMainBean.getFlag() != 0) {
                PayFinishActivity.this.showTost("获取游戏信息失败");
            } else {
                PayFinishActivity.this.showTost("获取游戏信息失败");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f36849e = this;
        this.f36848d = com.join.mgps.rpc.impl.d.P1();
    }

    void g0(String str, boolean z4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                RequestAppDetialArgs requestAppDetialArgs = new RequestAppDetialArgs();
                requestAppDetialArgs.setDeviceid("");
                requestAppDetialArgs.setVersion(com.join.android.app.common.utils.n.n(this.f36849e).y() + "_" + com.join.android.app.common.utils.n.n(this.f36849e).z());
                requestAppDetialArgs.setGame_id(str);
                requestAppDetialArgs.setUid(uid);
                requestAppDetialArgs.setToken(accountData.getToken());
                com.join.mgps.rpc.n.c(requestAppDetialArgs, new a(z4));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showTost("获取游戏信息失败");
                return;
            }
        }
        showTost("请检查网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        g0(this.f36846b.getGameid(), false);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        g0(this.f36846b.getGameid(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }
}
