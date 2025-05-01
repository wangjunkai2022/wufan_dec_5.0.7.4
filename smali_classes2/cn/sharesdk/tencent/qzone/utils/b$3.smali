.class Lcn/sharesdk/tencent/qzone/utils/b$3;
.super Ljava/lang/Object;
.source "QZoneHelper.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/utils/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/StringBuilder;

.field final synthetic b:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic c:Lcn/sharesdk/tencent/qzone/utils/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/utils/b;Ljava/lang/StringBuilder;Lcn/sharesdk/framework/PlatformActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->c:Lcn/sharesdk/tencent/qzone/utils/b;

    iput-object p2, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->a:Ljava/lang/StringBuilder;

    iput-object p3, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->b:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p1, v0}, Lcom/mob/tools/utils/DH$DHResponse;->resolveActivity([I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-direct {p1}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;-><init>()V

    .line 3
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->c:Lcn/sharesdk/tencent/qzone/utils/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/b;->g(Lcn/sharesdk/tencent/qzone/utils/b;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->setDisableNewTask(Z)V

    .line 4
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->setScheme(Ljava/lang/String;Z)V

    .line 5
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->b:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-virtual {p1, v0}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->setSharedCallback(Lcn/sharesdk/framework/PlatformActionListener;)V

    .line 6
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/b$3;->c:Lcn/sharesdk/tencent/qzone/utils/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/b;->h(Lcn/sharesdk/tencent/qzone/utils/b;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->setAppId(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/mob/tools/FakeActivity;->show(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
