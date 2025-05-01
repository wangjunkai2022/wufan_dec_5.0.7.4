.class Lcom/join/mgps/activity/GameInformationCommentActivity_$r;
.super Ljava/lang/Object;
.source "GameInformationCommentActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationCommentActivity_;->v0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/InformationCommentBeanV2;

.field final synthetic c:Lcom/join/mgps/activity/GameInformationCommentActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;->c:Lcom/join/mgps/activity/GameInformationCommentActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;->c:Lcom/join/mgps/activity/GameInformationCommentActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->z0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    return-void
.end method
