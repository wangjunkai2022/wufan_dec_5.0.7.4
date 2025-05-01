package com.join.mgps.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.MyGameManagerActivity;
import com.join.mgps.activity.MyGameUpdateManagerActivity_;
import com.join.mgps.activity.mygame.MyGameGuesslikeActivity_;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MyGameAdapter.java */
/* loaded from: classes4.dex */
public class o2 extends BaseAdapter {

    /* renamed from: k  reason: collision with root package name */
    public static final int f45029k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f45030l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f45031m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f45032n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f45033o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f45034p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f45035q = 6;

    /* renamed from: b  reason: collision with root package name */
    Context f45036b;

    /* renamed from: c  reason: collision with root package name */
    String f45037c = "";

    /* renamed from: d  reason: collision with root package name */
    boolean f45038d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f45039e = false;

    /* renamed from: f  reason: collision with root package name */
    int f45040f = -1;

    /* renamed from: g  reason: collision with root package name */
    List<f> f45041g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    e f45042h;

    /* renamed from: i  reason: collision with root package name */
    private CommonGameInfoBean f45043i;

    /* renamed from: j  reason: collision with root package name */
    private String f45044j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45045b;

        a(DownloadTask downloadTask) {
            this.f45045b = downloadTask;
        }

        void a(Context context) {
            DownloadTask downloadTask = this.f45045b;
            if (downloadTask != null && (downloadTask.getStatus() == 3 || this.f45045b.getStatus() == 1 || this.f45045b.getStatus() == 6)) {
                com.php25.PDownload.d.c(this.f45045b, context);
            }
            String crc_link_type_val = this.f45045b.getCrc_link_type_val();
            com.join.mgps.Util.l2.a(context).b("已接入专属通道，加速成功！");
            UtilsMy.l4(context, crc_link_type_val);
            UtilsMy.u2(context, crc_link_type_val);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).O1(Event.CenterAccelerationDownload, new Ext());
            a(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f45047b;

        b(View view) {
            this.f45047b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f45047b.setVisibility(8);
            o2.this.f45040f = -1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f45047b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class c extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f45049b;

        c(DownloadTask downloadTask) {
            this.f45049b = downloadTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, this.f45049b.getPackageName()));
            UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, this.f45049b.getPackageName()));
            UtilsMy.delete(new File(this.f45049b.getGameZipPath()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        DownloadTask f45051b;

        public d(DownloadTask downloadTask) {
            this.f45051b = downloadTask;
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
            if (android.text.TextUtils.equals(com.join.mgps.enums.ConstantIntEnum.N3DS.value() + "", r7.f45051b.getCrc_link_type_val()) != false) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r8) {
            /*
                Method dump skipped, instructions count: 868
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.o2.d.onClick(android.view.View):void");
        }
    }

    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public interface e {
        void S(DownloadTask downloadTask);

        void T(String str, DownloadTask downloadTask);

        void Y(String str, DownloadTask downloadTask);

        void g(String str);

        void i(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public TextView f45056a;

        g() {
        }
    }

    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f45058a;

        /* renamed from: b  reason: collision with root package name */
        public ProgressBar f45059b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45060c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45061d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45062e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45063f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f45064g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f45065h;

        /* renamed from: i  reason: collision with root package name */
        public View f45066i;

        /* renamed from: j  reason: collision with root package name */
        public View f45067j;

        /* renamed from: k  reason: collision with root package name */
        public View f45068k;

        /* renamed from: l  reason: collision with root package name */
        public View f45069l;

        public h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class i {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f45071a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45072b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f45073c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45074d;

        i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public class j {

        /* renamed from: a  reason: collision with root package name */
        public TextView f45076a;

        j() {
        }
    }

    public o2(Context context) {
        this.f45036b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(View view) {
        MyGameUpdateManagerActivity_.J0(view.getContext()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(DownloadTask downloadTask, View view) {
        e eVar = this.f45042h;
        if (eVar != null) {
            eVar.T(downloadTask.getCrc_link_type_val(), downloadTask);
        } else if (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.chajian.name())) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(this.f45036b, downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(DownloadTask downloadTask, View view) {
        e eVar = this.f45042h;
        if (eVar != null) {
            eVar.Y(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(boolean z4, DownloadTask downloadTask, Dialog dialog, View view) {
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(this.f45036b).d(this.f45036b, downloadTask.getPackageName())) {
                com.join.android.app.common.utils.e.l0(this.f45036b).f0(this.f45036b, downloadTask.getPackageName());
            } else {
                m(downloadTask);
                UtilsMy.x4(downloadTask);
                notifyDataSetChanged();
            }
        } else {
            m(downloadTask);
            UtilsMy.x4(downloadTask);
            notifyDataSetChanged();
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F(final DownloadTask downloadTask, View view) {
        e eVar = this.f45042h;
        if (eVar != null) {
            eVar.i(downloadTask.getCrc_link_type_val());
            return true;
        }
        final com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f45036b, R.style.MyDialog);
        oVar.setContentView(R.layout.delete_center_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除游戏");
        final boolean z4 = false;
        String fileType = downloadTask.getFileType();
        if (fileType != null && fileType.equals(Dtype.android.name())) {
            if (com.join.android.app.common.utils.e.l0(this.f45036b).d(this.f45036b, downloadTask.getPackageName())) {
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
        }
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oVar.dismiss();
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o2.this.E(z4, downloadTask, oVar, view2);
            }
        });
        oVar.show();
        return true;
    }

    private View q(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        if (view != null) {
            gVar = (g) view.getTag();
        } else {
            g gVar2 = new g();
            View inflate = LayoutInflater.from(this.f45036b).inflate(R.layout.fragment_my_game_item_footer, viewGroup, false);
            gVar2.f45056a = (TextView) inflate.findViewById(R.id.count);
            inflate.setTag(gVar2);
            gVar = gVar2;
            view = inflate;
        }
        int intValue = ((Integer) getItem(i4)).intValue();
        TextView textView = gVar.f45056a;
        textView.setText("共" + intValue + "款游戏");
        return view;
    }

    private View r(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        if (view != null) {
            hVar = (h) view.getTag();
        } else {
            h hVar2 = new h();
            View inflate = LayoutInflater.from(this.f45036b).inflate(R.layout.fragment_my_game_item_game, viewGroup, false);
            hVar2.f45058a = (SimpleDraweeView) inflate.findViewById(R.id.icon);
            hVar2.f45068k = inflate.findViewById(R.id.notOpen);
            hVar2.f45059b = (ProgressBar) inflate.findViewById(R.id.progressBar);
            hVar2.f45060c = (TextView) inflate.findViewById(R.id.desc);
            hVar2.f45061d = (TextView) inflate.findViewById(R.id.speedUp);
            hVar2.f45062e = (TextView) inflate.findViewById(R.id.addShortcut);
            hVar2.f45063f = (TextView) inflate.findViewById(R.id.install);
            hVar2.f45064g = (TextView) inflate.findViewById(R.id.name);
            hVar2.f45065h = (TextView) inflate.findViewById(R.id.count);
            hVar2.f45066i = inflate.findViewById(R.id.more);
            hVar2.f45067j = inflate.findViewById(R.id.focus);
            hVar2.f45069l = inflate;
            inflate.setTag(hVar2);
            hVar = hVar2;
            view = inflate;
        }
        final DownloadTask downloadTask = (DownloadTask) getItem(i4);
        if (downloadTask == null) {
            return view;
        }
        SimpleDraweeView simpleDraweeView = hVar.f45058a;
        if (simpleDraweeView.getTag() == null || !TextUtils.equals(simpleDraweeView.getTag().toString(), downloadTask.getPortraitURL())) {
            MyImageLoader.n(simpleDraweeView, downloadTask.getPortraitURL());
            simpleDraweeView.setTag(downloadTask.getPortraitURL());
        }
        hVar.f45064g.setText(downloadTask.getShowName());
        int status = downloadTask.getStatus();
        if (status == 8) {
            hVar.f45059b.setProgress((int) downloadTask.getProgress());
        } else {
            hVar.f45059b.setProgress(0);
        }
        if (status == 5) {
            if (downloadTask.isOpen()) {
                hVar.f45068k.setVisibility(8);
            } else {
                hVar.f45068k.setVisibility(0);
            }
        } else {
            hVar.f45068k.setVisibility(8);
        }
        if (this.f45038d) {
            if (!TextUtils.isEmpty(this.f45037c) && this.f45037c.equals(downloadTask.getCrc_link_type_val())) {
                this.f45040f = i4;
                T(hVar.f45067j);
                this.f45038d = false;
            } else {
                hVar.f45067j.setVisibility(8);
                hVar.f45067j.clearAnimation();
            }
        } else if (this.f45040f != i4) {
            hVar.f45067j.setVisibility(8);
            hVar.f45067j.clearAnimation();
        }
        O(hVar, downloadTask, i4);
        if (i4 < this.f45041g.size() && this.f45041g.get(i4).f45055c) {
            hVar.f45061d.setVisibility(8);
            hVar.f45065h.setVisibility(8);
            hVar.f45062e.setVisibility(0);
            hVar.f45062e.setText("添加桌面");
            hVar.f45062e.setBackgroundResource(R.drawable.recom_grey_butn);
            hVar.f45062e.setTextColor(-7763575);
            hVar.f45062e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.i2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o2.this.x(downloadTask, view2);
                }
            });
        } else if (l(downloadTask)) {
            hVar.f45062e.setVisibility(8);
            hVar.f45061d.setVisibility(0);
            int s12 = UtilsMy.s1(this.f45036b, downloadTask.getCrc_link_type_val());
            if (s12 > 0) {
                hVar.f45065h.setVisibility(0);
                TextView textView = hVar.f45065h;
                textView.setText(s12 + "");
            } else {
                hVar.f45065h.setVisibility(8);
            }
            hVar.f45061d.setOnClickListener(new a(downloadTask));
        } else {
            hVar.f45061d.setVisibility(8);
            hVar.f45065h.setVisibility(8);
            hVar.f45062e.setVisibility(8);
        }
        return view;
    }

    private View s(int i4, View view, ViewGroup viewGroup) {
        final i iVar;
        if (view != null) {
            iVar = (i) view.getTag();
        } else {
            i iVar2 = new i();
            View inflate = LayoutInflater.from(this.f45036b).inflate(R.layout.fragment_my_game_item_guess_like, viewGroup, false);
            iVar2.f45071a = (SimpleDraweeView) inflate.findViewById(R.id.icon1);
            iVar2.f45072b = (SimpleDraweeView) inflate.findViewById(R.id.icon2);
            iVar2.f45073c = (SimpleDraweeView) inflate.findViewById(R.id.icon3);
            iVar2.f45074d = (TextView) inflate.findViewById(R.id.count);
            inflate.setTag(iVar2);
            iVar = iVar2;
            view = inflate;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o2.this.y(view2);
            }
        });
        if (getItem(i4) == null) {
            return view;
        }
        DataGameListBean dataGameListBean = (DataGameListBean) getItem(i4);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o2.this.z(iVar, view2);
            }
        });
        List<GamedownRecomendItemBean> gameList = dataGameListBean.getGameList();
        SimpleDraweeView[] simpleDraweeViewArr = {iVar.f45073c, iVar.f45072b, iVar.f45071a};
        for (int i5 = 0; i5 < 3; i5++) {
            if (i5 >= gameList.size()) {
                simpleDraweeViewArr[i5].setVisibility(8);
            } else {
                simpleDraweeViewArr[i5].setVisibility(0);
                MyImageLoader.h(simpleDraweeViewArr[i5], gameList.get(i5).getIco_remote());
            }
        }
        if ((gameList != null ? dataGameListBean.getGameCount() : 0) > 3 && this.f45039e) {
            iVar.f45074d.setVisibility(0);
        } else {
            iVar.f45074d.setVisibility(8);
        }
        return view;
    }

    private View t(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        if (view != null) {
            hVar = (h) view.getTag();
        } else {
            h hVar2 = new h();
            View inflate = LayoutInflater.from(this.f45036b).inflate(R.layout.fragment_my_game_item_plug, viewGroup, false);
            hVar2.f45058a = (SimpleDraweeView) inflate.findViewById(R.id.icon);
            hVar2.f45059b = (ProgressBar) inflate.findViewById(R.id.progressBar);
            hVar2.f45060c = (TextView) inflate.findViewById(R.id.desc);
            hVar2.f45061d = (TextView) inflate.findViewById(R.id.speedUp);
            hVar2.f45063f = (TextView) inflate.findViewById(R.id.install);
            hVar2.f45064g = (TextView) inflate.findViewById(R.id.name);
            hVar2.f45066i = inflate.findViewById(R.id.more);
            hVar2.f45069l = inflate;
            inflate.setTag(hVar2);
            hVar = hVar2;
            view = inflate;
        }
        DownloadTask downloadTask = (DownloadTask) getItem(i4);
        if (downloadTask == null) {
            return view;
        }
        MyImageLoader.h(hVar.f45058a, downloadTask.getPortraitURL());
        hVar.f45064g.setText(downloadTask.getShowName());
        if (downloadTask.getStatus() == 8) {
            hVar.f45059b.setProgress((int) downloadTask.getProgress());
        } else {
            hVar.f45059b.setProgress(0);
        }
        O(hVar, downloadTask, i4);
        return view;
    }

    private View u(int i4, View view, ViewGroup viewGroup) {
        j jVar;
        if (view != null) {
            jVar = (j) view.getTag();
        } else {
            j jVar2 = new j();
            View inflate = LayoutInflater.from(this.f45036b).inflate(R.layout.fragment_my_game_item_update, viewGroup, false);
            jVar2.f45076a = (TextView) inflate.findViewById(R.id.count);
            inflate.setTag(jVar2);
            jVar = jVar2;
            view = inflate;
        }
        int intValue = ((Integer) getItem(i4)).intValue();
        TextView textView = jVar.f45076a;
        textView.setText(intValue + "款游戏需更新");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o2.A(view2);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(DownloadTask downloadTask, View view) {
        e eVar = this.f45042h;
        if (eVar != null) {
            eVar.S(downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        MyGameGuesslikeActivity_.intent(view.getContext()).start();
        Context context = this.f45036b;
        if (context instanceof MGMainActivity) {
            com.papa.sim.statistic.p.l(context).O1(Event.onclickTabGuessuLike, new Ext());
        }
        Context context2 = this.f45036b;
        if (context2 instanceof MyGameManagerActivity) {
            com.papa.sim.statistic.p.l(context2).O1(Event.onclickCentreGuessuLike, new Ext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(i iVar, View view) {
        MyGameGuesslikeActivity_.intent(view.getContext()).start();
        Context context = this.f45036b;
        if (context instanceof MGMainActivity) {
            com.papa.sim.statistic.p.l(context).O1(Event.onclickTabGuessuLike, new Ext());
        }
        Context context2 = this.f45036b;
        if (context2 instanceof MyGameManagerActivity) {
            com.papa.sim.statistic.p.l(context2).O1(Event.onclickCentreGuessuLike, new Ext());
        }
        this.f45039e = false;
        iVar.f45074d.setVisibility(8);
    }

    void H() {
        List<DownloadTask> X = p1.f.K().X(this.f45036b);
        DownloadTask downloadTask = null;
        if (X != null && X.size() > 0) {
            long j4 = 0;
            for (DownloadTask downloadTask2 : X) {
                if (j4 == 0 || j4 < downloadTask2.getFinishTime()) {
                    j4 = downloadTask2.getFinishTime();
                    downloadTask = downloadTask2;
                }
            }
            if (downloadTask != null) {
                this.f45037c = downloadTask.getCrc_link_type_val();
                return;
            }
            return;
        }
        List<DownloadTask> d5 = p1.f.K().d();
        Iterator<DownloadTask> it2 = d5.iterator();
        while (it2.hasNext()) {
            if (it2.next().getCrc_link_type_val().length() <= 3) {
                it2.remove();
            }
        }
        long j5 = 0;
        for (DownloadTask downloadTask3 : d5) {
            if (downloadTask3.getStatus() == 5 && (j5 == 0 || j5 < downloadTask3.getOpenTime())) {
                j5 = downloadTask3.getOpenTime();
                downloadTask = downloadTask3;
            }
        }
        if (downloadTask != null) {
            this.f45037c = downloadTask.getCrc_link_type_val();
        } else {
            this.f45037c = "";
        }
    }

    public void I(CommonGameInfoBean commonGameInfoBean) {
        this.f45043i = commonGameInfoBean;
    }

    void J(TextView textView, DownloadTask downloadTask) {
        if (downloadTask == null || !UtilsMy.o0(downloadTask.getTipBeans())) {
            return;
        }
        boolean d5 = com.join.android.app.common.utils.e.l0(this.f45036b).d(this.f45036b, downloadTask.getPackageName());
        if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
            d5 = false;
        }
        if (d5) {
            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45036b).l(this.f45036b, downloadTask.getPackageName());
            if (com.join.mgps.Util.g2.i(downloadTask.getVer()) && l4.d() < Integer.parseInt(downloadTask.getVer())) {
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                textView.setText("更新");
                textView.setTextColor(-9263087);
            } else {
                textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                textView.setText(this.f45036b.getResources().getString(R.string.download_status_finished));
                textView.setTextColor(-688602);
            }
        } else {
            textView.setBackgroundResource(R.drawable.recom_green_butn);
            int down_status = downloadTask.getDown_status();
            textView.setEnabled(true);
            textView.setTextColor(-12802819);
            boolean z4 = UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0;
            if (down_status == 3 && !z4) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setTextSize(2, 12.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            } else if (down_status == 2 && !z4) {
                textView.setText("即将开放");
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
                textView.setTextColor(-7763575);
                textView.setEnabled(false);
                textView.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                if (downloadTask.getPay_game_amount() > 0) {
                    Resources resources = textView.getResources();
                    textView.setText(resources.getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(downloadTask.getPay_game_amount()) + ""));
                } else {
                    textView.setText(textView.getResources().getString(R.string.download_status_download));
                }
                textView.setTextSize(2, 13.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }
        textView.setOnClickListener(new d(downloadTask));
    }

    public void K(boolean z4) {
        this.f45038d = z4;
    }

    public void L(boolean z4) {
        this.f45039e = z4;
    }

    public void M(String str) {
        this.f45044j = str;
    }

    void N(TextView textView, int i4) {
        if (textView == null) {
            return;
        }
        if (i4 < 1) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Resources resources = textView.getResources();
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
        if (i4 < 10) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = resources.getDimensionPixelOffset(R.dimen.wdp32);
            ((ViewGroup.MarginLayoutParams) layoutParams).height = resources.getDimensionPixelOffset(R.dimen.wdp32);
            textView.setLayoutParams(layoutParams);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.mygame_big_round);
            textView.setPadding(0, 0, 0, 1);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = resources.getDimensionPixelOffset(R.dimen.wdp32);
            textView.setGravity(17);
            textView.setLayoutParams(layoutParams);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.message_round1);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.wdp10);
            textView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 1);
        }
        textView.setText(i4 + "");
    }

    void O(h hVar, final DownloadTask downloadTask, int i4) {
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (status == 8) {
            TextView textView = hVar.f45060c;
            textView.setText(downloadTask.getProgress() + "% · " + downloadTask.getSpeed());
        } else if (status == 12) {
            hVar.f45060c.setText("解压中...");
        } else if (status != 13) {
            String O1 = UtilsMy.O1(downloadTask);
            if (downloadTask.getSp_tag_info() != null && downloadTask.getSp_tag_info().getModel() != null) {
                O1 = downloadTask.getSp_tag_info().getModel().getName();
            }
            hVar.f45060c.setText(O1);
            hVar.f45060c.setTextColor(Color.parseColor("#FFA8A8A8"));
        } else {
            hVar.f45060c.setText("解压失败");
            hVar.f45060c.setTextColor(Color.parseColor("#FFFF4D4D"));
        }
        hVar.f45069l.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o2.this.B(downloadTask, view);
            }
        });
        hVar.f45066i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o2.this.C(downloadTask, view);
            }
        });
        hVar.f45069l.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.join.mgps.adapter.m2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean F;
                F = o2.this.F(downloadTask, view);
                return F;
            }
        });
        Q(hVar, downloadTask, i4);
    }

    void P(TextView textView, DownloadTask downloadTask) {
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getPlugin_num())) {
            return;
        }
        String plugin_num = downloadTask.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setText("开始");
            textView.setTextColor(this.f45036b.getResources().getColor(R.color.app_blue_color));
            textView.setOnClickListener(new d(downloadTask));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void Q(com.join.mgps.adapter.o2.h r16, com.github.snowdream.android.app.downloader.DownloadTask r17, int r18) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.o2.Q(com.join.mgps.adapter.o2$h, com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    public void R(List<f> list) {
        if (list == null) {
            return;
        }
        this.f45041g.clear();
        if (list.size() > 0) {
            this.f45041g.addAll(list);
        }
    }

    public void S(e eVar) {
        this.f45042h = eVar;
    }

    public void T(View view) {
        if (view == null) {
            return;
        }
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(2000L);
        alphaAnimation.setAnimationListener(new b(view));
        view.setAnimation(alphaAnimation);
        view.postDelayed(new Runnable() { // from class: com.join.mgps.adapter.n2
            @Override // java.lang.Runnable
            public final void run() {
                alphaAnimation.start();
            }
        }, 150L);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<f> list = this.f45041g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (i4 < this.f45041g.size()) {
            return this.f45041g.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return i4 < this.f45041g.size() ? this.f45041g.get(i4).b() : super.getItemViewType(i4);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 0) {
            return u(i4, view, viewGroup);
        }
        if (itemViewType == 1) {
            return s(i4, view, viewGroup);
        }
        if (itemViewType == 2) {
            return r(i4, view, viewGroup);
        }
        if (itemViewType == 4) {
            return t(i4, view, viewGroup);
        }
        if (itemViewType == 3) {
            return q(i4, view, viewGroup);
        }
        if (itemViewType == 5) {
            return r(i4, view, viewGroup);
        }
        if (itemViewType == 6) {
            return r(i4, view, viewGroup);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    boolean l(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 3) {
            if (UtilsMy.h2(this.f45036b, downloadTask.getCrc_link_type_val()) || new PrefDef_(this.f45036b).downloadSpeedUpGameSize().d().intValue() > downloadTask.getActual_size()) {
                return false;
            }
            return TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.chajian.name());
        }
        return false;
    }

    public void m(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (!TextUtils.isEmpty(downloadTask.getRomType()) && (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                new c(downloadTask).start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        n(downloadTask);
    }

    public void n(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        try {
            Iterator<f> it2 = this.f45041g.iterator();
            while (it2.hasNext()) {
                f next = it2.next();
                if (next.b() == 2 || next.b() == 5) {
                    if (next.b() == 6 && ((DownloadTask) next.a()).getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                        it2.remove();
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        H();
        super.notifyDataSetChanged();
    }

    public List<f> o() {
        if (this.f45041g == null) {
            this.f45041g = new ArrayList();
        }
        return this.f45041g;
    }

    public e p() {
        return this.f45042h;
    }

    public boolean v() {
        return this.f45038d;
    }

    public boolean w() {
        return this.f45039e;
    }

    /* compiled from: MyGameAdapter.java */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        int f45053a;

        /* renamed from: b  reason: collision with root package name */
        Object f45054b;

        /* renamed from: c  reason: collision with root package name */
        boolean f45055c;

        public f(int i4, Object obj) {
            this.f45053a = i4;
            this.f45054b = obj;
        }

        public Object a() {
            return this.f45054b;
        }

        public int b() {
            return this.f45053a;
        }

        public boolean c() {
            return this.f45055c;
        }

        public void d(boolean z4) {
            this.f45055c = z4;
        }

        public void e(Object obj) {
            this.f45054b = obj;
        }

        public void f(int i4) {
            this.f45053a = i4;
        }

        public f(int i4, Object obj, boolean z4) {
            this.f45053a = i4;
            this.f45054b = obj;
            this.f45055c = z4;
        }
    }
}
