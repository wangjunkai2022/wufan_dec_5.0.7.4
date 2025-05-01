.class Lcom/join/mgps/activity/SearchListActivity1$f;
.super Ljava/lang/Object;
.source "SearchListActivity1.java"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchListActivity1;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/SearchListActivity1;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchListActivity1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {v0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->n0(Lcom/join/mgps/activity/SearchListActivity1;Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {v0}, Lcom/join/mgps/activity/SearchListActivity1;->m0(Lcom/join/mgps/activity/SearchListActivity1;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u6e38\u620f"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchListActivity1;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result v0

    if-lez v0, :cond_1

    .line 4
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 5
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object v2, v2, Lcom/join/mgps/activity/SearchListActivity1;->r:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {v2}, Lcom/join/mgps/activity/SearchListActivity1;->k0(Lcom/join/mgps/activity/SearchListActivity1;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->clickChangeH5TabGame:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2, v3, v0, v1}, Lcom/papa/sim/statistic/p;->T1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchListActivity1;->j:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchListActivity1;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SearchListActivity1;->u0(Z)V

    .line 11
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$f;->a:Lcom/join/mgps/activity/SearchListActivity1;

    invoke-static {v0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->n0(Lcom/join/mgps/activity/SearchListActivity1;Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
