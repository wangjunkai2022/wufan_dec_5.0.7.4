package com.join.mgps.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.GameOLNoOpenTestBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameOLNoOpenTestAdapter.java */
/* loaded from: classes4.dex */
public class m1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f44852b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44853c;

    /* renamed from: d  reason: collision with root package name */
    private List<v1.a<GameOLNoOpenTestBean>> f44854d = new ArrayList(0);

    /* compiled from: GameOLNoOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f44855b;

        a(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f44855b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(m1.this.f44853c, this.f44855b.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: GameOLNoOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        GameOLNoOpenTestBean f44857b;

        /* renamed from: c  reason: collision with root package name */
        v1.a<GameOLNoOpenTestBean> f44858c;

        public b(v1.a<GameOLNoOpenTestBean> aVar) {
            this.f44858c = aVar;
            this.f44857b = aVar.c();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f44858c.a();
            if (a5 == null) {
                if (UtilsMy.o0(this.f44857b.getTag_info())) {
                    if (this.f44857b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(m1.this.f44853c).d(m1.this.f44853c, this.f44857b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(m1.this.f44853c).l(m1.this.f44853c, this.f44857b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44857b.getVer()) || l4.d() >= Integer.parseInt(this.f44857b.getVer())) {
                                com.join.android.app.common.utils.e.l0(m1.this.f44853c);
                                APKUtils.a0(m1.this.f44853c, this.f44857b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(m1.this.f44853c).d(m1.this.f44853c, this.f44857b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44857b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(m1.this.f44853c);
                            APKUtils.V(m1.this.f44853c, this.f44857b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(m1.this.f44853c, this.f44857b);
                return;
            }
            String plugin_num = this.f44857b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44857b.getDown_url_remote());
                UtilsMy.T2(a5, m1.this.f44853c);
                IntentUtil.getInstance().intentActivity(m1.this.f44853c, intentDateBean);
                return;
            }
            int status = a5 != null ? a5.getStatus() : 0;
            GameOLNoOpenTestBean gameOLNoOpenTestBean = this.f44857b;
            if (gameOLNoOpenTestBean != null && UtilsMy.w0(gameOLNoOpenTestBean.getPay_tag_info(), this.f44857b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(m1.this.f44853c, a5);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(m1.this.f44853c, a5);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(m1.this.f44853c)) {
                                        com.join.mgps.Util.l2.a(m1.this.f44853c).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(m1.this.f44853c, a5);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(m1.this.f44853c)) {
                                                com.join.mgps.Util.l2.a(m1.this.f44853c).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(m1.this.f44853c, a5);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(a5, m1.this.f44853c);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(a5, m1.this.f44853c);
                    return;
                }
                com.php25.PDownload.d.i(a5);
                return;
            }
            GameOLNoOpenTestBean gameOLNoOpenTestBean2 = this.f44857b;
            if (gameOLNoOpenTestBean2 != null) {
                if (UtilsMy.y0(gameOLNoOpenTestBean2.getPay_tag_info(), this.f44857b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(m1.this.f44853c, a5.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(a5, this.f44857b);
                if (UtilsMy.o1(m1.this.f44853c, a5)) {
                    return;
                }
                if (this.f44857b.getDown_status() == 5) {
                    UtilsMy.l1(m1.this.f44853c, a5);
                } else {
                    UtilsMy.R0(m1.this.f44853c, a5, this.f44857b.getTp_down_url(), this.f44857b.getOther_down_switch(), this.f44857b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: GameOLNoOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44860a;

        c() {
        }
    }

    /* compiled from: GameOLNoOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44862a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f44863b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44864c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f44865d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f44866e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f44867f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f44868g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f44869h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f44870i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f44871j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f44872k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f44873l;

        /* renamed from: m  reason: collision with root package name */
        private TextView f44874m;

        public d() {
        }
    }

    /* compiled from: GameOLNoOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class e {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44876a;

        e() {
        }
    }

    public m1(Context context) {
        this.f44852b = LayoutInflater.from(context);
        this.f44853c = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public v1.a<GameOLNoOpenTestBean> getItem(int i4) {
        return this.f44854d.get(i4);
    }

    public List<v1.a<GameOLNoOpenTestBean>> c() {
        return this.f44854d;
    }

    void d(d dVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            dVar.f44871j.setVisibility(8);
            dVar.f44866e.setVisibility(8);
            dVar.f44865d.setVisibility(8);
            dVar.f44867f.setVisibility(0);
            dVar.f44868g.setVisibility(0);
            dVar.f44874m.setVisibility(0);
            return;
        }
        dVar.f44871j.setVisibility(0);
        if (bool2.booleanValue()) {
            dVar.f44866e.setVisibility(8);
            dVar.f44865d.setVisibility(0);
        } else {
            dVar.f44865d.setVisibility(8);
            dVar.f44866e.setVisibility(0);
        }
        dVar.f44867f.setVisibility(8);
        dVar.f44868g.setVisibility(8);
        dVar.f44874m.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44854d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f44854d.get(i4).d();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        View view2;
        e eVar;
        d dVar;
        d dVar2;
        int itemViewType = getItemViewType(i4);
        c cVar2 = null;
        if (view == null) {
            if (itemViewType == 0) {
                cVar = new c();
                view2 = this.f44852b.inflate(R.layout.gameol_top_ad_layout, (ViewGroup) null);
                cVar.f44860a = (SimpleDraweeView) view2.findViewById(R.id.adImage);
                view2.setTag(cVar);
                dVar2 = null;
                cVar2 = cVar;
                eVar = null;
            } else if (itemViewType != 1) {
                if (itemViewType == 2) {
                    dVar = new d();
                    view2 = this.f44852b.inflate(R.layout.gameol_noopentest_listview_item, (ViewGroup) null);
                    dVar.f44862a = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
                    dVar.f44863b = (ImageView) view2.findViewById(R.id.giftPackageSwich);
                    dVar.f44864c = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
                    dVar.f44865d = (ProgressBar) view2.findViewById(R.id.progressBarZip);
                    dVar.f44866e = (ProgressBar) view2.findViewById(R.id.progressBar);
                    dVar.f44867f = (TextView) view2.findViewById(R.id.privilege);
                    dVar.f44868g = (TextView) view2.findViewById(R.id.testTime);
                    dVar.f44874m = (TextView) view2.findViewById(R.id.statues);
                    dVar.f44869h = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
                    dVar.f44870i = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
                    dVar.f44871j = (LinearLayout) view2.findViewById(R.id.linearLayout2);
                    dVar.f44872k = (TextView) view2.findViewById(R.id.appSize);
                    dVar.f44873l = (TextView) view2.findViewById(R.id.loding_info);
                    view2.setTag(dVar);
                    dVar2 = dVar;
                    eVar = null;
                }
                view2 = view;
                eVar = null;
                dVar2 = null;
            } else {
                eVar = new e();
                view2 = this.f44852b.inflate(R.layout.gameol_top_title_layout, (ViewGroup) null);
                eVar.f44876a = (TextView) view2.findViewById(R.id.titleText);
                view2.setTag(eVar);
                dVar2 = null;
            }
        } else if (itemViewType == 0) {
            cVar = (c) view.getTag();
            view2 = view;
            dVar2 = null;
            cVar2 = cVar;
            eVar = null;
        } else if (itemViewType != 1) {
            if (itemViewType == 2) {
                dVar = (d) view.getTag();
                view2 = view;
                dVar2 = dVar;
                eVar = null;
            }
            view2 = view;
            eVar = null;
            dVar2 = null;
        } else {
            eVar = (e) view.getTag();
            view2 = view;
            dVar2 = null;
        }
        if (itemViewType == 0) {
            GameOLHeadAdBean b5 = this.f44854d.get(i4).b();
            MyImageLoader.d(cVar2.f44860a, R.drawable.banner_normal_icon, b5.getMain().getPic_remote());
            cVar2.f44860a.setOnClickListener(new a(b5));
        } else if (itemViewType == 1) {
            eVar.f44876a.setText(this.f44854d.get(i4).e());
        } else if (itemViewType == 2) {
            v1.a<GameOLNoOpenTestBean> aVar = this.f44854d.get(i4);
            GameOLNoOpenTestBean c5 = aVar.c();
            UtilsMy.j3(c5.getSp_tag_info(), view2, aVar.a());
            MyImageLoader.d(dVar2.f44862a, R.drawable.main_normal_icon, c5.getIco_remote());
            if (c5.getGift_package_switch() == 1) {
                dVar2.f44863b.setVisibility(0);
            } else {
                dVar2.f44863b.setVisibility(8);
            }
            dVar2.f44864c.setText(c5.getGame_name());
            String game_open_time = c5.getGame_open_time();
            if (com.join.mgps.Util.g2.i(game_open_time)) {
                long parseLong = Long.parseLong(game_open_time + "000");
                dVar2.f44868g.setText("开测时间:" + com.join.mgps.Util.y.q(parseLong));
            }
            dVar2.f44867f.setText(Html.fromHtml("悟饭特权:" + c5.getPapa_privilege()), TextView.BufferType.SPANNABLE);
            dVar2.f44874m.setText(Html.fromHtml("游戏状态:" + c5.getGame_status()), TextView.BufferType.SPANNABLE);
            long parseDouble = (long) (Double.parseDouble(c5.getSize()) * 1024.0d * 1024.0d);
            DownloadTask a5 = aVar.a();
            dVar2.f44870i.setText("");
            if (c5.getPlugin_num().equals(ConstantIntEnum.H5.value() + "")) {
                dVar2.f44870i.setBackgroundResource(R.drawable.recom_blue_butn);
                dVar2.f44870i.setText("开始");
                dVar2.f44870i.setTextColor(this.f44853c.getResources().getColor(R.color.app_blue_color));
                dVar2.f44863b.setVisibility(8);
            } else if (a5 == null) {
                d(dVar2, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(c5.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44853c).d(this.f44853c, c5.getPackage_name()) && UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44853c).l(this.f44853c, c5.getPackage_name());
                        if (com.join.mgps.Util.g2.i(c5.getVer()) && l4.d() < Integer.parseInt(c5.getVer())) {
                            dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                            dVar2.f44870i.setText("更新");
                            dVar2.f44870i.setTextColor(-9263087);
                        } else {
                            dVar2.f44870i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            dVar2.f44870i.setText(this.f44853c.getResources().getString(R.string.download_status_finished));
                            dVar2.f44870i.setTextColor(-688602);
                        }
                    } else {
                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                        UtilsMy.Z2(dVar2.f44870i, dVar2.f44869h, c5);
                    }
                } else {
                    dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                    UtilsMy.Z2(dVar2.f44870i, dVar2.f44869h, c5);
                }
            } else {
                com.join.mgps.Util.v0.d("infoo", a5.getStatus() + " dd " + a5.getShowName());
                int status = a5.getStatus();
                if (UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        dVar2.f44870i.setText("暂停中");
                    } else if (status == 48) {
                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44870i.setText("安装中");
                        dVar2.f44870i.setTextColor(-12941854);
                        d(dVar2, Boolean.TRUE, Boolean.FALSE);
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        dVar2.f44870i.setText("更新");
                                                        dVar2.f44870i.setTextColor(-9263087);
                                                        d(dVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        dVar2.f44870i.setText("等待");
                                                        dVar2.f44870i.setTextColor(-12941854);
                                                        Boolean bool = Boolean.FALSE;
                                                        d(dVar2, bool, bool);
                                                        dVar2.f44872k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        try {
                                                            dVar2.f44866e.setProgress((int) a5.getProgress());
                                                        } catch (Exception e5) {
                                                            e5.printStackTrace();
                                                        }
                                                        dVar2.f44873l.setText("等待中");
                                                        break;
                                                    case 11:
                                                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        dVar2.f44870i.setText("安装");
                                                        dVar2.f44870i.setTextColor(-9263087);
                                                        d(dVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        d(dVar2, Boolean.FALSE, Boolean.TRUE);
                                                        dVar2.f44872k.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        dVar2.f44873l.setText("解压中..");
                                                        dVar2.f44865d.setProgress((int) a5.getProgress());
                                                        dVar2.f44870i.setBackgroundResource(R.drawable.extract);
                                                        dVar2.f44870i.setText("解压中");
                                                        dVar2.f44870i.setTextColor(-4868683);
                                                        break;
                                                    case 13:
                                                        d(dVar2, Boolean.FALSE, Boolean.TRUE);
                                                        dVar2.f44872k.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        dVar2.f44873l.setText("点击重新解压");
                                                        dVar2.f44865d.setProgress((int) a5.getProgress());
                                                        dVar2.f44870i.setBackgroundResource(R.drawable.reextract);
                                                        dVar2.f44870i.setText("解压");
                                                        dVar2.f44870i.setTextColor(-12941854);
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            dVar2.f44870i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            dVar2.f44870i.setText(this.f44853c.getResources().getString(R.string.download_status_finished));
                            dVar2.f44870i.setTextColor(-688602);
                            Boolean bool2 = Boolean.TRUE;
                            d(dVar2, bool2, bool2);
                        }
                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44870i.setText("继续");
                        dVar2.f44870i.setTextColor(-12941854);
                        Boolean bool3 = Boolean.FALSE;
                        d(dVar2, bool3, bool3);
                        try {
                            if (a5.getSize() == 0) {
                                dVar2.f44872k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                dVar2.f44872k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            dVar2.f44866e.setProgress((int) a5.getProgress());
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        dVar2.f44873l.setText("暂停中");
                    } else {
                        UtilsMy.x4(a5);
                        dVar2.f44870i.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44870i.setText("暂停");
                        dVar2.f44870i.setTextColor(-12941854);
                        Boolean bool4 = Boolean.FALSE;
                        d(dVar2, bool4, bool4);
                        if (a5.getSize() == 0) {
                            dVar2.f44872k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            dVar2.f44872k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        dVar2.f44866e.setProgress((int) a5.getProgress());
                        String speed = a5.getSpeed();
                        dVar2.f44873l.setText(speed + "/S");
                    }
                }
                dVar2.f44870i.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                UtilsMy.Z2(dVar2.f44870i, dVar2.f44869h, c5);
                d(dVar2, Boolean.TRUE, Boolean.FALSE);
            }
            dVar2.f44869h.setOnClickListener(new b(aVar));
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
