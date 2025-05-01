.class Lcom/join/mgps/fragment/CloudListFragmentV2$i;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "CloudListFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/CloudListDataBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    .line 2
    iget-object p1, p1, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    const v0, 0x7f0c0373

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 10
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const p2, 0x7f0903b4

    .line 1
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/customview/ClouldItemView3;

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v8

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/ClouldItemView3;->setCloudItemListener(Lcom/join/mgps/listener/c;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x1

    sub-int/2addr v0, v9

    if-ne v0, v8, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v1, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->m:Ljava/lang/String;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/join/mgps/dto/CloudListDataBean;

    iget-object v7, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v3, v7, Lcom/join/mgps/fragment/CloudListFragmentV2;->l:I

    iget v4, v7, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/customview/ClouldItemView3;->setData(Ljava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;IIZZLcom/join/mgps/listener/c;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v1, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->m:Ljava/lang/String;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/join/mgps/dto/CloudListDataBean;

    iget-object v7, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v3, v7, Lcom/join/mgps/fragment/CloudListFragmentV2;->l:I

    iget v4, v7, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/customview/ClouldItemView3;->setData(Ljava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;IIZZLcom/join/mgps/listener/c;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->t:Lcom/join/mgps/activity/GameMainActivity4;

    iget-boolean v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->z2:Z

    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/ClouldItemView3;->setGBAType(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->t:Lcom/join/mgps/activity/GameMainActivity4;

    iget-boolean v1, v0, Lcom/join/mgps/activity/GameMainActivity4;->B2:Z

    iget-boolean v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->C2:Z

    invoke-virtual {p2, v1, v0}, Lcom/join/mgps/customview/ClouldItemView3;->setPGN(ZZ)V

    .line 9
    iget-object p2, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget p2, p2, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/4 v0, 0x4

    const v1, 0x7f090d2b

    if-ne p2, v0, :cond_1

    .line 10
    invoke-virtual {p1, v1, v9}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const p2, 0x7f0916a0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v1, v1, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    .line 11
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CloudListDataBean;->getTodayCoin()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const p2, 0x7f0916bf

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v2, v2, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    .line 12
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CloudListDataBean;->getTotalCoin()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 13
    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2$i;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method
