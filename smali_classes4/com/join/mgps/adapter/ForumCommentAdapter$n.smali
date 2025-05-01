.class Lcom/join/mgps/adapter/ForumCommentAdapter$n;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"

# interfaces
.implements Lcom/join/mgps/customview/TextViewWithHyperlink$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;->O(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/adapter/ForumCommentAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->d:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->a:I

    iput p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->b:I

    iput-object p4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->d:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->d:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->a:I

    iget v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->b:I

    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->k(IILjava/lang/String;)V

    :cond_0
    return-void
.end method
