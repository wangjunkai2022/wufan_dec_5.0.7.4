package com.join.mgps.activity.screenshot;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.activity.screenshot.ScreenShortBigImagActivity_;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.rpc.e;
import com.join.mgps.rpc.impl.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.screenshort_list_fragment_layout)
/* loaded from: classes4.dex */
public class ScreenShortListFragment extends Fragment {
    ScreenShortAdapter adapter;
    List<ScreenShortListItemBean> allItemBeans;
    e client;
    Context context;
    String gameId;
    @ViewById
    LinearLayout loading_none;
    @ViewById
    LinearLayout loding_faile;
    @ViewById
    LinearLayout loding_layout;
    int pn = 1;
    @ViewById
    XRecyclerView recycleView;
    int typeId;

    /* loaded from: classes4.dex */
    class MYHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView image;

        public MYHolder(View view) {
            super(view);
            this.image = (SimpleDraweeView) view.findViewById(R.id.image);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class ScreenShortAdapter extends RecyclerView.Adapter {
        ScreenShortAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ScreenShortListFragment.this.allItemBeans.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i4) {
            MYHolder mYHolder = (MYHolder) viewHolder;
            MyImageLoader.i(mYHolder.image, ScreenShortListFragment.this.allItemBeans.get(i4).getSmallPicPath(), r.c.f11300g);
            mYHolder.image.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortListFragment.ScreenShortAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("datas", (Serializable) ScreenShortListFragment.this.allItemBeans);
                    ((ScreenShortBigImagActivity_.IntentBuilder_) ScreenShortBigImagActivity_.intent(ScreenShortListFragment.this.context).position(i4).pn(ScreenShortListFragment.this.pn).gameId(ScreenShortListFragment.this.gameId).typeId(ScreenShortListFragment.this.typeId).extra("datas", bundle)).start();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            MYHolder mYHolder = new MYHolder(LayoutInflater.from(ScreenShortListFragment.this.context).inflate(R.layout.screenshort_imgs_list_itemlayout, viewGroup, false));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mYHolder.image.getLayoutParams();
            layoutParams.height = layoutParams.width;
            return mYHolder;
        }
    }

    /* loaded from: classes4.dex */
    class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        private int space;

        public SpacesItemDecoration(int i4) {
            this.space = i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i4 = this.space;
            rect.left = i4;
            rect.right = i4;
            rect.bottom = i4;
            rect.top = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.client = d.P1();
        this.context = getActivity();
        this.allItemBeans = new ArrayList();
        Bundle arguments = getArguments();
        this.gameId = arguments.getString("gameId");
        this.typeId = arguments.getInt("typeId");
        this.pn = 1;
        loadListData(1);
        this.adapter = new ScreenShortAdapter();
        this.recycleView.setLayoutManager(new GridLayoutManager(this.context, 2));
        this.recycleView.setAdapter(this.adapter);
        this.recycleView.addItemDecoration(new SpacesItemDecoration(getResources().getDimensionPixelOffset(R.dimen.wdp16)));
        this.recycleView.setLoadingListener(new XRecyclerView.f() { // from class: com.join.mgps.activity.screenshot.ScreenShortListFragment.1
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                ScreenShortListFragment screenShortListFragment = ScreenShortListFragment.this;
                screenShortListFragment.loadListData(screenShortListFragment.pn);
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                ScreenShortListFragment screenShortListFragment = ScreenShortListFragment.this;
                screenShortListFragment.pn = 1;
                screenShortListFragment.loadListData(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadListData(int i4) {
        try {
            ResultMainBean<List<ScreenShortListItemBean>> w4 = this.client.w(RequestBeanUtil.getInstance(this.context).getScreenShortListRequest(this.gameId, i4, this.typeId));
            if (w4 != null && w4.getFlag() == 1) {
                List<ScreenShortListItemBean> data = w4.getMessages().getData();
                if (data != null && data.size() > 0) {
                    updateUi(data);
                } else {
                    showNone();
                }
            } else if (w4 != null && w4.getFlag() == 0) {
                List<ScreenShortListItemBean> data2 = w4.getMessages().getData();
                if (data2 != null && data2.size() == 0) {
                    showNone();
                } else {
                    showError();
                }
            } else {
                showError();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            showError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showError() {
        XRecyclerView xRecyclerView = this.recycleView;
        if (xRecyclerView == null) {
            return;
        }
        xRecyclerView.refreshComplete();
        this.recycleView.loadMoreComplete();
        if (this.allItemBeans.size() == 0) {
            this.loding_layout.setVisibility(8);
            this.recycleView.setVisibility(8);
            this.loding_faile.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showNone() {
        if (this.allItemBeans.size() == 0) {
            this.loding_layout.setVisibility(8);
            this.recycleView.setVisibility(8);
            this.loding_faile.setVisibility(8);
            this.loading_none.setVisibility(0);
            return;
        }
        this.recycleView.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<ScreenShortListItemBean> list) {
        try {
            this.loding_layout.setVisibility(8);
            this.loding_faile.setVisibility(8);
            this.recycleView.setVisibility(0);
            if (this.pn == 1) {
                this.allItemBeans.clear();
            }
            if (list.size() > 0) {
                this.pn++;
            }
            this.allItemBeans.addAll(list);
            this.adapter.notifyDataSetChanged();
            this.recycleView.refreshComplete();
            this.recycleView.loadMoreComplete();
            if (this.allItemBeans.size() < 20) {
                this.recycleView.setNoMore();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
