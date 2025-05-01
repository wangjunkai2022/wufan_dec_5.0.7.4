.class Lcom/join/mgps/adapter/ForumPostsAdapter$x$a;
.super Ljava/lang/Object;
.source "ForumPostsAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumPostsAdapter$x;->g(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ForumPostsAdapter$x;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumPostsAdapter$x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$x$a;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$x$a;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v0, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->d:I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$x$a;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->h:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->dismiss()V

    return-void
.end method
