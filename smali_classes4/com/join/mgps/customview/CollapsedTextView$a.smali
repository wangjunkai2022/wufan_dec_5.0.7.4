.class Lcom/join/mgps/customview/CollapsedTextView$a;
.super Ljava/lang/Object;
.source "CollapsedTextView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/CollapsedTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/TextView$BufferType;

.field final synthetic c:Ljava/lang/CharSequence;

.field final synthetic d:Lcom/join/mgps/customview/CollapsedTextView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/CollapsedTextView;Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    iput-object p2, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->b:Landroid/widget/TextView$BufferType;

    iput-object p3, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->c:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/join/mgps/customview/CollapsedTextView;->a(Lcom/join/mgps/customview/CollapsedTextView;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->d:Lcom/join/mgps/customview/CollapsedTextView;

    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->b:Landroid/widget/TextView$BufferType;

    iget-object v2, p0, Lcom/join/mgps/customview/CollapsedTextView$a;->c:Ljava/lang/CharSequence;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/customview/CollapsedTextView;->b(Lcom/join/mgps/customview/CollapsedTextView;Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V

    return-void
.end method
