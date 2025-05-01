.class Lcom/beizi/fusion/g/p$1$1;
.super Ljava/lang/Object;
.source "ComplaintViewUtil.java"

# interfaces
.implements Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/p$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/p$1;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/p$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/p$1$1;->a:Lcom/beizi/fusion/g/p$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDialogCloseClick()V
    .locals 0

    return-void
.end method

.method public onDialogItemClick(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/p$1$1;->a:Lcom/beizi/fusion/g/p$1;

    iget-object v0, v0, Lcom/beizi/fusion/g/p$1;->a:Lcom/beizi/fusion/g/p;

    invoke-static {v0}, Lcom/beizi/fusion/g/p;->a(Lcom/beizi/fusion/g/p;)Lcom/beizi/fusion/g/p$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/g/p$1$1;->a:Lcom/beizi/fusion/g/p$1;

    iget-object v0, v0, Lcom/beizi/fusion/g/p$1;->a:Lcom/beizi/fusion/g/p;

    invoke-static {v0}, Lcom/beizi/fusion/g/p;->a(Lcom/beizi/fusion/g/p;)Lcom/beizi/fusion/g/p$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beizi/fusion/g/p$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
