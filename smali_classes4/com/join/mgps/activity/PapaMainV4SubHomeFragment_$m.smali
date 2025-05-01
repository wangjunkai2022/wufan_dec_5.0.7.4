.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;
.super Ljava/lang/Object;
.source "PapaMainV4SubHomeFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/PapaHomeBeanV9;

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->e:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->b:Lcom/join/mgps/dto/PapaHomeBeanV9;

    iput p3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->c:I

    iput-boolean p4, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->e:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->b:Lcom/join/mgps/dto/PapaHomeBeanV9;

    iget v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->c:I

    iget-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;->d:Z

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->P0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    return-void
.end method
