package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.googlecode.mp4parser.util.l;
import java.io.File;
import java.util.ArrayList;
/* compiled from: Mp4Movie.java */
@TargetApi(16)
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private l f64774a = l.f14234j;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<g> f64775b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private File f64776c;

    /* renamed from: d  reason: collision with root package name */
    private int f64777d;

    /* renamed from: e  reason: collision with root package name */
    private int f64778e;

    public void a(int i4, long j4, MediaCodec.BufferInfo bufferInfo) throws Exception {
        if (i4 < 0 || i4 >= this.f64775b.size()) {
            return;
        }
        this.f64775b.get(i4).a(j4, bufferInfo);
    }

    public int b(MediaFormat mediaFormat, boolean z4) throws Exception {
        this.f64775b.add(new g(this.f64775b.size(), mediaFormat, z4));
        return this.f64775b.size() - 1;
    }

    public File c() {
        return this.f64776c;
    }

    public int d() {
        return this.f64778e;
    }

    public l e() {
        return this.f64774a;
    }

    public ArrayList<g> f() {
        return this.f64775b;
    }

    public int g() {
        return this.f64777d;
    }

    public void h(File file) {
        this.f64776c = file;
    }

    public void i(int i4) {
        if (i4 == 0) {
            this.f64774a = l.f14234j;
        } else if (i4 == 90) {
            this.f64774a = l.f14235k;
        } else if (i4 == 180) {
            this.f64774a = l.f14236l;
        } else if (i4 == 270) {
            this.f64774a = l.f14237m;
        }
    }

    public void j(int i4, int i5) {
        this.f64777d = i4;
        this.f64778e = i5;
    }
}
