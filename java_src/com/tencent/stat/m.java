package com.tencent.stat;
/* loaded from: classes6.dex */
class m implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f63006a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(k kVar) {
        this.f63006a = kVar;
    }

    @Override // com.tencent.stat.c
    public void a() {
        if (n.b().a() >= StatConfig.getMaxBatchReportCount()) {
            n.b().a(StatConfig.getMaxBatchReportCount());
        }
    }

    @Override // com.tencent.stat.c
    public void b() {
    }
}
