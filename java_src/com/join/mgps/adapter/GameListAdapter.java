package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.SimpleWrapperRoom;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CountDownerTextView;
import com.join.mgps.customview.VipView;
import java.util.List;
/* loaded from: classes4.dex */
public class GameListAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    private List<SimpleWrapperRoom> f43061a;

    /* renamed from: b  reason: collision with root package name */
    private Context f43062b;

    /* renamed from: c  reason: collision with root package name */
    private float f43063c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    b f43064d = null;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f43080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43081c;

        a(RecyclerView.ViewHolder viewHolder, int i4) {
            this.f43080b = viewHolder;
            this.f43081c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = GameListAdapter.this.f43064d;
            if (bVar != null) {
                bVar.a(this.f43080b, this.f43081c);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(RecyclerView.ViewHolder viewHolder, int i4);
    }

    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public View f43083a;

        /* renamed from: b  reason: collision with root package name */
        public View f43084b;

        /* renamed from: c  reason: collision with root package name */
        public View f43085c;

        /* renamed from: d  reason: collision with root package name */
        public View f43086d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43087e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f43088f;

        /* renamed from: g  reason: collision with root package name */
        public SimpleDraweeView f43089g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f43090h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f43091i;

        /* renamed from: j  reason: collision with root package name */
        public VipView f43092j;

        /* renamed from: k  reason: collision with root package name */
        public ImageView f43093k;

        /* renamed from: l  reason: collision with root package name */
        public View f43094l;
    }

    public GameListAdapter(Context context, List<SimpleWrapperRoom> list) {
        this.f43062b = context;
        this.f43061a = list;
    }

    private void a(c cVar) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar.f43084b.getLayoutParams();
        float dimensionPixelOffset = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp86);
        float f5 = this.f43063c;
        layoutParams.height = (int) (dimensionPixelOffset * f5);
        layoutParams.width = (int) (dimensionPixelOffset * f5);
        cVar.f43084b.setLayoutParams(layoutParams);
        cVar.f43087e.setTextSize(0, c(R.dimen.wdp20) * this.f43063c * 0.92f);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cVar.f43092j.getLayoutParams();
        float dimensionPixelOffset2 = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp20);
        VipView vipView = cVar.f43092j;
        float f6 = this.f43063c;
        vipView.setSize((int) (dimensionPixelOffset2 * f6), (int) (dimensionPixelOffset2 * f6));
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) cVar.f43093k.getLayoutParams();
        float dimensionPixelOffset3 = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp20);
        float f7 = this.f43063c;
        layoutParams3.height = (int) (dimensionPixelOffset3 * f7);
        layoutParams3.width = (int) (dimensionPixelOffset3 * f7);
        cVar.f43093k.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) cVar.f43085c.getLayoutParams();
        float dimensionPixelOffset4 = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp10);
        float f8 = this.f43063c;
        layoutParams4.bottomMargin = (int) (dimensionPixelOffset4 * f8 * 0.92f);
        layoutParams4.topMargin = (int) (dimensionPixelOffset4 * f8 * 0.92f);
        layoutParams4.leftMargin = (int) (dimensionPixelOffset4 * f8 * 0.92f);
        layoutParams4.rightMargin = (int) (dimensionPixelOffset4 * f8 * 0.92f);
        cVar.f43085c.setLayoutParams(layoutParams4);
    }

    private void b(ViewHolder viewHolder) {
        viewHolder.f43067c.setTextSize(0, c(R.dimen.wdp24) * this.f43063c * 0.92f);
        viewHolder.f43072h.setTextSize(0, c(R.dimen.wdp20) * this.f43063c * 0.92f);
        viewHolder.f43071g.setTextSize(0, c(R.dimen.wdp20) * this.f43063c * 0.92f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewHolder.f43077m.getLayoutParams();
        float dimensionPixelOffset = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp22);
        float f5 = this.f43063c;
        layoutParams.height = (int) (dimensionPixelOffset * f5);
        layoutParams.width = (int) (dimensionPixelOffset * f5);
        viewHolder.f43077m.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewHolder.f43078n.getLayoutParams();
        float dimensionPixelOffset2 = this.f43062b.getResources().getDimensionPixelOffset(R.dimen.wdp24);
        float f6 = this.f43063c;
        layoutParams2.height = (int) (dimensionPixelOffset2 * f6);
        layoutParams2.width = (int) (dimensionPixelOffset2 * f6);
        viewHolder.f43078n.setLayoutParams(layoutParams2);
    }

    private float c(int i4) {
        return this.f43062b.getResources().getDimensionPixelOffset(i4);
    }

    private void g(ImageView imageView, View view, int i4) {
        view.setVisibility(0);
        switch (i4) {
            case 1:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_trainee);
                view.setBackgroundResource(R.drawable.bg_border_yellow);
                return;
            case 2:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_senior);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_senior_bg);
                return;
            case 3:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_elite);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_elite_bg);
                return;
            case 4:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_master);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_master_bg);
                return;
            case 5:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_legend);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_legend_bg);
                return;
            case 6:
                imageView.setVisibility(0);
                imageView.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_special_guest_bg);
                return;
            default:
                imageView.setVisibility(8);
                view.setBackgroundResource(R.drawable.mg_proficiency_level_0_bg);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(com.join.mgps.adapter.GameListAdapter.ViewHolder r17, app.mgsim.arena.SimpleWrapperRoom r18) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.GameListAdapter.i(com.join.mgps.adapter.GameListAdapter$ViewHolder, app.mgsim.arena.SimpleWrapperRoom):void");
    }

    private void j(View view, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (int) (this.f43062b.getResources().getDimensionPixelOffset(i4) * this.f43063c * 0.92f);
        view.setLayoutParams(layoutParams);
    }

    public SimpleWrapperRoom d(int i4) {
        if (i4 < 0 || i4 >= this.f43061a.size()) {
            return null;
        }
        return this.f43061a.get(i4);
    }

    public b e() {
        return this.f43064d;
    }

    public void f(b bVar) {
        this.f43064d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SimpleWrapperRoom> list = this.f43061a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return super.getItemViewType(i4);
    }

    public void h(float f5) {
        if (f5 > 1.25d) {
            f5 *= 0.92f;
        }
        this.f43063c = f5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        SimpleWrapperRoom simpleWrapperRoom = this.f43061a.get(i4);
        if (viewHolder instanceof ViewHolder) {
            i((ViewHolder) viewHolder, simpleWrapperRoom);
        }
        viewHolder.itemView.setOnClickListener(new a(viewHolder, i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_room_list_1, (ViewGroup) null), i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof ViewHolder) {
            ((ViewHolder) viewHolder).f43071g.e();
        }
    }

    /* loaded from: classes4.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public int f43065a;

        /* renamed from: b  reason: collision with root package name */
        public int f43066b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43067c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f43068d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f43069e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f43070f;

        /* renamed from: g  reason: collision with root package name */
        public CountDownerTextView f43071g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f43072h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f43073i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f43074j;

        /* renamed from: k  reason: collision with root package name */
        public View f43075k;

        /* renamed from: l  reason: collision with root package name */
        public VipView f43076l;

        /* renamed from: m  reason: collision with root package name */
        public View f43077m;

        /* renamed from: n  reason: collision with root package name */
        public View f43078n;

        /* renamed from: o  reason: collision with root package name */
        c[] f43079o;

        public ViewHolder(View view, int i4) {
            super(view);
            this.f43066b = i4;
            b(view);
        }

        void a(View view, View view2, TextView textView, View view3, int i4) {
            View findViewById = view.findViewById(R.id.borderView);
            c cVar = new c();
            cVar.f43083a = view;
            cVar.f43085c = (RelativeLayout) view.findViewById(R.id.pMain);
            cVar.f43084b = view2;
            cVar.f43089g = (SimpleDraweeView) view2.findViewById(R.id.avatar);
            cVar.f43088f = (ImageView) view2.findViewById(R.id.tv_chenghao);
            cVar.f43090h = (ImageView) view2.findViewById(R.id.iv_state);
            cVar.f43087e = textView;
            cVar.f43091i = (ImageView) view2.findViewById(R.id.platformType);
            cVar.f43086d = view3;
            cVar.f43092j = (VipView) view.findViewById(R.id.vipView);
            cVar.f43093k = (ImageView) view.findViewById(R.id.ivProficiencyLevel);
            cVar.f43094l = findViewById;
            this.f43079o[i4] = cVar;
        }

        void b(View view) {
            this.f43067c = (TextView) view.findViewById(R.id.tv_gameName);
            this.f43068d = (ImageView) view.findViewById(R.id.iv_lock);
            this.f43069e = (ImageView) view.findViewById(R.id.iv_vip);
            this.f43070f = (TextView) view.findViewById(R.id.tv_id);
            this.f43073i = (TextView) view.findViewById(R.id.tv_id_label);
            this.f43071g = (CountDownerTextView) view.findViewById(R.id.tv_game_state);
            this.f43072h = (TextView) view.findViewById(R.id.tv_view);
            this.f43074j = (TextView) view.findViewById(R.id.tvCopper);
            this.f43075k = view.findViewById(R.id.waveView);
            this.f43076l = (VipView) view.findViewById(R.id.vipView);
            TextView textView = (TextView) view.findViewById(R.id.nickNameP1);
            TextView textView2 = (TextView) view.findViewById(R.id.nickNameP2);
            TextView textView3 = (TextView) view.findViewById(R.id.nickNameP3);
            TextView textView4 = (TextView) view.findViewById(R.id.nickNameP4);
            View findViewById = view.findViewById(R.id.llP1);
            View findViewById2 = view.findViewById(R.id.llP2);
            View findViewById3 = view.findViewById(R.id.llP3);
            View findViewById4 = view.findViewById(R.id.llP4);
            View findViewById5 = view.findViewById(R.id.f15610p1);
            View findViewById6 = view.findViewById(R.id.f15611p2);
            View findViewById7 = view.findViewById(R.id.f15612p3);
            View findViewById8 = view.findViewById(R.id.p4);
            this.f43077m = view.findViewById(R.id.tv2);
            this.f43078n = view.findViewById(R.id.tv3);
            this.f43079o = new c[4];
            a(findViewById, findViewById5, textView, new View(view.getContext()), 0);
            a(findViewById2, findViewById6, textView2, null, 1);
            a(findViewById3, findViewById7, textView3, null, 2);
            a(findViewById4, findViewById8, textView4, null, 3);
            view.setTag(this);
        }

        public ViewHolder(View view) {
            super(view);
            b(view);
        }
    }
}
