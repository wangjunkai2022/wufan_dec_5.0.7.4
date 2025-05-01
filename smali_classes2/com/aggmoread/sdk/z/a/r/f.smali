.class public Lcom/aggmoread/sdk/z/a/r/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/a;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/a/g/b;

.field private b:Lcom/aggmoread/sdk/z/a/r/d;

.field private c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field private d:Lcom/aggmoread/sdk/z/a/r/a;

.field private e:Landroid/app/Activity;

.field private f:Landroid/content/Context;

.field private g:Landroid/view/View;

.field private h:Landroid/view/ViewGroup;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:[B

.field private o:Lcom/aggmoread/sdk/z/a/r/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->l:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->o:Lcom/aggmoread/sdk/z/a/r/h;

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->e:Lcom/aggmoread/sdk/z/a/g/e;

    :goto_0
    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->e:Landroid/app/Activity;

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->e:Landroid/app/Activity;

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->e:Landroid/app/Activity;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    goto :goto_0

    :cond_2
    invoke-static {p3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isDownload = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->r()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " , downType = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->h()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , downloadUrl = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "ApiSplashHandler_api"

    invoke-static {v0, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p3, Lcom/aggmoread/sdk/z/a/r/f$c;

    invoke-direct {p3, p0}, Lcom/aggmoread/sdk/z/a/r/f$c;-><init>(Lcom/aggmoread/sdk/z/a/r/f;)V

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/a/r/a;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/a$a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object p3

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/r/f;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->k:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->k:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    invoke-direct {p0, p4}, Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/view/View;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_1
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 8

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/f;->g()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/f;->f()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->g()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "ApiSplashHandler_api"

    const-string v0, "getAdSkipView = null"

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->g:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->g()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->g:Landroid/view/View;

    :goto_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->g:Landroid/view/View;

    new-instance v0, Lcom/aggmoread/sdk/z/a/r/f$d;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/r/f$d;-><init>(Lcom/aggmoread/sdk/z/a/r/f;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/aggmoread/sdk/z/a/r/h;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->g:Landroid/view/View;

    new-instance v3, Lcom/aggmoread/sdk/z/a/r/f$e;

    invoke-direct {v3, p0}, Lcom/aggmoread/sdk/z/a/r/f$e;-><init>(Lcom/aggmoread/sdk/z/a/r/f;)V

    const-wide/16 v4, 0x1450

    const-wide/16 v6, 0x1f4

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/aggmoread/sdk/z/a/r/h;-><init>(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/h$a;JJ)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->o:Lcom/aggmoread/sdk/z/a/r/h;

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method private a(Landroid/view/ViewGroup;)V
    .locals 11

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    if-eqz v0, :cond_3

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v1, "#99ffdd"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    const/4 v1, -0x1

    if-eqz p1, :cond_0

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    new-instance p1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    invoke-direct {p1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-string v2, "#Afd1df"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    const/16 v6, 0x8c

    const/16 v7, 0x8c

    const/16 v8, 0x8c

    const/16 v9, 0x8c

    const/4 v10, 0x6

    move-object v4, v3

    invoke-static/range {v4 .. v10}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/view/View;Landroid/content/Context;IIIII)V

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v1, 0x11

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setGravity(I)V

    const-string v1, "\u8df3\u8fc7"

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    const-wide/high16 v6, 0x4055000000000000L    # 84.0

    invoke-static {v5, v6, v7}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    iget-object v6, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    const-wide/high16 v7, 0x4041000000000000L    # 34.0

    invoke-static {v6, v7, v8}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    const-wide/high16 v6, 0x4030000000000000L    # 16.0

    invoke-static {v5, v6, v7}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    const-wide/high16 v6, 0x4018000000000000L    # 6.0

    invoke-static {v5, v6, v7}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v4, 0x5

    iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v6, 0x800005

    iput v6, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v0, v2, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/a/h/a;->e()Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v4

    iget v6, v4, Lcom/aggmoread/sdk/z/a/g/h;->a:I

    if-eqz v6, :cond_1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/a/h/a;->e()Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v4

    iget v4, v4, Lcom/aggmoread/sdk/z/a/g/h;->a:I

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v4, v4, Lcom/aggmoread/sdk/z/a/g/h;->b:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_2

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_2
    :goto_0
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x55

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v0, v2, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->j:Landroid/view/View;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->i:Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->k:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iput-object v3, p0, Lcom/aggmoread/sdk/z/a/r/f;->g:Landroid/view/View;

    :cond_3
    return-void
.end method

.method private a(Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 2

    const-string v0, "ApiSplashHandler_api"

    const-string v1, "showAD enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/r/f$b;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/aggmoread/sdk/z/a/r/f$b;-><init>(Lcom/aggmoread/sdk/z/a/r/f;Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/View;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/r/f;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/r/f;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/r/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->l:Z

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/r/f;)[B
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->n:[B

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/r/f;[B)[B
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->n:[B

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/r/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/f;->d()V

    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/g/b$a$a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    return-object p0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->o:Lcom/aggmoread/sdk/z/a/r/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->o:Lcom/aggmoread/sdk/z/a/r/h;

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/r/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->d:Lcom/aggmoread/sdk/z/a/r/a;

    return-object p0
.end method

.method private d()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdClick = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiSplashHandler_api"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->p()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    const-string v2, "onAdClick"

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->onAdClicked()V

    return-void
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->a()V

    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/r/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/f;->e()V

    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->i:Landroid/widget/ImageView;

    return-object p0
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->q()Ljava/util/List;

    move-result-object v0

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->e()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->h:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->onAdShow()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->j:Landroid/view/View;

    return-object p0
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/r/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    return-object p0
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/g/b;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    return-object p0
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/a/r/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/f;->c()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/r/d;)V
    .locals 3

    const-string v0, "ApiSplashHandler_api"

    const-string v1, "handle enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/f;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/h/c;->e()Landroid/app/Activity;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->e:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->f:Landroid/content/Context;

    iget-object v1, p1, Lcom/aggmoread/sdk/z/a/g/b;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/a/g/b$a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a;->a()Lcom/aggmoread/sdk/z/a/g/b$a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->j()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->m:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->i()Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "imageUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->m:Ljava/lang/String;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/h/c;->f()Landroid/view/ViewGroup;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->h:Landroid/view/ViewGroup;

    invoke-direct {p0, v1}, Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/view/ViewGroup;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "imageView = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->i:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->m:Ljava/lang/String;

    new-instance v1, Lcom/aggmoread/sdk/z/a/r/f$a;

    invoke-direct {v1, p0, p2, p1}, Lcom/aggmoread/sdk/z/a/r/f$a;-><init>(Lcom/aggmoread/sdk/z/a/r/f;Lcom/aggmoread/sdk/z/a/r/d;Lcom/aggmoread/sdk/z/a/g/b;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v1}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    return-void

    :cond_0
    new-instance p1, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u5e7f\u544a\u6570\u636e\u5f02\u5e38"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/view/ViewGroup;)Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->h:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->j:Landroid/view/View;

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show add adContainer tmpView = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ApiSplashHandler_api"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/f;->h:Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f;->e:Landroid/app/Activity;

    :cond_3
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/r/f;->h()Z

    move-result p1

    return p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->n()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->a:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->l:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/r/f;->i()V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f;->h:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f;->j:Landroid/view/View;

    invoke-direct {p0, v0, v1, v2}, Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method
