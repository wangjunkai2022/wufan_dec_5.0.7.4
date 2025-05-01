package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HeaderViewListAdapter.java */
/* loaded from: classes6.dex */
public class b implements WrapperListAdapter, Filterable {

    /* renamed from: g  reason: collision with root package name */
    static final ArrayList<HListView.c> f69511g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ListAdapter f69512b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<HListView.c> f69513c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<HListView.c> f69514d;

    /* renamed from: e  reason: collision with root package name */
    boolean f69515e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f69516f;

    public b(ArrayList<HListView.c> arrayList, ArrayList<HListView.c> arrayList2, ListAdapter listAdapter) {
        this.f69512b = listAdapter;
        this.f69516f = listAdapter instanceof Filterable;
        if (arrayList == null) {
            this.f69513c = f69511g;
        } else {
            this.f69513c = arrayList;
        }
        if (arrayList2 == null) {
            this.f69514d = f69511g;
        } else {
            this.f69514d = arrayList2;
        }
        this.f69515e = a(this.f69513c) && a(this.f69514d);
    }

    private boolean a(ArrayList<HListView.c> arrayList) {
        if (arrayList != null) {
            Iterator<HListView.c> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!it2.next().f69498c) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null) {
            return this.f69515e && listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public int b() {
        return this.f69514d.size();
    }

    public int c() {
        return this.f69513c.size();
    }

    public boolean d(View view) {
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f69514d.size(); i4++) {
            if (this.f69514d.get(i4).f69496a == view) {
                this.f69514d.remove(i4);
                if (a(this.f69513c) && a(this.f69514d)) {
                    z4 = true;
                }
                this.f69515e = z4;
                return true;
            }
        }
        return false;
    }

    public boolean e(View view) {
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f69513c.size(); i4++) {
            if (this.f69513c.get(i4).f69496a == view) {
                this.f69513c.remove(i4);
                if (a(this.f69513c) && a(this.f69514d)) {
                    z4 = true;
                }
                this.f69515e = z4;
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int b5;
        int c5;
        if (this.f69512b != null) {
            b5 = b() + c();
            c5 = this.f69512b.getCount();
        } else {
            b5 = b();
            c5 = c();
        }
        return b5 + c5;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f69516f) {
            return ((Filterable) this.f69512b).getFilter();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        int c5 = c();
        if (i4 < c5) {
            return this.f69513c.get(i4).f69497b;
        }
        int i5 = i4 - c5;
        int i6 = 0;
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null && i5 < (i6 = listAdapter.getCount())) {
            return this.f69512b.getItem(i5);
        }
        return this.f69514d.get(i5 - i6).f69497b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        int i5;
        int c5 = c();
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter == null || i4 < c5 || (i5 = i4 - c5) >= listAdapter.getCount()) {
            return -1L;
        }
        return this.f69512b.getItemId(i5);
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i4) {
        int i5;
        int c5 = c();
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter == null || i4 < c5 || (i5 = i4 - c5) >= listAdapter.getCount()) {
            return -2;
        }
        return this.f69512b.getItemViewType(i5);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int c5 = c();
        if (i4 < c5) {
            return this.f69513c.get(i4).f69496a;
        }
        int i5 = i4 - c5;
        int i6 = 0;
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null && i5 < (i6 = listAdapter.getCount())) {
            return this.f69512b.getView(i5, view, viewGroup);
        }
        return this.f69514d.get(i5 - i6).f69496a;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null) {
            return listAdapter.getViewTypeCount();
        }
        return 1;
    }

    @Override // android.widget.WrapperListAdapter
    public ListAdapter getWrappedAdapter() {
        return this.f69512b;
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null) {
            return listAdapter.hasStableIds();
        }
        return false;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        ListAdapter listAdapter = this.f69512b;
        return listAdapter == null || listAdapter.isEmpty();
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i4) {
        int c5 = c();
        if (i4 < c5) {
            return this.f69513c.get(i4).f69498c;
        }
        int i5 = i4 - c5;
        int i6 = 0;
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null && i5 < (i6 = listAdapter.getCount())) {
            try {
                return this.f69512b.isEnabled(i5);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return this.f69514d.get(i5 - i6).f69498c;
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        ListAdapter listAdapter = this.f69512b;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
