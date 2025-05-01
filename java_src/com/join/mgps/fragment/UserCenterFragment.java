package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.Fragment;
import com.MApplication;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.x1;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.activity.VoucherCodesBoxActivity_;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.AccountUserInfoRequestBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.JumpInfoBean;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.dto.UserCenterBean;
import com.join.mgps.pref.PrefDef_;
import com.wufan.user.service.protobuf.h;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import q.rorbin.badgeview.QBadgeView;
@EFragment(R.layout.fragment_usercenter)
/* loaded from: classes.dex */
public class UserCenterFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f53141b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f53142c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f53143d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f53144e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f53145f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f53146g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f53147h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f53148i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f53149j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f53150k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f53151l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f53152m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    GridView f53153n;

    /* renamed from: o  reason: collision with root package name */
    h f53154o;

    /* renamed from: q  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f53156q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f53157r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.rpc.b f53158s;

    /* renamed from: t  reason: collision with root package name */
    private q.rorbin.badgeview.a f53159t;
    @Pref

    /* renamed from: u  reason: collision with root package name */
    PrefDef_ f53160u;

    /* renamed from: v  reason: collision with root package name */
    com.join.mgps.rpc.e f53161v;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.i f53165z;

    /* renamed from: p  reason: collision with root package name */
    View f53155p = null;

    /* renamed from: w  reason: collision with root package name */
    boolean f53162w = false;

    /* renamed from: x  reason: collision with root package name */
    private List<UserCenterBean.UserCenterItem> f53163x = Collections.synchronizedList(new ArrayList());

    /* renamed from: y  reason: collision with root package name */
    volatile boolean f53164y = false;

    /* loaded from: classes3.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            synchronized (UserCenterFragment.this.f53163x) {
                if (UserCenterFragment.this.f53163x.size() <= 0) {
                    return;
                }
                try {
                    UserCenterBean.UserCenterItem userCenterItem = (UserCenterBean.UserCenterItem) UserCenterFragment.this.f53163x.get(i4);
                    JumpInfoBean jumpInfoBean = userCenterItem.getSub().get(0);
                    int parseInt = Integer.parseInt(jumpInfoBean.getJump_type());
                    int parseInt2 = Integer.parseInt(jumpInfoBean.getLink_type());
                    if (userCenterItem.getMain() != null && userCenterItem.getMain().getLabel() != null) {
                        UserCenterFragment.this.changeMgState(userCenterItem.getMain().getLabel(), parseInt);
                    }
                    if (parseInt2 != 3) {
                        UserCenterFragment.this.gotoTargetActivity(jumpInfoBean, parseInt2);
                    } else if (parseInt == 29) {
                        IntentUtil.getInstance().goMGSettingActivity(UserCenterFragment.this.f53157r);
                    } else if (parseInt == 32) {
                        IntentUtil.getInstance().goCommentSelfListActivity(UserCenterFragment.this.f53157r);
                    } else {
                        switch (parseInt) {
                            case 15:
                                MApplication.Q = 0;
                                UserCenterFragment.this.hideRedPoint();
                                IntentUtil.getInstance().goForumProfileMessageActivity(UserCenterFragment.this.f53157r);
                                break;
                            case 16:
                                IntentUtil.getInstance().goForumMyDynamicActivity(UserCenterFragment.this.getActivity());
                                break;
                            case 17:
                                IntentUtil.getInstance().goForumAndPrfileActivity(0, UserCenterFragment.this.f53157r);
                                break;
                            case 18:
                                UserCenterFragment userCenterFragment = UserCenterFragment.this;
                                userCenterFragment.f53156q = AccountUtil_.getInstance_(userCenterFragment.f53157r).getAccountData();
                                if (!UserCenterFragment.this.goLogin()) {
                                    IntentUtil.getInstance().goPAPayCenterActivity(UserCenterFragment.this.f53157r);
                                    break;
                                }
                                break;
                            case 19:
                                if (!UserCenterFragment.this.goLogin()) {
                                    VoucherCodesBoxActivity_.i0(UserCenterFragment.this.f53157r).b(0).a(UserCenterFragment.this.f53156q.getUid()).start();
                                    break;
                                }
                                break;
                            case 20:
                                UserCenterFragment userCenterFragment2 = UserCenterFragment.this;
                                userCenterFragment2.f53156q = AccountUtil_.getInstance_(userCenterFragment2.f53157r).getAccountData();
                                if (!UserCenterFragment.this.goLogin()) {
                                    VoucherCodesBoxActivity_.i0(UserCenterFragment.this.f53157r).b(1).a(UserCenterFragment.this.f53156q.getUid()).start();
                                    break;
                                }
                                break;
                            case 21:
                                IntentUtil.getInstance().goFaceTransferHomePageActivity(UserCenterFragment.this.f53157r);
                                break;
                            case 22:
                                IntentUtil.getInstance().goJoystickManager(UserCenterFragment.this.f53157r);
                                break;
                            case 23:
                                IntentUtil intentUtil = IntentUtil.getInstance();
                                Activity activity = UserCenterFragment.this.f53157r;
                                intentUtil.goShareWebActivity(activity, com.join.mgps.rpc.h.f54095w + "/Auxiliary_tool");
                                break;
                            case 24:
                                IntentUtil.getInstance().goDownloadSettingActivity(UserCenterFragment.this.f53157r);
                                break;
                            case 25:
                                IntentUtil.getInstance().goFeedback(UserCenterFragment.this.f53157r);
                                break;
                            default:
                                UserCenterFragment.this.gotoTargetActivity(jumpInfoBean, parseInt2);
                                break;
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVip(UserCenterFragment.this.f53157r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goSvip(UserCenterFragment.this.f53157r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UserCenterFragment.this.goLogin()) {
                return;
            }
            CommentSelfListActivity_.P0(view.getContext()).a(UserCenterFragment.this.f53156q.getUid()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UserCenterFragment.this.goLogin()) {
                return;
            }
            CommentSelfListActivity_.P0(view.getContext()).a(UserCenterFragment.this.f53156q.getUid()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UserCenterFragment.this.goLogin()) {
                return;
            }
            CommentSelfListActivity_.P0(view.getContext()).a(UserCenterFragment.this.f53156q.getUid()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVip(UserCenterFragment.this.f53157r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private List<UserCenterBean.UserCenterItem> f53173b;

        /* renamed from: c  reason: collision with root package name */
        private int f53174c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f53175d = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            LinearLayout f53177a;

            /* renamed from: b  reason: collision with root package name */
            View f53178b;

            /* renamed from: c  reason: collision with root package name */
            SimpleDraweeView f53179c;

            /* renamed from: d  reason: collision with root package name */
            TextView f53180d;

            /* renamed from: e  reason: collision with root package name */
            TextView f53181e;

            /* renamed from: f  reason: collision with root package name */
            TextView f53182f;

            a() {
            }
        }

        public h(List<UserCenterBean.UserCenterItem> list) {
            this.f53173b = list;
        }

        public void a(int i4) {
            this.f53175d = !this.f53175d;
            this.f53174c = i4;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f53173b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f53173b.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_usercenter, (ViewGroup) null);
                aVar = new a();
                UserCenterFragment.this.f53155p = aVar.f53179c;
                aVar.f53179c = (SimpleDraweeView) view.findViewById(R.id.iv_module_icon);
                aVar.f53180d = (TextView) view.findViewById(R.id.tv_module_name);
                aVar.f53181e = (TextView) view.findViewById(R.id.tv_module_doings);
                aVar.f53177a = (LinearLayout) view.findViewById(R.id.ll_content);
                aVar.f53178b = view.findViewById(R.id.emptyDivider);
                TextView textView = (TextView) view.findViewById(R.id.messageBadge);
                aVar.f53182f = textView;
                textView.setVisibility(8);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            UserCenterBean.UserCenterItem userCenterItem = this.f53173b.get(i4);
            if (!AccountUtil_.getInstance_(UserCenterFragment.this.f53157r).isTourist()) {
                if (i4 == 0) {
                    if (this.f53174c > 0) {
                        aVar.f53182f.setVisibility(0);
                        if (this.f53174c > 99) {
                            aVar.f53182f.setText("+99");
                        } else {
                            TextView textView2 = aVar.f53182f;
                            textView2.setText("" + this.f53174c);
                        }
                    } else {
                        aVar.f53182f.setVisibility(8);
                    }
                } else {
                    aVar.f53182f.setVisibility(8);
                }
            }
            if (userCenterItem.isEmpty()) {
                aVar.f53178b.setVisibility(0);
                aVar.f53177a.setVisibility(8);
            } else {
                aVar.f53178b.setVisibility(8);
                if (userCenterItem.isPlaceHolder()) {
                    aVar.f53177a.setVisibility(4);
                } else {
                    aVar.f53177a.setVisibility(0);
                }
                if (userCenterItem.getMain() != null) {
                    MyImageLoader.i(aVar.f53179c, userCenterItem.getMain().getPic_remote(), r.c.f11296c);
                    aVar.f53180d.setText(userCenterItem.getMain().getSub_title());
                    aVar.f53181e.setText(userCenterItem.getMain().getLabel());
                }
            }
            return view;
        }
    }

    private void addDivider(List<UserCenterBean.UserCenterItem> list) {
        list.add(createItem());
        list.add(createItem());
        list.add(createItem());
    }

    private void addPlaceHolder(List<UserCenterBean.UserCenterItem> list, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            UserCenterBean.UserCenterItem userCenterItem = new UserCenterBean.UserCenterItem();
            userCenterItem.setPlaceHolder(true);
            list.add(userCenterItem);
        }
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        return accountData != null && g2.i(accountData.getToken());
    }

    private void showRedPoint(View view) {
        MessageRedPointBean.MessagesBean.DataBean dataBean;
        int community_praise_surplus_number;
        if (view == null || (dataBean = MApplication.M) == null || (community_praise_surplus_number = dataBean.getCommunity_praise_surplus_number() + MApplication.M.getCommunity_surplus_number() + MApplication.M.getNotice_surplus_number() + MApplication.M.getPraise_surplus_number() + MApplication.M.getReplay_surplus_number()) <= 0) {
            return;
        }
        try {
            Thread.sleep(200L);
            if (this.f53159t == null) {
                this.f53159t = new QBadgeView(this.f53157r).c(view).q(community_praise_surplus_number).g(SupportMenu.CATEGORY_MASK).v(getResources().getDimensionPixelSize(R.dimen.wdp20), false).o(8388693).l(-1);
            }
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
    }

    private void testAddCommentSelf(List<UserCenterBean.UserCenterItem> list) {
    }

    List<UserCenterBean.UserCenterItem> a0(UserCenterBean userCenterBean) {
        ArrayList arrayList = new ArrayList();
        try {
            List<UserCenterBean.UserCenterItem> first_group = userCenterBean.getFirst_group();
            if (first_group != null) {
                arrayList.addAll(first_group);
                int size = first_group.size() % 3;
                if (size != 0) {
                    size = 3 - size;
                }
                addPlaceHolder(arrayList, size);
                addDivider(arrayList);
            }
            List<UserCenterBean.UserCenterItem> second_group = userCenterBean.getSecond_group();
            if (second_group != null) {
                arrayList.addAll(second_group);
                int size2 = second_group.size() % 3;
                if (size2 != 0) {
                    size2 = 3 - size2;
                }
                addPlaceHolder(arrayList, size2);
                addDivider(arrayList);
            }
            if (userCenterBean.getThird_group() != null) {
                arrayList.addAll(userCenterBean.getThird_group());
                int size3 = userCenterBean.getThird_group().size() % 3;
                if (size3 != 0) {
                    size3 = 3 - size3;
                }
                addPlaceHolder(arrayList, size3);
            }
            return arrayList;
        } catch (Exception e5) {
            e5.printStackTrace();
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        org.greenrobot.eventbus.c.f().t(this);
        this.f53161v = com.join.mgps.rpc.impl.d.P1();
        this.f53165z = com.join.mgps.rpc.impl.g.A0();
        UserCenterBean userCenterBean = (UserCenterBean) JsonMapper.getInstance().fromJson(this.f53160u.userCenterViewConfigsv2().d(), UserCenterBean.class);
        if (userCenterBean != null) {
            this.f53163x.clear();
            this.f53163x.addAll(a0(userCenterBean));
        }
        h hVar = new h(this.f53163x);
        this.f53154o = hVar;
        this.f53153n.setAdapter((ListAdapter) hVar);
        this.f53153n.setOnItemClickListener(new a());
        this.f53154o.notifyDataSetChanged();
        pullMyProfileInfo();
        showNotifUi();
    }

    void calculateVIPExpTime() {
        long y2 = this.f53156q.y() * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = (y2 - currentTimeMillis) / 86400000;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53148i.getLayoutParams();
        if (y2 > currentTimeMillis) {
            layoutParams.topMargin = com.join.mgps.Util.c0.a(this.f53157r, 2.0f);
            this.f53148i.setLayoutParams(layoutParams);
            int i4 = 0;
            this.f53144e.setVisibility(0);
            this.f53148i.setTextColor(Color.parseColor("#FFCC9C"));
            String str = com.join.mgps.Util.y.n(y2) + "到期";
            try {
                i4 = Integer.parseInt(com.join.mgps.Util.y.r(y2));
            } catch (Exception unused) {
            }
            if (j4 > 30) {
                if (i4 > 2037) {
                    this.f53148i.setText("终生会员");
                    return;
                } else {
                    this.f53148i.setText(str);
                    return;
                }
            }
            this.f53148i.setText(Html.fromHtml(str + "\n<font color=#FFFFFF>剩余" + j4 + "天</font>"));
            return;
        }
        layoutParams.topMargin = com.join.mgps.Util.c0.a(this.f53157r, 11.0f);
        this.f53148i.setLayoutParams(layoutParams);
        this.f53144e.setVisibility(8);
        this.f53148i.setTextColor(Color.parseColor("#FFD4A9"));
        this.f53148i.setText("去开通");
        this.f53152m.setOnClickListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeMgState(String str, int i4) {
        if (com.join.android.app.common.utils.j.j(this.f53157r)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f53157r).getAccountData();
                this.f53156q = accountData;
                if (accountData != null && isOfficialAccount()) {
                    if (this.f53161v.W(RequestBeanUtil.getInstance(this.f53157r).getRequestMsgState(this.f53156q.getUid(), str, i4)).getMessages().getData().get(0).isVal()) {
                        com.join.mgps.Util.v0.b("UserCenter", "changeMgState success");
                    } else {
                        com.join.mgps.Util.v0.b("UserCenter", "changeMgState failure");
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    UserCenterBean.UserCenterItem createItem() {
        UserCenterBean.UserCenterItem userCenterItem = new UserCenterBean.UserCenterItem();
        userCenterItem.setEmpty(true);
        return userCenterItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getUserInfo() {
        if (this.f53164y) {
            return;
        }
        this.f53164y = true;
        this.f53156q = AccountUtil_.getInstance_(this.f53157r).getAccountData();
        if (com.join.android.app.common.utils.j.j(this.f53157r)) {
            com.wufan.user.service.protobuf.n0 n0Var = this.f53156q;
            if (n0Var != null && !TextUtils.isEmpty(n0Var.getToken())) {
                try {
                    AccountUserInfoRequestBean accountUserInfoRequestBean = new AccountUserInfoRequestBean();
                    accountUserInfoRequestBean.setUid(this.f53156q.getUid() + "");
                    accountUserInfoRequestBean.setToken(this.f53156q.getToken());
                    accountUserInfoRequestBean.setDevice_id("");
                    accountUserInfoRequestBean.setSign(x1.g(accountUserInfoRequestBean));
                    AccountResultMainBean<AccountBean> d5 = this.f53158s.d(accountUserInfoRequestBean.getParams());
                    if (d5 != null) {
                        if (d5.getError() == 0) {
                            AccountBean data = d5.getData();
                            if (data != null && data.getUid() != 0) {
                                n0.b builder = this.f53156q.toBuilder();
                                builder.j4(data.getSvip_level()).s4(data.getVip_level()).W3(data.getLive_total_charm()).Q3(data.getIs_anchor()).e4(data.getPapaMoney()).k4(data.getSecretKey());
                                if (data.getMember_title() != null) {
                                    h.b g32 = com.wufan.user.service.protobuf.h.g3();
                                    g32.X2(data.getMember_title().getBattleTitle());
                                    g32.b3(data.getLevel());
                                    g32.Z2(data.getMember_title().getBattleTitleColor());
                                    builder.Y3(g32);
                                }
                                if (g2.i(data.getNickname())) {
                                    builder.c4(data.getNickname());
                                }
                                this.f53156q = builder.build();
                            }
                            AccountUtil_.getInstance_(this.f53157r).saveAccountData(this.f53156q, this.f53157r);
                            this.f53164y = false;
                            refreshViews();
                            getViewConfigs();
                            return;
                        } else if (d5.getError() == 701) {
                            tokenFailure();
                            return;
                        } else {
                            this.f53164y = false;
                            getViewConfigs();
                            return;
                        }
                    }
                    this.f53164y = false;
                    getViewConfigs();
                    return;
                } catch (Exception e5) {
                    this.f53164y = false;
                    getViewConfigs();
                    e5.printStackTrace();
                    return;
                }
            }
            touristLogin();
            return;
        }
        this.f53164y = false;
        loadViewConfigsFromLocal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getViewConfigs() {
        Activity activity;
        if (com.join.android.app.common.utils.j.j(this.f53157r)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f53157r).getAccountData();
                this.f53156q = accountData;
                if (accountData == null || (activity = this.f53157r) == null || this.f53162w) {
                    return;
                }
                int i4 = 1;
                this.f53162w = true;
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(activity);
                int uid = this.f53156q.getUid();
                String token = this.f53156q.getToken();
                if (!com.join.mgps.Util.b.piv(this.f53156q)) {
                    i4 = 0;
                }
                ResultMainBean<UserCenterBean> Z0 = this.f53161v.Z0(requestBeanUtil.getUserCenterViewConfigs(uid, token, i4));
                if (Z0 != null && Z0.getCode() == 600) {
                    this.f53160u.userCenterViewConfigs().g(JsonMapper.toJsonString(Z0.getMessages().getData()));
                    loadViewConfigsFromLocal();
                } else {
                    loadViewConfigsFromLocal();
                }
                this.f53162w = false;
                return;
            } catch (Exception e5) {
                this.f53162w = false;
                e5.printStackTrace();
                loadViewConfigsFromLocal();
                return;
            }
        }
        loadViewConfigsFromLocal();
    }

    boolean goLogin() {
        return IntentUtil.getInstance().goLogin(getContext());
    }

    void gotoTargetActivity(JumpInfoBean jumpInfoBean, int i4) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setTpl_type(jumpInfoBean.getTpl_type());
        intentDateBean.setLink_type(i4);
        intentDateBean.setJump_type(Integer.parseInt(jumpInfoBean.getJump_type()));
        intentDateBean.setCrc_link_type_val(jumpInfoBean.getCrc_link_type_val());
        intentDateBean.setLink_type_val(jumpInfoBean.getLink_type_val());
        IntentUtil.getInstance().intentActivity(this.f53157r, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideRedPoint() {
        q.rorbin.badgeview.a aVar = this.f53159t;
        if (aVar != null) {
            aVar.hide(false);
        }
    }

    boolean isActivityFinish() {
        Activity activity = this.f53157r;
        if (activity != null) {
            if (activity.isFinishing()) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 17 && this.f53157r.isDestroyed();
        }
        return false;
    }

    boolean isOfficialAccount() {
        if (AccountUtil_.getInstance_(this.f53157r).getAccountData() == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this.f53157r).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void ll_copper() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54080r);
        ShareWebActivity_.u2(this).b(intentDateBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void loadViewConfigsFromLocal() {
        UserCenterBean userCenterBean;
        try {
            userCenterBean = (UserCenterBean) JsonMapper.getInstance().fromJson(this.f53160u.userCenterViewConfigs().d(), UserCenterBean.class);
        } catch (Exception e5) {
            com.join.mgps.Util.v0.b("UserCenter", "loadViewConfigsFromLocal exception:" + e5.getMessage());
        }
        if (userCenterBean != null && this.f53157r != null) {
            synchronized (this.f53163x) {
                this.f53163x.clear();
                this.f53163x.addAll(a0(userCenterBean));
                this.f53154o.notifyDataSetChanged();
                pullMyProfileInfo();
            }
            showNotifUi();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f53157r = (Activity) context;
        this.f53158s = com.join.mgps.rpc.impl.a.c0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
        this.f53157r = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.r rVar) {
        if (((MGMainActivity) getActivity()).getPositionNum() == 1) {
            pullMyProfileInfo();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refreshUserCenter();
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null) {
            int community_praise_surplus_number = dataBean.getCommunity_praise_surplus_number() + MApplication.M.getCommunity_surplus_number() + MApplication.M.getNotice_surplus_number() + MApplication.M.getPraise_surplus_number() + MApplication.M.getReplay_surplus_number();
            MApplication.Q = community_praise_surplus_number;
            if (community_praise_surplus_number == 0) {
                hideRedPoint();
            } else {
                showNotifUi();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void pullMyProfileInfo() {
        ForumResponse<ForumData.ForumProfilePostsData> k4;
        ForumData.ForumProfilePostsData data;
        ForumBean.ForumProfilePostUserInfoBean user_info;
        if (com.join.android.app.common.utils.j.j(this.f53157r)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f53157r).getAccountData();
                if (accountData == null || accountData.getUid() == 0 || (k4 = this.f53165z.k(accountData.getUid(), accountData.getToken(), 1, 0, "")) == null || (data = k4.getData()) == null || (user_info = data.getUser_info()) == null) {
                    return;
                }
                updateAdapterByNewMsgCount(user_info.getUnread_message());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void refreshUserCenter() {
        if (this.f53157r == null) {
            return;
        }
        refreshViews();
        if (this.f53164y) {
            return;
        }
        getUserInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void refreshViews() {
        Activity activity = this.f53157r;
        if (activity == null) {
            return;
        }
        this.f53156q = AccountUtil_.getInstance_(activity).getAccountData();
        this.f53143d.setText("未登录");
        this.f53141b.getHierarchy().y(new com.facebook.drawee.drawable.n(Color.parseColor("#99BDC9")));
        this.f53141b.setImageResource(R.drawable.unloginstatus);
        this.f53146g.setText("");
        this.f53147h.setText("--");
        this.f53148i.setText("--");
        this.f53149j.setText("---");
        this.f53145f.setText("");
        this.f53145f.setVisibility(8);
        this.f53152m.setOnClickListener(null);
        this.f53151l.setOnClickListener(null);
        com.wufan.user.service.protobuf.n0 n0Var = this.f53156q;
        if (n0Var != null) {
            this.f53143d.setText(n0Var.getNickname());
            MyImageLoader.t(this.f53141b, this.f53156q.d0());
            if (com.join.mgps.Util.b.piv(this.f53156q)) {
                calculateVIPExpTime();
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53148i.getLayoutParams();
                layoutParams.topMargin = com.join.mgps.Util.c0.a(this.f53157r, 11.0f);
                this.f53148i.setLayoutParams(layoutParams);
                this.f53148i.setTextColor(Color.parseColor("#FFD4A9"));
                this.f53148i.setText("去开通");
                this.f53144e.setVisibility(8);
            }
            if (com.join.mgps.Util.b.piv(this.f53156q) && this.f53156q.F2() != null && !TextUtils.isEmpty(this.f53156q.F2().getBattleTitle())) {
                this.f53145f.setVisibility(0);
                this.f53145f.setText(this.f53156q.F2().getBattleTitle());
            }
            if (this.f53156q.n2() == 2) {
                this.f53146g.setTextColor(Color.parseColor("#F47500"));
                this.f53146g.setText("完善资料 / 领礼包 / 抢红包");
                this.f53146g.setTextSize(13.0f);
                this.f53146g.setBackgroundResource(R.drawable.account_msg_bg);
                int a5 = com.join.mgps.Util.c0.a(this.f53157r, 5.0f);
                int a6 = com.join.mgps.Util.c0.a(this.f53157r, 17.0f);
                this.f53146g.setPadding(a6, a5, a6, a5);
            } else {
                this.f53146g.setPadding(0, 0, 0, 0);
                this.f53146g.setBackgroundDrawable(null);
                this.f53146g.setTextSize(14.0f);
                this.f53146g.setTextColor(Color.parseColor("#FFFFFF"));
                this.f53146g.setText(this.f53156q.getAccount());
            }
            TextView textView = this.f53147h;
            textView.setText(this.f53156q.O1() + "");
            if (this.f53156q.j1() == 0) {
                this.f53149j.setTextColor(Color.parseColor("#FFD4A9"));
                this.f53149j.setText("去开通");
            } else {
                this.f53149j.setTextColor(Color.parseColor("#FFFFFF"));
                this.f53149j.setBackgroundResource(R.drawable.bg_border_b65400_100);
                TextView textView2 = this.f53149j;
                textView2.setText("SVIP" + this.f53156q.j1());
            }
        } else {
            this.f53144e.setVisibility(8);
        }
        this.f53152m.setOnClickListener(new b());
        this.f53151l.setOnClickListener(new c());
        this.f53141b.setOnClickListener(new d());
        this.f53142c.setOnClickListener(new e());
        this.f53150k.setOnClickListener(new f());
    }

    public void showNotif() {
        showNotifUi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showNotifUi() {
        View childAt;
        h hVar = this.f53154o;
        if (hVar != null) {
            hVar.a(MApplication.Q);
            this.f53154o.notifyDataSetChanged();
        }
        GridView gridView = this.f53153n;
        if (gridView == null || (childAt = gridView.getChildAt(0)) == null || !(childAt.getTag() instanceof h.a)) {
            return;
        }
        h.a aVar = (h.a) childAt.getTag();
        aVar.f53182f.setVisibility(8);
        if (AccountUtil_.getInstance_(this.f53157r).isTourist() || MApplication.Q <= 0) {
            return;
        }
        aVar.f53182f.setVisibility(0);
        if (MApplication.Q > 99) {
            aVar.f53182f.setText("+99");
            return;
        }
        TextView textView = aVar.f53182f;
        textView.setText("" + MApplication.Q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (isActivityFinish()) {
            return;
        }
        l2.a(this.f53157r).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void tokenFailure() {
        showToast(getString(R.string.pay_token_fail));
        AccountUtil_.getInstance_(this.f53157r).accountLoginOut(this.f53157r);
        touristLogin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void touristLogin() {
        if (com.join.android.app.common.utils.j.j(this.f53157r)) {
            if (isLogined()) {
                return;
            }
            try {
                TouristLoginRequestBean touristLoginRequestBean = new TouristLoginRequestBean();
                touristLoginRequestBean.setVersion(com.join.android.app.common.utils.n.n(this.f53157r).z());
                touristLoginRequestBean.setDevice_id("");
                touristLoginRequestBean.setMac("");
                touristLoginRequestBean.setSource("2");
                touristLoginRequestBean.setTuid(this.f53160u.touriseTUID().d().longValue());
                touristLoginRequestBean.setSign(x1.g(touristLoginRequestBean));
                AccountResultMainBean<AccountTokenSuccess> s4 = this.f53158s.s(touristLoginRequestBean.getParams());
                if (s4 != null && s4.getError() == 0) {
                    if (s4.getData().is_success()) {
                        AccountBean user_info = s4.getData().getUser_info();
                        if (user_info != null) {
                            AccountUtil_.getInstance_(this.f53157r).saveAccountData(b3.a.a(user_info), this.f53157r);
                        }
                        this.f53164y = false;
                        refreshViews();
                        getUserInfo();
                        return;
                    }
                    this.f53164y = false;
                    showToast(s4.getData().getError_msg());
                    loadViewConfigsFromLocal();
                    return;
                }
                this.f53164y = false;
                loadViewConfigsFromLocal();
                return;
            } catch (Exception e5) {
                this.f53164y = false;
                e5.printStackTrace();
                loadViewConfigsFromLocal();
                return;
            }
        }
        this.f53164y = false;
        loadViewConfigsFromLocal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateAdapterByNewMsgCount(int i4) {
        if (i4 < 1 || this.f53157r == null) {
            return;
        }
        synchronized (this.f53163x) {
            int i5 = -1;
            List<UserCenterBean.UserCenterItem> list = this.f53163x;
            if (list == null) {
                return;
            }
            int size = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                UserCenterBean.UserCenterItem userCenterItem = this.f53163x.get(i6);
                if (userCenterItem.getSub() != null) {
                    JumpInfoBean jumpInfoBean = userCenterItem.getSub().get(0);
                    int parseInt = Integer.parseInt(jumpInfoBean.getJump_type());
                    if (Integer.parseInt(jumpInfoBean.getLink_type()) == 3 && parseInt == 15) {
                        i5 = i6;
                        break;
                    }
                }
                i6++;
            }
            if (i5 >= 0) {
                this.f53163x.get(i5).setUnReadCount(i4);
            }
            this.f53154o.notifyDataSetChanged();
            showNotifUi();
        }
    }

    @Receiver(actions = {o1.a.B})
    public void updateInfo(Context context) {
        this.f53156q = AccountUtil_.getInstance_(this.f53157r).getAccountData();
        refreshUserCenter();
    }

    private boolean isLogined() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f53157r).getAccountData();
        return accountData != null && g2.i(accountData.getToken());
    }
}
