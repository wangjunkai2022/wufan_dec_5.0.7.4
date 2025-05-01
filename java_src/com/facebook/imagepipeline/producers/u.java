package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: LocalContentUriFetchProducer.java */
/* loaded from: classes.dex */
public class u extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12396d = "LocalContentUriFetchProducer";

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f12397e = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f12398c;

    public u(Executor executor, com.facebook.common.memory.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f12398c = contentResolver;
    }

    @Nullable
    private com.facebook.imagepipeline.image.e g(Uri uri) throws IOException {
        Cursor query = this.f12398c.query(uri, f12397e, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                return e(new FileInputStream(string), h(string));
            }
            return null;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    @Override // com.facebook.imagepipeline.producers.x
    protected com.facebook.imagepipeline.image.e d(ImageRequest imageRequest) throws IOException {
        com.facebook.imagepipeline.image.e g4;
        InputStream createInputStream;
        Uri t4 = imageRequest.t();
        if (!com.facebook.common.util.f.i(t4)) {
            return (!com.facebook.common.util.f.h(t4) || (g4 = g(t4)) == null) ? e(this.f12398c.openInputStream(t4), -1) : g4;
        }
        if (t4.toString().endsWith("/photo")) {
            createInputStream = this.f12398c.openInputStream(t4);
        } else if (t4.toString().endsWith("/display_photo")) {
            try {
                createInputStream = this.f12398c.openAssetFileDescriptor(t4, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + t4);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f12398c, t4);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + t4);
            }
            createInputStream = openContactPhotoInputStream;
        }
        return e(createInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.x
    protected String f() {
        return f12396d;
    }
}
