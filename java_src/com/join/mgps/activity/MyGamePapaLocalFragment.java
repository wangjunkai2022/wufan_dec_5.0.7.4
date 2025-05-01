package com.join.mgps.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.collection.SimpleArrayMap;
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
import com.join.mgps.activity.MyGamePapaLocalFragment;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.adapter.o2;
import com.join.mgps.broadcast.NetBroadcastReceiver;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.v;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameSortBean;
import com.join.mgps.dto.ModInfoBean;
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
import com.join.mgps.fragment.BaseFragment;
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
@EFragment(R.layout.fragment_papa_game_local)
/* loaded from: classes.dex */
public class MyGamePapaLocalFragment extends BaseFragment implements o2.e, AbsListView.OnScrollListener {
    public static final String F = "网游";
    public static final String G = "单机";
    public static final String H = "对战";
    public static final String I = "全部游戏";
    DataGameListBean A;
    private NetBroadcastReceiver E;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView2 f35951b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f35952c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f35953d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    WrapContentGridView f35954e;

    /* renamed from: f  reason: collision with root package name */
    private Context f35955f;

    /* renamed from: g  reason: collision with root package name */
    e f35956g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.adapter.o2 f35957h;

    /* renamed from: o  reason: collision with root package name */
    long f35964o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.e f35965p;
    @Pref

    /* renamed from: q  reason: collision with root package name */
    PrefDef_ f35966q;

    /* renamed from: r  reason: collision with root package name */
    private RecommendGameAdInfo f35967r;

    /* renamed from: s  reason: collision with root package name */
    private DownloadTask f35968s;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.customview.u f35972w;

    /* renamed from: i  reason: collision with root package name */
    List<String> f35958i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    List<String> f35959j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    HashMap<String, Boolean> f35960k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    HashMap<String, Boolean> f35961l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private List<DownloadTask> f35962m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private int f35963n = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f35969t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f35970u = true;

    /* renamed from: v  reason: collision with root package name */
    private int f35971v = 0;

    /* renamed from: x  reason: collision with root package name */
    private List<String> f35973x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private int f35974y = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f35975z = 0;
    private List<CollectionBeanSubBusiness> B = new ArrayList();
    private List<CollectionBeanSubBusiness> C = new ArrayList();
    long D = 0;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35978b;

        b(String str, DownloadTask downloadTask) {
            this.f35977a = str;
            this.f35978b = downloadTask;
        }

