package com.join.mgps.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.MApplication;
import com.beizi.fusion.widget.TwistView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.a0;
import com.join.mgps.activity.MyGamePapaFragment;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.adapter.o2;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.broadcast.NetBroadcastReceiver;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.m;
import com.join.mgps.customview.q;
import com.join.mgps.customview.u;
import com.join.mgps.customview.v;
import com.join.mgps.customview.x;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameSortBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.RecommendGameAdInfo;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.ShortcutReceiver;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EFragment(R.layout.fragment_my_game_v1)
/* loaded from: classes.dex */
public class MyGamePapaFragment extends BaseLoadingFragment implements o2.e, AbsListView.OnScrollListener {
    public static final String Z = "网游";

    /* renamed from: p0  reason: collision with root package name */
    public static final String f35783p0 = "单机";

    /* renamed from: p1  reason: collision with root package name */
    public static final String f35784p1 = "对战";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f35785v1 = "全部游戏";
    private OnlineCouponConfigBean G;
    long H;
    com.join.mgps.rpc.e I;
    @Pref
    PrefDef_ J;
    private RecommendGameAdInfo K;
    private DownloadTask L;
    String P;
    com.join.mgps.customview.u Q;
    DataGameListBean U;
    private NetBroadcastReceiver Y;

    /* renamed from: c  reason: collision with root package name */
    private Context f35786c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f35787d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f35788e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f35789f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f35790g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35791h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f35792i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f35793j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f35794k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f35795l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f35796m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f35797n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f35798o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    View f35799p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    View f35800q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f35801r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    WrapContentGridView f35802s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f35803t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f35804u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    ImageView f35805v;

    /* renamed from: w  reason: collision with root package name */
    g f35806w;

    /* renamed from: x  reason: collision with root package name */
    com.join.mgps.adapter.o2 f35807x;

