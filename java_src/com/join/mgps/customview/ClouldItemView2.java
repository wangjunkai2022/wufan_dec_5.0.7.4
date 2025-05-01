package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.dialog.y;
import com.join.mgps.dto.CloudListDataBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.CContext;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import q.rorbin.badgeview.QBadgeView;
import q.rorbin.badgeview.a;
/* loaded from: classes4.dex */
public class ClouldItemView2 extends LinearLayout implements View.OnClickListener {
    boolean A;
    boolean B;
    boolean C;

    /* renamed from: b  reason: collision with root package name */
    CloudDownButn f46637b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f46638c;

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f46639d;

    /* renamed from: e  reason: collision with root package name */
    TextView f46640e;

    /* renamed from: f  reason: collision with root package name */
    TextView f46641f;

    /* renamed from: g  reason: collision with root package name */
    TextView f46642g;

    /* renamed from: h  reason: collision with root package name */
    TextView f46643h;

    /* renamed from: i  reason: collision with root package name */
    TextView f46644i;

    /* renamed from: j  reason: collision with root package name */
    TextView f46645j;

    /* renamed from: k  reason: collision with root package name */
    TextView f46646k;

    /* renamed from: l  reason: collision with root package name */
    ImageView f46647l;

    /* renamed from: m  reason: collision with root package name */
    Context f46648m;

    /* renamed from: n  reason: collision with root package name */
    View f46649n;

    /* renamed from: o  reason: collision with root package name */
    TextView f46650o;

    /* renamed from: p  reason: collision with root package name */
    com.facebook.imagepipeline.core.g f46651p;

    /* renamed from: q  reason: collision with root package name */
    DownloadTask f46652q;

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f46653r;

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f46654s;

    /* renamed from: t  reason: collision with root package name */
    private q.rorbin.badgeview.a f46655t;

    /* renamed from: u  reason: collision with root package name */
    CloudListDataBean f46656u;

    /* renamed from: v  reason: collision with root package name */
    String f46657v;

    /* renamed from: w  reason: collision with root package name */
    int f46658w;

    /* renamed from: x  reason: collision with root package name */
    boolean f46659x;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.listener.c f46660y;

    /* renamed from: z  reason: collision with root package name */
    String[] f46661z;

    /* loaded from: classes4.dex */
    class a implements a.InterfaceC0806a {
        a() {
        }

