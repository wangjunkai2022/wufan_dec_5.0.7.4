package com.mob.commons.cc;

import java.util.ArrayList;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public a f56272a;

    /* loaded from: classes5.dex */
    interface a {
        Object a(String str, ArrayList<Object> arrayList);
    }

    public m(a aVar) {
        this.f56272a = aVar;
    }

    public Object a(String str, ArrayList<Object> arrayList) {
        a aVar = this.f56272a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(str, arrayList);
    }
}
