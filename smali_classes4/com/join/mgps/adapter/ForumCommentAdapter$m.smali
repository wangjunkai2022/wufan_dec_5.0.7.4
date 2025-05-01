.class Lcom/join/mgps/adapter/ForumCommentAdapter$m;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;->O(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

.field final synthetic d:I

.field final synthetic e:Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

.field final synthetic f:I

.field final synthetic g:Lcom/join/mgps/adapter/ForumCommentAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter;ILcom/join/mgps/dto/ForumBean$ForumCommentBean;ILcom/join/mgps/adapter/ForumCommentAdapter$z$d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->b:I

    iput-object p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->c:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    iput p4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->d:I

    iput-object p5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->e:Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    iput p6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 12

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->b:I

    if-ge v0, v3, :cond_3

    .line 2
    new-instance v6, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->c:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    invoke-direct {v6, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;-><init>(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V

    .line 3
    invoke-virtual {v6}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v3

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    add-int/lit8 v10, v0, 0x3

    .line 5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v11, 0x1

    if-ge v10, v5, :cond_0

    .line 6
    invoke-interface {v3, v0, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 7
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v3, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v2, 0x1

    .line 8
    :goto_1
    invoke-virtual {v6, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setReply_list(Ljava/util/List;)V

    .line 9
    iget-object v4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget v5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->d:I

    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->e:Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    iget v7, v0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->c:I

    if-nez v1, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    iget-boolean v9, v0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->e:Z

    invoke-virtual/range {v4 .. v9}, Lcom/join/mgps/adapter/ForumCommentAdapter;->z(ILcom/join/mgps/dto/ForumBean$ForumCommentBean;IZZ)Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    .line 11
    iput v1, v3, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->f:I

    .line 12
    iput-boolean v2, v3, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->g:Z

    if-nez v1, :cond_2

    const/4 v4, 0x1

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    .line 13
    :goto_3
    iput-boolean v4, v3, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->d:Z

    .line 14
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    xor-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v0, v4}, Lcom/join/mgps/adapter/ForumCommentAdapter;->R(Lcom/join/mgps/adapter/ForumCommentAdapter$z;Z)V

    .line 15
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget v4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->f:I

    add-int/2addr v4, v1

    add-int/2addr v4, v11

    invoke-virtual {v3, v4, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    move v0, v10

    goto :goto_0

    .line 16
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->f:I

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->remove(I)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$m;->g:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
