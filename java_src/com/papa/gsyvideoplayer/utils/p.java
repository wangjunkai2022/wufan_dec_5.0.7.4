package com.papa.gsyvideoplayer.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
/* compiled from: RawDataSourceProvider.java */
/* loaded from: classes5.dex */
public class p implements IMediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    private AssetFileDescriptor f58602a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f58603b;

    public p(AssetFileDescriptor assetFileDescriptor) {
        this.f58602a = assetFileDescriptor;
    }

    public static p a(Context context, Uri uri) {
        try {
            return new p(context.getApplicationContext().getContentResolver().openAssetFileDescriptor(uri, "r"));
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        AssetFileDescriptor assetFileDescriptor = this.f58602a;
        if (assetFileDescriptor != null) {
            assetFileDescriptor.close();
        }
        this.f58602a = null;
        this.f58603b = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() throws IOException {
        long length = this.f58602a.getLength();
        if (this.f58603b == null) {
            this.f58603b = b(this.f58602a.createInputStream());
        }
        return length;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j4, byte[] bArr, int i4, int i5) throws IOException {
        byte[] bArr2 = this.f58603b;
        if (1 + j4 >= bArr2.length) {
            return -1;
        }
        if (i5 + j4 >= bArr2.length) {
            int length = (int) (bArr2.length - j4);
            if (length > bArr.length) {
                length = bArr.length;
            }
            i5 = length - 1;
        }
        System.arraycopy(bArr2, (int) j4, bArr, i4, i5);
        return i5;
    }
}
