.class Lcom/join/mgps/activity/UninstallWufunActivity_$b;
.super Ljava/lang/Object;
.source "UninstallWufunActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UninstallWufunActivity_;->t0(Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/UninstallGuessLikeBean;

.field final synthetic c:Lcom/join/mgps/activity/UninstallWufunActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity_$b;->c:Lcom/join/mgps/activity/UninstallWufunActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/UninstallWufunActivity_$b;->b:Lcom/join/mgps/dto/UninstallGuessLikeBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_$b;->c:Lcom/join/mgps/activity/UninstallWufunActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunActivity_$b;->b:Lcom/join/mgps/dto/UninstallGuessLikeBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/UninstallWufunActivity_;->C0(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V

    return-void
.end method
