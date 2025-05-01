package com.join.mgps.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import com.join.mgps.base.BaseViewHolder;
import java.util.List;
import u1.b;
/* loaded from: classes4.dex */
public abstract class BaseMultiItemQuickAdapter<T extends u1.b, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {

    /* renamed from: b  reason: collision with root package name */
    private static final int f46200b = -255;

    /* renamed from: c  reason: collision with root package name */
    public static final int f46201c = -404;

    /* renamed from: a  reason: collision with root package name */
    private SparseIntArray f46202a;

    public BaseMultiItemQuickAdapter(List<T> list) {
        super(list);
    }

    private int b(int i4) {
        return this.f46202a.get(i4, f46201c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i4, @LayoutRes int i5) {
        if (this.f46202a == null) {
            this.f46202a = new SparseIntArray();
        }
        this.f46202a.put(i4, i5);
    }

    public int c(int i4) {
        List<T> data = getData();
        u1.b bVar = (u1.b) getItem(i4);
        if (!isExpandable(bVar)) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (isExpandable((u1.b) data.get(i5))) {
                    return i5;
                }
            }
            return -1;
        }
        u1.a aVar = (u1.a) bVar;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            u1.b bVar2 = (u1.b) data.get(i6);
            if (isExpandable(bVar2) && aVar.i() > ((u1.a) bVar2).i()) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: d */
    public boolean isExpandable(u1.b bVar) {
        return bVar != null && (bVar instanceof u1.a);
    }

    protected void e(u1.a aVar, int i4) {
        List a5;
        if (!aVar.isExpanded() || (a5 = aVar.a()) == null || a5.size() == 0) {
            return;
        }
        int size = a5.size();
        for (int i5 = 0; i5 < size; i5++) {
            remove(i4 + 1);
        }
    }

    protected void f(T t4) {
        u1.a aVar;
        int parentPosition = getParentPosition(t4);
        if (parentPosition < 0 || (aVar = (u1.a) this.mData.get(parentPosition)) == t4) {
            return;
        }
        aVar.a().remove(t4);
    }

    protected void g(@LayoutRes int i4) {
        a(f46200b, i4);
    }

    @Override // com.join.mgps.base.BaseQuickAdapter
    protected int getDefItemViewType(int i4) {
        u1.b bVar = (u1.b) this.mData.get(i4);
        return bVar != null ? bVar.getItemType() : f46200b;
    }

    @Override // com.join.mgps.base.BaseQuickAdapter
    protected K onCreateDefViewHolder(ViewGroup viewGroup, int i4) {
        return createBaseViewHolder(viewGroup, b(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.join.mgps.base.BaseQuickAdapter
    public void remove(@IntRange(from = 0) int i4) {
        List<T> list = this.mData;
        if (list == 0 || i4 < 0 || i4 >= list.size()) {
            return;
        }
        u1.b bVar = (u1.b) this.mData.get(i4);
        if (bVar instanceof u1.a) {
            e((u1.a) bVar, i4);
        }
        f(bVar);
        super.remove(i4);
    }
}
