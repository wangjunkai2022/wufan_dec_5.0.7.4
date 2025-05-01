package com.join.mgps.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.MyGameManagerActivity;
import com.join.mgps.activity.MyGameUpdateManagerActivity_;
import com.join.mgps.activity.mygame.MyGameGuesslikeActivity_;
import com.join.mgps.activity.mygame.data.RecommendGameListBean;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.File;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public class MyGameAdapterV1 extends BaseMultiItemQuickAdapter<g, BaseViewHolder> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f43757l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f43758m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f43759n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f43760o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f43761p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f43762q = 6;

    /* renamed from: d  reason: collision with root package name */
    Context f43763d;

    /* renamed from: e  reason: collision with root package name */
    String f43764e;

    /* renamed from: f  reason: collision with root package name */
    boolean f43765f;

    /* renamed from: g  reason: collision with root package name */
    boolean f43766g;

    /* renamed from: h  reason: collision with root package name */
    int f43767h;

    /* renamed from: i  reason: collision with root package name */
    f f43768i;

    /* renamed from: j  reason: collision with root package name */
    private CommonGameInfoBean f43769j;

    /* renamed from: k  reason: collision with root package name */
    private String f43770k;

    /* loaded from: classes4.dex */
    class a implements BaseQuickAdapter.m {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.m
        public int a(GridLayoutManager gridLayoutManager, int i4) {
            if (((g) MyGameAdapterV1.this.getItem(i4)).e()) {
                return gridLayoutManager.getSpanCount();
            }
            return ((g) MyGameAdapterV1.this.getItem(i4)).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f43772b;

        b(DownloadTask downloadTask) {
            this.f43772b = downloadTask;
        }

        void a(Context context) {
            DownloadTask downloadTask = this.f43772b;
            if (downloadTask != null && (downloadTask.getStatus() == 3 || this.f43772b.getStatus() == 1 || this.f43772b.getStatus() == 6)) {
                com.php25.PDownload.d.c(this.f43772b, context);
            }
            String crc_link_type_val = this.f43772b.getCrc_link_type_val();
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
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f43774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewHolder f43775c;

        c(DownloadTask downloadTask, BaseViewHolder baseViewHolder) {
            this.f43774b = downloadTask;
            this.f43775c = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonGameInfoBean ad_info = this.f43774b.getAd_info();
            if (ad_info != null) {
                IntentUtil.getInstance().intentActivity(MyGameAdapterV1.this.f43763d, ad_info.getIntentDataBean());
            }
            MyGameAdapterV1.this.V(this.f43775c, false);
            this.f43774b.setAd_info_switch(0);
            p1.f.K().m(this.f43774b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f43777b;

        d(DownloadTask downloadTask) {
            this.f43777b = downloadTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, this.f43777b.getPackageName()));
            UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, this.f43777b.getPackageName()));
            UtilsMy.delete(new File(this.f43777b.getGameZipPath()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        DownloadTask f43779b;

        public e(DownloadTask downloadTask) {
            this.f43779b = downloadTask;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r7) {
            /*
                Method dump skipped, instructions count: 712
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.MyGameAdapterV1.e.onClick(android.view.View):void");
        }
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(String str);

        void b(String str);

        void c(int i4, DownloadTask downloadTask);

        void g(String str);

        void i(String str);
    }

    public MyGameAdapterV1(Context context) {
        super(null);
        this.f43764e = "";
        this.f43765f = false;
        this.f43766g = false;
        this.f43767h = -1;
        this.f43763d = context;
        a(1, R.layout.fragment_my_game_item_update_v1);
        a(2, R.layout.fragment_my_game_item_guess_like);
        a(3, R.layout.fragment_my_game_item_game_v1);
        a(4, R.layout.fragment_my_game_item_footer);
        a(5, R.layout.fragment_my_game_item_plug);
        a(6, R.layout.fragment_my_game_item_game_v1);
        setSpanSizeLookup(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        MyGameGuesslikeActivity_.intent(view.getContext()).start();
        Context context = this.f43763d;
        if (context instanceof MGMainActivity) {
            com.papa.sim.statistic.p.l(context).O1(Event.onclickTabGuessuLike, new Ext());
        }
        Context context2 = this.f43763d;
        if (context2 instanceof MyGameManagerActivity) {
            com.papa.sim.statistic.p.l(context2).O1(Event.onclickCentreGuessuLike, new Ext());
        }
        this.f43766g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(View view) {
        MyGameUpdateManagerActivity_.J0(view.getContext()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(DownloadTask downloadTask, View view) {
        f fVar = this.f43768i;
        if (fVar != null) {
            fVar.b(downloadTask.getCrc_link_type_val());
        } else if (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.chajian.name())) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(this.f43763d, downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(BaseViewHolder baseViewHolder, DownloadTask downloadTask, View view) {
        if (this.f43768i != null) {
            if (baseViewHolder.getItemViewType() == 3) {
                this.f43768i.a(downloadTask.getCrc_link_type_val());
            } else if (baseViewHolder.getItemViewType() == 6) {
                this.f43768i.c(baseViewHolder.getLayoutPosition(), downloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(boolean z4, DownloadTask downloadTask, Dialog dialog, View view) {
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(this.f43763d).d(this.f43763d, downloadTask.getPackageName())) {
                com.join.android.app.common.utils.e.l0(this.f43763d).f0(this.f43763d, downloadTask.getPackageName());
            } else {
                x(downloadTask);
                UtilsMy.x4(downloadTask);
                notifyDataSetChanged();
            }
        } else {
            x(downloadTask);
            UtilsMy.x4(downloadTask);
            notifyDataSetChanged();
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(final DownloadTask downloadTask, View view) {
        f fVar = this.f43768i;
        if (fVar != null) {
            fVar.i(downloadTask.getCrc_link_type_val());
            return true;
        }
        final com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f43763d, R.style.MyDialog);
        oVar.setContentView(R.layout.delete_center_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除游戏");
        final boolean z4 = false;
        String fileType = downloadTask.getFileType();
        if (fileType != null && fileType.equals(Dtype.android.name())) {
            if (com.join.android.app.common.utils.e.l0(this.f43763d).d(this.f43763d, downloadTask.getPackageName())) {
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
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                oVar.dismiss();
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyGameAdapterV1.this.H(z4, downloadTask, oVar, view2);
            }
        });
        oVar.show();
        return true;
    }

    private void T(BaseViewHolder baseViewHolder, boolean z4) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.icon);
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        TextView textView = (TextView) baseViewHolder.getView(R.id.name);
        if (z4) {
            layoutParams.width = (int) this.mContext.getResources().getDimension(R.dimen.wdp120);
            ((TextView) baseViewHolder.getView(R.id.name)).setTextSize(0, this.f43763d.getResources().getDimension(R.dimen.wdp24));
            textView.setMaxLines(1);
            textView.setSingleLine(true);
        } else {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            layoutParams.width = (int) this.mContext.getResources().getDimension(R.dimen.wdp156);
            ((TextView) baseViewHolder.getView(R.id.name)).setTextSize(0, this.f43763d.getResources().getDimension(R.dimen.wdp28));
        }
        simpleDraweeView.setLayoutParams(layoutParams);
        baseViewHolder.setGone(R.id.install, false);
        baseViewHolder.setGone(R.id.ll_gift, z4);
        baseViewHolder.setGone(R.id.progressBar, false);
        baseViewHolder.setGone(R.id.v_bottom, z4);
        baseViewHolder.setGone(R.id.tv_down_speed, false);
        baseViewHolder.setGone(R.id.desc, false);
    }

    private void U(BaseViewHolder baseViewHolder) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.icon);
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        layoutParams.width = (int) this.mContext.getResources().getDimension(R.dimen.wdp120);
        simpleDraweeView.setLayoutParams(layoutParams);
        TextView textView = (TextView) baseViewHolder.getView(R.id.name);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        ((TextView) baseViewHolder.getView(R.id.name)).setTextSize(0, this.f43763d.getResources().getDimension(R.dimen.wdp24));
        baseViewHolder.setGone(R.id.install, true);
        baseViewHolder.setGone(R.id.progressBar, false);
        baseViewHolder.setGone(R.id.v_bottom, true);
        baseViewHolder.setGone(R.id.ll_gift, false);
        baseViewHolder.setGone(R.id.tv_down_speed, false);
        baseViewHolder.setGone(R.id.desc, false);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.install);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView2.getLayoutParams();
        layoutParams2.startToStart = R.id.v_bottom;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
        textView2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(BaseViewHolder baseViewHolder, boolean z4) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.icon);
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        TextView textView = (TextView) baseViewHolder.getView(R.id.install);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.name);
        if (z4) {
            layoutParams.width = (int) this.mContext.getResources().getDimension(R.dimen.wdp120);
            ((TextView) baseViewHolder.getView(R.id.name)).setTextSize(0, this.f43763d.getResources().getDimension(R.dimen.wdp24));
            layoutParams2.startToStart = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) this.mContext.getResources().getDimension(R.dimen.wdp25);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
        } else {
            layoutParams2.startToStart = R.id.v_bottom;
            layoutParams.width = (int) this.mContext.getResources().getDimension(R.dimen.wdp156);
            ((TextView) baseViewHolder.getView(R.id.name)).setTextSize(0, this.f43763d.getResources().getDimension(R.dimen.wdp28));
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) this.mContext.getResources().getDimension(R.dimen.wdp25);
            textView2.setMaxLines(2);
            textView2.setSingleLine(false);
        }
        simpleDraweeView.setLayoutParams(layoutParams);
        textView.setLayoutParams(layoutParams2);
        baseViewHolder.setGone(R.id.ll_gift, false);
        baseViewHolder.setGone(R.id.install, z4);
        baseViewHolder.setGone(R.id.progressBar, z4);
        baseViewHolder.setGone(R.id.v_bottom, z4);
        baseViewHolder.setGone(R.id.desc, z4);
    }

    private void q(BaseViewHolder baseViewHolder, g gVar) {
        int intValue = ((Integer) gVar.a()).intValue();
        baseViewHolder.setText(R.id.count, "共" + intValue + "款游戏");
    }

    private void r(BaseViewHolder baseViewHolder, g gVar) {
        DownloadTask downloadTask = (DownloadTask) gVar.a();
        if (downloadTask == null) {
            return;
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.icon);
        if (simpleDraweeView.getTag() == null || !TextUtils.equals(simpleDraweeView.getTag().toString(), downloadTask.getPortraitURL())) {
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), downloadTask.getPortraitURL());
            simpleDraweeView.setTag(downloadTask.getPortraitURL());
        }
        baseViewHolder.setText(R.id.name, downloadTask.getShowName());
        int status = downloadTask.getStatus();
        if (status == 8) {
            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
        } else {
            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress(0);
        }
        if (status == 5) {
            baseViewHolder.setGone(R.id.notOpen, !downloadTask.isOpen());
            CommonGameInfoBean ad_info = downloadTask.getAd_info();
            if (ad_info != null && downloadTask.isOpen() && downloadTask.getAd_info_switch() == 1) {
                baseViewHolder.setText(R.id.tv_gift_desc, ad_info.getTitle());
            }
        } else {
            baseViewHolder.setGone(R.id.notOpen, false);
        }
        P(baseViewHolder, downloadTask);
        if (baseViewHolder.getLayoutPosition() < getItemCount() && ((g) getItem(baseViewHolder.getLayoutPosition())).f43785f) {
            baseViewHolder.setGone(R.id.speedUp, false);
        } else if (v(downloadTask)) {
            baseViewHolder.setGone(R.id.speedUp, true);
            baseViewHolder.getView(R.id.speedUp).setOnClickListener(new b(downloadTask));
        } else {
            baseViewHolder.setGone(R.id.speedUp, false);
        }
    }

    private void s(BaseViewHolder baseViewHolder, g gVar) {
        if (gVar.a() == null) {
            return;
        }
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyGameAdapterV1.this.C(view);
            }
        });
        List<CommonGameInfoBean> recommend_list = ((RecommendGameListBean) gVar.a()).getRecommend_list();
        SimpleDraweeView[] simpleDraweeViewArr = {(SimpleDraweeView) baseViewHolder.getView(R.id.icon1), (SimpleDraweeView) baseViewHolder.getView(R.id.icon2), (SimpleDraweeView) baseViewHolder.getView(R.id.icon1)};
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 >= recommend_list.size()) {
                simpleDraweeViewArr[i4].setVisibility(8);
            } else {
                simpleDraweeViewArr[i4].setVisibility(0);
                MyImageLoader.n(simpleDraweeViewArr[i4], recommend_list.get(i4).getBig_pic());
            }
        }
    }

    private void t(BaseViewHolder baseViewHolder, g gVar) {
        DownloadTask downloadTask = (DownloadTask) gVar.a();
        if (downloadTask == null) {
            return;
        }
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), downloadTask.getPortraitURL());
        baseViewHolder.setText(R.id.name, downloadTask.getShowName());
        if (downloadTask.getStatus() == 8) {
            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) downloadTask.getProgress());
        } else {
            ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress(0);
        }
        P(baseViewHolder, downloadTask);
    }

    private void u(BaseViewHolder baseViewHolder, g gVar) {
        int intValue = ((Integer) gVar.a()).intValue();
        baseViewHolder.setText(R.id.count, intValue + "款游戏需更新");
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyGameAdapterV1.D(view);
            }
        });
    }

    public boolean A() {
        return this.f43765f;
    }

    public boolean B() {
        return this.f43766g;
    }

    void J() {
        List<DownloadTask> X = p1.f.K().X(this.f43763d);
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
                this.f43764e = downloadTask.getCrc_link_type_val();
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
            this.f43764e = downloadTask.getCrc_link_type_val();
        } else {
            this.f43764e = "";
        }
    }

    public void K(CommonGameInfoBean commonGameInfoBean) {
        this.f43769j = commonGameInfoBean;
    }

    public void L(boolean z4) {
        this.f43765f = z4;
    }

    public void M(boolean z4) {
        this.f43766g = z4;
    }

    public void N(String str) {
        this.f43770k = str;
    }

    void O(TextView textView, int i4) {
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

    void P(final BaseViewHolder baseViewHolder, final DownloadTask downloadTask) {
        baseViewHolder.getView(R.id.ll_gift).setOnClickListener(new c(downloadTask, baseViewHolder));
        if (downloadTask.getStatus() != 5 && downloadTask.getStatus() != 0) {
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyGameAdapterV1.this.E(downloadTask, view);
                }
            });
        } else {
            baseViewHolder.itemView.setOnClickListener(new e(downloadTask));
        }
        baseViewHolder.getView(R.id.install).setOnClickListener(new e(downloadTask));
        baseViewHolder.setGone(R.id.imageView61, baseViewHolder.getItemViewType() == 3).setGone(R.id.icCloseAd, baseViewHolder.getItemViewType() == 6).setGone(R.id.icCornerAd, baseViewHolder.getItemViewType() == 6);
        if (baseViewHolder.getView(R.id.icCornerAd).getVisibility() == 0) {
            MyImageLoader.p((SimpleDraweeView) baseViewHolder.getView(R.id.icCornerAd), this.f43770k, r.c.f11295b);
        }
        baseViewHolder.getView(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyGameAdapterV1.this.F(baseViewHolder, downloadTask, view);
            }
        });
        baseViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.join.mgps.adapter.v2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean I;
                I = MyGameAdapterV1.this.I(downloadTask, view);
                return I;
            }
        });
        R(baseViewHolder, downloadTask);
    }

    void Q(TextView textView, DownloadTask downloadTask) {
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getPlugin_num())) {
            return;
        }
        String plugin_num = downloadTask.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setText("开始");
            textView.setTextColor(this.f43763d.getResources().getColor(R.color.app_blue_color));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void R(com.join.mgps.base.BaseViewHolder r19, com.github.snowdream.android.app.downloader.DownloadTask r20) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.MyGameAdapterV1.R(com.join.mgps.base.BaseViewHolder, com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    public void S(f fVar) {
        this.f43768i = fVar;
    }

    boolean v(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 3) {
            if (UtilsMy.h2(this.f43763d, downloadTask.getCrc_link_type_val()) || new PrefDef_(this.f43763d).downloadSpeedUpGameSize().d().intValue() > downloadTask.getActual_size()) {
                return false;
            }
            return TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.chajian.name());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: w */
    public void convert(@NonNull BaseViewHolder baseViewHolder, g gVar) {
        int c5 = gVar.c();
        if (c5 == 1) {
            u(baseViewHolder, gVar);
        } else if (c5 == 2) {
            s(baseViewHolder, gVar);
        } else if (c5 == 3) {
            r(baseViewHolder, gVar);
        } else if (c5 == 5) {
            t(baseViewHolder, gVar);
        } else if (c5 == 4) {
            q(baseViewHolder, gVar);
        } else if (c5 == 6) {
            r(baseViewHolder, gVar);
        }
    }

    public void x(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (!TextUtils.isEmpty(downloadTask.getRomType()) && (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                new d(downloadTask).start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        y(downloadTask);
    }

    public void y(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        try {
            Iterator it2 = getData().iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar.c() == 3 && ((DownloadTask) gVar.a()).getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it2.remove();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        notifyDataSetChanged();
    }

    public f z() {
        return this.f43768i;
    }

    /* loaded from: classes4.dex */
    public static class g implements u1.b {

        /* renamed from: b  reason: collision with root package name */
        int f43781b;

        /* renamed from: c  reason: collision with root package name */
        Object f43782c;

        /* renamed from: d  reason: collision with root package name */
        boolean f43783d = false;

        /* renamed from: e  reason: collision with root package name */
        int f43784e = 1;

        /* renamed from: f  reason: collision with root package name */
        boolean f43785f;

        public g(int i4, Object obj) {
            this.f43781b = i4;
            this.f43782c = obj;
        }

        public <O> O a() {
            return (O) this.f43782c;
        }

        public int b() {
            return this.f43784e;
        }

        public int c() {
            return this.f43781b;
        }

        public boolean d() {
            return this.f43785f;
        }

        public boolean e() {
            return this.f43783d;
        }

        public void f(boolean z4) {
            this.f43785f = z4;
        }

        public void g(boolean z4) {
            this.f43783d = z4;
        }

        @Override // u1.b
        public int getItemType() {
            return this.f43781b;
        }

        public void h(Object obj) {
            this.f43782c = obj;
        }

        public void i(int i4) {
            this.f43784e = i4;
        }

        public void j(int i4) {
            this.f43781b = i4;
        }

        public g(int i4, Object obj, boolean z4) {
            this.f43781b = i4;
            this.f43782c = obj;
            this.f43785f = z4;
        }
    }
}
