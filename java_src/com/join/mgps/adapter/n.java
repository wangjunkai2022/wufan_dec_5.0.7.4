package com.join.mgps.adapter;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.ExtFrom;
import com.umeng.analytics.MobclickAgent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DownloadCenterAdapter1.java */
/* loaded from: classes4.dex */
public class n extends m {

    /* renamed from: f  reason: collision with root package name */
    private String f44889f;

    /* renamed from: g  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f44890g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter1.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44891b;

        a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44891b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f44891b.getIntentDataBean();
            intentDataBean.setFrom("");
            ExtBean extBean = new ExtBean();
            extBean.setFrom("114");
            extBean.set_from_type(114);
            intentDataBean.setExtBean(extBean);
            if (TextUtils.isEmpty(intentDataBean.getCrc_link_type_val())) {
                intentDataBean.setCrc_link_type_val(this.f44891b.getCrc_sign_id());
            }
            IntentUtil.getInstance().intentActivity(n.this.f44670c, intentDataBean);
            MobclickAgent.onEvent(n.this.f44670c, "enterDetailFromGC4.2.0.6");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter1.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44893b;

        /* renamed from: c  reason: collision with root package name */
        CollectionBeanSubBusiness f44894c;

        /* renamed from: d  reason: collision with root package name */
        int f44895d;

        /* renamed from: e  reason: collision with root package name */
        String f44896e;

