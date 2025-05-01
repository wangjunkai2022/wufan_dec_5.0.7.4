.class public Lcom/kingja/loadsir/callback/ProgressCallback;
.super Lcom/kingja/loadsir/callback/Callback;
.source "ProgressCallback.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kingja/loadsir/callback/ProgressCallback$b;
    }
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I


# direct methods
.method private constructor <init>(Lcom/kingja/loadsir/callback/ProgressCallback$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/kingja/loadsir/callback/Callback;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->d:I

    .line 4
    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->e:I

    .line 5
    invoke-static {p1}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->a(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->b:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->b(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->c:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->c(Lcom/kingja/loadsir/callback/ProgressCallback$b;)I

    move-result v0

    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->d:I

    .line 8
    invoke-static {p1}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->d(Lcom/kingja/loadsir/callback/ProgressCallback$b;)I

    move-result v0

    iput v0, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->e:I

    .line 9
    invoke-static {p1}, Lcom/kingja/loadsir/callback/ProgressCallback$b;->e(Lcom/kingja/loadsir/callback/ProgressCallback$b;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/kingja/loadsir/callback/Callback;->setSuccessVisible(Z)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kingja/loadsir/callback/ProgressCallback$b;Lcom/kingja/loadsir/callback/ProgressCallback$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kingja/loadsir/callback/ProgressCallback;-><init>(Lcom/kingja/loadsir/callback/ProgressCallback$b;)V

    return-void
.end method


# virtual methods
.method protected onBuildView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected onCreateView()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onViewCreate(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    .line 2
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 3
    check-cast p2, Landroid/widget/LinearLayout;

    const/4 v2, 0x1

    .line 4
    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 6
    new-instance v1, Landroid/widget/ProgressBar;

    invoke-direct {v1, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object v1, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, -0x1

    if-nez v1, :cond_1

    .line 9
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 10
    iget-object v3, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget v3, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->e:I

    if-ne v3, v2, :cond_0

    const v3, 0x1030042

    .line 12
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 14
    :goto_0
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    :cond_1
    iget-object v1, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 16
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 17
    iget-object v3, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget v3, p0, Lcom/kingja/loadsir/callback/ProgressCallback;->d:I

    if-ne v3, v2, :cond_2

    const v2, 0x1030044

    .line 19
    invoke-virtual {v1, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 21
    :goto_1
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-void
.end method
