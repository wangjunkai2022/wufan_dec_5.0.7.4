.class public Lcom/join/mgps/adapter/GameCommentAdapterV2;
.super Landroid/widget/BaseAdapter;
.source "GameCommentAdapterV2.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/GameCommentAdapterV2$j;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$k;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$i;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$m;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$n;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$l;,
        Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$l;",
            ">;"
        }
    .end annotation
.end field

.field d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    .line 8
    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/join/mgps/adapter/GameCommentAdapterV2$j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$l;",
            ">;",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$j;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/GameCommentAdapterV2;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/GameCommentAdapterV2;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    return-object p0
.end method

.method private f(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    if-eqz p2, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;

    goto :goto_0

    .line 2
    :cond_0
    new-instance p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;

    invoke-direct {p3, p0}, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0607

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f090366

    .line 4
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->b:Landroid/widget/LinearLayout;

    const v0, 0x7f090368

    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->c:Landroid/view/View;

    const v0, 0x7f090367

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->d:Landroid/widget/TextView;

    const v0, 0x7f090369

    .line 7
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->e:Landroid/widget/TextView;

    const v0, 0x7f090c6b

    .line 8
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->f:Landroid/view/View;

    const v0, 0x7f0901d2

    .line 9
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->g:Landroid/view/View;

    .line 10
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    if-nez v0, :cond_1

    return-object p2

    .line 12
    :cond_1
    iget-object v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-nez v1, :cond_2

    return-object p2

    .line 13
    :cond_2
    iget-boolean v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->d:Z

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v1, :cond_3

    .line 14
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->c:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 15
    :cond_3
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->c:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 16
    :goto_1
    iget-boolean v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->g:Z

    if-nez v1, :cond_4

    .line 17
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->f:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->g:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 19
    :cond_4
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->f:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 20
    iget-object v1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->g:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :goto_2
    iget-object v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_5

    .line 23
    iget-object p3, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-direct {p0, p3, v0, v1, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->h(Landroid/view/View;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;ZI)V

    goto :goto_3

    .line 24
    :cond_5
    iget-object p1, p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$k;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-object p2
.end method

.method private h(Landroid/view/View;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;ZI)V
    .locals 18

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    .line 1
    iget-object v10, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->a:Ljava/lang/String;

    .line 2
    iget v11, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->e:I

    .line 3
    iget-boolean v12, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->f:Z

    .line 4
    iget-object v13, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 5
    invoke-virtual {v13}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v14

    .line 6
    move-object/from16 v15, p1

    check-cast v15, Landroid/widget/LinearLayout;

    invoke-virtual {v15}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 7
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v7

    const/4 v6, 0x0

    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v0, v7, 0x1

    if-ge v5, v0, :cond_7

    const/4 v0, 0x3

    if-le v5, v0, :cond_0

    if-eqz p3, :cond_0

    move/from16 v16, v11

    move/from16 v17, v12

    const/4 v4, 0x0

    move v11, v5

    move v12, v7

    goto/16 :goto_4

    .line 8
    :cond_0
    iget-object v1, v8, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c014e

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 9
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f090367

    .line 11
    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090369

    .line 12
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/16 v3, 0x8

    if-ne v5, v7, :cond_1

    if-gt v7, v0, :cond_2

    :cond_1
    if-lez v11, :cond_3

    if-eqz v12, :cond_3

    if-ne v5, v7, :cond_3

    .line 13
    :cond_2
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "\u6536\u8d77"

    .line 15
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$g;

    move-object v1, v0

    move-object/from16 v2, p0

    move v3, v11

    move-object v9, v4

    move/from16 v4, p4

    move/from16 v16, v11

    move v11, v5

    move-object v5, v10

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/adapter/GameCommentAdapterV2$g;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;IILjava/lang/String;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move v12, v7

    :goto_1
    const/4 v4, 0x0

    goto/16 :goto_2

    :cond_3
    move-object v9, v4

    move/from16 v16, v11

    move/from16 v17, v12

    const/4 v12, 0x0

    move v11, v5

    if-ne v11, v0, :cond_4

    if-eqz p3, :cond_4

    if-le v7, v0, :cond_4

    .line 17
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10009d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    add-int/lit8 v4, v7, -0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v12

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$h;

    move-object v1, v0

    move-object/from16 v2, p0

    move v3, v7

    move-object v4, v13

    move-object v5, v10

    move-object/from16 v6, p2

    move v12, v7

    move/from16 v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/GameCommentAdapterV2$h;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;ILcom/join/mgps/dto/InformationCommentBeanV2;Ljava/lang/String;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;I)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_4
    move v12, v7

    if-ge v11, v12, :cond_6

    if-lt v11, v0, :cond_5

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    .line 21
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 24
    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getMsg()Ljava/lang/String;

    move-result-object v2

    .line 25
    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    .line 26
    :try_start_0
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    invoke-direct {v8, v9, v0}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->l(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 29
    :goto_2
    invoke-virtual {v15, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v4, 0x0

    :goto_4
    add-int/lit8 v5, v11, 0x1

    move-object/from16 v9, p2

    move v7, v12

    move/from16 v11, v16

    move/from16 v12, v17

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method private l(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$e;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$e;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private m(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$d;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private n(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method c(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)Lcom/join/mgps/adapter/GameCommentAdapterV2$l;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;

    sget-object v1, Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;->REPLY:Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    new-instance v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    invoke-direct {v2, p1, p2, p3, p4}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)V

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;Ljava/lang/Object;)V

    return-object v0
.end method

.method public d(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;

    const/4 p3, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_2

    if-eq p4, v0, :cond_1

    if-eq p4, p3, :cond_0

    :goto_0
    move-object v3, p2

    move-object p2, v1

    move-object v2, p2

    goto/16 :goto_3

    .line 2
    :cond_0
    new-instance p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;

    invoke-direct {p2, p0}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;)V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0318

    invoke-virtual {v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090dbd

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->a(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/RelativeLayout;)Landroid/widget/RelativeLayout;

    const v3, 0x7f09175e

    .line 5
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->c(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    const v3, 0x7f090fcc

    .line 6
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->e(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    const v3, 0x7f091761

    .line 7
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->g(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v3, 0x7f091446

    .line 8
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->i(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v3, 0x7f09039c

    .line 9
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->k(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v3, 0x7f090fcd

    .line 10
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->m(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v3, 0x7f090c64

    .line 11
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->n(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v3, 0x7f090c66

    .line 12
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/customview/VipView;

    iput-object v3, p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->l:Lcom/join/mgps/customview/VipView;

    const v3, 0x7f090c6b

    .line 13
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->j:Landroid/view/View;

    const v3, 0x7f090e4f

    .line 14
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->k:Landroid/widget/TextView;

    .line 15
    invoke-virtual {v2, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v3, v2

    move-object v2, p2

    :goto_1
    move-object p2, v1

    goto :goto_3

    .line 16
    :cond_1
    new-instance p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$m;

    invoke-direct {p2, p0}, Lcom/join/mgps/adapter/GameCommentAdapterV2$m;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0317

    invoke-virtual {v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f091461

    .line 18
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p2, v3}, Lcom/join/mgps/adapter/GameCommentAdapterV2$m;->b(Lcom/join/mgps/adapter/GameCommentAdapterV2$m;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 19
    invoke-virtual {v2, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v3, v2

    :goto_2
    move-object v2, v1

    goto :goto_3

    :cond_2
    if-eq p4, v0, :cond_4

    if-eq p4, p3, :cond_3

    goto/16 :goto_0

    .line 20
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;

    move-object v3, p2

    goto :goto_1

    .line 21
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$m;

    move-object v3, p2

    move-object p2, v2

    goto :goto_2

    :goto_3
    if-eq p4, v0, :cond_a

    if-eq p4, p3, :cond_5

    goto/16 :goto_6

    :cond_5
    if-nez p1, :cond_6

    return-object v1

    .line 22
    :cond_6
    iget-object p1, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;->a:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 23
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_7

    .line 24
    iget-object p2, v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->j:Landroid/view/View;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 25
    :cond_7
    iget-object p2, v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->j:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    :goto_4
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCreateTime()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p2

    .line 27
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->h(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/TextView;

    move-result-object p4

    invoke-static {p2, p3}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->j(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getMsg()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->l(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/TextView;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ""

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 31
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->d(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/ImageView;

    move-result-object p2

    const p3, 0x7f080927

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_5

    .line 32
    :cond_8
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->d(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/ImageView;

    move-result-object p2

    const p3, 0x7f080f30

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 33
    :goto_5
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getAvatar()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 34
    iget-object p2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getAvatar()Ljava/lang/String;

    move-result-object p3

    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->b(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object p4

    invoke-static {p2, p3, p4}, Lcom/join/mgps/Util/UtilsMy;->s3(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 35
    :cond_9
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->f(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->d(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->m(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    .line 37
    invoke-direct {p0, v3, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->n(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    .line 38
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->b(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object p2

    new-instance p3, Lcom/join/mgps/adapter/GameCommentAdapterV2$a;

    invoke-direct {p3, p0, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2$a;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    invoke-static {v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->j(Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)Landroid/widget/TextView;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$b;

    invoke-direct {p2, p0, v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$b;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 40
    iget-object p1, v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$i;->k:Landroid/widget/TextView;

    new-instance p2, Lcom/join/mgps/adapter/GameCommentAdapterV2$c;

    invoke-direct {p2, p0, v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$c;-><init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/adapter/GameCommentAdapterV2$i;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_6

    .line 41
    :cond_a
    iget-object p1, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;->a:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 42
    invoke-static {p2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$m;->a(Lcom/join/mgps/adapter/GameCommentAdapterV2$m;)Landroid/widget/TextView;

    move-result-object p1

    const-string p2, "\u6700\u65b0\u8bc4\u8bba"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_6
    return-object v3
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()Lcom/join/mgps/adapter/GameCommentAdapterV2$j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;->b()Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->getItemViewType(I)I

    move-result v0

    .line 2
    sget-object v1, Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;->COMMENT:Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 4
    :cond_0
    sget-object v1, Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;->TITLE:Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 6
    :cond_1
    sget-object v1, Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;->REPLY:Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/GameCommentAdapterV2;->f(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    :cond_2
    :goto_0
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;->values()[Lcom/join/mgps/adapter/GameCommentAdapterV2$ViewType;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method i(Lcom/join/mgps/adapter/GameCommentAdapterV2$l;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    .line 2
    iput-boolean p2, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->g:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$l;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public k(Lcom/join/mgps/adapter/GameCommentAdapterV2$j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    return-void
.end method

.method public notifyDataSetChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
