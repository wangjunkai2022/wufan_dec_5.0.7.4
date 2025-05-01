.class public Lcom/join/mgps/adapter/PapaMainDailyNewAdapter;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "PapaMainDailyNewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/HomeDailyNewListBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/HomeDailyNewListBean;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c03f0

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/HomeDailyNewListBean;)V
    .locals 1
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f09078d

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeDailyNewListBean;->getIco()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/HomeDailyNewListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainDailyNewAdapter;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/HomeDailyNewListBean;)V

    return-void
.end method
