package com.psk.eventmodule.net;

import com.google.gson.Gson;
import com.psk.eventmodule.net.api.EventApi;
import com.psk.eventmodule.net.api.RpcEventFactory;
import com.psk.eventmodule.net.modle.ResponseModel;
import com.psk.eventmodule.net.util.AESUtilV2;
import com.psk.eventmodule.net.util.ApiException;
import com.psk.eventmodule.net.util.LogPrintUtil;
import io.netty.handler.codec.http.HttpHeaders;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.q0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ApiCallEvent.kt */
@DebugMetadata(c = "com.psk.eventmodule.net.StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1", f = "StatCore.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiCallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCallEvent.kt\ncom/psk/eventmodule/net/util/ApiCallEventKt$apiCallEvent$2\n+ 2 StatCore.kt\ncom/psk/eventmodule/net/StatCore$offlineAll$1\n*L\n1#1,23:1\n151#2,24:24\n*E\n"})
/* loaded from: classes5.dex */
public final class StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1 extends SuspendLambda implements Function2<q0, Continuation<? super ResponseModel<Object>>, Object> {
    final /* synthetic */ Ref.ObjectRef $requestList$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1(Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$requestList$inlined = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1 statCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1 = new StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1(continuation, this.$requestList$inlined);
        statCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1.L$0 = obj;
        return statCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super ResponseModel<Object>> continuation) {
        return ((StatCore$offlineAll$1$invokeSuspend$$inlined$apiCallEvent$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                q0 q0Var = (q0) this.L$0;
                String json = new Gson().toJson(this.$requestList$inlined.element);
                LogPrintUtil.Companion companion = LogPrintUtil.Companion;
                if (companion.getPrintLog()) {
                    Intrinsics.checkNotNullExpressionValue(json, "json");
                    companion.printOut("statData", json, "eventjson");
                }
                String jsonSign = AESUtilV2.encrypt(json, "");
                MediaType parse = MediaType.parse(HttpHeaders.Values.APPLICATION_JSON);
                Intrinsics.checkNotNullExpressionValue(jsonSign, "jsonSign");
                byte[] bytes = jsonSign.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                RequestBody create = RequestBody.create(parse, bytes);
                Intrinsics.checkNotNullExpressionValue(create, "create(\n                …y()\n                    )");
                this.label = 1;
                obj = ((EventApi) RpcEventFactory.Companion.getInstance().create(EventApi.class)).sendPoint(create, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (ResponseModel) obj;
        } catch (Throwable th) {
            return ApiException.Companion.build(th).toResponse();
        }
    }
}
