.class public final Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;
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
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    const p1, 0x7f0c037f

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;-><init>(I)V

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V
    .locals 1
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
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;",
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

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->dataVal()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/CommonGameInfoBean;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;->f(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;->c()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 5
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p3

    if-eqz p3, :cond_1

    const-string v0, "g_info"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardBinding;->b:Landroid/widget/LinearLayout;

    .line 7
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p3

    .line 9
    invoke-virtual {p2, p1, v0, p3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;->addTags(Landroid/widget/LinearLayout;Ljava/util/List;Lcom/join/mgps/dto/TipNew;)V

    :cond_1
    return-void
.end method
