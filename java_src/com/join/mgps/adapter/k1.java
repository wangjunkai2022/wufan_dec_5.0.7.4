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
/* compiled from: GameOLFirstAdapter.java */
/* loaded from: classes4.dex */
public class k1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f44486b;

    /* renamed from: c  reason: collision with root package name */
    private Context f44487c;

    /* renamed from: d  reason: collision with root package name */
    private List<v1.a<GameOLFirstBean>> f44488d = new ArrayList(0);

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameOLHeadAdBean f44489b;

        a(GameOLHeadAdBean gameOLHeadAdBean) {
            this.f44489b = gameOLHeadAdBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(k1.this.f44487c, this.f44489b.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        GameOLFirstBean f44492b;

        /* renamed from: c  reason: collision with root package name */
        v1.a<GameOLFirstBean> f44493c;

        public c(v1.a<GameOLFirstBean> aVar) {
            this.f44493c = aVar;
            this.f44492b = aVar.c();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f44493c.a();
            if (a5 == null) {
                if (UtilsMy.o0(this.f44492b.getTag_info())) {
                    if (this.f44492b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(k1.this.f44487c).d(k1.this.f44487c, this.f44492b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(k1.this.f44487c).l(k1.this.f44487c, this.f44492b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44492b.getVer()) || l4.d() >= Integer.parseInt(this.f44492b.getVer())) {
                                com.join.android.app.common.utils.e.l0(k1.this.f44487c);
                                APKUtils.a0(k1.this.f44487c, this.f44492b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(k1.this.f44487c).d(k1.this.f44487c, this.f44492b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44492b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(k1.this.f44487c);
                            APKUtils.V(k1.this.f44487c, this.f44492b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(k1.this.f44487c, this.f44492b);
                return;
            }
            String plugin_num = this.f44492b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44492b.getDown_url_remote());
                UtilsMy.T2(a5, k1.this.f44487c);
                IntentUtil.getInstance().intentActivity(k1.this.f44487c, intentDateBean);
                return;
            }
            int status = a5 != null ? a5.getStatus() : 0;
            GameOLFirstBean gameOLFirstBean = this.f44492b;
            if (gameOLFirstBean != null && UtilsMy.w0(gameOLFirstBean.getPay_tag_info(), this.f44492b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 13) {
                    com.php25.PDownload.d.l(k1.this.f44487c, a5);
                    return;
                }
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(k1.this.f44487c, a5);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(k1.this.f44487c)) {
                                        com.join.mgps.Util.l2.a(k1.this.f44487c).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(k1.this.f44487c, a5);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(k1.this.f44487c)) {
                                                com.join.mgps.Util.l2.a(k1.this.f44487c).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(k1.this.f44487c, a5);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(a5, k1.this.f44487c);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(a5, k1.this.f44487c);
                    return;
                }
                com.php25.PDownload.d.i(a5);
                return;
            }
            GameOLFirstBean gameOLFirstBean2 = this.f44492b;
            if (gameOLFirstBean2 != null) {
                if (UtilsMy.y0(gameOLFirstBean2.getPay_tag_info(), this.f44492b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(k1.this.f44487c, a5.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(a5, this.f44492b);
                if (UtilsMy.o1(k1.this.f44487c, a5)) {
                    return;
                }
                if (this.f44492b.getDown_status() == 5) {
                    UtilsMy.l1(k1.this.f44487c, a5);
                } else {
                    UtilsMy.R0(k1.this.f44487c, a5, this.f44492b.getTp_down_url(), this.f44492b.getOther_down_switch(), this.f44492b.getCdn_down_switch());
                }
            }
        }
    }

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44495a;

        d() {
        }
    }

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44497a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f44498b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44499c;

        /* renamed from: d  reason: collision with root package name */
        public ProgressBar f44500d;

        /* renamed from: e  reason: collision with root package name */
        public ProgressBar f44501e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f44502f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f44503g;

        /* renamed from: h  reason: collision with root package name */
        private RelativeLayout f44504h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f44505i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f44506j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f44507k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f44508l;

        public e() {
        }
    }

    /* compiled from: GameOLFirstAdapter.java */
    /* loaded from: classes4.dex */
    class f {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44510a;

        f() {
        }
    }

    public k1(Context context) {
        this.f44486b = LayoutInflater.from(context);
        this.f44487c = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public v1.a<GameOLFirstBean> getItem(int i4) {
        return this.f44488d.get(i4);
    }

    public List<v1.a<GameOLFirstBean>> c() {
        return this.f44488d;
    }

    void d(e eVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            eVar.f44506j.setVisibility(8);
            eVar.f44501e.setVisibility(8);
            eVar.f44500d.setVisibility(8);
            eVar.f44502f.setVisibility(0);
            eVar.f44503g.setVisibility(0);
            return;
        }
        eVar.f44506j.setVisibility(0);
        if (bool2.booleanValue()) {
            eVar.f44501e.setVisibility(8);
            eVar.f44500d.setVisibility(0);
        } else {
            eVar.f44500d.setVisibility(8);
            eVar.f44501e.setVisibility(0);
        }
        eVar.f44502f.setVisibility(8);
        eVar.f44503g.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44488d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f44488d.get(i4).d();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        View view2;
        f fVar;
        e eVar;
        e eVar2;
        int itemViewType = getItemViewType(i4);
        d dVar2 = null;
        if (view == null) {
            if (itemViewType == 0) {
                dVar = new d();
                view2 = this.f44486b.inflate(R.layout.gameol_top_ad_layout, (ViewGroup) null);
                dVar.f44495a = (SimpleDraweeView) view2.findViewById(R.id.adImage);
                view2.setTag(dVar);
                eVar2 = null;
                dVar2 = dVar;
                fVar = null;
            } else if (itemViewType != 1) {
                if (itemViewType == 2) {
                    eVar = new e();
                    view2 = this.f44486b.inflate(R.layout.gameol_first_listview_item, (ViewGroup) null);
                    eVar.f44497a = (SimpleDraweeView) view2.findViewById(R.id.mgListviewItemIcon);
                    eVar.f44498b = (ImageView) view2.findViewById(R.id.giftPackageSwich);
                    eVar.f44499c = (TextView) view2.findViewById(R.id.mgListviewItemAppname);
                    eVar.f44500d = (ProgressBar) view2.findViewById(R.id.progressBarZip);
                    eVar.f44501e = (ProgressBar) view2.findViewById(R.id.progressBar);
                    eVar.f44502f = (TextView) view2.findViewById(R.id.privilege);
                    eVar.f44503g = (TextView) view2.findViewById(R.id.mgListviewItemDescribe);
                    eVar.f44504h = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
                    eVar.f44505i = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
                    eVar.f44506j = (LinearLayout) view2.findViewById(R.id.linearLayout2);
                    eVar.f44507k = (TextView) view2.findViewById(R.id.appSize);
                    eVar.f44508l = (TextView) view2.findViewById(R.id.loding_info);
                    view2.setTag(eVar);
                    eVar2 = eVar;
                    fVar = null;
                }
                view2 = view;
                fVar = null;
                eVar2 = null;
            } else {
                fVar = new f();
                view2 = this.f44486b.inflate(R.layout.gameol_top_title_layout, (ViewGroup) null);
                fVar.f44510a = (TextView) view2.findViewById(R.id.titleText);
                view2.setTag(fVar);
                eVar2 = null;
            }
        } else if (itemViewType == 0) {
            dVar = (d) view.getTag();
            view2 = view;
            eVar2 = null;
            dVar2 = dVar;
            fVar = null;
        } else if (itemViewType != 1) {
            if (itemViewType == 2) {
                eVar = (e) view.getTag();
                view2 = view;
                eVar2 = eVar;
                fVar = null;
            }
            view2 = view;
            fVar = null;
            eVar2 = null;
        } else {
            fVar = (f) view.getTag();
            view2 = view;
            eVar2 = null;
        }
        if (itemViewType == 0) {
            GameOLHeadAdBean b5 = this.f44488d.get(i4).b();
            MyImageLoader.d(dVar2.f44495a, R.drawable.banner_normal_icon, b5.getMain().getPic_remote());
            dVar2.f44495a.setOnClickListener(new a(b5));
        } else if (itemViewType == 1) {
            fVar.f44510a.setText(this.f44488d.get(i4).e());
        } else if (itemViewType == 2) {
            v1.a<GameOLFirstBean> aVar = this.f44488d.get(i4);
            GameOLFirstBean c5 = aVar.c();
            MyImageLoader.d(eVar2.f44497a, R.drawable.banner_normal_icon, c5.getIco_remote());
            if (c5.getGift_package_switch() == 1) {
                eVar2.f44498b.setVisibility(0);
            } else {
                eVar2.f44498b.setVisibility(8);
            }
            eVar2.f44499c.setText(c5.getGame_name());
            eVar2.f44503g.setText(c5.getInfo());
            eVar2.f44502f.setText("悟饭特权：" + c5.getPapa_privilege());
            eVar2.f44504h.setOnClickListener(new b());
            long parseDouble = (long) (Double.parseDouble(c5.getSize()) * 1024.0d * 1024.0d);
            DownloadTask a5 = aVar.a();
            eVar2.f44505i.setText("");
            UtilsMy.j3(c5.getSp_tag_info(), view2, a5);
            if (c5.getPlugin_num().equals(ConstantIntEnum.H5.value() + "")) {
                eVar2.f44505i.setBackgroundResource(R.drawable.recom_blue_butn);
                eVar2.f44505i.setText("开始");
                eVar2.f44505i.setTextColor(this.f44487c.getResources().getColor(R.color.app_blue_color));
                eVar2.f44498b.setVisibility(8);
            } else if (a5 == null) {
                d(eVar2, Boolean.TRUE, Boolean.FALSE);
                if (UtilsMy.o0(c5.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44487c).d(this.f44487c, c5.getPackage_name()) && UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44487c).l(this.f44487c, c5.getPackage_name());
                        if (com.join.mgps.Util.g2.i(c5.getVer()) && l4.d() < Integer.parseInt(c5.getVer())) {
                            eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                            eVar2.f44505i.setText("更新");
                            eVar2.f44505i.setTextColor(-9263087);
                        } else {
                            eVar2.f44505i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            eVar2.f44505i.setText(eVar2.f44505i.getResources().getString(R.string.download_status_finished));
                            eVar2.f44505i.setTextColor(-688602);
                        }
                    } else {
                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                        UtilsMy.Z2(eVar2.f44505i, eVar2.f44504h, c5);
                    }
                } else {
                    eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                    UtilsMy.Z2(eVar2.f44505i, eVar2.f44504h, c5);
                }
            } else {
                com.join.mgps.Util.v0.d("infoo", a5.getStatus() + " dd " + a5.getShowName());
                int status = a5.getStatus();
                if (UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 27) {
                        eVar2.f44505i.setText("暂停中");
                    } else if (status == 48) {
                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_blue_butn);
                        eVar2.f44505i.setText("安装中");
                        eVar2.f44505i.setTextColor(-9263087);
                        d(eVar2, Boolean.TRUE, Boolean.FALSE);
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        if (status != 42) {
                                            if (status != 43) {
                                                switch (status) {
                                                    case 9:
                                                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        eVar2.f44505i.setText("更新");
                                                        eVar2.f44505i.setTextColor(-9263087);
                                                        d(eVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 10:
                                                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        eVar2.f44505i.setText("等待");
                                                        eVar2.f44505i.setTextColor(-12941854);
                                                        Boolean bool = Boolean.FALSE;
                                                        d(eVar2, bool, bool);
                                                        eVar2.f44507k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        try {
                                                            eVar2.f44501e.setProgress((int) a5.getProgress());
                                                        } catch (Exception e5) {
                                                            e5.printStackTrace();
                                                        }
                                                        eVar2.f44508l.setText("等待中");
                                                        break;
                                                    case 11:
                                                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                                                        eVar2.f44505i.setText("安装");
                                                        eVar2.f44505i.setTextColor(-9263087);
                                                        d(eVar2, Boolean.TRUE, Boolean.FALSE);
                                                        break;
                                                    case 12:
                                                        d(eVar2, Boolean.FALSE, Boolean.TRUE);
                                                        eVar2.f44507k.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        eVar2.f44508l.setText("解压中..");
                                                        eVar2.f44500d.setProgress((int) a5.getProgress());
                                                        eVar2.f44505i.setBackgroundResource(R.drawable.extract);
                                                        eVar2.f44505i.setText("解压中");
                                                        eVar2.f44505i.setTextColor(-4868683);
                                                        break;
                                                    case 13:
                                                        d(eVar2, Boolean.FALSE, Boolean.TRUE);
                                                        eVar2.f44507k.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        eVar2.f44508l.setText("点击重新解压");
                                                        eVar2.f44500d.setProgress((int) a5.getProgress());
                                                        eVar2.f44505i.setBackgroundResource(R.drawable.reextract);
                                                        eVar2.f44505i.setText("解压");
                                                        eVar2.f44505i.setTextColor(-12941854);
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            eVar2.f44505i.setBackgroundResource(R.drawable.recom_maincolor_butn);
                            eVar2.f44505i.setText(this.f44487c.getResources().getString(R.string.download_status_finished));
                            eVar2.f44505i.setTextColor(-688602);
                            Boolean bool2 = Boolean.TRUE;
                            d(eVar2, bool2, bool2);
                        }
                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_blue_butn);
                        eVar2.f44505i.setText("继续");
                        eVar2.f44505i.setTextColor(-12941854);
                        Boolean bool3 = Boolean.FALSE;
                        d(eVar2, bool3, bool3);
                        try {
                            if (a5.getSize() == 0) {
                                eVar2.f44507k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                eVar2.f44507k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            eVar2.f44501e.setProgress((int) a5.getProgress());
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        eVar2.f44508l.setText("暂停中");
                    } else {
                        UtilsMy.x4(a5);
                        eVar2.f44505i.setBackgroundResource(R.drawable.recom_blue_butn);
                        eVar2.f44505i.setText("暂停");
                        eVar2.f44505i.setTextColor(-12941854);
                        Boolean bool4 = Boolean.FALSE;
                        d(eVar2, bool4, bool4);
                        if (a5.getSize() == 0) {
                            eVar2.f44507k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            eVar2.f44507k.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        eVar2.f44501e.setProgress((int) a5.getProgress());
                        String speed = a5.getSpeed();
                        eVar2.f44508l.setText(speed + "/S");
                    }
                }
                eVar2.f44505i.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(c5.getPay_tag_info(), c5.getCrc_sign_id());
                UtilsMy.Z2(eVar2.f44505i, eVar2.f44504h, c5);
                d(eVar2, Boolean.TRUE, Boolean.FALSE);
            }
            eVar2.f44504h.setOnClickListener(new c(aVar));
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
