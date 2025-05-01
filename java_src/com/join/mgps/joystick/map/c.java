package com.join.mgps.joystick.map;

import android.view.InputEvent;
/* compiled from: KeyMapEvent.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    InputEvent f53529a;

    /* renamed from: b  reason: collision with root package name */
    String f53530b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    int f53531c;

    /* renamed from: d  reason: collision with root package name */
    String f53532d;

    public String a() {
        return this.f53530b;
    }

    public String b() {
        return this.f53532d;
    }

    @Deprecated
    public int c() {
        return this.f53531c;
    }

    public InputEvent d() {
        return this.f53529a;
    }

    public void e(String str) {
        this.f53530b = str;
    }

    public void f(String str) {
        this.f53532d = str;
    }

    @Deprecated
    public void g(int i4) {
        this.f53531c = i4;
    }

    public void h(InputEvent inputEvent) {
        this.f53529a = inputEvent;
    }

    public String toString() {
        return "KeyMapEvent{event=" + this.f53529a + ", customKey='" + this.f53530b + "', emumapKeyIndex=" + this.f53531c + ", emuKey='" + this.f53532d + "'}";
    }
}
