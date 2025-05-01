.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;
.super Ljava/lang/Object;
.source "PapaMainV4SubHomeFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->G0(Lcom/join/mgps/dto/HomeFloatData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/HomeFloatData;

.field final synthetic c:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;->c:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;->b:Lcom/join/mgps/dto/HomeFloatData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;->c:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;->b:Lcom/join/mgps/dto/HomeFloatData;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->Y0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/HomeFloatData;)V

    return-void
.end method
