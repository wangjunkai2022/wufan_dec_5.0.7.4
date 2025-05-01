package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f72839a;

    public b() {
        this.f72839a = new ArrayList();
    }

    public b(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new a("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.f72839a.add(Array.get(obj, i4));
        }
    }

    public b(String str) {
        this(new d(str));
    }

    public b(Collection collection) {
        this.f72839a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public b(d dVar) {
        this();
        char c5;
        ArrayList arrayList;
        Object d5;
        char c6 = dVar.c();
        if (c6 == '[') {
            c5 = ']';
        } else if (c6 != '(') {
            throw dVar.a("A JSONArray text must start with '['");
        } else {
            c5 = ')';
        }
        if (dVar.c() == ']') {
            return;
        }
        do {
            dVar.a();
            char c7 = dVar.c();
            dVar.a();
            if (c7 == ',') {
                arrayList = this.f72839a;
                d5 = null;
            } else {
                arrayList = this.f72839a;
                d5 = dVar.d();
            }
            arrayList.add(d5);
            char c8 = dVar.c();
            if (c8 != ')') {
                if (c8 != ',' && c8 != ';') {
                    if (c8 != ']') {
                        throw dVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c5 == c8) {
                return;
            }
            throw dVar.a("Expected a '" + new Character(c5) + "'");
        } while (dVar.c() != ']');
    }

    private String a(String str) {
        int size = this.f72839a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(c.a(this.f72839a.get(i4)));
        }
        return stringBuffer.toString();
    }

    public final int a() {
        return this.f72839a.size();
    }

    public final Object a(int i4) {
        Object obj = (i4 < 0 || i4 >= this.f72839a.size()) ? null : this.f72839a.get(i4);
        if (obj != null) {
            return obj;
        }
        throw new a("JSONArray[" + i4 + "] not found.");
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
