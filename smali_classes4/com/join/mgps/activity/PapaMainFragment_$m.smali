.class Lcom/join/mgps/activity/PapaMainFragment_$m;
.super Ljava/lang/Object;
.source "PapaMainFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainFragment_;->j1(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/PapaMainFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->d:Lcom/join/mgps/activity/PapaMainFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->b:Ljava/util/List;

    iput-boolean p3, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->d:Lcom/join/mgps/activity/PapaMainFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->b:Ljava/util/List;

    iget-boolean v2, p0, Lcom/join/mgps/activity/PapaMainFragment_$m;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/PapaMainFragment_;->f2(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;Z)V

    return-void
.end method
