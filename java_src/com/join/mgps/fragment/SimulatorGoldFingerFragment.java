package com.join.mgps.fragment;

import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_simulator_gold_finger)
/* loaded from: classes3.dex */
public class SimulatorGoldFingerFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f52934b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f52935c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    NestedScrollView f52936d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f52937e;

    /* loaded from: classes3.dex */
    class a extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f52938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f52939b;

        a(UniversalItemDecoration.a aVar, UniversalItemDecoration.a aVar2) {
            this.f52938a = aVar;
            this.f52939b = aVar2;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return i4 % 2 == 0 ? this.f52938a : this.f52939b;
        }
    }

    /* loaded from: classes3.dex */
    class b extends BaseQuickAdapter<String, BaseViewHolder> {
        public b() {
            super(R.layout.item_simulator_gold_finger, SimulatorGoldFingerFragment.this.f52937e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R.id.tvGoldFinger, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        if (getArguments() != null) {
            this.f52937e = (ArrayList) getArguments().getSerializable("contents");
        }
        ArrayList<String> arrayList = this.f52937e;
        if (arrayList != null && arrayList.size() > 0) {
            this.f52936d.setVisibility(8);
            this.f52935c.setVisibility(8);
            this.f52934b.setVisibility(0);
        } else {
            this.f52936d.setVisibility(0);
            this.f52935c.setVisibility(0);
            this.f52934b.setVisibility(8);
        }
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46235b = (int) getResources().getDimension(R.dimen.wdp8);
        aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
        UniversalItemDecoration.a aVar2 = new UniversalItemDecoration.a();
        aVar2.f46233f = 0;
        aVar2.f46234a = (int) getResources().getDimension(R.dimen.wdp8);
        aVar2.f46237d = (int) getResources().getDimension(R.dimen.wdp20);
        this.f52934b.addItemDecoration(new a(aVar, aVar2));
        this.f52934b.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f52934b.setAdapter(new b());
    }
}
