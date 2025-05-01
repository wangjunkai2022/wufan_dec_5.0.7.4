package com.join.mgps.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.EndGameBean;
import com.join.mgps.dto.EndGameNameListBean;
import com.join.mgps.fragment.EndGameDiscoveryFragment;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_discovery)
/* loaded from: classes3.dex */
public class EndGameDiscoveryFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f51095b;
    @FragmentArg

    /* renamed from: c  reason: collision with root package name */
    int f51096c;
    @FragmentArg

    /* renamed from: d  reason: collision with root package name */
    EndGameNameListBean f51097d;

    /* renamed from: e  reason: collision with root package name */
    private com.join.android.app.component.video.c f51098e;

    /* renamed from: f  reason: collision with root package name */
    private c f51099f;

    /* loaded from: classes3.dex */
    class a implements BaseQuickAdapter.j {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            List<EndGameBean> gameEndgameVo = EndGameDiscoveryFragment.this.f51097d.getGameEndgameVo();
            EndGameDetailActivity_.C0(EndGameDiscoveryFragment.this.getContext()).a(gameEndgameVo.get(i4).getEndgameId()).b(gameEndgameVo.get(i4).getGameId()).start();
            EndGameDiscoveryFragment.this.a0(gameEndgameVo.get(i4).getEndgameId());
        }
    }

    /* loaded from: classes3.dex */
    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                EndGameDiscoveryFragment.this.Z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BaseQuickAdapter<EndGameBean, BaseViewHolder> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseViewHolder f51103b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ EndGameBean f51104c;

            a(BaseViewHolder baseViewHolder, EndGameBean endGameBean) {
                this.f51103b = baseViewHolder;
                this.f51104c = endGameBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EndGameDiscoveryFragment.this.f51098e.F(this.f51103b.getLayoutPosition());
                EndGameDiscoveryFragment.this.a0(this.f51104c.getEndgameId());
            }
        }

        public c(@Nullable List<EndGameBean> list) {
            super(R.layout.item_end_game_discovery_list, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(EndGameBean endGameBean, View view) {
            if (AccountUtil_.getInstance_(EndGameDiscoveryFragment.this.getContext()).isTourist()) {
                IntentUtil.getInstance().goLogin(EndGameDiscoveryFragment.this.getContext());
                return;
            }
            EndGameLaunchActivity_.G0(EndGameDiscoveryFragment.this.getContext()).a(endGameBean).b(endGameBean.getGameId()).d(16).start();
            try {
                Ext ext = new Ext();
                ext.setPosition("1");
                ext.setEndId(endGameBean.getEndgameId());
                Data data = new Data();
                data.setGameId(Long.parseLong(endGameBean.getGameId()));
                com.papa.sim.statistic.p.l(EndGameDiscoveryFragment.this.getContext()).i0(Event.gameStartVS, ext, data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final EndGameBean endGameBean) {
            String str;
            try {
                Double.parseDouble(endGameBean.getChallengeSucRateStr());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            BaseViewHolder text = baseViewHolder.setText(R.id.tvName, endGameBean.getTitle());
            if (endGameBean.getChallenge() <= 0) {
                str = "0";
            } else {
                str = endGameBean.getChallenge() + "";
            }
            text.setText(R.id.tvHot, str).setText(R.id.tvPassRatio, endGameBean.getChallengeSucRate()).setText(R.id.tvGameName, endGameBean.getGameName());
            StringBuilder sb = new StringBuilder();
            sb.append("convert: ");
            sb.append(endGameBean.getGameName());
            if (g2.i(endGameBean.getVideo())) {
                MyImageLoader.d((SimpleDraweeView) baseViewHolder.getView(R.id.bannerView), R.drawable.banner_normal_icon, endGameBean.getCover());
                baseViewHolder.getView(R.id.bannerView).setTag(Integer.valueOf(baseViewHolder.getLayoutPosition()));
                EndGameDiscoveryFragment.this.f51098e.e(baseViewHolder.getLayoutPosition(), new c.l(baseViewHolder.getLayoutPosition(), endGameBean.getVideo(), endGameBean.getCover(), endGameBean.getGameId(), endGameBean.getEndgameId(), ""), new boolean[0]);
                baseViewHolder.getView(R.id.videoContner).setOnClickListener(new a(baseViewHolder, endGameBean));
            }
            baseViewHolder.getView(R.id.btnPlay).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameDiscoveryFragment.c.this.c(endGameBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
        try {
            Ext ext = new Ext();
            ext.setEndId(str);
            Data data = new Data();
            data.setGameId(Long.parseLong(this.f51097d.getGameId()));
            com.papa.sim.statistic.p.l(getContext()).i0(Event.clickEndGameDetail, ext, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void X() {
        Context context = getContext();
        this.f51098e = new com.join.android.app.component.video.c(context, "EndGameDiscoveryFragment" + this.f51096c);
        this.f51095b.setLayoutManager(new GridLayoutManager(getContext(), 2));
        c cVar = new c(this.f51097d.getGameEndgameVo());
        this.f51099f = cVar;
        this.f51095b.setAdapter(cVar);
        this.f51095b.setNestedScrollingEnabled(false);
        this.f51099f.setEmptyView(LayoutInflater.from(getContext()).inflate(R.layout.empty_layout_include, (ViewGroup) null, false));
        this.f51099f.setOnItemClickListener(new a());
        this.f51095b.addOnScrollListener(new b());
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void Z() {
    }

    public void b0() {
        com.join.android.app.component.video.c cVar = this.f51098e;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
        com.join.android.app.component.video.c cVar = this.f51098e;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.c cVar = this.f51098e;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        b0();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4) {
            b0();
            return;
        }
        com.join.android.app.component.video.c cVar = this.f51098e;
        if (cVar != null) {
            cVar.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getContext()).b(str);
    }
}
