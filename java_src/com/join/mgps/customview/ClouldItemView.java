package com.join.mgps.customview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
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
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.dto.CloudListDataBean;
import com.papa.sim.statistic.Event;
import com.papa91.arc.CContext;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class ClouldItemView extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    CloudDownButn f46601b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f46602c;

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f46603d;

    /* renamed from: e  reason: collision with root package name */
    TextView f46604e;

    /* renamed from: f  reason: collision with root package name */
    TextView f46605f;

    /* renamed from: g  reason: collision with root package name */
    TextView f46606g;

    /* renamed from: h  reason: collision with root package name */
    TextView f46607h;

    /* renamed from: i  reason: collision with root package name */
    TextView f46608i;

    /* renamed from: j  reason: collision with root package name */
    TextView f46609j;

    /* renamed from: k  reason: collision with root package name */
    Context f46610k;

    /* renamed from: l  reason: collision with root package name */
    View f46611l;

    /* renamed from: m  reason: collision with root package name */
    com.facebook.imagepipeline.core.g f46612m;

    /* renamed from: n  reason: collision with root package name */
    DownloadTask f46613n;

    /* renamed from: o  reason: collision with root package name */
    CloudListDataBean f46614o;

    /* renamed from: p  reason: collision with root package name */
    String f46615p;

    /* renamed from: q  reason: collision with root package name */
    int f46616q;

    /* renamed from: r  reason: collision with root package name */
    boolean f46617r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.listener.c f46618s;

    /* renamed from: t  reason: collision with root package name */
    String[] f46619t;

    /* renamed from: u  reason: collision with root package name */
    boolean f46620u;

    /* renamed from: v  reason: collision with root package name */
    boolean f46621v;

    /* renamed from: w  reason: collision with root package name */
    boolean f46622w;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f46623b;

        a(boolean z4) {
            this.f46623b = z4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView.this.setPoPoWindow2(this.f46623b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f46625b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46626c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f46627d;

        b(boolean z4, int i4, int i5) {
            this.f46625b = z4;
            this.f46626c = i4;
            this.f46627d = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f46625b) {
                return;
            }
            int i4 = this.f46626c;
            if (i4 == 1 || i4 == 2) {
                ClouldItemView.this.c();
            } else if (i4 == 3) {
                if (this.f46627d == 4) {
                    ClouldItemView.this.c();
                }
            } else if (i4 == 4) {
                ClouldItemView.this.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46629b;

        c(PopupWindow popupWindow) {
            this.f46629b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46629b.dismiss();
            ClouldItemView clouldItemView = ClouldItemView.this;
            int i4 = clouldItemView.f46616q;
            if (i4 == 1) {
                clouldItemView.f46618s.w(clouldItemView.f46614o, 1);
            } else if (i4 == 2) {
                clouldItemView.f46618s.w(clouldItemView.f46614o, 2);
            } else if (i4 == 3) {
                clouldItemView.f46618s.w(clouldItemView.f46614o, 3);
            } else if (i4 == 4) {
                clouldItemView.f46618s.N(clouldItemView.f46614o, 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46631b;

        d(PopupWindow popupWindow) {
            this.f46631b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView clouldItemView = ClouldItemView.this;
            clouldItemView.f46618s.N(clouldItemView.f46614o, 1);
            this.f46631b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46633b;

        e(PopupWindow popupWindow) {
            this.f46633b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView clouldItemView = ClouldItemView.this;
            clouldItemView.f46618s.N(clouldItemView.f46614o, 2);
            this.f46633b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f46635b;

        f(PopupWindow popupWindow) {
            this.f46635b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClouldItemView clouldItemView = ClouldItemView.this;
            clouldItemView.f46618s.N(clouldItemView.f46614o, 3);
            this.f46635b.dismiss();
        }
    }

    public ClouldItemView(Context context) {
        super(context);
        this.f46617r = false;
        this.f46619t = new String[]{"ftsc3", "lkrexe2"};
        this.f46620u = false;
        this.f46621v = true;
        this.f46622w = true;
        b(context);
    }

    private String a(String str) {
        if (Build.VERSION.SDK_INT < 23 && !str.endsWith("kdygmyhbs3")) {
            if (str.startsWith("kdyg")) {
                return CContext.SCENE_GBA;
            }
            for (String str2 : this.f46619t) {
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

    private void b(Context context) {
        this.f46611l = LayoutInflater.from(context).inflate(R.layout.cloud_list_item, this);
        this.f46610k = context;
        this.f46612m = Fresco.getImagePipeline();
        this.f46601b = (CloudDownButn) this.f46611l.findViewById(R.id.downButton);
        this.f46602c = (LinearLayout) this.f46611l.findViewById(R.id.iv_more);
        this.f46603d = (SimpleDraweeView) this.f46611l.findViewById(R.id.simv);
        this.f46604e = (TextView) this.f46611l.findViewById(R.id.tv_name);
        this.f46605f = (TextView) this.f46611l.findViewById(R.id.tv_time);
        this.f46606g = (TextView) this.f46611l.findViewById(R.id.shape);
        this.f46607h = (TextView) this.f46611l.findViewById(R.id.backUp);
        this.f46608i = (TextView) this.f46611l.findViewById(R.id.tv_good);
        this.f46609j = (TextView) this.f46611l.findViewById(R.id.tv_evalute);
    }

    void c() {
        View inflate = LayoutInflater.from(this.f46610k).inflate(R.layout.popuwin_localarchive, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        popupWindow.showAsDropDown(this.f46602c, (int) (-this.f46610k.getResources().getDimension(R.dimen.wdp150)), (int) (-this.f46610k.getResources().getDimension(R.dimen.wdp80)));
        ((TextView) inflate.findViewById(R.id.tv_delect)).setOnClickListener(new c(popupWindow));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.backUp) {
            if (!this.f46617r) {
                this.f46618s.o(this.f46614o);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.backupLocalArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
        } else if (id != R.id.downButton) {
            if (id != R.id.shape) {
                return;
            }
            if (!this.f46617r) {
                this.f46618s.G(this.f46614o);
            }
            com.papa.sim.statistic.p.l(getContext()).Y0(Event.shareArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
        } else if (this.f46617r) {
        } else {
            int status = this.f46614o.getStatus();
            if (status != 0) {
                switch (status) {
                    case 2:
                        Intent intent = new Intent("com.wufun.cloud.showUploadDialog");
                        intent.putExtra("fileMd5", this.f46614o.getFileMd5());
                        getContext().sendBroadcast(intent);
                        return;
                    case 3:
                        Intent intent2 = new Intent("com.wufun.cloud.showDownDialog");
                        intent2.putExtra("fileMd5", this.f46614o.getFileMd5());
                        getContext().sendBroadcast(intent2);
                        return;
                    case 4:
                    case 5:
                    case 7:
                        break;
                    case 6:
                        DownloadTask F = p1.f.K().F(this.f46615p);
                        String archiveFileName = this.f46614o.getArchiveFileName();
                        if (F.getPlugin_num().equals("33")) {
                            String a5 = a(F.getPackageName());
                            if (a5 != null) {
                                if (a5.equals("VBA") && !archiveFileName.contains("vba")) {
                                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                                    return;
                                } else if (a5.equals(CContext.SCENE_GBA) && archiveFileName.contains("vba")) {
                                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                                    return;
                                }
                            } else if (this.f46620u && !archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            } else if (!this.f46620u && archiveFileName.contains("vba")) {
                                l2.a(getContext()).b("当前系统版本无法运行该存档");
                                return;
                            }
                        }
                        int i4 = this.f46616q;
                        if (i4 != 3 && i4 != 4) {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.downloadCloudArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
                        } else {
                            com.papa.sim.statistic.p.l(getContext()).Y0(Event.makeStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
                        }
                        int i5 = this.f46616q;
                        if (i5 == 3 || i5 == 4) {
                            if (!this.f46621v) {
                                l2.a(getContext()).b("本地为v1核心不能下载v2核心存档");
                                return;
                            } else if (!this.f46622w) {
                                l2.a(getContext()).b("本地有双核心PGM游戏不能下载存档");
                                return;
                            }
                        }
                        if (i5 == 1) {
                            this.f46618s.v(this.f46614o, false);
                            return;
                        } else {
                            this.f46618s.v(this.f46614o, true);
                            return;
                        }
                    default:
                        return;
                }
            }
            String archiveFilePath = this.f46614o.getArchiveFilePath();
            if (this.f46613n.getPlugin_num().equals("33")) {
                String a6 = a(this.f46613n.getPackageName());
                if (a6 != null) {
                    if (a6.equals("VBA") && !archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    } else if (a6.equals(CContext.SCENE_GBA) && archiveFilePath.contains("vba")) {
                        l2.a(getContext()).b("当前系统版本无法运行该存档");
                        return;
                    }
                } else if (this.f46620u && !archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                } else if (!this.f46620u && archiveFilePath.contains("vba")) {
                    l2.a(getContext()).b("当前系统版本无法运行该存档");
                    return;
                }
            }
            UtilsMy.m(this.f46613n, getContext(), archiveFilePath);
            int i6 = this.f46616q;
            if (i6 != 3 && i6 != 4) {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startMeArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
            } else {
                com.papa.sim.statistic.p.l(getContext()).Y0(Event.startStoreArchive, AccountUtil_.getInstance_(getContext()).getUid(), this.f46615p);
            }
            this.f46618s.r(this.f46614o);
        }
    }

    public void setCloudItemListener(com.join.mgps.listener.c cVar) {
        this.f46618s = cVar;
    }

    public void setData(String str, CloudListDataBean cloudListDataBean, int i4, int i5, boolean z4, boolean z5, com.join.mgps.listener.c cVar) {
        this.f46615p = str;
        this.f46616q = i4;
        this.f46617r = z4;
        this.f46613n = p1.f.K().F(str);
        this.f46614o = cloudListDataBean;
        if (cloudListDataBean.getArchiveCover().startsWith("file://")) {
            Uri parse = Uri.parse(cloudListDataBean.getArchiveCover());
            this.f46612m.h(parse);
            this.f46612m.f(parse);
            this.f46612m.e(parse);
            this.f46603d.setImageURI(parse);
        } else {
            MyImageLoader.h(this.f46603d, cloudListDataBean.getArchiveCover());
        }
        if (i4 == 3 && i5 == 4) {
            TextView textView = this.f46605f;
            textView.setText(cloudListDataBean.getAddTime() + "上传");
        } else {
            this.f46605f.setText(cloudListDataBean.getAddTime());
        }
        if (i4 == 2) {
            this.f46607h.setVisibility(0);
        } else {
            this.f46607h.setVisibility(8);
        }
        if (i4 != 3 && i4 != 4) {
            this.f46608i.setVisibility(8);
            this.f46604e.setText(cloudListDataBean.getArchiveName());
            this.f46608i.setVisibility(8);
            this.f46606g.setVisibility(0);
        } else {
            this.f46606g.setVisibility(8);
            this.f46604e.setText(cloudListDataBean.getArchiveDesc());
            this.f46608i.setVisibility(0);
            TextView textView2 = this.f46608i;
            textView2.setText(cloudListDataBean.getHighRate() + "%好评");
            if (this.f46613n.getPlugin_num().equals("33")) {
                String archiveFileName = cloudListDataBean.getArchiveFileName();
                String a5 = a(this.f46613n.getPackageName());
                if (a5 != null) {
                    if (a5.equals("VBA") && !archiveFileName.contains("vba")) {
                        TextView textView3 = this.f46605f;
                        textView3.setText(cloudListDataBean.getAddTime() + " 不兼容");
                    } else if (a5.equals(CContext.SCENE_GBA) && archiveFileName.contains("vba")) {
                        TextView textView4 = this.f46605f;
                        textView4.setText(cloudListDataBean.getAddTime() + " 不兼容");
                    }
                } else if (this.f46620u && !archiveFileName.contains("vba")) {
                    TextView textView5 = this.f46605f;
                    textView5.setText(cloudListDataBean.getAddTime() + " 不兼容");
                } else if (!this.f46620u && archiveFileName.contains("vba")) {
                    TextView textView6 = this.f46605f;
                    textView6.setText(cloudListDataBean.getAddTime() + " 不兼容");
                }
            }
        }
        this.f46609j.setVisibility(8);
        if (i4 == 3) {
            if (i5 != 4) {
                this.f46602c.setVisibility(4);
            } else {
                this.f46602c.setVisibility(0);
            }
            this.f46609j.setVisibility(8);
        } else if (i4 == 4) {
            this.f46609j.setVisibility(0);
        } else {
            this.f46602c.setVisibility(0);
        }
        this.f46609j.setOnClickListener(new a(z5));
        this.f46602c.setOnClickListener(new b(z4, i4, i5));
        if (!z4) {
            this.f46601b.setOnClickListener(this);
            this.f46607h.setOnClickListener(this);
            this.f46606g.setOnClickListener(this);
        }
        boolean z6 = true;
        if (i4 == 1) {
            this.f46601b.setStatu(cloudListDataBean.getStatus());
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
                    this.f46614o.setArchiveFilePath(next.getFilePath());
                    break;
                }
            }
            if (z6) {
                this.f46601b.setStatu(0);
                this.f46614o.setStatus(0);
                return;
            }
            this.f46601b.setStatu(this.f46614o.getStatus());
        } else if (i4 == 2) {
            this.f46601b.setStatu(0);
            int status = this.f46614o.getStatus();
            if (status != 0) {
                if (status == 7) {
                    this.f46607h.setText("备份中");
                    this.f46607h.setClickable(true);
                    return;
                } else if (status != 4) {
                    if (status != 5) {
                        return;
                    }
                    this.f46607h.setText("已备份");
                    this.f46607h.setClickable(false);
                    return;
                }
            }
            this.f46607h.setText("备份");
            this.f46607h.setClickable(true);
        } else {
            this.f46601b.setStatu(6);
        }
    }

    public void setGBAType(boolean z4) {
        this.f46620u = z4;
    }

    public void setPGN(boolean z4, boolean z5) {
        this.f46621v = z4;
        this.f46622w = z5;
    }

    void setPoPoWindow2(boolean z4) {
        View inflate = LayoutInflater.from(this.f46610k).inflate(R.layout.popuwin_localarchive2, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        TextView textView = (TextView) inflate.findViewById(R.id.good);
        TextView textView2 = (TextView) inflate.findViewById(R.id.introduce);
        TextView textView3 = (TextView) inflate.findViewById(R.id.plagiarize);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.popuwinlocal)));
        int[] iArr = new int[2];
        this.f46602c.getLocationOnScreen(iArr);
        if (z4) {
            popupWindow.showAtLocation(this.f46602c, 0, iArr[0] - ((int) this.f46610k.getResources().getDimension(R.dimen.wdp250)), iArr[1]);
        } else {
            popupWindow.showAtLocation(this.f46602c, 0, iArr[0] - ((int) this.f46610k.getResources().getDimension(R.dimen.wdp250)), iArr[1]);
        }
        textView.setOnClickListener(new d(popupWindow));
        textView2.setOnClickListener(new e(popupWindow));
        textView3.setOnClickListener(new f(popupWindow));
    }

    public ClouldItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46617r = false;
        this.f46619t = new String[]{"ftsc3", "lkrexe2"};
        this.f46620u = false;
        this.f46621v = true;
        this.f46622w = true;
        b(context);
    }

    public ClouldItemView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46617r = false;
        this.f46619t = new String[]{"ftsc3", "lkrexe2"};
        this.f46620u = false;
        this.f46621v = true;
        this.f46622w = true;
        b(context);
    }
}
