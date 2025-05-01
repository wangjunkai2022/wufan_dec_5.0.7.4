.class Lcom/join/mgps/adapter/ForumPostsAdapter$s;
.super Ljava/lang/Object;
.source "ForumPostsAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumPostsAdapter;->H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/adapter/ForumPostsAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->c:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->c:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter;->h:Lcom/join/android/app/component/video/c;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->A()I

    move-result p1

    iget v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->b:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->c:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter;->h:Lcom/join/android/app/component/video/c;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->D()I

    move-result p1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$s;->c:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter;->h:Lcom/join/android/app/component/video/c;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->t()V

    :cond_0
    return-void
.end method
