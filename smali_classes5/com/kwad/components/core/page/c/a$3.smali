.class final Lcom/kwad/components/core/page/c/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/FeedVideoView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/page/c/a;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Pb:Lcom/kwad/components/core/page/recycle/e;

.field final synthetic Pc:Lcom/kwad/components/core/page/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/c/a;Lcom/kwad/components/core/page/recycle/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a$3;->Pc:Lcom/kwad/components/core/page/c/a;

    iput-object p2, p0, Lcom/kwad/components/core/page/c/a$3;->Pb:Lcom/kwad/components/core/page/recycle/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final pP()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a$3;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object v0, v0, Lcom/kwad/components/core/page/recycle/e;->QC:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a$3;->Pc:Lcom/kwad/components/core/page/c/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result v0

    invoke-static {v1, v0}, Lcom/kwad/components/core/page/c/a;->a(Lcom/kwad/components/core/page/c/a;I)I

    :cond_0
    return-void
.end method

.method public final pQ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a$3;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object v0, v0, Lcom/kwad/components/core/page/recycle/e;->QC:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a$3;->Pc:Lcom/kwad/components/core/page/c/a;

    invoke-static {v1}, Lcom/kwad/components/core/page/c/a;->b(Lcom/kwad/components/core/page/c/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method
