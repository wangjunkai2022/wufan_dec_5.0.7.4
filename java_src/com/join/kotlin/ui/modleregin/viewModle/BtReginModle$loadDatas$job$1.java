package com.join.kotlin.ui.modleregin.viewModle;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.join.kotlin.ui.modleregin.modle.BtReginResultMain;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtReginModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1", f = "BtReginModle.kt", i = {0}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nBtReginModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1\n+ 2 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt\n*L\n1#1,610:1\n12#2:611\n*S KotlinDebug\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1\n*L\n65#1:611\n*E\n"})
/* loaded from: classes3.dex */
final class BtReginModle$loadDatas$job$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<RequestModel<RequestGameIdArgs>> $requestModel;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BtReginModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BtReginModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1$1", f = "BtReginModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBtReginModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1855#2,2:611\n1855#2,2:613\n1864#2,2:615\n1855#2,2:617\n1864#2,2:619\n1549#2:621\n1620#2,3:622\n1864#2,3:625\n1866#2:628\n1866#2:629\n*S KotlinDebug\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n*L\n153#1:611,2\n207#1:613,2\n247#1:615,2\n249#1:617,2\n276#1:619,2\n281#1:621\n281#1:622,3\n352#1:625,3\n276#1:628\n247#1:629\n*E\n"})
    /* renamed from: com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<ResponseModel<BtReginResultMain>> $result;
        int label;
        final /* synthetic */ BtReginModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<ResponseModel<BtReginResultMain>> objectRef, BtReginModle btReginModle, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = objectRef;
            this.this$0 = btReginModle;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.this$0, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:239:0x081c, code lost:
            if (r12 == null) goto L323;
         */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0606  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0735 A[Catch: Exception -> 0x0641, TryCatch #3 {Exception -> 0x0641, blocks: (B:67:0x02cc, B:68:0x02ed, B:70:0x02f3, B:72:0x02fd, B:73:0x02ff, B:75:0x0310, B:81:0x031c, B:83:0x0322, B:91:0x0352, B:93:0x035b, B:94:0x0375, B:84:0x032d, B:87:0x0341, B:90:0x034c, B:97:0x039a, B:99:0x03a0, B:101:0x03ae, B:102:0x03be, B:104:0x040f, B:106:0x0415, B:107:0x041b, B:109:0x0421, B:111:0x0448, B:113:0x044e, B:116:0x0466, B:117:0x046b, B:119:0x0471, B:121:0x047d, B:123:0x0487, B:125:0x0493, B:127:0x04a1, B:129:0x04af, B:131:0x04bd, B:133:0x04cb, B:135:0x04d9, B:138:0x04ea, B:151:0x054f, B:153:0x057c, B:155:0x059a, B:115:0x0462, B:156:0x05f6, B:165:0x0638, B:179:0x0669, B:182:0x0674, B:183:0x0679, B:185:0x067f, B:188:0x068c, B:190:0x0693, B:192:0x0699, B:193:0x06b1, B:204:0x0705, B:238:0x0808, B:213:0x0723, B:215:0x0729, B:221:0x0735, B:222:0x0748, B:224:0x074e, B:225:0x0793), top: B:374:0x02cc }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0114 A[Catch: Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:17:0x00e6, B:19:0x00ec, B:23:0x0105, B:24:0x0109, B:25:0x010e, B:27:0x0114, B:29:0x0120, B:31:0x012c, B:33:0x0136, B:35:0x0140, B:37:0x014a, B:39:0x0154, B:41:0x015e, B:43:0x0168, B:46:0x0173, B:50:0x0193, B:52:0x01e7, B:54:0x0209, B:56:0x025c, B:57:0x0280, B:59:0x0290, B:65:0x029c, B:176:0x0661, B:180:0x066c, B:196:0x06b8, B:198:0x06f1, B:199:0x06f7, B:201:0x06fd, B:205:0x0708, B:287:0x09e1, B:289:0x09e8, B:291:0x09ee, B:292:0x09f3, B:294:0x09f9, B:296:0x0a01, B:297:0x0a04, B:299:0x0a29, B:301:0x0a2f, B:304:0x0a47, B:305:0x0a4d, B:307:0x0a53, B:309:0x0a5f, B:311:0x0a6b, B:313:0x0a77, B:315:0x0a85, B:317:0x0a93, B:319:0x0aa1, B:321:0x0aaf, B:323:0x0abd, B:326:0x0ace, B:339:0x0b2c, B:341:0x0b63, B:343:0x0b81, B:303:0x0a43, B:344:0x0bf9, B:230:0x07d0, B:232:0x07d7, B:234:0x07dd, B:236:0x0802, B:243:0x0825, B:244:0x082b, B:246:0x0831, B:248:0x083d, B:250:0x084b, B:252:0x0859, B:254:0x0867, B:256:0x0875, B:258:0x0883, B:260:0x0891, B:262:0x089f, B:265:0x08b0, B:278:0x090a, B:280:0x094e, B:282:0x096c, B:242:0x0821, B:210:0x071a, B:346:0x0c17), top: B:369:0x00e6 }] */
        /* JADX WARN: Removed duplicated region for block: B:362:0x0ccb  */
        /* JADX WARN: Removed duplicated region for block: B:363:0x0cdb  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x029c A[Catch: Exception -> 0x060f, TRY_LEAVE, TryCatch #0 {Exception -> 0x060f, blocks: (B:17:0x00e6, B:19:0x00ec, B:23:0x0105, B:24:0x0109, B:25:0x010e, B:27:0x0114, B:29:0x0120, B:31:0x012c, B:33:0x0136, B:35:0x0140, B:37:0x014a, B:39:0x0154, B:41:0x015e, B:43:0x0168, B:46:0x0173, B:50:0x0193, B:52:0x01e7, B:54:0x0209, B:56:0x025c, B:57:0x0280, B:59:0x0290, B:65:0x029c, B:176:0x0661, B:180:0x066c, B:196:0x06b8, B:198:0x06f1, B:199:0x06f7, B:201:0x06fd, B:205:0x0708, B:287:0x09e1, B:289:0x09e8, B:291:0x09ee, B:292:0x09f3, B:294:0x09f9, B:296:0x0a01, B:297:0x0a04, B:299:0x0a29, B:301:0x0a2f, B:304:0x0a47, B:305:0x0a4d, B:307:0x0a53, B:309:0x0a5f, B:311:0x0a6b, B:313:0x0a77, B:315:0x0a85, B:317:0x0a93, B:319:0x0aa1, B:321:0x0aaf, B:323:0x0abd, B:326:0x0ace, B:339:0x0b2c, B:341:0x0b63, B:343:0x0b81, B:303:0x0a43, B:344:0x0bf9, B:230:0x07d0, B:232:0x07d7, B:234:0x07dd, B:236:0x0802, B:243:0x0825, B:244:0x082b, B:246:0x0831, B:248:0x083d, B:250:0x084b, B:252:0x0859, B:254:0x0867, B:256:0x0875, B:258:0x0883, B:260:0x0891, B:262:0x089f, B:265:0x08b0, B:278:0x090a, B:280:0x094e, B:282:0x096c, B:242:0x0821, B:210:0x071a, B:346:0x0c17), top: B:369:0x00e6 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x031c A[Catch: Exception -> 0x0641, TryCatch #3 {Exception -> 0x0641, blocks: (B:67:0x02cc, B:68:0x02ed, B:70:0x02f3, B:72:0x02fd, B:73:0x02ff, B:75:0x0310, B:81:0x031c, B:83:0x0322, B:91:0x0352, B:93:0x035b, B:94:0x0375, B:84:0x032d, B:87:0x0341, B:90:0x034c, B:97:0x039a, B:99:0x03a0, B:101:0x03ae, B:102:0x03be, B:104:0x040f, B:106:0x0415, B:107:0x041b, B:109:0x0421, B:111:0x0448, B:113:0x044e, B:116:0x0466, B:117:0x046b, B:119:0x0471, B:121:0x047d, B:123:0x0487, B:125:0x0493, B:127:0x04a1, B:129:0x04af, B:131:0x04bd, B:133:0x04cb, B:135:0x04d9, B:138:0x04ea, B:151:0x054f, B:153:0x057c, B:155:0x059a, B:115:0x0462, B:156:0x05f6, B:165:0x0638, B:179:0x0669, B:182:0x0674, B:183:0x0679, B:185:0x067f, B:188:0x068c, B:190:0x0693, B:192:0x0699, B:193:0x06b1, B:204:0x0705, B:238:0x0808, B:213:0x0723, B:215:0x0729, B:221:0x0735, B:222:0x0748, B:224:0x074e, B:225:0x0793), top: B:374:0x02cc }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x038d  */
        /* JADX WARN: Type inference failed for: r14v55, types: [T, com.join.kotlin.ui.modleregin.modle.BtOnlineGame] */
        /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r57) {
            /*
                Method dump skipped, instructions count: 3319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtReginModle$loadDatas$job$1(Ref.ObjectRef<RequestModel<RequestGameIdArgs>> objectRef, BtReginModle btReginModle, Context context, Continuation<? super BtReginModle$loadDatas$job$1> continuation) {
        super(2, continuation);
        this.$requestModel = objectRef;
        this.this$0 = btReginModle;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BtReginModle$loadDatas$job$1(this.$requestModel, this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BtReginModle$loadDatas$job$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Ref.ObjectRef objectRef;
        T t4;
        Ref.ObjectRef objectRef2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef<RequestModel<RequestGameIdArgs>> objectRef4 = this.$requestModel;
            CoroutineDispatcher c5 = d1.c();
            BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 btReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 = new BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1(null, objectRef4);
            this.L$0 = objectRef3;
            this.L$1 = objectRef3;
            this.label = 1;
            Object h4 = i.h(c5, btReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1, this);
            if (h4 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef3;
            t4 = h4;
            objectRef2 = objectRef;
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            objectRef = (Ref.ObjectRef) this.L$1;
            objectRef2 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t4 = obj;
        }
        objectRef.element = t4;
        k.f(s1.f71252b, d1.e(), null, new AnonymousClass1(objectRef2, this.this$0, this.$context, null), 2, null);
        return Unit.INSTANCE;
    }
}
