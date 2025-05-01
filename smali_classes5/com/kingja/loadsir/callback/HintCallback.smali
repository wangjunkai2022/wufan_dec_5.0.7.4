.class public Lcom/kingja/loadsir/callback/HintCallback;
.super Lcom/kingja/loadsir/callback/Callback;
.source "HintCallback.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kingja/loadsir/callback/HintCallback$a;
    }
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Lcom/kingja/loadsir/callback/HintCallback$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kingja/loadsir/callback/Callback;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/kingja/loadsir/callback/HintCallback$a;->a(Lcom/kingja/loadsir/callback/HintCallback$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kingja/loadsir/callback/HintCallback;->b:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/kingja/loadsir/callback/HintCallback$a;->b(Lcom/kingja/loadsir/callback/HintCallback$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kingja/loadsir/callback/HintCallback;->c:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/kingja/loadsir/callback/HintCallback$a;->c(Lcom/kingja/loadsir/callback/HintCallback$a;)I

    move-result v0

    iput v0, p0, Lcom/kingja/loadsir/callback/HintCallback;->d:I

    .line 5
    invoke-static {p1}, Lcom/kingja/loadsir/callback/HintCallback$a;->d(Lcom/kingja/loadsir/callback/HintCallback$a;)I

    move-result v0

    iput v0, p0, Lcom/kingja/loadsir/callback/HintCallback;->f:I

    .line 6
    invoke-static {p1}, Lcom/kingja/loadsir/callback/HintCallback$a;->e(Lcom/kingja/loadsir/callback/HintCallback$a;)I

    move-result p1

    iput p1, p0, Lcom/kingja/loadsir/callback/HintCallback;->e:I

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
    iget v1, p0, Lcom/kingja/loadsir/callback/HintCallback;->d:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 7
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 8
    iget v3, p0, Lcom/kingja/loadsir/callback/HintCallback;->d:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 9
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/kingja/loadsir/callback/HintCallback;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 11
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 12
    iget-object v3, p0, Lcom/kingja/loadsir/callback/HintCallback;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget v3, p0, Lcom/kingja/loadsir/callback/HintCallback;->e:I

    if-ne v3, v2, :cond_1

    const v3, 0x1030042

    .line 14
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 16
    :goto_0
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/kingja/loadsir/callback/HintCallback;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 18
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 19
    iget-object v3, p0, Lcom/kingja/loadsir/callback/HintCallback;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget v3, p0, Lcom/kingja/loadsir/callback/HintCallback;->f:I

    if-ne v3, v2, :cond_3

    const v2, 0x1030046

    .line 21
    invoke-virtual {v1, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_1

    .line 22
    :cond_3
    invoke-virtual {v1, p1, v3}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 23
    :goto_1
    invoke-virtual {p2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    return-void
.end method
