.class Lcom/join/mgps/activity/ShareWebActivity_$s;
.super Ljava/lang/Object;
.source "ShareWebActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ShareWebActivity_;->Q1(Lcom/join/mgps/dto/CreateVipData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CreateVipData;

.field final synthetic c:Lcom/join/mgps/activity/ShareWebActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/CreateVipData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_$s;->c:Lcom/join/mgps/activity/ShareWebActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity_$s;->b:Lcom/join/mgps/dto/CreateVipData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_$s;->c:Lcom/join/mgps/activity/ShareWebActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity_$s;->b:Lcom/join/mgps/dto/CreateVipData;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ShareWebActivity_;->e2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/CreateVipData;)V

    return-void
.end method
