package com.psk.eventmodule.net;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StatCore.kt */
@DebugMetadata(c = "com.psk.eventmodule.net.StatCore$offlineAll$1", f = "StatCore.kt", i = {1, 1}, l = {117, 200}, m = "invokeSuspend", n = {"tableList", "result"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nStatCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatCore.kt\ncom/psk/eventmodule/net/StatCore$offlineAll$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ApiCallEvent.kt\ncom/psk/eventmodule/net/util/ApiCallEventKt\n*L\n1#1,192:1\n766#2:193\n857#2,2:194\n1549#2:196\n1620#2,3:197\n1855#2,2:201\n12#3:200\n*S KotlinDebug\n*F\n+ 1 StatCore.kt\ncom/psk/eventmodule/net/StatCore$offlineAll$1\n*L\n124#1:193\n124#1:194,2\n127#1:196\n127#1:197,3\n176#1:201,2\n150#1:200\n*E\n"})
/* loaded from: classes5.dex */
public final class StatCore$offlineAll$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StatCore$offlineAll$1(Continuation<? super StatCore$offlineAll$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new StatCore$offlineAll$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((StatCore$offlineAll$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if ((r8 == null || r8.length() == 0) != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.util.Collection, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.psk.eventmodule.net.StatCore$offlineAll$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
