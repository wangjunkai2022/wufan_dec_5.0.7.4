.class Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;
.super Ljava/lang/Object;
.source "HideAppCalculatorActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "[\\+\\-\\\u00d7\\\u00f7]"

    invoke-virtual {p2, p3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->p0(Ljava/lang/String;Z)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "DEL"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->n0()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "%"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "="

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "AC"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    goto :goto_0

    .line 12
    :cond_4
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->p0(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method
