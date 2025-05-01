.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$l;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryFragmentV3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Ljava/lang/Boolean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$l;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/ArrayList;

    move-result-object p1

    const v0, 0x7f0c0397

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const v1, 0x7f0917b6

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f0917b4

    .line 2
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$l;->a(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;)V

    return-void
.end method
