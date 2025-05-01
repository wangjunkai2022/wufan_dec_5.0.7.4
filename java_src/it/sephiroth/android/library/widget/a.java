package it.sephiroth.android.library.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;
/* compiled from: ExpandableHListPosition.java */
/* loaded from: classes6.dex */
class a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f69503e = 5;

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<a> f69504f = new ArrayList<>(5);

    /* renamed from: g  reason: collision with root package name */
    public static final int f69505g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f69506h = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f69507a;

    /* renamed from: b  reason: collision with root package name */
    public int f69508b;

    /* renamed from: c  reason: collision with root package name */
    int f69509c;

    /* renamed from: d  reason: collision with root package name */
    public int f69510d;

    private a() {
    }

    private static a b() {
        synchronized (f69504f) {
            if (f69504f.size() > 0) {
                a remove = f69504f.remove(0);
                remove.h();
                return remove;
            }
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(int i4, int i5, int i6, int i7) {
        a b5 = b();
        b5.f69510d = i4;
        b5.f69507a = i5;
        b5.f69508b = i6;
        b5.f69509c = i7;
        return b5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d(int i4, int i5) {
        return c(1, i4, i5, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(int i4) {
        return c(2, i4, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a f(long j4) {
        if (j4 == 4294967295L) {
            return null;
        }
        a b5 = b();
        b5.f69507a = ExpandableListView.getPackedPositionGroup(j4);
        if (ExpandableListView.getPackedPositionType(j4) == 1) {
            b5.f69510d = 1;
            b5.f69508b = ExpandableListView.getPackedPositionChild(j4);
        } else {
            b5.f69510d = 2;
        }
        return b5;
    }

    private void h() {
        this.f69507a = 0;
        this.f69508b = 0;
        this.f69509c = 0;
        this.f69510d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f69510d == 1 ? ExpandableListView.getPackedPositionForChild(this.f69507a, this.f69508b) : ExpandableListView.getPackedPositionForGroup(this.f69507a);
    }

    public void g() {
        synchronized (f69504f) {
            if (f69504f.size() < 5) {
                f69504f.add(this);
            }
        }
    }
}
