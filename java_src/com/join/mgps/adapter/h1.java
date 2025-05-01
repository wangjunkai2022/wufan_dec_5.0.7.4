package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameInfoBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameInfoAdapter.java */
/* loaded from: classes4.dex */
public class h1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private List<GameInfoBean> f44414b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44415c;

    /* renamed from: d  reason: collision with root package name */
    private Context f44416d;

    /* compiled from: GameInfoAdapter.java */
    /* loaded from: classes4.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44417a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44418b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44419c;

        private b() {
        }
    }

    public h1(Context context, List<GameInfoBean> list, boolean z4) {
        this.f44414b = new ArrayList();
        this.f44414b = list;
        this.f44416d = context;
        this.f44415c = z4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<GameInfoBean> list = this.f44414b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<GameInfoBean> list = this.f44414b;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            if (this.f44415c) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gameinfo, (ViewGroup) null);
            } else {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gameinfo_1, (ViewGroup) null);
            }
            bVar = new b();
            bVar.f44417a = (SimpleDraweeView) view.findViewById(R.id.iv_icon);
            bVar.f44418b = (TextView) view.findViewById(R.id.tv_gameName);
            bVar.f44419c = (TextView) view.findViewById(R.id.tv_roomCounts);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        GameInfoBean gameInfoBean = this.f44414b.get(i4);
        if (this.f44415c) {
            bVar.f44418b.setText(gameInfoBean.getTitle());
            MyImageLoader.d(bVar.f44417a, R.drawable.iv_default_newarena_item, gameInfoBean.getPic_remote());
        } else {
            bVar.f44418b.setText(gameInfoBean.getGame_name());
            SimpleDraweeView simpleDraweeView = bVar.f44417a;
            String game_ico = gameInfoBean.getGame_ico();
            Context context = this.f44416d;
            MyImageLoader.f(simpleDraweeView, R.drawable.ic_default_list_arena, game_ico, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp14)));
        }
        TextView textView = bVar.f44419c;
        textView.setText(gameInfoBean.getRoom_count() + "");
        return view;
    }
}
