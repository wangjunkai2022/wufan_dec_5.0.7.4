package com.mob.commons.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes5.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private String f56327a;

    /* renamed from: b  reason: collision with root package name */
    private int f56328b;

    /* renamed from: c  reason: collision with root package name */
    private s f56329c;

    /* renamed from: d  reason: collision with root package name */
    private int f56330d;

    /* renamed from: e  reason: collision with root package name */
    private int f56331e;

    /* renamed from: f  reason: collision with root package name */
    private w f56332f;

    /* loaded from: classes5.dex */
    public static class a implements t<a> {

        /* renamed from: a  reason: collision with root package name */
        public Throwable f56333a;

        /* renamed from: b  reason: collision with root package name */
        public Object f56334b;

        public boolean a() {
            return this.f56333a != null;
        }

        @Override // com.mob.commons.cc.t
        public boolean a(a aVar, Class<a> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
            if ("isError".equals(str) && objArr.length == 0) {
                objArr2[0] = Boolean.valueOf(aVar.a());
                return true;
            } else if ("getError".equals(str) && objArr.length == 0) {
                objArr2[0] = aVar.f56333a;
                return true;
            } else if ("getResult".equals(str) && objArr.length == 0) {
                objArr2[0] = aVar.f56334b;
                return true;
            } else {
                return false;
            }
        }
    }

    public z(String str, int i4, ArrayList<y> arrayList, ArrayList<Object> arrayList2, int i5, int i6, s sVar) {
        this.f56327a = str;
        this.f56328b = i4;
        this.f56332f = new w(arrayList, arrayList2);
        this.f56330d = i5;
        this.f56331e = i6;
        this.f56329c = sVar;
    }

    public z a(s sVar, String str, int i4) {
        if (this.f56328b <= 1) {
            return this;
        }
        ArrayList<y> arrayList = new ArrayList<>();
        a(str, i4, arrayList, 0);
        return new z(null, 1, arrayList, new ArrayList(), 0, arrayList.size(), sVar);
    }

    public LinkedList<Object> b(Object... objArr) throws Throwable {
        s b5 = this.f56329c.b();
        int i4 = this.f56328b;
        if (i4 != 0) {
            if (objArr.length == i4) {
                for (int length = objArr.length - 1; length >= 0; length--) {
                    b5.a(objArr[length]);
                }
            } else if (objArr.length < i4) {
                for (int length2 = objArr.length; length2 < this.f56328b; length2++) {
                    b5.a((Object) null);
                }
                for (int length3 = objArr.length - 1; length3 >= 0; length3--) {
                    b5.a(objArr[length3]);
                }
            } else {
                ArrayList arrayList = new ArrayList(0);
                for (int i5 = this.f56328b - 1; i5 < objArr.length; i5++) {
                    arrayList.add(objArr[i5]);
                }
                b5.a(arrayList);
                for (int i6 = this.f56328b - 2; i6 >= 0; i6--) {
                    b5.a(objArr[i6]);
                }
            }
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        this.f56332f.a(this.f56330d, this.f56331e, b5, linkedList);
        return linkedList;
    }

    private void a(String str, int i4, ArrayList<y> arrayList, int i5) {
        if (i5 != 0) {
            y yVar = new y(29);
            yVar.f56302b = str;
            yVar.f56303c = i4;
            yVar.f56309i = 1;
            arrayList.add(yVar);
        }
        y yVar2 = new y(1);
        yVar2.f56302b = str;
        yVar2.f56303c = i4;
        StringBuilder sb = new StringBuilder();
        sb.append("arg");
        int i6 = i5 + 1;
        sb.append(i6);
        yVar2.f56308h = sb.toString();
        arrayList.add(yVar2);
        int i7 = this.f56328b;
        if (i5 < i7 - 1) {
            a(str, i4, arrayList, i6);
            y yVar3 = new y(28);
            yVar3.f56302b = str;
            yVar3.f56303c = i4;
            arrayList.add(yVar3);
        } else {
            for (int i8 = i7 - 1; i8 >= 0; i8 += -1) {
                y yVar4 = new y(3);
                yVar4.f56302b = str;
                yVar4.f56303c = i4;
                yVar4.f56308h = "arg" + (i8 + 1);
                arrayList.add(yVar4);
            }
            if (this.f56327a == null) {
                y yVar5 = new y(2);
                yVar5.f56302b = str;
                yVar5.f56303c = i4;
                yVar5.f56317q = this;
                arrayList.add(yVar5);
                y yVar6 = new y(32);
                yVar6.f56302b = str;
                yVar6.f56303c = i4;
                yVar6.f56309i = this.f56328b;
                arrayList.add(yVar6);
            } else {
                y yVar7 = new y(31);
                yVar7.f56302b = str;
                yVar7.f56303c = i4;
                yVar7.f56308h = this.f56327a;
                yVar7.f56309i = this.f56328b;
                arrayList.add(yVar7);
            }
            Iterator<y> it2 = this.f56332f.a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().f56301a == 28) {
                        y yVar8 = new y(28);
                        yVar8.f56302b = str;
                        yVar8.f56303c = i4;
                        arrayList.add(yVar8);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (i5 != 0) {
            y yVar9 = new y(30);
            yVar9.f56302b = str;
            yVar9.f56303c = i4;
            arrayList.add(yVar9);
        }
    }

    public a a(Object... objArr) {
        a aVar = new a();
        try {
            LinkedList<Object> b5 = b(objArr);
            if (!b5.isEmpty()) {
                aVar.f56334b = b5.get(0);
            }
        } catch (Throwable th) {
            aVar.f56333a = th;
        }
        return aVar;
    }

    public static z a(String str, int i4, ArrayList<y> arrayList, ArrayList<Object> arrayList2, int i5, int i6, s sVar) {
        return new z(str, i4, arrayList, arrayList2, i5, i6, sVar) { // from class: com.mob.commons.cc.z.1
            @Override // com.mob.commons.cc.z
            public LinkedList<Object> b(Object... objArr) throws Throwable {
                return new LinkedList<>();
            }
        };
    }
}
