package com.join.mgps.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadedCenterEmulatorAdapter.java */
/* loaded from: classes4.dex */
public class o extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    String f44971b;

    /* renamed from: c  reason: collision with root package name */
    Activity f44972c;

    /* renamed from: d  reason: collision with root package name */
    ListView f44973d;

    /* renamed from: e  reason: collision with root package name */
    k f44974e;

    /* renamed from: f  reason: collision with root package name */
    DownloadCenterBean f44975f;

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44976b;

        a(DownloadTask downloadTask) {
            this.f44976b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.a(this.f44976b);
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44978b;

        b(DownloadTask downloadTask) {
            this.f44978b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(o.this.f44972c, this.f44978b);
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44980b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44981c;

        c(int i4, DownloadTask downloadTask) {
            this.f44980b = i4;
            this.f44981c = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k kVar = o.this.f44974e;
            if (kVar != null) {
                kVar.M(this.f44980b, this.f44981c);
            } else if (this.f44981c.getFileType() == null || !this.f44981c.getFileType().equals(Dtype.chajian.name())) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(o.this.f44972c, this.f44981c);
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44983b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44984c;

        d(int i4, DownloadTask downloadTask) {
            this.f44983b = i4;
            this.f44984c = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k kVar = o.this.f44974e;
            if (kVar != null) {
                kVar.M(this.f44983b, this.f44984c);
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44986b;

        /* compiled from: DownloadedCenterEmulatorAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44988b;

            a(Dialog dialog) {
                this.f44988b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44988b.dismiss();
            }
        }

        /* compiled from: DownloadedCenterEmulatorAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f44990b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Dialog f44991c;

            b(boolean z4, Dialog dialog) {
                this.f44990b = z4;
                this.f44991c = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f44990b) {
                    com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(o.this.f44972c);
                    e eVar = e.this;
                    if (l02.d(o.this.f44972c, eVar.f44986b.getPackageName())) {
                        com.join.android.app.common.utils.e l03 = com.join.android.app.common.utils.e.l0(o.this.f44972c);
                        e eVar2 = e.this;
                        l03.f0(o.this.f44972c, eVar2.f44986b.getPackageName());
                    } else {
                        e eVar3 = e.this;
                        o.this.a(eVar3.f44986b);
                        UtilsMy.x4(e.this.f44986b);
                        o.this.notifyDataSetChanged();
                    }
                } else {
                    e eVar4 = e.this;
                    o.this.a(eVar4.f44986b);
                    UtilsMy.x4(e.this.f44986b);
                    o.this.notifyDataSetChanged();
                }
                this.f44991c.dismiss();
            }
        }

        e(DownloadTask downloadTask) {
            this.f44986b = downloadTask;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            boolean z4;
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(o.this.f44972c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
            TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除游戏");
            String fileType = this.f44986b.getFileType();
            if (fileType != null && fileType.equals(Dtype.android.name())) {
                if (com.join.android.app.common.utils.e.l0(o.this.f44972c).d(o.this.f44972c, this.f44986b.getPackageName())) {
                    textView.setText("你确定要卸载该游戏？");
                    button.setText("卸载");
                } else {
                    textView.setText("你确定要删除该游戏？");
                    button.setText("删除");
                }
                z4 = true;
            } else {
                textView.setText("你确定要删除该游戏及文件？");
                button.setText("删除");
                z4 = false;
            }
            ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new a(oVar));
            button.setOnClickListener(new b(z4, oVar));
            oVar.show();
            return true;
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44993b;

        f(DownloadTask downloadTask) {
            this.f44993b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UtilsMy.t4(o.this.f44972c, this.f44993b.getCrc_link_type_val());
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.f44993b.getUrl());
            IntentUtil.getInstance().intentActivity(o.this.f44972c, intentDateBean);
            UtilsMy.T1(o.this.f44972c, 12, this.f44993b.getCrc_link_type_val());
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44995b;

        g(DownloadTask downloadTask) {
            this.f44995b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44995b.getStatus();
            if (status != 5) {
                if (status != 9) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tag_id", this.f44995b.getCrc_link_type_val());
                List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                if (!com.join.android.app.common.utils.j.j(o.this.f44972c)) {
                    com.join.mgps.Util.l2.a(o.this.f44972c).b("无网络连接");
                    return;
                } else if (h4.size() > 0) {
                    UtilsMy.q1(h4.get(0), o.this.f44972c);
                    return;
                } else {
                    return;
                }
            }
            try {
                if (new File(this.f44995b.getGameZipPath()).exists()) {
                    if (com.join.android.app.common.utils.l.I(o.this.f44972c, this.f44995b, null)) {
                        UtilsMy.S2(this.f44995b, 5);
                    } else {
                        com.join.android.app.common.utils.e.l0(o.this.f44972c).x(o.this.f44972c, this.f44995b.getGameZipPath());
                    }
                } else if (UtilsMy.o1(o.this.f44972c, this.f44995b)) {
                } else {
                    if (this.f44995b.getDown_status() == 5) {
                        UtilsMy.l1(o.this.f44972c, this.f44995b);
                        return;
                    }
                    com.php25.PDownload.d.a(this.f44995b);
                    this.f44995b.setStatus(0);
                    if (UtilsMy.x0(this.f44995b.getPay_game_amount(), this.f44995b.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(o.this.f44972c, this.f44995b.getCrc_link_type_val());
                    } else if (UtilsMy.o1(o.this.f44972c, this.f44995b)) {
                    } else {
                        if (this.f44995b.getDown_status() == 5) {
                            UtilsMy.l1(o.this.f44972c, this.f44995b);
                            return;
                        }
                        Activity activity = o.this.f44972c;
                        DownloadTask downloadTask = this.f44995b;
                        UtilsMy.R0(activity, downloadTask, downloadTask.getTp_down_url(), this.f44995b.getOther_down_switch(), this.f44995b.getCdn_down_switch());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44997b;

        h(DownloadTask downloadTask) {
            this.f44997b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44997b;
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.v0(this.f44997b.getPay_game_amount(), this.f44997b.getCrc_link_type_val()) > 0) {
                status = 43;
            }
            if (status == 5) {
                UtilsMy.W3(o.this.f44972c, this.f44997b, "0");
                return;
            }
            EMUUpdateTable eMUUpdateTable = null;
            if (status != 9) {
                if (status == 11) {
                    UtilsMy.a4(this.f44997b, o.this.f44972c);
                } else if (status != 42) {
                    if (status != 43) {
                        return;
                    }
                    if (UtilsMy.x0(this.f44997b.getPay_game_amount(), this.f44997b.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(o.this.f44972c, this.f44997b.getCrc_link_type_val());
                    } else if (UtilsMy.o1(o.this.f44972c, this.f44997b)) {
                    } else {
                        if (this.f44997b.getDown_status() == 5) {
                            UtilsMy.l1(o.this.f44972c, this.f44997b);
                            return;
                        }
                        Activity activity = o.this.f44972c;
                        DownloadTask downloadTask2 = this.f44997b;
                        UtilsMy.R0(activity, downloadTask2, downloadTask2.getTp_down_url(), this.f44997b.getOther_down_switch(), this.f44997b.getCdn_down_switch());
                    }
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("crc_sign_id", this.f44997b.getCrc_link_type_val());
                    List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                    if (h4 != null && h4.size() > 0) {
                        eMUUpdateTable = h4.get(0);
                    }
                    DownloadTask F = p1.f.K().F(this.f44997b.getCrc_link_type_val());
                    if (F != null) {
                        this.f44997b.setId(F.getId());
                    }
                    if (eMUUpdateTable != null) {
                        this.f44997b.setVer(eMUUpdateTable.getVer());
                        this.f44997b.setVer_name(eMUUpdateTable.getVer_name());
                        this.f44997b.setUrl(eMUUpdateTable.getDown_url_remote());
                        UtilsMy.r4(o.this.f44972c, this.f44997b);
                    }
                }
            } else if (!com.join.android.app.common.utils.j.j(o.this.f44972c)) {
                com.join.mgps.Util.l2.a(o.this.f44972c).b("无网络连接");
            } else {
                TextView textView = (TextView) ((RelativeLayout) view).findViewById(R.id.mgListviewItemInstall);
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("crc_sign_id", this.f44997b.getCrc_link_type_val());
                List<EMUUpdateTable> h5 = b2.q.o().h(hashMap2);
                if (h5 != null && h5.size() > 0) {
                    eMUUpdateTable = h5.get(0);
                }
                DownloadTask F2 = p1.f.K().F(this.f44997b.getCrc_link_type_val());
                if (F2 != null) {
                    this.f44997b.setId(F2.getId());
                }
                if (UtilsMy.o1(o.this.f44972c, this.f44997b)) {
                    return;
                }
                if (this.f44997b.getDown_status() == 5) {
                    UtilsMy.l1(o.this.f44972c, this.f44997b);
                    return;
                }
                o.this.b(this.f44997b);
                if (eMUUpdateTable != null) {
                    this.f44997b.setVer(eMUUpdateTable.getVer());
                    this.f44997b.setVer_name(eMUUpdateTable.getVer_name());
                    this.f44997b.setUrl(eMUUpdateTable.getDown_url_remote());
                    p1.f.K().m(this.f44997b);
                    UtilsMy.L0(p1.f.K().F(this.f44997b.getCrc_link_type_val()));
                    if (UtilsMy.x0(this.f44997b.getPay_game_amount(), this.f44997b.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(o.this.f44972c, this.f44997b.getCrc_link_type_val());
                    } else {
                        Activity activity2 = o.this.f44972c;
                        DownloadTask downloadTask3 = this.f44997b;
                        UtilsMy.R0(activity2, downloadTask3, downloadTask3.getTp_down_url(), this.f44997b.getOther_down_switch(), this.f44997b.getCdn_down_switch());
                    }
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("暂停");
                    textView.setTextColor(-12941854);
                }
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44999b;

        i(DownloadTask downloadTask) {
            this.f44999b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(o.this.f44972c)) {
                com.join.mgps.Util.l2.a(o.this.f44972c).b("无网络连接");
                return;
            }
            int downloadType = this.f44999b.getDownloadType();
            if (downloadType != 0 && downloadType != 1) {
                if (downloadType != 2) {
                    return;
                }
                UtilsMy.u4(this.f44999b);
            } else if (UtilsMy.o1(o.this.f44972c, this.f44999b)) {
            } else {
                if (this.f44999b.getDown_status() == 5) {
                    UtilsMy.l1(o.this.f44972c, this.f44999b);
                    return;
                }
                TextView textView = (TextView) view;
                o.this.a(this.f44999b);
                EMUUpdateTable eMUUpdateTable = null;
                HashMap hashMap = new HashMap(1);
                hashMap.put("crc_sign_id", this.f44999b.getCrc_link_type_val());
                List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                if (h4 != null && h4.size() > 0) {
                    eMUUpdateTable = h4.get(0);
                }
                if (eMUUpdateTable != null) {
                    this.f44999b.setVer(eMUUpdateTable.getVer());
                    this.f44999b.setVer_name(eMUUpdateTable.getVer_name());
                    this.f44999b.setUrl(eMUUpdateTable.getDown_url_remote());
                    if (UtilsMy.x0(this.f44999b.getPay_game_amount(), this.f44999b.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(o.this.f44972c, this.f44999b.getCrc_link_type_val());
                    } else {
                        Activity activity = o.this.f44972c;
                        DownloadTask downloadTask = this.f44999b;
                        UtilsMy.R0(activity, downloadTask, downloadTask.getTp_down_url(), this.f44999b.getOther_down_switch(), this.f44999b.getCdn_down_switch());
                    }
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("暂停");
                    textView.setTextColor(-12941854);
                }
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45001b;

        j(DownloadTask downloadTask) {
            this.f45001b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f45001b;
            if (downloadTask == null || downloadTask.getGameZipPath() == null) {
                return;
            }
            if (new File(this.f45001b.getGameZipPath()).exists()) {
                UtilsMy.W3(o.this.f44972c, this.f45001b, "0");
                String str = o.this.f44971b;
                return;
            }
            o.this.f44975f.getDownloadFiles().remove(this.f45001b);
            if (UtilsMy.x0(this.f45001b.getPay_game_amount(), this.f45001b.getCrc_link_type_val()) > 0) {
                UtilsMy.d4(o.this.f44972c, this.f45001b.getCrc_link_type_val());
            } else if (UtilsMy.o1(o.this.f44972c, this.f45001b)) {
            } else {
                if (this.f45001b.getDown_status() == 5) {
                    UtilsMy.l1(o.this.f44972c, this.f45001b);
                    return;
                }
                Activity activity = o.this.f44972c;
                DownloadTask downloadTask2 = this.f45001b;
                UtilsMy.R0(activity, downloadTask2, downloadTask2.getTp_down_url(), this.f45001b.getOther_down_switch(), this.f45001b.getCdn_down_switch());
            }
        }
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    public interface k {
        void M(int i4, DownloadTask downloadTask);
    }

    /* compiled from: DownloadedCenterEmulatorAdapter.java */
    /* loaded from: classes4.dex */
    class l {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45003a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45004b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f45005c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45006d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45007e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f45008f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f45009g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f45010h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f45011i;

        /* renamed from: j  reason: collision with root package name */
        RelativeLayout f45012j;

        /* renamed from: k  reason: collision with root package name */
        TextView f45013k;

        /* renamed from: l  reason: collision with root package name */
        public ImageView f45014l;

        /* renamed from: m  reason: collision with root package name */
        public ImageView f45015m;

        l() {
        }
    }

    public o(Activity activity, k kVar) {
        this.f44971b = getClass().getSimpleName();
        this.f44975f = new DownloadCenterBean();
        this.f44972c = activity;
        this.f44974e = kVar;
    }

    public void a(DownloadTask downloadTask) {
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                UtilsMy.delete(new File(downloadTask.getGameZipPath()));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Iterator<DownloadTask> it2 = this.f44975f.getDownloadFiles().iterator();
        while (it2.hasNext()) {
            if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
        notifyDataSetChanged();
    }

    public void b(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f44975f.getDownloadFiles().iterator();
        while (it2.hasNext()) {
            if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
        notifyDataSetChanged();
    }

    public DownloadCenterBean c() {
        return this.f44975f;
    }

    public ListView d() {
        return this.f44973d;
    }

    public void e(ListView listView) {
        this.f44973d = listView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44975f.getDownloadFiles().size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f44975f.getDownloadFiles().get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        l lVar;
        try {
            if (view == null) {
                lVar = new l();
                view2 = LayoutInflater.from(this.f44972c).inflate(R.layout.emulator_listview_download_center_history_two, (ViewGroup) null);
                try {
                    lVar.f45004b = (SimpleDraweeView) view2.findViewById(R.id.img);
                    lVar.f45005c = (ImageView) view2.findViewById(R.id.giftPackageSwitch);
                    lVar.f45006d = (TextView) view2.findViewById(R.id.name);
                    lVar.f45008f = (LinearLayout) view2.findViewById(R.id.status);
                    lVar.f45009g = (LinearLayout) view2.findViewById(R.id.dellGame);
                    lVar.f45013k = (TextView) view2.findViewById(R.id.mgListviewItemInstall);
                    lVar.f45012j = (RelativeLayout) view2.findViewById(R.id.rLayoutRight);
                    lVar.f45010h = (LinearLayout) view2.findViewById(R.id.more_layout);
                    lVar.f45011i = (LinearLayout) view2.findViewById(R.id.addtoDesk);
                    lVar.f45007e = (TextView) view2.findViewById(R.id.appInfo);
                    lVar.f45014l = (ImageView) view2.findViewById(R.id.notOpen);
                    lVar.f45015m = (ImageView) view2.findViewById(R.id.itemMoreIv);
                    lVar.f45003a = (LinearLayout) view2.findViewById(R.id.linearLayoutApp);
                    view2.setTag(lVar);
                } catch (Exception e5) {
                    e = e5;
                    e.printStackTrace();
                    return view2;
                }
            } else {
                lVar = (l) view.getTag();
                view2 = view;
            }
            if (i4 <= this.f44975f.getDownloadFiles().size()) {
                DownloadTask downloadTask = this.f44975f.getDownloadFiles().get(i4);
                downloadTask.set_from_type(127);
                try {
                    lVar.f45007e.setText(downloadTask.getDescribe());
                    Double.parseDouble(downloadTask.getShowSize());
                    if (downloadTask.getRomType() != null && downloadTask.getRomType().equals(Dtype.chajian.name()) && com.join.mgps.Util.g2.h(downloadTask.getPortraitURL())) {
                        lVar.f45004b.setImageResource(R.drawable.papa_chajian_icon);
                    } else {
                        MyImageLoader.h(lVar.f45004b, downloadTask.getPortraitURL());
                        UtilsMy.I(downloadTask.getScore(), downloadTask.getDown_count(), downloadTask.getShowSize(), downloadTask.getSp_tag_info(), downloadTask.getTipBeans(), lVar.f45008f, this.f44972c);
                    }
                    if (downloadTask.getGift_package_switch() == 1) {
                        lVar.f45005c.setVisibility(0);
                    } else {
                        lVar.f45005c.setVisibility(8);
                    }
                    lVar.f45006d.setText(downloadTask.getShowName());
                } catch (Exception unused) {
                }
                lVar.f45011i.setOnClickListener(new b(downloadTask));
                lVar.f45003a.setOnClickListener(new c(i4, downloadTask));
                if (this.f44974e != null) {
                    lVar.f45015m.setVisibility(0);
                    lVar.f45015m.setOnClickListener(new d(i4, downloadTask));
                }
                lVar.f45003a.setOnLongClickListener(new e(downloadTask));
                if (downloadTask.isOpen()) {
                    lVar.f45014l.setVisibility(8);
                } else {
                    lVar.f45014l.setVisibility(0);
                }
                if (downloadTask.getPlugin_num() != null) {
                    String plugin_num = downloadTask.getPlugin_num();
                    if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                        lVar.f45013k.setBackgroundResource(R.drawable.recom_blue_butn);
                        lVar.f45013k.setText("开始");
                        lVar.f45008f.setVisibility(8);
                        lVar.f45013k.setTextColor(this.f44972c.getResources().getColor(R.color.app_blue_color));
                        lVar.f45012j.setOnClickListener(new f(downloadTask));
                        lVar.f45009g.setOnClickListener(new a(downloadTask));
                    }
                }
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                    lVar.f45008f.setVisibility(8);
                    if (com.join.mgps.Util.g2.h(downloadTask.getPortraitURL())) {
                        lVar.f45004b.setImageResource(R.drawable.papa_chajian_icon);
                    } else {
                        MyImageLoader.h(lVar.f45004b, downloadTask.getPortraitURL());
                        UtilsMy.I(downloadTask.getScore(), downloadTask.getDown_count(), downloadTask.getShowSize(), downloadTask.getSp_tag_info(), downloadTask.getTipBeans(), lVar.f45008f, this.f44972c);
                    }
                    lVar.f45007e.setText(Html.fromHtml(downloadTask.getDescribe()), TextView.BufferType.SPANNABLE);
                    int status = downloadTask.getStatus();
                    if (status == 5) {
                        lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                        lVar.f45013k.setText("安装");
                        lVar.f45013k.setTextColor(-9263087);
                    } else if (status == 9) {
                        lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                        lVar.f45013k.setText("更新");
                        lVar.f45013k.setTextColor(-9263087);
                    }
                    lVar.f45012j.setOnClickListener(new g(downloadTask));
                } else if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                    lVar.f45008f.setVisibility(0);
                    int status2 = downloadTask.getStatus();
                    if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
                        status2 = 43;
                    }
                    if (status2 != 5) {
                        if (status2 == 9) {
                            lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                            lVar.f45013k.setText("更新");
                            lVar.f45013k.setTextColor(-9263087);
                        } else if (status2 == 11) {
                            lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                            lVar.f45013k.setText("安装");
                            lVar.f45013k.setTextColor(-9263087);
                        } else if (status2 == 48) {
                            lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                            lVar.f45013k.setText("安装中");
                            lVar.f45013k.setTextColor(-9263087);
                        } else if (status2 != 42) {
                            if (status2 == 43) {
                                lVar.f45013k.setBackgroundResource(R.drawable.recom_blue_butn);
                                String string = this.f44972c.getResources().getString(R.string.download_status_purchase);
                                if (downloadTask.getPay_game_amount() > 0) {
                                    string = this.f44972c.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(downloadTask.getPay_game_amount()));
                                }
                                lVar.f45013k.setText(string);
                                lVar.f45013k.setTextColor(this.f44972c.getResources().getColor(R.color.app_blue_color));
                            }
                        }
                        lVar.f45012j.setOnClickListener(new h(downloadTask));
                    }
                    lVar.f45013k.setBackgroundResource(R.drawable.recom_maincolor_butn);
                    lVar.f45013k.setText(this.f44972c.getResources().getString(R.string.download_status_finished));
                    lVar.f45013k.setTextColor(-688602);
                    lVar.f45012j.setOnClickListener(new h(downloadTask));
                } else {
                    lVar.f45013k.setBackgroundResource(R.drawable.recom_maincolor_butn);
                    lVar.f45013k.setText(this.f44972c.getResources().getString(R.string.download_status_finished));
                    lVar.f45013k.setTextColor(-688602);
                    if (downloadTask.getStatus() == 9) {
                        lVar.f45013k.setBackgroundResource(R.drawable.recom_green_butn);
                        lVar.f45013k.setText("更新");
                        lVar.f45013k.setTextColor(-9263087);
                        lVar.f45012j.setOnClickListener(new i(downloadTask));
                    } else {
                        lVar.f45012j.setOnClickListener(new j(downloadTask));
                    }
                    lVar.f45008f.setVisibility(0);
                }
                lVar.f45009g.setOnClickListener(new a(downloadTask));
            }
        } catch (Exception e6) {
            e = e6;
            view2 = view;
        }
        return view2;
    }

    public o(Activity activity) {
        this.f44971b = getClass().getSimpleName();
        this.f44975f = new DownloadCenterBean();
        this.f44972c = activity;
        this.f44974e = null;
    }
}
