package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.GoldFingerBean;
import com.join.mgps.dto.ModGameDetailBean;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.modgame_modtab_fragment_layout)
/* loaded from: classes3.dex */
public class ModgameModTabFragment extends Fragment {
    Context context;
    private int defSelectPos = 0;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_layout;
    private CheatItemAdapter mCheatItemAdapter;
    private CheatTypeAdapter mCheatTypeAdapter;
    ModGameDetailBean modGameDetailBean;
    @ViewById(R.id.rv_cheat_list)
    RecyclerView rv_cheat_list;
    @ViewById(R.id.rv_cheat_type)
    RecyclerView rv_cheat_type;
    @ViewById
    View setNetwork;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class CheatItemAdapter extends BaseQuickAdapter<GoldFingerBean.ContentBean, BaseViewHolder> {
        public CheatItemAdapter() {
            super((int) R.layout.item_mod_chat_item);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, GoldFingerBean.ContentBean contentBean) {
            baseViewHolder.setText(R.id.tv_name, contentBean.getTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class CheatTypeAdapter extends BaseQuickAdapter<GoldFingerBean, BaseViewHolder> {
        public CheatTypeAdapter() {
            super((int) R.layout.item_mod_chat_type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, GoldFingerBean goldFingerBean) {
            baseViewHolder.setText(R.id.tv_name, goldFingerBean.getTitle());
            if (goldFingerBean.isSelected()) {
                baseViewHolder.setTextColor(R.id.tv_name, -1);
                baseViewHolder.setVisible(R.id.iv_line, true);
                return;
            }
            baseViewHolder.setTextColor(R.id.tv_name, Color.parseColor("#C1D0DD"));
            baseViewHolder.setVisible(R.id.iv_line, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initData$0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        ModGameDetailBean modGameDetailBean = this.modGameDetailBean;
        if (modGameDetailBean != null) {
            List<GoldFingerBean> gold_finger = modGameDetailBean.getGold_finger();
            gold_finger.get(this.defSelectPos).setSelected(false);
            this.mCheatTypeAdapter.notifyItemChanged(this.defSelectPos);
            this.defSelectPos = i4;
            gold_finger.get(i4).setSelected(true);
            this.mCheatTypeAdapter.notifyItemChanged(this.defSelectPos);
            if (gold_finger.size() <= 0 || gold_finger.get(this.defSelectPos) == null) {
                return;
            }
            this.mCheatItemAdapter.setNewData(gold_finger.get(this.defSelectPos).getContent());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.context = getActivity();
        initData();
        setData((ModGameDetailBean) getArguments().getSerializable("datas"));
    }

    void initData() {
        if (this.mCheatTypeAdapter == null) {
            this.mCheatTypeAdapter = new CheatTypeAdapter();
            final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp24);
            this.rv_cheat_type.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.cloudarchive.ModgameModTabFragment.1
                @Override // com.join.mgps.base.decoration.UniversalItemDecoration
                public UniversalItemDecoration.b getItemOffsets(int i4) {
                    return aVar;
                }
            });
        }
        this.rv_cheat_type.setAdapter(this.mCheatTypeAdapter);
        if (this.mCheatItemAdapter == null) {
            this.mCheatItemAdapter = new CheatItemAdapter();
        }
        final UniversalItemDecoration.a aVar2 = new UniversalItemDecoration.a();
        aVar2.f46233f = 0;
        aVar2.f46237d = (int) getResources().getDimension(R.dimen.wdp26);
        aVar2.f46234a = (int) getResources().getDimension(R.dimen.wdp24);
        this.rv_cheat_list.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.cloudarchive.ModgameModTabFragment.2
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                return aVar2;
            }
        });
        this.rv_cheat_list.setLayoutManager(new GridLayoutManager(this.context, 2));
        this.rv_cheat_list.setAdapter(this.mCheatItemAdapter);
        this.mCheatTypeAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.cloudarchive.v
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                ModgameModTabFragment.this.lambda$initData$0(baseQuickAdapter, view, i4);
            }
        });
        this.mCheatItemAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.cloudarchive.ModgameModTabFragment.3
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                l2.a(ModgameModTabFragment.this.context).b("增强模式启动游戏即可体验");
            }
        });
    }

    public void setData(ModGameDetailBean modGameDetailBean) {
        this.modGameDetailBean = modGameDetailBean;
        if (modGameDetailBean != null) {
            this.rv_cheat_type.setVisibility(0);
            this.rv_cheat_list.setVisibility(0);
            this.loding_layout.setVisibility(8);
            this.loding_faile.setVisibility(8);
        }
        List<GoldFingerBean> gold_finger = modGameDetailBean.getGold_finger();
        if (gold_finger == null || gold_finger.size() <= 0) {
            return;
        }
        gold_finger.get(this.defSelectPos).setSelected(true);
        this.mCheatTypeAdapter.setNewData(gold_finger);
        if (gold_finger.get(this.defSelectPos) != null) {
            this.mCheatItemAdapter.setNewData(gold_finger.get(this.defSelectPos).getContent());
        }
    }

    public void showLodingFailed() {
        this.loding_layout.setVisibility(8);
        try {
            ModGameDetailBean modGameDetailBean = this.modGameDetailBean;
            if (modGameDetailBean == null || modGameDetailBean.getMod_game_info() == null) {
                this.loding_faile.setVisibility(0);
                if (com.join.android.app.common.utils.j.j(getActivity())) {
                    this.setNetwork.setVisibility(8);
                } else {
                    this.setNetwork.setVisibility(0);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
