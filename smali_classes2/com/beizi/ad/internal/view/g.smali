.class Lcom/beizi/ad/internal/view/g;
.super Lcom/beizi/ad/internal/view/AdWebView;
.source "AdWebView.java"


# instance fields
.field d:Lcom/beizi/ad/internal/view/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/f;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    .line 2
    sget-object p1, Lcom/beizi/ad/internal/view/f;->a:[Ljava/lang/String;

    sget-object v0, Lcom/beizi/ad/internal/view/f$b;->b:Lcom/beizi/ad/internal/view/f$b;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/beizi/ad/internal/view/g;->d:Lcom/beizi/ad/internal/view/f;

    return-void
.end method


# virtual methods
.method e()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/internal/view/AdWebView;->e()V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/g;->d:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/f;->a()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method
