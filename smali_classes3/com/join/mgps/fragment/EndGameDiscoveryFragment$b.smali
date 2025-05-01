.class Lcom/join/mgps/fragment/EndGameDiscoveryFragment$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "EndGameDiscoveryFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$b;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$b;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->Z()V

    :cond_0
    return-void
.end method
