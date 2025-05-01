.class Lcom/join/mgps/activity/MGMainActivity_$t0;
.super Ljava/lang/Object;
.source "MGMainActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity_;->gotoInstallAppDialogV2Activity(Ljava/lang/String;Lcom/join/mgps/dto/UninstallOnlineGameBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/dto/UninstallOnlineGameBean;

.field final synthetic d:Lcom/join/mgps/activity/MGMainActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity_;Ljava/lang/String;Lcom/join/mgps/dto/UninstallOnlineGameBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->d:Lcom/join/mgps/activity/MGMainActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->c:Lcom/join/mgps/dto/UninstallOnlineGameBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->d:Lcom/join/mgps/activity/MGMainActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/MGMainActivity_$t0;->c:Lcom/join/mgps/dto/UninstallOnlineGameBean;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/MGMainActivity_;->J0(Lcom/join/mgps/activity/MGMainActivity_;Ljava/lang/String;Lcom/join/mgps/dto/UninstallOnlineGameBean;)V

    return-void
.end method