        @Override // q.rorbin.badgeview.a.InterfaceC0806a
        public void a(int i4, q.rorbin.badgeview.a aVar, View view) {
            if (i4 == 4) {
                aVar.hide(false);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f46663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f46664c;

        b(CloudListDataBean cloudListDataBean, boolean z4) {
            this.f46663b = cloudListDataBean;
            this.f46664c = z4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView2.this.d();
            this.f46663b.setIsComment(1);
            ClouldItemView2.this.setPoPoWindow2(this.f46664c);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f46666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f46668d;

        c(boolean z4, int i4, int i5) {
            this.f46666b = z4;
            this.f46667c = i4;
            this.f46668d = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f46666b) {
                return;
            }
            int i4 = this.f46667c;
            if (i4 == 1 || i4 == 2) {
                ClouldItemView2.this.f();
            } else if (i4 == 3) {
                if (this.f46668d == 4) {
                    ClouldItemView2.this.f();
                }
            } else if (i4 == 4) {
                ClouldItemView2.this.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46670b;

        d(PopupWindow popupWindow) {
            this.f46670b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46670b.dismiss();
            ClouldItemView2 clouldItemView2 = ClouldItemView2.this;
            int i4 = clouldItemView2.f46658w;
            if (i4 == 1) {
                clouldItemView2.f46660y.w(clouldItemView2.f46656u, 1);
            } else if (i4 == 2) {
                clouldItemView2.f46660y.w(clouldItemView2.f46656u, 2);
            } else if (i4 == 3) {
                clouldItemView2.f46660y.w(clouldItemView2.f46656u, 3);
            } else if (i4 == 4) {
                clouldItemView2.f46660y.N(clouldItemView2.f46656u, 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46672b;

        e(PopupWindow popupWindow) {
            this.f46672b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView2 clouldItemView2 = ClouldItemView2.this;
            clouldItemView2.f46660y.N(clouldItemView2.f46656u, 1);
            this.f46672b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46674b;

        f(PopupWindow popupWindow) {
            this.f46674b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView2 clouldItemView2 = ClouldItemView2.this;
            clouldItemView2.f46660y.N(clouldItemView2.f46656u, 2);
            this.f46674b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46676b;

        g(PopupWindow popupWindow) {
            this.f46676b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView2 clouldItemView2 = ClouldItemView2.this;
            clouldItemView2.f46660y.N(clouldItemView2.f46656u, 3);
            this.f46676b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class h implements y.e {
        h() {
        }

        @Override // com.join.mgps.dialog.y.e
        public void a(com.join.mgps.dialog.y yVar) {
            com.papa.sim.statistic.p.l(ClouldItemView2.this.getContext()).O1(Event.VipArchive_buy_emulator, new Ext().setGameId(ClouldItemView2.this.f46657v));
            IntentUtil.getInstance().goShareWebActivity(ClouldItemView2.this.getContext(), ClouldItemView2.this.getVipUrl());
            yVar.dismiss();
        }
    }

    public ClouldItemView2(Context context) {
        super(context);
        this.f46659x = false;
        this.f46661z = new String[]{"ftsc3", "lkrexe2"};
        this.A = false;
        this.B = true;
        this.C = true;
        e(context);
    }

    private boolean b() {
        n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
        return accountData != null && (com.join.mgps.Util.b.piv(accountData) || accountData.j1() > 0);
    }

    private String c(String str) {
        if (Build.VERSION.SDK_INT < 23 && !str.endsWith("kdygmyhbs3")) {
            if (str.startsWith("kdyg")) {
                return CContext.SCENE_GBA;
            }
            for (String str2 : this.f46661z) {
                if (str.endsWith(str2)) {
                    return CContext.SCENE_GBA;
                }
            }
            Date date = null;
            Date date2 = null;
            for (int i4 = 0; i4 <= 100; i4++) {
                File file = new File(str + com.join.mgps.Util.h0.f27805a + i4);
                if (file.exists()) {
                    Date date3 = new Date(file.lastModified());
                    if (date2 == null || date3.after(date2)) {
                        date2 = date3;
                    }
                }
            }
            for (int i5 = 0; i5 <= 100; i5++) {
                File file2 = new File(str + "vba." + i5);
                if (file2.exists()) {
                    Date date4 = new Date(file2.lastModified());
                    if (date == null || date4.after(date)) {
                        date = date4;
                    }
                }
            }
            return (date2 == null || date == null) ? date2 == null ? "VBA" : CContext.SCENE_GBA : date2.after(date) ? CContext.SCENE_GBA : "VBA";
        }
        return "VBA";
    }

    @SuppressLint({"WrongViewCast"})
    private void e(Context context) {
        this.f46649n = LayoutInflater.from(context).inflate(R.layout.cloud_list_item2, this);
        this.f46648m = context;
        this.f46651p = Fresco.getImagePipeline();
        this.f46637b = (CloudDownButn) this.f46649n.findViewById(R.id.downButton);
        this.f46638c = (LinearLayout) this.f46649n.findViewById(R.id.iv_more);
        this.f46639d = (SimpleDraweeView) this.f46649n.findViewById(R.id.simv);
        this.f46640e = (TextView) this.f46649n.findViewById(R.id.tv_name);
        this.f46641f = (TextView) this.f46649n.findViewById(R.id.shape);
        this.f46642g = (TextView) this.f46649n.findViewById(R.id.backUp);
        this.f46643h = (TextView) this.f46649n.findViewById(R.id.authorname);
        this.f46647l = (ImageView) this.f46649n.findViewById(R.id.ivgoodauthor);
        this.f46650o = (TextView) this.f46649n.findViewById(R.id.goodauthor);
        this.f46645j = (TextView) this.f46649n.findViewById(R.id.tvcouldnum);
        this.f46646k = (TextView) this.f46649n.findViewById(R.id.tvgoodpraisenum);
        this.f46644i = (TextView) this.f46649n.findViewById(R.id.tv_evalute);
        this.f46653r = (LinearLayout) this.f46649n.findViewById(R.id.ll_vip);
        this.f46654s = (LinearLayout) this.f46649n.findViewById(R.id.ll_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getVipUrl() {
        String str = "http://anv3btapi.wufan88.com/user/activity/cloud_archive?gameId=" + this.f46657v;
        com.join.mgps.listener.c cVar = this.f46660y;
        if (cVar != null) {
            String t4 = cVar.t();
            if (g2.i(t4)) {
                if (t4.contains("?")) {
                    return t4 + "&gameId=" + this.f46657v;
                }
                return t4 + "?gameId=" + this.f46657v;
            }
            return t4;
        }
        return str;
    }

    void d() {
        q.rorbin.badgeview.a aVar = this.f46655t;
        if (aVar != null) {
            aVar.hide(false);
        }
    }

    void f() {
        View inflate = LayoutInflater.from(this.f46648m).inflate(R.layout.popuwin_localarchive, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        popupWindow.showAsDropDown(this.f46638c, (int) (-this.f46648m.getResources().getDimension(R.dimen.wdp150)), (int) (-this.f46648m.getResources().getDimension(R.dimen.wdp80)));
        ((TextView) inflate.findViewById(R.id.tv_delect)).setOnClickListener(new d(popupWindow));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.backUp) {
            if (!this.f46659x) {
                this.f46660y.o(this.f46656u);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.backupLocalArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
        } else if (id != R.id.downButton) {
            if (id != R.id.shape) {
                return;
            }
            if (!this.f46659x) {
                this.f46660y.G(this.f46656u);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.shareArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
        } else if (this.f46659x) {
        } else {
            int status = this.f46656u.getStatus();
            if (status != 0) {
                switch (status) {
                    case 2:
                        Intent intent = new Intent("com.wufun.cloud.showUploadDialog");
                        intent.putExtra("fileMd5", this.f46656u.getFileMd5());
                        getContext().sendBroadcast(intent);
                        return;
                    case 3:
                        Intent intent2 = new Intent("com.wufun.cloud.showDownDialog");
                        intent2.putExtra("fileMd5", this.f46656u.getFileMd5());
                        getContext().sendBroadcast(intent2);
                        return;
                    case 4:
                    case 5:
                    case 7:
                        break;
                    case 6:
                        DownloadTask F = p1.f.K().F(this.f46657v);
                        String archiveFileName = this.f46656u.getArchiveFileName();
                        if (F.getPlugin_num().equals("33")) {
                            String c5 = c(F.getPackageName());
                            if (c5 != null) {
                                if (c5.equals("VBA") && !archiveFileName.contains("vba")) {
                                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                                    return;
                                } else if (c5.equals(CContext.SCENE_GBA) && archiveFileName.contains("vba")) {
                                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                                    return;
                                }
                            } else if (this.A && !archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            } else if (!this.A && archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            }
                        }
                        int i4 = this.f46658w;
                        if (i4 != 3 && i4 != 4) {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.downloadCloudArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
                        } else {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.makeStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
                        }
                        int i5 = this.f46658w;
                        if (i5 == 3 || i5 == 4) {
                            if (!this.B) {
                                l2.a(getContext()).b("本地为v1核心不能下载v2核心存档");
                                return;
                            } else if (!this.C) {
                                l2.a(getContext()).b("本地有双核心PGM游戏不能下载存档");
                                return;
                            }
                        }
                        if (i5 == 1) {
                            this.f46660y.v(this.f46656u, false);
                            return;
                        } else {
                            this.f46660y.v(this.f46656u, true);
                            return;
                        }
                    default:
                        return;
                }
            }
            if (this.f46656u.getIsVip() == 1 && !b()) {
                new com.join.mgps.dialog.y(this.f46648m, R.style.HKDialogLoading).g("获取须知").d("本存档是悟饭平台VIP会员所享内容，请开通VIP会员后使用").b("开通VIP会员").a(new h()).show();
                com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_popup_emulator, new Ext().setGameId(this.f46657v));
                return;
            }
            String archiveFilePath = this.f46656u.getArchiveFilePath();
            if (this.f46652q.getPlugin_num().equals("33")) {
                String c6 = c(this.f46652q.getPackageName());
                if (c6 != null) {
                    if (c6.equals("VBA") && !archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    } else if (c6.equals(CContext.SCENE_GBA) && archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    }
                } else if (this.A && !archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                } else if (!this.A && archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                }
            }
            UtilsMy.m(this.f46652q, getContext(), archiveFilePath);
            int i6 = this.f46658w;
            if (i6 != 3 && i6 != 4) {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startMeArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
            } else {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46657v);
            }
            this.f46660y.r(this.f46656u);
        }
    }

    public void setCloudItemListener(com.join.mgps.listener.c cVar) {
        this.f46660y = cVar;
    }

    public void setData(String str, CloudListDataBean cloudListDataBean, int i4, int i5, boolean z4, boolean z5, com.join.mgps.listener.c cVar) {
        boolean z6;
        this.f46657v = str;
        this.f46658w = i4;
        this.f46659x = z4;
        this.f46652q = p1.f.K().F(str);
        this.f46656u = cloudListDataBean;
        if (cloudListDataBean.getArchiveCover().startsWith("file://")) {
            Uri parse = Uri.parse(cloudListDataBean.getArchiveCover());
            this.f46651p.h(parse);
            this.f46651p.f(parse);
            this.f46651p.e(parse);
            this.f46639d.setImageURI(parse);
        } else {
            MyImageLoader.h(this.f46639d, cloudListDataBean.getArchiveCover());
        }
        if (i4 == 2) {
            this.f46642g.setVisibility(0);
        } else {
            this.f46642g.setVisibility(8);
        }
        if (i4 != 3 && i4 != 4) {
            this.f46640e.setText(cloudListDataBean.getArchiveName());
            this.f46641f.setVisibility(0);
        } else {
            this.f46641f.setVisibility(8);
            this.f46640e.setText(cloudListDataBean.getArchiveDesc());
            this.f46643h.setText(cloudListDataBean.getNickname());
            if (cloudListDataBean.getTag() != null && !cloudListDataBean.getTag().equals("")) {
                this.f46647l.setVisibility(0);
                this.f46650o.setText(cloudListDataBean.getTag());
                this.f46650o.setVisibility(0);
            } else {
                this.f46647l.setVisibility(8);
                this.f46650o.setText(cloudListDataBean.getTag());
                this.f46650o.setVisibility(8);
            }
            TextView textView = this.f46645j;
            textView.setText(cloudListDataBean.getDownNum() + "");
            TextView textView2 = this.f46646k;
            textView2.setText(cloudListDataBean.getHighComment() + "");
            if (this.f46652q.getPlugin_num().equals("33")) {
                String archiveFileName = cloudListDataBean.getArchiveFileName();
                String c5 = c(this.f46652q.getPackageName());
                if (c5 != null) {
                    if (c5.equals("VBA") && !archiveFileName.contains("vba")) {
                        TextView textView3 = this.f46646k;
                        textView3.setText(cloudListDataBean.getHighComment() + " 不兼容");
                    } else if (c5.equals(CContext.SCENE_GBA) && archiveFileName.contains("vba")) {
                        TextView textView4 = this.f46646k;
                        textView4.setText(cloudListDataBean.getHighComment() + " 不兼容");
                    }
                } else if (this.A && !archiveFileName.contains("vba")) {
                    TextView textView5 = this.f46646k;
                    textView5.setText(cloudListDataBean.getHighComment() + " 不兼容");
                } else if (!this.A && archiveFileName.contains("vba")) {
                    TextView textView6 = this.f46646k;
                    textView6.setText(cloudListDataBean.getHighComment() + " 不兼容");
                }
            }
        }
        this.f46644i.setVisibility(8);
        if (i4 == 3) {
            if (i5 != 4) {
                this.f46638c.setVisibility(4);
            } else {
                this.f46638c.setVisibility(0);
            }
            this.f46644i.setVisibility(8);
        } else if (i4 == 4) {
            this.f46644i.setVisibility(0);
            if (cloudListDataBean.getIsComment() == 0) {
                q.rorbin.badgeview.a aVar = this.f46655t;
                if (aVar != null) {
                    aVar.hide(false);
                }
                this.f46655t = new QBadgeView(this.f46648m).c(this.f46644i).q(-1).u(3.0f, true).g(SupportMenu.CATEGORY_MASK).v(getResources().getDimensionPixelSize(R.dimen.wdp2), false).o(8388693).l(-1).i(new a());
            } else if (cloudListDataBean.getIsComment() == 1) {
                d();
            }
        } else {
            this.f46638c.setVisibility(0);
        }
        this.f46644i.setOnClickListener(new b(cloudListDataBean, z5));
        this.f46638c.setOnClickListener(new c(z4, i4, i5));
        if (!z4) {
            this.f46637b.setOnClickListener(this);
            this.f46642g.setOnClickListener(this);
            this.f46641f.setOnClickListener(this);
        }
        if (i4 == 1) {
            this.f46637b.setStatu(cloudListDataBean.getStatus());
        } else if (i4 == 3 || i4 == 4) {
            Iterator<CloudDownRecoderTable> it2 = b2.i.o().n(str).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z6 = false;
                    break;
                }
                CloudDownRecoderTable next = it2.next();
                if (!new File(next.getFilePath()).exists()) {
                    b2.i.o().delete((b2.i) next);
                } else if (next.getMd5().equals(cloudListDataBean.getFileMd5())) {
                    this.f46656u.setArchiveFilePath(next.getFilePath());
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                this.f46637b.setStatu(0);
                this.f46656u.setStatus(0);
            } else {
                this.f46637b.setStatu(this.f46656u.getStatus());
            }
        } else if (i4 == 2) {
            this.f46637b.setStatu(0);
            int status = this.f46656u.getStatus();
            if (status != 0) {
                if (status == 7) {
                    this.f46642g.setText("备份中");
                    this.f46642g.setClickable(true);
                } else if (status != 4) {
                    if (status == 5) {
                        this.f46642g.setText("已备份");
                        this.f46642g.setClickable(false);
                    }
                }
            }
            this.f46642g.setText("备份");
            this.f46642g.setClickable(true);
        } else {
            this.f46637b.setStatu(6);
        }
        if (this.f46656u.getIsVip() == 1) {
            setBackgroundResource(R.drawable.bg_cloud_list_item2);
            this.f46637b.setTextColor(Color.parseColor("#ADADF1"));
            this.f46653r.setVisibility(0);
            this.f46654s.setVisibility(8);
            return;
        }
        setBackgroundColor(Color.parseColor("#800A1521"));
        this.f46637b.setTextColor(Color.parseColor("#9FABB7"));
        this.f46653r.setVisibility(8);
        this.f46654s.setVisibility(0);
    }

    public void setGBAType(boolean z4) {
        this.A = z4;
    }

    public void setPGN(boolean z4, boolean z5) {
        this.B = z4;
        this.C = z5;
    }

    void setPoPoWindow2(boolean z4) {
        View inflate = LayoutInflater.from(this.f46648m).inflate(R.layout.popuwin_localarchive2, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        TextView textView = (TextView) inflate.findViewById(R.id.good);
        TextView textView2 = (TextView) inflate.findViewById(R.id.introduce);
        TextView textView3 = (TextView) inflate.findViewById(R.id.plagiarize);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        int[] iArr = new int[2];
        this.f46638c.getLocationOnScreen(iArr);
        if (z4) {
            popupWindow.showAtLocation(this.f46638c, 0, iArr[0] - ((int) this.f46648m.getResources().getDimension(R.dimen.wdp250)), iArr[1]);
        } else {
            popupWindow.showAtLocation(this.f46638c, 0, iArr[0] - ((int) this.f46648m.getResources().getDimension(R.dimen.wdp250)), iArr[1]);
        }
        textView.setOnClickListener(new e(popupWindow));
        textView2.setOnClickListener(new f(popupWindow));
        textView3.setOnClickListener(new g(popupWindow));
    }

    public ClouldItemView2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46659x = false;
        this.f46661z = new String[]{"ftsc3", "lkrexe2"};
        this.A = false;
        this.B = true;
        this.C = true;
        e(context);
    }

    public ClouldItemView2(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46659x = false;
        this.f46661z = new String[]{"ftsc3", "lkrexe2"};
        this.A = false;
        this.B = true;
        this.C = true;
        e(context);
    }
}
