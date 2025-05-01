package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.adapter.GameInfoAdapterV2;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.NewArenaGameListBean;
import com.join.mgps.dto.ResultResMainBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_gamelist)
/* loaded from: classes3.dex */
public class ArenaGameListFragment extends BaseLoadingFragment {

    /* renamed from: m  reason: collision with root package name */
    private static final int f49949m = 10;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.l f49950c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XRecyclerView f49951d;

    /* renamed from: e  reason: collision with root package name */
    private int f49952e;

    /* renamed from: f  reason: collision with root package name */
    private int f49953f;

    /* renamed from: g  reason: collision with root package name */
    private int f49954g;

    /* renamed from: h  reason: collision with root package name */
    private GameInfoAdapterV2 f49955h;

    /* renamed from: j  reason: collision with root package name */
    private Activity f49957j;

    /* renamed from: k  reason: collision with root package name */
    private int f49958k;

    /* renamed from: i  reason: collision with root package name */
    private List<GameInfoBean> f49956i = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private boolean f49959l = false;

    /* loaded from: classes3.dex */
    class a implements GameInfoAdapterV2.e {
        a() {
        }

        @Override // com.join.mgps.adapter.GameInfoAdapterV2.e
        public void a(int i4) {
            if (ArenaGameListFragment.this.f49958k != 2) {
                GameRoomListActivity_.W3(ArenaGameListFragment.this.f49957j).c((GameInfoBean) ArenaGameListFragment.this.f49956i.get(i4)).a(true).b(true).start();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("mGameInfo", (GameInfoBean) ArenaGameListFragment.this.f49956i.get(i4));
            ArenaGameListFragment.this.getActivity().setResult(10001, intent);
            ArenaGameListFragment.this.getActivity().finish();
        }
    }

    /* loaded from: classes3.dex */
    class b implements XRecyclerView.f {
        b() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            if (ArenaGameListFragment.this.f49959l) {
                if (!com.join.android.app.common.utils.j.j(ArenaGameListFragment.this.f49957j)) {
                    ArenaGameListFragment.this.f49951d.stopLoadMore();
                    ArenaGameListFragment.this.k0();
                    return;
                }
                ArenaGameListFragment.this.loadData();
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_gamelist;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.fragment_gamelist;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f49950c = com.join.mgps.rpc.impl.l.n0();
        if (!this.f49959l) {
            this.f49951d.setNoMore();
        }
        this.f49955h = new GameInfoAdapterV2(this.f49957j, false);
        this.f49951d.setPreLoadCount(5);
        this.f49951d.setLayoutManager(new GridLayoutManager(this.f49957j, ((double) com.join.android.app.common.utils.n.n(getActivity()).j(this.f49957j)) >= 1.9d ? 3 : 2));
        this.f49951d.setAdapter(this.f49955h);
        this.f49955h.f(new a());
        this.f49951d.setLoadingMoreEnabled(true);
        this.f49951d.setPullRefreshEnabled(false);
        this.f49951d.setLoadingListener(new b());
        if (this.f49954g == 2) {
            boolean z4 = this.f49956i.size() >= 10;
            this.f49959l = z4;
            if (!z4) {
                this.f49951d.setNoMore();
            }
        } else {
            d0();
            loadData();
        }
        this.f46258b.setLoadingLayoutBGColor(0);
        this.f49955h.notifyDataSetChanged();
    }

    public void j0(int i4) {
        this.f49953f = i4;
        this.f49954g = 1;
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        Activity activity = this.f49957j;
        if (activity != null) {
            l2.a(activity).b(getString(R.string.net_connect_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(List<GameInfoBean> list) {
        if (this.f49951d.getVisibility() == 8) {
            this.f49951d.setVisibility(0);
        }
        if (list != null && list.size() >= 0) {
            if (this.f49954g == 2) {
                this.f49956i.clear();
            }
            this.f49956i.addAll(list);
        }
        this.f49955h.e(this.f49956i);
        this.f49951d.stopLoadMore();
        this.f49951d.stopRefresh();
        if (!this.f49959l) {
            this.f49951d.setNoMore();
            if (this.f49956i.size() <= 0) {
                this.f49951d.setVisibility(8);
                return;
            }
        }
        this.f49955h.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(this.f49957j)) {
            try {
                ResultResMainBean<NewArenaGameListBean> w4 = this.f49950c.w(this.f49953f, this.f49952e, this.f49954g);
                Activity activity = this.f49957j;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                if (Build.VERSION.SDK_INT < 17 || !this.f49957j.isDestroyed()) {
                    if (w4 != null && w4.getData() != null) {
                        List<GameInfoBean> game_list = w4.getData().getGame_list();
                        if (game_list != null && game_list.size() > 0) {
                            this.f49959l = game_list.size() >= 10;
                        } else {
                            this.f49959l = false;
                        }
                        if (this.f49954g <= 1) {
                            a0();
                        }
                        if (this.f49959l) {
                            this.f49954g++;
                        }
                        l0(game_list);
                        return;
                    }
                    if (this.f49954g <= 1) {
                        showLodingFailed();
                    }
                }
            } catch (Exception unused) {
                if (this.f49954g <= 1) {
                    showLodingFailed();
                }
            }
        } else if (this.f49954g <= 1) {
            showLodingFailed();
            k0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f49957j = (Activity) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f49952e = arguments.getInt("game_type");
        this.f49953f = arguments.getInt("room_type");
        this.f49958k = arguments.getInt("from");
        int i4 = arguments.getInt("pn");
        this.f49954g = i4;
        if (i4 == 2) {
            ArrayList arrayList = (ArrayList) arguments.getSerializable("datas");
            if (arrayList != null && arrayList.size() > 0) {
                this.f49956i.addAll(arrayList);
            } else {
                this.f49954g = 1;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f49957j = null;
        this.f49956i.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        XRecyclerView xRecyclerView = this.f49951d;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        List<GameInfoBean> list = this.f49956i;
        if (list == null || list.size() == 0) {
            c0();
        }
    }
}
