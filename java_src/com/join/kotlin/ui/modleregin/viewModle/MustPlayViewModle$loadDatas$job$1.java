package com.join.kotlin.ui.modleregin.viewModle;

import android.content.Context;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.MustplayItemNetBean;
import com.join.mgps.Util.l2;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MustPlayViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle$loadDatas$job$1", f = "MustPlayViewModle.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nMustPlayViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MustPlayViewModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1\n+ 2 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt\n*L\n1#1,139:1\n12#2:140\n*S KotlinDebug\n*F\n+ 1 MustPlayViewModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1\n*L\n54#1:140\n*E\n"})
/* loaded from: classes3.dex */
final class MustPlayViewModle$loadDatas$job$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<RequestModel<RequestGameIdArgs>> $requestModel;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MustPlayViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MustPlayViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle$loadDatas$job$1$1", f = "MustPlayViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle$loadDatas$job$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<ResponseModel<List<MustplayItemNetBean>>> $result;
        int label;
        final /* synthetic */ MustPlayViewModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<ResponseModel<List<MustplayItemNetBean>>> objectRef, MustPlayViewModle mustPlayViewModle, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = objectRef;
            this.this$0 = mustPlayViewModle;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List split$default;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$result.element.getCode() == 200) {
                    if (this.this$0.getPage() == 1) {
                        List<MustplayItemBean> value = this.this$0.getShowDatas().getValue();
                        Intrinsics.checkNotNull(value);
                        value.clear();
                    }
                    List<MustplayItemBean> value2 = this.this$0.getShowDatas().getValue();
                    Intrinsics.checkNotNull(value2);
                    int size = value2.size();
                    if (this.$result.element.getData() != null && !this.$result.element.getData().isEmpty()) {
                        int i4 = 0;
                        for (MustplayItemNetBean mustplayItemNetBean : this.$result.element.getData()) {
                            int i5 = i4 + 1;
                            if (mustplayItemNetBean.getGameInfo() != null) {
                                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(mustplayItemNetBean.getGameInfo());
                                collectionBeanSubBusiness.set_from(145);
                                collectionBeanSubBusiness.set_from_type(145);
                                collectionBeanSubBusiness.setRecPosition(String.valueOf(collectionBeanSubBusiness.getIndex()));
                                this.this$0.updateDowState(collectionBeanSubBusiness);
                                String gameVideo = mustplayItemNetBean.getGameVideo();
                                String gameImg = mustplayItemNetBean.getGameImg();
                                String game_info_top_video_url = collectionBeanSubBusiness.getGame_info_top_video_url();
                                split$default = StringsKt__StringsKt.split$default((CharSequence) mustplayItemNetBean.getGameTags(), new String[]{"|"}, false, 0, 6, (Object) null);
                                MustplayItemBean mustplayItemBean = new MustplayItemBean(i4 + size, gameVideo, gameImg, game_info_top_video_url, split$default, mustplayItemNetBean.getGameName(), mustplayItemNetBean.getGameTitle(), collectionBeanSubBusiness, null, null, 768, null);
                                List<MustplayItemBean> value3 = this.this$0.getShowDatas().getValue();
                                Intrinsics.checkNotNull(value3);
                                value3.add(mustplayItemBean);
                            }
                            i4 = i5;
                        }
                        MustPlayViewModle mustPlayViewModle = this.this$0;
                        mustPlayViewModle.setPage(mustPlayViewModle.getPage() + 1);
                        this.this$0.getRecycleViewStatus().setValue(Boxing.boxInt(2));
                        this.this$0.getShowDatas().setValue(this.this$0.getShowDatas().getValue());
                    } else {
                        this.this$0.getRecycleViewStatus().setValue(Boxing.boxInt(4));
                    }
                } else {
                    l2.a(this.$context).b(this.$result.element.getMessage());
                }
                List<MustplayItemBean> value4 = this.this$0.getShowDatas().getValue();
                Intrinsics.checkNotNull(value4);
                if (value4.size() > 0) {
                    this.this$0.getLoadBindData().setValue(new LoadBindindData(1));
                } else {
                    this.this$0.getLoadBindData().setValue(new LoadBindindData(3));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MustPlayViewModle$loadDatas$job$1(Ref.ObjectRef<RequestModel<RequestGameIdArgs>> objectRef, MustPlayViewModle mustPlayViewModle, Context context, Continuation<? super MustPlayViewModle$loadDatas$job$1> continuation) {
        super(2, continuation);
        this.$requestModel = objectRef;
        this.this$0 = mustPlayViewModle;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MustPlayViewModle$loadDatas$job$1(this.$requestModel, this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((MustPlayViewModle$loadDatas$job$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MustPlayViewModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 mustPlayViewModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 = new MustPlayViewModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1(null, objectRef4);
            this.L$0 = objectRef3;
            this.L$1 = objectRef3;
            this.label = 1;
            Object h4 = i.h(c5, mustPlayViewModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1, this);
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
