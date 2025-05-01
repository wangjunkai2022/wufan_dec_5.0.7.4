package net.lingala.zip4j.exception;
/* loaded from: classes7.dex */
public class ZipException extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f71785b;

    public ZipException() {
        this.f71785b = -1;
    }

    public int a() {
        return this.f71785b;
    }

    public ZipException(String str) {
        super(str);
        this.f71785b = -1;
    }

    public ZipException(String str, Throwable th) {
        super(str, th);
        this.f71785b = -1;
    }

    public ZipException(String str, int i4) {
        super(str);
        this.f71785b = -1;
        this.f71785b = i4;
    }

    public ZipException(String str, Throwable th, int i4) {
        super(str, th);
        this.f71785b = -1;
        this.f71785b = i4;
    }

    public ZipException(Throwable th) {
        super(th);
        this.f71785b = -1;
    }

    public ZipException(Throwable th, int i4) {
        super(th);
        this.f71785b = -1;
        this.f71785b = i4;
    }
}
