package org.aspectj.lang.reflect;
/* loaded from: classes7.dex */
public class NoSuchPointcutException extends Exception {
    private static final long serialVersionUID = 3256444698657634352L;

    /* renamed from: b  reason: collision with root package name */
    private String f72215b;

    public NoSuchPointcutException(String str) {
        this.f72215b = str;
    }

    public String getName() {
        return this.f72215b;
    }
}
