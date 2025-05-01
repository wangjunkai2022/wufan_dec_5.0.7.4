.class Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;
.super Ljava/lang/Object;
.source "HomePopupAdQWActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/dto/RecomDatabean;

.field final synthetic d:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;Ljava/lang/String;Lcom/join/mgps/dto/RecomDatabean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->d:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iput-object p2, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->c:Lcom/join/mgps/dto/RecomDatabean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->b:Ljava/lang/String;

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->d:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->b:Lcom/join/mgps/activity/HomePopupAdQWActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->c:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/activity/HomePopupAdQWActivity;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->d:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iget-object v0, v0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->b:Lcom/join/mgps/activity/HomePopupAdQWActivity;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->c:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/activity/HomePopupAdQWActivity;->j(Landroid/content/Context;Lcom/join/mgps/dto/AppBeanMain;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$d;->d:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->b:Lcom/join/mgps/activity/HomePopupAdQWActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method
