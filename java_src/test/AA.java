package test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: AA.kt */
/* loaded from: classes7.dex */
public final class AA {
    public final void a() {
        a.a("111", new Function1<Integer, Unit>() { // from class: test.AA$Test$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i4) {
                AA.this.b(i4);
            }
        });
    }

    public final void b(int i4) {
    }

    public final void c() {
    }
}
