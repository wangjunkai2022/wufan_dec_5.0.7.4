.class Lcom/join/mgps/activity/SplashActivity$p;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SplashActivity;->V(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ShowViewDataBean;

.field final synthetic c:Lcom/join/mgps/dto/SplashIntentBean;

.field final synthetic d:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$p;->d:Lcom/join/mgps/activity/SplashActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/SplashActivity$p;->b:Lcom/join/mgps/dto/ShowViewDataBean;

    iput-object p3, p0, Lcom/join/mgps/activity/SplashActivity$p;->c:Lcom/join/mgps/dto/SplashIntentBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$p;->d:Lcom/join/mgps/activity/SplashActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$p;->b:Lcom/join/mgps/dto/ShowViewDataBean;

    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity$p;->c:Lcom/join/mgps/dto/SplashIntentBean;

    invoke-static {p1}, Lcom/join/mgps/activity/SplashActivity;->n(Lcom/join/mgps/activity/SplashActivity;)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const-string v2, "0"

    goto :goto_0

    :cond_0
    const-string v2, "1"

    :goto_0
    invoke-static {p1, v0, v1, v2}, Lcom/join/mgps/activity/SplashActivity;->m(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V

    return-void
.end method
