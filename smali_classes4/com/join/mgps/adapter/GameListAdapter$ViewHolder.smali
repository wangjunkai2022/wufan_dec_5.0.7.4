.class public Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "GameListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/widget/TextView;

.field public g:Lcom/join/mgps/customview/CountDownerTextView;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/view/View;

.field public l:Lcom/join/mgps/customview/VipView;

.field public m:Landroid/view/View;

.field public n:Landroid/view/View;

.field o:[Lcom/join/mgps/adapter/GameListAdapter$c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->b(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    iput p2, p0, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->b:I

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->b(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method a(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;I)V
    .locals 9

    const v0, 0x7f09012d

    .line 1
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f0915a8

    .line 2
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f090970

    .line 3
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f091009

    .line 4
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f090f84

    .line 5
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    const v5, 0x7f0917df

    .line 6
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/customview/VipView;

    const v6, 0x7f0908fb

    .line 7
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    const v7, 0x7f0901d0

    .line 8
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 9
    new-instance v8, Lcom/join/mgps/adapter/GameListAdapter$c;

    invoke-direct {v8}, Lcom/join/mgps/adapter/GameListAdapter$c;-><init>()V

    .line 10
    iput-object p1, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->a:Landroid/view/View;

    .line 11
    iput-object v4, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->c:Landroid/view/View;

    .line 12
    iput-object p2, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->b:Landroid/view/View;

    .line 13
    iput-object v0, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 14
    iput-object v1, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->f:Landroid/widget/ImageView;

    .line 15
    iput-object v2, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->h:Landroid/widget/ImageView;

    .line 16
    iput-object p3, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->e:Landroid/widget/TextView;

    .line 17
    iput-object v3, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->i:Landroid/widget/ImageView;

    .line 18
    iput-object p4, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->d:Landroid/view/View;

    .line 19
    iput-object v5, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->j:Lcom/join/mgps/customview/VipView;

    .line 20
    iput-object v6, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->k:Landroid/widget/ImageView;

    .line 21
    iput-object v7, v8, Lcom/join/mgps/adapter/GameListAdapter$c;->l:Landroid/view/View;

    .line 22
    iget-object p1, p0, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->o:[Lcom/join/mgps/adapter/GameListAdapter$c;

    aput-object v8, p1, p5

    return-void
.end method

.method b(Landroid/view/View;)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v0, 0x7f0915da

    .line 1
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->c:Landroid/widget/TextView;

    const v0, 0x7f090948

    .line 2
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->d:Landroid/widget/ImageView;

    const v0, 0x7f09097d

    .line 3
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->e:Landroid/widget/ImageView;

    const v0, 0x7f0915f8

    .line 4
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->f:Landroid/widget/TextView;

    const v0, 0x7f0915f9

    .line 5
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->i:Landroid/widget/TextView;

    const v0, 0x7f0915e2

    .line 6
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CountDownerTextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->g:Lcom/join/mgps/customview/CountDownerTextView;

    const v0, 0x7f0916b8

    .line 7
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->h:Landroid/widget/TextView;

    const v0, 0x7f091507

    .line 8
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->j:Landroid/widget/TextView;

    const v0, 0x7f091802

    .line 9
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->k:Landroid/view/View;

    const v0, 0x7f0917df

    .line 10
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/VipView;

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->l:Lcom/join/mgps/customview/VipView;

    const v0, 0x7f090ef6

    .line 11
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    const v0, 0x7f090ef7

    .line 12
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const v0, 0x7f090ef8

    .line 13
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const v0, 0x7f090ef9

    .line 14
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const v0, 0x7f090cbd

    .line 15
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f090cbe

    .line 16
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    const v0, 0x7f090cbf

    .line 17
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    const v0, 0x7f090cc0

    .line 18
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    const v0, 0x7f090f7f

    .line 19
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f090f81

    .line 20
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    const v0, 0x7f090f82

    .line 21
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    const v0, 0x7f090f83

    .line 22
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    const v0, 0x7f0914e9

    .line 23
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->m:Landroid/view/View;

    const v0, 0x7f0914ea

    .line 24
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->n:Landroid/view/View;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/join/mgps/adapter/GameListAdapter$c;

    .line 25
    iput-object v0, v6, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->o:[Lcom/join/mgps/adapter/GameListAdapter$c;

    .line 26
    new-instance v4, Landroid/view/View;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->a(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;I)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, v11

    move-object v2, v14

    move-object v3, v8

    .line 27
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->a(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;I)V

    const/4 v5, 0x2

    move-object v1, v12

    move-object v2, v15

    move-object v3, v9

    .line 28
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->a(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;I)V

    const/4 v5, 0x3

    move-object v1, v13

    move-object/from16 v2, v16

    move-object v3, v10

    .line 29
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/adapter/GameListAdapter$ViewHolder;->a(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;I)V

    .line 30
    invoke-virtual {v7, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method
