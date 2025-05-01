package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.RequestModGameArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.wufan.user.service.protobuf.n0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CloudShareViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.CloudShareViewModle$getDetialData$1", f = "CloudShareViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CloudShareViewModle$getDetialData$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $gameId;
    int label;
    final /* synthetic */ CloudShareViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CloudShareViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.CloudShareViewModle$getDetialData$1$1", f = "CloudShareViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.join.kotlin.ui.cloudarchive.CloudShareViewModle$getDetialData$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<ResponseModel<ModGameDetailBean>> $main;
        int label;
        final /* synthetic */ CloudShareViewModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CloudShareViewModle cloudShareViewModle, Ref.ObjectRef<ResponseModel<ModGameDetailBean>> objectRef, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cloudShareViewModle;
            this.$main = objectRef;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$main, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GamedetialModleFourBean main_game_info;
            GamedetialModleFourBean mod_game_info;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getShowDialog().setValue(Boxing.boxBoolean(false));
                CloudShareViewModle cloudShareViewModle = this.this$0;
                ModGameDetailBean data = this.$main.element.getData();
                String str = null;
                ModGameArchivePathData cloud_archive_local_path = data != null ? data.getCloud_archive_local_path() : null;
                if (cloud_archive_local_path == null) {
                    cloud_archive_local_path = new ModGameArchivePathData();
                }
                cloudShareViewModle.setModGameArchivePathData(cloud_archive_local_path);
                ModGameArchivePathData modGameArchivePathData = this.this$0.getModGameArchivePathData();
                ModGameDetailBean data2 = this.$main.element.getData();
                modGameArchivePathData.setModPackageName((data2 == null || (mod_game_info = data2.getMod_game_info()) == null) ? null : mod_game_info.getPackageName());
                ModGameArchivePathData modGameArchivePathData2 = this.this$0.getModGameArchivePathData();
                ModGameDetailBean data3 = this.$main.element.getData();
                if (data3 != null && (main_game_info = data3.getMain_game_info()) != null) {
                    str = main_game_info.getPackageName();
                }
                modGameArchivePathData2.setMainGamePackageName(str);
                this.this$0.loadLocalArchiveDatas(this.$context);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudShareViewModle$getDetialData$1(Context context, String str, CloudShareViewModle cloudShareViewModle, Continuation<? super CloudShareViewModle$getDetialData$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$gameId = str;
        this.this$0 = cloudShareViewModle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CloudShareViewModle$getDetialData$1(this.$context, this.$gameId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CloudShareViewModle$getDetialData$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [T, com.join.mgps.dto.ResponseModel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (com.join.android.app.common.utils.j.j(this.$context)) {
                try {
                    n0 accountData = AccountUtil_.getInstance_(this.$context).getAccountData();
                    if (accountData == null) {
                        accountData = n0.b5();
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    RequestModel<RequestModGameArgs> requestModel = new RequestModel<>();
                    RequestModGameArgs requestModGameArgs = new RequestModGameArgs();
                    requestModGameArgs.setUid(accountData.getUid());
                    requestModGameArgs.setUserToken(accountData.getToken());
                    requestModGameArgs.setGameId(this.$gameId);
                    requestModel.setArgs(requestModGameArgs);
                    requestModel.setDefault(this.$context);
                    ?? B = com.join.mgps.rpc.impl.i.D0().B(requestModel);
                    objectRef.element = B;
                    if (B != 0 && ((ResponseModel) B).getCode() == 200) {
                        kotlinx.coroutines.k.f(s1.f71252b, d1.e(), null, new AnonymousClass1(this.this$0, objectRef, this.$context, null), 2, null);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            this.this$0.getShowDialog().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
