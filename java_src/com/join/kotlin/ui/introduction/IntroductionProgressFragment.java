package com.join.kotlin.ui.introduction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.y;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.BbsDetailBean;
import com.join.mgps.dto.CommentAlllistIntentData;
import com.join.mgps.dto.TimingBean;
import com.join.mgps.dto.VideoChaptersBean;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import w1.h;
@EFragment(R.layout.introduction_progress_fragment)
/* loaded from: classes3.dex */
public class IntroductionProgressFragment extends Fragment implements View.OnClickListener {
    private int curSelected = -1;
    private boolean dataChanged = false;
    BbsDetailBean detailBean;
    @ViewById
    LinearLayout ll_empty;
    private ItemAdapter mItemAdapter;
    @ViewById
    RecyclerView rv_list_data;
    @ViewById
    TextView tv_title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ItemAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {
        public ItemAdapter() {
            super((int) R.layout.item_introduction_progress);
        }

        @Override // com.join.mgps.base.BaseQuickAdapter
        protected void convert(BaseViewHolder baseViewHolder, T t4) {
            boolean z4 = t4 instanceof TimingBean;
            int i4 = R.drawable.shape_introduction_progress_selected;
            if (z4) {
                TimingBean timingBean = (TimingBean) t4;
                baseViewHolder.setText(R.id.tv_time, y.h(timingBean.getTime().intValue()));
                baseViewHolder.setText(R.id.tv_title, timingBean.getTitle());
                baseViewHolder.setGone(R.id.tv_type, false);
                if (!timingBean.isChecked()) {
                    i4 = R.drawable.shape_introduction_progress_normal;
                }
                baseViewHolder.setBackgroundRes(R.id.ll_root, i4);
            } else if (t4 instanceof VideoChaptersBean) {
                VideoChaptersBean videoChaptersBean = (VideoChaptersBean) t4;
                baseViewHolder.setText(R.id.tv_time, y.h(videoChaptersBean.getDuration().intValue()));
                baseViewHolder.setText(R.id.tv_title, videoChaptersBean.getTitle());
                baseViewHolder.setGone(R.id.tv_type, true);
                baseViewHolder.setText(R.id.tv_type, "P" + videoChaptersBean.getPage());
                if (!videoChaptersBean.isChecked()) {
                    i4 = R.drawable.shape_introduction_progress_normal;
                }
                baseViewHolder.setBackgroundRes(R.id.ll_root, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$afterView$0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        if (this.curSelected == -1) {
            this.curSelected = i4;
        }
        if (this.mItemAdapter.getItem(this.curSelected) instanceof TimingBean) {
            ((TimingBean) this.mItemAdapter.getItem(this.curSelected)).setChecked(false);
            this.curSelected = i4;
            ((TimingBean) this.mItemAdapter.getItem(i4)).setChecked(true);
            this.mItemAdapter.notifyDataSetChanged();
        } else if (this.mItemAdapter.getItem(this.curSelected) instanceof VideoChaptersBean) {
            ((VideoChaptersBean) this.mItemAdapter.getItem(this.curSelected)).setChecked(false);
            this.curSelected = i4;
            ((VideoChaptersBean) this.mItemAdapter.getItem(i4)).setChecked(true);
            this.mItemAdapter.notifyDataSetChanged();
        }
        if (getActivity() instanceof h) {
            ((h) getActivity()).U(this);
            ((h) getActivity()).G(this.mItemAdapter.getItem(i4));
        }
    }

    public static IntroductionProgressFragment newInstance(CommentAlllistIntentData commentAlllistIntentData) {
        Bundle bundle = new Bundle();
        IntroductionProgressFragment_ introductionProgressFragment_ = new IntroductionProgressFragment_();
        introductionProgressFragment_.setArguments(bundle);
        return introductionProgressFragment_;
    }

    private void updateUI() {
        BbsDetailBean bbsDetailBean = this.detailBean;
        if (bbsDetailBean != null) {
            if (bbsDetailBean.getIsCollection().intValue() == 1) {
                this.tv_title.setText("视频合集");
                if (this.detailBean.getVideoChapters() != null && this.detailBean.getVideoChapters().size() > 0) {
                    this.curSelected = 0;
                    this.detailBean.getVideoChapters().get(this.curSelected).setChecked(true);
                    this.mItemAdapter.setNewData(this.detailBean.getVideoChapters());
                    this.rv_list_data.setVisibility(0);
                    this.ll_empty.setVisibility(8);
                    return;
                }
                this.ll_empty.setVisibility(0);
                this.rv_list_data.setVisibility(8);
                return;
            }
            this.tv_title.setText("剧情进度");
            if (this.detailBean.getTiming() != null && this.detailBean.getTiming().size() > 0) {
                this.mItemAdapter.setNewData(this.detailBean.getTiming());
                this.rv_list_data.setVisibility(0);
                this.ll_empty.setVisibility(8);
                return;
            }
            this.ll_empty.setVisibility(0);
            this.rv_list_data.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.rv_list_data.setLayoutManager(new LinearLayoutManager(getContext()));
        if (this.mItemAdapter == null) {
            this.mItemAdapter = new ItemAdapter();
            final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
            this.rv_list_data.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.introduction.IntroductionProgressFragment.1
                @Override // com.join.mgps.base.decoration.UniversalItemDecoration
                public UniversalItemDecoration.b getItemOffsets(int i4) {
                    return aVar;
                }
            });
            this.mItemAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.kotlin.ui.introduction.a
                @Override // com.join.mgps.base.BaseQuickAdapter.j
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                    IntroductionProgressFragment.this.lambda$afterView$0(baseQuickAdapter, view, i4);
                }
            });
            this.rv_list_data.setAdapter(this.mItemAdapter);
        }
        updateUI();
    }

    public void notifyDataChanged(BbsDetailBean bbsDetailBean) {
        this.dataChanged = this.detailBean.getId() != bbsDetailBean.getId();
        this.detailBean = bbsDetailBean;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_close})
    public void onClockClick() {
        if (getActivity() instanceof h) {
            ((h) getActivity()).U(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!this.dataChanged || z4) {
            return;
        }
        updateUI();
        this.dataChanged = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        view.setOnClickListener(this);
    }

    public void setData(BbsDetailBean bbsDetailBean) {
        this.detailBean = bbsDetailBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(getContext()).b(str);
    }
}
