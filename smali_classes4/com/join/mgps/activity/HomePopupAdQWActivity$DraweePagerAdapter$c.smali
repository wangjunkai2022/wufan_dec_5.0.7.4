.class Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;
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

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lcom/join/mgps/dto/AppBeanMain;

.field final synthetic f:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;Ljava/lang/String;Lcom/join/mgps/dto/RecomDatabean;Landroid/content/Context;Lcom/join/mgps/dto/AppBeanMain;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->f:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iput-object p2, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->c:Lcom/join/mgps/dto/RecomDatabean;

    iput-object p4, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->d:Landroid/content/Context;

    iput-object p5, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->e:Lcom/join/mgps/dto/AppBeanMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->b:Ljava/lang/String;

    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->f:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->b:Lcom/join/mgps/activity/HomePopupAdQWActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->c:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getSub_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/activity/HomePopupAdQWActivity;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->e:Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const-string v1, "downGameId"

    invoke-virtual {p1, v1, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter$c;->f:Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/HomePopupAdQWActivity$DraweePagerAdapter;->b:Lcom/join/mgps/activity/HomePopupAdQWActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
