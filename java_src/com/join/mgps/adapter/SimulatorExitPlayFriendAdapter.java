package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.FriendBackGameRspBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.SimulatorExitListBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.qq.e.ads.nativ.NativeExpressADView;
import java.util.HashMap;
/* loaded from: classes4.dex */
public class SimulatorExitPlayFriendAdapter<T> extends BaseMultiItemQuickAdapter<SimulatorExitListBean<T>, BaseViewHolder> {

    /* renamed from: g  reason: collision with root package name */
    public static final int f44084g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f44085h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f44086i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f44087j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f44088k = 5;

    /* renamed from: d  reason: collision with root package name */
    Context f44089d;

    /* renamed from: e  reason: collision with root package name */
    private a f44090e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Object, Integer> f44091f;

    /* loaded from: classes4.dex */
    public interface a {
        void e(int i4);

        void f(int i4);
    }

    /* loaded from: classes4.dex */
    class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44092a;

        public b(@NonNull View view) {
            super(view);
            this.f44092a = (SimpleDraweeView) view.findViewById(R.id.img);
        }
    }

    public SimulatorExitPlayFriendAdapter(Context context) {
        super(null);
        this.f44091f = new HashMap<>();
        this.f44089d = context;
        a(1, R.layout.simulator_exit_item);
        a(2, R.layout.simulator_exit_friend_item);
        a(3, R.layout.item_info_stream_ad_gdt);
        a(4, R.layout.item_info_stream_ad_tt);
        a(5, R.layout.simulator_exit_domain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(DomainInfoBean domainInfoBean, View view) {
        UtilsMy.h4(this.f44089d, domainInfoBean.getInfo(), "simulato_game_out");
        com.papa.sim.statistic.p.l(this.f44089d).O1(Event.pdSimulatorOutClick, new Ext().setGameId(domainInfoBean.getGameId()).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(FriendBackGameRspBean.FriendInfo friendInfo, View view) {
        a aVar = this.f44090e;
        if (aVar != null) {
            aVar.e(friendInfo.getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(FriendBackGameRspBean.FriendInfo friendInfo, View view) {
        a aVar = this.f44090e;
        if (aVar != null) {
            aVar.f(friendInfo.getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(GamedetialModleFourBean gamedetialModleFourBean, View view) {
        IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gamedetialModleFourBean.getCrc_sign_id(), gamedetialModleFourBean.getGame_info_tpl_type(), gamedetialModleFourBean.getSp_tpl_two_position(), 13101);
    }

    private void r(BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        final DomainInfoBean domainInfoBean = (DomainInfoBean) simulatorExitListBean.getData();
        if (domainInfoBean == null) {
            return;
        }
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.img), domainInfoBean.getPic());
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.q5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulatorExitPlayFriendAdapter.this.n(domainInfoBean, view);
            }
        });
    }

    private void s(BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        final FriendBackGameRspBean.FriendInfo friendInfo = (FriendBackGameRspBean.FriendInfo) simulatorExitListBean.getData();
        if (baseViewHolder.getLayoutPosition() == 0) {
            baseViewHolder.setGone(R.id.ml, true);
            baseViewHolder.setGone(R.id.divider, false);
            baseViewHolder.setGone(R.id.mr, false);
        } else if (baseViewHolder.getLayoutPosition() == getItemCount() - 1) {
            baseViewHolder.setGone(R.id.ml, false);
            baseViewHolder.setGone(R.id.divider, true);
            baseViewHolder.setGone(R.id.mr, true);
        } else {
            baseViewHolder.setGone(R.id.ml, false);
            baseViewHolder.setGone(R.id.divider, true);
            baseViewHolder.setGone(R.id.mr, false);
        }
        y(baseViewHolder.getView(R.id.icLevel1Bg), (ImageView) baseViewHolder.getView(R.id.icLevel1), friendInfo.getLevel());
        MyImageLoader.x((SimpleDraweeView) baseViewHolder.getView(R.id.avatar), friendInfo.getAvatar());
        baseViewHolder.setText(R.id.name, friendInfo.getNickName());
        baseViewHolder.setText(R.id.label, friendInfo.getLevelName());
        baseViewHolder.setGone(R.id.vip, friendInfo.isVip());
        if (friendInfo.getMemberTitle() != null) {
            try {
                if (!TextUtils.isEmpty(friendInfo.getMemberTitle().getBattleColor())) {
                    baseViewHolder.setTextColor(R.id.label, Color.parseColor(friendInfo.getMemberTitle().getBattleColor()));
                } else {
                    baseViewHolder.setTextColor(R.id.label, Color.parseColor("#FFFFB543"));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            baseViewHolder.setText(R.id.label, friendInfo.getMemberTitle().getBattleTitle());
        }
        TextView textView = (TextView) baseViewHolder.getView(R.id.btn);
        if (!friendInfo.isAddFriendStatus() && !friendInfo.isSendFriendRequestStatus()) {
            textView.setVisibility(4);
            textView.setOnClickListener(null);
        } else {
            textView.setSelected(friendInfo.isSendFriendRequestStatus());
            if (friendInfo.isSendFriendRequestStatus()) {
                textView.setText("已发送");
                textView.setOnClickListener(null);
            } else {
                textView.setText("添加好友");
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.r5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimulatorExitPlayFriendAdapter.this.o(friendInfo, view);
                    }
                });
            }
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.like);
        if (friendInfo.isLikeStatus()) {
            imageView.setBackgroundResource(R.drawable.like_eixt_gray);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.s5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimulatorExitPlayFriendAdapter.this.p(friendInfo, view);
                }
            });
            return;
        }
        imageView.setBackgroundResource(R.drawable.like_eixt_yellow);
        imageView.setOnClickListener(null);
    }

    private void t(BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        try {
            NativeExpressADView nativeExpressADView = (NativeExpressADView) simulatorExitListBean.getData();
            ViewGroup viewGroup = (ViewGroup) baseViewHolder.getView(R.id.express_ad_container);
            this.f44091f.put(nativeExpressADView, Integer.valueOf(baseViewHolder.getLayoutPosition()));
            viewGroup.removeAllViews();
            if (nativeExpressADView.getParent() != null) {
                ((ViewGroup) nativeExpressADView.getParent()).removeView(nativeExpressADView);
            }
            viewGroup.addView(nativeExpressADView);
            viewGroup.setBackgroundResource(R.drawable.bg_ad_item);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void u(BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        final GamedetialModleFourBean gamedetialModleFourBean = (GamedetialModleFourBean) simulatorExitListBean.getData();
        int layoutPosition = baseViewHolder.getLayoutPosition();
        if (!TextUtils.isEmpty(gamedetialModleFourBean.getRecommend_game_big_gif()) && layoutPosition == 0) {
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.img), gamedetialModleFourBean.getRecommend_game_big_gif());
        } else if (!TextUtils.isEmpty(gamedetialModleFourBean.getRecommend_game_big_pic()) && (layoutPosition == 0 || layoutPosition == 1 || layoutPosition == 2 || layoutPosition == 3)) {
            MyImageLoader.e((SimpleDraweeView) baseViewHolder.getView(R.id.img), R.drawable.main_normal_icon, gamedetialModleFourBean.getRecommend_game_big_pic(), r.c.f11300g);
        } else if (gamedetialModleFourBean.getPic_info() != null && gamedetialModleFourBean.getPic_info().size() > 0 && gamedetialModleFourBean.getPic_info().get(0).getRemote() != null) {
            MyImageLoader.e((SimpleDraweeView) baseViewHolder.getView(R.id.img), R.drawable.main_normal_icon, gamedetialModleFourBean.getPic_info().get(0).getRemote().getPath(), r.c.f11300g);
        }
        baseViewHolder.setText(R.id.name, gamedetialModleFourBean.getGame_name());
        baseViewHolder.setText(R.id.score, gamedetialModleFourBean.getScore());
        baseViewHolder.getView(R.id.rect).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.t5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulatorExitPlayFriendAdapter.q(GamedetialModleFourBean.this, view);
            }
        });
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.tagLayout);
        linearLayout.removeAllViews();
        if (gamedetialModleFourBean.getTag_info() != null) {
            for (int i4 = 0; i4 < gamedetialModleFourBean.getTag_info().size() && i4 <= 2; i4++) {
                linearLayout.addView(A(gamedetialModleFourBean.getTag_info().get(i4).getName()));
            }
        }
        if (layoutPosition == 0) {
            baseViewHolder.setGone(R.id.ml, true);
            baseViewHolder.setGone(R.id.divider, false);
            baseViewHolder.setGone(R.id.mr, false);
        } else if (layoutPosition == getItemCount() - 1) {
            baseViewHolder.setGone(R.id.ml, false);
            baseViewHolder.setGone(R.id.divider, true);
            baseViewHolder.setGone(R.id.mr, true);
        } else {
            baseViewHolder.setGone(R.id.ml, false);
            baseViewHolder.setGone(R.id.divider, true);
            baseViewHolder.setGone(R.id.mr, false);
        }
    }

    private void v(BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        ViewGroup viewGroup = (ViewGroup) baseViewHolder.getView(R.id.express_ad_container);
        try {
            View view = (View) simulatorExitListBean.getData();
            this.f44091f.put(view, Integer.valueOf(baseViewHolder.getLayoutPosition()));
            if (view != null) {
                viewGroup.removeAllViews();
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                viewGroup.addView(view);
                viewGroup.setBackgroundResource(R.drawable.bg_ad_item);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    View A(String str) {
        TextView textView = new TextView(this.f44089d);
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextColor(Color.parseColor("#FFA8A8A8"));
        textView.setTextSize(0, this.f44089d.getResources().getDimensionPixelSize(R.dimen.wdp20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, this.f44089d.getResources().getDimensionPixelOffset(R.dimen.wdp10), 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // com.join.mgps.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        SimulatorExitListBean simulatorExitListBean = (SimulatorExitListBean) getItem(i4);
        if (simulatorExitListBean != null) {
            return simulatorExitListBean.getItemType();
        }
        return super.getItemViewType(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: l */
    public void convert(@NonNull BaseViewHolder baseViewHolder, SimulatorExitListBean<T> simulatorExitListBean) {
        int itemType = simulatorExitListBean.getItemType();
        if (itemType == 1) {
            u(baseViewHolder, simulatorExitListBean);
        } else if (itemType == 2) {
            s(baseViewHolder, simulatorExitListBean);
        } else if (itemType == 3) {
            t(baseViewHolder, simulatorExitListBean);
        } else if (itemType == 4) {
            v(baseViewHolder, simulatorExitListBean);
        } else if (itemType != 5) {
        } else {
            r(baseViewHolder, simulatorExitListBean);
        }
    }

    public a m() {
        return this.f44090e;
    }

    public void w(NativeExpressADView nativeExpressADView) {
        int intValue = this.f44091f.remove(nativeExpressADView).intValue();
        remove(intValue);
        notifyItemRemoved(intValue);
        if (nativeExpressADView != null) {
            nativeExpressADView.destroy();
        }
    }

    public void x(TTNativeExpressAd tTNativeExpressAd) {
        int intValue = this.f44091f.remove(tTNativeExpressAd.getExpressAdView()).intValue();
        remove(intValue);
        notifyItemRemoved(intValue);
        tTNativeExpressAd.destroy();
    }

    void y(View view, ImageView imageView, int i4) {
        if (i4 > 0 && i4 < 7) {
            imageView.setVisibility(0);
            view.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            view.setVisibility(8);
        }
        switch (i4) {
            case 1:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_trainee);
                view.setBackgroundResource(R.drawable.bg_border_yellow);
                return;
            case 2:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_senior);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_senior_bg);
                return;
            case 3:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_elite);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_elite_bg);
                return;
            case 4:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_master);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_master_bg);
                return;
            case 5:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_legend);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_legend_bg);
                return;
            case 6:
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest_bg);
                return;
            default:
                imageView.setVisibility(8);
                view.setVisibility(8);
                return;
        }
    }

    public void z(a aVar) {
        this.f44090e = aVar;
    }
}
