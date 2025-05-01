.class Lcom/join/mgps/activity/GameInformationActivityV2$d;
.super Ljava/lang/Object;
.source "GameInformationActivityV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationActivityV2;->N0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/InformationCommentBeanV2;

.field final synthetic c:Lcom/join/mgps/activity/GameInformationActivityV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->c:Lcom/join/mgps/activity/GameInformationActivityV2;

    iput-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->c:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u4f60\u5df2\u8d5e\u8fc7"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->c:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    move-object v0, p1

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f080927

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->c:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    const v1, 0x7f010077

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->c:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    if-eqz p1, :cond_1

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$d;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-interface {p1, v0}, Lcom/join/mgps/activity/GameInformationActivityV2$n;->a(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    :cond_1
    return-void
.end method
