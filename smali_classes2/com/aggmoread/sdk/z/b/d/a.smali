.class public Lcom/aggmoread/sdk/z/b/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/a;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/b/a/a;

.field private b:Lcom/aggmoread/sdk/z/a/r/d;

.field private c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

.field private d:Lcom/aggmoread/sdk/z/a/r/a;

.field private e:Landroid/app/Activity;

.field private f:Landroid/content/Context;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/view/ViewGroup;

.field private j:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/view/View;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Lcom/aggmoread/sdk/z/b/e/a;

.field private p:Z

.field private q:Z

.field private r:[B

.field private s:Lcom/aggmoread/sdk/z/a/r/h;

.field private t:Lcom/aggmoread/sdk/z/b/e/a$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->m:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->q:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->s:Lcom/aggmoread/sdk/z/a/r/h;

    new-instance v0, Lcom/aggmoread/sdk/z/b/d/a$i;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/b/d/a$i;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->t:Lcom/aggmoread/sdk/z/b/e/a$b;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;Lcom/aggmoread/sdk/z/b/e/a;)Lcom/aggmoread/sdk/z/b/e/a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->o:Lcom/aggmoread/sdk/z/b/e/a;

    return-object p1
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 3

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->e:Lcom/aggmoread/sdk/z/a/g/e;

    :goto_0
    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->t:Lcom/aggmoread/sdk/z/b/e/a$b;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/b/e/a;-><init>(Lcom/aggmoread/sdk/z/b/e/a$b;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->o:Lcom/aggmoread/sdk/z/b/e/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/b/e/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    goto :goto_0

    :cond_3
    invoke-static {p3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_7

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isDownload = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " , interaction_type = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->h:I

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , downloadUrl = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "ApiSplashHandler_dsp"

    invoke-static {v0, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 v1, 0x0

    if-nez p3, :cond_4

    iget-object p3, p0, Lcom/aggmoread/sdk/z/b/d/a;->l:Landroid/view/View;

    if-eqz p3, :cond_4

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p3, p0, Lcom/aggmoread/sdk/z/b/d/a;->l:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    iget-boolean v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->q:Z

    if-eqz v2, :cond_5

    const-string p3, "CKT"

    invoke-static {v0, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    move-object p3, p2

    :cond_5
    new-instance v0, Lcom/aggmoread/sdk/z/b/d/a$c;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/b/d/a$c;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    invoke-static {p3, v0}, Lcom/aggmoread/sdk/z/a/r/a;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/a$a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object p3

    iput-object p3, p0, Lcom/aggmoread/sdk/z/b/d/a;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->k:Landroid/widget/ImageView;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/b/a;->k()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->k:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    invoke-direct {p0, p4}, Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/View;)V

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->c:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_1
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 8

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->h()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->g()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/b/a;->f()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->g:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/b/a;->f()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->g:Landroid/view/View;

    :goto_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->g:Landroid/view/View;

    new-instance v0, Lcom/aggmoread/sdk/z/b/d/a$g;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/b/d/a$g;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/aggmoread/sdk/z/a/r/h;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->g:Landroid/view/View;

    new-instance v3, Lcom/aggmoread/sdk/z/b/d/a$h;

    invoke-direct {v3, p0}, Lcom/aggmoread/sdk/z/b/d/a$h;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    const-wide/16 v4, 0x1450

    const-wide/16 v6, 0x1f4

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/aggmoread/sdk/z/a/r/h;-><init>(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/h$a;JJ)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->s:Lcom/aggmoread/sdk/z/a/r/h;

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method private a(Landroid/view/ViewGroup;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    if-eqz v2, :cond_3

    new-instance v2, Landroid/widget/FrameLayout;

    iget-object v3, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v3, "#99ffdd"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    const/4 v3, -0x1

    if-eqz v1, :cond_0

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    new-instance v1, Landroid/widget/ImageView;

    iget-object v4, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v1, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-string v4, "#Afd1df"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/FrameLayout;

    iget-object v5, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v4, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/TextView;

    iget-object v6, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v7, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const/16 v8, 0x8c

    const/16 v9, 0x8c

    const/16 v10, 0x8c

    const/16 v11, 0x8c

    const/4 v12, 0x6

    move-object v6, v5

    invoke-static/range {v6 .. v12}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/view/View;Landroid/content/Context;IIIII)V

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0x11

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    const-string v7, "\u8df3\u8fc7"

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v7, 0x8

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v9, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v10, 0x4055000000000000L    # 84.0

    invoke-static {v9, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v9

    iget-object v10, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v11, 0x4041000000000000L    # 34.0

    invoke-static {v10, v11, v12}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    iget-object v9, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v10, 0x4030000000000000L    # 16.0

    invoke-static {v9, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v9

    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v9, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v10, 0x4018000000000000L    # 6.0

    invoke-static {v9, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v9

    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v9, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v8, 0x5

    iput v8, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v4, v5, v9}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v10, 0x800005

    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v4, v8}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/ImageView;

    iget-object v8, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v4, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v8

    sget-object v10, Lcom/aggmoread/sdk/z/a/h/a$a;->c:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-virtual {v8, v10}, Lcom/aggmoread/sdk/z/a/h/a;->b(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v8

    iget v11, v8, Lcom/aggmoread/sdk/z/a/g/h;->a:I

    if-eqz v11, :cond_1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v8

    invoke-virtual {v8, v10}, Lcom/aggmoread/sdk/z/a/h/a;->b(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/h;

    move-result-object v8

    iget v8, v8, Lcom/aggmoread/sdk/z/a/g/h;->a:I

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v8, v8, Lcom/aggmoread/sdk/z/a/g/h;->b:Landroid/graphics/Bitmap;

    if-eqz v8, :cond_2

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_2
    :goto_0
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v8, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x55

    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v4, v8}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, Landroid/widget/FrameLayout;

    iget-object v10, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v8, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/RelativeLayout;

    iget-object v11, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v10, v11}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iget-object v11, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v12, 0x4026000000000000L    # 11.0

    invoke-static {v11, v12, v13}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v11

    invoke-virtual {v10, v11, v11, v11, v11}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    iget-object v12, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const/16 v13, 0x88

    const/16 v14, 0x14

    const/16 v15, 0x14

    const/16 v16, 0x14

    const/16 v17, 0x5a

    move-object v11, v10

    invoke-static/range {v11 .. v17}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/view/View;Landroid/content/Context;IIIII)V

    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v11, v3, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v10, v11}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v11, Landroid/widget/LinearLayout;

    iget-object v12, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v11, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v11, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v6, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v12, 0xd

    invoke-virtual {v6, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v10, v11, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/TextView;

    iget-object v10, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v10, "\u70b9\u51fb\u8df3\u8f6c\u8be6\u60c5\u9875\u6216\u7b2c\u4e09\u65b9\u5e94\u7528"

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v10, 0x41880000    # 17.0f

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v10, 0x1

    invoke-static {v10}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v10, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v6, v10}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/widget/ImageView;

    iget-object v10, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-direct {v6, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-string v10, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAA1ElEQVRYR9XXwQ3CMAyF4ecJ6ChsACMwAkwGTMAIsJlRpBx6In7xsyJybZX/kw+ualh8bHEf/wFw9yuAk5nd1BMbTsDdLwBePfxQIyKAI4APgEMFYghoUXcvQ4QAlYgwoApBASoQNECNmAIoEdMAFSIFUCDSgCxCAsgg1IA3gK2v7KeZtY/YzyMB9FVNx5ssDcjE04BsPAVQxKcBqvgUQBmnAeo4BaiIhwFV8RCgMh4FtHV6Z9braP3un4c2Yf8xOUd2OxMPTYC9kH0/NAH2Uub95YAvfduAIVC/ymAAAAAASUVORK5CYII="

    invoke-static {v6, v10}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    new-instance v10, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v12, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v13, 0x4034000000000000L    # 20.0

    invoke-static {v12, v13, v14}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v12

    iget-object v15, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-static {v15, v13, v14}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v13

    invoke-direct {v10, v12, v13}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    iget-object v12, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v13, 0x4014000000000000L    # 5.0

    invoke-static {v12, v13, v14}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v12

    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    invoke-virtual {v11, v6, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v6, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v6, v3, v9}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    iget-object v3, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v9, 0x403e000000000000L    # 30.0

    invoke-static {v3, v9, v10}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v3, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-static {v3, v9, v10}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v3, v0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    const-wide/high16 v9, 0x4039000000000000L    # 25.0

    invoke-static {v3, v9, v10}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/16 v6, 0x50

    iput v6, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v8, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v2, v0, Lcom/aggmoread/sdk/z/b/d/a;->j:Landroid/view/View;

    iput-object v1, v0, Lcom/aggmoread/sdk/z/b/d/a;->h:Landroid/widget/ImageView;

    iput-object v4, v0, Lcom/aggmoread/sdk/z/b/d/a;->k:Landroid/widget/ImageView;

    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    iput-object v5, v0, Lcom/aggmoread/sdk/z/b/d/a;->g:Landroid/view/View;

    iput-object v8, v0, Lcom/aggmoread/sdk/z/b/d/a;->l:Landroid/view/View;

    :cond_3
    return-void
.end method

.method private a(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 2

    const-string v0, "ApiSplashHandler_dsp"

    const-string v1, "showAD enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/b/d/a$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/aggmoread/sdk/z/b/d/a$b;-><init>(Lcom/aggmoread/sdk/z/b/d/a;Landroid/view/ViewGroup;Landroid/view/View;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->i:Ljava/lang/String;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    new-instance v2, Lcom/aggmoread/sdk/z/a/j/b;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/b/b/a;->h()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/aggmoread/sdk/z/b/d/a$f;

    invoke-direct {v5, p0}, Lcom/aggmoread/sdk/z/b/d/a$f;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    invoke-direct {v2, v3, v4, v5}, Lcom/aggmoread/sdk/z/a/j/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V

    invoke-virtual {v2, p1, v1, v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->m:Z

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;)[B
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->r:[B

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/d/a;[B)[B
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->r:[B

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->e()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ApiSplashHandler_dsp"

    const-string v1, "DL"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/b/d/a;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    new-instance v0, Lcom/aggmoread/sdk/z/b/d/a$e;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/b/d/a$e;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    const/4 v0, 0x0

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/d/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->p:Z

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    return-object p0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->s:Lcom/aggmoread/sdk/z/a/r/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->s:Lcom/aggmoread/sdk/z/a/r/h;

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->d:Lcom/aggmoread/sdk/z/a/r/a;

    return-object p0
.end method

.method private d()V
    .locals 4

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/d;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ApiSplashHandler_dsp"

    invoke-static {v3, v2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/b/d/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method private e()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdClick = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiSplashHandler_dsp"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    const-string v2, "onAdClick"

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->onAdClicked()V

    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->f()V

    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->o:Lcom/aggmoread/sdk/z/b/e/a;

    return-object p0
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->a()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a$b;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->t:Lcom/aggmoread/sdk/z/b/e/a$b;

    return-object p0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->l:Ljava/util/List;

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->e()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    return-object p0
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/d;->onAdShow()V

    return-void
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->d()V

    return-void
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->k()V

    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->i:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private k()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object v1, Lcom/aggmoread/sdk/z/a/g/e;->g:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startWebActivity = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ApiSplashHandler_dsp"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->d:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startWebActivity final = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    new-instance v3, Lcom/aggmoread/sdk/z/b/d/a$d;

    invoke-direct {v3, p0}, Lcom/aggmoread/sdk/z/b/d/a$d;-><init>(Lcom/aggmoread/sdk/z/b/d/a;)V

    invoke-static {v1, v2, v0, v3}, Lcom/aggmoread/sdk/z/a/t/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/t/b$a;)V

    return-void
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->j:Landroid/view/View;

    return-object p0
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    return-object p0
.end method

.method static synthetic n(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    return-object p0
.end method

.method static synthetic o(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/d/a;->h:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic p(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/b/d/a;->c()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/b/a/a;Lcom/aggmoread/sdk/z/a/r/d;)V
    .locals 3

    const-string v0, "ApiSplashHandler_dsp"

    const-string v1, "handle   enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a;->b:Lcom/aggmoread/sdk/z/a/r/d;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/b/a;->d()Landroid/app/Activity;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->f:Landroid/content/Context;

    iget-object v1, p1, Lcom/aggmoread/sdk/z/b/a/a;->e:Lcom/aggmoread/sdk/z/b/a/a$a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/a/a$a;->a()Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->c:Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->b()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a()Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "imageUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/b/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/g;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->e()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->i:Landroid/view/ViewGroup;

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/ViewGroup;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->n:Ljava/lang/String;

    new-instance v1, Lcom/aggmoread/sdk/z/b/d/a$a;

    invoke-direct {v1, p0, p2, p1}, Lcom/aggmoread/sdk/z/b/d/a$a;-><init>(Lcom/aggmoread/sdk/z/b/d/a;Lcom/aggmoread/sdk/z/a/r/d;Lcom/aggmoread/sdk/z/b/a/a;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v1}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    return-void

    :cond_0
    new-instance p1, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u5e7f\u544a\u6570\u636e\u5f02\u5e38"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/b/c/a;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/view/ViewGroup;)Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->i:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->j:Landroid/view/View;

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

    const-string v2, "ApiSplashHandler_dsp"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a;->i:Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a;->e:Landroid/app/Activity;

    :cond_3
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/d/a;->i()Z

    move-result p1

    return p1
.end method

.method public b()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->a:Lcom/aggmoread/sdk/z/b/a/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->m:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/d/a;->j()V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a;->i:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a;->j:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method
