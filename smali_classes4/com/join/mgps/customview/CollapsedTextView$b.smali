.class Lcom/join/mgps/customview/CollapsedTextView$b;
.super Landroid/text/style/ClickableSpan;
.source "CollapsedTextView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/CollapsedTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/CollapsedTextView;


# direct methods
.method private constructor <init>(Lcom/join/mgps/customview/CollapsedTextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/join/mgps/customview/CollapsedTextView;Lcom/join/mgps/customview/CollapsedTextView$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/CollapsedTextView$b;-><init>(Lcom/join/mgps/customview/CollapsedTextView;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {p1}, Lcom/join/mgps/customview/CollapsedTextView;->c(Lcom/join/mgps/customview/CollapsedTextView;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/join/mgps/customview/CollapsedTextView;->d(Lcom/join/mgps/customview/CollapsedTextView;Z)Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {p1}, Lcom/join/mgps/customview/CollapsedTextView;->e(Lcom/join/mgps/customview/CollapsedTextView;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lcom/join/mgps/customview/CollapsedTextView;->f(Lcom/join/mgps/customview/CollapsedTextView;Z)Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {p1}, Lcom/join/mgps/customview/CollapsedTextView;->g(Lcom/join/mgps/customview/CollapsedTextView;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {v0}, Lcom/join/mgps/customview/CollapsedTextView;->h(Lcom/join/mgps/customview/CollapsedTextView;)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p1, Landroid/text/TextPaint;->linkColor:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {v0}, Lcom/join/mgps/customview/CollapsedTextView;->h(Lcom/join/mgps/customview/CollapsedTextView;)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$b;->b:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {v0}, Lcom/join/mgps/customview/CollapsedTextView;->i(Lcom/join/mgps/customview/CollapsedTextView;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    return-void
.end method
