.class Lcom/beizi/ad/a/a/d$3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ScrollUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/a/a/d;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/a/a/d;


# direct methods
.method constructor <init>(Lcom/beizi/ad/a/a/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    const-string p1, "ScrollUtil"

    const-string v0, "addScrollViewViewAnimation onAnimationEnd"

    .line 1
    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->h(Lcom/beizi/ad/a/a/d;)I

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->e(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->b(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->f(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v3}, Lcom/beizi/ad/a/a/d;->b(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->c(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v3}, Lcom/beizi/ad/a/a/d;->b(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->g(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v3}, Lcom/beizi/ad/a/a/d;->b(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto/16 :goto_1

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v0, :cond_3

    .line 10
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 11
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 12
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto/16 :goto_1

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v2, :cond_7

    .line 14
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 15
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 16
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto/16 :goto_1

    .line 17
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v1, :cond_5

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto/16 :goto_1

    .line 21
    :cond_5
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v0, :cond_6

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 23
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 24
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_1

    .line 25
    :cond_6
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-ne p1, v2, :cond_7

    .line 26
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->k(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->n(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 27
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->m(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->j(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 28
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->o(Lcom/beizi/ad/a/a/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {v0}, Lcom/beizi/ad/a/a/d;->l(Lcom/beizi/ad/a/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 29
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->i(Lcom/beizi/ad/a/a/d;)I

    move-result p1

    if-lt p1, v2, :cond_8

    .line 30
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beizi/ad/a/a/d;->a(Lcom/beizi/ad/a/a/d;I)I

    .line 31
    :cond_8
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->p(Lcom/beizi/ad/a/a/d;)Landroid/animation/ValueAnimator;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 32
    iget-object p1, p0, Lcom/beizi/ad/a/a/d$3;->a:Lcom/beizi/ad/a/a/d;

    invoke-static {p1}, Lcom/beizi/ad/a/a/d;->p(Lcom/beizi/ad/a/a/d;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_2
    return-void
.end method
