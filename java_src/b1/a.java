package b1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: FragmentChangeManager.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private FragmentManager f163a;

    /* renamed from: b  reason: collision with root package name */
    private int f164b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<Fragment> f165c;

    /* renamed from: d  reason: collision with root package name */
    private int f166d;

    public a(FragmentManager fragmentManager, int i4, ArrayList<Fragment> arrayList) {
        this.f163a = fragmentManager;
        this.f164b = i4;
        this.f165c = arrayList;
        c();
    }

    private void c() {
        Iterator<Fragment> it2 = this.f165c.iterator();
        while (it2.hasNext()) {
            Fragment next = it2.next();
            this.f163a.beginTransaction().add(this.f164b, next).hide(next).commit();
        }
        d(0);
    }

    public Fragment a() {
        return this.f165c.get(this.f166d);
    }

    public int b() {
        return this.f166d;
    }

    public void d(int i4) {
        for (int i5 = 0; i5 < this.f165c.size(); i5++) {
            FragmentTransaction beginTransaction = this.f163a.beginTransaction();
            Fragment fragment = this.f165c.get(i5);
            if (i5 == i4) {
                beginTransaction.show(fragment);
            } else {
                beginTransaction.hide(fragment);
            }
            beginTransaction.commit();
        }
        this.f166d = i4;
    }
}
