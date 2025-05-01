package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class u implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f63026a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f63027b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n f63028c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(n nVar, List list, int i4) {
        this.f63028c = nVar;
        this.f63026a = list;
        this.f63027b = i4;
    }

    @Override // com.tencent.stat.c
    public void a() {
        this.f63028c.a(this.f63026a);
    }

    @Override // com.tencent.stat.c
    public void b() {
        this.f63028c.a(this.f63026a, 1);
        this.f63028c.f63010b += this.f63027b;
    }
}
