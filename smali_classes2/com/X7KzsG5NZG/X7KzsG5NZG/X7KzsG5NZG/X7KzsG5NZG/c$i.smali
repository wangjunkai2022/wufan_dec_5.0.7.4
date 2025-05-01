.class Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;


# direct methods
.method constructor <init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;I)V
    .locals 0

    iput-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$i;->c:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;

    iput p2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$i;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$i;->c:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;

    invoke-static {v0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;->j(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v0

    iget v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$i;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lcom/qq/e/comm/pi/IBidding;->sendLossNotification(IILjava/lang/String;)V

    return-void
.end method
