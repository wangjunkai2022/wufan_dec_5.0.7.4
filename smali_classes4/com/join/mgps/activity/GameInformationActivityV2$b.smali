.class Lcom/join/mgps/activity/GameInformationActivityV2$b;
.super Ljava/lang/Object;
.source "GameInformationActivityV2.java"

# interfaces
.implements Lcom/join/mgps/activity/GameInformationActivityV2$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationActivityV2;->afterview()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameInformationActivityV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u4f60\u5df2\u8d5e\u8fc7"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1}, Lcom/join/mgps/activity/GameInformationActivityV2;->J0(Lcom/join/mgps/dto/InformationCommentBeanV2;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    return-void
.end method

.method public b(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->a(Lcom/join/mgps/dto/InformationCommentBeanV2;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public c(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setCommentId(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setUid(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setNickname(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->a(Lcom/join/mgps/dto/InformationCommentBeanV2;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$b;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->V0()V

    return-void
.end method
