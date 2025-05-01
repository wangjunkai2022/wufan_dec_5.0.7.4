.class Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter$t;->g(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ForumCommentAdapter$t;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter$t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->d:I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->dismiss()V

    return-void
.end method
