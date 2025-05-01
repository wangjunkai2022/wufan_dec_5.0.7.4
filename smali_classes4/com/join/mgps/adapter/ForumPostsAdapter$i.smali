.class Lcom/join/mgps/adapter/ForumPostsAdapter$i;
.super Ljava/lang/Object;
.source "ForumPostsAdapter.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumPostsAdapter;->q0(Landroid/view/View;ZZIILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:I

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/join/mgps/adapter/ForumPostsAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumPostsAdapter;IZZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->h:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->b:I

    iput-boolean p3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->c:Z

    iput-boolean p4, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->d:Z

    iput p5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->e:I

    iput-object p6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->h:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j(Lcom/join/mgps/adapter/ForumPostsAdapter;)Lcom/join/mgps/adapter/ForumPostsAdapter$b0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->h:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j(Lcom/join/mgps/adapter/ForumPostsAdapter;)Lcom/join/mgps/adapter/ForumPostsAdapter$b0;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->b:I

    invoke-interface {v0, p1, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$b0;->i(Landroid/view/View;I)V

    .line 3
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->h:Lcom/join/mgps/adapter/ForumPostsAdapter;

    const/4 v4, 0x2

    iget-boolean v5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->c:Z

    iget-boolean v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->d:Z

    iget v7, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->b:I

    iget v8, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->e:I

    iget-object v9, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->f:Ljava/lang/String;

    iget-object v10, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$i;->g:Ljava/lang/String;

    move-object v3, p1

    invoke-virtual/range {v2 .. v10}, Lcom/join/mgps/adapter/ForumPostsAdapter;->B0(Landroid/view/View;IZZIILjava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
