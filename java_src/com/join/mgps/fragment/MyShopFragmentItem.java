package com.join.mgps.fragment;

import android.app.Fragment;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.shopfragmet_item)
/* loaded from: classes3.dex */
public class MyShopFragmentItem extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f52376b;

    /* renamed from: c  reason: collision with root package name */
    a f52377c;

    /* loaded from: classes3.dex */
    class a extends RecyclerView.Adapter<C0368a> {

        /* renamed from: a  reason: collision with root package name */
        Context f52378a;

        /* renamed from: com.join.mgps.fragment.MyShopFragmentItem$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0368a extends RecyclerView.ViewHolder {
            public C0368a(View view) {
                super(view);
            }
        }

        public a(Context context) {
            this.f52378a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(C0368a c0368a, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public C0368a onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void a() {
        this.f52376b.setLayoutManager(new LinearLayoutManager(getActivity()));
        a aVar = new a(getActivity());
        this.f52377c = aVar;
        this.f52376b.setAdapter(aVar);
    }
}
