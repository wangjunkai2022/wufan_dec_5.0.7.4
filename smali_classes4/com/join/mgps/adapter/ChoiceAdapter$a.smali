.class Lcom/join/mgps/adapter/ChoiceAdapter$a;
.super Ljava/lang/Object;
.source "ChoiceAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ChoiceAdapter;->l(Lcom/join/mgps/adapter/ChoiceAdapter$ChoiceCoverVH;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

.field final synthetic c:Lcom/join/mgps/adapter/ChoiceAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ChoiceAdapter;Lcom/join/mgps/adapter/ChoiceAdapter$p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    iget-object v0, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ChoiceAdapter$p;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/BannerBean;

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/ChoiceAdapter;->j(Lcom/join/mgps/dto/BannerBean;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/ChoiceAdapter;->a(Lcom/join/mgps/adapter/ChoiceAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    .line 3
    invoke-static {p1}, Lcom/join/mgps/adapter/ChoiceAdapter;->a(Lcom/join/mgps/adapter/ChoiceAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/adapter/ChoiceAdapter$p;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/BannerBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/BannerBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/adapter/ChoiceAdapter$p;->e()Ljava/lang/String;

    move-result-object v4

    const-string v3, "todayButton"

    const-string v5, "\u7cbe\u9009\u4e13\u9898"

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->i2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
