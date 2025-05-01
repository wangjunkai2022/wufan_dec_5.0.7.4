.class Lcom/join/mgps/adapter/ForumCommentAdapter$d;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;->Y(Landroid/view/View;IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/adapter/ForumCommentAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->e:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->b:I

    iput p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->c:I

    iput-object p4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->e:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->e:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object p1

    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->b:I

    iget v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->c:I

    iget-object v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->k(IILjava/lang/String;)V

    :cond_0
    return-void
.end method
