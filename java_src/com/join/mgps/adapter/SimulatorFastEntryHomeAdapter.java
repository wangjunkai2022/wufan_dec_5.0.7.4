package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.EverdayNewGameActivity;
import com.join.kotlin.ui.findgame.CategoryDetailListActivity;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.SimulatorFastEntryHomeAdapter;
import com.join.mgps.customview.CirclePageIndicator;
import com.join.mgps.customview.HorizontalRecyclerView;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.SimulatorFastEntryBean;
import com.join.mgps.dto.SimulatorFastEntryListBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorFastEntryHomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f44094d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f44095e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f44096f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f44097g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f44098h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f44099i = 5;

    /* renamed from: j  reason: collision with root package name */
    public static final int f44100j = 6;

    /* renamed from: a  reason: collision with root package name */
    private List<SimulatorFastEntryListBean> f44101a;

    /* renamed from: b  reason: collision with root package name */
    private Context f44102b;

    /* renamed from: c  reason: collision with root package name */
    private SimulatorFastEntryViewpagerAdapter f44103c;

    /* loaded from: classes4.dex */
    class a extends GridLayoutManager {
        a(Context context, int i4) {
            super(context, i4);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class b extends GridLayoutManager {
        b(Context context, int i4) {
            super(context, i4);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class c extends GridLayoutManager {
        c(Context context, int i4) {
            super(context, i4);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    private class d extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayoutManager f44107a;

        /* renamed from: b  reason: collision with root package name */
        private SimulatorFastEntryListBean f44108b;

        /* renamed from: c  reason: collision with root package name */
        private int f44109c;

        /* renamed from: d  reason: collision with root package name */
        private int f44110d;

        public d(SimulatorFastEntryListBean simulatorFastEntryListBean, LinearLayoutManager linearLayoutManager) {
            this.f44107a = linearLayoutManager;
            this.f44108b = simulatorFastEntryListBean;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            int i5;
            View findViewByPosition;
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 != 0) {
                return;
            }
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            this.f44108b.setScrollPosition(this.f44107a.findFirstVisibleItemPosition() < 0 ? this.f44108b.getScrollPosition() : this.f44107a.findFirstVisibleItemPosition() + 1);
            if (this.f44109c <= 0 && (findViewByPosition = this.f44107a.findViewByPosition(this.f44108b.getScrollPosition())) != null) {
                this.f44109c = findViewByPosition.getWidth();
                this.f44110d = ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams())).rightMargin;
            }
            if (computeHorizontalScrollOffset <= 0 || (i5 = this.f44109c) <= 0) {
                return;
            }
            SimulatorFastEntryListBean simulatorFastEntryListBean = this.f44108b;
            simulatorFastEntryListBean.setScrollOffset((i5 - (computeHorizontalScrollOffset % i5)) + (simulatorFastEntryListBean.getScrollPosition() * this.f44110d));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* loaded from: classes4.dex */
    class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView f44112a;

        public e(@NonNull View view) {
            super(view);
            this.f44112a = (RecyclerView) view.findViewById(R.id.recyclerview);
        }
    }

    /* loaded from: classes4.dex */
    class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f44114a;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f44115b;

        public f(@NonNull View view) {
            super(view);
            this.f44114a = (LinearLayout) view.findViewById(R.id.llMore);
            this.f44115b = (RecyclerView) view.findViewById(R.id.rvClassicGame);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private ViewPager f44117a;

        /* renamed from: b  reason: collision with root package name */
        private CirclePageIndicator f44118b;

        public g(@NonNull View view) {
            super(view);
            this.f44117a = (ViewPager) view.findViewById(R.id.viewpager);
            this.f44118b = (CirclePageIndicator) view.findViewById(R.id.indicator);
        }
    }

    /* loaded from: classes4.dex */
    class h extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f44120a;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f44121b;

        public h(@NonNull View view) {
            super(view);
            this.f44120a = (LinearLayout) view.findViewById(R.id.llMore);
            this.f44121b = (RecyclerView) view.findViewById(R.id.rvNewGame);
        }
    }

    /* loaded from: classes4.dex */
    class i extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f44123a;

        public i(@NonNull View view) {
            super(view);
            this.f44123a = (TextView) view.findViewById(R.id.spacingView);
        }
    }

    /* loaded from: classes4.dex */
    class j extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private HorizontalRecyclerView f44125a;

        public j(@NonNull View view) {
            super(view);
            this.f44125a = (HorizontalRecyclerView) view.findViewById(R.id.recyclerview);
        }
    }

    /* loaded from: classes4.dex */
    class k extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44127a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f44128b;

        public k(@NonNull View view) {
            super(view);
            this.f44127a = (TextView) view.findViewById(R.id.title);
            this.f44128b = (LinearLayout) view.findViewById(R.id.llMore);
        }
    }

    public SimulatorFastEntryHomeAdapter(Context context, List<SimulatorFastEntryListBean> list) {
        this.f44102b = context;
        this.f44101a = list == null ? new ArrayList<>() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(SimulatorFastEntryListBean simulatorFastEntryListBean, String str, View view) {
        Intent intent = new Intent(this.f44102b, CategoryDetailListActivity.class);
        intent.putExtra("typeId", 1);
        intent.putExtra("tagId", simulatorFastEntryListBean.getTagId());
        intent.putExtra("tagName", str);
        intent.putExtra("from", 207);
        this.f44102b.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(g gVar, List list) {
        gVar.f44118b.setVisibility(list.size() <= 1 ? 8 : 0);
        gVar.f44118b.setViewPager(gVar.f44117a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        Intent intent = new Intent(new Intent(this.f44102b, EverdayNewGameActivity.class));
        intent.putExtra("default_position", 3);
        this.f44102b.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(SimulatorFastEntryBean.WillPlay willPlay, View view) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(2);
        intentDateBean.setTpl_type("4");
        intentDateBean.setCrc_link_type_val(willPlay.getColl_id());
        ExtBean extBean = new ExtBean();
        extBean.set_from_type(207);
        extBean.setFrom("207");
        intentDateBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this.f44102b, intentDateBean);
    }

    public List<SimulatorFastEntryListBean> getData() {
        List<SimulatorFastEntryListBean> list = this.f44101a;
        return list == null ? new ArrayList() : list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44101a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<SimulatorFastEntryListBean> list;
        if (i4 >= 0 && (list = this.f44101a) != null && list.size() > i4) {
            return this.f44101a.get(i4).getType();
        }
        return 0;
    }

    public void i(List<SimulatorFastEntryListBean> list) {
        this.f44101a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        int itemViewType = getItemViewType(i4);
        final SimulatorFastEntryListBean simulatorFastEntryListBean = this.f44101a.get(i4);
        switch (itemViewType) {
            case 0:
                k kVar = (k) viewHolder;
                final String str = (String) simulatorFastEntryListBean.getData();
                kVar.f44127a.setText(str);
                kVar.f44128b.setVisibility(TextUtils.isEmpty(simulatorFastEntryListBean.getTagId()) ? 8 : 0);
                kVar.f44128b.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.y5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimulatorFastEntryHomeAdapter.this.e(simulatorFastEntryListBean, str, view);
                    }
                });
                return;
            case 1:
                if (this.f44103c == null) {
                    final g gVar = (g) viewHolder;
                    final List list = (List) simulatorFastEntryListBean.getData();
                    this.f44103c = new SimulatorFastEntryViewpagerAdapter(this.f44102b, list);
                    gVar.f44117a.setAdapter(this.f44103c);
                    gVar.f44117a.post(new Runnable() { // from class: com.join.mgps.adapter.z5
                        @Override // java.lang.Runnable
                        public final void run() {
                            SimulatorFastEntryHomeAdapter.f(SimulatorFastEntryHomeAdapter.g.this, list);
                        }
                    });
                    return;
                }
                return;
            case 2:
                h hVar = (h) viewHolder;
                a aVar = new a(this.f44102b, 4);
                hVar.f44121b.setNestedScrollingEnabled(false);
                hVar.f44121b.setHasFixedSize(true);
                hVar.f44121b.setLayoutManager(aVar);
                hVar.f44121b.setAdapter(new SimulatorGridAdapter((List) simulatorFastEntryListBean.getData(), false));
                hVar.f44120a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.w5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimulatorFastEntryHomeAdapter.this.g(view);
                    }
                });
                return;
            case 3:
                f fVar = (f) viewHolder;
                final SimulatorFastEntryBean.WillPlay willPlay = (SimulatorFastEntryBean.WillPlay) simulatorFastEntryListBean.getData();
                if (willPlay == null || willPlay.getGames() == null || willPlay.getGames().size() <= 0) {
                    return;
                }
                b bVar = new b(this.f44102b, 4);
                fVar.f44115b.setNestedScrollingEnabled(false);
                fVar.f44115b.setHasFixedSize(true);
                fVar.f44115b.setLayoutManager(bVar);
                fVar.f44115b.setAdapter(new SimulatorGridAdapter(willPlay.getGames(), true));
                fVar.f44114a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.x5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimulatorFastEntryHomeAdapter.this.h(willPlay, view);
                    }
                });
                return;
            case 4:
                e eVar = (e) viewHolder;
                eVar.f44112a.setLayoutManager(new c(this.f44102b, 2));
                eVar.f44112a.setAdapter(new SimulatorFastEntryChangeGameAdapter((List) simulatorFastEntryListBean.getData()));
                return;
            case 5:
                j jVar = (j) viewHolder;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f44102b, 0, false);
                jVar.f44125a.setLayoutManager(linearLayoutManager);
                jVar.f44125a.setAdapter(new SimulatorFastEntryTagGameAdapter((List) simulatorFastEntryListBean.getData()));
                if (simulatorFastEntryListBean.getScrollOffset() > 0) {
                    linearLayoutManager.scrollToPositionWithOffset(simulatorFastEntryListBean.getScrollPosition(), simulatorFastEntryListBean.getScrollOffset());
                }
                jVar.f44125a.addOnScrollListener(new d(simulatorFastEntryListBean, linearLayoutManager));
                return;
            case 6:
                i iVar = (i) viewHolder;
                float floatValue = ((Float) simulatorFastEntryListBean.getData()).floatValue();
                ViewGroup.LayoutParams layoutParams = iVar.f44123a.getLayoutParams();
                layoutParams.height = (int) floatValue;
                iVar.f44123a.setLayoutParams(layoutParams);
                return;
            default:
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        switch (i4) {
            case 0:
                return new k(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_title, viewGroup, false));
            case 1:
                return new g(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_viewpager, viewGroup, false));
            case 2:
                return new h(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_new_game, viewGroup, false));
            case 3:
                return new f(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_classic_game, viewGroup, false));
            case 4:
                return new e(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_change_game, viewGroup, false));
            case 5:
                return new j(LayoutInflater.from(this.f44102b).inflate(R.layout.layout_simulator_tag_game, viewGroup, false));
            case 6:
                return new i(LayoutInflater.from(this.f44102b).inflate(R.layout.papamain_item_spacing_layout, viewGroup, false));
            default:
                return null;
        }
    }
}
