.class Lcom/join/mgps/activity/MyGamePapaFragment_$d;
.super Ljava/lang/Object;
.source "MyGamePapaFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragment_;->Z0(Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/HashMap;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment_$d;->b:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_$d;->b:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MyGamePapaFragment_;->L1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/HashMap;)V

    return-void
.end method
