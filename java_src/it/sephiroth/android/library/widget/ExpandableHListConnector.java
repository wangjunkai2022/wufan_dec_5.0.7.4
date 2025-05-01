package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.HeterogeneousExpandableList;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes6.dex */
class ExpandableHListConnector extends BaseAdapter implements Filterable {

    /* renamed from: b  reason: collision with root package name */
    private ExpandableListAdapter f69458b;

    /* renamed from: d  reason: collision with root package name */
    private int f69460d;

    /* renamed from: e  reason: collision with root package name */
    private int f69461e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private final DataSetObserver f69462f = new a();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<GroupMetadata> f69459c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class GroupMetadata implements Parcelable, Comparable<GroupMetadata> {
        public static final Parcelable.Creator<GroupMetadata> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        static final int f69463f = -1;

        /* renamed from: b  reason: collision with root package name */
        int f69464b;

        /* renamed from: c  reason: collision with root package name */
        int f69465c;

        /* renamed from: d  reason: collision with root package name */
        int f69466d;

        /* renamed from: e  reason: collision with root package name */
        long f69467e;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<GroupMetadata> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public GroupMetadata createFromParcel(Parcel parcel) {
                return GroupMetadata.e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public GroupMetadata[] newArray(int i4) {
                return new GroupMetadata[i4];
            }
        }

        private GroupMetadata() {
        }

        static GroupMetadata e(int i4, int i5, int i6, long j4) {
            GroupMetadata groupMetadata = new GroupMetadata();
            groupMetadata.f69464b = i4;
            groupMetadata.f69465c = i5;
            groupMetadata.f69466d = i6;
            groupMetadata.f69467e = j4;
            return groupMetadata;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(GroupMetadata groupMetadata) {
            if (groupMetadata != null) {
                return this.f69466d - groupMetadata.f69466d;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f69464b);
            parcel.writeInt(this.f69465c);
            parcel.writeInt(this.f69466d);
            parcel.writeLong(this.f69467e);
        }
    }

    /* loaded from: classes6.dex */
    protected class a extends DataSetObserver {
        protected a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ExpandableHListConnector.this.l(true, true);
            ExpandableHListConnector.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ExpandableHListConnector.this.l(true, true);
            ExpandableHListConnector.this.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: d  reason: collision with root package name */
        private static final int f69469d = 5;

        /* renamed from: e  reason: collision with root package name */
        private static ArrayList<b> f69470e = new ArrayList<>(5);

        /* renamed from: a  reason: collision with root package name */
        public it.sephiroth.android.library.widget.a f69471a;

        /* renamed from: b  reason: collision with root package name */
        public GroupMetadata f69472b;

        /* renamed from: c  reason: collision with root package name */
        public int f69473c;

        private b() {
        }

        private static b a() {
            synchronized (f69470e) {
                if (f69470e.size() > 0) {
                    b remove = f69470e.remove(0);
                    remove.e();
                    return remove;
                }
                return new b();
            }
        }

        static b c(int i4, int i5, int i6, int i7, GroupMetadata groupMetadata, int i8) {
            b a5 = a();
            a5.f69471a = it.sephiroth.android.library.widget.a.c(i5, i6, i7, i4);
            a5.f69472b = groupMetadata;
            a5.f69473c = i8;
            return a5;
        }

        private void e() {
            it.sephiroth.android.library.widget.a aVar = this.f69471a;
            if (aVar != null) {
                aVar.g();
                this.f69471a = null;
            }
            this.f69472b = null;
            this.f69473c = 0;
        }

        public boolean b() {
            return this.f69472b != null;
        }

        public void d() {
            e();
            synchronized (f69470e) {
                if (f69470e.size() < 5) {
                    f69470e.add(this);
                }
            }
        }
    }

    public ExpandableHListConnector(ExpandableListAdapter expandableListAdapter) {
        m(expandableListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z4, boolean z5) {
        int childrenCount;
        ArrayList<GroupMetadata> arrayList = this.f69459c;
        int size = arrayList.size();
        int i4 = 0;
        this.f69460d = 0;
        if (z5) {
            boolean z6 = false;
            for (int i5 = size - 1; i5 >= 0; i5--) {
                GroupMetadata groupMetadata = arrayList.get(i5);
                int f5 = f(groupMetadata.f69467e, groupMetadata.f69466d);
                if (f5 != groupMetadata.f69466d) {
                    if (f5 == -1) {
                        arrayList.remove(i5);
                        size--;
                    }
                    groupMetadata.f69466d = f5;
                    if (!z6) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Collections.sort(arrayList);
            }
        }
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            GroupMetadata groupMetadata2 = arrayList.get(i4);
            int i8 = groupMetadata2.f69465c;
            if (i8 != -1 && !z4) {
                childrenCount = i8 - groupMetadata2.f69464b;
            } else {
                childrenCount = this.f69458b.getChildrenCount(groupMetadata2.f69466d);
            }
            this.f69460d += childrenCount;
            int i9 = groupMetadata2.f69466d;
            int i10 = i6 + (i9 - i7);
            groupMetadata2.f69464b = i10;
            i6 = i10 + childrenCount;
            groupMetadata2.f69465c = i6;
            i4++;
            i7 = i9;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return this.f69458b.areAllItemsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i4) {
        it.sephiroth.android.library.widget.a c5 = it.sephiroth.android.library.widget.a.c(2, i4, -1, -1);
        b i5 = i(c5);
        c5.g();
        if (i5 == null) {
            return false;
        }
        boolean c6 = c(i5);
        i5.d();
        return c6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(b bVar) {
        GroupMetadata groupMetadata = bVar.f69472b;
        if (groupMetadata == null) {
            return false;
        }
        this.f69459c.remove(groupMetadata);
        l(false, false);
        notifyDataSetChanged();
        this.f69458b.onGroupCollapsed(bVar.f69472b.f69466d);
        return true;
    }

    boolean d(int i4) {
        it.sephiroth.android.library.widget.a c5 = it.sephiroth.android.library.widget.a.c(2, i4, -1, -1);
        b i5 = i(c5);
        c5.g();
        boolean e5 = e(i5);
        i5.d();
        return e5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(b bVar) {
        if (bVar.f69471a.f69507a >= 0) {
            if (this.f69461e != 0 && bVar.f69472b == null) {
                if (this.f69459c.size() >= this.f69461e) {
                    GroupMetadata groupMetadata = this.f69459c.get(0);
                    int indexOf = this.f69459c.indexOf(groupMetadata);
                    b(groupMetadata.f69466d);
                    int i4 = bVar.f69473c;
                    if (i4 > indexOf) {
                        bVar.f69473c = i4 - 1;
                    }
                }
                int i5 = bVar.f69471a.f69507a;
                GroupMetadata e5 = GroupMetadata.e(-1, -1, i5, this.f69458b.getGroupId(i5));
                this.f69459c.add(bVar.f69473c, e5);
                l(false, false);
                notifyDataSetChanged();
                this.f69458b.onGroupExpanded(e5.f69466d);
                return true;
            }
            return false;
        }
        throw new RuntimeException("Need group");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int f(long r16, int r18) {
        /*
            r15 = this;
            r0 = r15
            android.widget.ExpandableListAdapter r1 = r0.f69458b
            int r1 = r1.getGroupCount()
            r2 = -1
            if (r1 != 0) goto Lb
            return r2
        Lb:
            r3 = -9223372036854775808
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 != 0) goto L12
            return r2
        L12:
            r3 = 0
            r4 = r18
            int r4 = java.lang.Math.max(r3, r4)
            r5 = 1
            int r1 = r1 - r5
            int r4 = java.lang.Math.min(r1, r4)
            long r6 = android.os.SystemClock.uptimeMillis()
            r8 = 100
            long r6 = r6 + r8
            android.widget.ExpandableListAdapter r8 = r15.g()
            if (r8 != 0) goto L2d
            return r2
        L2d:
            r9 = r4
            r10 = r9
        L2f:
            r11 = 0
        L30:
            long r12 = android.os.SystemClock.uptimeMillis()
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 > 0) goto L66
            long r12 = r8.getGroupId(r4)
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 != 0) goto L41
            return r4
        L41:
            if (r9 != r1) goto L45
            r12 = 1
            goto L46
        L45:
            r12 = 0
        L46:
            if (r10 != 0) goto L4a
            r13 = 1
            goto L4b
        L4a:
            r13 = 0
        L4b:
            if (r12 == 0) goto L50
            if (r13 == 0) goto L50
            goto L66
        L50:
            if (r13 != 0) goto L62
            if (r11 == 0) goto L57
            if (r12 != 0) goto L57
            goto L62
        L57:
            if (r12 != 0) goto L5d
            if (r11 != 0) goto L30
            if (r13 != 0) goto L30
        L5d:
            int r10 = r10 + (-1)
            r4 = r10
            r11 = 1
            goto L30
        L62:
            int r9 = r9 + 1
            r4 = r9
            goto L2f
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.ExpandableHListConnector.f(long, int):int");
    }

    ExpandableListAdapter g() {
        return this.f69458b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f69458b.getGroupCount() + this.f69460d;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        ExpandableListAdapter g4 = g();
        if (g4 instanceof Filterable) {
            return ((Filterable) g4).getFilter();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Object child;
        b j4 = j(i4);
        it.sephiroth.android.library.widget.a aVar = j4.f69471a;
        int i5 = aVar.f69510d;
        if (i5 == 2) {
            child = this.f69458b.getGroup(aVar.f69507a);
        } else if (i5 == 1) {
            child = this.f69458b.getChild(aVar.f69507a, aVar.f69508b);
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        j4.d();
        return child;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        long combinedChildId;
        b j4 = j(i4);
        long groupId = this.f69458b.getGroupId(j4.f69471a.f69507a);
        it.sephiroth.android.library.widget.a aVar = j4.f69471a;
        int i5 = aVar.f69510d;
        if (i5 == 2) {
            combinedChildId = this.f69458b.getCombinedGroupId(groupId);
        } else if (i5 == 1) {
            combinedChildId = this.f69458b.getCombinedChildId(groupId, this.f69458b.getChildId(aVar.f69507a, aVar.f69508b));
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        j4.d();
        return combinedChildId;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        int i5;
        b j4 = j(i4);
        it.sephiroth.android.library.widget.a aVar = j4.f69471a;
        ExpandableListAdapter expandableListAdapter = this.f69458b;
        if (expandableListAdapter instanceof HeterogeneousExpandableList) {
            HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) expandableListAdapter;
            if (aVar.f69510d == 2) {
                i5 = heterogeneousExpandableList.getGroupType(aVar.f69507a);
            } else {
                i5 = heterogeneousExpandableList.getChildType(aVar.f69507a, aVar.f69508b) + heterogeneousExpandableList.getGroupTypeCount();
            }
        } else {
            i5 = aVar.f69510d == 2 ? 0 : 1;
        }
        j4.d();
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View childView;
        b j4 = j(i4);
        it.sephiroth.android.library.widget.a aVar = j4.f69471a;
        int i5 = aVar.f69510d;
        if (i5 == 2) {
            childView = this.f69458b.getGroupView(aVar.f69507a, j4.b(), view, viewGroup);
        } else if (i5 == 1) {
            childView = this.f69458b.getChildView(aVar.f69507a, aVar.f69508b, j4.f69472b.f69465c == i4, view, viewGroup);
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        j4.d();
        return childView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        ExpandableListAdapter expandableListAdapter = this.f69458b;
        if (expandableListAdapter instanceof HeterogeneousExpandableList) {
            HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) expandableListAdapter;
            return heterogeneousExpandableList.getGroupTypeCount() + heterogeneousExpandableList.getChildTypeCount();
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<GroupMetadata> h() {
        return this.f69459c;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f69458b.hasStableIds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(it.sephiroth.android.library.widget.a aVar) {
        ArrayList<GroupMetadata> arrayList = this.f69459c;
        int size = arrayList.size();
        int i4 = size - 1;
        if (size == 0) {
            int i5 = aVar.f69507a;
            return b.c(i5, aVar.f69510d, i5, aVar.f69508b, null, 0);
        }
        int i6 = 0;
        int i7 = 0;
        while (i7 <= i4) {
            i6 = ((i4 - i7) / 2) + i7;
            GroupMetadata groupMetadata = arrayList.get(i6);
            int i8 = aVar.f69507a;
            int i9 = groupMetadata.f69466d;
            if (i8 > i9) {
                i7 = i6 + 1;
            } else if (i8 < i9) {
                i4 = i6 - 1;
            } else if (i8 == i9) {
                int i10 = aVar.f69510d;
                if (i10 == 2) {
                    return b.c(groupMetadata.f69464b, i10, i8, aVar.f69508b, groupMetadata, i6);
                }
                if (i10 == 1) {
                    int i11 = groupMetadata.f69464b;
                    int i12 = aVar.f69508b;
                    return b.c(i11 + i12 + 1, i10, i8, i12, groupMetadata, i6);
                }
                return null;
            }
        }
        if (aVar.f69510d != 2) {
            return null;
        }
        if (i7 > i6) {
            GroupMetadata groupMetadata2 = arrayList.get(i7 - 1);
            int i13 = groupMetadata2.f69465c;
            int i14 = aVar.f69507a;
            return b.c(i13 + (i14 - groupMetadata2.f69466d), aVar.f69510d, i14, aVar.f69508b, null, i7);
        } else if (i4 < i6) {
            int i15 = 1 + i4;
            GroupMetadata groupMetadata3 = arrayList.get(i15);
            int i16 = groupMetadata3.f69464b;
            int i17 = groupMetadata3.f69466d;
            int i18 = aVar.f69507a;
            return b.c(i16 - (i17 - i18), aVar.f69510d, i18, aVar.f69508b, null, i15);
        } else {
            return null;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        ExpandableListAdapter g4 = g();
        return g4 == null || g4.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i4) {
        b j4 = j(i4);
        it.sephiroth.android.library.widget.a aVar = j4.f69471a;
        boolean isChildSelectable = aVar.f69510d == 1 ? this.f69458b.isChildSelectable(aVar.f69507a, aVar.f69508b) : true;
        j4.d();
        return isChildSelectable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(int i4) {
        int i5;
        ArrayList<GroupMetadata> arrayList = this.f69459c;
        int size = arrayList.size();
        int i6 = size - 1;
        if (size == 0) {
            return b.c(i4, 2, i4, -1, null, 0);
        }
        int i7 = 0;
        int i8 = i6;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = ((i8 - i7) / 2) + i7;
            GroupMetadata groupMetadata = arrayList.get(i10);
            int i11 = groupMetadata.f69465c;
            if (i4 > i11) {
                i7 = i10 + 1;
            } else {
                int i12 = groupMetadata.f69464b;
                if (i4 < i12) {
                    i8 = i10 - 1;
                } else if (i4 == i12) {
                    return b.c(i4, 2, groupMetadata.f69466d, -1, groupMetadata, i10);
                } else {
                    if (i4 <= i11) {
                        return b.c(i4, 1, groupMetadata.f69466d, i4 - (i12 + 1), groupMetadata, i10);
                    }
                }
            }
            i9 = i10;
        }
        if (i7 > i9) {
            GroupMetadata groupMetadata2 = arrayList.get(i7 - 1);
            i5 = (i4 - groupMetadata2.f69465c) + groupMetadata2.f69466d;
        } else if (i8 < i9) {
            i7 = i8 + 1;
            GroupMetadata groupMetadata3 = arrayList.get(i7);
            i5 = groupMetadata3.f69466d - (groupMetadata3.f69464b - i4);
        } else {
            throw new RuntimeException("Unknown state");
        }
        return b.c(i4, 2, i5, -1, null, i7);
    }

    public boolean k(int i4) {
        for (int size = this.f69459c.size() - 1; size >= 0; size--) {
            if (this.f69459c.get(size).f69466d == i4) {
                return true;
            }
        }
        return false;
    }

    public void m(ExpandableListAdapter expandableListAdapter) {
        ExpandableListAdapter expandableListAdapter2 = this.f69458b;
        if (expandableListAdapter2 != null) {
            expandableListAdapter2.unregisterDataSetObserver(this.f69462f);
        }
        this.f69458b = expandableListAdapter;
        expandableListAdapter.registerDataSetObserver(this.f69462f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(ArrayList<GroupMetadata> arrayList) {
        ExpandableListAdapter expandableListAdapter;
        if (arrayList == null || (expandableListAdapter = this.f69458b) == null) {
            return;
        }
        int groupCount = expandableListAdapter.getGroupCount();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f69466d >= groupCount) {
                return;
            }
        }
        this.f69459c = arrayList;
        l(true, false);
    }

    public void o(int i4) {
        this.f69461e = i4;
    }
}
