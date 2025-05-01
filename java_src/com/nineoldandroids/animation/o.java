package com.nineoldandroids.animation;
/* compiled from: TimeAnimator.java */
/* loaded from: classes5.dex */
public class o extends q {
    private a O;
    private long P = -1;

    /* compiled from: TimeAnimator.java */
    /* loaded from: classes5.dex */
    public interface a {
        void a(o oVar, long j4, long j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.nineoldandroids.animation.q
    public void D(float f5) {
    }

    @Override // com.nineoldandroids.animation.q
    boolean E(long j4) {
        if (this.f57776j == 0) {
            this.f57776j = 1;
            long j5 = this.f57770d;
            if (j5 < 0) {
                this.f57769c = j4;
            } else {
                this.f57769c = j4 - j5;
                this.f57770d = -1L;
            }
        }
        a aVar = this.O;
        if (aVar != null) {
            long j6 = j4 - this.f57769c;
            long j7 = this.P;
            long j8 = j7 >= 0 ? j4 - j7 : 0L;
            this.P = j4;
            aVar.a(this, j6, j8);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.nineoldandroids.animation.q
    public void T() {
    }

    public void n0(a aVar) {
        this.O = aVar;
    }
}
