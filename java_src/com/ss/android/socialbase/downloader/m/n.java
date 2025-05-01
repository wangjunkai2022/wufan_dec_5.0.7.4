package com.ss.android.socialbase.downloader.m;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.ss.android.socialbase.downloader.wv.wv;
/* loaded from: classes5.dex */
public class n {

    /* renamed from: i  reason: collision with root package name */
    private final String[] f61135i;

    /* renamed from: m  reason: collision with root package name */
    private final String f61136m;

    /* renamed from: n  reason: collision with root package name */
    private SQLiteStatement f61137n;

    /* renamed from: o  reason: collision with root package name */
    private SQLiteStatement f61138o;

    /* renamed from: p  reason: collision with root package name */
    private final String[] f61139p;
    private SQLiteStatement qv;

    /* renamed from: u  reason: collision with root package name */
    private SQLiteStatement f61140u;
    private final SQLiteDatabase vv;

    public n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.vv = sQLiteDatabase;
        this.f61136m = str;
        this.f61139p = strArr;
        this.f61135i = strArr2;
    }

    public SQLiteStatement i() {
        if (this.qv == null) {
            SQLiteStatement compileStatement = this.vv.compileStatement(wv.m(this.f61136m, this.f61139p, this.f61135i));
            synchronized (this) {
                if (this.qv == null) {
                    this.qv = compileStatement;
                }
            }
            if (this.qv != compileStatement) {
                compileStatement.close();
            }
        }
        return this.qv;
    }

    public SQLiteStatement m() {
        if (this.f61137n == null) {
            SQLiteStatement compileStatement = this.vv.compileStatement(wv.vv(this.f61136m, this.f61135i));
            synchronized (this) {
                if (this.f61137n == null) {
                    this.f61137n = compileStatement;
                }
            }
            if (this.f61137n != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f61137n;
    }

    public SQLiteStatement p() {
        if (this.f61140u == null) {
            SQLiteStatement compileStatement = this.vv.compileStatement(wv.vv(this.f61136m, this.f61139p, this.f61135i));
            synchronized (this) {
                if (this.f61140u == null) {
                    this.f61140u = compileStatement;
                }
            }
            if (this.f61140u != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f61140u;
    }

    public SQLiteStatement vv() {
        if (this.f61138o == null) {
            SQLiteStatement compileStatement = this.vv.compileStatement(wv.vv("INSERT INTO ", this.f61136m, this.f61139p));
            synchronized (this) {
                if (this.f61138o == null) {
                    this.f61138o = compileStatement;
                }
            }
            if (this.f61138o != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f61138o;
    }
}
