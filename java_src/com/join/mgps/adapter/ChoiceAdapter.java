package com.join.mgps.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.SimulatorAreaActivity_;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.InformationListDataBean;
import com.join.mgps.dto.TodayWufunBroadcast;
import com.join.mgps.dto.TodayWufunEmuClassify;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ChoiceAdapter extends RecyclerView.Adapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f39767f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f39768g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f39769h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f39770i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f39771j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f39772k = 5;

    /* renamed from: l  reason: collision with root package name */
    public static final int f39773l = 6;

    /* renamed from: m  reason: collision with root package name */
    public static final int f39774m = 7;

    /* renamed from: n  reason: collision with root package name */
    public static final int f39775n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f39776o = 9;

    /* renamed from: p  reason: collision with root package name */
    public static final int f39777p = 10;

    /* renamed from: q  reason: collision with root package name */
    public static final int f39778q = 11;

    /* renamed from: r  reason: collision with root package name */
    public static final int f39779r = 12;

    /* renamed from: s  reason: collision with root package name */
    public static final int f39780s = 13;

    /* renamed from: t  reason: collision with root package name */
    public static final int f39781t = 14;

    /* renamed from: u  reason: collision with root package name */
    public static final int f39782u = 15;

    /* renamed from: v  reason: collision with root package name */
    public static final int f39783v = 16;

    /* renamed from: w  reason: collision with root package name */
    public static final int f39784w = 17;

    /* renamed from: a  reason: collision with root package name */
    private final Context f39785a;

    /* renamed from: b  reason: collision with root package name */
    List<p> f39786b;

    /* renamed from: c  reason: collision with root package name */
    private int f39787c;

    /* renamed from: d  reason: collision with root package name */
    o f39788d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f39789e = 18;

    /* loaded from: classes4.dex */
    public class ChoiceBottomVH extends VH {
        public ChoiceBottomVH(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    public class ChoiceCoverVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39791b;

        public ChoiceCoverVH(View view) {
            super(view);
            this.f39791b = (SimpleDraweeView) view.findViewById(R.id.cover);
        }
    }

    /* loaded from: classes4.dex */
    public class ChoiceTopVH extends VH {
        public ChoiceTopVH(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    public class DateLineVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public TextView f39794b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f39795c;

        public DateLineVH(View view) {
            super(view);
            this.f39794b = (TextView) view.findViewById(R.id.date);
            this.f39795c = (TextView) view.findViewById(R.id.week);
        }
    }

    /* loaded from: classes4.dex */
    public class DayGameCover2VH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39797b;

        public DayGameCover2VH(View view) {
            super(view);
            this.f39797b = (SimpleDraweeView) view.findViewById(R.id.cover);
        }
    }

    /* loaded from: classes4.dex */
    public class DayGameCoverVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39799b;

        public DayGameCoverVH(View view) {
            super(view);
            this.f39799b = (SimpleDraweeView) view.findViewById(R.id.cover);
        }
    }

    /* loaded from: classes4.dex */
    public class DayGameFooter2VH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39801b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f39802c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f39803d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f39804e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f39805f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f39806g;

        public DayGameFooter2VH(View view) {
            super(view);
            this.f39801b = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f39802c = (TextView) view.findViewById(R.id.name);
            this.f39803d = (TextView) view.findViewById(R.id.from);
            this.f39804e = (TextView) view.findViewById(R.id.fromFlag);
            this.f39805f = (TextView) view.findViewById(R.id.rank);
            this.f39806g = (TextView) view.findViewById(R.id.desc);
        }
    }

    /* loaded from: classes4.dex */
    public class DayGameFooterVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39808b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f39809c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f39810d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f39811e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f39812f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f39813g;

        public DayGameFooterVH(View view) {
            super(view);
            this.f39808b = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f39809c = (TextView) view.findViewById(R.id.name);
            this.f39810d = (TextView) view.findViewById(R.id.from);
            this.f39811e = (TextView) view.findViewById(R.id.fromFlag);
            this.f39812f = (TextView) view.findViewById(R.id.rank);
            this.f39813g = (TextView) view.findViewById(R.id.desc);
        }
    }

    /* loaded from: classes4.dex */
    public class DividerVH extends VH {
        public DividerVH(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    public class GameClassifyContentVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public GridView f39816b;

        public GameClassifyContentVH(View view) {
            super(view);
            this.f39816b = (GridView) view.findViewById(R.id.gridView);
        }
    }

    /* loaded from: classes4.dex */
    public class GameClassifyTypeVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f39818b;

        public GameClassifyTypeVH(View view) {
            super(view);
            this.f39818b = (LinearLayout) view.findViewById(R.id.classifies);
        }
    }

    /* loaded from: classes4.dex */
    public class GameClassifyVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public View[] f39820b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView[] f39821c;

        /* renamed from: d  reason: collision with root package name */
        public TextView[] f39822d;

        /* renamed from: e  reason: collision with root package name */
        public TextView[] f39823e;

        public GameClassifyVH(View view) {
            super(view);
            this.f39820b = new View[3];
            this.f39821c = new SimpleDraweeView[3];
            this.f39822d = new TextView[3];
            this.f39823e = new TextView[3];
            View findViewById = view.findViewById(R.id.item1);
            View findViewById2 = view.findViewById(R.id.item2);
            View findViewById3 = view.findViewById(R.id.item3);
            View[] viewArr = this.f39820b;
            int i4 = 0;
            viewArr[0] = findViewById;
            viewArr[1] = findViewById2;
            viewArr[2] = findViewById3;
            while (true) {
                View[] viewArr2 = this.f39820b;
                if (i4 >= viewArr2.length) {
                    return;
                }
                this.f39821c[i4] = (SimpleDraweeView) viewArr2[i4].findViewById(R.id.cover);
                this.f39822d[i4] = (TextView) this.f39820b[i4].findViewById(R.id.name);
                this.f39823e[i4] = (TextView) this.f39820b[i4].findViewById(R.id.desc);
                i4++;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class OrderMainVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39825b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f39826c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f39827d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f39828e;

        public OrderMainVH(View view) {
            super(view);
            this.f39825b = (SimpleDraweeView) view.findViewById(R.id.cover);
            this.f39826c = (TextView) view.findViewById(R.id.name);
            this.f39827d = (TextView) view.findViewById(R.id.desc);
            this.f39828e = (TextView) view.findViewById(R.id.date);
        }
    }

    /* loaded from: classes4.dex */
    public class OrderTopVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public View f39830b;

        public OrderTopVH(View view) {
            super(view);
            this.f39830b = view.findViewById(R.id.more);
        }
    }

    /* loaded from: classes4.dex */
    public class Recommand1CoverVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39832b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f39833c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f39834d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f39835e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f39836f;

        public Recommand1CoverVH(View view) {
            super(view);
            this.f39832b = (SimpleDraweeView) view.findViewById(R.id.cover);
            this.f39833c = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f39834d = (TextView) view.findViewById(R.id.name);
            this.f39835e = (TextView) view.findViewById(R.id.desc);
            this.f39836f = (TextView) view.findViewById(R.id.rank);
        }
    }

    /* loaded from: classes4.dex */
    public class Recommand2CoverVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f39838b;

        public Recommand2CoverVH(View view) {
            super(view);
            this.f39838b = (SimpleDraweeView) view.findViewById(R.id.cover);
        }
    }

    /* loaded from: classes4.dex */
    public class Recommand2FooterVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public TextView f39840b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f39841c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f39842d;

        public Recommand2FooterVH(View view) {
            super(view);
            this.f39840b = (TextView) view.findViewById(R.id.name);
            this.f39841c = (TextView) view.findViewById(R.id.desc);
            this.f39842d = (TextView) view.findViewById(R.id.rank);
        }
    }

    /* loaded from: classes4.dex */
    public class RecommandTitleVH extends VH {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f39844b;

        /* renamed from: c  reason: collision with root package name */
        public final View f39845c;

        public RecommandTitleVH(View view) {
            super(view);
            this.f39844b = (TextView) view.findViewById(R.id.title);
            this.f39845c = view.findViewById(R.id.divider);
        }
    }

    /* loaded from: classes4.dex */
    public class VH extends RecyclerView.ViewHolder {
        public VH(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39848b;

        a(p pVar) {
            this.f39848b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChoiceAdapter.this.j((BannerBean) this.f39848b.a());
            com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((BannerBean) this.f39848b.a()).getCrc_link_type_val(), "todayButton", this.f39848b.e(), "精选专题");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39850b;

        b(p pVar) {
            this.f39850b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39850b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39850b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39850b.a()).getTpl_type(), ((TodayWufunBroadcast) this.f39850b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39850b.a()).get_from_type());
            com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39850b.a()).getGame_id(), "todayButton", this.f39850b.e(), "新游预约");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39852b;

        c(p pVar) {
            this.f39852b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(ChoiceAdapter.this.f39785a, (String) this.f39852b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f39854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TodayWufunEmuClassify f39855c;

        d(ViewGroup viewGroup, TodayWufunEmuClassify todayWufunEmuClassify) {
            this.f39854b = viewGroup;
            this.f39855c = todayWufunEmuClassify;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i4 = 0; i4 < this.f39854b.getChildCount(); i4++) {
                this.f39854b.getChildAt(i4).setSelected(false);
            }
            view.setSelected(true);
            ChoiceAdapter.this.B(this.f39855c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerBean f39857b;

        e(BannerBean bannerBean) {
            this.f39857b = bannerBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(view.getContext(), this.f39857b.getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39859b;

        f(p pVar) {
            this.f39859b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39859b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39859b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39859b.a()).getGame_info_tpl_type(), ((TodayWufunBroadcast) this.f39859b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39859b.a()).get_from_type());
            com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39859b.a()).getGame_id(), "eidtButton", this.f39859b.e(), "编辑推荐");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39861b;

        g(p pVar) {
            this.f39861b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39861b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39861b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39861b.a()).getGame_info_tpl_type(), ((TodayWufunBroadcast) this.f39861b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39861b.a()).get_from_type());
            com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39861b.a()).getGame_id(), "adButton", this.f39861b.e(), "广告赞助");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39863b;

        h(p pVar) {
            this.f39863b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39863b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39863b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39863b.a()).getGame_info_tpl_type(), ((TodayWufunBroadcast) this.f39863b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39863b.a()).get_from_type());
            com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39863b.a()).getGame_id(), "adButton", this.f39863b.e(), "广告赞助");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39865b;

        i(p pVar) {
            this.f39865b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39865b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39865b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39865b.a()).getGame_info_tpl_type(), ((TodayWufunBroadcast) this.f39865b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39865b.a()).get_from_type());
            if (this.f39865b.f() <= 7) {
                com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39865b.a()).getGame_id(), "todayButton", this.f39865b.e(), "每日发现游戏");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39867b;

        j(p pVar) {
            this.f39867b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39867b.a() == null) {
                return;
            }
            ChoiceAdapter.this.h(((TodayWufunBroadcast) this.f39867b.a()).getGame_id(), ((TodayWufunBroadcast) this.f39867b.a()).getGame_info_tpl_type(), ((TodayWufunBroadcast) this.f39867b.a()).getSp_tpl_two_position(), ((TodayWufunBroadcast) this.f39867b.a()).get_from_type());
            if (this.f39867b.f() <= 7) {
                com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((TodayWufunBroadcast) this.f39867b.a()).getGame_id(), "todayButton", this.f39867b.e(), "每日发现游戏");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39869b;

        k(p pVar) {
            this.f39869b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39869b.a() == null) {
                return;
            }
            ChoiceAdapter.this.i(((InformationListDataBean) this.f39869b.a()).getInfo_id());
            if (this.f39869b.f() <= 7) {
                com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((InformationListDataBean) this.f39869b.a()).getGame_id(), "todayButton", this.f39869b.e(), "大总管播报");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39871b;

        l(p pVar) {
            this.f39871b = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39871b.a() == null) {
                return;
            }
            ChoiceAdapter.this.i(((InformationListDataBean) this.f39871b.a()).getInfo_id());
            if (this.f39871b.f() <= 7) {
                com.papa.sim.statistic.p.l(ChoiceAdapter.this.f39785a).i2(AccountUtil_.getInstance_(ChoiceAdapter.this.f39785a).getUid(), ((InformationListDataBean) this.f39871b.a()).getGame_id(), "todayButton", this.f39871b.e(), "大总管播报");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public TextView f39873a;
    }

    /* loaded from: classes4.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f39874a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f39875b;
    }

    /* loaded from: classes4.dex */
    public static class o extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        TodayWufunEmuClassify f39876b = new TodayWufunEmuClassify();

        /* renamed from: c  reason: collision with root package name */
        Context f39877c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SimulatorAreaActivity_.A0(o.this.f39877c).b(o.this.f39876b.getId()).a(o.this.f39876b.getName()).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ TodayWufunBroadcast f39879b;

            b(TodayWufunBroadcast todayWufunBroadcast) {
                this.f39879b = todayWufunBroadcast;
            }

            public void a(String str, String str2, int i4, int i5) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(1);
                intentDateBean.setCrc_link_type_val(str);
                intentDateBean.setTpl_type(str2);
                intentDateBean.setJump_type(i4);
                ExtBean extBean = new ExtBean();
                extBean.set_from_type(i5);
                intentDateBean.setExtBean(extBean);
                IntentUtil.getInstance().intentActivity(o.this.f39877c, intentDateBean);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a(this.f39879b.getGame_id(), this.f39879b.getTpl_type(), this.f39879b.getSp_tpl_two_position(), this.f39879b.get_from_type());
            }
        }

        public o(Context context) {
            this.f39877c = context;
        }

        private View a(int i4, View view, ViewGroup viewGroup) {
            m mVar;
            try {
                if (view != null) {
                    mVar = (m) view.getTag();
                } else {
                    mVar = new m();
                    view = LayoutInflater.from(this.f39877c).inflate(R.layout.choice_item_classify_all, (ViewGroup) null);
                    mVar.f39873a = (TextView) view.findViewById(R.id.count);
                    view.setTag(mVar);
                }
                mVar.f39873a.setText(this.f39876b.getGame_count());
                view.setOnClickListener(new a());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }

        private View c(int i4, View view, ViewGroup viewGroup) {
            n nVar;
            TodayWufunBroadcast item;
            try {
                if (view != null) {
                    nVar = (n) view.getTag();
                } else {
                    nVar = new n();
                    view = LayoutInflater.from(this.f39877c).inflate(R.layout.choice_item_classify_game, (ViewGroup) null);
                    nVar.f39875b = (TextView) view.findViewById(R.id.name);
                    nVar.f39874a = (SimpleDraweeView) view.findViewById(R.id.icon);
                    view.setTag(nVar);
                }
                item = getItem(i4);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (item == null) {
                return view;
            }
            MyImageLoader.j(nVar.f39874a, item.getGame_ico(), MyImageLoader.A(this.f39877c));
            nVar.f39875b.setText(item.getGame_name());
            view.setOnClickListener(new b(item));
            return view;
        }

        public TodayWufunEmuClassify b() {
            return this.f39876b;
        }

        @Override // android.widget.Adapter
        /* renamed from: d */
        public TodayWufunBroadcast getItem(int i4) {
            TodayWufunEmuClassify todayWufunEmuClassify = this.f39876b;
            if (todayWufunEmuClassify == null || todayWufunEmuClassify.getGame_list() == null || i4 >= this.f39876b.getGame_list().size()) {
                return null;
            }
            return this.f39876b.getGame_list().get(i4);
        }

        public void e(TodayWufunEmuClassify todayWufunEmuClassify) {
            this.f39876b = todayWufunEmuClassify;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            TodayWufunEmuClassify todayWufunEmuClassify = this.f39876b;
            if (todayWufunEmuClassify == null || todayWufunEmuClassify.getGame_list() == null) {
                return 1;
            }
            return this.f39876b.getGame_list().size() + 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return i4 == getCount() - 1 ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (getItemViewType(i4) == 0) {
                return c(i4, view, viewGroup);
            }
            return getItemViewType(i4) == 1 ? a(i4, view, viewGroup) : view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }
    }

    /* loaded from: classes4.dex */
    public static class p<T> {

        /* renamed from: a  reason: collision with root package name */
        int f39881a;

        /* renamed from: b  reason: collision with root package name */
        T f39882b;

        /* renamed from: c  reason: collision with root package name */
        private int f39883c;

        /* renamed from: d  reason: collision with root package name */
        private int f39884d;

        /* renamed from: e  reason: collision with root package name */
        private int f39885e;

        /* renamed from: f  reason: collision with root package name */
        private int f39886f;

        /* renamed from: g  reason: collision with root package name */
        private String f39887g = "";

        public p(int i4, T t4) {
            this.f39881a = i4;
            this.f39882b = t4;
        }

        public T a() {
            return this.f39882b;
        }

        public int b() {
            return this.f39883c;
        }

        public int c() {
            return this.f39885e;
        }

        public int d() {
            return this.f39884d;
        }

        public String e() {
            return this.f39887g;
        }

        public int f() {
            return this.f39886f;
        }

        public int g() {
            return this.f39881a;
        }

        public void h(T t4) {
            this.f39882b = t4;
        }

        public p i(int i4) {
            this.f39883c = i4;
            return this;
        }

        public p j(int i4) {
            this.f39885e = i4;
            return this;
        }

        public p k(int i4) {
            this.f39884d = i4;
            return this;
        }

        public p l(String str) {
            this.f39887g = str;
            return this;
        }

        public p m(int i4) {
            this.f39886f = i4;
            return this;
        }

        public void n(int i4) {
            this.f39881a = i4;
        }
    }

    public ChoiceAdapter(Context context, List<p> list) {
        this.f39785a = context;
        D(list);
    }

    private void A(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        RecommandTitleVH recommandTitleVH = (RecommandTitleVH) viewHolder;
        if (pVar.d() == 1) {
            recommandTitleVH.f39844b.setText("来自你的浏览推荐");
            recommandTitleVH.f39845c.setVisibility(8);
        }
        if (pVar.d() == 2) {
            recommandTitleVH.f39844b.setText("来自广告赞助");
            recommandTitleVH.f39845c.setVisibility(0);
            return;
        }
        recommandTitleVH.f39844b.setText("来自编辑推荐");
        recommandTitleVH.f39845c.setVisibility(8);
    }

    private RoundingParams b(Context context) {
        return new RoundingParams();
    }

    private RoundingParams f(Context context) {
        RoundingParams roundingParams = new RoundingParams();
        float dimension = context.getResources().getDimension(R.dimen.mg_forum_avatar_round_width);
        roundingParams.q(dimension, dimension, 0.0f, 0.0f);
        return roundingParams;
    }

    private void k(RecyclerView.ViewHolder viewHolder, int i4) {
    }

    private void l(ChoiceCoverVH choiceCoverVH, int i4) {
        if (choiceCoverVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        MyImageLoader.j(choiceCoverVH.f39791b, ((BannerBean) pVar.a()).getPic_remote(), MyImageLoader.A(this.f39785a));
        choiceCoverVH.f39791b.setOnClickListener(new a(pVar));
    }

    private void m(RecyclerView.ViewHolder viewHolder, int i4) {
    }

    private void n(DateLineVH dateLineVH, int i4) {
        if (dateLineVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        dateLineVH.f39794b.setText(com.join.android.app.common.utils.g.h("yyyy年MM月dd日", Long.valueOf(((Long) pVar.a()).longValue() * 1000)));
        dateLineVH.f39795c.setText(com.join.android.app.common.utils.g.f(((Long) pVar.a()).longValue() * 1000));
    }

    private void o(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        DayGameCover2VH dayGameCover2VH = (DayGameCover2VH) viewHolder;
        p pVar = (p) getItem(i4);
        if (pVar == null || pVar.a() == null) {
            return;
        }
        MyImageLoader.h(dayGameCover2VH.f39797b, ((InformationListDataBean) pVar.a()).getMaterial());
        viewHolder.itemView.setOnClickListener(new k(pVar));
    }

    private void p(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        DayGameCoverVH dayGameCoverVH = (DayGameCoverVH) viewHolder;
        p pVar = (p) getItem(i4);
        if (pVar == null || pVar.a() == null) {
            return;
        }
        MyImageLoader.h(dayGameCoverVH.f39799b, ((TodayWufunBroadcast) pVar.a()).getPic());
        viewHolder.itemView.setOnClickListener(new i(pVar));
    }

    private void q(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        DayGameFooter2VH dayGameFooter2VH = (DayGameFooter2VH) viewHolder;
        p pVar = (p) getItem(i4);
        if (pVar == null || pVar.a() == null) {
            return;
        }
        dayGameFooter2VH.f39802c.setText(((InformationListDataBean) pVar.a()).getGame_name());
        dayGameFooter2VH.f39806g.setText(((InformationListDataBean) pVar.a()).getTitle());
        if (((InformationListDataBean) pVar.a()).getScore_count() > 0.0f) {
            dayGameFooter2VH.f39805f.setVisibility(0);
            TextView textView = dayGameFooter2VH.f39805f;
            textView.setText(((InformationListDataBean) pVar.a()).getScore_count() + "");
        } else {
            dayGameFooter2VH.f39805f.setVisibility(8);
        }
        viewHolder.itemView.setOnClickListener(new l(pVar));
    }

    private void r(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        DayGameFooterVH dayGameFooterVH = (DayGameFooterVH) viewHolder;
        p pVar = (p) getItem(i4);
        if (pVar == null || pVar.a() == null) {
            return;
        }
        MyImageLoader.j(dayGameFooterVH.f39808b, ((TodayWufunBroadcast) pVar.a()).getIco_remote(), MyImageLoader.A(this.f39785a));
        dayGameFooterVH.f39809c.setText(((TodayWufunBroadcast) pVar.a()).getGame_name());
        dayGameFooterVH.f39813g.setText(((TodayWufunBroadcast) pVar.a()).getTitle());
        if (((TodayWufunBroadcast) pVar.a()).getScore_count() > 0.0f) {
            dayGameFooterVH.f39812f.setVisibility(0);
            TextView textView = dayGameFooterVH.f39812f;
            textView.setText(((TodayWufunBroadcast) pVar.a()).getScore_count() + "");
        } else {
            dayGameFooterVH.f39812f.setVisibility(8);
        }
        viewHolder.itemView.setOnClickListener(new j(pVar));
    }

    private void s(GameClassifyContentVH gameClassifyContentVH, int i4) {
        if (gameClassifyContentVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() == null) {
            return;
        }
        if (gameClassifyContentVH.f39816b.getAdapter() == null) {
            if (this.f39788d == null) {
                this.f39788d = new o(this.f39785a);
            }
            gameClassifyContentVH.f39816b.setAdapter((ListAdapter) this.f39788d);
        }
        this.f39788d.e((TodayWufunEmuClassify) pVar.a());
        this.f39788d.notifyDataSetChanged();
    }

    private void t(GameClassifyTypeVH gameClassifyTypeVH, int i4) {
        if (gameClassifyTypeVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() == null) {
            return;
        }
        View view = new View(this.f39785a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f39785a.getResources().getDimensionPixelSize(R.dimen.wdp2), this.f39785a.getResources().getDimensionPixelOffset(R.dimen.wdp24));
        view.setBackgroundResource(R.drawable.shape_choice_classify_divider);
        gameClassifyTypeVH.f39818b.removeAllViews();
        for (int i5 = 0; i5 < ((List) pVar.a()).size(); i5++) {
            TextView textView = (TextView) LayoutInflater.from(this.f39785a).inflate(R.layout.choice_item_classify_type, (ViewGroup) null);
            textView.setText(((TodayWufunEmuClassify) ((List) pVar.a()).get(i5)).getName());
            if (i5 > 0) {
                View view2 = new View(this.f39785a);
                view2.setLayoutParams(layoutParams);
                view2.setBackgroundResource(R.drawable.shape_choice_classify_divider);
                gameClassifyTypeVH.f39818b.addView(view2);
            }
            if (this.f39787c == ((TodayWufunEmuClassify) ((List) pVar.a()).get(i5)).getId()) {
                textView.setSelected(true);
                B((TodayWufunEmuClassify) ((List) pVar.a()).get(i5));
            }
            gameClassifyTypeVH.f39818b.addView(textView);
            E(gameClassifyTypeVH.f39818b, textView, (TodayWufunEmuClassify) ((List) pVar.a()).get(i5));
        }
    }

    private void u(GameClassifyVH gameClassifyVH, int i4) {
        if (gameClassifyVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() == null) {
            return;
        }
        for (int i5 = 0; i5 < ((List) pVar.a()).size() && i5 < 3; i5++) {
            BannerBean bannerBean = (BannerBean) ((List) pVar.a()).get(i5);
            gameClassifyVH.f39822d[i5].setText(bannerBean.getTitle());
            gameClassifyVH.f39823e[i5].setText(bannerBean.getLabel());
            MyImageLoader.j(gameClassifyVH.f39821c[i5], bannerBean.getPic_remote(), f(this.f39785a));
            gameClassifyVH.f39820b[i5].setOnClickListener(new e(bannerBean));
        }
    }

    private void v(OrderMainVH orderMainVH, int i4) {
        if (orderMainVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        MyImageLoader.j(orderMainVH.f39825b, ((TodayWufunBroadcast) pVar.a()).getGame_img(), MyImageLoader.A(this.f39785a));
        orderMainVH.f39826c.setText(((TodayWufunBroadcast) pVar.a()).getGame_name());
        orderMainVH.f39827d.setText(((TodayWufunBroadcast) pVar.a()).getGame_desc());
        orderMainVH.f39828e.setText(this.f39785a.getResources().getString(R.string.choice_order_date, ((TodayWufunBroadcast) pVar.a()).getOnline_time()));
        orderMainVH.itemView.setOnClickListener(new b(pVar));
    }

    private void w(OrderTopVH orderTopVH, int i4) {
        if (orderTopVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (TextUtils.isEmpty((CharSequence) pVar.a())) {
            orderTopVH.f39830b.setVisibility(8);
            return;
        }
        orderTopVH.f39830b.setVisibility(0);
        orderTopVH.f39830b.setOnClickListener(new c(pVar));
    }

    private void x(Recommand1CoverVH recommand1CoverVH, int i4) {
        if (recommand1CoverVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() == null) {
            return;
        }
        MyImageLoader.d(recommand1CoverVH.f39832b, R.color.choice_recommand_bg, ((TodayWufunBroadcast) pVar.a()).getGame_img());
        MyImageLoader.j(recommand1CoverVH.f39833c, ((TodayWufunBroadcast) pVar.a()).getIco_remote(), MyImageLoader.A(this.f39785a));
        recommand1CoverVH.f39835e.setText(((TodayWufunBroadcast) pVar.a()).getGame_desc());
        recommand1CoverVH.f39834d.setText(((TodayWufunBroadcast) pVar.a()).getGame_name());
        if (((TodayWufunBroadcast) pVar.a()).getScore_count() > 0.0f) {
            recommand1CoverVH.f39836f.setVisibility(0);
            TextView textView = recommand1CoverVH.f39836f;
            textView.setText(((TodayWufunBroadcast) pVar.a()).getScore_count() + "");
        } else {
            recommand1CoverVH.f39836f.setVisibility(8);
        }
        recommand1CoverVH.itemView.setOnClickListener(new f(pVar));
    }

    private void y(Recommand2CoverVH recommand2CoverVH, int i4) {
        if (recommand2CoverVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() != null) {
            MyImageLoader.h(recommand2CoverVH.f39838b, ((TodayWufunBroadcast) pVar.a()).getGame_img());
            recommand2CoverVH.itemView.setOnClickListener(new g(pVar));
        }
    }

    private void z(Recommand2FooterVH recommand2FooterVH, int i4) {
        if (recommand2FooterVH == null) {
            return;
        }
        p pVar = (p) getItem(i4);
        if (pVar.a() != null) {
            recommand2FooterVH.f39841c.setText(((TodayWufunBroadcast) pVar.a()).getGame_desc());
            recommand2FooterVH.f39840b.setText(((TodayWufunBroadcast) pVar.a()).getGame_name());
            if (((TodayWufunBroadcast) pVar.a()).getScore_count() > 0.0f) {
                recommand2FooterVH.f39842d.setVisibility(0);
                TextView textView = recommand2FooterVH.f39842d;
                textView.setText(((TodayWufunBroadcast) pVar.a()).getScore_count() + "");
            } else {
                recommand2FooterVH.f39842d.setVisibility(8);
            }
            recommand2FooterVH.itemView.setOnClickListener(new h(pVar));
        }
    }

    public void B(TodayWufunEmuClassify todayWufunEmuClassify) {
        this.f39787c = todayWufunEmuClassify.getId();
        if (this.f39788d == null && this.f39785a != null) {
            this.f39788d = new o(this.f39785a);
        }
        o oVar = this.f39788d;
        if (oVar != null) {
            oVar.e(todayWufunEmuClassify);
            this.f39788d.notifyDataSetChanged();
        }
    }

    public void C(int i4) {
        this.f39787c = i4;
    }

    public void D(List<p> list) {
        if (this.f39786b == null) {
            this.f39786b = new ArrayList();
        }
        this.f39786b.clear();
        this.f39786b.addAll(list);
    }

    public void E(ViewGroup viewGroup, View view, TodayWufunEmuClassify todayWufunEmuClassify) {
        if (view == null || todayWufunEmuClassify == null) {
            return;
        }
        view.setOnClickListener(new d(viewGroup, todayWufunEmuClassify));
    }

    public int c() {
        List<p> list = this.f39786b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int d() {
        return this.f39787c;
    }

    public String e(TextView textView, String str, int i4) {
        float measureText = textView.getPaint().measureText(str);
        int i5 = this.f39785a.getResources().getDisplayMetrics().widthPixels;
        float measuredWidth = measureText / textView.getMeasuredWidth();
        double d5 = i4;
        Double.isNaN(d5);
        double d6 = d5 + 0.5d;
        if (measuredWidth > d6) {
            StringBuilder sb = new StringBuilder();
            double length = str.length() / measuredWidth;
            Double.isNaN(length);
            sb.append(str.substring(0, (int) (length / d6)));
            sb.append("...");
            return sb.toString();
        }
        return str;
    }

    public int g() {
        return this.f39789e;
    }

    public Object getItem(int i4) {
        List<p> list = this.f39786b;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<p> list = this.f39786b;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f39786b.get(i4).g();
    }

    public void h(String str, String str2, int i4, int i5) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(str);
        intentDateBean.setTpl_type(str2);
        intentDateBean.setJump_type(i4);
        ExtBean extBean = new ExtBean();
        extBean.set_from_type(i5);
        intentDateBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this.f39785a, intentDateBean);
    }

    public void i(String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(6);
        intentDateBean.setLink_type_val(str);
        IntentUtil.getInstance().intentActivity(this.f39785a, intentDateBean);
    }

    void j(BannerBean bannerBean) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(bannerBean.getLink_type());
        intentDateBean.setCrc_link_type_val(bannerBean.getCrc_link_type_val());
        intentDateBean.setTpl_type(bannerBean.getTpl_type());
        intentDateBean.setJump_type(bannerBean.getJump_type());
        intentDateBean.setLink_type_val(bannerBean.getLink_type_val());
        IntentUtil.getInstance().intentActivity(this.f39785a, intentDateBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder == null) {
            return;
        }
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 1) {
            A(viewHolder, i4);
        } else if (itemViewType == 2) {
            x((Recommand1CoverVH) viewHolder, i4);
        } else if (itemViewType == 3) {
            y((Recommand2CoverVH) viewHolder, i4);
        } else if (itemViewType == 4) {
            z((Recommand2FooterVH) viewHolder, i4);
        } else if (itemViewType == 5) {
            n((DateLineVH) viewHolder, i4);
        } else if (itemViewType == 6) {
            p(viewHolder, i4);
        } else if (itemViewType == 7) {
            r(viewHolder, i4);
        } else if (itemViewType == 13) {
            o(viewHolder, i4);
        } else if (itemViewType == 14) {
            q(viewHolder, i4);
        } else if (itemViewType == 8) {
            m(viewHolder, i4);
        } else if (itemViewType == 9) {
            l((ChoiceCoverVH) viewHolder, i4);
        } else if (itemViewType == 10) {
            w((OrderTopVH) viewHolder, i4);
        } else if (itemViewType == 11) {
            v((OrderMainVH) viewHolder, i4);
        } else if (itemViewType == 12) {
            k(viewHolder, i4);
        } else if (itemViewType == 15) {
            u((GameClassifyVH) viewHolder, i4);
        } else if (itemViewType == 16) {
            t((GameClassifyTypeVH) viewHolder, i4);
        } else if (itemViewType == 17) {
            s((GameClassifyContentVH) viewHolder, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 == 1) {
            return new RecommandTitleVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_recommand_title, viewGroup, false));
        }
        if (i4 == 2) {
            return new Recommand1CoverVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_recommand_1_cover, viewGroup, false));
        }
        if (i4 == 3) {
            return new Recommand2CoverVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_recommand_2_cover, viewGroup, false));
        }
        if (i4 == 4) {
            return new Recommand2FooterVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_recommand_2_footer, viewGroup, false));
        }
        if (i4 == 5) {
            return new DateLineVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_date_line, viewGroup, false));
        }
        if (i4 == 6) {
            return new DayGameCoverVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_day_game_cover, viewGroup, false));
        }
        if (i4 == 7) {
            return new DayGameFooterVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_day_game_footer, viewGroup, false));
        }
        if (i4 == 13) {
            return new DayGameCover2VH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_day_game_cover2, viewGroup, false));
        }
        if (i4 == 14) {
            return new DayGameFooter2VH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_day_game_footer2, viewGroup, false));
        }
        if (i4 == 8) {
            return new ChoiceTopVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_choice_top, viewGroup, false));
        }
        if (i4 == 9) {
            return new ChoiceCoverVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_choice_cover, viewGroup, false));
        }
        if (i4 == 10) {
            return new OrderTopVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_order_top, viewGroup, false));
        }
        if (i4 == 11) {
            return new OrderMainVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_order_main, viewGroup, false));
        }
        if (i4 == 12) {
            return new ChoiceBottomVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_choice_bottom, viewGroup, false));
        }
        if (i4 == 0) {
            return new DividerVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_divider, viewGroup, false));
        }
        if (i4 == 15) {
            return new GameClassifyVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_game_classify, viewGroup, false));
        }
        if (i4 == 16) {
            return new GameClassifyTypeVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_game_classify_type, viewGroup, false));
        }
        if (i4 == 17) {
            return new GameClassifyContentVH(LayoutInflater.from(this.f39785a).inflate(R.layout.chioce_item_game_classify_content, viewGroup, false));
        }
        return null;
    }
}
