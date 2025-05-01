.class public Lcom/join/mgps/adapter/ForumCommentAdapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "ForumCommentAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/ForumCommentAdapter$u;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$x;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$w;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$v;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$t;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$y;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/adapter/ForumCommentAdapter$z;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field e:Lcom/danikula/videocache/i;

.field private f:Landroid/content/Context;

.field g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

.field h:Landroid/widget/LinearLayout$LayoutParams;

.field i:I

.field j:I

.field k:Landroid/widget/LinearLayout$LayoutParams;

.field l:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/join/mgps/adapter/ForumCommentAdapter$y;",
            ">;"
        }
    .end annotation
.end field

.field m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

.field n:Z

.field o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

.field private p:Lcom/join/mgps/adapter/ForumCommentAdapter$w;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->d:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->i:I

    .line 4
    iput v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->j:I

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->n:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->p:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    .line 7
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->F(Landroid/content/Context;)Lcom/danikula/videocache/i;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->e:Lcom/danikula/videocache/i;

    .line 9
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_HEADER:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05bd

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 10
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05bf

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 11
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_IMAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05be

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 12
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE_REPLY:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05c0

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 13
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->EMPLOYEE_TAGS:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05c3

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 14
    sget-object p1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->DIVIDER:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const v0, 0x7f0c05c1

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->H()V

    return-void
.end method

