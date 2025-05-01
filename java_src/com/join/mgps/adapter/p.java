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
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.FightMainTable;
import com.join.mgps.db.tables.WarMatchAndLocalTable;
import com.join.mgps.dto.LoadWarCenterBean;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: FightAdapter.java */
/* loaded from: classes4.dex */
public class p extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f45600c;

    /* renamed from: b  reason: collision with root package name */
    String f45599b = getClass().getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, DownloadTask> f45601d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private List<FightMainTable> f45602e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45603f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45604g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45605h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45606i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45607j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45608k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f45609l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private LoadWarCenterBean f45610m = new LoadWarCenterBean();

    /* renamed from: n  reason: collision with root package name */
    private int f45611n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f45612o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f45613p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f45614q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f45615r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f45616s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f45617t = 0;

    /* renamed from: u  reason: collision with root package name */
    private int f45618u = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45620c;

        a(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45619b = downloadTask;
            this.f45620c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45619b, this.f45620c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45623c;

        b(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45622b = downloadTask;
            this.f45623c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45622b, this.f45623c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45625b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45626c;

        c(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45625b = downloadTask;
            this.f45626c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45625b, this.f45626c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45629c;

        d(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45628b = downloadTask;
            this.f45629c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45628b, this.f45629c.getDown_status());
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FightMainTable f45632c;

        e(DownloadTask downloadTask, FightMainTable fightMainTable) {
            this.f45631b = downloadTask;
            this.f45632c = fightMainTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f45631b;
            if (downloadTask != null) {
                if (downloadTask.getStatus() == 5) {
                    p.this.d(this.f45631b, this.f45632c.getDown_status());
                } else {
                    IntentUtil.getInstance().goGameDetialActivity(p.this.f45600c, this.f45631b.getCrc_link_type_val(), this.f45631b.getGame_info_tpl_type(), this.f45631b.getSp_tpl_two_position(), 0);
                }
            }
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FightMainTable f45634b;

        f(FightMainTable fightMainTable) {
            this.f45634b = fightMainTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setJump_type(this.f45634b.getJump_type());
            intentDateBean.setLink_type(this.f45634b.getLink_type());
            intentDateBean.setLink_type_val(this.f45634b.getLink_type_val());
            intentDateBean.setTpl_type(this.f45634b.getTpl_type());
            intentDateBean.setCrc_link_type_val(this.f45634b.getCrc_link_type_val());
            IntentUtil.getInstance().intentActivity(p.this.f45600c, intentDateBean);
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45636b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FightMainTable f45637c;

        g(DownloadTask downloadTask, FightMainTable fightMainTable) {
            this.f45636b = downloadTask;
            this.f45637c = fightMainTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f45636b;
            if (downloadTask != null) {
                if (downloadTask.getStatus() == 5) {
                    p.this.d(this.f45636b, this.f45637c.getDown_status());
                } else {
                    IntentUtil.getInstance().goGameDetialActivity(p.this.f45600c, this.f45636b.getCrc_link_type_val(), this.f45636b.getGame_info_tpl_type(), this.f45636b.getSp_tpl_two_position(), 0);
                }
            }
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FightMainTable f45639b;

        h(FightMainTable fightMainTable) {
            this.f45639b = fightMainTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setJump_type(this.f45639b.getJump_type());
            intentDateBean.setLink_type(this.f45639b.getLink_type());
            intentDateBean.setLink_type_val(this.f45639b.getLink_type_val());
            intentDateBean.setTpl_type(this.f45639b.getTpl_type());
            intentDateBean.setCrc_link_type_val(this.f45639b.getCrc_link_type_val());
            IntentUtil.getInstance().intentActivity(p.this.f45600c, intentDateBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45642c;

        i(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45641b = downloadTask;
            this.f45642c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45641b, this.f45642c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45645c;

        j(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45644b = downloadTask;
            this.f45645c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45644b, this.f45645c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45648c;

        k(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45647b = downloadTask;
            this.f45648c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45647b, this.f45648c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45651c;

        l(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45650b = downloadTask;
            this.f45651c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45650b, this.f45651c.getDown_status());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarMatchAndLocalTable f45654c;

        m(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
            this.f45653b = downloadTask;
            this.f45654c = warMatchAndLocalTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.g(this.f45653b, this.f45654c.getDown_status());
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    public class n {
        public ProgressBar A;
        public ProgressBar B;
        public ProgressBar C;
        public ProgressBar D;
        TextView E;
        TextView F;
        TextView G;

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f45656a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f45657b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f45658c;

        /* renamed from: d  reason: collision with root package name */
        SimpleDraweeView f45659d;

        /* renamed from: e  reason: collision with root package name */
        SimpleDraweeView f45660e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f45661f;

        /* renamed from: g  reason: collision with root package name */
        ImageView f45662g;

        /* renamed from: h  reason: collision with root package name */
        ImageView f45663h;

        /* renamed from: i  reason: collision with root package name */
        ImageView f45664i;

        /* renamed from: j  reason: collision with root package name */
        ImageView f45665j;

        /* renamed from: k  reason: collision with root package name */
        ImageView f45666k;

        /* renamed from: l  reason: collision with root package name */
        ImageView f45667l;

        /* renamed from: m  reason: collision with root package name */
        LinearLayout f45668m;

        /* renamed from: n  reason: collision with root package name */
        LinearLayout f45669n;

        /* renamed from: o  reason: collision with root package name */
        LinearLayout f45670o;

        /* renamed from: p  reason: collision with root package name */
        TextView f45671p;

        /* renamed from: q  reason: collision with root package name */
        TextView f45672q;

        /* renamed from: r  reason: collision with root package name */
        TextView f45673r;

        /* renamed from: s  reason: collision with root package name */
        public TextView f45674s;

        /* renamed from: t  reason: collision with root package name */
        public TextView f45675t;

        /* renamed from: u  reason: collision with root package name */
        public TextView f45676u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f45677v;

        /* renamed from: w  reason: collision with root package name */
        public TextView f45678w;

        /* renamed from: x  reason: collision with root package name */
        public TextView f45679x;

        /* renamed from: y  reason: collision with root package name */
        public ProgressBar f45680y;

        /* renamed from: z  reason: collision with root package name */
        public ProgressBar f45681z;

        public n() {
        }
    }

    /* compiled from: FightAdapter.java */
    /* loaded from: classes4.dex */
    class o {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45682a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f45683b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f45684c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f45685d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f45686e;

        o() {
        }
    }

    /* compiled from: FightAdapter.java */
    /* renamed from: com.join.mgps.adapter.p$p  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0343p {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f45688a;

        /* renamed from: b  reason: collision with root package name */
        TextView f45689b;

        /* renamed from: c  reason: collision with root package name */
        TextView f45690c;

        C0343p() {
        }
    }

    public p(Fragment fragment) {
        this.f45600c = fragment.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DownloadTask downloadTask, int i4) {
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.x0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (status != 0 && status != 43) {
            if (status != 2) {
                if (status != 3) {
                    if (status == 5) {
                        UtilsMy.T3(this.f45600c, downloadTask);
                        return;
                    } else if (status != 6) {
                        if (status != 7) {
                            switch (status) {
                                case 9:
                                    int downloadType = downloadTask.getDownloadType();
                                    if (downloadType != 0 && downloadType != 1) {
                                        if (downloadType != 2) {
                                            return;
                                        }
                                        UtilsMy.u4(downloadTask);
                                        return;
                                    } else if (!com.join.android.app.common.utils.j.j(this.f45600c)) {
                                        com.join.mgps.Util.l2.a(this.f45600c).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.I2(this.f45600c, downloadTask);
                                        return;
                                    }
                                case 10:
                                    break;
                                case 11:
                                    UtilsMy.a4(downloadTask, this.f45600c);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
                com.php25.PDownload.d.c(downloadTask, this.f45600c);
                return;
            }
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(this.f45600c);
            a5.b(downloadTask.getShowName() + "正在下载");
            return;
        }
        com.join.mgps.Util.l2 a6 = com.join.mgps.Util.l2.a(this.f45600c);
        a6.b(downloadTask.getShowName() + "开始下载");
        if (UtilsMy.x0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this.f45600c, downloadTask.getCrc_link_type_val());
        } else if (UtilsMy.o1(this.f45600c, downloadTask)) {
        } else {
            if (i4 == 5) {
                UtilsMy.l1(this.f45600c, downloadTask);
            } else {
                UtilsMy.R0(this.f45600c, downloadTask, downloadTask.getTp_down_url(), downloadTask.getOther_down_switch(), downloadTask.getCdn_down_switch());
            }
        }
    }

    private Map<String, DownloadTask> e(int i4, int i5, List<WarMatchAndLocalTable> list) {
        DownloadTask downloadTask;
        DownloadTask downloadTask2;
        DownloadTask downloadTask3;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int i6 = (i4 - (i5 + 1)) * 3;
        try {
            WarMatchAndLocalTable warMatchAndLocalTable = list.get(i6);
            if (this.f45601d.containsKey(warMatchAndLocalTable.getCrc_link_type_val()) && (downloadTask3 = this.f45601d.get(warMatchAndLocalTable.getCrc_link_type_val())) != null) {
                concurrentHashMap.put("Left", downloadTask3);
            }
            int i7 = i6 + 1;
            if (i7 < list.size()) {
                WarMatchAndLocalTable warMatchAndLocalTable2 = list.get(i7);
                if (this.f45601d.containsKey(warMatchAndLocalTable2.getCrc_link_type_val()) && (downloadTask2 = this.f45601d.get(warMatchAndLocalTable2.getCrc_link_type_val())) != null) {
                    concurrentHashMap.put("Mid", downloadTask2);
                }
            }
            int i8 = i6 + 2;
            if (i8 < list.size()) {
                WarMatchAndLocalTable warMatchAndLocalTable3 = list.get(i8);
                if (this.f45601d.containsKey(warMatchAndLocalTable3.getCrc_link_type_val()) && (downloadTask = this.f45601d.get(warMatchAndLocalTable3.getCrc_link_type_val())) != null) {
                    concurrentHashMap.put("Right", downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            int status = downloadTask.getStatus();
            if (UtilsMy.x0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
                status = 43;
            }
            switch (status) {
                case 0:
                    if (UtilsMy.x0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(this.f45600c, downloadTask.getCrc_link_type_val());
                        return;
                    } else if (UtilsMy.o1(this.f45600c, downloadTask)) {
                        return;
                    } else {
                        if (i4 == 5) {
                            UtilsMy.l1(this.f45600c, downloadTask);
                            return;
                        } else {
                            UtilsMy.R0(this.f45600c, downloadTask, downloadTask.getTp_down_url(), downloadTask.getOther_down_switch(), downloadTask.getCdn_down_switch());
                            return;
                        }
                    }
                case 1:
                case 3:
                case 6:
                    com.php25.PDownload.d.c(downloadTask, this.f45600c);
                    return;
                case 2:
                case 10:
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                case 4:
                case 8:
                default:
                    return;
                case 5:
                    if (downloadTask.getGameZipPath() != null) {
                        if (new File(downloadTask.getGameZipPath()).exists()) {
                            UtilsMy.T3(this.f45600c, downloadTask);
                            return;
                        }
                        com.php25.PDownload.d.a(downloadTask);
                        com.php25.PDownload.d.c(downloadTask, this.f45600c);
                        downloadTask.setStatus(3);
                        return;
                    }
                    return;
                case 7:
                    com.php25.PDownload.d.c(downloadTask, this.f45600c);
                    return;
                case 9:
                    int downloadType = downloadTask.getDownloadType();
                    if (downloadType != 0 && downloadType != 1) {
                        if (downloadType != 2) {
                            return;
                        }
                        UtilsMy.u4(downloadTask);
                        return;
                    } else if (!com.join.android.app.common.utils.j.j(this.f45600c)) {
                        com.join.mgps.Util.l2.a(this.f45600c).b("无网络连接");
                        return;
                    } else {
                        UtilsMy.I2(this.f45600c, downloadTask);
                        return;
                    }
                case 11:
                    UtilsMy.a4(downloadTask, this.f45600c);
                    return;
            }
        }
    }

    public LoadWarCenterBean f() {
        return this.f45610m;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45618u;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (getItemViewType(i4) == 2) {
            int i5 = this.f45612o;
            if (i5 > 0 && i4 <= i5 + ((this.f45604g.size() + 2) / 3)) {
                return e(i4, this.f45612o, this.f45604g);
            }
            int i6 = this.f45613p;
            if (i6 > 0 && i4 <= i6 + ((this.f45605h.size() + 2) / 3)) {
                return e(i4, this.f45613p, this.f45605h);
            }
            int i7 = this.f45614q;
            if (i7 > 0 && i4 <= i7 + ((this.f45606i.size() + 2) / 3)) {
                return e(i4, this.f45614q, this.f45606i);
            }
            int i8 = this.f45615r;
            if (i8 > 0 && i4 <= i8 + ((this.f45607j.size() + 2) / 3)) {
                return e(i4, this.f45615r, this.f45607j);
            }
            int i9 = this.f45616s;
            if (i9 > 0 && i4 <= i9 + ((this.f45608k.size() + 2) / 3)) {
                return e(i4, this.f45616s, this.f45608k);
            }
            int i10 = this.f45617t;
            if (i10 > 0 && i4 <= i10 + ((this.f45609l.size() + 2) / 3)) {
                return e(i4, this.f45617t, this.f45609l);
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        int i5 = this.f45612o;
        if (i4 < i5) {
            return 0;
        }
        return (i4 == i5 || i4 == this.f45613p || i4 == this.f45614q || i4 == this.f45615r || i4 == this.f45616s || i4 == this.f45617t) ? 1 : 2;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        o oVar;
        n nVar;
        o oVar2;
        n nVar2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i4);
            sb.append(";total=");
            sb.append(getCount());
            int itemViewType = getItemViewType(i4);
            C0343p c0343p = null;
            if (view == null) {
                if (itemViewType == 0) {
                    o oVar3 = new o();
                    view = LayoutInflater.from(this.f45600c).inflate(R.layout.fight_hot_game_item, (ViewGroup) null);
                    oVar3.f45682a = (SimpleDraweeView) view.findViewById(R.id.fightImgLeft);
                    oVar3.f45683b = (SimpleDraweeView) view.findViewById(R.id.fightImgRight);
                    oVar3.f45684c = (ImageView) view.findViewById(R.id.fightIconLeft);
                    oVar3.f45685d = (ImageView) view.findViewById(R.id.fightIconRight);
                    oVar3.f45686e = (RelativeLayout) view.findViewById(R.id.fightLayoutRight);
                    view.setTag(oVar3);
                    oVar2 = oVar3;
                    nVar2 = null;
                } else if (itemViewType == 1) {
                    C0343p c0343p2 = new C0343p();
                    view = LayoutInflater.from(this.f45600c).inflate(R.layout.fight_type_title, (ViewGroup) null);
                    c0343p2.f45689b = (TextView) view.findViewById(R.id.fightTitle);
                    c0343p2.f45690c = (TextView) view.findViewById(R.id.fightSubTitle);
                    c0343p2.f45688a = (LinearLayout) view.findViewById(R.id.linearLayoutMFight);
                    view.setTag(c0343p2);
                    nVar2 = null;
                    c0343p = c0343p2;
                    oVar2 = null;
                } else if (itemViewType != 2) {
                    oVar2 = null;
                    nVar2 = null;
                } else {
                    nVar2 = new n();
                    view = LayoutInflater.from(this.f45600c).inflate(R.layout.fight_game_item, (ViewGroup) null);
                    nVar2.f45656a = (LinearLayout) view.findViewById(R.id.fightLayoutLeft);
                    nVar2.f45657b = (LinearLayout) view.findViewById(R.id.fightLayoutMid);
                    nVar2.f45658c = (LinearLayout) view.findViewById(R.id.fightLayoutRight);
                    nVar2.f45659d = (SimpleDraweeView) view.findViewById(R.id.fightImgLeft);
                    nVar2.f45660e = (SimpleDraweeView) view.findViewById(R.id.fightImgMid);
                    nVar2.f45661f = (SimpleDraweeView) view.findViewById(R.id.fightImgRight);
                    nVar2.f45662g = (ImageView) view.findViewById(R.id.statusImgLeft);
                    nVar2.f45663h = (ImageView) view.findViewById(R.id.statusImgMid);
                    nVar2.f45664i = (ImageView) view.findViewById(R.id.statusImgRight);
                    nVar2.f45665j = (ImageView) view.findViewById(R.id.tagImgLeft);
                    nVar2.f45666k = (ImageView) view.findViewById(R.id.tagImgMid);
                    nVar2.f45667l = (ImageView) view.findViewById(R.id.tagImgRight);
                    nVar2.f45668m = (LinearLayout) view.findViewById(R.id.downloadStatusLeft);
                    nVar2.f45669n = (LinearLayout) view.findViewById(R.id.downloadStatusMid);
                    nVar2.f45670o = (LinearLayout) view.findViewById(R.id.downloadStatusRight);
                    nVar2.f45671p = (TextView) view.findViewById(R.id.statusBtnLeft);
                    nVar2.f45672q = (TextView) view.findViewById(R.id.statusBtnMid);
                    nVar2.f45673r = (TextView) view.findViewById(R.id.statusBtnRight);
                    nVar2.f45674s = (TextView) view.findViewById(R.id.appSizeTvLeft);
                    nVar2.f45675t = (TextView) view.findViewById(R.id.appSizeTvMid);
                    nVar2.f45676u = (TextView) view.findViewById(R.id.appSizeTvRight);
                    nVar2.f45677v = (TextView) view.findViewById(R.id.speedTvLeft);
                    nVar2.f45678w = (TextView) view.findViewById(R.id.speedTvMid);
                    nVar2.f45679x = (TextView) view.findViewById(R.id.speedTvRight);
                    nVar2.E = (TextView) view.findViewById(R.id.fightNameTvLeft);
                    nVar2.F = (TextView) view.findViewById(R.id.fightNameTvMid);
                    nVar2.G = (TextView) view.findViewById(R.id.fightNameIvRight);
                    nVar2.f45680y = (ProgressBar) view.findViewById(R.id.progressBarZipLeft);
                    nVar2.f45681z = (ProgressBar) view.findViewById(R.id.progressBarZipMid);
                    nVar2.A = (ProgressBar) view.findViewById(R.id.progressBarZipRight);
                    nVar2.B = (ProgressBar) view.findViewById(R.id.progressBarLeft);
                    nVar2.C = (ProgressBar) view.findViewById(R.id.progressBarMid);
                    nVar2.D = (ProgressBar) view.findViewById(R.id.progressBarRight);
                    view.setTag(nVar2);
                    oVar2 = null;
                }
                oVar = oVar2;
                nVar = nVar2;
            } else if (itemViewType == 0) {
                oVar = (o) view.getTag();
                nVar = null;
            } else if (itemViewType == 1) {
                oVar = null;
                c0343p = (C0343p) view.getTag();
                nVar = null;
            } else if (itemViewType != 2) {
                nVar = null;
                oVar = null;
            } else {
                nVar = (n) view.getTag();
                oVar = null;
            }
            if (itemViewType == 0) {
                List<FightMainTable> list = this.f45602e;
                if (list != null && list.size() > 0) {
                    int i5 = i4 * 2;
                    FightMainTable fightMainTable = this.f45602e.get(i5);
                    if (com.join.mgps.Util.g2.i(fightMainTable.getPic_remote())) {
                        MyImageLoader.f(oVar.f45682a, R.drawable.main_normal_icon, fightMainTable.getPic_remote(), MyImageLoader.D(this.f45600c));
                    } else {
                        oVar.f45682a.setImageDrawable(this.f45600c.getResources().getDrawable(R.drawable.main_normal_icon));
                    }
                    if (fightMainTable.getLink_type() == 1) {
                        if (this.f45601d.containsKey(fightMainTable.getCrc_link_type_val())) {
                            DownloadTask downloadTask = this.f45601d.get(fightMainTable.getCrc_link_type_val());
                            if (downloadTask != null && downloadTask.getStatus() == 5) {
                                oVar.f45684c.setVisibility(0);
                            } else {
                                oVar.f45684c.setVisibility(8);
                            }
                            UtilsMy.v1(downloadTask, fightMainTable);
                            oVar.f45682a.setOnClickListener(new e(downloadTask, fightMainTable));
                        } else {
                            oVar.f45684c.setVisibility(8);
                        }
                    } else {
                        oVar.f45682a.setOnClickListener(new f(fightMainTable));
                    }
                    int i6 = i5 + 1;
                    if (i6 < this.f45602e.size()) {
                        oVar.f45686e.setVisibility(0);
                        oVar.f45683b.setImageDrawable(this.f45600c.getResources().getDrawable(R.drawable.main_normal_icon));
                        FightMainTable fightMainTable2 = this.f45602e.get(i6);
                        if (com.join.mgps.Util.g2.i(fightMainTable2.getPic_remote())) {
                            MyImageLoader.f(oVar.f45683b, R.drawable.main_normal_icon, fightMainTable2.getPic_remote(), MyImageLoader.D(this.f45600c));
                        } else {
                            oVar.f45682a.setImageDrawable(this.f45600c.getResources().getDrawable(R.drawable.main_normal_icon));
                        }
                        if (fightMainTable2.getLink_type() == 1) {
                            DownloadTask downloadTask2 = this.f45601d.get(fightMainTable2.getCrc_link_type_val());
                            if (downloadTask2 != null && downloadTask2.getStatus() == 5) {
                                oVar.f45685d.setVisibility(0);
                            } else {
                                oVar.f45685d.setVisibility(8);
                            }
                            UtilsMy.v1(downloadTask2, fightMainTable);
                            oVar.f45683b.setOnClickListener(new g(downloadTask2, fightMainTable));
                        } else {
                            oVar.f45683b.setOnClickListener(new h(fightMainTable2));
                        }
                    } else {
                        oVar.f45686e.setVisibility(4);
                    }
                }
            } else if (itemViewType == 1) {
                int i7 = this.f45612o;
                if (i7 == i4) {
                    c0343p.f45688a.setVisibility(0);
                    List<WarMatchAndLocalTable> list2 = this.f45604g;
                    if (list2 != null && list2.size() > 0) {
                        c0343p.f45689b.setText(this.f45604g.get(0).getMain_title());
                        c0343p.f45690c.setText(this.f45604g.get(0).getMain_sub_title());
                    }
                } else {
                    int i8 = this.f45613p;
                    if (i8 == i4) {
                        c0343p.f45688a.setVisibility(0);
                        List<WarMatchAndLocalTable> list3 = this.f45605h;
                        if (list3 != null && list3.size() > 0) {
                            c0343p.f45689b.setText(this.f45605h.get(0).getMain_title());
                            c0343p.f45690c.setText(this.f45605h.get(0).getMain_sub_title());
                        }
                    } else {
                        int i9 = this.f45614q;
                        if (i9 == i4) {
                            c0343p.f45688a.setVisibility(0);
                            List<WarMatchAndLocalTable> list4 = this.f45606i;
                            if (list4 != null && list4.size() > 0) {
                                c0343p.f45689b.setText(this.f45606i.get(0).getMain_title());
                                c0343p.f45690c.setText(this.f45606i.get(0).getMain_sub_title());
                            }
                        } else {
                            int i10 = this.f45615r;
                            if (i10 == i4) {
                                c0343p.f45688a.setVisibility(0);
                                List<WarMatchAndLocalTable> list5 = this.f45607j;
                                if (list5 != null && list5.size() > 0) {
                                    c0343p.f45689b.setText(this.f45607j.get(0).getMain_title());
                                    c0343p.f45690c.setText(this.f45607j.get(0).getMain_sub_title());
                                }
                            } else {
                                int i11 = this.f45616s;
                                if (i11 == i4) {
                                    c0343p.f45688a.setVisibility(0);
                                    List<WarMatchAndLocalTable> list6 = this.f45608k;
                                    if (list6 != null && list6.size() > 0) {
                                        c0343p.f45689b.setText(this.f45608k.get(0).getMain_title());
                                        c0343p.f45690c.setText(this.f45608k.get(0).getMain_sub_title());
                                    }
                                } else {
                                    int i12 = this.f45617t;
                                    if (i12 == i4) {
                                        c0343p.f45688a.setVisibility(0);
                                        List<WarMatchAndLocalTable> list7 = this.f45609l;
                                        if (list7 != null && list7.size() > 0) {
                                            c0343p.f45689b.setText(this.f45609l.get(0).getMain_title());
                                            c0343p.f45690c.setText(this.f45609l.get(0).getMain_sub_title());
                                        }
                                    } else if (i7 == 0 || i8 == 0 || i9 == 0 || i10 == 0 || i11 == 0 || i12 == 0) {
                                        c0343p.f45688a.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (itemViewType == 2) {
                int i13 = this.f45612o;
                if (i13 > 0 && i4 <= i13 + ((this.f45604g.size() + 2) / 3)) {
                    i(i4, this.f45612o, this.f45604g, nVar);
                }
                int i14 = this.f45613p;
                if (i14 > 0 && i4 <= i14 + ((this.f45605h.size() + 2) / 3)) {
                    i(i4, this.f45613p, this.f45605h, nVar);
                }
                int i15 = this.f45614q;
                if (i15 > 0 && i4 <= i15 + ((this.f45606i.size() + 2) / 3)) {
                    i(i4, this.f45614q, this.f45606i, nVar);
                }
                int i16 = this.f45615r;
                if (i16 > 0 && i4 <= i16 + ((this.f45607j.size() + 2) / 3)) {
                    i(i4, this.f45615r, this.f45607j, nVar);
                }
                int i17 = this.f45616s;
                if (i17 > 0 && i4 <= i17 + ((this.f45608k.size() + 2) / 3)) {
                    i(i4, this.f45616s, this.f45608k, nVar);
                }
                int i18 = this.f45617t;
                if (i18 > 0 && i4 <= i18 + ((this.f45609l.size() + 2) / 3)) {
                    i(i4, this.f45617t, this.f45609l, nVar);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }

    public void h(LoadWarCenterBean loadWarCenterBean) {
        this.f45610m = loadWarCenterBean;
        this.f45601d = loadWarCenterBean.getDownloadTasksMap();
        this.f45602e = this.f45610m.getFightMainTables();
        this.f45603f = this.f45610m.getWaradInfoDataBeans();
        this.f45604g = this.f45610m.getHotGameInfoDataBeans();
        this.f45605h = this.f45610m.getPkGameInfoDataBeans();
        this.f45606i = this.f45610m.getPkPassInfoDataBeans();
        this.f45607j = this.f45610m.getPkMatchingInfoDataBeans();
        this.f45608k = this.f45610m.getPkLocalInfoDataBeans();
        this.f45609l = this.f45610m.getPkRoomInfoDataBeans();
        this.f45618u = 0;
        for (int i4 = 0; i4 < 7; i4++) {
            switch (i4) {
                case 0:
                    List<FightMainTable> list = this.f45602e;
                    if (list != null && list.size() > 0) {
                        int size = this.f45618u + ((this.f45602e.size() + 1) / 2);
                        this.f45612o = size;
                        this.f45611n = size;
                        this.f45618u = size;
                        break;
                    }
                    break;
                case 1:
                    List<WarMatchAndLocalTable> list2 = this.f45604g;
                    if (list2 != null && list2.size() > 0) {
                        int size2 = this.f45618u + 1 + ((this.f45604g.size() + 2) / 3);
                        this.f45613p = size2;
                        this.f45618u = size2;
                        break;
                    } else {
                        this.f45612o = 0;
                        break;
                    }
                case 2:
                    List<WarMatchAndLocalTable> list3 = this.f45605h;
                    if (list3 != null && list3.size() > 0) {
                        int size3 = this.f45618u + 1 + ((this.f45605h.size() + 2) / 3);
                        this.f45614q = size3;
                        this.f45618u = size3;
                        break;
                    } else {
                        this.f45613p = 0;
                        break;
                    }
                case 3:
                    List<WarMatchAndLocalTable> list4 = this.f45606i;
                    if (list4 != null && list4.size() > 0) {
                        int size4 = this.f45618u + 1 + ((this.f45606i.size() + 2) / 3);
                        this.f45615r = size4;
                        this.f45618u = size4;
                        break;
                    } else {
                        this.f45614q = 0;
                        break;
                    }
                case 4:
                    List<WarMatchAndLocalTable> list5 = this.f45607j;
                    if (list5 != null && list5.size() > 0) {
                        int size5 = this.f45618u + 1 + ((this.f45607j.size() + 2) / 3);
                        this.f45616s = size5;
                        this.f45618u = size5;
                        break;
                    } else {
                        this.f45615r = 0;
                        break;
                    }
                    break;
                case 5:
                    List<WarMatchAndLocalTable> list6 = this.f45608k;
                    if (list6 != null && list6.size() > 0) {
                        int size6 = this.f45618u + 1 + ((this.f45608k.size() + 2) / 3);
                        this.f45617t = size6;
                        this.f45618u = size6;
                        break;
                    } else {
                        this.f45616s = 0;
                        break;
                    }
                    break;
                case 6:
                    List<WarMatchAndLocalTable> list7 = this.f45609l;
                    if (list7 != null && list7.size() > 0) {
                        this.f45618u = this.f45618u + 1 + ((this.f45609l.size() + 2) / 3);
                        break;
                    } else {
                        this.f45617t = 0;
                        break;
                    }
                    break;
            }
        }
        notifyDataSetChanged();
    }

    void i(int i4, int i5, List<WarMatchAndLocalTable> list, n nVar) {
        DownloadTask downloadTask;
        int i6 = i5 + 1;
        if (i4 < i6) {
            return;
        }
        int i7 = (i4 - i6) * 3;
        WarMatchAndLocalTable warMatchAndLocalTable = list.get(i7);
        if (this.f45601d.containsKey(warMatchAndLocalTable.getCrc_link_type_val()) && (downloadTask = this.f45601d.get(warMatchAndLocalTable.getCrc_link_type_val())) != null) {
            UtilsMy.w1(downloadTask, warMatchAndLocalTable);
            if (com.join.mgps.Util.g2.i(downloadTask.getFight_screenshot_pic())) {
                MyImageLoader.f(nVar.f45659d, R.drawable.main_normal_icon, downloadTask.getFight_screenshot_pic(), MyImageLoader.D(this.f45600c));
            } else {
                MyImageLoader.f(nVar.f45659d, R.drawable.main_normal_icon, downloadTask.getScreenshot_pic(), MyImageLoader.D(this.f45600c));
            }
            nVar.E.setText(downloadTask.getShowName());
            if (downloadTask.getStatus() == 5) {
                nVar.f45668m.setVisibility(8);
                nVar.f45662g.setVisibility(8);
                nVar.f45665j.setVisibility(0);
                nVar.f45656a.setOnClickListener(new i(downloadTask, warMatchAndLocalTable));
            } else if (downloadTask.getStatus() != 7 && downloadTask.getStatus() != 0) {
                nVar.f45668m.setVisibility(0);
                nVar.f45662g.setVisibility(0);
                nVar.f45665j.setVisibility(8);
                nVar.f45671p.setOnClickListener(new k(downloadTask, warMatchAndLocalTable));
                long parseDouble = (long) (Double.parseDouble(warMatchAndLocalTable.getAppSize()) * 1024.0d * 1024.0d);
                int status = downloadTask.getStatus();
                if (status == 2) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_blue_butn);
                    nVar.f45671p.setText("暂停");
                    TextView textView = nVar.f45674s;
                    textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    TextView textView2 = nVar.f45677v;
                    textView2.setText(downloadTask.getSpeed() + "/S");
                    nVar.B.setVisibility(0);
                    nVar.f45680y.setVisibility(8);
                    nVar.B.setProgress((int) downloadTask.getProgress());
                } else if (status == 3 || status == 6) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_blue_butn);
                    nVar.f45671p.setText("继续");
                    TextView textView3 = nVar.f45674s;
                    textView3.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    nVar.f45677v.setText("暂停中");
                    nVar.B.setVisibility(0);
                    nVar.f45680y.setVisibility(8);
                    nVar.B.setProgress((int) downloadTask.getProgress());
                } else if (status == 27) {
                    nVar.f45671p.setText("暂停中");
                } else if (status == 9) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_green_butn);
                    nVar.f45671p.setText("更新");
                    nVar.f45674s.setVisibility(8);
                    nVar.f45677v.setVisibility(8);
                    nVar.B.setVisibility(8);
                    nVar.f45680y.setVisibility(8);
                } else if (status == 10) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_blue_butn);
                    nVar.f45671p.setText("等待");
                    TextView textView4 = nVar.f45674s;
                    textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    nVar.f45677v.setText("等待中");
                    nVar.B.setVisibility(0);
                    nVar.f45680y.setVisibility(8);
                    nVar.B.setProgress((int) downloadTask.getProgress());
                } else if (status == 12) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_grey_butn);
                    nVar.f45671p.setText("解压中");
                    TextView textView5 = nVar.f45674s;
                    textView5.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    nVar.f45677v.setText("解压中..");
                    nVar.B.setVisibility(8);
                    nVar.f45680y.setVisibility(0);
                    nVar.f45680y.setProgress((int) downloadTask.getProgress());
                } else if (status == 13) {
                    nVar.f45671p.setBackgroundResource(R.drawable.fight_blue_butn);
                    nVar.f45671p.setText("解压");
                    TextView textView6 = nVar.f45674s;
                    textView6.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    nVar.f45677v.setText("点击重新解压");
                    nVar.B.setVisibility(8);
                    nVar.f45680y.setVisibility(0);
                    nVar.f45680y.setProgress((int) downloadTask.getProgress());
                }
            } else {
                nVar.f45668m.setVisibility(8);
                nVar.f45662g.setVisibility(8);
                nVar.f45665j.setVisibility(8);
                nVar.f45656a.setOnClickListener(new j(downloadTask, warMatchAndLocalTable));
            }
        }
        int i8 = i7 + 1;
        if (i8 < list.size()) {
            nVar.f45657b.setVisibility(0);
            WarMatchAndLocalTable warMatchAndLocalTable2 = list.get(i8);
            DownloadTask downloadTask2 = this.f45601d.get(warMatchAndLocalTable2.getCrc_link_type_val());
            if (downloadTask2 != null) {
                if (com.join.mgps.Util.g2.i(downloadTask2.getFight_screenshot_pic())) {
                    MyImageLoader.f(nVar.f45660e, R.drawable.main_normal_icon, downloadTask2.getFight_screenshot_pic(), MyImageLoader.D(this.f45600c));
                } else {
                    MyImageLoader.f(nVar.f45660e, R.drawable.main_normal_icon, downloadTask2.getScreenshot_pic(), MyImageLoader.D(this.f45600c));
                }
                long parseDouble2 = (long) (Double.parseDouble(warMatchAndLocalTable2.getAppSize()) * 1024.0d * 1024.0d);
                nVar.F.setText(downloadTask2.getShowName());
                if (downloadTask2.getStatus() == 5) {
                    nVar.f45669n.setVisibility(8);
                    nVar.f45663h.setVisibility(8);
                    nVar.f45666k.setVisibility(0);
                    nVar.f45657b.setOnClickListener(new l(downloadTask2, warMatchAndLocalTable));
                } else if (downloadTask2.getStatus() != 7 && downloadTask2.getStatus() != 0) {
                    nVar.f45669n.setVisibility(0);
                    nVar.f45663h.setVisibility(0);
                    nVar.f45666k.setVisibility(8);
                    nVar.f45672q.setOnClickListener(new a(downloadTask2, warMatchAndLocalTable));
                    int status2 = downloadTask2.getStatus();
                    if (status2 == 2) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45672q.setText("暂停");
                        TextView textView7 = nVar.f45675t;
                        textView7.setText(UtilsMy.a(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble2));
                        TextView textView8 = nVar.f45678w;
                        textView8.setText(downloadTask2.getSpeed() + "/S");
                        nVar.C.setVisibility(0);
                        nVar.f45681z.setVisibility(8);
                        nVar.C.setProgress((int) downloadTask2.getProgress());
                    } else if (status2 == 3 || status2 == 6) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45672q.setText("继续");
                        TextView textView9 = nVar.f45675t;
                        textView9.setText(UtilsMy.a(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble2));
                        nVar.f45678w.setText("暂停中");
                        nVar.C.setVisibility(0);
                        nVar.f45681z.setVisibility(8);
                        nVar.C.setProgress((int) downloadTask2.getProgress());
                    } else if (status2 == 27) {
                        nVar.f45672q.setText("暂停中");
                    } else if (status2 == 9) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_green_butn);
                        nVar.f45672q.setText("更新");
                        nVar.f45675t.setVisibility(8);
                        nVar.f45678w.setVisibility(8);
                        nVar.C.setVisibility(8);
                        nVar.f45681z.setVisibility(8);
                    } else if (status2 == 10) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45672q.setText("等待");
                        TextView textView10 = nVar.f45675t;
                        textView10.setText(UtilsMy.a(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble2));
                        nVar.f45678w.setText("等待中");
                        nVar.C.setVisibility(0);
                        nVar.f45681z.setVisibility(8);
                        nVar.C.setProgress((int) downloadTask2.getProgress());
                    } else if (status2 == 12) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_grey_butn);
                        nVar.f45672q.setText("解压中");
                        TextView textView11 = nVar.f45675t;
                        textView11.setText(UtilsMy.a(parseDouble2) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble2));
                        nVar.f45678w.setText("解压中..");
                        nVar.C.setVisibility(8);
                        nVar.f45681z.setVisibility(0);
                        nVar.f45681z.setProgress((int) downloadTask2.getProgress());
                    } else if (status2 == 13) {
                        nVar.f45672q.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45672q.setText("解压");
                        TextView textView12 = nVar.f45675t;
                        textView12.setText(UtilsMy.a(parseDouble2) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble2));
                        nVar.f45678w.setText("点击重新解压");
                        nVar.C.setVisibility(8);
                        nVar.f45681z.setVisibility(0);
                        nVar.f45681z.setProgress((int) downloadTask2.getProgress());
                    }
                } else {
                    nVar.f45669n.setVisibility(8);
                    nVar.f45663h.setVisibility(8);
                    nVar.f45666k.setVisibility(8);
                    nVar.f45657b.setOnClickListener(new m(downloadTask2, warMatchAndLocalTable));
                }
            }
        } else {
            nVar.f45657b.setVisibility(4);
        }
        int i9 = i7 + 2;
        if (i9 < list.size()) {
            nVar.f45658c.setVisibility(0);
            WarMatchAndLocalTable warMatchAndLocalTable3 = list.get(i9);
            DownloadTask downloadTask3 = this.f45601d.get(warMatchAndLocalTable3.getCrc_link_type_val());
            if (downloadTask3 != null) {
                if (com.join.mgps.Util.g2.i(downloadTask3.getFight_screenshot_pic())) {
                    MyImageLoader.f(nVar.f45661f, R.drawable.main_normal_icon, downloadTask3.getFight_screenshot_pic(), MyImageLoader.D(this.f45600c));
                } else {
                    MyImageLoader.f(nVar.f45661f, R.drawable.main_normal_icon, downloadTask3.getScreenshot_pic(), MyImageLoader.D(this.f45600c));
                }
                long parseDouble3 = (long) (Double.parseDouble(warMatchAndLocalTable3.getAppSize()) * 1024.0d * 1024.0d);
                nVar.G.setText(downloadTask3.getShowName());
                if (downloadTask3.getStatus() == 5) {
                    nVar.f45670o.setVisibility(8);
                    nVar.f45664i.setVisibility(8);
                    nVar.f45667l.setVisibility(0);
                    nVar.f45658c.setOnClickListener(new b(downloadTask3, warMatchAndLocalTable));
                    return;
                } else if (downloadTask3.getStatus() != 7 && downloadTask3.getStatus() != 0) {
                    nVar.f45670o.setVisibility(0);
                    nVar.f45664i.setVisibility(0);
                    nVar.f45667l.setVisibility(8);
                    nVar.f45673r.setOnClickListener(new d(downloadTask3, warMatchAndLocalTable));
                    int status3 = downloadTask3.getStatus();
                    if (status3 == 2) {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45673r.setText("暂停");
                        TextView textView13 = nVar.f45676u;
                        textView13.setText(UtilsMy.a(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble3));
                        TextView textView14 = nVar.f45679x;
                        textView14.setText(downloadTask3.getSpeed() + "/S");
                        nVar.D.setVisibility(0);
                        nVar.A.setVisibility(8);
                        nVar.D.setProgress((int) downloadTask3.getProgress());
                        return;
                    } else if (status3 == 3 || status3 == 6) {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45673r.setText("继续");
                        TextView textView15 = nVar.f45676u;
                        textView15.setText(UtilsMy.a(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble3));
                        nVar.f45679x.setText("暂停中");
                        nVar.D.setVisibility(0);
                        nVar.A.setVisibility(8);
                        nVar.D.setProgress((int) downloadTask3.getProgress());
                        return;
                    } else if (status3 == 27) {
                        nVar.f45673r.setText("暂停中");
                        return;
                    } else if (status3 == 9) {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_green_butn);
                        nVar.f45673r.setText("更新");
                        nVar.f45676u.setVisibility(8);
                        nVar.f45679x.setVisibility(8);
                        nVar.D.setVisibility(8);
                        nVar.A.setVisibility(8);
                        return;
                    } else if (status3 == 10) {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45673r.setText("等待");
                        TextView textView16 = nVar.f45676u;
                        textView16.setText(UtilsMy.a(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble3));
                        nVar.f45679x.setText("等待中");
                        nVar.D.setVisibility(0);
                        nVar.A.setVisibility(8);
                        nVar.D.setProgress((int) downloadTask3.getProgress());
                        return;
                    } else if (status3 == 12) {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_grey_butn);
                        nVar.f45673r.setText("解压中");
                        TextView textView17 = nVar.f45676u;
                        textView17.setText(UtilsMy.a(parseDouble3) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble3));
                        nVar.f45679x.setText("解压中..");
                        nVar.D.setVisibility(8);
                        nVar.A.setVisibility(0);
                        nVar.A.setProgress((int) downloadTask3.getProgress());
                        return;
                    } else if (status3 != 13) {
                        return;
                    } else {
                        nVar.f45673r.setBackgroundResource(R.drawable.fight_blue_butn);
                        nVar.f45673r.setText("解压");
                        TextView textView18 = nVar.f45676u;
                        textView18.setText(UtilsMy.a(parseDouble3) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble3));
                        nVar.f45679x.setText("点击重新解压");
                        nVar.D.setVisibility(8);
                        nVar.A.setVisibility(0);
                        nVar.A.setProgress((int) downloadTask3.getProgress());
                        return;
                    }
                } else {
                    nVar.f45670o.setVisibility(8);
                    nVar.f45664i.setVisibility(8);
                    nVar.f45667l.setVisibility(8);
                    nVar.f45658c.setOnClickListener(new c(downloadTask3, warMatchAndLocalTable));
                    return;
                }
            }
            return;
        }
        nVar.f45658c.setVisibility(4);
    }
}
