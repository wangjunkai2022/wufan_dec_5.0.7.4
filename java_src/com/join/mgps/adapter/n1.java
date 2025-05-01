package com.join.mgps.adapter;

import android.content.Context;
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
import com.join.mgps.dto.GameOLFirstBean;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameOLOpenTestAdapter.java */
/* loaded from: classes4.dex */
public class n1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f44941b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44942c;

    /* renamed from: d  reason: collision with root package name */
    private List<v1.a<GameOLFirstBean>> f44943d = new ArrayList(0);

    /* compiled from: GameOLOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f44944b;

        a(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f44944b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(n1.this.f44942c, this.f44944b.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: GameOLOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        GameOLFirstBean f44946b;

        /* renamed from: c  reason: collision with root package name */
        v1.a<GameOLFirstBean> f44947c;

        public b(v1.a<GameOLFirstBean> aVar) {
            this.f44947c = aVar;
            this.f44946b = aVar.c();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f44947c.a();
            if (a5 == null) {
                if (UtilsMy.o0(this.f44946b.getTag_info())) {
                    if (this.f44946b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(n1.this.f44942c).d(n1.this.f44942c, this.f44946b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(n1.this.f44942c).l(n1.this.f44942c, this.f44946b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44946b.getVer()) || l4.d() >= Integer.parseInt(this.f44946b.getVer())) {
                                com.join.android.app.common.utils.e.l0(n1.this.f44942c);
                                APKUtils.a0(n1.this.f44942c, this.f44946b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(n1.this.f44942c).d(n1.this.f44942c, this.f44946b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44946b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(n1.this.f44942c);
                            APKUtils.V(n1.this.f44942c, this.f44946b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(n1.this.f44942c, this.f44946b);
                return;
            }
            String plugin_num = this.f44946b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44946b.getDown_url_remote());
                UtilsMy.T2(a5, n1.this.f44942c);
                IntentUtil.getInstance().intentActivity(n1.this.f44942c, intentDateBean);
                return;
            }
            int status = a5 != null ? a5.getStatus() : 0;
            GameOLFirstBean gameOLFirstBean = this.f44946b;
            if (gameOLFirstBean != null && UtilsMy.w0(gameOLFirstBean.getPay_tag_info(), this.f44946b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(n1.this.f44942c, a5);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(n1.this.f44942c, a5);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(n1.this.f44942c)) {
                                        com.join.mgps.Util.l2.a(n1.this.f44942c).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(n1.this.f44942c, a5);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(n1.this.f44942c)) {
                                                com.join.mgps.Util.l2.a(n1.this.f44942c).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(n1.this.f44942c, a5);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(a5, n1.this.f44942c);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(a5, n1.this.f44942c);
                    return;
                }
                com.php25.PDownload.d.i(a5);
                return;
            }
            GameOLFirstBean gameOLFirstBean2 = this.f44946b;
            if (gameOLFirstBean2 != null) {
                if (UtilsMy.y0(gameOLFirstBean2.getPay_tag_info(), this.f44946b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(n1.this.f44942c, a5.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(a5, this.f44946b);
                if (UtilsMy.o1(n1.this.f44942c, a5)) {
                    return;
                }
                if (this.f44946b.getDown_status() == 5) {
                    UtilsMy.l1(n1.this.f44942c, a5);
                } else {
                    UtilsMy.R0(n1.this.f44942c, a5, this.f44946b.getTp_down_url(), this.f44946b.getOther_down_switch(), this.f44946b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: GameOLOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44949a;

        c() {
        }
    }

    /* compiled from: GameOLOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44951a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f44952b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44953c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f44954d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f44955e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f44956f;

        /* renamed from: g  reason: collision with root package name */
        private RelativeLayout f44957g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f44958h;

        /* renamed from: i  reason: collision with root package name */
        private LinearLayout f44959i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44960j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f44961k;

        /* renamed from: l  reason: collision with root package name */
        private LinearLayout f44962l;

        public d() {
        }
    }

    /* compiled from: GameOLOpenTestAdapter.java */
    /* loaded from: classes4.dex */
    class e {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44964a;

        e() {
        }
    }

    public n1(Context context) {
        this.f44941b = LayoutInflater.from(context);
        this.f44942c = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public v1.a<GameOLFirstBean> getItem(int i4) {
        return this.f44943d.get(i4);
    }

    public List<v1.a<GameOLFirstBean>> c() {
        return this.f44943d;
    }

    void d(d dVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            dVar.f44959i.setVisibility(8);
            dVar.f44955e.setVisibility(8);
            dVar.f44954d.setVisibility(8);
            dVar.f44956f.setVisibility(0);
            return;
        }
        dVar.f44959i.setVisibility(0);
        if (bool2.booleanValue()) {
            dVar.f44955e.setVisibility(8);
            dVar.f44954d.setVisibility(0);
        } else {
            dVar.f44954d.setVisibility(8);
            dVar.f44955e.setVisibility(0);
        }
        dVar.f44956f.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44943d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f44943d.get(i4).d();
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
                view2 = this.f44941b.inflate(R.layout.gameol_top_ad_layout, (ViewGroup) null);
                cVar.f44949a = (SimpleDraweeView) view2.findViewById(R.id.adImage);
                view2.setTag(cVar);
                dVar2 = null;
                cVar2 = cVar;
                eVar = null;
            } else if (itemViewType != 1) {
                if (itemViewType == 2) {
                    dVar = new d();
                    view2 = this.f44941b.inflate(R.layout.app_listview_item, (ViewGroup) null);
                    dVar.f44951a = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
                    dVar.f44952b = (ImageView) view2.findViewById(R.id.giftPackageSwich);
                    dVar.f44953c = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
                    dVar.f44957g = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
                    dVar.f44958h = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
                    dVar.f44956f = (TextView) view2.findViewById(R.id.mgListviewItemDescribe);
                    dVar.f44959i = (LinearLayout) view2.findViewById(R.id.linearLayout2);
                    dVar.f44962l = (LinearLayout) view2.findViewById(R.id.tipsLayout);
                    dVar.f44960j = (TextView) view2.findViewById(R.id.appSize);
                    dVar.f44961k = (TextView) view2.findViewById(R.id.loding_info);
                    dVar.f44955e = (ProgressBar) view2.findViewById(R.id.progressBar);
                    dVar.f44954d = (ProgressBar) view2.findViewById(R.id.progressBarZip);
                    view2.setTag(dVar);
                    dVar2 = dVar;
                    eVar = null;
                }
                view2 = view;
                eVar = null;
                dVar2 = null;
            } else {
                eVar = new e();
                view2 = this.f44941b.inflate(R.layout.gameol_top_title_layout, (ViewGroup) null);
                eVar.f44964a = (TextView) view2.findViewById(R.id.titleText);
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
            GameOLHeadAdBean b5 = this.f44943d.get(i4).b();
            MyImageLoader.d(cVar2.f44949a, R.drawable.banner_normal_icon, b5.getMain().getPic_remote());
            cVar2.f44949a.setOnClickListener(new a(b5));
        } else if (itemViewType == 1) {
            eVar.f44964a.setText(this.f44943d.get(i4).e());
        } else if (itemViewType == 2) {
            v1.a<GameOLFirstBean> aVar = this.f44943d.get(i4);
            GameOLFirstBean c5 = aVar.c();
            MyImageLoader.d(dVar2.f44951a, R.drawable.main_normal_icon, c5.getIco_remote());
            if (c5.getGift_package_switch() == 1) {
                dVar2.f44952b.setVisibility(0);
            } else {
                dVar2.f44952b.setVisibility(8);
            }
            dVar2.f44953c.setText(c5.getGame_name());
            dVar2.f44956f.setText(c5.getInfo());
            long parseDouble = (long) (Double.parseDouble(c5.getSize()) * 1024.0d * 1024.0d);
            UtilsMy.I(c5.getScore(), c5.getDown_count(), c5.getSize(), c5.getSp_tag_info(), c5.getTag_info(), dVar2.f44962l, this.f44942c);
            UtilsMy.j3(c5.getSp_tag_info(), view2, aVar.a());
            DownloadTask a5 = aVar.a();
            dVar2.f44958h.setText("");
            if (c5.getPlugin_num().equals(ConstantIntEnum.H5.value() + "")) {
                dVar2.f44958h.setBackgroundResource(R.drawable.recom_blue_butn);
                dVar2.f44958h.setText("开始");
                dVar2.f44958h.setTextColor(this.f44942c.getResources().getColor(R.color.app_blue_color));
                dVar2.f44952b.setVisibility(8);
            } else if (a5 == null) {
                d(dVar2, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(c5.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44942c).d(this.f44942c, c5.getPackage_name()) && UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44942c).l(this.f44942c, c5.getPackage_name());
                        if (com.join.mgps.Util.g2.i(c5.getVer()) && l4.d() < Integer.parseInt(c5.getVer())) {
                            dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                            dVar2.f44958h.setText("更新");
                            dVar2.f44958h.setTextColor(-9263087);
                        } else {
                            dVar2.f44958h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            dVar2.f44958h.setText(this.f44942c.getResources().getString(R.string.download_status_finished));
                            dVar2.f44958h.setTextColor(-688602);
                        }
                    } else {
                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                        UtilsMy.Z2(dVar2.f44958h, dVar2.f44957g, c5);
                    }
                } else {
                    dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                    UtilsMy.Z2(dVar2.f44958h, dVar2.f44957g, c5);
                }
            } else {
                com.join.mgps.Util.v0.d("infoo", a5.getStatus() + " dd " + a5.getShowName());
                int status = a5.getStatus();
                if (UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        dVar2.f44958h.setText("暂停中");
                    } else if (status == 48) {
                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44958h.setText("安装中");
                        dVar2.f44958h.setTextColor(this.f44942c.getResources().getColor(R.color.app_blue_color));
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
                                                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                                                        dVar2.f44958h.setText("更新");
                                                        dVar2.f44958h.setTextColor(-9263087);
                                                        d(dVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        dVar2.f44958h.setText("等待");
                                                        dVar2.f44958h.setTextColor(-12941854);
                                                        Boolean bool = Boolean.FALSE;
                                                        d(dVar2, bool, bool);
                                                        dVar2.f44960j.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        try {
                                                            dVar2.f44955e.setProgress((int) a5.getProgress());
                                                        } catch (Exception e5) {
                                                            e5.printStackTrace();
                                                        }
                                                        dVar2.f44961k.setText("等待中");
                                                        break;
                                                    case 11:
                                                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                                                        dVar2.f44958h.setText("安装");
                                                        dVar2.f44958h.setTextColor(-9263087);
                                                        d(dVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        d(dVar2, Boolean.FALSE, Boolean.TRUE);
                                                        dVar2.f44960j.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        dVar2.f44961k.setText("解压中..");
                                                        dVar2.f44954d.setProgress((int) a5.getProgress());
                                                        dVar2.f44958h.setBackgroundResource(R.drawable.extract);
                                                        dVar2.f44958h.setText("解压中");
                                                        dVar2.f44958h.setTextColor(-4868683);
                                                        break;
                                                    case 13:
                                                        d(dVar2, Boolean.FALSE, Boolean.TRUE);
                                                        dVar2.f44960j.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        dVar2.f44961k.setText("点击重新解压");
                                                        dVar2.f44954d.setProgress((int) a5.getProgress());
                                                        dVar2.f44958h.setBackgroundResource(R.drawable.reextract);
                                                        dVar2.f44958h.setText("解压");
                                                        dVar2.f44958h.setTextColor(-12941854);
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            dVar2.f44958h.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            dVar2.f44958h.setText(this.f44942c.getResources().getString(R.string.download_status_finished));
                            dVar2.f44958h.setTextColor(-688602);
                            Boolean bool2 = Boolean.TRUE;
                            d(dVar2, bool2, bool2);
                        }
                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44958h.setText("继续");
                        dVar2.f44958h.setTextColor(-12941854);
                        Boolean bool3 = Boolean.FALSE;
                        d(dVar2, bool3, bool3);
                        try {
                            if (a5.getSize() == 0) {
                                dVar2.f44960j.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                dVar2.f44960j.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            dVar2.f44955e.setProgress((int) a5.getProgress());
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        dVar2.f44961k.setText("暂停中");
                    } else {
                        UtilsMy.x4(a5);
                        dVar2.f44958h.setBackgroundResource(R.drawable.recom_blue_butn);
                        dVar2.f44958h.setText("暂停");
                        dVar2.f44958h.setTextColor(-12941854);
                        Boolean bool4 = Boolean.FALSE;
                        d(dVar2, bool4, bool4);
                        if (a5.getSize() == 0) {
                            dVar2.f44960j.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            dVar2.f44960j.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        dVar2.f44955e.setProgress((int) a5.getProgress());
                        String speed = a5.getSpeed();
                        dVar2.f44961k.setText(speed + "/S");
                    }
                }
                dVar2.f44958h.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                UtilsMy.Z2(dVar2.f44958h, dVar2.f44957g, c5);
                d(dVar2, Boolean.TRUE, Boolean.FALSE);
            }
            dVar2.f44957g.setOnClickListener(new b(aVar));
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