.method private A(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->k:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x3fc00000    # 1.5f

    const/16 v3, 0x1e

    const/4 v4, 0x4

    const v5, 0x7f070d86

    .line 5
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sub-int/2addr v1, v0

    int-to-float v0, v1

    int-to-float v1, v3

    mul-float v1, v1, p1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    int-to-float v3, v0

    mul-float v3, v3, v1

    div-float/2addr v3, v2

    float-to-int v1, v3

    int-to-float v2, v4

    mul-float v2, v2, p1

    float-to-int p1, v2

    .line 6
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 7
    invoke-virtual {v2, v0, p1, v0, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iput-object v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->k:Landroid/widget/LinearLayout$LayoutParams;

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->k:Landroid/widget/LinearLayout$LayoutParams;

    return-object p1
.end method

.method private D(Landroid/content/Context;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->j:I

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v1, 0x3fc00000    # 1.5f

    const v2, 0x7f070d86

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    float-to-int p1, v0

    .line 5
    iput p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->j:I

    .line 6
    :cond_1
    iget p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->j:I

    return p1
.end method

.method private E(Landroid/content/Context;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->i:I

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const v1, 0x3fe66666    # 1.8f

    const v2, 0x7f070d86

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    float-to-int p1, v0

    .line 5
    iput p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->i:I

    .line 6
    :cond_1
    iget p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->i:I

    return p1
.end method

.method private H()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->h:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->G()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->h:Landroid/widget/LinearLayout$LayoutParams;

    :cond_0
    return-void
.end method

.method private I(Landroid/widget/TextView;)V
    .locals 9

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/x;->a()Lcom/join/mgps/Util/x;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 3
    instance-of v1, v0, Landroid/text/Spannable;

    if-eqz v1, :cond_4

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    check-cast v2, Landroid/text/Spannable;

    .line 6
    const-class v3, Landroid/text/style/URLSpan;

    const/4 v4, 0x0

    invoke-interface {v2, v4, v1, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/URLSpan;

    .line 7
    array-length v3, v1

    if-nez v3, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 9
    array-length v0, v1

    :goto_0
    if-ge v4, v0, :cond_3

    aget-object v5, v1, v4

    .line 10
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    const-string v7, "http://"

    .line 11
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "https://"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_2

    .line 12
    :cond_1
    new-instance v7, Lcom/join/mgps/adapter/ForumCommentAdapter$u;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, p0, v8, v6}, Lcom/join/mgps/adapter/ForumCommentAdapter$u;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    invoke-interface {v2, v5}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v2, v5}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    const/16 v8, 0x11

    invoke-virtual {v3, v7, v6, v5, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method

.method private L(Landroid/view/View;ZI)V
    .locals 2

    const v0, 0x7f0905fc

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0905fd

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v1, ""

    if-eqz p2, :cond_0

    const p2, 0x7f080927

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const p2, 0x7f080f30

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private N(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/j0;->i0(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/ForumCommentAdapter$y;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;)V

    const/4 v2, 0x0

    .line 3
    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    .line 4
    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    const v4, 0x7f070d86

    .line 7
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    const/high16 v4, 0x42200000    # 40.0f

    .line 8
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v4

    sub-float/2addr v3, p1

    float-to-int p1, v3

    int-to-float v3, p1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v3, v3, v4

    int-to-float v0, v0

    mul-float v0, v0, v4

    int-to-float v2, v2

    div-float/2addr v0, v2

    mul-float v3, v3, v0

    float-to-int v0, v3

    .line 9
    iput p1, v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->a:I

    .line 10
    iput v0, v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->b:I

    .line 11
    invoke-virtual {p0, p2, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->o(Ljava/lang/String;Lcom/join/mgps/adapter/ForumCommentAdapter$y;)V

    :cond_0
    return-void
.end method

.method private O(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;ZI)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    .line 1
    iget v10, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->a:I

    .line 2
    iget v11, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->f:I

    .line 3
    iget-boolean v12, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->g:Z

    .line 4
    iget-object v13, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->b:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    .line 5
    invoke-virtual {v13}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

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

    if-ge v5, v0, :cond_e

    const/4 v0, 0x3

    if-le v5, v0, :cond_0

    if-eqz p3, :cond_0

    move/from16 v16, v11

    move/from16 v17, v12

    move-object/from16 v18, v13

    move-object v0, v15

    move v12, v5

    :goto_1
    move v13, v7

    goto/16 :goto_8

    .line 8
    :cond_0
    iget-object v1, v8, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

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

    check-cast v1, Lcom/join/mgps/customview/TextViewWithHyperlink;

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
    new-instance v3, Lcom/join/mgps/adapter/ForumCommentAdapter$l;

    move-object v0, v3

    move-object/from16 v1, p0

    move v2, v11

    move-object v6, v3

    move/from16 v3, p4

    move/from16 v16, v11

    move-object v11, v4

    move v4, v10

    move/from16 v17, v12

    move v12, v5

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/adapter/ForumCommentAdapter$l;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IIILcom/join/mgps/adapter/ForumCommentAdapter$z$d;)V

    invoke-virtual {v11, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v18, v13

    move-object v0, v15

    :goto_2
    move v13, v7

    goto/16 :goto_6

    :cond_3
    move/from16 v16, v11

    move/from16 v17, v12

    move-object v11, v4

    move v12, v5

    const/4 v4, 0x1

    if-ne v12, v0, :cond_4

    if-eqz p3, :cond_4

    if-le v7, v0, :cond_4

    .line 17
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v6, 0x0

    .line 18
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10009d

    new-array v3, v4, [Ljava/lang/Object;

    add-int/lit8 v4, v7, -0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    new-instance v5, Lcom/join/mgps/adapter/ForumCommentAdapter$m;

    move-object v0, v5

    move-object/from16 v1, p0

    move v2, v7

    move-object v3, v13

    move v4, v10

    move-object/from16 v18, v13

    move-object v13, v5

    move-object/from16 v5, p2

    move-object/from16 p1, v15

    const/4 v15, 0x0

    move/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/adapter/ForumCommentAdapter$m;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;ILcom/join/mgps/dto/ForumBean$ForumCommentBean;ILcom/join/mgps/adapter/ForumCommentAdapter$z$d;I)V

    invoke-virtual {v11, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_4
    move-object/from16 v18, v13

    move-object/from16 p1, v15

    const/4 v15, 0x0

    if-ge v12, v7, :cond_d

    if-lt v12, v0, :cond_5

    if-eqz p3, :cond_5

    goto/16 :goto_7

    .line 21
    :cond_5
    invoke-interface {v14, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;

    .line 22
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getNickname()Ljava/lang/String;

    move-result-object v6

    .line 23
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRnickname()Ljava/lang/String;

    move-result-object v13

    .line 24
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRrid()I

    move-result v19

    if-nez v19, :cond_6

    const-string v13, ""

    .line 25
    :cond_6
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getMessage()Ljava/lang/String;

    move-result-object v4

    .line 26
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 28
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->isOfficialAccount()Z

    move-result v2

    const-string v3, "#*#"

    if-eqz v2, :cond_7

    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 30
    :cond_7
    invoke-static {v13}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->isrOfficialAccount()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 32
    :cond_8
    invoke-static {v1, v6, v13, v4}, Lcom/join/mgps/Util/j0;->u1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getJump_info()Lcom/join/mgps/dto/BannerBean;

    move-result-object v2

    .line 34
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRid()I

    move-result v6

    .line 35
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getUid()I

    move-result v3

    .line 36
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getNickname()Ljava/lang/String;

    move-result-object v13

    if-eqz v2, :cond_9

    .line 37
    iget-object v4, v8, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/join/mgps/dto/BannerBean;->getTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lcom/join/mgps/dto/BannerBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$n;

    invoke-direct {v0, v8, v10, v6, v13}, Lcom/join/mgps/adapter/ForumCommentAdapter$n;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IILjava/lang/String;)V

    invoke-virtual {v1, v4, v15, v2, v0}, Lcom/join/mgps/customview/TextViewWithHyperlink;->a(Landroid/content/Context;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;Lcom/join/mgps/customview/TextViewWithHyperlink$a;)I

    .line 38
    :cond_9
    invoke-virtual {v8, v11, v10, v6, v13}, Lcom/join/mgps/adapter/ForumCommentAdapter;->Y(Landroid/view/View;IILjava/lang/String;)V

    .line 39
    iget-object v0, v8, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 40
    iget v1, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->c:I

    .line 41
    iget-boolean v2, v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->e:Z

    if-eqz v0, :cond_a

    .line 42
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    if-ne v3, v0, :cond_a

    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    const/4 v3, 0x3

    if-eq v1, v3, :cond_c

    const/16 v3, 0x63

    if-eq v1, v3, :cond_c

    if-nez v0, :cond_c

    if-eqz v2, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v2, 0x1

    :goto_5
    xor-int/lit8 v3, v0, 0x1

    .line 43
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getMessage()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    move-object v1, v11

    move v4, v10

    move v5, v6

    move-object v6, v13

    move v13, v7

    move-object v7, v15

    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/adapter/ForumCommentAdapter;->X(Landroid/view/View;ZZIILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p1

    .line 44
    :goto_6
    invoke-virtual {v0, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_8

    :cond_d
    :goto_7
    move-object/from16 v0, p1

    goto/16 :goto_1

    :goto_8
    add-int/lit8 v5, v12, 0x1

    move-object v15, v0

    move v7, v13

    move/from16 v11, v16

    move/from16 v12, v17

    move-object/from16 v13, v18

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_e
    return-void
.end method

.method private P(Landroid/widget/RelativeLayout;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RelativeLayout;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    if-eqz p2, :cond_6

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->h:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->G()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->h:Landroid/widget/LinearLayout$LayoutParams;

    :cond_1
    const v1, 0x7f09080f

    .line 4
    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-le v2, v3, :cond_2

    .line 6
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5171"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "\u5f20"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 10
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    new-array v2, v3, [I

    .line 11
    fill-array-data v2, :array_0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_5

    .line 12
    aget v6, v2, v5

    invoke-virtual {p1, v6}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 13
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v8, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->h:Landroid/widget/LinearLayout$LayoutParams;

    iget v9, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-direct {v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 14
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v5, v8, :cond_4

    .line 15
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 16
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    if-lez v5, :cond_3

    .line 17
    invoke-virtual {v7, v1, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {v7, v4, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 19
    :goto_2
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 21
    sget-object v7, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v6, v8, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 22
    new-instance v7, Lcom/join/mgps/adapter/ForumCommentAdapter$o;

    invoke-direct {v7, p0, p3, v5}, Lcom/join/mgps/adapter/ForumCommentAdapter$o;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Ljava/util/List;I)V

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 23
    :cond_4
    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    return-void

    .line 24
    :cond_6
    :goto_4
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void

    :array_0
    .array-data 4
        0x7f090850
        0x7f090851
        0x7f090852
    .end array-data
.end method

.method private S(Landroid/widget/TextView;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendLabelTag;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p3, Landroid/text/SpannableStringBuilder;

    invoke-direct {p3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3, p6}, Lcom/join/mgps/Util/j0;->h(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3, p7, p8, p9}, Lcom/join/mgps/Util/j0;->i(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/util/List;ILjava/lang/String;)V

    .line 4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p3, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 5
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private a0(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$g;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$g;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private b0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$i;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$i;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private c0(Landroid/view/View;Lcom/join/mgps/dto/ForumBean$GameInfo;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$f;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$f;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/join/mgps/dto/ForumBean$GameInfo;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private e0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$j;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$j;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private f0(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    if-eqz p3, :cond_0

    .line 1
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getWidth()I

    move-result v0

    .line 2
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getHeight()I

    move-result p3

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    const v3, 0x7f070d86

    .line 6
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v2, v1

    int-to-float v1, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v1, v1, v3

    int-to-float v4, p3

    mul-float v4, v4, v3

    int-to-float v3, v0

    div-float/2addr v4, v3

    mul-float v1, v1, v4

    float-to-int v1, v1

    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 8
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    .line 10
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->d:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "setPostImageParam-->rawHeight="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " rawWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " ratio="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, " itemHeight="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " itemWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "\n"

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, v5, p3

    invoke-static {v5}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 12
    invoke-virtual {p2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v3

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private g0(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/widget/TextView;

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 5
    check-cast p1, Landroid/widget/Button;

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/join/mgps/adapter/ForumCommentAdapter;)Lcom/join/mgps/adapter/ForumCommentAdapter$w;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->p:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    return-object p0
.end method

.method private h0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/widget/TextView;

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 5
    check-cast p1, Landroid/widget/Button;

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setTextColor(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->D(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method static synthetic j(Lcom/join/mgps/adapter/ForumCommentAdapter;Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/ForumCommentAdapter;->f0(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method private j0(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V
    .locals 8

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->dismiss()V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    if-nez v0, :cond_2

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    iget v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->c:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->f(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->h(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0712b9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 8
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0714f1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 9
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071435

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 10
    iget-boolean v3, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->l:Z

    const v4, 0x7f09177f

    const v5, 0x7f09111e

    const/4 v6, 0x0

    const/16 v7, 0x8

    if-eqz v3, :cond_3

    .line 11
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 12
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_3
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 15
    :goto_0
    iget-boolean v3, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->m:Z

    const v4, 0x7f09177e

    const v5, 0x7f091116

    if-eqz v3, :cond_4

    .line 16
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 18
    :cond_4
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 19
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 20
    :goto_1
    iget-boolean p2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->n:Z

    const v3, 0x7f09176e

    const v4, 0x7f0903ee

    if-eqz p2, :cond_5

    .line 21
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 23
    :cond_5
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 24
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 25
    :goto_2
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 26
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getWidth()I

    move-result p2

    .line 27
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v0}, Lcom/join/mgps/customview/e;->getHeight()I

    move-result v0

    neg-int p2, p2

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    move v1, v0

    .line 28
    :goto_3
    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v1, v0

    neg-int v0, v1

    .line 29
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    invoke-virtual {v1, p1, p2, v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$t;->showAsDropDown(Landroid/view/View;II)V

    .line 30
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->m:Lcom/join/mgps/adapter/ForumCommentAdapter$t;

    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$r;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method static synthetic k(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->A(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method private k0(Lcom/join/mgps/base/BaseViewHolder;I)V
    .locals 7

    const v0, 0x7f090e0b

    const v1, 0x7f09145e

    const v2, 0x7f090c7d

    const v3, 0x7f091051

    const v4, 0x7f09104a

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p1, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 2
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p1, v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const/16 v2, 0x11

    if-ne p2, v2, :cond_1

    .line 7
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 8
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p1, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    :goto_0
    invoke-virtual {p1, v1, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-virtual {p1, v0, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    return-void
.end method

.method static synthetic l(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->v(Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic m(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->w(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic n(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->j0(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V

    return-void
.end method

.method private p(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 12

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09044b

    .line 2
    iget-boolean v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->a:Z

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const v0, 0x7f0917cf

    .line 3
    :try_start_1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/customview/VipView;

    iget v2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->o:I

    iget v3, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->p:I

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/customview/VipView;->setVipData(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const v1, 0x7f0905bb

    .line 5
    iget v2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->k:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    iget-object v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->e:Ljava/lang/String;

    const v2, 0x7f090363

    invoke-virtual {p1, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    iget-wide v5, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->f:J

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v1

    const v5, 0x7f09034e

    invoke-virtual {p1, v5, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f090350

    .line 8
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v7, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->d:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->x(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/adapter/ForumCommentAdapter$k;

    invoke-direct {v7, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$k;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v6, 0x7f0905f5

    .line 10
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->g:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v6, 0x7f090896

    .line 11
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->j:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    iget-boolean v6, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->i:Z

    const v7, 0x7f0905f9

    if-eqz v6, :cond_2

    .line 13
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f06002b

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {p1, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    invoke-virtual {p1, v7, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 15
    :cond_2
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iget v9, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->o:I

    iget v10, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->p:I

    const v11, 0x7f060127

    invoke-static {v6, v8, v9, v10, v11}, Lcom/join/mgps/Util/UtilsMy;->A3(Landroid/content/Context;Landroid/widget/TextView;III)Z

    .line 16
    invoke-virtual {p1, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    const v6, 0x7f090e39

    .line 17
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->q:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 18
    iget-object v6, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->r:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const v7, 0x7f090df5

    if-nez v6, :cond_3

    .line 19
    invoke-virtual {p1, v7, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 20
    iget-object v6, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->r:Ljava/lang/String;

    invoke-virtual {p1, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 21
    :cond_3
    invoke-virtual {p1, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 22
    :goto_3
    iget v6, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->h:I

    const/4 v7, 0x2

    if-ne v6, v4, :cond_4

    .line 23
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f10009f

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_4
    if-ne v6, v7, :cond_5

    .line 24
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f1000a0

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 25
    :cond_5
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f10009e

    new-array v9, v4, [Ljava/lang/Object;

    iget v10, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->h:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    invoke-virtual {v6, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_4
    const v8, 0x7f090352

    .line 26
    invoke-virtual {p1, v8, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 27
    iget-object v6, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v6}, Lcom/join/mgps/adapter/ForumCommentAdapter;->W(Landroid/view/View;)V

    const v6, 0x7f090365

    .line 28
    invoke-virtual {p1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->V(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    .line 29
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    aput-object v8, v6, v3

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v6, v4

    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v6}, Lcom/join/mgps/Util/j0;->S0([Landroid/view/View;)V

    new-array v2, v4, [Landroid/view/View;

    .line 30
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/join/mgps/Util/j0;->U0([Landroid/view/View;)V

    .line 31
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget p2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;->b:I

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->e0(Landroid/view/View;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    return-void
.end method

.method private q(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090358

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->c:Ljava/util/List;

    iget v2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->b:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->N(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->C(Ljava/lang/String;)Lcom/join/mgps/adapter/ForumCommentAdapter$y;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, v0, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->a:I

    iget v0, v0, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->b:I

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x4

    int-to-float v0, v0

    .line 7
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v2

    float-to-int v0, v0

    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2, v0, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->J(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 12
    :goto_0
    iget v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->b:I

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;->c:Ljava/util/List;

    invoke-static {p1, v0, p2}, Lcom/join/mgps/Util/j0;->C1(Landroid/widget/ImageView;ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method private r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    if-eqz p2, :cond_3

    .line 2
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->b:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const v0, 0x7f090368

    .line 3
    iget-boolean v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->d:Z

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    iget-boolean v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->h:Z

    const v1, 0x7f0901d2

    const v2, 0x7f090c6b

    const/4 v3, 0x1

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 8
    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 9
    :goto_0
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->b:Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v0

    const v1, 0x7f090366

    if-eqz v0, :cond_2

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-direct {p0, v0, p2, v3, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->O(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;ZI)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method private s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;->b:Ljava/lang/String;

    const v1, 0x7f090362

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->I(Landroid/widget/TextView;)V

    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumCommentAdapter;->W(Landroid/view/View;)V

    .line 5
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->U(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;

    .line 2
    iget v0, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;->b:I

    const v1, 0x7f091784

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    iget p2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;->a:I

    invoke-direct {v0, v1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$g;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$x;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    iget v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$g;->b:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$x;->d(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$x;->e(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$x;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumCommentAdapter$x;->c()Ljava/util/List;

    move-result-object v0

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z$g;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const p2, 0x7f090c8e

    .line 8
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lit/sephiroth/android/library/widget/HListView;

    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->g:Lcom/join/mgps/adapter/ForumCommentAdapter$x;

    invoke-virtual {p1, p2}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private v(Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->w(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method private w(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 1
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    float-to-int v2, v2

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    float-to-int p2, p2

    .line 4
    aget v3, v1, v0

    const/4 v4, 0x1

    if-ge v3, v2, :cond_1

    aget v3, v1, v4

    if-ge v3, p2, :cond_1

    aget v3, v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v3, v5

    if-ge v2, v3, :cond_1

    aget v1, v1, v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v1, p1

    if-ge p2, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method B(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method C(Ljava/lang/String;)Lcom/join/mgps/adapter/ForumCommentAdapter$y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->l:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;

    return-object p1
.end method

.method public F(Landroid/content/Context;)Lcom/danikula/videocache/i;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/MApplication;->m(Landroid/content/Context;)Lcom/danikula/videocache/i;

    move-result-object p1

    return-object p1
.end method

.method G()Landroid/widget/LinearLayout$LayoutParams;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 3
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v2, 0x43520000    # 210.0f

    mul-float v2, v2, v1

    float-to-int v2, v2

    const/high16 v3, 0x43200000    # 160.0f

    mul-float v3, v3, v1

    float-to-int v3, v3

    const/high16 v4, 0x40c00000    # 6.0f

    mul-float v4, v4, v1

    float-to-int v4, v4

    .line 4
    iget-object v5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070d74

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    sub-int/2addr v0, v5

    int-to-float v0, v0

    int-to-float v4, v4

    mul-float v4, v4, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v4, v4, v1

    sub-float/2addr v0, v4

    float-to-int v0, v0

    .line 5
    div-int/lit8 v0, v0, 0x3

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-le v0, v3, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v0

    .line 6
    :goto_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public J(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    const v1, 0x7f080983

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$q;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$q;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    .line 4
    invoke-static {p2}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/facebook/drawee/backends/pipeline/e;->c0(Landroid/net/Uri;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public K(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    const v1, 0x7f080983

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$p;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    .line 4
    invoke-static {p2}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/facebook/drawee/backends/pipeline/e;->c0(Landroid/net/Uri;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method M(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/j0;->i0(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/ForumCommentAdapter$y;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;)V

    const/4 v2, 0x0

    .line 3
    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    .line 4
    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    const v4, 0x7f070d86

    .line 7
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v3, p1

    int-to-float p1, v3

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float p1, p1, v4

    int-to-float v0, v0

    mul-float v0, v0, v4

    int-to-float v2, v2

    div-float/2addr v0, v2

    mul-float p1, p1, v0

    float-to-int p1, p1

    .line 8
    iput v3, v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->a:I

    .line 9
    iput p1, v1, Lcom/join/mgps/adapter/ForumCommentAdapter$y;->b:I

    .line 10
    invoke-virtual {p0, p2, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter;->o(Ljava/lang/String;Lcom/join/mgps/adapter/ForumCommentAdapter$y;)V

    :cond_0
    return-void
.end method

.method Q(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 8

    if-eqz p3, :cond_0

    .line 1
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getWidth()I

    move-result v0

    .line 2
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getHeight()I

    move-result p3

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 5
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/16 v4, 0x28

    const/4 v5, 0x4

    const v6, 0x7f070d86

    .line 7
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v3, v2

    int-to-float v2, v3

    int-to-float v3, v4

    mul-float v3, v3, v1

    sub-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float v3, v2

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v3, v3, v4

    int-to-float v5, v5

    mul-float v5, v5, v1

    float-to-int v1, v5

    int-to-float v5, p3

    mul-float v5, v5, v4

    int-to-float v4, v0

    div-float/2addr v5, v4

    mul-float v3, v3, v5

    float-to-int v3, v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->d:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "setCommentImageItemParams-->rawHeight="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " rawWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " ratio="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, " itemHeight="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " itemWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "\n"

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, v4, p3

    invoke-static {v4}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 9
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    invoke-virtual {p1, p3, v1, p3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method R(Lcom/join/mgps/adapter/ForumCommentAdapter$z;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    .line 2
    iput-boolean p2, p1, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;->h:Z
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

.method public T(Lcom/join/mgps/adapter/ForumCommentAdapter$w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->p:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    return-void
.end method

.method public U(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$c;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$c;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public V(Landroid/view/View;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$b;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$b;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public W(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/ForumCommentAdapter$a;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public X(Landroid/view/View;ZZIILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/adapter/ForumCommentAdapter$e;

    move-object v0, v8

    move-object v1, p0

    move v2, p4

    move v3, p2

    move v4, p3

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/adapter/ForumCommentAdapter$e;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IZZILjava/lang/String;Ljava/lang/String;)V

    move-object v0, p1

    invoke-virtual {p1, v8}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public Y(Landroid/view/View;IILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "setOnCommentReplyReply"

    aput-object v2, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " rid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " rNickname="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$d;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/join/mgps/adapter/ForumCommentAdapter$d;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;IILjava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public Z(Landroid/view/View;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$s;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$s;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    return-void
.end method

.method public d0(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance p2, Lcom/join/mgps/adapter/ForumCommentAdapter$h;

    invoke-direct {p2, p0, p3}, Lcom/join/mgps/adapter/ForumCommentAdapter$h;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method i0(Landroid/view/View;IZZIILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    if-nez v0, :cond_0

    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->f:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {v0, p5}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->q(I)V

    .line 3
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p5, p6}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->A(I)V

    .line 4
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p5, p8}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->x(Ljava/lang/String;)V

    .line 5
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p5, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->w(I)V

    .line 6
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    const/4 p5, 0x0

    invoke-virtual {p2, p5}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->t(I)V

    const/16 p2, 0x8

    if-eqz p3, :cond_1

    .line 7
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p3, p5}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->v(I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p3, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->v(I)V

    :goto_0
    if-eqz p4, :cond_2

    .line 9
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p2, p5}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->z(I)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p3, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->z(I)V

    .line 11
    :goto_1
    invoke-static {p7}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p7, ""

    .line 12
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p2, p7}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->y(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->o:Lcom/join/mgps/adapter/ForumCommentAdapter$v;

    invoke-virtual {p2, p1}, Lcom/join/mgps/adapter/ForumCommentAdapter$v;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method

.method o(Ljava/lang/String;Lcom/join/mgps/adapter/ForumCommentAdapter$y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->l:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->l:Ljava/util/Hashtable;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->l:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter;->l:Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 3
    invoke-static {}, Ljava/lang/System;->gc()V

    :cond_0
    return-void
.end method

.method protected y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->getItemType()I

    move-result v0

    .line 2
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_HEADER:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->p(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    goto :goto_0

    .line 4
    :cond_0
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    goto :goto_0

    .line 6
    :cond_1
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_IMAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->q(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    goto :goto_0

    .line 8
    :cond_2
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE_REPLY:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    goto :goto_0

    .line 10
    :cond_3
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->EMPLOYEE_TAGS:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    goto :goto_0

    .line 12
    :cond_4
    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->DIVIDER:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumCommentAdapter$z;)V

    :cond_5
    :goto_0
    return-void
.end method

.method z(ILcom/join/mgps/dto/ForumBean$ForumCommentBean;IZZ)Lcom/join/mgps/adapter/ForumCommentAdapter$z;
    .locals 9

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    sget-object v1, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE_REPLY:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    new-instance v8, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    move-object v2, v8

    move v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;-><init>(ILcom/join/mgps/dto/ForumBean$ForumCommentBean;IZZ)V

    invoke-direct {v0, v1, v8}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V

    return-object v0
.end method
