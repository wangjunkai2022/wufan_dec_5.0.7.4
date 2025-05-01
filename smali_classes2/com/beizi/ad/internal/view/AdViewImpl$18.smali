.class Lcom/beizi/ad/internal/view/AdViewImpl$18;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl;->addMuteButton(Lcom/beizi/ad/internal/video/AdVideoView;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/video/AdVideoView;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdViewImpl;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/video/AdVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$18;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl$18;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$18;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/video/AdVideoView;->toggleMute()Z

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$18;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->d(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatImageView;

    move-result-object v0

    if-eqz p1, :cond_0

    sget p1, Lcom/beizi/ad/R$drawable;->voice_off:I

    goto :goto_0

    :cond_0
    sget p1, Lcom/beizi/ad/R$drawable;->voice_on:I

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-void
.end method
