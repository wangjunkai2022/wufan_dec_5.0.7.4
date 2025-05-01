.class Lcom/join/mgps/activity/EndGameLaunchActivity_$d;
.super Ljava/lang/Object;
.source "EndGameLaunchActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameLaunchActivity_;->w0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/EndGameLaunchActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameLaunchActivity_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity_$d;->c:Lcom/join/mgps/activity/EndGameLaunchActivity_;

    iput p2, p0, Lcom/join/mgps/activity/EndGameLaunchActivity_$d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity_$d;->c:Lcom/join/mgps/activity/EndGameLaunchActivity_;

    iget v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity_$d;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_;->E0(Lcom/join/mgps/activity/EndGameLaunchActivity_;I)V

    return-void
.end method
