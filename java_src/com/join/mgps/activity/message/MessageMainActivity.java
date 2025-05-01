package com.join.mgps.activity.message;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.BaseFragmentActivity;
import com.MApplication;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.widget.MsgView;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dialog.b;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.event.r;
import com.join.mgps.pref.h;
import com.join.mgps.rpc.e;
import com.join.mgps.rpc.impl.d;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_message_main)
/* loaded from: classes.dex */
public class MessageMainActivity extends BaseFragmentActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SlidingTabLayout f39259b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f39260c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ViewPager f39261d;

    /* renamed from: e  reason: collision with root package name */
    e f39262e;

    /* renamed from: f  reason: collision with root package name */
    private n0 f39263f;

    /* renamed from: g  reason: collision with root package name */
    Fragment f39264g;

    /* renamed from: h  reason: collision with root package name */
    NoticeFragment f39265h;

    /* renamed from: i  reason: collision with root package name */
    CommunityFragment f39266i;

    /* renamed from: j  reason: collision with root package name */
    MessagePriaceFragment f39267j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    int f39268k = 0;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    boolean f39269l = false;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    boolean f39270m = false;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    IntentDateBean f39271n;

    /* renamed from: o  reason: collision with root package name */
    Context f39272o;

    /* renamed from: p  reason: collision with root package name */
    private String f39273p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageMainActivity messageMainActivity = MessageMainActivity.this;
            messageMainActivity.f39259b.k(messageMainActivity.f39268k);
            int i4 = MessageMainActivity.this.f39268k;
            if (i4 == 1) {
                MApplication.M.setCommunity_surplus_number(0);
                MessageMainActivity messageMainActivity2 = MessageMainActivity.this;
                if (messageMainActivity2.f39269l) {
                    messageMainActivity2.f39266i.l0();
                }
            } else if (i4 == 2) {
                MApplication.M.setReplay_surplus_number(0);
                MessageMainActivity messageMainActivity3 = MessageMainActivity.this;
                if (messageMainActivity3.f39269l) {
                    messageMainActivity3.f39267j.n0();
                }
            } else if (i4 == 0) {
                MApplication.M.setNotice_surplus_number(0);
                if (MessageMainActivity.this.f39271n != null) {
                    IntentUtil intentUtil = IntentUtil.getInstance();
                    MessageMainActivity messageMainActivity4 = MessageMainActivity.this;
                    intentUtil.intentActivity(messageMainActivity4.f39272o, messageMainActivity4.f39271n);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            MessageMainActivity.this.f39259b.k(i4);
            if (i4 == 0) {
                MessageMainActivity messageMainActivity = MessageMainActivity.this;
                messageMainActivity.f39264g = messageMainActivity.f39265h;
            } else if (i4 == 1) {
                MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
                if (dataBean != null) {
                    dataBean.setCommunity_surplus_number(0);
                }
                MessageMainActivity messageMainActivity2 = MessageMainActivity.this;
                messageMainActivity2.f39264g = messageMainActivity2.f39266i;
            } else if (i4 == 2) {
                MessageRedPointBean.MessagesBean.DataBean dataBean2 = MApplication.M;
                if (dataBean2 != null) {
                    dataBean2.setReplay_surplus_number(0);
                }
                MessageMainActivity messageMainActivity3 = MessageMainActivity.this;
                messageMainActivity3.f39264g = messageMainActivity3.f39267j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.dialog.b f39276a;

        c(com.join.mgps.dialog.b bVar) {
            this.f39276a = bVar;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            if (this.f39276a.c()) {
                h.n(MessageMainActivity.this.f39272o).h0(false);
            }
            this.f39276a.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            if (this.f39276a.c()) {
                h.n(MessageMainActivity.this.f39272o).h0(false);
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 9) {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.join.android.app.mgsim.wufun", null));
            } else if (i4 <= 8) {
                intent.setAction("android.intent.action.VIEW");
                intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                intent.putExtra("com.android.settings.ApplicationPkgName", "com.join.android.app.mgsim.wufun");
            }
            MessageMainActivity.this.startActivity(intent);
            this.f39276a.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f39272o = this;
        org.greenrobot.eventbus.c.f().t(this.f39272o);
        this.f39262e = d.P1();
        this.f39263f = AccountUtil_.getInstance_(this).getAccountData();
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        this.f39265h = new NoticeFragment_();
        this.f39266i = new CommunityFragment_();
        this.f39267j = new MessagePriaceFragment_();
        FragmentPagerAdapter.a aVar = new FragmentPagerAdapter.a("通知", this.f39265h);
        FragmentPagerAdapter.a aVar2 = new FragmentPagerAdapter.a("社区", this.f39266i);
        FragmentPagerAdapter.a aVar3 = new FragmentPagerAdapter.a("点评", this.f39267j);
        arrayList.add(aVar);
        arrayList.add(aVar2);
        arrayList.add(aVar3);
        fragmentPagerAdapter.e(arrayList);
        this.f39261d.setAdapter(fragmentPagerAdapter);
        this.f39261d.setOffscreenPageLimit(3);
        this.f39259b.setViewPager(this.f39261d);
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null) {
            if (dataBean.getNotice_surplus_number() > 0) {
                this.f39259b.q(0, 0);
            }
            if (MApplication.M.getCommunity_surplus_number() > 0 || MApplication.M.getCommunity_praise_surplus_number() > 0) {
                this.f39259b.q(1, 0);
            }
            if (MApplication.M.getReplay_surplus_number() > 0 || MApplication.M.getPraise_surplus_number() > 0) {
                this.f39259b.q(2, 0);
            }
            if (!this.f39270m) {
                if (MApplication.M.getNotice_surplus_number() > 0) {
                    this.f39261d.setCurrentItem(0);
                    MApplication.M.setNotice_surplus_number(0);
                    this.f39259b.k(0);
                } else if (MApplication.M.getCommunity_surplus_number() <= 0 && MApplication.M.getCommunity_praise_surplus_number() <= 0) {
                    if (MApplication.M.getReplay_surplus_number() > 0 || MApplication.M.getPraise_surplus_number() > 0) {
                        this.f39261d.setCurrentItem(2);
                        MApplication.M.setReplay_surplus_number(0);
                        this.f39259b.k(2);
                    }
                } else {
                    this.f39261d.setCurrentItem(1);
                    MApplication.M.setCommunity_surplus_number(0);
                    this.f39259b.k(1);
                }
            }
        }
        MsgView i4 = this.f39259b.i(2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i4.getLayoutParams();
        marginLayoutParams.height = 10;
        marginLayoutParams.width = 10;
        i4.setLayoutParams(marginLayoutParams);
        MsgView i5 = this.f39259b.i(1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i5.getLayoutParams();
        marginLayoutParams2.height = 10;
        marginLayoutParams2.width = 10;
        i5.setLayoutParams(marginLayoutParams2);
        MsgView i6 = this.f39259b.i(0);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) i6.getLayoutParams();
        marginLayoutParams3.height = 10;
        marginLayoutParams3.width = 10;
        i6.setLayoutParams(marginLayoutParams3);
        if (this.f39270m) {
            this.f39261d.setCurrentItem(this.f39268k);
            new Handler().postDelayed(new a(), 500L);
        }
        this.f39261d.addOnPageChangeListener(new b());
        if (!h.n(this.f39272o).t() || NotificationManagerCompat.from(this.f39272o).areNotificationsEnabled()) {
            return;
        }
        com.join.mgps.dialog.b bVar = new com.join.mgps.dialog.b(this.f39272o, R.style.HKDialogLoading);
        bVar.k("请开启通知权限");
        bVar.g("第一时间收到重要消息及互动回复。");
        bVar.d("取消");
        bVar.j("去开启");
        bVar.f(0);
        bVar.i(new c(bVar));
        bVar.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null) {
            if (dataBean.getNotice_surplus_number() > 0) {
                this.f39259b.q(0, 0);
            }
            if (MApplication.M.getCommunity_surplus_number() > 0 || MApplication.M.getCommunity_praise_surplus_number() > 0) {
                this.f39259b.q(1, 0);
            }
            if (MApplication.M.getReplay_surplus_number() > 0 || MApplication.M.getPraise_surplus_number() > 0) {
                this.f39259b.q(2, 0);
            }
        }
        if (this.f39273p.equals("1")) {
            this.f39265h.f39417n = true;
            if (this.f39261d.getCurrentItem() == 0) {
                this.f39259b.k(0);
                MApplication.M.setNotice_surplus_number(0);
                NoticeFragment noticeFragment = this.f39265h;
                noticeFragment.f39414k = 1;
                noticeFragment.a0();
            }
        } else if (this.f39273p.equals("2")) {
            this.f39266i.f39146u = true;
            if (this.f39261d.getCurrentItem() == 1) {
                this.f39259b.k(1);
                MApplication.M.setCommunity_surplus_number(0);
                CommunityFragment communityFragment = this.f39266i;
                communityFragment.f39137l = 1;
                communityFragment.Z();
            }
        } else if (this.f39273p.equals("3")) {
            this.f39267j.f39308t = true;
            if (this.f39261d.getCurrentItem() == 2) {
                this.f39259b.k(2);
                MApplication.M.setReplay_surplus_number(0);
                MessagePriaceFragment messagePriaceFragment = this.f39267j;
                messagePriaceFragment.f39301m = 1;
                messagePriaceFragment.a0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        MessageSettingActivity_.s0(this.f39272o).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        j.j(this.f39272o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getRedPointData() {
        n0 accountData;
        if (!j.j(this.f39272o) || (accountData = AccountUtil_.getInstance_(this.f39272o).getAccountData()) == null || accountData.getUid() == 0 || AccountUtil_.getInstance_(this.f39272o).isTourist()) {
            return;
        }
        try {
            MessageRedPointBean H1 = this.f39262e.H1(RequestBeanUtil.getInstance(this.f39272o).getGRedPointNum(accountData.getUid()));
            if (H1 == null || H1.getMessages() == null || H1.getMessages().getData() == null) {
                return;
            }
            MessageRedPointBean.MessagesBean.DataBean data = H1.getMessages().getData();
            MApplication.M = data;
            int community_praise_surplus_number = data.getCommunity_praise_surplus_number() + MApplication.M.getCommunity_surplus_number() + MApplication.M.getNotice_surplus_number() + MApplication.M.getPraise_surplus_number() + MApplication.M.getReplay_surplus_number();
            MApplication.Q = community_praise_surplus_number;
            if (community_praise_surplus_number > 0) {
                f0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this.f39272o);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(r rVar) {
        this.f39273p = rVar.f49935a;
        getRedPointData();
    }
}
