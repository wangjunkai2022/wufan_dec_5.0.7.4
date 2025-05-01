.class Lcom/join/mgps/fragment/ForumPostsFragment$d;
.super Ljava/lang/Object;
.source "ForumPostsFragment.java"

# interfaces
.implements Lcom/join/mgps/listener/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ForumPostsFragment;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/ForumPostsFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ForumPostsFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ForumPostsFragment$d;->a:Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumPostsFragment$d;->a:Lcom/join/mgps/fragment/ForumPostsFragment;

    iget-object v1, v0, Lcom/join/mgps/fragment/ForumPostsFragment;->m:Lcom/join/mgps/customview/XListView2;

    invoke-static {v0}, Lcom/join/mgps/fragment/ForumPostsFragment;->V(Lcom/join/mgps/fragment/ForumPostsFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f07106d

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Landroid/widget/ListView;->smoothScrollToPositionFromTop(II)V

    return-void
.end method
