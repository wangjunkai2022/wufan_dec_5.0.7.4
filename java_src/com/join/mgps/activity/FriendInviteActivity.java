package com.join.mgps.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.FriendInviteBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
@EActivity(R.layout.activity_friend_invite)
/* loaded from: classes.dex */
public class FriendInviteActivity extends FriendActivity {
    @ViewById
    SimpleDraweeView N;
    @ViewById
    TextView O;
    @ViewById
    TextView P;
    @ViewById(R.id.gameName)
    TextView Q;
    @Extra
    FriendInviteBean R;
    com.join.mgps.rpc.j S;
    CountDownTimer T = new a(16000, 1000);

    /* loaded from: classes4.dex */
    class a extends CountDownTimer {
        a(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Ext ext = new Ext();
            ext.setFrom("0");
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(FriendInviteActivity.this).getAccountData();
            if (accountData != null) {
                ext.setUid(accountData.getUid());
            }
            if (FriendInviteActivity.this.R != null) {
                ext.setGameId(FriendInviteActivity.this.R.getGameId() + "");
                ext.setPosition(FriendInviteActivity.this.R.getSource() != 1 ? "1" : "0");
            }
            com.papa.sim.statistic.p.l(FriendInviteActivity.this).O1(Event.OverdueInvitation, ext);
            FriendInviteActivity.this.P.setText("拒绝");
            com.wufan.friend.chat.c.u().P();
            FriendInviteActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            TextView textView = FriendInviteActivity.this.P;
            textView.setText("拒绝(" + (j4 / 1000) + "s)");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z0() {
        Ext ext = new Ext();
        ext.setPosition(this.R.getSource() == 1 ? "0" : "1");
        ext.setFrom("0");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setGameId(this.R.getGameId() + "");
        com.papa.sim.statistic.p.l(this).O1(Event.SuccessInvitation, ext);
        String str = "" + this.R.getGameId();
        if (!checkGameIsInstall(str)) {
            startDownloadActivity(str, 10001);
            return;
        }
        com.wufan.friend.chat.c.u().O();
        d1(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void a1() {
        c1();
        com.wufan.friend.chat.c.u().P();
        Ext ext = new Ext();
        ext.setPosition(this.R.getSource() == 1 ? "0" : "1");
        ext.setFrom("0");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setGameId(this.R.getGameId() + "");
        com.papa.sim.statistic.p.l(this).O1(Event.RefuseInvitation, ext);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().t(this);
        }
        FriendInviteBean friendInviteBean = this.R;
        if (friendInviteBean == null) {
            finish();
            return;
        }
        MyImageLoader.h(this.N, friendInviteBean.getAvatar());
        this.O.setText(this.R.getFromNickname());
        this.Q.setText(this.R.getGameName());
        this.S = com.join.mgps.rpc.impl.h.p();
        com.join.mgps.Util.c2.o(this, -1, true);
        if (getResources().getConfiguration().orientation == 2) {
            setSystemUiHide(true);
        }
        Ext ext = new Ext();
        ext.setPosition(this.R.getSource() == 1 ? "0" : "1");
        ext.setFrom("0");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setGameId(this.R.getGameId() + "");
        com.papa.sim.statistic.p.l(this).O1(Event.ReceiveInvitation, ext);
        this.T.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b1() {
        com.wufan.friend.chat.c.u().P();
        Ext ext = new Ext();
        ext.setPosition(this.R.getSource() == 1 ? "0" : "1");
        ext.setFrom("0");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setGameId(this.R.getGameId() + "");
        com.papa.sim.statistic.p.l(this).O1(Event.RefuseInvitation, ext);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c1() {
        try {
            com.wufan.friend.chat.c.u().P();
            if (com.ta.utdid2.android.utils.f.f(this)) {
                HashMap hashMap = new HashMap();
                hashMap.put("uid", AccountUtil_.getInstance_(this).getUid());
                hashMap.put("token", AccountUtil_.getInstance_(this).getToken());
                hashMap.put("friendId", Integer.valueOf(this.R.getFromAccountId()));
                this.S.j(hashMap);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void d1(int i4) {
        Intent intent = new Intent();
        intent.setAction("com.emu.ad.result");
        intent.putExtra("adAction", 100);
        intent.putExtra("exit", i4);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 10001 && i5 == -1) {
            com.wufan.friend.chat.c.u().O();
            d1(2);
        }
    }

    @Override // com.join.mgps.activity.FriendActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.wufan.friend.chat.c.u().P();
        Ext ext = new Ext();
        ext.setPosition(this.R.getSource() == 1 ? "0" : "1");
        ext.setFrom("0");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setGameId(this.R.getGameId() + "");
        com.papa.sim.statistic.p.l(this).O1(Event.RefuseInvitation, ext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.T;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().y(this);
        }
    }

    @Subscribe
    public void onFriendEvent(com.join.mgps.event.q qVar) {
        if (qVar != null) {
            if (qVar.a() == 3) {
                finish();
            } else if (qVar.a() == 8) {
                b1();
            }
        }
    }
}
