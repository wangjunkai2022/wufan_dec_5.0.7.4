package com.join.mgps.Util;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
/* compiled from: CustomLinkMovementMethod.java */
/* loaded from: classes3.dex */
public class x extends LinkMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    private static x f28144a;

    public static x a() {
        if (f28144a == null) {
            f28144a = new x();
        }
        return f28144a;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (!onTouchEvent && motionEvent.getAction() == 1) {
            ViewParent parent = textView.getParent();
            if (parent instanceof ViewGroup) {
                return ((ViewGroup) parent).performClick();
            }
        }
        return onTouchEvent;
    }
}
