package com.join.mgps.activity.mygame.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonMultiItemBean;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import java.util.List;
/* loaded from: classes4.dex */
public class DetailRecyclerViewChileAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<CommonMultiItemBean> arrayList;
    private Context ctx;
    private String gameId;
    private int position;

    /* loaded from: classes4.dex */
    public class ViewHolder1 extends RecyclerView.ViewHolder {
        private TextView appName;
        private TextView comment;
        private TextView gameScore;
        private MStarBar gameStar;
        private SimpleDraweeView icon;
        private SimpleDraweeView img;
        private View main;
        private TextView scrolNew;
        private TextView tag;

        public ViewHolder1(View view) {
            super(view);
            this.appName = (TextView) view.findViewById(R.id.appName);
            this.gameStar = (MStarBar) view.findViewById(R.id.gameStar);
            this.tag = (TextView) view.findViewById(R.id.tag);
            this.gameScore = (TextView) view.findViewById(R.id.gameScore);
            this.main = view.findViewById(R.id.main);
            this.img = (SimpleDraweeView) view.findViewById(R.id.img);
            this.icon = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.comment = (TextView) view.findViewById(R.id.comment);
            this.scrolNew = (TextView) view.findViewById(R.id.scrolNew);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void setData(int r8) {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.mygame.adapter.DetailRecyclerViewChileAdapter.ViewHolder1.setData(int):void");
        }
    }

    /* loaded from: classes4.dex */
    public class ViewHolder2 extends RecyclerView.ViewHolder {
        private LinearLayout main;
        private SimpleDraweeView sdv_image;

        public ViewHolder2(View view) {
            super(view);
            this.sdv_image = (SimpleDraweeView) view.findViewById(R.id.sdv_image);
            this.main = (LinearLayout) view.findViewById(R.id.main);
        }

        public void setData(int i4) {
            if (DetailRecyclerViewChileAdapter.this.arrayList == null) {
                return;
            }
            final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) ((CommonMultiItemBean) DetailRecyclerViewChileAdapter.this.arrayList.get(i4)).getData();
            MyImageLoader.n(this.sdv_image, commonGameInfoBean.getCoverPicUrl());
            this.main.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.adapter.DetailRecyclerViewChileAdapter.ViewHolder2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
                    intentDataBean.getExtBean().setFrom("4");
                    IntentUtil.getInstance().intentActivity(DetailRecyclerViewChileAdapter.this.ctx, intentDataBean);
                }
            });
        }
    }

    public DetailRecyclerViewChileAdapter(Context context, List<CommonMultiItemBean> list, int i4) {
        this.ctx = context;
        this.arrayList = list;
        this.position = i4;
    }

    IntentDateBean fromSearch(IntentDateBean intentDateBean) {
        ExtBean extBean = new ExtBean();
        int i4 = this.position;
        if (i4 == 0) {
            extBean.setFrom("130");
        } else if (i4 == 2) {
            extBean.setFrom("128");
        } else if (i4 == 3) {
            extBean.setFrom("131");
        }
        intentDateBean.setExtBean(extBean);
        return intentDateBean;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<CommonMultiItemBean> list = this.arrayList;
        if (list == null || list.get(i4) == null) {
            return 0;
        }
        return this.arrayList.get(i4).getItemType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        try {
            if (this.arrayList.get(i4).getItemType() == 2) {
                ((ViewHolder2) viewHolder).setData(i4);
            } else {
                ((ViewHolder1) viewHolder).setData(i4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 == 2) {
            return new ViewHolder2(View.inflate(this.ctx, R.layout.item_down_recommend_ad_1, null));
        }
        return new ViewHolder1(View.inflate(this.ctx, R.layout.detail_guesslike_item, null));
    }

    public void sendPoint(GamedownRecomendItemBean gamedownRecomendItemBean) {
        GamedownRecomendItemBean.RecContext rec_context = gamedownRecomendItemBean.getRec_context();
        if (rec_context == null || gamedownRecomendItemBean.isHasSendData()) {
            return;
        }
        gamedownRecomendItemBean.setHasSendData(true);
        Ext ext = new Ext();
        ext.setRecTid(rec_context.getTid());
        ext.setRecScene(rec_context.getScene());
        ext.setRecPosition(rec_context.getPosition());
        ext.setRecVersion(rec_context.getVersion());
        ext.setGameId(gamedownRecomendItemBean.getGame_id());
        p l4 = p.l(this.ctx);
        Event event = Event.gameRecShow;
        l4.O1(event, ext);
        v0.d("downrecom", event.name() + "  " + rec_context.getTid() + "  " + rec_context.getScene() + "   " + rec_context.getPosition() + "  " + rec_context.getVersion());
    }

    public void setGameId(String str) {
        this.gameId = str;
    }
}
