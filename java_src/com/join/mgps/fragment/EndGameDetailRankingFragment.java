package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.http.d;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.EndGameDetailBean;
import com.join.mgps.dto.EndGameRecordArgs;
import com.join.mgps.dto.RequestEndGameDetailArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.fragment.EndGameDetailRankingFragment;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import okhttp3.Request;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_detail_ranking)
/* loaded from: classes3.dex */
public class EndGameDetailRankingFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f51064b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f51065c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f51066d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f51067e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f51068f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f51069g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RecyclerView f51070h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f51071i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f51072j;
    @FragmentArg

    /* renamed from: k  reason: collision with root package name */
    EndGameDetailBean f51073k;

    /* renamed from: l  reason: collision with root package name */
    private Context f51074l;

    /* renamed from: m  reason: collision with root package name */
    private List<EndGameDetailBean.RankingListBean> f51075m;

    /* renamed from: n  reason: collision with root package name */
    private c f51076n;

    /* renamed from: o  reason: collision with root package name */
    private int f51077o = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements BaseQuickAdapter.l {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.l
        public void onLoadMoreRequested() {
            EndGameDetailRankingFragment.X(EndGameDetailRankingFragment.this);
            EndGameDetailRankingFragment endGameDetailRankingFragment = EndGameDetailRankingFragment.this;
            endGameDetailRankingFragment.d0(endGameDetailRankingFragment.f51077o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends d.p<String> {
        b() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            Toast.makeText(EndGameDetailRankingFragment.this.f51074l, "回放失败！", 0).show();
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            EndGameDetailRankingFragment.this.i0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BaseQuickAdapter<EndGameDetailBean.RankingListBean, BaseViewHolder> {
        public c(@Nullable List<EndGameDetailBean.RankingListBean> list) {
            super(R.layout.item_end_game_detail_ranking, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(EndGameDetailBean.RankingListBean rankingListBean, View view) {
            EndGameDetailRankingFragment.this.e0(rankingListBean);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, final EndGameDetailBean.RankingListBean rankingListBean) {
            baseViewHolder.setText(R.id.tvRank, String.valueOf(baseViewHolder.getLayoutPosition() + 1)).setText(R.id.tvUsername, rankingListBean.getNickname()).setText(R.id.tvScoreTime, EndGameDetailRankingFragment.this.c0(rankingListBean.getElapsedTime())).setText(R.id.tvRankChange, String.valueOf(rankingListBean.getChange())).setVisible(R.id.ivPlayVideo, rankingListBean.isPlayback()).setTextColor(R.id.tvRank, Color.parseColor(baseViewHolder.getLayoutPosition() <= 2 ? "#097BEC" : "#363636"));
            ((TextView) baseViewHolder.getView(R.id.tvRank)).setTypeface(null, baseViewHolder.getLayoutPosition() > 2 ? 0 : 1);
            baseViewHolder.getView(R.id.ivPlayVideo).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameDetailRankingFragment.c.this.c(rankingListBean, view);
                }
            });
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivAvatar), rankingListBean.getAvatar());
        }
    }

    static /* synthetic */ int X(EndGameDetailRankingFragment endGameDetailRankingFragment) {
        int i4 = endGameDetailRankingFragment.f51077o;
        endGameDetailRankingFragment.f51077o = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c0(int i4) {
        float f5 = i4 / 1000.0f;
        if (f5 < 60.0f) {
            return new DecimalFormat("0.00").format(f5) + "秒";
        }
        int i5 = (int) f5;
        return (i5 / 60) + "分" + (i5 % 60) + "秒";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(EndGameDetailBean.RankingListBean rankingListBean, View view) {
        e0(rankingListBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void b0() {
        this.f51074l = getContext();
        this.f51075m = this.f51073k.getRankingList();
        this.f51070h.setLayoutManager(new LinearLayoutManager(this.f51074l));
        c cVar = new c(this.f51075m);
        this.f51076n = cVar;
        cVar.setEmptyView(LayoutInflater.from(this.f51074l).inflate(R.layout.empty_layout_include, (ViewGroup) null, false));
        this.f51070h.setAdapter(this.f51076n);
        this.f51070h.setHasFixedSize(true);
        this.f51076n.setOnLoadMoreListener(new a(), this.f51070h);
        final EndGameDetailBean.RankingListBean myRankings = this.f51073k.getMyRankings();
        if (myRankings != null) {
            this.f51071i.setVisibility(0);
            this.f51071i.setBackgroundColor(Color.parseColor("#FAFAFA"));
            TextView textView = this.f51064b;
            textView.setText("第" + myRankings.getRanking() + "名");
            MyImageLoader.h(this.f51065c, myRankings.getAvatar());
            this.f51066d.setText(myRankings.getNickname());
            this.f51067e.setText(c0(myRankings.getElapsedTime()));
            this.f51068f.setText(String.valueOf(myRankings.getChange()));
            this.f51072j.setVisibility(myRankings.isPlayback() ? 0 : 4);
            this.f51072j.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EndGameDetailRankingFragment.this.f0(myRankings, view);
                }
            });
            return;
        }
        this.f51064b.setText("--");
        MyImageLoader.h(this.f51065c, AccountUtil_.getInstance_(getContext()).getAccountData().d0());
        this.f51066d.setText(AccountUtil_.getInstance_(getContext()).getAccountData().getNickname());
        this.f51067e.setText("暂无记录");
        this.f51068f.setText("--");
        this.f51071i.setVisibility(8);
        this.f51072j.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(int i4) {
        if (com.join.android.app.common.utils.j.j(getContext())) {
            RequestEndGameDetailArgs requestEndGameDetailArgs = new RequestEndGameDetailArgs();
            requestEndGameDetailArgs.setGameId(this.f51073k.getEndgameInfo().getGameId());
            requestEndGameDetailArgs.setEndgameId(this.f51073k.getEndgameInfo().getEndgameId());
            requestEndGameDetailArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
            requestEndGameDetailArgs.setPage(i4);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameDetailArgs);
            requestModel.setDefault(getContext());
            ResponseModel<List<EndGameDetailBean.RankingListBean>> g4 = com.join.mgps.rpc.impl.i.D0().g(requestModel.makeSign());
            if (g4 == null || g4.getCode() != 200) {
                return;
            }
            updateUi(g4.getData());
            return;
        }
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0(EndGameDetailBean.RankingListBean rankingListBean) {
        if (com.join.android.app.common.utils.j.j(getContext())) {
            EndGameRecordArgs endGameRecordArgs = new EndGameRecordArgs();
            endGameRecordArgs.setEndgameId(this.f51073k.getEndgameInfo().getEndgameId());
            endGameRecordArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
            endGameRecordArgs.setChallengeId(rankingListBean.getChallengeId());
            endGameRecordArgs.setOwnerUid(rankingListBean.getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(endGameRecordArgs);
            requestModel.setDefault(getContext());
            ResponseModel n02 = com.join.mgps.rpc.impl.i.D0().n0(requestModel.makeSign());
            if (n02 != null && n02.getCode() == 200) {
                g0((String) n02.getData());
                return;
            } else {
                showTost("获取回放地址失败");
                return;
            }
        }
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    public void g0(String str) {
        DownloadTask F = p1.f.K().F(this.f51073k.getEndgameInfo().getGameId());
        if (F != null && F.getStatus() == 5) {
            String str2 = com.join.mgps.Util.v.f28110j + "/record/";
            if (str.isEmpty()) {
                Toast.makeText(this.f51074l, "回放失败！", 0).show();
                return;
            }
            File file = new File(str2 + str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1));
            if (file.exists()) {
                i0(file.getPath());
                return;
            } else {
                com.join.android.app.common.http.d.B().a(str, str2, new b());
                return;
            }
        }
        EndGameLaunchActivity_.G0(getContext()).b(this.f51073k.getEndgameInfo().getGameId()).a(this.f51073k.getEndgameInfo()).d(15).c(str).start();
    }

    public void h0(EndGameDetailBean endGameDetailBean) {
        this.f51073k = endGameDetailBean;
        if (this.f51070h == null) {
            return;
        }
        this.f51077o = 1;
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(String str) {
        UtilsMy.j4(this.f51074l, AccountUtil_.getInstance_(getContext()).getUid(), p1.f.K().F(this.f51073k.getEndgameInfo().getGameId()), 15, str, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getContext()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<EndGameDetailBean.RankingListBean> list) {
        this.f51076n.loadMoreComplete();
        if (list != null && list.size() > 0) {
            this.f51076n.addData((Collection) list);
        } else {
            this.f51076n.loadMoreEnd(true);
        }
    }
}
