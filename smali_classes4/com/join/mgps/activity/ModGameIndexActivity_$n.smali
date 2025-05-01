.class Lcom/join/mgps/activity/ModGameIndexActivity_$n;
.super Ljava/lang/Object;
.source "ModGameIndexActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ModGameIndexActivity_;->T1(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/join/mgps/activity/ModGameIndexActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$n;->c:Lcom/join/mgps/activity/ModGameIndexActivity_;

    iput-boolean p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$n;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$n;->c:Lcom/join/mgps/activity/ModGameIndexActivity_;

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$n;->b:Z

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity_;->X1(Lcom/join/mgps/activity/ModGameIndexActivity_;Z)V

    return-void
.end method
