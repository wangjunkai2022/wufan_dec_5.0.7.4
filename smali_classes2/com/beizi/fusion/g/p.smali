.class public Lcom/beizi/fusion/g/p;
.super Ljava/lang/Object;
.source "ComplaintViewUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/g/p$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lcom/beizi/fusion/g/p$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/p;)Lcom/beizi/fusion/g/p$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/p;->b:Lcom/beizi/fusion/g/p$a;

    return-object p0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 6
    :try_start_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 7
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    const-string v2, "\u6295\u8bc9"

    .line 8
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    const-string v2, "#FFFFFF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object v1, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    const-string v2, "#99000000"

    const/4 v3, 0x0

    const-string v4, ""

    const/16 v5, 0x1e

    invoke-static {v1, v2, v3, v4, v5}, Lcom/beizi/fusion/g/as;->a(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;I)V

    const-string v1, "1"

    .line 11
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x41500000    # 13.0f

    const/4 v3, 0x2

    const/high16 v4, 0x41400000    # 12.0f

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    .line 12
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    invoke-virtual {p2, v3, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 13
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    invoke-static {p1, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, v1, v2, v3, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 p1, 0x12

    .line 14
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 15
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_0

    :cond_0
    const-string v1, "2"

    .line 16
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    invoke-virtual {p2, v3, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 18
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    invoke-static {p1, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {p2, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 p2, 0x41800000    # 16.0f

    .line 19
    invoke-static {p1, p2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 20
    invoke-static {p1, p2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_0

    :cond_1
    const-string v1, "3"

    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 22
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {p2, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 23
    iget-object p2, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {p1, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    invoke-static {p1, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-static {p1, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, v2, v3, v1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 p1, 0x10

    .line 24
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 25
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 26
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    invoke-virtual {p0}, Lcom/beizi/fusion/g/p;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    new-instance v1, Lcom/beizi/fusion/g/p$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/g/p$1;-><init>(Lcom/beizi/fusion/g/p;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    .line 2
    :try_start_0
    invoke-direct {p0, p1, p3}, Lcom/beizi/fusion/g/p;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/g/p;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public a(Lcom/beizi/fusion/g/p$a;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/beizi/fusion/g/p;->b:Lcom/beizi/fusion/g/p$a;

    return-void
.end method
