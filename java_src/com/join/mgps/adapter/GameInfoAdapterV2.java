package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameInfoBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameInfoAdapterV2 extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    private List<GameInfoBean> f43038a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f43039b;

    /* renamed from: c  reason: collision with root package name */
    private Context f43040c;

    /* renamed from: d  reason: collision with root package name */
    private e f43041d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43042b;

        a(int i4) {
            this.f43042b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInfoAdapterV2.this.f43041d.a(this.f43042b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43044b;

        b(int i4) {
            this.f43044b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInfoAdapterV2.this.f43041d.a(this.f43044b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private View f43046a;

        /* renamed from: b  reason: collision with root package name */
        private View f43047b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f43048c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f43049d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f43050e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f43051f;

        public c(@NonNull View view) {
            super(view);
            this.f43048c = (SimpleDraweeView) view.findViewById(R.id.iv_icon);
            this.f43049d = (TextView) view.findViewById(R.id.tv_gameName);
            this.f43050e = (TextView) view.findViewById(R.id.tv_roomCounts);
            this.f43046a = view.findViewById(R.id.main);
            this.f43047b = view.findViewById(R.id.cover);
            this.f43051f = (TextView) view.findViewById(R.id.romeName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private View f43053a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f43054b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f43055c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f43056d;

        public d(@NonNull View view) {
            super(view);
            this.f43054b = (SimpleDraweeView) view.findViewById(R.id.iv_icon);
            this.f43055c = (TextView) view.findViewById(R.id.tv_gameName);
            this.f43056d = (TextView) view.findViewById(R.id.tv_roomCounts);
            this.f43053a = view.findViewById(R.id.main);
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4);
    }

    /* loaded from: classes4.dex */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f43058a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f43059b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f43060c;

        private f() {
        }
    }

    public GameInfoAdapterV2(Context context, boolean z4) {
        this.f43040c = context;
        this.f43039b = z4;
    }

    public List<GameInfoBean> b() {
        return this.f43038a;
    }

    public void c(int i4, c cVar) {
        GameInfoBean gameInfoBean = this.f43038a.get(i4);
        cVar.f43049d.setText(gameInfoBean.getTitle());
        MyImageLoader.e(cVar.f43048c, R.drawable.bg_gameinfo, gameInfoBean.getPic_remote_vertical(), r.c.f11300g);
        if (gameInfoBean.getRoom_count() == -1) {
            cVar.f43050e.setVisibility(8);
            cVar.f43051f.setVisibility(8);
            cVar.f43049d.setTextColor(-1);
        } else {
            cVar.f43050e.setVisibility(0);
            cVar.f43051f.setVisibility(0);
            cVar.f43049d.setTextColor(-1);
            TextView textView = cVar.f43050e;
            textView.setText(gameInfoBean.getRoom_count() + "");
        }
        cVar.f43047b.setOnClickListener(new a(i4));
    }

    public void d(int i4, d dVar) {
        GameInfoBean gameInfoBean = this.f43038a.get(i4);
        dVar.f43055c.setText(gameInfoBean.getGame_name());
        if (com.join.mgps.Util.g2.i(gameInfoBean.getPic_cover())) {
            SimpleDraweeView simpleDraweeView = dVar.f43054b;
            String pic_cover = gameInfoBean.getPic_cover();
            Context context = this.f43040c;
            MyImageLoader.j(simpleDraweeView, pic_cover, MyImageLoader.E(context, context.getResources().getDimensionPixelOffset(R.dimen.wdp4)));
        } else {
            SimpleDraweeView simpleDraweeView2 = dVar.f43054b;
            String game_ico = gameInfoBean.getGame_ico();
            Context context2 = this.f43040c;
            MyImageLoader.j(simpleDraweeView2, game_ico, MyImageLoader.E(context2, context2.getResources().getDimensionPixelOffset(R.dimen.wdp4)));
        }
        TextView textView = dVar.f43056d;
        textView.setText(gameInfoBean.getRoom_count() + "");
        dVar.f43053a.setOnClickListener(new b(i4));
    }

    public void e(List<GameInfoBean> list) {
        this.f43038a = list;
        notifyDataSetChanged();
    }

    public void f(e eVar) {
        this.f43041d = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<GameInfoBean> list = this.f43038a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return this.f43039b ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        try {
            if (getItemViewType(i4) == 1) {
                c(i4, (c) viewHolder);
            } else {
                d(i4, (d) viewHolder);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        if (i4 == 1) {
            return new c(LayoutInflater.from(this.f43040c).inflate(R.layout.item_gameinfo, viewGroup, false));
        }
        return new d(LayoutInflater.from(this.f43040c).inflate(R.layout.item_gameinfo_1, viewGroup, false));
    }
}
