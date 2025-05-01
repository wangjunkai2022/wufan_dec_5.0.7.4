package com.mob.tools.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class FilePart extends HTTPPart {

    /* renamed from: a  reason: collision with root package name */
    private File f56797a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        return new FileInputStream(this.f56797a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        return this.f56797a.length();
    }

    public void setFile(File file) {
        this.f56797a = file;
    }

    public String toString() {
        return this.f56797a.toString();
    }

    public void setFile(String str) {
        this.f56797a = new File(str);
    }
}
