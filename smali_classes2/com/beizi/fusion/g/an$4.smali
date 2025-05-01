.class Lcom/beizi/fusion/g/an$4;
.super Ljava/lang/Object;
.source "RollUtil.java"

# interfaces
.implements Lcom/beizi/fusion/widget/TwistView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/an;->a(Landroid/view/ViewGroup;IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/an;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/an;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/an$4;->a:Lcom/beizi/fusion/g/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/an$4;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->l(Lcom/beizi/fusion/g/an;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/g/an$4;->a:Lcom/beizi/fusion/g/an;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/an;->d(Lcom/beizi/fusion/g/an;Z)Z

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/g/an$4;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->k(Lcom/beizi/fusion/g/an;)Lcom/beizi/fusion/g/an$a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/g/an$4;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->k(Lcom/beizi/fusion/g/an;)Lcom/beizi/fusion/g/an$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/fusion/g/an$a;->a()V

    :cond_1
    return-void
.end method
