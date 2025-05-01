package com.beizi.fusion.widget.dialog.dislike;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.beizi.fusion.R;
import com.beizi.fusion.g.as;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DislikeDialog.java */
/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private static h f7333b;

    /* renamed from: a  reason: collision with root package name */
    private List<b> f7334a;

    /* renamed from: c  reason: collision with root package name */
    private int f7335c;

    /* renamed from: d  reason: collision with root package name */
    private int f7336d;

    /* compiled from: DislikeDialog.java */
    /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0202a {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView f7337a;

        /* renamed from: b  reason: collision with root package name */
        private View f7338b;

        /* renamed from: c  reason: collision with root package name */
        private a f7339c;

        /* renamed from: d  reason: collision with root package name */
        private c f7340d;

        public C0202a(Context context) {
            this.f7339c = new a(context, R.style.beizi_custom_dialog);
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.beizi_dislike_dialog, (ViewGroup) null, false);
            this.f7338b = inflate;
            this.f7339c.addContentView(inflate, new ViewGroup.LayoutParams(-1, -2));
            this.f7337a = (RecyclerView) this.f7338b.findViewById(R.id.beizi_dislike_reasons_list_recycleview);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(1);
            this.f7337a.setLayoutManager(linearLayoutManager);
            a.f7333b.a(new e() { // from class: com.beizi.fusion.widget.dialog.dislike.a.a.1
                @Override // com.beizi.fusion.widget.dialog.dislike.a.e
                public void a(View view, int i4) {
                    if (C0202a.this.f7339c != null) {
                        C0202a.this.f7339c.dismiss();
                    }
                    if (C0202a.this.f7340d != null) {
                        C0202a.this.f7340d.a();
                    }
                }
            });
            this.f7337a.setAdapter(a.f7333b);
            WindowManager.LayoutParams attributes = this.f7339c.getWindow().getAttributes();
            Point point = new Point();
            this.f7339c.getWindow().getWindowManager().getDefaultDisplay().getSize(point);
            double d5 = point.x;
            Double.isNaN(d5);
            attributes.width = (int) (d5 * 0.85d);
            attributes.gravity = 17;
            this.f7339c.getWindow().setAttributes(attributes);
        }

        public C0202a a(c cVar) {
            this.f7340d = cVar;
            return this;
        }

        public a a() {
            this.f7339c.setContentView(this.f7338b);
            this.f7339c.setCancelable(true);
            this.f7339c.setCanceledOnTouchOutside(true);
            return this.f7339c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f7342a;

        /* renamed from: b  reason: collision with root package name */
        String f7343b;

        /* renamed from: c  reason: collision with root package name */
        List<d> f7344c;

        b() {
        }

        public List<d> a() {
            return this.f7344c;
        }

        public String b() {
            return this.f7343b;
        }

        public void a(List<d> list) {
            this.f7344c = list;
        }

        public void a(int i4) {
            this.f7342a = i4;
        }

        public void a(String str) {
            this.f7343b = str;
        }
    }

    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        String f7346a;

        d() {
        }

        public String a() {
            return this.f7346a;
        }

        public void a(String str) {
            this.f7346a = str;
        }
    }

    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public interface e {
        void a(View view, int i4);
    }

    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public interface f {
        void a(View view, int i4);
    }

    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    public class g extends RecyclerView.Adapter {

        /* renamed from: b  reason: collision with root package name */
        private List<d> f7349b;

        /* renamed from: c  reason: collision with root package name */
        private Context f7350c;

        /* renamed from: d  reason: collision with root package name */
        private f f7351d;

        /* compiled from: DislikeDialog.java */
        /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0203a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            TextView f7354a;

            public C0203a(View view) {
                super(view);
                this.f7354a = (TextView) view.findViewById(R.id.beizi_dislike_item_multi_two_recycleview_item);
            }
        }

        public g(Context context, List<d> list) {
            this.f7349b = null;
            this.f7350c = context;
            this.f7349b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f7349b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @SuppressLint({"RecyclerView"}) final int i4) {
            C0203a c0203a = (C0203a) viewHolder;
            c0203a.f7354a.setText(this.f7349b.get(i4).a());
            as.a(c0203a.itemView, "#FFFAF6F6", 0, "", 10);
            c0203a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.widget.dialog.dislike.a.g.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (g.this.f7351d != null) {
                        g.this.f7351d.a(view, i4);
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new C0203a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.beizi_dislike_item_multi_two_recycle_item, viewGroup, false));
        }

        public void a(f fVar) {
            this.f7351d = fVar;
        }
    }

    /* compiled from: DislikeDialog.java */
    /* loaded from: classes2.dex */
    class h extends RecyclerView.Adapter {

        /* renamed from: a  reason: collision with root package name */
        public e f7356a;

        /* renamed from: c  reason: collision with root package name */
        private Context f7358c;

        /* renamed from: d  reason: collision with root package name */
        private List<b> f7359d;

        /* compiled from: DislikeDialog.java */
        /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0204a extends RecyclerView.ViewHolder {

            /* renamed from: b  reason: collision with root package name */
            private TextView f7365b;

            public C0204a(View view) {
                super(view);
                this.f7365b = (TextView) view.findViewById(R.id.beizi_dislike_item_multi_one_title);
            }
        }

        /* compiled from: DislikeDialog.java */
        /* loaded from: classes2.dex */
        public class b extends RecyclerView.ViewHolder {

            /* renamed from: b  reason: collision with root package name */
            private TextView f7367b;

            /* renamed from: c  reason: collision with root package name */
            private RecyclerView f7368c;

            public b(View view) {
                super(view);
                this.f7367b = (TextView) view.findViewById(R.id.beizi_dislike_item_multi_two_title);
                this.f7368c = (RecyclerView) view.findViewById(R.id.beizi_dislike_item_multi_two_recycleview);
            }
        }

        public h(Context context, List<b> list) {
            this.f7358c = context;
            this.f7359d = list;
        }

        public void a(e eVar) {
            this.f7356a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f7359d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return (this.f7359d.get(i4).a() == null || this.f7359d.get(i4).a().size() <= 0) ? a.this.f7335c : a.this.f7336d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i4) {
            if (viewHolder instanceof C0204a) {
                ((C0204a) viewHolder).f7365b.setText(this.f7359d.get(i4).b());
            } else {
                b bVar = (b) viewHolder;
                bVar.f7367b.setText(this.f7359d.get(i4).b());
                bVar.f7368c.setLayoutManager(new FlowLayoutManager());
                a aVar = a.this;
                g gVar = new g(aVar.getContext(), this.f7359d.get(i4).a());
                bVar.f7368c.setAdapter(gVar);
                gVar.a(new f() { // from class: com.beizi.fusion.widget.dialog.dislike.a.h.1
                    @Override // com.beizi.fusion.widget.dialog.dislike.a.f
                    public void a(View view, int i5) {
                        e eVar = h.this.f7356a;
                        if (eVar != null) {
                            eVar.a(view, i5);
                        }
                    }
                });
                bVar.f7368c.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.beizi.fusion.widget.dialog.dislike.a.h.2
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                        super.getItemOffsets(rect, view, recyclerView, state);
                        rect.bottom = 30;
                        rect.left = 60;
                    }
                });
            }
            if (this.f7356a != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.widget.dialog.dislike.a.h.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        int layoutPosition = viewHolder.getLayoutPosition();
                        if (a.this.f7336d != h.this.getItemViewType(layoutPosition)) {
                            h.this.f7356a.a(viewHolder.itemView, layoutPosition);
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (i4 == a.this.f7335c) {
                return new C0204a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.beizi_dislike_item_multi_one, viewGroup, false));
            }
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.beizi_dislike_item_multi_two, viewGroup, false));
        }
    }

    public a(@NonNull Context context, int i4) {
        super(context, i4);
        this.f7334a = null;
        this.f7335c = 1;
        this.f7336d = 2;
        List<b> b5 = b();
        this.f7334a = b5;
        f7333b = new h(context, b5);
    }

    private List<b> b() {
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        bVar.a("内容无法正常展示（卡顿、黑白屏）");
        bVar.a(this.f7335c);
        arrayList.add(bVar);
        b bVar2 = new b();
        bVar2.a("不感兴趣");
        bVar2.a(this.f7335c);
        arrayList.add(bVar2);
        b bVar3 = new b();
        bVar3.a("无法关闭");
        bVar3.a(this.f7335c);
        arrayList.add(bVar3);
        ArrayList arrayList2 = new ArrayList();
        d dVar = new d();
        dVar.a("疑似抄袭");
        arrayList2.add(dVar);
        d dVar2 = new d();
        dVar2.a("虚假欺诈");
        arrayList2.add(dVar2);
        d dVar3 = new d();
        dVar3.a("违法违规");
        arrayList2.add(dVar3);
        d dVar4 = new d();
        dVar4.a("低俗色情");
        arrayList2.add(dVar4);
        b bVar4 = new b();
        bVar4.a("举报广告");
        bVar4.a(arrayList2);
        bVar4.a(this.f7335c);
        arrayList.add(bVar4);
        return arrayList;
    }
}
