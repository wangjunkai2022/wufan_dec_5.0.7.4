.class Lcom/join/mgps/activity/NowWufunFragment_$g;
.super Ljava/lang/Object;
.source "NowWufunFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/NowWufunFragment_;->l0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/NowWufunFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/NowWufunFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/NowWufunFragment_$g;->c:Lcom/join/mgps/activity/NowWufunFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/NowWufunFragment_$g;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/NowWufunFragment_$g;->c:Lcom/join/mgps/activity/NowWufunFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/NowWufunFragment_$g;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/NowWufunFragment_;->s0(Lcom/join/mgps/activity/NowWufunFragment_;Ljava/util/List;)V

    return-void
.end method