        public b(CollectionBeanSubBusiness collectionBeanSubBusiness, int i4, String str) {
            this.f44893b = collectionBeanSubBusiness;
            this.f44894c = collectionBeanSubBusiness;
            this.f44895d = i4;
            this.f44896e = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44894c.getDownloadTask();
            if (!this.f44896e.startsWith("4-") && !this.f44896e.startsWith("6-")) {
                this.f44896e.startsWith("5-");
            }
            n nVar = n.this;
            nVar.q(this.f44896e + 1);
            String plugin_num = this.f44893b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44893b.getDown_url_remote());
                if (downloadTask == null) {
                    downloadTask = this.f44893b.getDownloadtaskDown();
                }
                UtilsMy.T2(downloadTask, n.this.f44670c);
                IntentUtil.getInstance().intentActivity(n.this.f44670c, intentDateBean);
            } else if (downloadTask == null) {
                if (UtilsMy.o0(this.f44893b.getTag_info())) {
                    if (this.f44893b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(n.this.f44670c).d(n.this.f44670c, this.f44893b.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(n.this.f44670c).l(n.this.f44670c, this.f44893b.getPackageName());
                            if (!com.join.mgps.Util.g2.i(this.f44893b.getVer()) || l4.d() >= Integer.parseInt(this.f44893b.getVer())) {
                                com.join.android.app.common.utils.e.l0(n.this.f44670c);
                                APKUtils.a0(n.this.f44670c, this.f44893b.getPackageName());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(n.this.f44670c).d(n.this.f44670c, this.f44893b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44893b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(n.this.f44670c);
                            APKUtils.V(n.this.f44670c, this.f44893b.getMod_info());
                            return;
                        }
                    }
                }
                if (UtilsMy.y0(this.f44893b.getPay_tag_info(), this.f44893b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(n.this.f44670c, this.f44893b.getCrc_sign_id());
                } else {
                    UtilsMy.Y0(n.this.f44670c, this.f44893b);
                }
            } else {
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                CollectionBeanSubBusiness collectionBeanSubBusiness = this.f44893b;
                if (collectionBeanSubBusiness != null && UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), this.f44893b.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status != 13) {
                        if (status != 2) {
                            if (status != 3) {
                                if (status == 5) {
                                    UtilsMy.W3(n.this.f44670c, downloadTask, "1");
                                    return;
                                } else if (status != 6) {
                                    if (status != 7) {
                                        if (status == 42) {
                                            if (!com.join.android.app.common.utils.j.j(n.this.f44670c)) {
                                                com.join.mgps.Util.l2.a(n.this.f44670c).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.r4(n.this.f44670c, downloadTask);
                                                return;
                                            }
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(n.this.f44670c)) {
                                                        com.join.mgps.Util.l2.a(n.this.f44670c).b("无网络连接");
                                                        return;
                                                    } else if (this.f44893b.getDownloadType() != 2) {
                                                        UtilsMy.I2(n.this.f44670c, downloadTask);
                                                        return;
                                                    } else {
                                                        UtilsMy.u4(downloadTask);
                                                        return;
                                                    }
                                                case 10:
                                                    break;
                                                case 11:
                                                    UtilsMy.a4(downloadTask, n.this.f44670c);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            com.php25.PDownload.d.c(downloadTask, n.this.f44670c);
                            return;
                        }
                        com.php25.PDownload.d.i(downloadTask);
                        return;
                    }
                    com.php25.PDownload.d.l(n.this.f44670c, downloadTask);
                    return;
                }
                n nVar2 = n.this;
                nVar2.q(this.f44896e + 1);
                CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f44893b;
                if (collectionBeanSubBusiness2 != null) {
                    if (UtilsMy.y0(collectionBeanSubBusiness2.getPay_tag_info(), this.f44893b.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(n.this.f44670c, this.f44893b.getCrc_sign_id());
                        return;
                    }
                    MobclickAgent.onEvent(n.this.f44670c, "downloadGame4.2.0.6");
                    UtilsMy.y1(downloadTask, this.f44893b);
                    if (UtilsMy.o1(n.this.f44670c, downloadTask)) {
                        return;
                    }
                    if (this.f44893b.getDown_status() == 5) {
                        UtilsMy.l1(n.this.f44670c, downloadTask);
                    } else {
                        UtilsMy.R0(n.this.f44670c, downloadTask, this.f44893b.getTp_down_url(), this.f44893b.getOther_down_switch(), this.f44893b.getCdn_down_switch());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter1.java */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44898a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44899b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f44900c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f44901d;

        /* renamed from: e  reason: collision with root package name */
        public View f44902e;

        c() {
        }
    }

    /* compiled from: DownloadCenterAdapter1.java */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44904a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44905b;

        /* renamed from: c  reason: collision with root package name */
        RelativeLayout f44906c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44907d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44908e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f44909f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f44910g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f44911h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f44912i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44913j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f44914k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f44915l;

        /* renamed from: m  reason: collision with root package name */
        public RelativeLayout f44916m;

        /* renamed from: n  reason: collision with root package name */
        ImageView f44917n;

        public d() {
        }
    }

    public n(Activity activity) {
        super(activity);
        this.f44889f = "猜你喜欢";
        this.f44890g = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(8:43|(3:45|(2:47|(2:49|(2:51|(1:(2:54|13)))))|66)|67|68|69|(1:71)(1:75)|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04b8, code lost:
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View l(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.n.l(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        View view2;
        c cVar;
        if (view == null) {
            cVar = new c();
            view2 = LayoutInflater.from(this.f44670c).inflate(R.layout.item_download_center_ad_title, (ViewGroup) null);
            cVar.f44898a = (TextView) view2.findViewById(R.id.titleText);
            cVar.f44899b = (TextView) view2.findViewById(R.id.subtitle);
            cVar.f44900c = (LinearLayout) view2.findViewById(R.id.look_other);
            cVar.f44901d = (ImageView) view2.findViewById(R.id.icon);
            cVar.f44902e = view2.findViewById(R.id.line);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (c) view.getTag();
        }
        try {
            String str = (String) getItem(i4);
            if (!TextUtils.isEmpty(str)) {
                cVar.f44898a.setText(str);
            } else {
                cVar.f44898a.setText("猜你喜欢");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f44670c);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f44670c).getUid());
    }

    @Override // com.join.mgps.adapter.m, android.widget.Adapter
    public int getCount() {
        List<CollectionBeanSubBusiness> list = this.f44890g;
        if (list != null && list.size() > 0) {
            return super.getCount() + 1 + this.f44890g.size();
        }
        return super.getCount();
    }

    @Override // com.join.mgps.adapter.m, android.widget.Adapter
    public Object getItem(int i4) {
        if (p(i4)) {
            int count = i4 - super.getCount();
            if (count == 0) {
                return this.f44889f;
            }
            return this.f44890g.get(count - 1);
        }
        return super.getItem(i4);
    }

    @Override // com.join.mgps.adapter.m, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        if (p(i4)) {
            int count = i4 - super.getCount();
            int viewTypeCount = super.getViewTypeCount();
            return count > 0 ? viewTypeCount + 1 : viewTypeCount;
        }
        return super.getItemViewType(i4);
    }

    @Override // com.join.mgps.adapter.m, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (getItemViewType(i4) == super.getViewTypeCount()) {
            return n(i4, view, viewGroup);
        }
        if (getItemViewType(i4) == super.getViewTypeCount() + 1) {
            return l(i4, view, viewGroup);
        }
        return super.getView(i4, view, viewGroup);
    }

    @Override // com.join.mgps.adapter.m, android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }

    public String m() {
        return this.f44889f;
    }

    public List<CollectionBeanSubBusiness> o() {
        return this.f44890g;
    }

    boolean p(int i4) {
        List<CollectionBeanSubBusiness> list;
        return i4 - super.getCount() >= 0 && (list = this.f44890g) != null && list.size() > 0;
    }

    public void r(String str) {
        this.f44889f = str;
    }

    public void s(List<CollectionBeanSubBusiness> list) {
        this.f44890g = list;
    }

    void t(d dVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            dVar.f44909f.setVisibility(8);
            dVar.f44914k.setVisibility(8);
            dVar.f44915l.setVisibility(8);
            dVar.f44910g.setVisibility(0);
            dVar.f44908e.setVisibility(0);
            return;
        }
        dVar.f44909f.setVisibility(0);
        if (bool2.booleanValue()) {
            dVar.f44914k.setVisibility(8);
            dVar.f44915l.setVisibility(0);
        } else {
            dVar.f44915l.setVisibility(8);
            dVar.f44914k.setVisibility(0);
        }
        dVar.f44910g.setVisibility(8);
        dVar.f44908e.setVisibility(8);
    }
}
