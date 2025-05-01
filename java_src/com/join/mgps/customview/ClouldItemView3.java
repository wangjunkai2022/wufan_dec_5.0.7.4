package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
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
/* loaded from: classes4.dex */
public class ClouldItemView3 extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    CloudDownButn f46679b;

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f46680c;

    /* renamed from: d  reason: collision with root package name */
    TextView f46681d;

    /* renamed from: e  reason: collision with root package name */
    TextView f46682e;

    /* renamed from: f  reason: collision with root package name */
    TextView f46683f;

    /* renamed from: g  reason: collision with root package name */
    TextView f46684g;

    /* renamed from: h  reason: collision with root package name */
    TextView f46685h;

    /* renamed from: i  reason: collision with root package name */
    TextView f46686i;

    /* renamed from: j  reason: collision with root package name */
    Context f46687j;

    /* renamed from: k  reason: collision with root package name */
    View f46688k;

    /* renamed from: l  reason: collision with root package name */
    com.facebook.imagepipeline.core.g f46689l;

    /* renamed from: m  reason: collision with root package name */
    DownloadTask f46690m;

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f46691n;

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f46692o;

    /* renamed from: p  reason: collision with root package name */
    private q.rorbin.badgeview.a f46693p;

    /* renamed from: q  reason: collision with root package name */
    CloudListDataBean f46694q;

    /* renamed from: r  reason: collision with root package name */
    String f46695r;

    /* renamed from: s  reason: collision with root package name */
    int f46696s;

    /* renamed from: t  reason: collision with root package name */
    boolean f46697t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.listener.c f46698u;

    /* renamed from: v  reason: collision with root package name */
    String[] f46699v;

    /* renamed from: w  reason: collision with root package name */
    boolean f46700w;

    /* renamed from: x  reason: collision with root package name */
    boolean f46701x;

    /* renamed from: y  reason: collision with root package name */
    boolean f46702y;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46703b;

        a(PopupWindow popupWindow) {
            this.f46703b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46703b.dismiss();
            ClouldItemView3 clouldItemView3 = ClouldItemView3.this;
            int i4 = clouldItemView3.f46696s;
            if (i4 == 1) {
                clouldItemView3.f46698u.w(clouldItemView3.f46694q, 1);
            } else if (i4 == 2) {
                clouldItemView3.f46698u.w(clouldItemView3.f46694q, 2);
            } else if (i4 == 3) {
                clouldItemView3.f46698u.w(clouldItemView3.f46694q, 3);
            } else if (i4 == 4) {
                clouldItemView3.f46698u.N(clouldItemView3.f46694q, 4);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46705b;

        b(PopupWindow popupWindow) {
            this.f46705b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView3 clouldItemView3 = ClouldItemView3.this;
            clouldItemView3.f46698u.N(clouldItemView3.f46694q, 1);
            this.f46705b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46707b;

        c(PopupWindow popupWindow) {
            this.f46707b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView3 clouldItemView3 = ClouldItemView3.this;
            clouldItemView3.f46698u.N(clouldItemView3.f46694q, 2);
            this.f46707b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46709b;

        d(PopupWindow popupWindow) {
            this.f46709b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView3 clouldItemView3 = ClouldItemView3.this;
            clouldItemView3.f46698u.N(clouldItemView3.f46694q, 3);
            this.f46709b.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class e implements y.e {
        e() {
        }

        @Override // com.join.mgps.dialog.y.e
        public void a(com.join.mgps.dialog.y yVar) {
            com.papa.sim.statistic.p.l(ClouldItemView3.this.getContext()).O1(Event.VipArchive_buy_page, new Ext().setGameId(ClouldItemView3.this.f46695r));
            IntentUtil.getInstance().goShareWebActivity(ClouldItemView3.this.getContext(), ClouldItemView3.this.getVipUrl());
            yVar.dismiss();
        }
    }

    public ClouldItemView3(Context context) {
        super(context);
        this.f46697t = false;
        this.f46699v = new String[]{"ftsc3", "lkrexe2"};
        this.f46700w = false;
        this.f46701x = true;
        this.f46702y = true;
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
            for (String str2 : this.f46699v) {
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
        this.f46688k = LayoutInflater.from(context).inflate(R.layout.cloud_list_item3, this);
        this.f46687j = context;
        this.f46689l = Fresco.getImagePipeline();
        this.f46679b = (CloudDownButn) this.f46688k.findViewById(R.id.downButton);
        this.f46680c = (SimpleDraweeView) this.f46688k.findViewById(R.id.simv);
        this.f46681d = (TextView) this.f46688k.findViewById(R.id.tv_name);
        this.f46682e = (TextView) this.f46688k.findViewById(R.id.shape);
        this.f46683f = (TextView) this.f46688k.findViewById(R.id.backUp);
        this.f46684g = (TextView) this.f46688k.findViewById(R.id.authorname);
        this.f46685h = (TextView) this.f46688k.findViewById(R.id.tvcouldnum);
        this.f46691n = (LinearLayout) this.f46688k.findViewById(R.id.ll_vip);
        this.f46692o = (LinearLayout) this.f46688k.findViewById(R.id.ll_info);
        this.f46686i = (TextView) this.f46688k.findViewById(R.id.tvgoodpraisenum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getVipUrl() {
        String str = "http://anv3btapi.5fun.com/user/activity/cloud_archive?gameId=" + this.f46695r;
        com.join.mgps.listener.c cVar = this.f46698u;
        if (cVar != null) {
            String t4 = cVar.t();
            if (g2.i(t4)) {
                if (t4.contains("?")) {
                    return t4 + "&gameId=" + this.f46695r;
                }
                return t4 + "?gameId=" + this.f46695r;
            }
            return t4;
        }
        return str;
    }

    void d() {
        q.rorbin.badgeview.a aVar = this.f46693p;
        if (aVar != null) {
            aVar.hide(false);
        }
    }

    void f() {
        View inflate = LayoutInflater.from(this.f46687j).inflate(R.layout.popuwin_localarchive, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        ((TextView) inflate.findViewById(R.id.tv_delect)).setOnClickListener(new a(popupWindow));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.backUp) {
            if (!this.f46697t) {
                this.f46698u.o(this.f46694q);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.backupLocalArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
        } else if (id != R.id.downButton) {
            if (id != R.id.shape) {
                return;
            }
            if (!this.f46697t) {
                this.f46698u.G(this.f46694q);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.shareArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
        } else if (this.f46697t) {
        } else {
            int status = this.f46694q.getStatus();
            if (status != 0) {
                switch (status) {
                    case 2:
                        Intent intent = new Intent("com.wufun.cloud.showUploadDialog");
                        intent.putExtra("fileMd5", this.f46694q.getFileMd5());
                        getContext().sendBroadcast(intent);
                        return;
                    case 3:
                        Intent intent2 = new Intent("com.wufun.cloud.game.main.showDownDialog");
                        intent2.putExtra("fileMd5", this.f46694q.getFileMd5());
                        getContext().sendBroadcast(intent2);
                        return;
                    case 4:
                    case 5:
                    case 7:
                        break;
                    case 6:
                        DownloadTask F = p1.f.K().F(this.f46695r);
                        String archiveFileName = this.f46694q.getArchiveFileName();
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
                            } else if (this.f46700w && !archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            } else if (!this.f46700w && archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            }
                        }
                        int i4 = this.f46696s;
                        if (i4 != 3 && i4 != 4) {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.downloadCloudArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
                        } else {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.makeStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
                        }
                        int i5 = this.f46696s;
                        if (i5 == 3 || i5 == 4) {
                            if (!this.f46701x) {
                                l2.a(getContext()).b("本地为v1核心不能下载v2核心存档");
                                return;
                            } else if (!this.f46702y) {
                                l2.a(getContext()).b("本地有双核心PGM游戏不能下载存档");
                                return;
                            }
                        }
                        if (i5 == 1) {
                            this.f46698u.v(this.f46694q, false);
                            return;
                        } else {
                            this.f46698u.v(this.f46694q, true);
                            return;
                        }
                    default:
                        return;
                }
            }
            if (this.f46694q.getIsVip() == 1 && !b()) {
                new com.join.mgps.dialog.y(this.f46687j, R.style.HKDialogLoading).g("获取须知").d("本存档是悟饭平台VIP会员所享内容，请开通VIP会员后使用").b("开通VIP会员").a(new e()).show();
                com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_popup_page, new Ext().setGameId(this.f46695r));
                return;
            }
            String archiveFilePath = this.f46694q.getArchiveFilePath();
            if (this.f46690m.getPlugin_num().equals("33")) {
                String c6 = c(this.f46690m.getPackageName());
                if (c6 != null) {
                    if (c6.equals("VBA") && !archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    } else if (c6.equals(CContext.SCENE_GBA) && archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    }
                } else if (this.f46700w && !archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                } else if (!this.f46700w && archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                }
            }
            UtilsMy.m(this.f46690m, getContext(), archiveFilePath);
            int i6 = this.f46696s;
            if (i6 != 3 && i6 != 4) {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startMeArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
            } else {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46695r);
            }
            this.f46698u.r(this.f46694q);
        }
    }

    public void setCloudItemListener(com.join.mgps.listener.c cVar) {
        this.f46698u = cVar;
    }

    public void setData(String str, CloudListDataBean cloudListDataBean, int i4, int i5, boolean z4, boolean z5, com.join.mgps.listener.c cVar) {
        boolean z6;
        this.f46695r = str;
        this.f46696s = i4;
        this.f46697t = z4;
        this.f46690m = p1.f.K().F(str);
        this.f46694q = cloudListDataBean;
        MyImageLoader.h(this.f46680c, cloudListDataBean.getAvatar());
        if (i4 == 2) {
            this.f46683f.setVisibility(0);
        } else {
            this.f46683f.setVisibility(8);
        }
        if (i4 != 3 && i4 != 4) {
            this.f46681d.setText(cloudListDataBean.getArchiveName());
            this.f46682e.setVisibility(0);
        } else {
            this.f46682e.setVisibility(8);
            this.f46681d.setText(cloudListDataBean.getArchiveDesc());
            this.f46684g.setText(cloudListDataBean.getNickname());
            TextView textView = this.f46685h;
            textView.setText(cloudListDataBean.getDownNum() + "");
            TextView textView2 = this.f46686i;
            textView2.setText(cloudListDataBean.getHighComment() + "");
            if (this.f46690m.getPlugin_num().equals("33")) {
                String archiveFileName = cloudListDataBean.getArchiveFileName();
                String c5 = c(this.f46690m.getPackageName());
                if (c5 != null) {
                    if (c5.equals("VBA") && !archiveFileName.contains("vba")) {
                        TextView textView3 = this.f46686i;
                        textView3.setText(cloudListDataBean.getHighComment() + " 不兼容");
                    } else if (c5.equals(CContext.SCENE_GBA) && archiveFileName.contains("vba")) {
                        TextView textView4 = this.f46686i;
                        textView4.setText(cloudListDataBean.getHighComment() + " 不兼容");
                    }
                } else if (this.f46700w && !archiveFileName.contains("vba")) {
                    TextView textView5 = this.f46686i;
                    textView5.setText(cloudListDataBean.getHighComment() + " 不兼容");
                } else if (!this.f46700w && archiveFileName.contains("vba")) {
                    TextView textView6 = this.f46686i;
                    textView6.setText(cloudListDataBean.getHighComment() + " 不兼容");
                }
            }
        }
        if (!z4) {
            this.f46679b.setOnClickListener(this);
            this.f46683f.setOnClickListener(this);
            this.f46682e.setOnClickListener(this);
        }
        if (i4 == 1) {
            this.f46679b.setStatu(cloudListDataBean.getStatus());
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
                    this.f46694q.setArchiveFilePath(next.getFilePath());
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                this.f46679b.setStatu(0);
                this.f46694q.setStatus(0);
            } else {
                this.f46679b.setStatu(this.f46694q.getStatus());
            }
        } else if (i4 == 2) {
            this.f46679b.setStatu(0);
            int status = this.f46694q.getStatus();
            if (status != 0) {
                if (status == 7) {
                    this.f46683f.setText("备份中");
                    this.f46683f.setClickable(true);
                } else if (status != 4) {
                    if (status == 5) {
                        this.f46683f.setText("已备份");
                        this.f46683f.setClickable(false);
                    }
                }
            }
            this.f46683f.setText("备份");
            this.f46683f.setClickable(true);
        } else {
            this.f46679b.setStatu(6);
        }
        if (this.f46694q.getIsVip() == 1) {
            setBackgroundResource(R.drawable.bg_cloud_list_item3);
            this.f46679b.setTextColor(Color.parseColor("#FFD5BC"));
            this.f46679b.setBackgroundResource(R.drawable.shape_cloud_down_vip);
            this.f46691n.setVisibility(0);
            this.f46692o.setVisibility(8);
            return;
        }
        setBackgroundColor(Color.parseColor("#8F0A1521"));
        this.f46679b.setTextColor(Color.parseColor("#FFFFFF"));
        this.f46679b.setBackgroundResource(R.drawable.shape_cloud_down_normal);
        this.f46691n.setVisibility(8);
        this.f46692o.setVisibility(0);
    }

    public void setGBAType(boolean z4) {
        this.f46700w = z4;
    }

    public void setPGN(boolean z4, boolean z5) {
        this.f46701x = z4;
        this.f46702y = z5;
    }

    void setPoPoWindow2(boolean z4) {
        View inflate = LayoutInflater.from(this.f46687j).inflate(R.layout.popuwin_localarchive2, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        ((TextView) inflate.findViewById(R.id.good)).setOnClickListener(new b(popupWindow));
        ((TextView) inflate.findViewById(R.id.introduce)).setOnClickListener(new c(popupWindow));
        ((TextView) inflate.findViewById(R.id.plagiarize)).setOnClickListener(new d(popupWindow));
    }

    public ClouldItemView3(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46697t = false;
        this.f46699v = new String[]{"ftsc3", "lkrexe2"};
        this.f46700w = false;
        this.f46701x = true;
        this.f46702y = true;
        e(context);
    }

    public ClouldItemView3(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46697t = false;
        this.f46699v = new String[]{"ftsc3", "lkrexe2"};
        this.f46700w = false;
        this.f46701x = true;
        this.f46702y = true;
        e(context);
    }
}
