.class Lcom/join/mgps/fragment/ForumIndexFragment$h;
.super Ljava/lang/Object;
.source "ForumIndexFragment.java"

# interfaces
.implements Lru/noties/scrollable/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumIndexFragment;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/ForumIndexFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment$h;->a:Lcom/join/mgps/fragment/ForumIndexFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(III)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment$h;->a:Lcom/join/mgps/fragment/ForumIndexFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/fragment/ForumPostsFragment;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment$h;->a:Lcom/join/mgps/fragment/ForumIndexFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    invoke-interface {p1}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/ForumPostsFragment;->F0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
