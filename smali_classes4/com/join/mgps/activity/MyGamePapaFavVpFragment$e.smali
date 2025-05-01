.class Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "MyGamePapaFavVpFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MyGamePapaFavVpFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/MyGamePapaFavVpFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    const p1, 0x7f0c03e6

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f09156c

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "#FFFFFF"

    goto :goto_0

    :cond_0
    const-string v0, "#262626"

    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->isSelected()Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x7f080e11

    goto :goto_1

    :cond_1
    const p2, 0x7f080e12

    :goto_1
    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;)V

    return-void
.end method