    /* renamed from: y  reason: collision with root package name */
    List<String> f35808y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    List<String> f35809z = new ArrayList();
    HashMap<String, Boolean> A = new HashMap<>();
    HashMap<String, Boolean> B = new HashMap<>();
    private List<DownloadTask> C = new ArrayList();
    private int D = 0;
    com.join.mgps.pref.f E = null;
    private boolean F = false;
    private boolean M = false;
    private boolean N = true;
    private int O = 0;
    private List<String> R = new ArrayList();
    private int S = 0;
    private int T = 0;
    private List<CollectionBeanSubBusiness> V = new ArrayList();
    private List<CollectionBeanSubBusiness> W = new ArrayList();
    long X = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Comparator<DownloadTask> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DownloadTask downloadTask, DownloadTask downloadTask2) {
            if (b(downloadTask.getStatus())) {
                return (!b(downloadTask2.getStatus()) || downloadTask2.getStartTime() <= downloadTask.getStartTime()) ? -1 : 1;
            } else if (b(downloadTask2.getStatus())) {
                return 1;
            } else {
                if (c(downloadTask.getStatus()) && !d(downloadTask)) {
                    return (!c(downloadTask2.getStatus()) || d(downloadTask2) || downloadTask2.getFinishTime() <= downloadTask.getFinishTime()) ? -1 : 1;
                } else if (!c(downloadTask2.getStatus()) || d(downloadTask2)) {
                    return c(downloadTask.getStatus()) ? (!c(downloadTask2.getStatus()) || downloadTask2.getOpenTime() < downloadTask.getOpenTime()) ? -1 : 1 : c(downloadTask2.getStatus()) ? 1 : 0;
                } else {
                    return 1;
                }
            }
        }

        boolean b(int i4) {
            return i4 == 2 || i4 == 3 || i4 == 12 || i4 == 13 || i4 == 36 || i4 == 11 || i4 == 6 || i4 == 10 || i4 == 48;
        }

        boolean c(int i4) {
            return i4 == 5 || e(i4);
        }

        boolean d(DownloadTask downloadTask) {
            return downloadTask.isOpen();
        }

        boolean e(int i4) {
            return i4 == 9;
        }
    }

    /* loaded from: classes4.dex */
    class b implements x.a {
        b() {
        }

        @Override // com.join.mgps.customview.x.a
        public void a() {
            IntentUtil.getInstance().goDownloadSettingActivity(MyGamePapaFragment.this.getContext());
        }

        @Override // com.join.mgps.customview.x.a
        public void b() {
            MyGamePapaFragment.this.s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35813b;

        c(String str, DownloadTask downloadTask) {
            this.f35812a = str;
            this.f35813b = downloadTask;
        }

        @Override // com.join.mgps.customview.v.a
        public void a(String str) {
            DownloadTask F = p1.f.K().F(this.f35812a);
            boolean z4 = false;
            if (F == null) {
                IntentUtil.getInstance().goGameDetialActivity(MyGamePapaFragment.this.f35786c, this.f35812a, 0);
                return;
            }
            if (com.join.mgps.Util.g2.i(F.getMod_info())) {
                ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(F.getMod_info(), ModInfoBean.class);
                DownloadTask F2 = modInfoBean != null ? p1.f.K().F(modInfoBean.getMain_game_id()) : null;
                if (F2 == null) {
                    F.setCrc_link_type_val(modInfoBean.getMain_game_id());
                } else {
                    F = F2;
                }
            }
            F.set_from_type(127);
            if (F.getSp_tag_info() != null && F.getSp_tag_info().getOut_game() != null) {
                z4 = true;
            }
            if ((TextUtils.isEmpty(F.getFileType()) || !F.getFileType().equals(Dtype.chajian.name())) && !z4) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(MyGamePapaFragment.this.getContext(), F);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void b(String str) {
            MyGamePapaFragment.this.x1(p1.f.K().F(str));
        }

        @Override // com.join.mgps.customview.v.a
        public void c(String str) {
            if (p1.f.K().F(this.f35812a) == null) {
                MyGamePapaFragment.this.a1(this.f35813b);
            } else {
                MyGamePapaFragment.this.c1(str);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void d(String str) {
            new com.join.mgps.customview.n(MyGamePapaFragment.this.getContext()).a(MyGamePapaFragment.this.f35797n, str);
        }

        @Override // com.join.mgps.customview.v.a
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35815b;

        d(boolean z4) {
            this.f35815b = z4;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            if (response != null) {
                try {
                    ResponseModel<DataGameListBean> body = response.body();
                    if (body != null && body.getData() != null && this.f35815b) {
                        MyGamePapaFragment.this.U = body.getData();
                        MyGamePapaFragment.this.W.clear();
                        List<GamedownRecomendItemBean> recommendList = body.getData().getRecommendList();
                        if (recommendList != null) {
                            for (int i4 = 0; i4 < recommendList.size() && i4 < 6; i4++) {
                                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(recommendList.get(i4));
                                collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
                                MyGamePapaFragment.this.W.add(collectionBeanSubBusiness);
                            }
                            if (MyGamePapaFragment.this.C == null || MyGamePapaFragment.this.C.size() == 0) {
                                MyGamePapaFragment.this.X0();
                            }
                        }
                        List<GamedownRecomendItemBean> gameList = body.getData().getGameList();
                        if (gameList != null && gameList.size() > 0) {
                            MyGamePapaFragment.this.z1(gameList);
                        }
                    }
                    RecommendGameAdInfo recAd = body.getData().getRecAd();
                    if (recAd != null) {
                        MyGamePapaFragment.this.K = recAd;
                        MyGamePapaFragment.this.X0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements NetBroadcastReceiver.a {
        e() {
        }

        @Override // com.join.mgps.broadcast.NetBroadcastReceiver.a
        public void a(int i4) {
            if (MyGamePapaFragment.this.V == null || MyGamePapaFragment.this.V.size() == 0 || !(MyGamePapaFragment.this.C == null || MyGamePapaFragment.this.D == MyGamePapaFragment.this.C.size())) {
                if (MyGamePapaFragment.this.C != null) {
                    MyGamePapaFragment myGamePapaFragment = MyGamePapaFragment.this;
                    myGamePapaFragment.D = myGamePapaFragment.C.size();
                }
                MyGamePapaFragment.this.E0(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements a0.n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f35818a;

        f(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f35818a = onlineCouponConfigBean;
        }

        @Override // com.join.mgps.Util.a0.n0
        public boolean a(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            return false;
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onCancel() {
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onDismiss() {
            if (!this.f35818a.isTabSwitch() || MyGamePapaFragment.this.F) {
                return;
            }
            MyGamePapaFragment.this.f35804u.setText(this.f35818a.getTabHint());
            MyGamePapaFragment.this.f35803t.setVisibility(0);
            com.papa.sim.statistic.p.l(MyGamePapaFragment.this.f35786c).Q1(Event.tabStartViewSuccessTips, AccountUtil_.getInstance_(MyGamePapaFragment.this.f35786c).getAccountData().getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            CollectionBeanSubBusiness f35821b;

            public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                this.f35821b = collectionBeanSubBusiness;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                DownloadTask downloadTask = this.f35821b.getDownloadTask();
                if (downloadTask == null) {
                    if (UtilsMy.o0(this.f35821b.getTag_info())) {
                        if (this.f35821b.getMod_info() == null) {
                            if (com.join.android.app.common.utils.e.l0(context).d(context, this.f35821b.getPackage_name())) {
                                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, this.f35821b.getPackage_name());
                                if (!com.join.mgps.Util.g2.i(this.f35821b.getVer()) || l4.d() >= Integer.parseInt(this.f35821b.getVer())) {
                                    com.join.android.app.common.utils.e.l0(context);
                                    APKUtils.a0(context, this.f35821b.getPackage_name());
                                    return;
                                }
                            }
                        } else {
                            boolean d5 = com.join.android.app.common.utils.e.l0(context).d(context, this.f35821b.getPackage_name());
                            boolean F = com.join.mgps.va.overmind.d.o().F(this.f35821b.getPackage_name());
                            if (d5 || F) {
                                com.join.android.app.common.utils.e.l0(context);
                                APKUtils.V(context, this.f35821b.getMod_info());
                                return;
                            }
                        }
                    }
                    UtilsMy.Y0(context, this.f35821b);
                    return;
                }
                if (com.join.mgps.Util.g2.i(this.f35821b.getPlugin_num())) {
                    String plugin_num = this.f35821b.getPlugin_num();
                    if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                        IntentDateBean intentDateBean = new IntentDateBean();
                        intentDateBean.setLink_type(4);
                        intentDateBean.setLink_type_val(this.f35821b.getDown_url_remote());
                        UtilsMy.T2(downloadTask, context);
                        IntentUtil.getInstance().intentActivity(context, intentDateBean);
                        return;
                    }
                }
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(this.f35821b.getPay_tag_info(), this.f35821b.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status != 13) {
                        if (status != 2) {
                            if (status != 3) {
                                if (status == 5) {
                                    UtilsMy.T3(context, downloadTask);
                                    return;
                                } else if (status != 6) {
                                    if (status != 7) {
                                        if (status == 42) {
                                            if (!com.join.android.app.common.utils.j.j(context)) {
                                                com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.r4(context, downloadTask);
                                                return;
                                            }
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(context)) {
                                                        com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                        return;
                                                    } else {
                                                        UtilsMy.I2(context, downloadTask);
                                                        return;
                                                    }
                                                case 10:
                                                    break;
                                                case 11:
                                                    UtilsMy.a4(downloadTask, context);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            com.php25.PDownload.d.c(downloadTask, context);
                            return;
                        }
                        com.php25.PDownload.d.i(downloadTask);
                        return;
                    }
                    com.php25.PDownload.d.l(context, downloadTask);
                    return;
                }
                UtilsMy.Y0(context, this.f35821b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f35823a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f35824b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f35825c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f35826d;

            b() {
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(CollectionBeanSubBusiness collectionBeanSubBusiness, View view) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), collectionBeanSubBusiness.getGame_id(), collectionBeanSubBusiness.getGame_info_tpl_type(), collectionBeanSubBusiness.getSp_tpl_two_position(), 0);
        }

        void c(TextView textView, View view, int i4, PayTagInfo payTagInfo, String str) {
            view.setEnabled(true);
            textView.setTextColor(-12802819);
            boolean z4 = UtilsMy.w0(payTagInfo, str) > 0;
            if (i4 == 3 && !z4) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setTextSize(2, 12.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            } else if (i4 == 2 && !z4) {
                textView.setText("即将开放");
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
                textView.setTextColor(-7763575);
                view.setEnabled(false);
                textView.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                if (payTagInfo == null || payTagInfo.getAmount_check() <= 0) {
                    textView.setText(textView.getResources().getString(R.string.download_status_download));
                } else {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, payTagInfo.getPayGameAmount()));
                }
                textView.setTextSize(2, 13.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[Catch: Exception -> 0x03de, TRY_LEAVE, TryCatch #0 {Exception -> 0x03de, blocks: (B:3:0x0006, B:4:0x0019, B:6:0x0023, B:11:0x0039, B:13:0x0060, B:17:0x008e, B:19:0x0098, B:21:0x00a6, B:23:0x00b4, B:25:0x00ca, B:27:0x00d8, B:28:0x00f1, B:29:0x0112, B:30:0x0129, B:31:0x0140, B:55:0x017c, B:56:0x01b9, B:57:0x01f9, B:58:0x0214, B:59:0x0255, B:60:0x026e, B:61:0x0298, B:68:0x0309, B:69:0x030e, B:71:0x0337, B:72:0x035c, B:73:0x0380, B:74:0x039d, B:75:0x03a5, B:86:0x03d6, B:9:0x0034, B:62:0x02b4, B:64:0x02be, B:65:0x02e3), top: B:91:0x0006, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d(com.join.mgps.activity.MyGamePapaFragment.g.b r17, com.join.mgps.business.CollectionBeanSubBusiness r18) {
            /*
                Method dump skipped, instructions count: 1010
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaFragment.g.d(com.join.mgps.activity.MyGamePapaFragment$g$b, com.join.mgps.business.CollectionBeanSubBusiness):void");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (MyGamePapaFragment.this.W == null) {
                return 0;
            }
            return Math.min(9, MyGamePapaFragment.this.W.size());
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            if (MyGamePapaFragment.this.W == null) {
                return null;
            }
            return MyGamePapaFragment.this.W.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view != null) {
                bVar = (b) view.getTag();
            } else {
                b bVar2 = new b();
                View inflate = LayoutInflater.from(MyGamePapaFragment.this.getContext()).inflate(R.layout.fragment_my_game_no_game_item, viewGroup, false);
                bVar2.f35823a = (SimpleDraweeView) inflate.findViewById(R.id.icon);
                bVar2.f35824b = (TextView) inflate.findViewById(R.id.name);
                bVar2.f35825c = (TextView) inflate.findViewById(R.id.size);
                bVar2.f35826d = (TextView) inflate.findViewById(R.id.install);
                inflate.setTag(bVar2);
                bVar = bVar2;
                view = inflate;
            }
            if (getItem(i4) == null) {
                return view;
            }
            final CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
            MyImageLoader.h(bVar.f35823a, collectionBeanSubBusiness.getIco_remote());
            bVar.f35824b.setText(collectionBeanSubBusiness.getGame_name());
            bVar.f35825c.setText(UtilsMy.a(TextUtils.isEmpty(collectionBeanSubBusiness.getSize()) ? 0L : (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d)));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.c2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MyGamePapaFragment.g.b(CollectionBeanSubBusiness.this, view2);
                }
            });
            UtilsMy.d3(bVar.f35826d, collectionBeanSubBusiness);
            bVar.f35826d.setOnClickListener(new a(new CollectionBeanSubBusiness(collectionBeanSubBusiness)));
            d(bVar, collectionBeanSubBusiness);
            return view;
        }
    }

    private void A0(CommonGameInfoBean commonGameInfoBean) {
        XListView2 xListView2;
        if (this.M || (xListView2 = this.f35788e) == null || xListView2.getVisibility() != 0) {
            return;
        }
        this.M = true;
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("207");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    private void B1(OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        com.join.mgps.Util.b0.f0(this.f35786c).W(this.f35786c, onlineCouponConfigBean, i4, new f(onlineCouponConfigBean));
        com.papa.sim.statistic.p.l(this.f35786c).Q1(Event.tabStartSuccessUpRedBag, AccountUtil_.getInstance_(this.f35786c).getAccountData().getUid());
    }

    private List<DownloadTask> C0() {
        if (TextUtils.isEmpty(this.P)) {
            return new ArrayList();
        }
        String str = this.P;
        if (com.join.mgps.Util.g2.i(str) && str.equals("全部游戏")) {
            TextView textView = this.f35795l;
            if (textView != null) {
                textView.setText("全部游戏");
            }
            return this.C;
        }
        ArrayList arrayList = new ArrayList();
        List<DownloadTask> list = this.C;
        if (list != null) {
            for (DownloadTask downloadTask : list) {
                if (U0(str, downloadTask)) {
                    arrayList.add(downloadTask);
                }
            }
        }
        return arrayList;
    }

    private void F0() {
        Bundle bundle = new Bundle();
        bundle.putInt("localType", 2);
        com.join.mgps.pref.f fVar = this.E;
        if (fVar != null) {
            fVar.callOnlineCoupon(bundle);
        }
        this.f35803t.setVisibility(8);
    }

    private void F1() {
    }

    private void G1() {
        DownloadTask downloadTask;
        View childAt;
        if (this.T < 0 || this.S >= this.f35788e.getCount()) {
            return;
        }
        for (int i4 = this.T; i4 <= this.S; i4++) {
            if (this.f35788e.getAdapter().getItemViewType(i4) == 2 && this.f35788e.getItemAtPosition(i4) != null && (this.f35788e.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f35788e.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f35788e.getChildAt(i4 - this.T)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
                o2.h hVar = (o2.h) childAt.getTag();
                try {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                    if (f5 == null) {
                        return;
                    }
                    String str = "";
                    if (!TextUtils.isEmpty(f5.getShowSize())) {
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        str = downloadTask.getSize() == 0 ? UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble) : UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble);
                    }
                    if (downloadTask.getStatus() == 12) {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    } else {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    }
                    if (downloadTask.getStatus() == 2) {
                        hVar.f45060c.setText(str + " · " + f5.getSpeed() + "/S");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private boolean J0(List<CommonGameInfoBean> list, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        if (list != null && collectionBeanSubBusiness != null) {
            for (CommonGameInfoBean commonGameInfoBean : list) {
                if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && TextUtils.equals(commonGameInfoBean.getG_info().getId(), collectionBeanSubBusiness.getGame_id())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean K0(List<o2.f> list) {
        if (list != null && this.L != null) {
            for (o2.f fVar : list) {
                if ((fVar.a() instanceof DownloadTask) && TextUtils.equals(((DownloadTask) fVar.a()).getCrc_link_type_val(), this.L.getCrc_link_type_val())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0() {
        this.E.callbackHome(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(String str) {
        this.P = str;
        this.f35795l.setText(str);
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0() {
        this.f35794k.setRotation(0.0f);
        E1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(boolean z4, String str, boolean z5, String str2) {
        if (z4) {
            z0(str);
        }
        if (z5) {
            y0(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(DownloadTask downloadTask, String str) {
        if ((APKUtils.L(downloadTask) && com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) || (com.join.mgps.Util.q1.f(downloadTask.getPackageName()) && com.join.mgps.va.overmind.d.o().O() && com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()))) {
            z0(str);
        } else {
            y0(str);
        }
    }

    private void W0(CommonGameInfoBean commonGameInfoBean) {
        WrapContentGridView wrapContentGridView = this.f35802s;
        if (wrapContentGridView == null || wrapContentGridView.getVisibility() != 0) {
            return;
        }
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("208");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    private void f1(DownloadTask downloadTask) {
        DownloadTask downloadTask2;
        List<CollectionBeanSubBusiness> list;
        loadData();
        Iterator<DownloadTask> it2 = this.C.iterator();
        while (true) {
            if (!it2.hasNext()) {
                downloadTask2 = null;
                break;
            }
            downloadTask2 = it2.next();
            if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                downloadTask2.setStatus(0);
                it2.remove();
                break;
            }
        }
        if (downloadTask != null && (list = this.W) != null && list.size() > 0) {
            Iterator<CollectionBeanSubBusiness> it3 = this.W.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                CollectionBeanSubBusiness next = it3.next();
                if (next.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    next.setDownloadTask(null);
                    break;
                }
            }
        }
        this.f35806w.notifyDataSetChanged();
        H1(downloadTask2);
        j1();
        X0();
    }

    private void g1(DownloadTask downloadTask) {
        List<DownloadTask> list = this.C;
        if (list == null || downloadTask == null) {
            return;
        }
        DownloadTask downloadTask2 = null;
        try {
            Iterator<DownloadTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (!TextUtils.isEmpty(next.getCrc_link_type_val()) && next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    UtilsMy.x4(next);
                    downloadTask2 = next;
                    break;
                }
            }
            H1(downloadTask2);
            X0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        j1();
        X0();
    }

    private void h1(DownloadTask downloadTask) {
        boolean z4;
        ModInfoBean modInfoBean;
        if (downloadTask == null) {
            return;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            X0();
            return;
        }
        UtilsMy.A4(this.C);
        Iterator<DownloadTask> it2 = this.C.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z5 = false;
                break;
            }
            DownloadTask next = it2.next();
            if (!com.join.mgps.Util.g2.i(next.getMod_info()) ? !(TextUtils.isEmpty(next.getCrc_link_type_val()) || !next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) : !((modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(next.getMod_info(), ModInfoBean.class)) == null || TextUtils.isEmpty(next.getCrc_link_type_val()) || !(next.getCrc_link_type_val().equals(modInfoBean.getMod_game_id()) || next.getCrc_link_type_val().equals(modInfoBean.getMain_game_id())))) {
                z4 = false;
                continue;
            } else {
                z4 = true;
                continue;
            }
            if (z4) {
                break;
            }
        }
        if (!z5) {
            this.C.add(0, downloadTask);
        }
        loadData();
        j1();
        X0();
    }

    private void i1(DownloadTask downloadTask) {
        if (this.C == null || downloadTask == null) {
            return;
        }
        if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.C.size()) {
                    downloadTask = null;
                    break;
                }
                DownloadTask downloadTask2 = this.C.get(i4);
                if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.C.set(i4, downloadTask);
                    break;
                }
                i4++;
            }
            H1(downloadTask);
            loadData();
            j1();
            X0();
            l1();
        }
    }

    private Bitmap r1(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(((e0.c) Fresco.getImagePipelineFactory().l().c(new com.facebook.cache.common.i(Uri.parse(str).toString()))).c().getPath());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void s0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("s:");
        sb.append(str);
        DownloadTask F = p1.f.K().F(str);
        if (F != null) {
            Bitmap m4 = ImageLoader.q().m(F.getPortraitURL());
            if (m4 == null) {
                m4 = r1(F.getPortraitURL());
            }
            com.join.mgps.Util.w1.c(getActivity(), F.getShowName(), str, m4);
        }
    }

    private CollectionBeanSubBusiness w0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return null;
        }
        GInfoBean g_info = commonGameInfoBean.getG_info();
        CollectionBeanSub collectionBeanSub = new CollectionBeanSub();
        collectionBeanSub.setGame_name(g_info.getName());
        collectionBeanSub.setIco_remote(TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
        collectionBeanSub.setSize(g_info.getApp_size());
        collectionBeanSub.setGame_id(g_info.getId());
        collectionBeanSub.setGame_info_tpl_type(g_info.getGame_info_tpl_type());
        collectionBeanSub.setSp_tpl_two_position(g_info.getSp_tpl_two_position());
        collectionBeanSub.set_from(commonGameInfoBean.get_from());
        collectionBeanSub.set_from_type(commonGameInfoBean.get_from_type());
        return new CollectionBeanSubBusiness(collectionBeanSub);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A1() {
        a0();
        try {
            View view = this.f35793j;
            if (view != null) {
                view.setVisibility(0);
            }
            XListView2 xListView2 = this.f35788e;
            if (xListView2 != null) {
                xListView2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.Q == null) {
            com.join.mgps.customview.u uVar = new com.join.mgps.customview.u(getContext());
            this.Q = uVar;
            uVar.k(new u.d() { // from class: com.join.mgps.activity.b2
                @Override // com.join.mgps.customview.u.d
                public final void a(String str) {
                    MyGamePapaFragment.this.P0(str);
                }
            });
            this.Q.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.join.mgps.activity.x1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MyGamePapaFragment.this.Q0();
                }
            });
            this.Q.setWidth(-1);
        }
        this.f35789f.setVisibility(8);
        this.Q.m(this.f35787d, this.f35809z, this.P);
        this.f35794k.setRotation(180.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C1() {
        try {
            a0();
            View view = this.f35793j;
            if (view != null) {
                view.setVisibility(8);
            }
            XListView2 xListView2 = this.f35788e;
            if (xListView2 != null) {
                xListView2.setVisibility(0);
            }
            this.P = this.f35809z.get(0);
            X0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0() {
        List<GameSortBean> data;
        try {
            ResultMainBean<List<GameSortBean>> B0 = this.I.B0(RequestBeanUtil.getInstance(this.f35786c).getGameSortRequestBean(com.join.android.app.common.utils.n.n(this.f35786c.getApplicationContext()).z(), ""));
            if (B0 != null && B0.getFlag() == 1 && B0.getMessages() != null && (data = B0.getMessages().getData()) != null && data.size() > 0) {
                this.f35808y.clear();
                for (GameSortBean gameSortBean : data) {
                    if (gameSortBean.getName().contains("单机")) {
                        this.f35808y.add("单机");
                    } else {
                        this.f35808y.add(gameSortBean.getName());
                    }
                }
            }
            this.J.myGameAllTabSort().g(JsonMapper.getInstance().toJson(this.f35808y));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void D1() {
        if (this.Y != null) {
            getContext().unregisterReceiver(this.Y);
        }
    }

    void E0(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z4 || currentTimeMillis - this.X >= com.join.mgps.data.c.f49010a) {
            this.X = currentTimeMillis;
            try {
                if (com.join.android.app.common.utils.j.j(getContext())) {
                    String uid = AccountUtil_.getInstance_(this.f35786c).getUid();
                    String token = AccountUtil_.getInstance_(this.f35786c).getToken();
                    if (TextUtils.isEmpty(uid)) {
                        uid = "";
                    }
                    if (TextUtils.isEmpty(token)) {
                        token = "";
                    }
                    RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                    requestModel.setDefault(this.f35786c);
                    QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                    queryDownloadInfoRequestArgs.setGameId("0");
                    queryDownloadInfoRequestArgs.setDataType("1");
                    queryDownloadInfoRequestArgs.setUid(uid);
                    queryDownloadInfoRequestArgs.setToken(token);
                    requestModel.setArgs(queryDownloadInfoRequestArgs);
                    com.join.mgps.rpc.impl.i.D0().B0().i1(requestModel).enqueue(new d(z4));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void E1() {
        com.join.mgps.customview.u uVar = this.Q;
        if (uVar != null && uVar.isShowing()) {
            this.f35789f.setVisibility(8);
            return;
        }
        List<DownloadTask> O = p1.f.K().O();
        if (O != null && O.size() > 0) {
            this.f35789f.setVisibility(0);
            DownloadTask downloadTask = O.get(0);
            TextView textView = this.f35790g;
            textView.setText(G0(downloadTask) + "插件正在下载中");
            TextView textView2 = this.f35791h;
            textView2.setText(downloadTask.getProgress() + "%");
            return;
        }
        this.f35789f.setVisibility(8);
    }

    String G0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return "";
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        StringBuilder sb = new StringBuilder();
        ConstantIntEnum constantIntEnum = ConstantIntEnum.FBA;
        sb.append(constantIntEnum.value());
        sb.append("");
        simpleArrayMap.put(sb.toString(), constantIntEnum.nickName());
        StringBuilder sb2 = new StringBuilder();
        ConstantIntEnum constantIntEnum2 = ConstantIntEnum.FC;
        sb2.append(constantIntEnum2.value());
        sb2.append("");
        simpleArrayMap.put(sb2.toString(), constantIntEnum2.nickName());
        StringBuilder sb3 = new StringBuilder();
        ConstantIntEnum constantIntEnum3 = ConstantIntEnum.GBA;
        sb3.append(constantIntEnum3.value());
        sb3.append("");
        simpleArrayMap.put(sb3.toString(), constantIntEnum3.nickName());
        StringBuilder sb4 = new StringBuilder();
        ConstantIntEnum constantIntEnum4 = ConstantIntEnum.PSP;
        sb4.append(constantIntEnum4.value());
        sb4.append("");
        simpleArrayMap.put(sb4.toString(), constantIntEnum4.nickName());
        StringBuilder sb5 = new StringBuilder();
        ConstantIntEnum constantIntEnum5 = ConstantIntEnum.NDS;
        sb5.append(constantIntEnum5.value());
        sb5.append("");
        simpleArrayMap.put(sb5.toString(), constantIntEnum5.nickName());
        StringBuilder sb6 = new StringBuilder();
        ConstantIntEnum constantIntEnum6 = ConstantIntEnum.PS2;
        sb6.append(constantIntEnum6.value());
        sb6.append("");
        simpleArrayMap.put(sb6.toString(), constantIntEnum6.nickName());
        StringBuilder sb7 = new StringBuilder();
        ConstantIntEnum constantIntEnum7 = ConstantIntEnum.N3DS;
        sb7.append(constantIntEnum7.value());
        sb7.append("");
        simpleArrayMap.put(sb7.toString(), constantIntEnum7.nickName());
        StringBuilder sb8 = new StringBuilder();
        ConstantIntEnum constantIntEnum8 = ConstantIntEnum.GBC;
        sb8.append(constantIntEnum8.value());
        sb8.append("");
        simpleArrayMap.put(sb8.toString(), constantIntEnum8.nickName());
        StringBuilder sb9 = new StringBuilder();
        ConstantIntEnum constantIntEnum9 = ConstantIntEnum.MD;
        sb9.append(constantIntEnum9.value());
        sb9.append("");
        simpleArrayMap.put(sb9.toString(), constantIntEnum9.nickName());
        simpleArrayMap.put(constantIntEnum9.value() + "", constantIntEnum9.nickName());
        StringBuilder sb10 = new StringBuilder();
        ConstantIntEnum constantIntEnum10 = ConstantIntEnum.PS;
        sb10.append(constantIntEnum10.value());
        sb10.append("");
        simpleArrayMap.put(sb10.toString(), constantIntEnum10.nickName());
        StringBuilder sb11 = new StringBuilder();
        ConstantIntEnum constantIntEnum11 = ConstantIntEnum.SFC;
        sb11.append(constantIntEnum11.value());
        sb11.append("");
        simpleArrayMap.put(sb11.toString(), constantIntEnum11.nickName());
        StringBuilder sb12 = new StringBuilder();
        ConstantIntEnum constantIntEnum12 = ConstantIntEnum.WSC;
        sb12.append(constantIntEnum12.value());
        sb12.append("");
        simpleArrayMap.put(sb12.toString(), constantIntEnum12.nickName());
        StringBuilder sb13 = new StringBuilder();
        ConstantIntEnum constantIntEnum13 = ConstantIntEnum.N64;
        sb13.append(constantIntEnum13.value());
        sb13.append("");
        simpleArrayMap.put(sb13.toString(), constantIntEnum13.nickName());
        StringBuilder sb14 = new StringBuilder();
        ConstantIntEnum constantIntEnum14 = ConstantIntEnum.ONS;
        sb14.append(constantIntEnum14.value());
        sb14.append("");
        simpleArrayMap.put(sb14.toString(), constantIntEnum14.nickName());
        StringBuilder sb15 = new StringBuilder();
        ConstantIntEnum constantIntEnum15 = ConstantIntEnum.DC;
        sb15.append(constantIntEnum15.value());
        sb15.append("");
        simpleArrayMap.put(sb15.toString(), constantIntEnum15.nickName());
        StringBuilder sb16 = new StringBuilder();
        ConstantIntEnum constantIntEnum16 = ConstantIntEnum.H5;
        sb16.append(constantIntEnum16.value());
        sb16.append("");
        simpleArrayMap.put(sb16.toString(), constantIntEnum16.nickName());
        String romType = downloadTask.getRomType();
        if (TextUtils.isEmpty(romType)) {
            downloadTask.setRomType(downloadTask.getPlugin_num());
        }
        return simpleArrayMap.containsKey(romType) ? (String) simpleArrayMap.get(romType) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                ResultMainBean<SNKGameInfoBean> V = this.I.V(RequestBeanUtil.getInstance(getActivity()).getPreloadingADRequestBean());
                if (V == null || V.getCode() != 600) {
                    return;
                }
                v1(V.getMessages().getData());
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("e:");
                sb.append(e5.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H1(DownloadTask downloadTask) {
        List<CollectionBeanSubBusiness> list;
        if (downloadTask == null || (list = this.W) == null || list.size() <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.W.size()) {
                if (com.join.mgps.Util.g2.i(this.W.get(i4).getGame_id()) && this.W.get(i4).getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    this.W.get(i4).setDownloadTask(downloadTask);
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        I0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0() {
        List<CollectionBeanSubBusiness> list;
        WrapContentGridView wrapContentGridView;
        if (this.f35806w != null) {
            RecommendGameAdInfo recommendGameAdInfo = this.K;
            if (recommendGameAdInfo != null && recommendGameAdInfo.getList() != null && this.K.getList().size() > 0 && (list = this.W) != null && list.size() > 0 && (wrapContentGridView = this.f35802s) != null && wrapContentGridView.getVisibility() == 0) {
                List<CommonGameInfoBean> list2 = this.K.getList();
                CommonGameInfoBean commonGameInfoBean = list2.get(this.O % list2.size());
                commonGameInfoBean.set_from(153);
                commonGameInfoBean.set_from_type(153);
                CollectionBeanSubBusiness w02 = w0(commonGameInfoBean);
                if (!J0(list2, this.W.get(0))) {
                    this.W.add(0, w02);
                    W0(commonGameInfoBean);
                } else if (!TextUtils.equals(commonGameInfoBean.getG_info().getId(), this.W.get(0).getGame_id())) {
                    this.W.set(0, w02);
                    W0(commonGameInfoBean);
                }
            }
            this.f35806w.notifyDataSetChanged();
        }
    }

    void I1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    h1(downloadTask);
                    E1();
                    return;
                case 3:
                    f1(downloadTask);
                    E1();
                    return;
                case 4:
                default:
                    return;
                case 5:
                    i1(downloadTask);
                    E1();
                    return;
                case 6:
                    g1(downloadTask);
                    E1();
                    return;
            }
        }
    }

    boolean L0(Context context, String str) {
        boolean z4 = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.B.containsKey(str) && this.B.get(str) != null) {
            if (this.B.get(str) != null) {
                return this.B.get(str).booleanValue();
            }
            return false;
        }
        try {
            z4 = com.join.mgps.Util.g.e(context, str);
            this.B.put(str, Boolean.valueOf(z4));
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return z4;
        }
    }

    boolean M0(DownloadTask downloadTask) {
        if (com.join.mgps.Util.q1.f(downloadTask.getPackageName())) {
            return false;
        }
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0 && next.getName().contains("单机")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void N0() {
        this.F = true;
        this.f35803t.setVisibility(8);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
        x1(downloadTask);
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getCrc_link_type_val())) {
            return;
        }
        this.A.put(downloadTask.getCrc_link_type_val(), Boolean.TRUE);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        Y(str, downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T0() {
        if (this.G != null) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.G.getTabJumpUrl());
            ShareWebActivity_.t2(this.f35786c).b(intentDateBean).start();
            com.papa.sim.statistic.p.l(this.f35786c).Q1(Event.clickTabGameTipsUpRedBag, AccountUtil_.getInstance_(this.f35786c).getAccountData().getUid());
        }
    }

    boolean U0(String str, DownloadTask downloadTask) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (downloadTask.isFightFun() && "对战".equals(str)) {
            return true;
        }
        String G0 = G0(downloadTask);
        if (TextUtils.isEmpty(G0) || !G0.equals(str)) {
            Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
            while (it2.hasNext()) {
                TipBean next = it2.next();
                if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0) {
                    if (next.getName().contains("网游") && str.equals(next.getName())) {
                        return true;
                    }
                    if (next.getName().contains("单机") && str.equals(next.getName())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void V0() {
        MyGameUpdateManagerActivity_.J0(getContext()).start();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_my_game_v1;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.fragment_my_game;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019b, code lost:
        r5 = r11.K.getList().get(r4);
        r6 = r5.getG_info();
        r8 = new com.github.snowdream.android.app.downloader.DownloadTask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b8, code lost:
        if (android.text.TextUtils.isEmpty(r6.getGif_ico()) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r10 = r6.getIco();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
        r10 = r6.getGif_ico();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
        r8.setPortraitURL(r10);
        r8.setShowName(r6.getName());
        r8.setStatus(0);
        r8.setCrc_link_type_val(r6.getId());
        r8.setTipBeans(new java.util.ArrayList<>(r6.getTag_info()));
        r6 = r11.f35807x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e5, code lost:
        if (r6 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e7, code lost:
        r6.I(r5);
        r11.f35807x.M(r11.K.getCorner_mark_pic());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f5, code lost:
        r11.L = r8;
        r11.N = false;
        A0(r5);
        r5 = r11.J.myGameTabAdShowIndex();
        r5.g(r7 + "_" + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151 A[Catch: Exception -> 0x021c, LOOP:1: B:69:0x0151->B:90:0x0218, LOOP_LABEL: LOOP:1: B:69:0x0151->B:90:0x0218, LOOP_START, PHI: r4 
      PHI: (r4v13 int) = (r4v12 int), (r4v14 int) binds: [B:68:0x014f, B:90:0x0218] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x021c, blocks: (B:50:0x00f2, B:52:0x00f6, B:54:0x00fc, B:56:0x0108, B:58:0x010c, B:61:0x012c, B:63:0x0133, B:65:0x013f, B:67:0x014b, B:69:0x0151, B:71:0x0157, B:73:0x0165, B:75:0x0171, B:76:0x0183, B:78:0x0189, B:81:0x019b, B:83:0x01ba, B:85:0x01c3, B:87:0x01e7, B:88:0x01f5, B:84:0x01bf), top: B:110:0x00f2 }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaFragment.X0():void");
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
        com.join.mgps.customview.v vVar = new com.join.mgps.customview.v(getContext());
        vVar.b(new c(str, downloadTask));
        vVar.c(this.f35797n, str);
    }

    public void Y0(String str) {
        this.A.put(str, Boolean.FALSE);
        X0();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int Z() {
        return com.join.mgps.Util.c0.a(getContext(), 48.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(HashMap<String, Boolean> hashMap) {
        DownloadTask downloadTask;
        com.join.mgps.adapter.o2 o2Var = this.f35807x;
        if (o2Var == null || o2Var.o() == null || this.f35807x.o().size() == 0) {
            return;
        }
        for (o2.f fVar : this.f35807x.o()) {
            if (fVar.b() == 2 && fVar.a() != null && (downloadTask = (DownloadTask) fVar.a()) != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && hashMap.containsKey(downloadTask.getCrc_link_type_val())) {
                fVar.d(hashMap.get(downloadTask.getCrc_link_type_val()).booleanValue());
            }
        }
        this.f35807x.notifyDataSetChanged();
    }

    public void a1(DownloadTask downloadTask) {
        try {
            com.join.mgps.adapter.o2 o2Var = this.f35807x;
            if (o2Var != null) {
                o2Var.n(downloadTask);
                String d5 = this.J.myGameTabAdShowIndex().d();
                if (!TextUtils.isEmpty(d5) && d5.split("_").length == 2) {
                    String[] split = d5.split("_");
                    org.androidannotations.api.sharedpreferences.p myGameTabAdShowIndex = this.J.myGameTabAdShowIndex();
                    myGameTabAdShowIndex.g(split[0] + "_" + (Integer.parseInt(split[1]) + 1));
                }
                this.K = null;
                this.L = null;
                Ext ext = new Ext();
                ext.setGameId(downloadTask.getCrc_link_type_val());
                com.papa.sim.statistic.p.l(getContext()).O1(Event.clickRightClosedAd, ext);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        p1();
        this.f35786c = getContext();
        com.join.mgps.Util.d0.a().d(this);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28 && this.J.needShowPermissdialog().d().booleanValue() && !UtilsMy.m0(this.f35786c)) {
            ((WufunGameDownFirstNotPermissDialog_.IntentBuilder_) WufunGameDownFirstNotPermissDialog_.intent(this.f35786c).from(2).flags(268435456)).start();
        }
        this.I = com.join.mgps.rpc.impl.d.P1();
        if (this.f35797n == null) {
            this.f35797n = ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.root);
        }
        if (getContext() instanceof MyGameManagerActivity) {
            this.f35799p.setVisibility(8);
            this.f35800q.setVisibility(0);
        }
        if (getActivity() instanceof MGMainActivity) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f35801r.getLayoutParams();
            if (i4 >= 21) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = com.join.android.app.common.utils.n.v(getContext());
            }
            this.f35801r.setLayoutParams(layoutParams);
        } else {
            this.f35801r.setBackgroundColor(-1);
        }
        this.f46258b.setNoDataCallBackListener(new LoadingLayout.a() { // from class: com.join.mgps.activity.y1
            @Override // com.join.mgps.customview.LoadingLayout.a
            public final void noDataCallBack() {
                MyGamePapaFragment.this.O0();
            }
        });
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(getContext());
        this.f35807x = o2Var;
        o2Var.S(this);
        this.f35788e.setAdapter((ListAdapter) this.f35807x);
        this.f35788e.setOnScrollListener(this);
        q1();
        D0();
        loadData();
        g gVar = new g();
        this.f35806w = gVar;
        this.f35802s.setAdapter((ListAdapter) gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void b1(@Receiver.Extra String str) {
        boolean z4;
        List<DownloadTask> list = this.C;
        if (list == null || list.size() < 1) {
            return;
        }
        loop0: while (true) {
            z4 = false;
            for (DownloadTask downloadTask : this.C) {
                try {
                    if (!TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && downloadTask.getCrc_link_type_val().equals(str)) {
                        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                        downloadTask.setOpen(true);
                        if (F != null) {
                            downloadTask.setOpenTime(F.getOpenTime());
                        }
                        String O1 = UtilsMy.O1(downloadTask);
                        if (!TextUtils.isEmpty(O1)) {
                            if ((ConstantIntEnum.CHOICENESS.value() + "").equals(O1) && this.f35809z.contains("全部游戏")) {
                                O1 = "全部游戏";
                            }
                            if (O1 == null) {
                                O1 = "全部游戏";
                            }
                            if (this.P == null) {
                                this.P = "全部游戏";
                            }
                            if (this.f35809z.contains(O1) && (O1.equals(this.P) || this.P.equals("全部游戏"))) {
                                z4 = true;
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            break loop0;
        }
        if (z4) {
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void c1(String str) {
        i(str);
    }

    void d1() {
        List<DownloadTask> list;
        int c02 = p1.f.K().c0();
        if (c02 > 0) {
            this.f35798o.setVisibility(0);
            TextView textView = this.f35796m;
            textView.setText(c02 + "款游戏需更新");
        } else {
            this.f35798o.setVisibility(8);
        }
        List<CollectionBeanSubBusiness> list2 = this.V;
        if (list2 == null || list2.size() == 0 || !((list = this.C) == null || this.D == list.size())) {
            List<DownloadTask> list3 = this.C;
            if (list3 != null) {
                this.D = list3.size();
            }
            E0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e1() {
        MyGamePlugManagerActivity_.p0(getContext()).start();
    }

    @Override // com.join.mgps.adapter.o2.e
    public void g(String str) {
    }

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
        final DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            return;
        }
        if (com.join.mgps.Util.g2.i(F.getMod_info()) && !com.join.mgps.Util.q1.f(F.getPackageName())) {
            com.join.mgps.customview.m mVar = new com.join.mgps.customview.m(getContext());
            mVar.b(new m.a() { // from class: com.join.mgps.activity.z1
                @Override // com.join.mgps.customview.m.a
                public final void a(boolean z4, String str2, boolean z5, String str3) {
                    MyGamePapaFragment.this.R0(z4, str2, z5, str3);
                }
            });
            mVar.c(this.f35797n, F);
            return;
        }
        com.join.mgps.customview.q qVar = new com.join.mgps.customview.q(getContext());
        qVar.b(new q.a() { // from class: com.join.mgps.activity.a2
            @Override // com.join.mgps.customview.q.a
            public final void a(String str2) {
                MyGamePapaFragment.this.S0(F, str2);
            }
        });
        qVar.c(this.f35797n, str);
    }

    void j1() {
        this.f35809z.clear();
        this.f35809z.add("全部游戏");
        List<DownloadTask> list = this.C;
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask : this.C) {
            if (downloadTask.isIs_fight() == 1 && !this.f35809z.contains("对战")) {
                this.f35809z.add("对战");
            }
            String G0 = G0(downloadTask);
            if (!TextUtils.isEmpty(G0)) {
                if (!this.f35809z.contains(G0)) {
                    this.f35809z.add(G0);
                }
            } else {
                Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TipBean next = it2.next();
                        if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0) {
                            if (next.getName().contains("网游")) {
                                if (!this.f35809z.contains("网游")) {
                                    this.f35809z.add("网游");
                                }
                            } else if (next.getName().contains("单机")) {
                                if (!this.f35809z.contains("单机")) {
                                    this.f35809z.add("单机");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.I})
    public void k1() {
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void l1() {
        E0(true);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected void loadData() {
        ArrayList arrayList = new ArrayList();
        this.f35808y = arrayList;
        arrayList.addAll(Arrays.asList(getContext().getResources().getStringArray(R.array.my_game_list)));
        ArrayList arrayList2 = new ArrayList();
        String d5 = this.J.myGameAllTabSort().d();
        if (!TextUtils.isEmpty(d5)) {
            List list = null;
            try {
                list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (list != null && list.size() > 0) {
                arrayList2.addAll(list);
            } else {
                arrayList2.addAll(this.f35808y);
            }
        } else {
            arrayList2.addAll(this.f35808y);
        }
        try {
            try {
                List<DownloadTask> Y = p1.f.K().Y();
                List<DownloadTask> list2 = this.C;
                if (list2 != null) {
                    list2.clear();
                }
                if (Y != null) {
                    for (DownloadTask downloadTask : Y) {
                        if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
                            if (com.join.mgps.Util.g2.i(downloadTask.getMod_info())) {
                                ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
                                if (modInfoBean != null) {
                                    DownloadTask F = p1.f.K().F(modInfoBean.getMod_game_id());
                                    DownloadTask F2 = p1.f.K().F(modInfoBean.getMain_game_id());
                                    boolean z4 = true;
                                    boolean z5 = false;
                                    boolean z6 = F != null && F.getStatus() == 5;
                                    if (F2 != null) {
                                        if (F2.getStatus() != 5) {
                                            z4 = false;
                                        }
                                        z5 = z4;
                                    }
                                    if (z6 && z5) {
                                        if (!this.C.contains(F2)) {
                                            this.C.add(F2);
                                        }
                                    } else if (z6) {
                                        if (!this.C.contains(F)) {
                                            this.C.add(F);
                                        }
                                    } else if (z5) {
                                        if (!this.C.contains(F2)) {
                                            this.C.add(F2);
                                        }
                                    } else {
                                        this.C.add(downloadTask);
                                    }
                                }
                            } else if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
                                this.C.add(downloadTask);
                            }
                        }
                    }
                }
                List<DownloadTask> list3 = this.C;
                if (list3 != null) {
                    this.D = list3.size();
                }
                if (this.C.size() > 0) {
                    j1();
                    C1();
                } else {
                    A1();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                A1();
            }
        } finally {
            a0();
        }
    }

    public void m1() {
        com.join.mgps.adapter.o2 o2Var = this.f35807x;
        if (o2Var != null) {
            o2Var.K(true);
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n1() {
        try {
            HashMap<String, Boolean> d5 = com.join.mgps.Util.g.d(getContext());
            this.B.clear();
            if (d5 != null && d5.size() != 0) {
                this.B.putAll(d5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o1(List<DownloadTask> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                HashMap<String, Boolean> hashMap = new HashMap<>();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    DownloadTask downloadTask = list.get(i4);
                    hashMap.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(v0(getContext(), downloadTask)));
                    this.A.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(v0(getContext(), downloadTask)));
                }
                Z0(hashMap);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() instanceof MGMainActivity) {
            this.E = (MGMainActivity) getActivity();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        D1();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        X0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            I1(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    I1(a5, 6);
                    return;
                } else if (c5 == 7) {
                    I1(a5, 3);
                    return;
                } else if (c5 == 8) {
                    E1();
                    List<DownloadTask> list = this.C;
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    G1();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            I1(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            I1(a5, 8);
                            return;
                        case 13:
                            I1(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            I1(a5, 5);
        } else {
            I1(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            F0();
            E0(false);
            this.M = false;
            this.O++;
        }
        this.N = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (MApplication.Y) {
            MApplication.Y = false;
            String d5 = this.J.addedShortcutGames().d();
            if (!com.join.mgps.Util.g2.h(d5)) {
                if (d5.contains(",")) {
                    for (String str : d5.split(",")) {
                        s0(str);
                    }
                } else {
                    s0(d5);
                }
            }
        }
        d1();
        n1();
        com.join.mgps.adapter.o2 o2Var = this.f35807x;
        if (o2Var != null) {
            o2Var.K(true);
            X0();
        }
        if (isHidden()) {
            return;
        }
        F0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.S = (i5 + i4) - 1;
        this.T = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        List<DownloadTask> list;
        super.onVisible();
        List<CollectionBeanSubBusiness> list2 = this.V;
        if (list2 == null || list2.size() == 0 || ((list = this.C) != null && this.D != list.size())) {
            List<DownloadTask> list3 = this.C;
            if (list3 != null) {
                this.D = list3.size();
            }
            E0(true);
        }
        com.join.mgps.adapter.o2 o2Var = this.f35807x;
        if (o2Var != null) {
            o2Var.K(true);
            X0();
        }
    }

    void p1() {
        NetBroadcastReceiver netBroadcastReceiver = new NetBroadcastReceiver();
        this.Y = netBroadcastReceiver;
        netBroadcastReceiver.a(new e());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.Y, intentFilter);
    }

    void q1() {
        if (getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        List<String> snkGameList = ((MGMainActivity) getActivity()).getSnkGameList();
        if (snkGameList == null || snkGameList.size() == 0) {
            H0();
        }
    }

    void s1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.H <= 300) {
            return;
        }
        this.H = currentTimeMillis;
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.t(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        this.E.callbackHome(null);
    }

    void t0(Context context, String str, String str2, Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
        }
        if (bitmap == null) {
            com.join.mgps.Util.l2.a(context).b("创建失败！");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClass(context, MGMainActivity_.class);
                intent.putExtra("shortcutGameId", str2);
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str).setIntent(intent).build(), PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutReceiver.class), 134217728).getIntentSender());
                com.join.mgps.Util.w1.e(context, str2);
            }
        } else {
            Intent intent2 = new Intent(com.join.mgps.Util.w1.f28140a);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, 142, 142, true));
            Intent intent3 = new Intent("android.intent.action.MAIN");
            intent3.setClass(context, MGMainActivity_.class);
            intent3.putExtra("shortcutGameId", str2);
            intent3.addFlags(TTAdConstant.KEY_CLICK_AREA);
            intent3.addCategory("android.intent.category.LAUNCHER");
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
            context.sendBroadcast(intent2);
            com.join.mgps.Util.w1.e(context, str2);
        }
        this.A.put(str2, Boolean.FALSE);
        X0();
        y1(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t1() {
        IntentUtil.getInstance().goSearchHintActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).finish();
        }
    }

    @UiThread
    public void u1(OnlineCouponConfigBean onlineCouponConfigBean) {
        this.G = onlineCouponConfigBean;
        boolean isGameStartUpSwitch = onlineCouponConfigBean.isGameStartUpSwitch();
        boolean isTabSwitch = onlineCouponConfigBean.isTabSwitch();
        boolean isReceived = onlineCouponConfigBean.isReceived();
        int n22 = AccountUtil_.getInstance_(this.f35786c).getAccountData().n2();
        PrefDef_ prefDef_ = this.J;
        Long d5 = (n22 == 1 ? prefDef_.lastGameShowOnlineCouponTime() : prefDef_.lastGameShowOnlineCouponTimeGuest()).d();
        PrefDef_ prefDef_2 = this.J;
        String d6 = (n22 == 1 ? prefDef_2.lastGameTimePeriod() : prefDef_2.lastGameTimePeriodGuest()).d();
        if (!com.join.mgps.Util.y.u(d5.longValue()) && isGameStartUpSwitch && !isReceived && !TextUtils.equals(onlineCouponConfigBean.getTimePeriodMark(), d6)) {
            B1(onlineCouponConfigBean, 2);
            if (n22 == 1) {
                this.J.lastGameShowOnlineCouponTime().g(Long.valueOf(System.currentTimeMillis()));
                this.J.lastGameTimePeriod().g(onlineCouponConfigBean.getTimePeriodMark());
                return;
            }
            this.J.lastGameShowOnlineCouponTimeGuest().g(Long.valueOf(System.currentTimeMillis()));
            this.J.lastGameTimePeriodGuest().g(onlineCouponConfigBean.getTimePeriodMark());
        } else if (!isTabSwitch || this.F || isReceived) {
        } else {
            TextView textView = this.f35804u;
            if (textView != null) {
                textView.setText(onlineCouponConfigBean.getTabHint());
            }
            LinearLayout linearLayout = this.f35803t;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            com.papa.sim.statistic.p.l(this.f35786c).Q1(Event.tabStartViewSuccessTips, AccountUtil_.getInstance_(this.f35786c).getAccountData().getUid());
        }
    }

    boolean v0(Context context, DownloadTask downloadTask) {
        if (downloadTask != null && downloadTask.getStatus() == 5 && (!M0(downloadTask) || !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val()))) {
            boolean z4 = !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.apk.name());
            if (com.join.mgps.Util.g2.i(downloadTask.getRomType()) && (downloadTask.getUrl().endsWith(".apk") || downloadTask.getRomType().equals("androidobb") || downloadTask.getRomType().equals("46"))) {
                String packageName = downloadTask.getPackageName();
                if (com.join.mgps.Util.g2.h(packageName) || !L0(context, packageName) || !com.join.mgps.Util.g2.i(downloadTask.getTips()) || downloadTask.getTips().contains("网游") || com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    if (APKUtils.G(downloadTask) && com.join.mgps.Util.g2.i(downloadTask.getRef_crc_sign_id()) && !com.join.mgps.Util.w1.d(context, downloadTask.getRef_crc_sign_id())) {
                        return true;
                    }
                    return APKUtils.L(downloadTask) && com.join.mgps.Util.g2.i(downloadTask.getCrc_link_type_val()) && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val());
                }
                return true;
            } else if (z4 && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                return true;
            } else {
                if (APKUtils.G(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getRef_crc_sign_id())) {
                    return true;
                }
                if (APKUtils.L(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1(SNKGameInfoBean sNKGameInfoBean) {
        List<String> scanning_md5 = sNKGameInfoBean.getScanning_md5();
        this.R = scanning_md5;
        if (scanning_md5 == null || scanning_md5.size() <= 0 || getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        ((MGMainActivity) getActivity()).setSnkGameList(this.R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w1() {
        com.join.mgps.customview.x xVar = new com.join.mgps.customview.x(getContext());
        xVar.b(new b());
        xVar.c(this.f35797n);
    }

    void x0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.C.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (!TextUtils.isEmpty(next.getCrc_link_type_val()) && next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
    }

    void x1(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        Bitmap m4 = ImageLoader.q().m(downloadTask.getPortraitURL());
        if (m4 == null) {
            m4 = r1(downloadTask.getPortraitURL());
        }
        t0(getContext(), downloadTask.getShowName(), downloadTask.getCrc_link_type_val(), m4);
    }

    void y0(String str) {
        DownloadTask F = p1.f.K().F(str);
        Context context = getContext();
        if (F == null) {
            return;
        }
        boolean z4 = false;
        String fileType = F.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(context).d(context, F.getPackageName())) {
                if (F.getStatus() != 5 && F.getStatus() != 9) {
                    UtilsMy.J0(F);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, F.getPackageName());
                    if (l4 != null) {
                        F.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(F, 5);
                    X0();
                } else {
                    com.join.android.app.common.utils.e.l0(context).f0(context, F.getPackageName());
                }
            } else {
                UtilsMy.M0(F);
                x0(F);
                UtilsMy.x4(F);
                X0();
            }
        } else {
            UtilsMy.M0(F);
            x0(F);
            UtilsMy.x4(F);
            X0();
        }
        List<DownloadTask> C0 = C0();
        if (C0 == null || C0.size() == 0) {
            this.P = "全部游戏";
            this.f35795l.setText("全部游戏");
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void y1(String str) {
        new com.join.android.app.common.dialog.d(this.f35786c, str).show();
    }

    void z0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F.getStatus() == 48) {
            com.join.mgps.Util.l2.a(getContext()).b("游戏安装中无法删除");
            return;
        }
        UtilsMy.O0(getContext(), F);
        x0(F);
        List<DownloadTask> C0 = C0();
        if (C0 == null || C0.size() == 0) {
            this.P = "全部游戏";
            this.f35795l.setText("全部游戏");
        }
        X0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1(List<GamedownRecomendItemBean> list) {
        if (list == null) {
            return;
        }
        this.V.clear();
        for (int i4 = 0; i4 < list.size() && i4 < 6; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(list.get(i4));
            collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
            this.V.add(collectionBeanSubBusiness);
        }
        try {
            com.join.mgps.pref.h.n(getContext()).u0(JsonMapper.toJsonString(this.V));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.join.mgps.adapter.o2 o2Var = this.f35807x;
        if (o2Var != null) {
            o2Var.L(true);
        }
        com.join.mgps.adapter.o2 o2Var2 = this.f35807x;
        if (o2Var2 != null) {
            o2Var2.K(true);
        }
        X0();
    }
}
