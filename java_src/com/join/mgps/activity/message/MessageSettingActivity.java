package com.join.mgps.activity.message;

import android.content.Context;
import android.widget.ImageView;
import com.BaseFragmentActivity;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.l2;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.JPushJoinDeviceResult;
import com.join.mgps.pref.h;
import com.join.mgps.rpc.b;
import com.join.mgps.rpc.impl.a;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_message_setting)
/* loaded from: classes4.dex */
public class MessageSettingActivity extends BaseFragmentActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f39384b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f39385c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f39386d;

    /* renamed from: e  reason: collision with root package name */
    private Context f39387e;

    /* renamed from: f  reason: collision with root package name */
    private b f39388f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f39387e = this;
        this.f39388f = a.c0();
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        if (h.n(this.f39387e).q()) {
            this.f39384b.setImageResource(R.drawable.ic_notif_open);
            if (h.n(this.f39387e).r()) {
                this.f39386d.setImageResource(R.drawable.ic_notif_open);
            } else {
                this.f39386d.setImageResource(R.drawable.ic_notif_closed);
            }
            if (h.n(this.f39387e).s()) {
                this.f39385c.setImageResource(R.drawable.ic_notif_open);
                return;
            } else {
                this.f39385c.setImageResource(R.drawable.ic_notif_closed);
                return;
            }
        }
        this.f39384b.setImageResource(R.drawable.ic_notif_closed);
        this.f39385c.setImageResource(R.drawable.ic_notif_closed);
        this.f39386d.setImageResource(R.drawable.ic_notif_closed);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(AccountResultMainBean<JPushJoinDeviceResult> accountResultMainBean) {
        if (accountResultMainBean != null && accountResultMainBean.getError() == 0 && accountResultMainBean.getData().isResult()) {
            if (accountResultMainBean.getData().getOpenPush() != 1) {
                h.n(this.f39387e).e0(false);
            } else {
                h.n(this.f39387e).e0(true);
            }
            if (accountResultMainBean.getData().getOpenPraise() == 1) {
                h.n(this.f39387e).f0(true);
            } else {
                h.n(this.f39387e).f0(false);
            }
            if (accountResultMainBean.getData().getOpenReply() == 1) {
                h.n(this.f39387e).g0(true);
            } else {
                h.n(this.f39387e).g0(false);
            }
        }
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        if (j.j(this.f39387e)) {
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.f39387e).getUid() + "");
            linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.f39387e).getToken());
            g0(this.f39388f.I(linkedMultiValueMap));
            return;
        }
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        l0(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        l0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        l0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(int i4) {
        if (j.j(this.f39387e)) {
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.f39387e).getUid() + "");
            linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.f39387e).getToken());
            boolean q4 = h.n(this.f39387e).q();
            boolean s4 = h.n(this.f39387e).s();
            boolean r4 = h.n(this.f39387e).r();
            linkedMultiValueMap.add("openPush", (q4 ? 1 : 0) + "");
            linkedMultiValueMap.add("openReply", (s4 ? 1 : 0) + "");
            linkedMultiValueMap.add("openPraise", (r4 ? 1 : 0) + "");
            if (i4 == 1) {
                if (q4) {
                    linkedMultiValueMap.add("openPush", "0");
                    linkedMultiValueMap.add("openReply", "0");
                    linkedMultiValueMap.add("openPraise", "0");
                } else {
                    linkedMultiValueMap.add("openPush", "1");
                    linkedMultiValueMap.add("openReply", "0");
                    linkedMultiValueMap.add("openPraise", "0");
                }
            } else if (i4 == 2) {
                if (!q4) {
                    linkedMultiValueMap.add("openPraise", "0");
                }
                if (s4) {
                    linkedMultiValueMap.add("openReply", "0");
                } else {
                    linkedMultiValueMap.add("openPush", "1");
                    linkedMultiValueMap.add("openReply", "1");
                }
            } else if (i4 == 3) {
                if (!q4) {
                    linkedMultiValueMap.add("openReply", "0");
                }
                if (r4) {
                    linkedMultiValueMap.add("openPraise", "0");
                } else {
                    linkedMultiValueMap.add("openPush", "1");
                    linkedMultiValueMap.add("openPraise", "1");
                }
            }
            m0(this.f39388f.m(linkedMultiValueMap), i4);
            return;
        }
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(AccountResultMainBean<JPushJoinDeviceResult> accountResultMainBean, int i4) {
        if (accountResultMainBean != null && accountResultMainBean.getError() == 0 && accountResultMainBean.getData().isResult()) {
            boolean q4 = h.n(this.f39387e).q();
            boolean s4 = h.n(this.f39387e).s();
            boolean r4 = h.n(this.f39387e).r();
            if (i4 == 1) {
                if (q4) {
                    h.n(this.f39387e).e0(false);
                    h.n(this.f39387e).f0(false);
                    h.n(this.f39387e).g0(false);
                } else {
                    h.n(this.f39387e).e0(true);
                }
            } else if (i4 == 2) {
                if (s4) {
                    h.n(this.f39387e).g0(false);
                } else {
                    h.n(this.f39387e).e0(true);
                    h.n(this.f39387e).g0(true);
                }
            } else if (i4 == 3) {
                if (r4) {
                    h.n(this.f39387e).f0(false);
                } else {
                    h.n(this.f39387e).e0(true);
                    h.n(this.f39387e).f0(true);
                }
            }
            h0();
            return;
        }
        l2.a(this.f39387e).b("设置失败！");
    }
}
