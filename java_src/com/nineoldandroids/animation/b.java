package com.nineoldandroids.animation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AnimatorInflater.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final int f57661b = 0;

    /* renamed from: d  reason: collision with root package name */
    private static final int f57663d = 0;

    /* renamed from: f  reason: collision with root package name */
    private static final int f57665f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static final int f57666g = 1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f57667h = 2;

    /* renamed from: i  reason: collision with root package name */
    private static final int f57668i = 3;

    /* renamed from: j  reason: collision with root package name */
    private static final int f57669j = 4;

    /* renamed from: k  reason: collision with root package name */
    private static final int f57670k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final int f57671l = 6;

    /* renamed from: m  reason: collision with root package name */
    private static final int f57672m = 7;

    /* renamed from: n  reason: collision with root package name */
    private static final int f57673n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f57674o = 0;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f57660a = {16843490};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f57662c = {16843489};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f57664e = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    private static a a(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return b(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    private static a b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, d dVar, int i4) throws XmlPullParserException, IOException {
        int i5;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        l lVar = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        lVar = e(context, attributeSet);
                    } else if (name.equals("animator")) {
                        lVar = d(context, attributeSet, null);
                    } else if (name.equals("set")) {
                        d dVar2 = new d();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f57660a);
                        TypedValue typedValue = new TypedValue();
                        obtainStyledAttributes.getValue(0, typedValue);
                        b(context, xmlPullParser, attributeSet, dVar2, typedValue.type == 16 ? typedValue.data : 0);
                        obtainStyledAttributes.recycle();
                        lVar = dVar2;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (dVar != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lVar);
                    }
                }
            }
        }
        if (dVar != null && arrayList != null) {
            a[] aVarArr = new a[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                aVarArr[i5] = (a) it2.next();
                i5++;
            }
            if (i4 == 0) {
                dVar.C(aVarArr);
            } else {
                dVar.A(aVarArr);
            }
        }
        return lVar;
    }

    public static a c(Context context, int i4) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = context.getResources().getAnimation(i4);
                return a(context, xmlResourceParser);
            } catch (IOException e5) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException.initCause(e5);
                throw notFoundException;
            } catch (XmlPullParserException e6) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException2.initCause(e6);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static q d(Context context, AttributeSet attributeSet, q qVar) throws Resources.NotFoundException {
        int i4;
        int i5;
        int i6;
        int i7;
        float f5;
        float f6;
        float f7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f57664e);
        long j4 = obtainStyledAttributes.getInt(1, 0);
        long j5 = obtainStyledAttributes.getInt(2, 0);
        int i8 = obtainStyledAttributes.getInt(7, 0);
        q qVar2 = qVar == null ? new q() : qVar;
        boolean z4 = i8 == 0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        boolean z5 = peekValue != null;
        int i9 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        boolean z6 = peekValue2 != null;
        int i10 = z6 ? peekValue2.type : 0;
        if ((z5 && i9 >= 28 && i9 <= 31) || (z6 && i10 >= 28 && i10 <= 31)) {
            qVar2.d0(new e());
            z4 = false;
        }
        if (!z4) {
            i4 = 0;
            if (z5) {
                if (i9 == 5) {
                    i6 = (int) obtainStyledAttributes.getDimension(5, 0.0f);
                } else if (i9 >= 28 && i9 <= 31) {
                    i6 = obtainStyledAttributes.getColor(5, 0);
                } else {
                    i6 = obtainStyledAttributes.getInt(5, 0);
                }
                if (z6) {
                    if (i10 == 5) {
                        i7 = (int) obtainStyledAttributes.getDimension(6, 0.0f);
                    } else if (i10 >= 28 && i10 <= 31) {
                        i7 = obtainStyledAttributes.getColor(6, 0);
                    } else {
                        i7 = obtainStyledAttributes.getInt(6, 0);
                    }
                    qVar2.g0(i6, i7);
                } else {
                    qVar2.g0(i6);
                }
            } else if (z6) {
                if (i10 == 5) {
                    i5 = (int) obtainStyledAttributes.getDimension(6, 0.0f);
                } else if (i10 >= 28 && i10 <= 31) {
                    i5 = obtainStyledAttributes.getColor(6, 0);
                } else {
                    i5 = obtainStyledAttributes.getInt(6, 0);
                }
                qVar2.g0(i5);
            }
        } else if (z5) {
            if (i9 == 5) {
                f6 = obtainStyledAttributes.getDimension(5, 0.0f);
            } else {
                f6 = obtainStyledAttributes.getFloat(5, 0.0f);
            }
            if (z6) {
                if (i10 == 5) {
                    f7 = obtainStyledAttributes.getDimension(6, 0.0f);
                } else {
                    f7 = obtainStyledAttributes.getFloat(6, 0.0f);
                }
                i4 = 0;
                qVar2.e0(f6, f7);
            } else {
                i4 = 0;
                qVar2.e0(f6);
            }
        } else {
            i4 = 0;
            if (i10 == 5) {
                f5 = obtainStyledAttributes.getDimension(6, 0.0f);
            } else {
                f5 = obtainStyledAttributes.getFloat(6, 0.0f);
            }
            qVar2.e0(f5);
        }
        qVar2.k(j4);
        qVar2.m(j5);
        if (obtainStyledAttributes.hasValue(3)) {
            qVar2.i0(obtainStyledAttributes.getInt(3, i4));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            qVar2.j0(obtainStyledAttributes.getInt(4, 1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(i4, i4);
        if (resourceId > 0) {
            qVar2.l(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
        return qVar2;
    }

    private static l e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        l lVar = new l();
        d(context, attributeSet, lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f57662c);
        lVar.z0(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return lVar;
    }
}
