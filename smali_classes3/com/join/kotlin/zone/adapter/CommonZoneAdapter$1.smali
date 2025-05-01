.class public final Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$1;
.super Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;
.source "CommonZoneAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;-><init>(Lcom/join/android/app/component/video/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl<",
        "Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneAdBinding;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const v0, 0x7f0c037c

    .line 1
    invoke-direct {p0, v0}, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;-><init>(I)V

    return-void
.end method


# virtual methods
.method public isFullSpanItem(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$1;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneAdBinding;",
            ">;I",
            "Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneAdBinding;

    if-eqz p1, :cond_1

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->dataVal()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneAdBinding;->f(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_1
    return-void
.end method
