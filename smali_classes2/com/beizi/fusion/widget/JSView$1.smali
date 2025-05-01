.class Lcom/beizi/fusion/widget/JSView$1;
.super Landroid/os/Handler;
.source "JSView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/JSView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/JSView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/JSView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/JSView$1;->a:Lcom/beizi/fusion/widget/JSView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/widget/JSView$1;->a:Lcom/beizi/fusion/widget/JSView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/JSView;->a(Lcom/beizi/fusion/widget/JSView;)I

    move-result p1

    if-lez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/widget/JSView$1;->a:Lcom/beizi/fusion/widget/JSView;

    invoke-virtual {p1}, Lcom/beizi/fusion/widget/JSView;->load()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/widget/JSView$1;->a:Lcom/beizi/fusion/widget/JSView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/JSView;->b(Lcom/beizi/fusion/widget/JSView;)V

    :goto_0
    return-void
.end method
