.class Lcom/join/mgps/adapter/ForumPostsAdapter$u;
.super Ljava/lang/Object;
.source "ForumPostsAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumPostsAdapter;->F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ForumPostsAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$u;->b:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$u;->b:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k(Lcom/join/mgps/adapter/ForumPostsAdapter;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lcom/join/mgps/dialog/c0;

    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$u;->b:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->i(Lcom/join/mgps/adapter/ForumPostsAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/dialog/c0;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$u$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$u$a;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$u;Lcom/join/mgps/dialog/c0;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/c0;->a(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
