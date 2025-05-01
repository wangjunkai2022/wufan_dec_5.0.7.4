.class Lcom/join/mgps/activity/GameInformationActivityV2$g;
.super Ljava/lang/Object;
.source "GameInformationActivityV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationActivityV2;->I0(Landroid/view/View;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

.field final synthetic f:Lcom/join/mgps/activity/GameInformationActivityV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2;IILjava/lang/String;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iput p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->b:I

    iput p3, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->c:I

    iput-object p4, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->e:Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->b:I

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p1, Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->b:I

    :goto_0
    if-ltz v1, :cond_3

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v2, v2, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    iget v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->c:I

    sub-int/2addr v3, v1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    const/4 v3, 0x0

    .line 6
    iget-object v4, v2, Lcom/join/mgps/activity/GameInformationActivityV2$m;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v4}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v4

    sget-object v5, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-virtual {v5}, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->vaule()I

    move-result v5

    if-ne v4, v5, :cond_1

    .line 7
    iget-object v2, v2, Lcom/join/mgps/activity/GameInformationActivityV2$m;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    :cond_1
    if-eqz v3, :cond_2

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->d:Ljava/lang/String;

    iget-object v4, v3, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->a:Ljava/lang/String;

    if-ne v2, v4, :cond_2

    .line 9
    iget-object v2, v3, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 10
    :goto_1
    iget v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->b:I

    if-gt v1, v2, :cond_4

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v2, v2, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    iget v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->c:I

    sub-int/2addr v3, v1

    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 12
    :cond_4
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setReplyList(Ljava/util/List;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->e:Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    iget v2, v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->c:I

    const/4 v3, 0x1

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/join/mgps/activity/GameInformationActivityV2;->u0(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)Lcom/join/mgps/activity/GameInformationActivityV2$m;

    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    iget v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->c:I

    iget v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->b:I

    sub-int/2addr v1, v2

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->j0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$g;->f:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    invoke-interface {p1}, Lcom/join/mgps/activity/GameInformationActivityV2$n;->d()V

    return-void
.end method
