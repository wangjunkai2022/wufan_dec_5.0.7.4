.class Lcom/beizi/fusion/g/an$2;
.super Ljava/lang/Object;
.source "RollUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    iput-object p1, p0, Lcom/beizi/fusion/g/an$2;->a:Lcom/beizi/fusion/g/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/g/an$2;->a:Lcom/beizi/fusion/g/an;

    invoke-static {p1}, Lcom/beizi/fusion/g/an;->j(Lcom/beizi/fusion/g/an;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/g/an$2;->a:Lcom/beizi/fusion/g/an;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;Z)Z

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/g/an$2;->a:Lcom/beizi/fusion/g/an;

    invoke-static {p1}, Lcom/beizi/fusion/g/an;->k(Lcom/beizi/fusion/g/an;)Lcom/beizi/fusion/g/an$a;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/g/an$2;->a:Lcom/beizi/fusion/g/an;

    invoke-static {p1}, Lcom/beizi/fusion/g/an;->k(Lcom/beizi/fusion/g/an;)Lcom/beizi/fusion/g/an$a;

    move-result-object v0

    invoke-static {}, Lcom/beizi/fusion/g/an;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/beizi/fusion/g/an;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/beizi/fusion/g/an;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/beizi/fusion/g/an;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/beizi/fusion/g/an;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/beizi/fusion/g/an;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/beizi/fusion/g/an;->g()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/beizi/fusion/g/an;->h()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v0 .. v8}, Lcom/beizi/fusion/g/an$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
