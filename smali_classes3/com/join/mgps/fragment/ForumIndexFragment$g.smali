.class Lcom/join/mgps/fragment/ForumIndexFragment$g;
.super Ljava/lang/Object;
.source "ForumIndexFragment.java"

# interfaces
.implements Lru/noties/scrollable/j;


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
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment$g;->b:Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public F(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment$g;->b:Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->h0()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2, p3}, Lru/noties/scrollable/j;->F(IJ)V

    :cond_0
    return-void
.end method
