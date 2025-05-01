package com.xinzhu.overmind.server.pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.MutableInt;
import android.util.PrintWriterPrinter;
import com.xinzhu.overmind.server.pm.MindPackage;
import com.xinzhu.overmind.server.pm.MindPackage.IntentInfo;
import com.xinzhu.overmind.utils.v;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: IntentResolver.java */
/* loaded from: classes.dex */
public abstract class g<F extends MindPackage.IntentInfo, R> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f68181h = "IntentResolver";

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f68182i = false;

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f68183j = false;

    /* renamed from: k  reason: collision with root package name */
    private static final boolean f68184k = false;

    /* renamed from: l  reason: collision with root package name */
    private static final Comparator f68185l = new a();

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<F> f68186a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68187b = new ArrayMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68188c = new ArrayMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68189d = new ArrayMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68190e = new ArrayMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68191f = new ArrayMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayMap<String, F[]> f68192g = new ArrayMap<>();

    /* compiled from: IntentResolver.java */
    /* loaded from: classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority = ((IntentFilter) obj).getPriority();
            int priority2 = ((IntentFilter) obj2).getPriority();
            if (priority > priority2) {
                return -1;
            }
            return priority < priority2 ? 1 : 0;
        }
    }

    /* compiled from: IntentResolver.java */
    /* loaded from: classes.dex */
    private class b implements Iterator<F> {

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<F> f68193b;

        /* renamed from: c  reason: collision with root package name */
        private F f68194c;

        b(Iterator<F> it2) {
            this.f68193b = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public F next() {
            F next = this.f68193b.next();
            this.f68194c = next;
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68193b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            F f5 = this.f68194c;
            if (f5 != null) {
                g.this.y(f5);
            }
            this.f68193b.remove();
        }
    }

    private final int B(F f5, Iterator<String> it2, ArrayMap<String, F[]> arrayMap, String str) {
        int i4 = 0;
        if (it2 == null) {
            return 0;
        }
        while (it2.hasNext()) {
            i4++;
            z(arrayMap, it2.next(), f5);
        }
        return i4;
    }

    private final int C(F f5, String str) {
        String str2;
        Iterator<String> typesIterator = f5.f68059b.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i4 = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i4++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next + "/*";
            }
            z(this.f68187b, next, f5);
            if (indexOf > 0) {
                z(this.f68188c, str2, f5);
            } else {
                z(this.f68189d, str2, f5);
            }
        }
        return i4;
    }

    private final void a(ArrayMap<String, F[]> arrayMap, String str, F f5) {
        F[] fArr = arrayMap.get(str);
        if (fArr == null) {
            F[] r4 = r(2);
            arrayMap.put(str, r4);
            r4[0] = f5;
            return;
        }
        int length = fArr.length;
        int i4 = length;
        while (i4 > 0 && fArr[i4 - 1] == null) {
            i4--;
        }
        if (i4 < length) {
            fArr[i4] = f5;
            return;
        }
        F[] r5 = r((length * 3) / 2);
        System.arraycopy(fArr, 0, r5, 0, length);
        r5[length] = f5;
        arrayMap.put(str, r5);
    }

    private void d(Intent intent, c<String> cVar, boolean z4, boolean z5, String str, String str2, F[] fArr, List<R> list, int i4) {
        F f5;
        String str3;
        Uri uri;
        F[] fArr2 = fArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str4 = intent.getPackage();
        int length = fArr2 != null ? fArr2.length : 0;
        int i5 = 0;
        boolean z6 = false;
        while (i5 < length && (f5 = fArr2[i5]) != null) {
            if (z4) {
                v.h(f68181h, "Matching against filter " + f5);
            }
            if (str4 == null || q(str4, f5)) {
                if (c(f5, list)) {
                    str3 = action;
                    uri = data;
                    int match = f5.f68059b.match(action, str, str2, data, cVar, f68181h);
                    if (match >= 0) {
                        if (z4) {
                            v.h(f68181h, "  Filter matched!  match=0x" + Integer.toHexString(match) + " hasDefault=" + f5.f68059b.hasCategory("android.intent.category.DEFAULT"));
                        }
                        if (!z5 || f5.f68059b.hasCategory("android.intent.category.DEFAULT")) {
                            R s4 = s(f5, match, i4);
                            if (z4) {
                                v.h(f68181h, "    Created result: " + s4);
                            }
                            if (s4 != null) {
                                list.add(s4);
                            }
                        } else {
                            z6 = true;
                        }
                    } else if (z4) {
                        String str5 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                        v.h(f68181h, "  Filter did not match: " + str5);
                    }
                    i5++;
                    fArr2 = fArr;
                    action = str3;
                    data = uri;
                } else if (z4) {
                    v.h(f68181h, "  Filter's target already added");
                }
            } else if (z4) {
                v.h(f68181h, "  Filter is not from package " + str4 + "; skipping");
            }
            str3 = action;
            uri = data;
            i5++;
            fArr2 = fArr;
            action = str3;
            data = uri;
        }
        if (z4 && z6) {
            if (list.size() == 0) {
                v.h(f68181h, "resolveIntent failed: found match, but none with CATEGORY_DEFAULT");
            } else if (list.size() > 1) {
                v.h(f68181h, "resolveIntent: multiple matches, only some with CATEGORY_DEFAULT");
            }
        }
    }

    private ArrayList<F> e(F[] fArr, IntentFilter intentFilter) {
        F f5;
        ArrayList<F> arrayList = null;
        if (fArr != null) {
            for (int i4 = 0; i4 < fArr.length && (f5 = fArr[i4]) != null; i4++) {
                if (i(f5.f68059b, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(f5);
                }
            }
        }
        return arrayList;
    }

    public static boolean i(IntentFilter intentFilter, IntentFilter intentFilter2) {
        int countActions = intentFilter.countActions();
        if (countActions != intentFilter2.countActions()) {
            return false;
        }
        for (int i4 = 0; i4 < countActions; i4++) {
            if (!intentFilter2.hasAction(intentFilter.getAction(i4))) {
                return false;
            }
        }
        int countCategories = intentFilter.countCategories();
        if (countCategories != intentFilter2.countCategories()) {
            return false;
        }
        for (int i5 = 0; i5 < countCategories; i5++) {
            if (!intentFilter2.hasCategory(intentFilter.getCategory(i5))) {
                return false;
            }
        }
        int countDataSchemes = intentFilter.countDataSchemes();
        if (countDataSchemes != intentFilter2.countDataSchemes()) {
            return false;
        }
        for (int i6 = 0; i6 < countDataSchemes; i6++) {
            if (!intentFilter2.hasDataScheme(intentFilter.getDataScheme(i6))) {
                return false;
            }
        }
        return intentFilter.countDataSchemeSpecificParts() == intentFilter2.countDataSchemeSpecificParts();
    }

    private static c<String> o(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new c<>((String[]) categories.toArray(new String[categories.size()]));
    }

    private final int v(F f5, Iterator<String> it2, ArrayMap<String, F[]> arrayMap, String str) {
        int i4 = 0;
        if (it2 == null) {
            return 0;
        }
        while (it2.hasNext()) {
            i4++;
            a(arrayMap, it2.next(), f5);
        }
        return i4;
    }

    private final int w(F f5, String str) {
        String str2;
        Iterator<String> typesIterator = f5.f68059b.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i4 = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i4++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next + "/*";
            }
            a(this.f68187b, next, f5);
            if (indexOf > 0) {
                a(this.f68188c, str2, f5);
            } else {
                a(this.f68189d, str2, f5);
            }
        }
        return i4;
    }

    private final void z(ArrayMap<String, F[]> arrayMap, String str, Object obj) {
        F[] fArr = arrayMap.get(str);
        if (fArr != null) {
            int length = fArr.length - 1;
            while (length >= 0 && fArr[length] == null) {
                length--;
            }
            int i4 = length;
            while (length >= 0) {
                if (fArr[length] == obj) {
                    int i5 = i4 - length;
                    if (i5 > 0) {
                        System.arraycopy(fArr, length + 1, fArr, length, i5);
                    }
                    fArr[i4] = null;
                    i4--;
                }
                length--;
            }
            if (i4 < 0) {
                arrayMap.remove(str);
            } else if (i4 < fArr.length / 2) {
                F[] r4 = r(i4 + 2);
                System.arraycopy(fArr, 0, r4, 0, i4 + 1);
                arrayMap.put(str, r4);
            }
        }
    }

    protected void A(List<R> list) {
        Collections.sort(list, f68185l);
    }

    public void b(F f5) {
        this.f68186a.add(f5);
        int v2 = v(f5, f5.f68059b.schemesIterator(), this.f68190e, "      Scheme: ");
        int w4 = w(f5, "      Type: ");
        if (v2 == 0 && w4 == 0) {
            v(f5, f5.f68059b.actionsIterator(), this.f68191f, "      Action: ");
        }
        if (w4 != 0) {
            v(f5, f5.f68059b.actionsIterator(), this.f68192g, "      TypedAction: ");
        }
    }

    protected boolean c(F f5, List<R> list) {
        return true;
    }

    protected void f(PrintWriter printWriter, String str, F f5) {
        printWriter.print(str);
        printWriter.println(f5);
    }

    protected void g(PrintWriter printWriter, String str, Object obj, int i4) {
        printWriter.print(str);
        printWriter.print(obj);
        printWriter.print(": ");
        printWriter.println(i4);
    }

    boolean h(PrintWriter printWriter, String str, String str2, String str3, ArrayMap<String, F[]> arrayMap, String str4, boolean z4, boolean z5) {
        boolean z6;
        String str5;
        F f5;
        PrintWriterPrinter printWriterPrinter;
        boolean z7;
        ArrayMap<String, F[]> arrayMap2 = arrayMap;
        String str6 = str3 + "  ";
        String str7 = str3 + "    ";
        ArrayMap arrayMap3 = new ArrayMap();
        String str8 = str2;
        int i4 = 0;
        boolean z8 = false;
        PrintWriterPrinter printWriterPrinter2 = null;
        while (i4 < arrayMap.size()) {
            F[] valueAt = arrayMap2.valueAt(i4);
            int length = valueAt.length;
            if (!z5 || z4) {
                z6 = z8;
                str8 = str8;
                printWriterPrinter2 = printWriterPrinter2;
                int i5 = 0;
                boolean z9 = false;
                while (i5 < length) {
                    F f6 = valueAt[i5];
                    if (f6 != null) {
                        if (str4 == null || q(str4, f6)) {
                            if (str8 != null) {
                                printWriter.print(str);
                                printWriter.println(str8);
                                str8 = null;
                            }
                            if (!z9) {
                                printWriter.print(str6);
                                printWriter.print(arrayMap2.keyAt(i4));
                                printWriter.println(":");
                                z9 = true;
                            }
                            f(printWriter, str7, f6);
                            if (z4) {
                                if (printWriterPrinter2 == null) {
                                    printWriterPrinter2 = new PrintWriterPrinter(printWriter);
                                }
                                f6.f68059b.dump(printWriterPrinter2, str7 + "  ");
                            }
                            z6 = true;
                        }
                        i5++;
                        arrayMap2 = arrayMap;
                    }
                }
            } else {
                arrayMap3.clear();
                int i6 = 0;
                while (true) {
                    str5 = str8;
                    if (i6 >= length || (f5 = valueAt[i6]) == null) {
                        break;
                    }
                    if (str4 == null || q(str4, f5)) {
                        Object m4 = m(f5);
                        printWriterPrinter = printWriterPrinter2;
                        int indexOfKey = arrayMap3.indexOfKey(m4);
                        if (indexOfKey < 0) {
                            z7 = z8;
                            arrayMap3.put(m4, new MutableInt(1));
                        } else {
                            z7 = z8;
                            ((MutableInt) arrayMap3.valueAt(indexOfKey)).value++;
                        }
                    } else {
                        z7 = z8;
                        printWriterPrinter = printWriterPrinter2;
                    }
                    i6++;
                    str8 = str5;
                    printWriterPrinter2 = printWriterPrinter;
                    z8 = z7;
                }
                z6 = z8;
                PrintWriterPrinter printWriterPrinter3 = printWriterPrinter2;
                str8 = str5;
                int i7 = 0;
                boolean z10 = false;
                while (i7 < arrayMap3.size()) {
                    if (str8 != null) {
                        printWriter.print(str);
                        printWriter.println(str8);
                        str8 = null;
                    }
                    if (!z10) {
                        printWriter.print(str6);
                        printWriter.print(arrayMap2.keyAt(i4));
                        printWriter.println(":");
                        z10 = true;
                    }
                    g(printWriter, str7, arrayMap3.keyAt(i7), ((MutableInt) arrayMap3.valueAt(i7)).value);
                    i7++;
                    z6 = true;
                }
                printWriterPrinter2 = printWriterPrinter3;
            }
            z8 = z6;
            i4++;
            arrayMap2 = arrayMap;
        }
        return z8;
    }

    public Iterator<F> j() {
        return new b(this.f68186a.iterator());
    }

    protected void k(List<R> list) {
    }

    public Set<F> l() {
        return Collections.unmodifiableSet(this.f68186a);
    }

    protected Object m(F f5) {
        return "IntentFilter";
    }

    public ArrayList<F> n(IntentFilter intentFilter) {
        if (intentFilter.countDataSchemes() == 1) {
            return e(this.f68190e.get(intentFilter.getDataScheme(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() != 0 && intentFilter.countActions() == 1) {
            return e(this.f68192g.get(intentFilter.getAction(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() == 0 && intentFilter.countDataSchemes() == 0 && intentFilter.countActions() == 1) {
            return e(this.f68191f.get(intentFilter.getAction(0)), intentFilter);
        }
        ArrayList<F> arrayList = null;
        Iterator<F> it2 = this.f68186a.iterator();
        while (it2.hasNext()) {
            F next = it2.next();
            if (i(next.f68059b, intentFilter)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    protected boolean p(F f5, int i4) {
        return false;
    }

    protected abstract boolean q(String str, F f5);

    protected abstract F[] r(int i4);

    /* JADX WARN: Multi-variable type inference failed */
    protected R s(F f5, int i4, int i5) {
        return f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<R> t(android.content.Intent r21, java.lang.String r22, boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.g.t(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public List<R> u(Intent intent, String str, boolean z4, ArrayList<F[]> arrayList, int i4) {
        ArrayList arrayList2 = new ArrayList();
        boolean z5 = (intent.getFlags() & 8) != 0;
        c<String> o4 = o(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d(intent, o4, z5, z4, str, scheme, arrayList.get(i5), arrayList2, i4);
        }
        k(arrayList2);
        A(arrayList2);
        return arrayList2;
    }

    public void x(F f5) {
        y(f5);
        this.f68186a.remove(f5);
    }

    void y(F f5) {
        int B = B(f5, f5.f68059b.schemesIterator(), this.f68190e, "      Scheme: ");
        int C = C(f5, "      Type: ");
        if (B == 0 && C == 0) {
            B(f5, f5.f68059b.actionsIterator(), this.f68191f, "      Action: ");
        }
        if (C != 0) {
            B(f5, f5.f68059b.actionsIterator(), this.f68192g, "      TypedAction: ");
        }
    }
}
