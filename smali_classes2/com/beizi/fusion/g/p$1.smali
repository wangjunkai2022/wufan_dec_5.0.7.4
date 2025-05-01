.class Lcom/beizi/fusion/g/p$1;
.super Ljava/lang/Object;
.source "ComplaintViewUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/p;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/p;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/p$1;->a:Lcom/beizi/fusion/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Lcom/beizi/fusion/g/p$1$1;

    invoke-direct {p1, p0}, Lcom/beizi/fusion/g/p$1$1;-><init>(Lcom/beizi/fusion/g/p$1;)V

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->setDialogItemCallback(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->create()Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "e \uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZis"

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
