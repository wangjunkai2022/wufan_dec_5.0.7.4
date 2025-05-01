.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$j;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryFragmentV3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/EndGameNameListBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/DiscoveryFragmentV3;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$j;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    const p1, 0x7f0c03cf

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameNameListBean;)V
    .locals 3
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f0908e9

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f09151e

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameNameListBean;->isSelected()Z

    move-result v0

    const v2, 0x7f09123c

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameNameListBean;->isSelected()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "#3FABFF"

    goto :goto_0

    :cond_0
    const-string p2, "#A1A0A0"

    :goto_0
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$j;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameNameListBean;)V

    return-void
.end method
