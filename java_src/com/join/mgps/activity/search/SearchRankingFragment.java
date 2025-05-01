package com.join.mgps.activity.search;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.SearchHintActivity;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GameInfoBean;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.search_ranking_fragment_layout)
/* loaded from: classes4.dex */
public class SearchRankingFragment extends Fragment {
    SearchHintActivity activity;
    SearchRankingAdapter adapter;
    SearchHotAdInfo hotAdInfo;
    List<Object> listDatas;
    @ViewById
    RecyclerView recyclerView;
    int hotAdPosition = 999;
    int type = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class SearchRankingAdapter extends RecyclerView.Adapter<SearchRankingHolder> {
        SearchRankingAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<Object> list = SearchRankingFragment.this.listDatas;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull SearchRankingHolder searchRankingHolder, int i4) {
            String str;
            int i5;
            if (SearchRankingFragment.this.listDatas.get(i4) instanceof GameInfoBean) {
                final GameInfoBean gameInfoBean = (GameInfoBean) SearchRankingFragment.this.listDatas.get(i4);
                if (i4 == 0 || (i4 > (i5 = SearchRankingFragment.this.hotAdPosition) && i4 == 1)) {
                    searchRankingHolder.rankingNumberBack.setBackgroundResource(R.drawable.search_rank_first_back);
                } else if (i4 == 1 || (i4 > i5 && i4 == 2)) {
                    searchRankingHolder.rankingNumberBack.setBackgroundResource(R.drawable.search_rank_secend_back);
                } else if (i4 != 2 && (i4 <= i5 || i4 != 3)) {
                    searchRankingHolder.rankingNumberBack.setBackgroundResource(R.drawable.search_rank_normal_back);
                } else {
                    searchRankingHolder.rankingNumberBack.setBackgroundResource(R.drawable.search_rank_thrid_back);
                }
                if (i4 == SearchRankingFragment.this.listDatas.size() - 1) {
                    searchRankingHolder.line.setVisibility(8);
                }
                searchRankingHolder.appName.setText(gameInfoBean.getGame_name());
                MyImageLoader.d(searchRankingHolder.icon, R.drawable.main_normal_icon, gameInfoBean.getGame_ico());
                TextView textView = searchRankingHolder.rankingNumber;
                if (i4 > SearchRankingFragment.this.hotAdPosition) {
                    str = i4 + "";
                } else {
                    str = "" + (i4 + 1);
                }
                textView.setText(str);
                searchRankingHolder.main.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.search.SearchRankingFragment.SearchRankingAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        p l4 = p.l(view.getContext());
                        Event event = Event.clickSearchRankingGame;
                        Ext ext = new Ext();
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        sb.append(SearchRankingFragment.this.type - 1);
                        Ext gameId = ext.setPosition(sb.toString()).setGameId(gameInfoBean.getGame_id());
                        l4.O1(event, gameId.setFrom(SearchRankingFragment.this.type + ""));
                        SearchRankingFragment.this.activity.C0(gameInfoBean.getGame_name(), gameInfoBean.getGame_id());
                    }
                });
                searchRankingHolder.tag.setVisibility(8);
                if (gameInfoBean.isThe_hot()) {
                    searchRankingHolder.tag.setVisibility(0);
                    searchRankingHolder.tag.setText("热");
                    searchRankingHolder.tag.setBackgroundResource(R.drawable.corner_red_strokebg_4);
                    searchRankingHolder.tag.setTextColor(Color.parseColor("#FF7039"));
                } else if (gameInfoBean.isThe_new()) {
                    searchRankingHolder.tag.setVisibility(0);
                    searchRankingHolder.tag.setText("新");
                    searchRankingHolder.tag.setBackgroundResource(R.drawable.corner_yellow_strokebg_4);
                    searchRankingHolder.tag.setTextColor(Color.parseColor("#FF911A"));
                }
            } else if (SearchRankingFragment.this.listDatas.get(i4) instanceof CommonGameInfoBean) {
                final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) SearchRankingFragment.this.listDatas.get(i4);
                searchRankingHolder.rankingNumberBack.setBackgroundResource(R.drawable.ic_search_hot_game_ad);
                if (i4 == SearchRankingFragment.this.listDatas.size() - 1) {
                    searchRankingHolder.line.setVisibility(8);
                }
                searchRankingHolder.appName.setText(commonGameInfoBean.getTitle());
                searchRankingHolder.main.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.search.SearchRankingFragment.SearchRankingAdapter.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IntentUtil.getInstance().intentActivity(SearchRankingFragment.this.activity, commonGameInfoBean.getIntentDataBean());
                        Ext ext = new Ext();
                        ext.setReMarks(SearchRankingFragment.this.hotAdInfo.getJump_ad_info().getTitle());
                        Data data = new Data();
                        data.setWhere(SearchRankingFragment.this.hotAdInfo.getJump_ad_info().getIntentDataBean().getLink_type_val());
                        p.l(SearchRankingFragment.this.activity).T1(Event.hotSearchWordClick, ext, data);
                    }
                });
                searchRankingHolder.tag.setVisibility(0);
                searchRankingHolder.tag.setText("热");
                searchRankingHolder.tag.setBackgroundResource(R.drawable.corner_red_strokebg_4);
                searchRankingHolder.tag.setTextColor(Color.parseColor("#FF7039"));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public SearchRankingHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new SearchRankingHolder(LayoutInflater.from(SearchRankingFragment.this.activity).inflate(R.layout.search_ranking_listitem, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class SearchRankingHolder extends RecyclerView.ViewHolder {
        TextView appName;
        SimpleDraweeView icon;
        View line;
        View main;
        TextView rankingNumber;
        TextView rankingNumberBack;
        TextView tag;

        public SearchRankingHolder(@NonNull View view) {
            super(view);
            this.rankingNumber = (TextView) view.findViewById(R.id.rankingNumber);
            this.rankingNumberBack = (TextView) view.findViewById(R.id.rankingNumberBack);
            this.icon = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.appName = (TextView) view.findViewById(R.id.appName);
            this.tag = (TextView) view.findViewById(R.id.tag);
            this.line = view.findViewById(R.id.line);
            this.main = view.findViewById(R.id.main);
        }
    }

    public static SearchRankingFragment getInstance(int i4) {
        SearchRankingFragment_ searchRankingFragment_ = new SearchRankingFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        searchRankingFragment_.setArguments(bundle);
        return searchRankingFragment_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterVidew() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.type = arguments.getInt("type");
        }
        this.adapter = new SearchRankingAdapter();
        SearchHintActivity searchHintActivity = (SearchHintActivity) getActivity();
        this.activity = searchHintActivity;
        this.recyclerView.setLayoutManager(new LinearLayoutManager(searchHintActivity));
        ArrayList arrayList = new ArrayList();
        this.listDatas = arrayList;
        arrayList.addAll(this.activity.y0(this.type));
        SearchHotAdInfo x02 = this.activity.x0(this.type);
        this.hotAdInfo = x02;
        if (x02 != null && x02.getJump_ad_info() != null) {
            int position = this.hotAdInfo.getPosition();
            this.hotAdPosition = position;
            if (position >= this.listDatas.size()) {
                this.listDatas.add(this.hotAdInfo.getJump_ad_info());
            } else {
                this.listDatas.add(this.hotAdPosition, this.hotAdInfo.getJump_ad_info());
            }
            Ext ext = new Ext();
            ext.setReMarks(this.hotAdInfo.getJump_ad_info().getTitle());
            Data data = new Data();
            data.setWhere(this.hotAdInfo.getJump_ad_info().getIntentDataBean().getLink_type_val());
            p.l(this.activity).T1(Event.hotSearchWordExp, ext, data);
        }
        this.recyclerView.setAdapter(this.adapter);
    }
}
