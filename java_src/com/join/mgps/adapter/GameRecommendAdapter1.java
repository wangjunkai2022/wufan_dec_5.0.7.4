package com.join.mgps.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonMultiItemBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.RecommendAd;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.List;
/* loaded from: classes4.dex */
public class GameRecommendAdapter1 extends BaseMultiItemQuickAdapter<CommonMultiItemBean, BaseViewHolder> {

    /* renamed from: g  reason: collision with root package name */
    public static final int f43132g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f43133h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f43134i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f43135j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f43136k = 4;

    /* renamed from: d  reason: collision with root package name */
    private Context f43137d;

    /* renamed from: e  reason: collision with root package name */
    String f43138e;

    /* renamed from: f  reason: collision with root package name */
    private c2 f43139f;

    public GameRecommendAdapter1(Context context) {
        super(null);
        this.f43137d = context;
        a(0, R.layout.layout_game_main_vip);
        a(1, R.layout.item_game_recommend_view1);
        a(2, R.layout.item_game_ad_type1);
        a(3, R.layout.item_game_recommend_domain);
        a(4, R.layout.item_game_recommend_view1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
        ExtBean extBean = intentDataBean.getExtBean();
        if (extBean == null) {
            extBean = new ExtBean();
            intentDataBean.setExtBean(extBean);
        }
        extBean.setFrom("5");
        IntentUtil.getInstance().intentActivity(view.getContext(), intentDataBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(DomainInfoBean domainInfoBean, View view) {
        UtilsMy.h4(this.f43137d, domainInfoBean.getInfo(), "simulato_game_start");
        com.papa.sim.statistic.p.l(this.f43137d).O1(Event.pdSimulatorStartClick, new Ext().setGameId(this.f43138e).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        EndGameActivity_.U0(this.f43137d).b(this.f43138e).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(IntentDateBean intentDateBean, BaseViewHolder baseViewHolder, View view) {
        IntentUtil.getInstance().intentActivity(view.getContext(), intentDateBean);
        Ext ext = new Ext();
        ext.setPosition("" + baseViewHolder.getLayoutPosition());
        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.indexGame_ad, ext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(GameMainV4DataBean.MemberInfoBean memberInfoBean, View view) {
        m(memberInfoBean);
    }

    private void u(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
        if (commonGameInfoBean == null) {
            return;
        }
        if (!com.join.mgps.Util.g2.h(commonGameInfoBean.getCoverPicUrl())) {
            ((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image)).setController(Fresco.newDraweeControllerBuilder().setUri(commonGameInfoBean.getCoverPicUrl()).E(true).c(((SimpleDraweeView) baseViewHolder.getView(R.id.sdv_image)).getController()).build());
        }
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameRecommendAdapter1.p(CommonGameInfoBean.this, view);
            }
        });
    }

    private void v(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        final DomainInfoBean domainInfoBean = (DomainInfoBean) commonMultiItemBean.getData();
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.bg), domainInfoBean.getPic());
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameRecommendAdapter1.this.q(domainInfoBean, view);
            }
        });
    }

    private void w(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        GameMainV4DataBean.EndGameConfigBean endGameConfigBean = (GameMainV4DataBean.EndGameConfigBean) commonMultiItemBean.getData();
        if (endGameConfigBean == null) {
            return;
        }
        String endgame_pic = endGameConfigBean.getEndgame_pic();
        if (!com.join.mgps.Util.g2.h(endgame_pic)) {
            Uri parse = Uri.parse(endgame_pic);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.bg);
            String str = (String) simpleDraweeView.getTag();
            if (TextUtils.isEmpty(str) || !endgame_pic.equals(str)) {
                simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().a(parse).E(true).c(simpleDraweeView.getController()).build());
                simpleDraweeView.setTag(endgame_pic);
            }
        }
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameRecommendAdapter1.this.r(view);
            }
        });
    }

    private void x(final BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        RecommendAd recommendAd = (RecommendAd) commonMultiItemBean.getData();
        if (recommendAd == null) {
            return;
        }
        recommendAd.getCrc_link_type_val();
        String pic_remote = recommendAd.getPic_remote();
        if (!com.join.mgps.Util.g2.h(pic_remote)) {
            Uri parse = Uri.parse(pic_remote);
            String str = (String) baseViewHolder.getView(R.id.bg).getTag();
            if (TextUtils.isEmpty(str) || !pic_remote.equals(str)) {
                ((SimpleDraweeView) baseViewHolder.getView(R.id.bg)).setController(Fresco.newDraweeControllerBuilder().a(parse).E(true).c(((SimpleDraweeView) baseViewHolder.getView(R.id.bg)).getController()).build());
                ((SimpleDraweeView) baseViewHolder.getView(R.id.bg)).setTag(pic_remote);
            }
        }
        final IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(recommendAd.getLink_type());
        intentDateBean.setJump_type(recommendAd.getJump_type());
        intentDateBean.setLink_type_val(recommendAd.getLink_type_val());
        intentDateBean.setCrc_link_type_val(recommendAd.getCrc_link_type_val());
        intentDateBean.setTpl_type(recommendAd.getTpl_type() + "");
        intentDateBean.setExtBean(new ExtBean().set_from_type(13102));
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameRecommendAdapter1.s(IntentDateBean.this, baseViewHolder, view);
            }
        });
    }

    private void y(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        if (commonMultiItemBean.getExtData() instanceof GameMainV4DataBean.MemberInfoBean) {
            final GameMainV4DataBean.MemberInfoBean memberInfoBean = (GameMainV4DataBean.MemberInfoBean) commonMultiItemBean.getExtData();
            if (memberInfoBean != null) {
                if (!com.join.mgps.Util.g2.h(memberInfoBean.getPic_remote())) {
                    ((SimpleDraweeView) baseViewHolder.getView(R.id.vipIcon)).setImageURI(memberInfoBean.getPic_remote());
                }
                baseViewHolder.setText(R.id.vipTitle, memberInfoBean.getTitle());
            }
            baseViewHolder.getView(R.id.buyVip).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.r1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameRecommendAdapter1.this.t(memberInfoBean, view);
                }
            });
        }
        List<GameMainV4DataBean.MemberFunBean> list = (List) commonMultiItemBean.getData();
        if (this.f43139f == null) {
            this.f43139f = new c2(this.f43137d, this.f43138e);
        }
        ((GridView) baseViewHolder.getView(R.id.vipFunc)).setAdapter((ListAdapter) this.f43139f);
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f43139f.d(list);
        this.f43139f.notifyDataSetChanged();
    }

    void m(GameMainV4DataBean.MemberInfoBean memberInfoBean) {
        String str;
        if (memberInfoBean != null) {
            try {
                if (Integer.parseInt(memberInfoBean.getLink_type()) == 4 && memberInfoBean.getLink_type_val() != null && memberInfoBean.getLink_type_val().startsWith(com.facebook.common.util.f.f10923a)) {
                    String link_type_val = memberInfoBean.getLink_type_val();
                    if (link_type_val.contains("?")) {
                        str = link_type_val + "&game_id=" + this.f43138e;
                    } else {
                        str = link_type_val + "?game_id=" + this.f43138e;
                    }
                    memberInfoBean.setLink_type_val(str);
                }
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(Integer.valueOf(memberInfoBean.getLink_type()).intValue());
                intentDateBean.setJump_type(Integer.valueOf(memberInfoBean.getJump_type()).intValue());
                intentDateBean.setLink_type_val(memberInfoBean.getLink_type_val());
                IntentUtil.getInstance().intentActivity(this.f43137d, intentDateBean);
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: n */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        int itemType = commonMultiItemBean.getItemType();
        if (itemType == 0) {
            y(baseViewHolder, commonMultiItemBean);
        } else if (itemType == 1) {
            x(baseViewHolder, commonMultiItemBean);
        } else if (itemType == 2) {
            u(baseViewHolder, commonMultiItemBean);
        } else if (itemType == 3) {
            v(baseViewHolder, commonMultiItemBean);
        } else if (itemType != 4) {
        } else {
            w(baseViewHolder, commonMultiItemBean);
        }
    }

    public String o() {
        return this.f43138e;
    }

    public void setGameId(String str) {
        this.f43138e = str;
    }
}
