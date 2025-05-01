.class Lcom/beizi/fusion/widget/SkipView$1;
.super Ljava/lang/Object;
.source "SkipView.java"

# interfaces
.implements Lcom/beizi/fusion/widget/SkipView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/SkipView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/SkipView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/SkipView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/RectF;)I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/SkipView;->a(Lcom/beizi/fusion/widget/SkipView;)Landroid/text/TextPaint;

    move-result-object v0

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/SkipView;->b(Lcom/beizi/fusion/widget/SkipView;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {v1}, Lcom/beizi/fusion/widget/SkipView;->a(Lcom/beizi/fusion/widget/SkipView;)Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontSpacing()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/SkipView;->b(Lcom/beizi/fusion/widget/SkipView;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {v1}, Lcom/beizi/fusion/widget/SkipView;->a(Lcom/beizi/fusion/widget/SkipView;)Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p1

    iput p1, v0, Landroid/graphics/RectF;->right:F

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/SkipView;->b(Lcom/beizi/fusion/widget/SkipView;)Landroid/graphics/RectF;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/widget/SkipView$1;->a:Lcom/beizi/fusion/widget/SkipView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/SkipView;->b(Lcom/beizi/fusion/widget/SkipView;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
