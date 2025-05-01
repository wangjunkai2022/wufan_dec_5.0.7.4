package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CloudShareViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1", f = "CloudShareViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CloudShareViewModle$loadLocalArchiveDatas$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ CloudShareViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CloudShareViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1$1", f = "CloudShareViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<ArchiveData>> $archiveList;
        int label;
        final /* synthetic */ CloudShareViewModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CloudShareViewModle cloudShareViewModle, Ref.ObjectRef<List<ArchiveData>> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cloudShareViewModle;
            this.$archiveList = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$archiveList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setInitFinish(true);
                List<ArchiveData> value = this.this$0.getLocalArchiveLists().getValue();
                if (value != null) {
                    value.clear();
                }
                List<ArchiveData> value2 = this.this$0.getLocalArchiveLists().getValue();
                if (value2 != null) {
                    Boxing.boxBoolean(value2.addAll(this.$archiveList.element));
                }
                this.this$0.getLocalArchiveLists().setValue(this.this$0.getLocalArchiveLists().getValue());
                this.this$0.getShowDialog().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudShareViewModle$loadLocalArchiveDatas$1(CloudShareViewModle cloudShareViewModle, Context context, Continuation<? super CloudShareViewModle$loadLocalArchiveDatas$1> continuation) {
        super(2, continuation);
        this.this$0 = cloudShareViewModle;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CloudShareViewModle$loadLocalArchiveDatas$1(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CloudShareViewModle$loadLocalArchiveDatas$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            if (r0 != 0) goto Led
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.element = r0
            com.join.mgps.va.overmind.d$a r0 = com.join.mgps.va.overmind.d.f54937g
            com.join.mgps.va.overmind.d r1 = r0.d()
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r2 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r2 = r2.getModGameArchivePathData()
            java.lang.String r2 = r2.getModPackageName()
            boolean r1 = r1.N(r2)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L92
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r1 = r10.this$0
            r1.setInstallInExtPlug(r3)
            com.join.mgps.va.overmind.d r0 = r0.d()
            boolean r0 = r0.L()
            if (r0 == 0) goto L92
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r0 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r1 = r0.getModGameArchivePathData()
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r4 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r4 = r4.getModGameArchivePathData()
            java.lang.String r4 = r4.getMainArchiveLocalPath()
            java.lang.String r5 = "modGameArchivePathData.mainArchiveLocalPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.content.Context r5 = r10.$context
            T r6 = r11.element
            java.util.List r6 = (java.util.List) r6
            r0.loadLocalExtArchiveMain(r1, r4, r5, r6)
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r0 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r0 = r0.getModGameArchivePathData()
            java.lang.String r0 = r0.getSubArchiveLocalPath()
            java.lang.String r1 = "modGameArchivePathData.subArchiveLocalPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L93
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r0 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r4 = r0.getModGameArchivePathData()
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r5 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r5 = r5.getModGameArchivePathData()
            java.lang.String r5 = r5.getSubArchiveLocalPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            android.content.Context r1 = r10.$context
            T r6 = r11.element
            java.util.List r6 = (java.util.List) r6
            r0.loadLocalExtArchiveMain(r4, r5, r1, r6)
            goto L93
        L92:
            r3 = 0
        L93:
            if (r3 != 0) goto La6
            T r0 = r11.element
            java.util.List r0 = (java.util.List) r0
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r1 = r10.this$0
            com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r3 = r1.getModGameArchivePathData()
            java.util.List r1 = r1.loadLocalArchive(r3)
            r0.addAll(r1)
        La6:
            T r0 = r11.element
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        Lae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld6
            int r1 = r2 + 1
            java.lang.Object r3 = r0.next()
            com.join.kotlin.ui.cloudarchive.data.ArchiveData r3 = (com.join.kotlin.ui.cloudarchive.data.ArchiveData) r3
            if (r2 == 0) goto Ld4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.getArchiveDesc()
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.setArchiveDesc(r2)
        Ld4:
            r2 = r1
            goto Lae
        Ld6:
            kotlinx.coroutines.s1 r4 = kotlinx.coroutines.s1.f71252b
            kotlinx.coroutines.j2 r5 = kotlinx.coroutines.d1.e()
            r6 = 0
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1$1 r7 = new com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1$1
            com.join.kotlin.ui.cloudarchive.CloudShareViewModle r0 = r10.this$0
            r1 = 0
            r7.<init>(r0, r11, r1)
            r8 = 2
            r9 = 0
            kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Led:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            goto Lf6
        Lf5:
            throw r11
        Lf6:
            goto Lf5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.CloudShareViewModle$loadLocalArchiveDatas$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