        @Override // com.join.mgps.customview.v.a
        public void a(String str) {
            DownloadTask F = p1.f.K().F(this.f35977a);
            boolean z4 = false;
            if (F == null) {
                IntentUtil.getInstance().goGameDetialActivity(MyGamePapaLocalFragment.this.f35955f, this.f35977a, 0);
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
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(MyGamePapaLocalFragment.this.getContext(), F);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void b(String str) {
            MyGamePapaLocalFragment.this.W0(p1.f.K().F(str));
        }

        @Override // com.join.mgps.customview.v.a
        public void c(String str) {
            if (p1.f.K().F(this.f35977a) == null) {
                MyGamePapaLocalFragment.this.D0(this.f35978b);
            } else {
                MyGamePapaLocalFragment.this.F0(str);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void d(String str) {
            new com.join.mgps.customview.n(MyGamePapaLocalFragment.this.getContext()).a(MyGamePapaLocalFragment.this.f35953d, str);
        }

        @Override // com.join.mgps.customview.v.a
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35980b;

        c(boolean z4) {
            this.f35980b = z4;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            if (response != null) {
                try {
                    ResponseModel<DataGameListBean> body = response.body();
                    if (body != null && body.getData() != null && this.f35980b) {
                        MyGamePapaLocalFragment.this.A = body.getData();
                        MyGamePapaLocalFragment.this.C.clear();
                        List<GamedownRecomendItemBean> recommendList = body.getData().getRecommendList();
                        if (recommendList != null) {
                            for (int i4 = 0; i4 < recommendList.size() && i4 < 6; i4++) {
                                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(recommendList.get(i4));
                                collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
                                MyGamePapaLocalFragment.this.C.add(collectionBeanSubBusiness);
                            }
                            if (MyGamePapaLocalFragment.this.f35962m == null || MyGamePapaLocalFragment.this.f35962m.size() == 0) {
                                MyGamePapaLocalFragment.this.A0();
                            }
                        }
                        List<GamedownRecomendItemBean> gameList = body.getData().getGameList();
                        if (gameList != null && gameList.size() > 0) {
                            MyGamePapaLocalFragment.this.Y0(gameList);
                        }
                    }
                    RecommendGameAdInfo recAd = body.getData().getRecAd();
                    if (recAd != null) {
                        MyGamePapaLocalFragment.this.f35967r = recAd;
                        MyGamePapaLocalFragment.this.A0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements NetBroadcastReceiver.a {
        d() {
        }

        @Override // com.join.mgps.broadcast.NetBroadcastReceiver.a
        public void a(int i4) {
            if (MyGamePapaLocalFragment.this.B == null || MyGamePapaLocalFragment.this.B.size() == 0 || !(MyGamePapaLocalFragment.this.f35962m == null || MyGamePapaLocalFragment.this.f35963n == MyGamePapaLocalFragment.this.f35962m.size())) {
                if (MyGamePapaLocalFragment.this.f35962m != null) {
                    MyGamePapaLocalFragment myGamePapaLocalFragment = MyGamePapaLocalFragment.this;
                    myGamePapaLocalFragment.f35963n = myGamePapaLocalFragment.f35962m.size();
                }
                MyGamePapaLocalFragment.this.p0(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            CollectionBeanSubBusiness f35984b;

            public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                this.f35984b = collectionBeanSubBusiness;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                DownloadTask downloadTask = this.f35984b.getDownloadTask();
                if (downloadTask == null) {
                    if (UtilsMy.o0(this.f35984b.getTag_info())) {
                        if (this.f35984b.getMod_info() == null) {
                            if (com.join.android.app.common.utils.e.l0(context).d(context, this.f35984b.getPackage_name())) {
                                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, this.f35984b.getPackage_name());
                                if (!com.join.mgps.Util.g2.i(this.f35984b.getVer()) || l4.d() >= Integer.parseInt(this.f35984b.getVer())) {
                                    com.join.android.app.common.utils.e.l0(context);
                                    APKUtils.a0(context, this.f35984b.getPackage_name());
                                    return;
                                }
                            }
                        } else {
                            boolean d5 = com.join.android.app.common.utils.e.l0(context).d(context, this.f35984b.getPackage_name());
                            boolean F = com.join.mgps.va.overmind.d.o().F(this.f35984b.getPackage_name());
                            if (d5 || F) {
                                com.join.android.app.common.utils.e.l0(context);
                                APKUtils.V(context, this.f35984b.getMod_info());
                                return;
                            }
                        }
                    }
                    UtilsMy.Y0(context, this.f35984b);
                    return;
                }
                if (com.join.mgps.Util.g2.i(this.f35984b.getPlugin_num())) {
                    String plugin_num = this.f35984b.getPlugin_num();
                    if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                        IntentDateBean intentDateBean = new IntentDateBean();
                        intentDateBean.setLink_type(4);
                        intentDateBean.setLink_type_val(this.f35984b.getDown_url_remote());
                        UtilsMy.T2(downloadTask, context);
                        IntentUtil.getInstance().intentActivity(context, intentDateBean);
                        return;
                    }
                }
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(this.f35984b.getPay_tag_info(), this.f35984b.getCrc_sign_id()) > 0) {
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
                UtilsMy.Y0(context, this.f35984b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f35986a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f35987b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f35988c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f35989d;

            b() {
            }
        }

        e() {
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
        void d(com.join.mgps.activity.MyGamePapaLocalFragment.e.b r17, com.join.mgps.business.CollectionBeanSubBusiness r18) {
            /*
                Method dump skipped, instructions count: 1010
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaLocalFragment.e.d(com.join.mgps.activity.MyGamePapaLocalFragment$e$b, com.join.mgps.business.CollectionBeanSubBusiness):void");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (MyGamePapaLocalFragment.this.C == null) {
                return 0;
            }
            return Math.min(9, MyGamePapaLocalFragment.this.C.size());
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            if (MyGamePapaLocalFragment.this.C == null) {
                return null;
            }
            return MyGamePapaLocalFragment.this.C.get(i4);
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
                View inflate = LayoutInflater.from(MyGamePapaLocalFragment.this.getContext()).inflate(R.layout.fragment_my_game_no_game_item, viewGroup, false);
                bVar2.f35986a = (SimpleDraweeView) inflate.findViewById(R.id.icon);
                bVar2.f35987b = (TextView) inflate.findViewById(R.id.name);
                bVar2.f35988c = (TextView) inflate.findViewById(R.id.size);
                bVar2.f35989d = (TextView) inflate.findViewById(R.id.install);
                inflate.setTag(bVar2);
                bVar = bVar2;
                view = inflate;
            }
            if (getItem(i4) == null) {
                return view;
            }
            final CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
            MyImageLoader.h(bVar.f35986a, collectionBeanSubBusiness.getIco_remote());
            bVar.f35987b.setText(collectionBeanSubBusiness.getGame_name());
            bVar.f35988c.setText(UtilsMy.a(TextUtils.isEmpty(collectionBeanSubBusiness.getSize()) ? 0L : (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d)));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.j2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MyGamePapaLocalFragment.e.b(CollectionBeanSubBusiness.this, view2);
                }
            });
            UtilsMy.d3(bVar.f35989d, collectionBeanSubBusiness);
            bVar.f35989d.setOnClickListener(new a(new CollectionBeanSubBusiness(collectionBeanSubBusiness)));
            d(bVar, collectionBeanSubBusiness);
            return view;
        }
    }

    private void H0(DownloadTask downloadTask) {
        DownloadTask downloadTask2;
        List<CollectionBeanSubBusiness> list;
        loadData();
        Iterator<DownloadTask> it2 = this.f35962m.iterator();
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
        if (downloadTask != null && (list = this.C) != null && list.size() > 0) {
            Iterator<CollectionBeanSubBusiness> it3 = this.C.iterator();
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
        this.f35956g.notifyDataSetChanged();
        e1(downloadTask2);
        L0();
        A0();
    }

    private void I0(DownloadTask downloadTask) {
        List<DownloadTask> list = this.f35962m;
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
            e1(downloadTask2);
            A0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        L0();
        A0();
    }

    private void J0(DownloadTask downloadTask) {
        boolean z4;
        ModInfoBean modInfoBean;
        if (downloadTask == null) {
            return;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            A0();
            return;
        }
        UtilsMy.A4(this.f35962m);
        Iterator<DownloadTask> it2 = this.f35962m.iterator();
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
            this.f35962m.add(0, downloadTask);
        }
        loadData();
        L0();
        A0();
    }

    private void K0(DownloadTask downloadTask) {
        if (this.f35962m == null || downloadTask == null) {
            return;
        }
        if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f35962m.size()) {
                    downloadTask = null;
                    break;
                }
                DownloadTask downloadTask2 = this.f35962m.get(i4);
                if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f35962m.set(i4, downloadTask);
                    break;
                }
                i4++;
            }
            e1(downloadTask);
            loadData();
            L0();
            A0();
            N0();
        }
    }

    private Bitmap T0(String str) {
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

    private void c1() {
    }

    private void d0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("s:");
        sb.append(str);
        DownloadTask F2 = p1.f.K().F(str);
        if (F2 != null) {
            Bitmap m4 = ImageLoader.q().m(F2.getPortraitURL());
            if (m4 == null) {
                m4 = T0(F2.getPortraitURL());
            }
            com.join.mgps.Util.w1.c(getActivity(), F2.getShowName(), str, m4);
        }
    }

    private void d1() {
        DownloadTask downloadTask;
        View childAt;
        if (this.f35975z < 0 || this.f35974y >= this.f35951b.getCount()) {
            return;
        }
        for (int i4 = this.f35975z; i4 <= this.f35974y; i4++) {
            if (this.f35951b.getAdapter().getItemViewType(i4) == 2 && this.f35951b.getItemAtPosition(i4) != null && (this.f35951b.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f35951b.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f35951b.getChildAt(i4 - this.f35975z)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
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

    private CollectionBeanSubBusiness i0(CommonGameInfoBean commonGameInfoBean) {
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

    private void m0(CommonGameInfoBean commonGameInfoBean) {
        XListView2 xListView2;
        if (this.f35969t || (xListView2 = this.f35951b) == null || xListView2.getVisibility() != 0) {
            return;
        }
        this.f35969t = true;
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("207");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    private List<DownloadTask> n0() {
        return this.f35962m;
    }

    private boolean t0(List<CommonGameInfoBean> list, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        if (list != null && collectionBeanSubBusiness != null) {
            for (CommonGameInfoBean commonGameInfoBean : list) {
                if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && TextUtils.equals(commonGameInfoBean.getG_info().getId(), collectionBeanSubBusiness.getGame_id())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean u0(List<o2.f> list) {
        if (list != null && this.f35968s != null) {
            for (o2.f fVar : list) {
                if ((fVar.a() instanceof DownloadTask) && TextUtils.equals(((DownloadTask) fVar.a()).getCrc_link_type_val(), this.f35968s.getCrc_link_type_val())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void z0(CommonGameInfoBean commonGameInfoBean) {
        WrapContentGridView wrapContentGridView = this.f35954e;
        if (wrapContentGridView == null || wrapContentGridView.getVisibility() != 0) {
            return;
        }
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("208");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0168, code lost:
        r5 = r11.f35967r.getList().get(r3);
        r6 = r5.getG_info();
        r8 = new com.github.snowdream.android.app.downloader.DownloadTask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0185, code lost:
        if (android.text.TextUtils.isEmpty(r6.getGif_ico()) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:
        r10 = r6.getIco();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018c, code lost:
        r10 = r6.getGif_ico();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
        r8.setPortraitURL(r10);
        r8.setShowName(r6.getName());
        r8.setStatus(0);
        r8.setCrc_link_type_val(r6.getId());
        r8.setTipBeans(new java.util.ArrayList<>(r6.getTag_info()));
        r6 = r11.f35957h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
        if (r6 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
        r6.I(r5);
        r11.f35957h.M(r11.f35967r.getCorner_mark_pic());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c2, code lost:
        r11.f35968s = r8;
        r11.f35970u = false;
        m0(r5);
        r5 = r11.f35966q.myGameTabAdShowIndex();
        r5.g(r7 + "_" + r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e A[Catch: Exception -> 0x01e9, LOOP:1: B:58:0x011e->B:79:0x01e5, LOOP_LABEL: LOOP:1: B:58:0x011e->B:79:0x01e5, LOOP_START, PHI: r3 
      PHI: (r3v13 int) = (r3v12 int), (r3v14 int) binds: [B:57:0x011c, B:79:0x01e5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x01e9, blocks: (B:39:0x00bf, B:41:0x00c3, B:43:0x00c9, B:45:0x00d5, B:47:0x00d9, B:50:0x00f9, B:52:0x0100, B:54:0x010c, B:56:0x0118, B:58:0x011e, B:60:0x0124, B:62:0x0132, B:64:0x013e, B:65:0x0150, B:67:0x0156, B:70:0x0168, B:72:0x0187, B:74:0x0190, B:76:0x01b4, B:77:0x01c2, B:73:0x018c), top: B:99:0x00bf }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0() {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaLocalFragment.A0():void");
    }

    public void B0(String str) {
        this.f35960k.put(str, Boolean.FALSE);
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(HashMap<String, Boolean> hashMap) {
        DownloadTask downloadTask;
        com.join.mgps.adapter.o2 o2Var = this.f35957h;
        if (o2Var == null || o2Var.o() == null || this.f35957h.o().size() == 0) {
            return;
        }
        for (o2.f fVar : this.f35957h.o()) {
            if (fVar.b() == 2 && fVar.a() != null && (downloadTask = (DownloadTask) fVar.a()) != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && hashMap.containsKey(downloadTask.getCrc_link_type_val())) {
                fVar.d(hashMap.get(downloadTask.getCrc_link_type_val()).booleanValue());
            }
        }
        this.f35957h.notifyDataSetChanged();
    }

    public void D0(DownloadTask downloadTask) {
        try {
            com.join.mgps.adapter.o2 o2Var = this.f35957h;
            if (o2Var != null) {
                o2Var.n(downloadTask);
                String d5 = this.f35966q.myGameTabAdShowIndex().d();
                if (!TextUtils.isEmpty(d5) && d5.split("_").length == 2) {
                    String[] split = d5.split("_");
                    org.androidannotations.api.sharedpreferences.p myGameTabAdShowIndex = this.f35966q.myGameTabAdShowIndex();
                    myGameTabAdShowIndex.g(split[0] + "_" + (Integer.parseInt(split[1]) + 1));
                }
                this.f35967r = null;
                this.f35968s = null;
                Ext ext = new Ext();
                ext.setGameId(downloadTask.getCrc_link_type_val());
                com.papa.sim.statistic.p.l(getContext()).O1(Event.clickRightClosedAd, ext);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void E0(@Receiver.Extra String str) {
        List<DownloadTask> list = this.f35962m;
        if (list == null || list.size() < 1) {
            return;
        }
        for (DownloadTask downloadTask : this.f35962m) {
            try {
                if (!TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && downloadTask.getCrc_link_type_val().equals(str)) {
                    DownloadTask F2 = p1.f.K().F(downloadTask.getCrc_link_type_val());
                    downloadTask.setOpen(true);
                    if (F2 != null) {
                        downloadTask.setOpenTime(F2.getOpenTime());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void F0(String str) {
        i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        MyGamePlugManagerActivity_.p0(getContext()).start();
    }

    void L0() {
        this.f35959j.clear();
        this.f35959j.add("全部游戏");
        List<DownloadTask> list = this.f35962m;
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f35962m) {
            if (downloadTask.isIs_fight() == 1 && !this.f35959j.contains("对战")) {
                this.f35959j.add("对战");
            }
            String q02 = q0(downloadTask);
            if (!TextUtils.isEmpty(q02)) {
                if (!this.f35959j.contains(q02)) {
                    this.f35959j.add(q02);
                }
            } else {
                Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TipBean next = it2.next();
                        if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0) {
                            if (next.getName().contains("网游")) {
                                if (!this.f35959j.contains("网游")) {
                                    this.f35959j.add("网游");
                                }
                            } else if (next.getName().contains("单机")) {
                                if (!this.f35959j.contains("单机")) {
                                    this.f35959j.add("单机");
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
    public void M0() {
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void N0() {
        p0(true);
    }

    public void O0() {
        com.join.mgps.adapter.o2 o2Var = this.f35957h;
        if (o2Var != null) {
            o2Var.K(true);
            A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void P0() {
        try {
            HashMap<String, Boolean> d5 = com.join.mgps.Util.g.d(getContext());
            this.f35961l.clear();
            if (d5 != null && d5.size() != 0) {
                this.f35961l.putAll(d5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q0(List<DownloadTask> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                HashMap<String, Boolean> hashMap = new HashMap<>();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    DownloadTask downloadTask = list.get(i4);
                    hashMap.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(h0(getContext(), downloadTask)));
                    this.f35960k.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(h0(getContext(), downloadTask)));
                }
                C0(hashMap);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void R0() {
        NetBroadcastReceiver netBroadcastReceiver = new NetBroadcastReceiver();
        this.E = netBroadcastReceiver;
        netBroadcastReceiver.a(new d());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.E, intentFilter);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
        W0(downloadTask);
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getCrc_link_type_val())) {
            return;
        }
        this.f35960k.put(downloadTask.getCrc_link_type_val(), Boolean.TRUE);
    }

    void S0() {
        if (getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        List<String> snkGameList = ((MGMainActivity) getActivity()).getSnkGameList();
        if (snkGameList == null || snkGameList.size() == 0) {
            r0();
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        Y(str, downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        IntentUtil.getInstance().goSearchHintActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0(SNKGameInfoBean sNKGameInfoBean) {
        List<String> scanning_md5 = sNKGameInfoBean.getScanning_md5();
        this.f35973x = scanning_md5;
        if (scanning_md5 == null || scanning_md5.size() <= 0 || getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        ((MGMainActivity) getActivity()).setSnkGameList(this.f35973x);
    }

    void W0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        Bitmap m4 = ImageLoader.q().m(downloadTask.getPortraitURL());
        if (m4 == null) {
            m4 = T0(downloadTask.getPortraitURL());
        }
        e0(getContext(), downloadTask.getShowName(), downloadTask.getCrc_link_type_val(), m4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void X0(String str) {
        new com.join.android.app.common.dialog.d(this.f35955f, str).show();
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
        com.join.mgps.customview.v vVar = new com.join.mgps.customview.v(getContext());
        vVar.b(new b(str, downloadTask));
        vVar.c(this.f35953d, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0(List<GamedownRecomendItemBean> list) {
        if (list == null) {
            return;
        }
        this.B.clear();
        for (int i4 = 0; i4 < list.size() && i4 < 6; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(list.get(i4));
            collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
            this.B.add(collectionBeanSubBusiness);
        }
        try {
            com.join.mgps.pref.h.n(getContext()).u0(JsonMapper.toJsonString(this.B));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.join.mgps.adapter.o2 o2Var = this.f35957h;
        if (o2Var != null) {
            o2Var.L(true);
        }
        com.join.mgps.adapter.o2 o2Var2 = this.f35957h;
        if (o2Var2 != null) {
            o2Var2.K(true);
        }
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0() {
        try {
            View view = this.f35952c;
            if (view != null) {
                view.setVisibility(0);
            }
            XListView2 xListView2 = this.f35951b;
            if (xListView2 != null) {
                xListView2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1() {
        try {
            View view = this.f35952c;
            if (view != null) {
                view.setVisibility(8);
            }
            XListView2 xListView2 = this.f35951b;
            if (xListView2 != null) {
                xListView2.setVisibility(0);
            }
            A0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void b1() {
        if (this.E != null) {
            getContext().unregisterReceiver(this.E);
        }
    }

    void e0(Context context, String str, String str2, Bitmap bitmap) {
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
        this.f35960k.put(str2, Boolean.FALSE);
        A0();
        X0(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1(DownloadTask downloadTask) {
        List<CollectionBeanSubBusiness> list;
        if (downloadTask == null || (list = this.C) == null || list.size() <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.C.size()) {
                if (com.join.mgps.Util.g2.i(this.C.get(i4).getGame_id()) && this.C.get(i4).getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    this.C.get(i4).setDownloadTask(downloadTask);
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        R0();
        this.f35955f = getContext();
        com.join.mgps.Util.d0.a().d(this);
        if (Build.VERSION.SDK_INT > 28 && this.f35966q.needShowPermissdialog().d().booleanValue() && !UtilsMy.m0(this.f35955f)) {
            ((WufunGameDownFirstNotPermissDialog_.IntentBuilder_) WufunGameDownFirstNotPermissDialog_.intent(this.f35955f).from(2).flags(268435456)).start();
        }
        this.f35965p = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(getContext());
        this.f35957h = o2Var;
        o2Var.S(this);
        this.f35951b.setAdapter((ListAdapter) this.f35957h);
        this.f35951b.setOnScrollListener(this);
        if (this.f35953d == null) {
            this.f35953d = ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.root);
        }
        S0();
        o0();
        loadData();
        e eVar = new e();
        this.f35956g = eVar;
        this.f35954e.setAdapter((ListAdapter) eVar);
    }

    void f1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    J0(downloadTask);
                    return;
                case 3:
                    H0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    K0(downloadTask);
                    return;
                case 6:
                    I0(downloadTask);
                    return;
            }
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void g(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).finish();
        }
    }

    boolean h0(Context context, DownloadTask downloadTask) {
        if (downloadTask != null && downloadTask.getStatus() == 5 && (!w0(downloadTask) || !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val()))) {
            boolean z4 = !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.apk.name());
            if (com.join.mgps.Util.g2.i(downloadTask.getRomType()) && (downloadTask.getUrl().endsWith(".apk") || downloadTask.getRomType().equals("androidobb") || downloadTask.getRomType().equals("46"))) {
                String packageName = downloadTask.getPackageName();
                if (!com.join.mgps.Util.g2.h(packageName) && v0(context, packageName) && !downloadTask.getTips().contains("网游") && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
                if (APKUtils.G(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getRef_crc_sign_id())) {
                    return true;
                }
                if (APKUtils.L(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
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

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
        UninstallWufunGameActivity_.R0(this.f35955f).a(str).start();
    }

    void j0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f35962m.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (!TextUtils.isEmpty(next.getCrc_link_type_val()) && next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
    }

    void k0(String str) {
        DownloadTask F2 = p1.f.K().F(str);
        Context context = getContext();
        if (F2 == null) {
            return;
        }
        boolean z4 = false;
        String fileType = F2.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(context).d(context, F2.getPackageName())) {
                if (F2.getStatus() != 5 && F2.getStatus() != 9) {
                    UtilsMy.J0(F2);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, F2.getPackageName());
                    if (l4 != null) {
                        F2.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(F2, 5);
                    A0();
                    return;
                }
                com.join.android.app.common.utils.e.l0(context).f0(context, F2.getPackageName());
                return;
            }
            UtilsMy.M0(F2);
            j0(F2);
            UtilsMy.x4(F2);
            A0();
            return;
        }
        UtilsMy.M0(F2);
        j0(F2);
        UtilsMy.x4(F2);
        A0();
    }

    void l0(String str) {
        DownloadTask F2 = p1.f.K().F(str);
        if (F2.getStatus() == 48) {
            com.join.mgps.Util.l2.a(getContext()).b("游戏安装中无法删除");
            return;
        }
        UtilsMy.O0(getContext(), F2);
        j0(F2);
        n0();
        A0();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    protected void loadData() {
        ArrayList arrayList = new ArrayList();
        this.f35958i = arrayList;
        arrayList.addAll(Arrays.asList(getContext().getResources().getStringArray(R.array.my_game_list)));
        ArrayList arrayList2 = new ArrayList();
        String d5 = this.f35966q.myGameAllTabSort().d();
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
                arrayList2.addAll(this.f35958i);
            }
        } else {
            arrayList2.addAll(this.f35958i);
        }
        try {
            List<DownloadTask> Y = p1.f.K().Y();
            List<DownloadTask> list2 = this.f35962m;
            if (list2 != null) {
                list2.clear();
            }
            if (Y != null) {
                for (DownloadTask downloadTask : Y) {
                    if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
                        if (com.join.mgps.Util.g2.i(downloadTask.getMod_info())) {
                            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
                            if (modInfoBean != null) {
                                DownloadTask F2 = p1.f.K().F(modInfoBean.getMod_game_id());
                                DownloadTask F3 = p1.f.K().F(modInfoBean.getMain_game_id());
                                boolean z4 = true;
                                boolean z5 = false;
                                boolean z6 = F2 != null && F2.getStatus() == 5;
                                if (F3 != null) {
                                    if (F3.getStatus() != 5) {
                                        z4 = false;
                                    }
                                    z5 = z4;
                                }
                                if (z6 && z5) {
                                    if (!this.f35962m.contains(F3)) {
                                        this.f35962m.add(F3);
                                    }
                                } else if (z6) {
                                    if (!this.f35962m.contains(F2)) {
                                        this.f35962m.add(F2);
                                    }
                                } else if (z5) {
                                    if (!this.f35962m.contains(F3)) {
                                        this.f35962m.add(F3);
                                    }
                                } else {
                                    this.f35962m.add(downloadTask);
                                }
                            }
                        } else if (!com.join.mgps.Util.q1.f(downloadTask.getPackageName()) || com.join.mgps.Util.q1.u(downloadTask.getCrc_link_type_val())) {
                            this.f35962m.add(downloadTask);
                        }
                    }
                }
            }
            List<DownloadTask> list3 = this.f35962m;
            if (list3 != null) {
                this.f35963n = list3.size();
            }
            if (this.f35962m.size() > 0) {
                L0();
                a1();
                return;
            }
            Z0();
        } catch (Exception e6) {
            e6.printStackTrace();
            Z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        List<GameSortBean> data;
        try {
            ResultMainBean<List<GameSortBean>> B0 = this.f35965p.B0(RequestBeanUtil.getInstance(this.f35955f).getGameSortRequestBean(com.join.android.app.common.utils.n.n(this.f35955f.getApplicationContext()).z(), ""));
            if (B0 != null && B0.getFlag() == 1 && B0.getMessages() != null && (data = B0.getMessages().getData()) != null && data.size() > 0) {
                this.f35958i.clear();
                for (GameSortBean gameSortBean : data) {
                    if (gameSortBean.getName().contains("单机")) {
                        this.f35958i.add("单机");
                    } else {
                        this.f35958i.add(gameSortBean.getName());
                    }
                }
            }
            this.f35966q.myGameAllTabSort().g(JsonMapper.getInstance().toJson(this.f35958i));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        b1();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        A0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            f1(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    f1(a5, 6);
                    return;
                } else if (c5 == 7) {
                    f1(a5, 3);
                    return;
                } else if (c5 == 8) {
                    List<DownloadTask> list = this.f35962m;
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    d1();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            f1(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            f1(a5, 8);
                            return;
                        case 13:
                            f1(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            f1(a5, 5);
        } else {
            f1(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            p0(false);
            this.f35969t = false;
            this.f35971v++;
        }
        this.f35970u = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (MApplication.Y) {
            MApplication.Y = false;
            String d5 = this.f35966q.addedShortcutGames().d();
            if (!com.join.mgps.Util.g2.h(d5)) {
                if (d5.contains(",")) {
                    for (String str : d5.split(",")) {
                        d0(str);
                    }
                } else {
                    d0(d5);
                }
            }
        }
        P0();
        com.join.mgps.adapter.o2 o2Var = this.f35957h;
        if (o2Var != null) {
            o2Var.K(true);
            A0();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f35974y = (i5 + i4) - 1;
        this.f35975z = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        List<DownloadTask> list;
        super.onVisible();
        List<CollectionBeanSubBusiness> list2 = this.B;
        if (list2 == null || list2.size() == 0 || ((list = this.f35962m) != null && this.f35963n != list.size())) {
            List<DownloadTask> list3 = this.f35962m;
            if (list3 != null) {
                this.f35963n = list3.size();
            }
            p0(true);
        }
        com.join.mgps.adapter.o2 o2Var = this.f35957h;
        if (o2Var != null) {
            o2Var.K(true);
            A0();
        }
    }

    void p0(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z4 || currentTimeMillis - this.D >= com.join.mgps.data.c.f49010a) {
            this.D = currentTimeMillis;
            try {
                if (com.join.android.app.common.utils.j.j(getContext())) {
                    String uid = AccountUtil_.getInstance_(this.f35955f).getUid();
                    String token = AccountUtil_.getInstance_(this.f35955f).getToken();
                    if (TextUtils.isEmpty(uid)) {
                        uid = "";
                    }
                    if (TextUtils.isEmpty(token)) {
                        token = "";
                    }
                    RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                    requestModel.setDefault(this.f35955f);
                    QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                    queryDownloadInfoRequestArgs.setGameId("0");
                    queryDownloadInfoRequestArgs.setDataType("1");
                    queryDownloadInfoRequestArgs.setUid(uid);
                    queryDownloadInfoRequestArgs.setToken(token);
                    requestModel.setArgs(queryDownloadInfoRequestArgs);
                    com.join.mgps.rpc.impl.i.D0().B0().i1(requestModel).enqueue(new c(z4));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    String q0(DownloadTask downloadTask) {
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
        ConstantIntEnum constantIntEnum7 = ConstantIntEnum.GBC;
        sb7.append(constantIntEnum7.value());
        sb7.append("");
        simpleArrayMap.put(sb7.toString(), constantIntEnum7.nickName());
        StringBuilder sb8 = new StringBuilder();
        ConstantIntEnum constantIntEnum8 = ConstantIntEnum.MD;
        sb8.append(constantIntEnum8.value());
        sb8.append("");
        simpleArrayMap.put(sb8.toString(), constantIntEnum8.nickName());
        simpleArrayMap.put(constantIntEnum8.value() + "", constantIntEnum8.nickName());
        StringBuilder sb9 = new StringBuilder();
        ConstantIntEnum constantIntEnum9 = ConstantIntEnum.PS;
        sb9.append(constantIntEnum9.value());
        sb9.append("");
        simpleArrayMap.put(sb9.toString(), constantIntEnum9.nickName());
        StringBuilder sb10 = new StringBuilder();
        ConstantIntEnum constantIntEnum10 = ConstantIntEnum.SFC;
        sb10.append(constantIntEnum10.value());
        sb10.append("");
        simpleArrayMap.put(sb10.toString(), constantIntEnum10.nickName());
        StringBuilder sb11 = new StringBuilder();
        ConstantIntEnum constantIntEnum11 = ConstantIntEnum.WSC;
        sb11.append(constantIntEnum11.value());
        sb11.append("");
        simpleArrayMap.put(sb11.toString(), constantIntEnum11.nickName());
        StringBuilder sb12 = new StringBuilder();
        ConstantIntEnum constantIntEnum12 = ConstantIntEnum.N64;
        sb12.append(constantIntEnum12.value());
        sb12.append("");
        simpleArrayMap.put(sb12.toString(), constantIntEnum12.nickName());
        StringBuilder sb13 = new StringBuilder();
        ConstantIntEnum constantIntEnum13 = ConstantIntEnum.ONS;
        sb13.append(constantIntEnum13.value());
        sb13.append("");
        simpleArrayMap.put(sb13.toString(), constantIntEnum13.nickName());
        StringBuilder sb14 = new StringBuilder();
        ConstantIntEnum constantIntEnum14 = ConstantIntEnum.DC;
        sb14.append(constantIntEnum14.value());
        sb14.append("");
        simpleArrayMap.put(sb14.toString(), constantIntEnum14.nickName());
        StringBuilder sb15 = new StringBuilder();
        ConstantIntEnum constantIntEnum15 = ConstantIntEnum.H5;
        sb15.append(constantIntEnum15.value());
        sb15.append("");
        simpleArrayMap.put(sb15.toString(), constantIntEnum15.nickName());
        String romType = downloadTask.getRomType();
        if (TextUtils.isEmpty(romType)) {
            downloadTask.setRomType(downloadTask.getPlugin_num());
        }
        return simpleArrayMap.containsKey(romType) ? (String) simpleArrayMap.get(romType) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                ResultMainBean<SNKGameInfoBean> V = this.f35965p.V(RequestBeanUtil.getInstance(getActivity()).getPreloadingADRequestBean());
                if (V == null || V.getCode() != 600) {
                    return;
                }
                V0(V.getMessages().getData());
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("e:");
                sb.append(e5.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        List<CollectionBeanSubBusiness> list;
        WrapContentGridView wrapContentGridView;
        if (this.f35956g != null) {
            RecommendGameAdInfo recommendGameAdInfo = this.f35967r;
            if (recommendGameAdInfo != null && recommendGameAdInfo.getList() != null && this.f35967r.getList().size() > 0 && (list = this.C) != null && list.size() > 0 && (wrapContentGridView = this.f35954e) != null && wrapContentGridView.getVisibility() == 0) {
                List<CommonGameInfoBean> list2 = this.f35967r.getList();
                CommonGameInfoBean commonGameInfoBean = list2.get(this.f35971v % list2.size());
                commonGameInfoBean.set_from(153);
                commonGameInfoBean.set_from_type(153);
                CollectionBeanSubBusiness i02 = i0(commonGameInfoBean);
                if (!t0(list2, this.C.get(0))) {
                    this.C.add(0, i02);
                    z0(commonGameInfoBean);
                } else if (!TextUtils.equals(commonGameInfoBean.getG_info().getId(), this.C.get(0).getGame_id())) {
                    this.C.set(0, i02);
                    z0(commonGameInfoBean);
                }
            }
            this.f35956g.notifyDataSetChanged();
        }
    }

    boolean v0(Context context, String str) {
        boolean z4 = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f35961l.containsKey(str) && this.f35961l.get(str) != null) {
            if (this.f35961l.get(str) != null) {
                return this.f35961l.get(str).booleanValue();
            }
            return false;
        }
        try {
            z4 = com.join.mgps.Util.g.e(context, str);
            this.f35961l.put(str, Boolean.valueOf(z4));
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return z4;
        }
    }

    boolean w0(DownloadTask downloadTask) {
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0 && next.getName().contains("单机")) {
                return true;
            }
        }
        return false;
    }

    boolean x0(String str, DownloadTask downloadTask) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (downloadTask.isFightFun() && "对战".equals(str)) {
            return true;
        }
        String q02 = q0(downloadTask);
        if (TextUtils.isEmpty(q02) || !q02.equals(str)) {
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
    public void y0() {
        MyGameUpdateManagerActivity_.J0(getContext()).start();
    }
}
