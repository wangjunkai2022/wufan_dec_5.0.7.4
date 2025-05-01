.class public Lcom/kwad/components/ad/widget/KsPriceView;
.super Landroid/widget/TextView;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/d;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/widget/KsPriceView$a;
    }
.end annotation


# static fields
.field private static IH:Ljava/lang/String; = "\u00a5%s \u5230\u624b\u7ea6 \u00a5%s"

.field private static II:Ljava/lang/String; = "\u00a5%s  \u00a5%s"

.field private static IJ:Ljava/lang/String; = "\u00a5%s"


# instance fields
.field private IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

.field private IK:Ljava/lang/String;

.field private IL:Ljava/lang/String;

.field private IM:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-direct {v0}, Lcom/kwad/components/ad/widget/KsPriceView$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/widget/KsPriceView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance p2, Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-direct {p2}, Lcom/kwad/components/ad/widget/KsPriceView$a;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/widget/KsPriceView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p2, Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-direct {p2}, Lcom/kwad/components/ad/widget/KsPriceView$a;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/widget/KsPriceView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 11
    new-instance p2, Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-direct {p2}, Lcom/kwad/components/ad/widget/KsPriceView$a;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/widget/KsPriceView;->P(Landroid/content/Context;)V

    return-void
.end method

.method private P(Landroid/content/Context;)V
    .locals 5

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$color;->ksad_reward_main_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->a(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/kwad/sdk/R$dimen;->ksad_reward_order_price_size:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 5
    invoke-static {v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->b(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, Lcom/kwad/sdk/R$color;->ksad_reward_original_price:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->c(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, Lcom/kwad/sdk/R$dimen;->ksad_reward_order_original_price_size:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 9
    invoke-static {v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->d(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->e(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 13
    invoke-static {v0, p1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->f(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;ZLcom/kwad/components/ad/widget/KsPriceView$a;)Landroid/text/SpannableString;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 1
    sget-object p2, Lcom/kwad/components/ad/widget/KsPriceView;->IJ:Ljava/lang/String;

    new-array v2, v1, [Ljava/lang/Object;

    aput-object p0, v2, v0

    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    sget-object p2, Lcom/kwad/components/ad/widget/KsPriceView;->II:Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/kwad/components/ad/widget/KsPriceView;->IH:Ljava/lang/String;

    :goto_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v0

    aput-object p1, v2, v1

    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 3
    :goto_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const-string v3, "\u00a5"

    .line 4
    invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mO()I

    move-result v4

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v4, 0x11

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 6
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mP()I

    move-result v5

    invoke-direct {v3, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 7
    :cond_2
    invoke-virtual {p2, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_3

    const/4 p0, 0x0

    return-object p0

    .line 8
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    .line 9
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mK()I

    move-result v4

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int/2addr p0, v0

    const/16 v4, 0x12

    invoke-virtual {v2, v3, v0, p0, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 10
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mM()I

    move-result v5

    invoke-direct {v3, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v2, v3, v0, p0, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p0

    sub-int/2addr p0, v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v1

    .line 13
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mL()I

    move-result v0

    invoke-direct {p2, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int/2addr p1, p0

    invoke-virtual {v2, p2, p0, p1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 14
    new-instance p2, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p3}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mN()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v2, p2, p0, p1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 15
    new-instance p2, Landroid/text/style/StrikethroughSpan;

    invoke-direct {p2}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-virtual {v2, p2, p0, p1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_4
    return-object v2
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/widget/e;)V
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-virtual {p1}, Lcom/kwad/components/core/widget/e;->tX()I

    move-result p1

    invoke-static {v0, p1}, Lcom/kwad/components/ad/widget/KsPriceView$a;->a(Lcom/kwad/components/ad/widget/KsPriceView$a;I)I

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IK:Ljava/lang/String;

    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IL:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IM:Z

    invoke-virtual {p0, p1, v0, v1}, Lcom/kwad/components/ad/widget/KsPriceView;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IK:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IL:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IM:Z

    .line 5
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 6
    iput-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IL:Ljava/lang/String;

    :cond_1
    if-eqz p1, :cond_2

    const-string p2, "\u00a5"

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    .line 8
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :cond_2
    iget-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    invoke-virtual {p2}, Lcom/kwad/components/ad/widget/KsPriceView$a;->mK()I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    :try_start_0
    iget-object p2, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IL:Ljava/lang/String;

    iget-object v1, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    .line 11
    invoke-static {p1, p2, p3, v1}, Lcom/kwad/components/ad/widget/KsPriceView;->a(Ljava/lang/String;Ljava/lang/String;ZLcom/kwad/components/ad/widget/KsPriceView$a;)Landroid/text/SpannableString;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :goto_0
    if-eqz v0, :cond_3

    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public getConfig()Lcom/kwad/components/ad/widget/KsPriceView$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/widget/KsPriceView;->IG:Lcom/kwad/components/ad/widget/KsPriceView$a;

    return-object v0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/kwad/components/ad/widget/KsPriceView;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
