.class Lcom/join/mgps/fragment/ForumIndexFragment$f;
.super Ljava/lang/Object;
.source "ForumIndexFragment.java"

# interfaces
.implements Lru/noties/scrollable/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumIndexFragment;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/ForumIndexFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment$f;->b:Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public q(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment$f;->b:Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->h0()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lru/noties/scrollable/b;->q(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
