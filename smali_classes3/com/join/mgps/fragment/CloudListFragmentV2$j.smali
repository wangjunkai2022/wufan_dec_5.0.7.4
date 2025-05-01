.class Lcom/join/mgps/fragment/CloudListFragmentV2$j;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "CloudListFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/join/mgps/fragment/CloudListFragmentV2$h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/fragment/CloudListFragmentV2$h;I)V
    .locals 20
    .param p1    # Lcom/join/mgps/fragment/CloudListFragmentV2$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 1
    iget-object v3, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    iget-object v4, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-virtual {v3, v4}, Lcom/join/mgps/customview/ClouldItemView3;->setCloudItemListener(Lcom/join/mgps/listener/c;)V

    .line 2
    iget-object v3, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v3, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v3, v2, :cond_0

    .line 3
    iget-object v4, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    iget-object v3, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v5, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->m:Ljava/lang/String;

    iget-object v3, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/join/mgps/dto/CloudListDataBean;

    iget-object v11, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v7, v11, Lcom/join/mgps/fragment/CloudListFragmentV2;->l:I

    iget v8, v11, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual/range {v4 .. v11}, Lcom/join/mgps/customview/ClouldItemView3;->setData(Ljava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;IIZZLcom/join/mgps/listener/c;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v12, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    iget-object v3, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v13, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->m:Ljava/lang/String;

    iget-object v3, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/join/mgps/dto/CloudListDataBean;

    iget-object v3, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v15, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->l:I

    iget v4, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v16, v4

    move-object/from16 v19, v3

    invoke-virtual/range {v12 .. v19}, Lcom/join/mgps/customview/ClouldItemView3;->setData(Ljava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;IIZZLcom/join/mgps/listener/c;)V

    .line 5
    :goto_0
    iget-object v3, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    iget-object v4, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v4, v4, Lcom/join/mgps/fragment/CloudListFragmentV2;->t:Lcom/join/mgps/activity/GameMainActivity4;

    iget-boolean v4, v4, Lcom/join/mgps/activity/GameMainActivity4;->z2:Z

    invoke-virtual {v3, v4}, Lcom/join/mgps/customview/ClouldItemView3;->setGBAType(Z)V

    .line 6
    iget-object v3, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    iget-object v4, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v4, v4, Lcom/join/mgps/fragment/CloudListFragmentV2;->t:Lcom/join/mgps/activity/GameMainActivity4;

    iget-boolean v5, v4, Lcom/join/mgps/activity/GameMainActivity4;->B2:Z

    iget-boolean v4, v4, Lcom/join/mgps/activity/GameMainActivity4;->C2:Z

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/customview/ClouldItemView3;->setPGN(ZZ)V

    .line 7
    iget-object v3, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v3, v3, Lcom/join/mgps/fragment/CloudListFragmentV2;->k:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_1

    .line 8
    iget-object v3, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->b:Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object v3, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->c:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v5, v5, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/CloudListDataBean;->getTodayCoin()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v1, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->d:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v4, v4, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CloudListDataBean;->getTotalCoin()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v1, v1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->b:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lcom/join/mgps/fragment/CloudListFragmentV2$h;
    .locals 4
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance p2, Lcom/join/mgps/fragment/CloudListFragmentV2$h;

    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0373

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2$h;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2;Landroid/view/View;)V

    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget-object v0, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/join/mgps/fragment/CloudListFragmentV2$h;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->a(Lcom/join/mgps/fragment/CloudListFragmentV2$h;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2$j;->d(Landroid/view/ViewGroup;I)Lcom/join/mgps/fragment/CloudListFragmentV2$h;

    move-result-object p1

    return-object p1
.end method
