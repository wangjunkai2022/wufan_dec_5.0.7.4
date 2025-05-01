.class public Lcom/join/mgps/adapter/ForumCommentAdapter$t;
.super Lcom/join/mgps/customview/e;
.source "ForumCommentAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "t"
.end annotation


# instance fields
.field d:I

.field e:I

.field f:Ljava/lang/String;

.field g:Landroid/view/View;

.field final synthetic h:Lcom/join/mgps/adapter/ForumCommentAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/customview/e;-><init>(Landroid/content/Context;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/e;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0c05a7

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 4
    iget-object p2, p0, Lcom/join/mgps/customview/e;->b:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0712b9

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    float-to-int p2, p2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/customview/e;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0714f1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 7
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    const p2, 0x7f1104e9

    .line 9
    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 10
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->g(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method private g(Landroid/view/View;)V
    .locals 4

    const v0, 0x7f09111e

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091116

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091112

    .line 3
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0903ee

    .line 4
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 5
    new-instance v3, Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/adapter/ForumCommentAdapter$t$a;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$t;)V

    .line 6
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->e:I

    return v0
.end method

.method public dismiss()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/join/mgps/customview/e;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 5
    :cond_0
    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->d:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 6
    :sswitch_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->e:I

    invoke-interface {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->p(I)V

    goto :goto_0

    .line 8
    :sswitch_1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->l()V

    goto :goto_0

    .line 10
    :sswitch_2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->e:I

    iget-object v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->h(ILjava/lang/String;)V

    goto :goto_0

    .line 12
    :sswitch_3
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->e:I

    invoke-interface {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$w;->d(I)V

    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0903ee -> :sswitch_3
        0x7f091112 -> :sswitch_2
        0x7f091116 -> :sswitch_1
        0x7f09111e -> :sswitch_0
    .end sparse-switch
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->e:I

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->f:Ljava/lang/String;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public showAsDropDown(Landroid/view/View;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->g:Landroid/view/View;

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/customview/e;->showAsDropDown(Landroid/view/View;II)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/e;->b()V

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->d:I

    return-void
.end method
