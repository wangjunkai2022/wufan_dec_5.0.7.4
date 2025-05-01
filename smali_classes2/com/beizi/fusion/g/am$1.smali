.class Lcom/beizi/fusion/g/am$1;
.super Ljava/lang/Object;
.source "RegionClickUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/am;->a(IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;Z)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/am;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/am;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/am$1;->a:Lcom/beizi/fusion/g/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/g/am$1;->a:Lcom/beizi/fusion/g/am;

    invoke-static {p1}, Lcom/beizi/fusion/g/am;->a(Lcom/beizi/fusion/g/am;)Lcom/beizi/fusion/g/am$a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/g/am$1;->a:Lcom/beizi/fusion/g/am;

    invoke-static {p1}, Lcom/beizi/fusion/g/am;->a(Lcom/beizi/fusion/g/am;)Lcom/beizi/fusion/g/am$a;

    move-result-object v0

    invoke-static {}, Lcom/beizi/fusion/g/am;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/beizi/fusion/g/am;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/beizi/fusion/g/am;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/beizi/fusion/g/am;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/beizi/fusion/g/am;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/beizi/fusion/g/am;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/beizi/fusion/g/am;->d()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/beizi/fusion/g/am;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v0 .. v8}, Lcom/beizi/fusion/g/am$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
