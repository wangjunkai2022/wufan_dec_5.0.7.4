package com.join.mgps.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameLevelBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FriendGameLevelAdapter.java */
/* loaded from: classes4.dex */
public class u extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private final Context f45849b;

    /* renamed from: c  reason: collision with root package name */
    private List<GameLevelBean> f45850c = new ArrayList();

    /* compiled from: FriendGameLevelAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f45851a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f45852b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45853c;

        a() {
        }
    }

    public u(Context context) {
        this.f45849b = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public GameLevelBean getItem(int i4) {
        return this.f45850c.get(i4);
    }

    public <E> List<GameLevelBean> b() {
        return this.f45850c;
    }

    public void c(List<GameLevelBean> list) {
        this.f45850c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45850c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f45849b).inflate(R.layout.item_game_level_card, viewGroup, false);
            aVar.f45851a = (SimpleDraweeView) view2.findViewById(R.id.ic);
            aVar.f45852b = (TextView) view2.findViewById(R.id.name);
            aVar.f45853c = (TextView) view2.findViewById(R.id.level);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        GameLevelBean item = getItem(i4);
        if (TextUtils.isEmpty(item.getSrc())) {
            int level = item.getLevel();
            MyImageLoader.d(aVar.f45851a, level == 5 ? R.drawable.gameleve5 : level == 4 ? R.drawable.gameleve4 : level == 3 ? R.drawable.gameleve2 : level == 2 ? R.drawable.gameleve3 : R.drawable.gameleve1, "");
        } else {
            MyImageLoader.h(aVar.f45851a, item.getSrc());
        }
        aVar.f45852b.setText(item.getGameName());
        aVar.f45853c.setText(item.getLevelName());
        return view2;
    }
}
