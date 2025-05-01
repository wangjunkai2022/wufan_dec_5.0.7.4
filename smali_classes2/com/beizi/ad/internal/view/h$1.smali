.class Lcom/beizi/ad/internal/view/h$1;
.super Ljava/lang/Object;
.source "VideoEnabledWebChromeClient.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/h;->a(Landroid/widget/FrameLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/h;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/h$1;->a:Lcom/beizi/ad/internal/view/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/h$1;->a:Lcom/beizi/ad/internal/view/h;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/h;->onHideCustomView()V

    return-void
.end method
