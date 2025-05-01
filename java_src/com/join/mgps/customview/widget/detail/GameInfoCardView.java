package com.join.mgps.customview.widget.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.PaPaBannerListActivity_;
import com.join.mgps.activity.RankingHomeActivity_;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.GameDetailRankingTag;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa91.arc.widget.htmltext.HtmlTextView;
/* loaded from: classes4.dex */
public class GameInfoCardView extends LinearLayout implements com.join.mgps.customview.widget.detail.b {

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f48915b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f48916c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f48917d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f48918e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f48919f;

    /* renamed from: g  reason: collision with root package name */
    public MStarBar f48920g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f48921h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f48922i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f48923j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f48924k;

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f48925l;

    /* renamed from: m  reason: collision with root package name */
    HtmlTextView f48926m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.customview.widget.detail.a f48927n;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameInfoCardView.this.f48927n != null) {
                GameInfoCardView.this.f48927n.K();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f48929b;

        b(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f48929b = gamedetialModleFourBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.k0(GameInfoCardView.this.getContext()).e(1).a(true).c(this.f48929b.getGame_company_id()).d(this.f48929b.getCompany_name()).start();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDetailRankingTag.GameTagBean f48931b;

        c(GameDetailRankingTag.GameTagBean gameTagBean) {
            this.f48931b = gameTagBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f48931b == null) {
                return;
            }
            RankingHomeActivity_.j0(GameInfoCardView.this.getContext()).c(1001).b(this.f48931b.getType()).a(this.f48931b.getId()).d(this.f48931b.getSub_title()).start();
        }
    }

    public GameInfoCardView(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        LinearLayout.inflate(context, R.layout.view_game_detail_game_info, this);
        this.f48915b = (SimpleDraweeView) findViewById(R.id.appIcon);
        this.f48916c = (TextView) findViewById(R.id.appName);
        this.f48917d = (TextView) findViewById(R.id.appCompany);
        this.f48918e = (TextView) findViewById(R.id.appSize);
        this.f48919f = (TextView) findViewById(R.id.appDownloadCount);
        this.f48920g = (MStarBar) findViewById(R.id.comment_head_mstarBar);
        this.f48921h = (LinearLayout) findViewById(R.id.companyLayout);
        this.f48922i = (LinearLayout) findViewById(R.id.scoreLayout);
        this.f48923j = (TextView) findViewById(R.id.comment_head_point_tx);
        this.f48924k = (TextView) findViewById(R.id.comment_head_num_tx);
        this.f48925l = (RelativeLayout) findViewById(R.id.rl_hot_rank);
        this.f48926m = (HtmlTextView) findViewById(R.id.tv_hot_title);
    }

    private void d(GamedetialModleFourBean gamedetialModleFourBean) {
        try {
            GameScore game_score = gamedetialModleFourBean.getGame_score();
            if ("1".equals(gamedetialModleFourBean.getComment_score_switch()) && game_score != null && g2.i(game_score.getScore())) {
                if (!"0.0".equals(game_score.getScore()) && !"0".equals(game_score.getScore())) {
                    this.f48923j.setText(game_score.getScore());
                    this.f48920g.setIntegerMark(false);
                    this.f48920g.setEnabled(false);
                    this.f48920g.setStarMark(game_score.getTotal_stars());
                    this.f48922i.setVisibility(0);
                    return;
                }
                this.f48924k.setText("暂未出分");
                this.f48923j.setText("0");
                this.f48920g.setIntegerMark(false);
                this.f48920g.setEnabled(false);
                this.f48920g.setStarMark(game_score.getTotal_stars());
                this.f48922i.setVisibility(0);
                return;
            }
            this.f48922i.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public void a(GamedetialModleFourBean gamedetialModleFourBean) {
        MyImageLoader.h(this.f48915b, gamedetialModleFourBean.getIco_remote());
        this.f48916c.setText(gamedetialModleFourBean.getGame_name());
        this.f48917d.setText(gamedetialModleFourBean.getCompany_name());
        if (gamedetialModleFourBean.getBespeak_switch() == 1) {
            if (gamedetialModleFourBean.getAppSize() != null && !"0.00".equals(gamedetialModleFourBean.getAppSize())) {
                TextView textView = this.f48918e;
                textView.setText(gamedetialModleFourBean.getAppSize() + "M");
                this.f48918e.setVisibility(0);
            } else {
                this.f48918e.setVisibility(8);
            }
            if (gamedetialModleFourBean.getBespeak_count() == null) {
                this.f48919f.setText("已有0人预约");
            } else {
                TextView textView2 = this.f48919f;
                textView2.setText("已有" + gamedetialModleFourBean.getBespeak_count() + "人预约");
            }
        } else {
            this.f48918e.setVisibility(0);
            this.f48919f.setText(g2.c(gamedetialModleFourBean.getDown_count()));
            TextView textView3 = this.f48918e;
            textView3.setText(gamedetialModleFourBean.getAppSize() + "M");
            try {
                if (gamedetialModleFourBean.getDown_status() == 5 && gamedetialModleFourBean.getSp_tag_info() != null && gamedetialModleFourBean.getSp_tag_info().getDown_res() != null) {
                    this.f48919f.setText(gamedetialModleFourBean.getSp_tag_info().getDown_res().getName());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (gamedetialModleFourBean.getPlugin_num() != null) {
            String plugin_num = gamedetialModleFourBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f48918e.setVisibility(8);
                this.f48919f.setText(g2.c(gamedetialModleFourBean.getDown_count()).replace("安装", getResources().getString(R.string.download_status_finished)));
            }
        }
        d(gamedetialModleFourBean);
        this.f48922i.setOnClickListener(new a());
        this.f48921h.setVisibility(8);
        this.f48917d.setOnClickListener(new b(gamedetialModleFourBean));
        if (gamedetialModleFourBean.getGame_ranking_pos() != null) {
            GameDetailRankingTag.GameTagBean hot_game = gamedetialModleFourBean.getGame_ranking_pos().getHot_game();
            GameDetailRankingTag.GameTagBean tag_game = gamedetialModleFourBean.getGame_ranking_pos().getTag_game();
            GameDetailRankingTag.GameTagBean tag_game2 = gamedetialModleFourBean.getGame_ranking_pos().getTag_game();
            if (hot_game == null) {
                hot_game = tag_game != null ? tag_game : tag_game2;
            }
            if (hot_game != null) {
                this.f48925l.setVisibility(0);
                this.f48926m.setHtml(hot_game.getTitle());
            } else {
                this.f48925l.setVisibility(8);
            }
            this.f48925l.setOnClickListener(new c(hot_game));
            return;
        }
        this.f48925l.setVisibility(8);
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public View getContentView() {
        return this;
    }

    @Override // com.join.mgps.customview.widget.detail.b
    public void setGameInfoCallback(com.join.mgps.customview.widget.detail.a aVar) {
        this.f48927n = aVar;
    }

    public GameInfoCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public GameInfoCardView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c(context);
    }
}
