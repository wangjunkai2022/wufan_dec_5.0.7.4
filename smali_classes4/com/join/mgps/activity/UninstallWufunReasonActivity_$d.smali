.class Lcom/join/mgps/activity/UninstallWufunReasonActivity_$d;
.super Ljava/lang/Object;
.source "UninstallWufunReasonActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UninstallWufunReasonActivity_;->n0(Lcom/join/mgps/dto/UninstallAppReasonBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/UninstallAppReasonBean;

.field final synthetic c:Lcom/join/mgps/activity/UninstallWufunReasonActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UninstallWufunReasonActivity_;Lcom/join/mgps/dto/UninstallAppReasonBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity_$d;->c:Lcom/join/mgps/activity/UninstallWufunReasonActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity_$d;->b:Lcom/join/mgps/dto/UninstallAppReasonBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity_$d;->c:Lcom/join/mgps/activity/UninstallWufunReasonActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity_$d;->b:Lcom/join/mgps/dto/UninstallAppReasonBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/UninstallWufunReasonActivity_;->o0(Lcom/join/mgps/activity/UninstallWufunReasonActivity_;Lcom/join/mgps/dto/UninstallAppReasonBean;)V

    return-void
.end method
